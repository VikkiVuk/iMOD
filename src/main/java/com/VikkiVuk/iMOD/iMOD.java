package com.VikkiVuk.iMOD;


import com.VikkiVuk.iMOD.init.*;
import com.VikkiVuk.iMOD.init.types.ModContainerTypes;
import com.VikkiVuk.iMOD.init.types.ModTileEntityTypes;
import com.VikkiVuk.iMOD.util.Reference;
import com.VikkiVuk.iMOD.world.OreGeneration;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("imod")
@Mod.EventBusSubscriber(modid = iMOD.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class iMOD
{
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = Reference.MOD_ID;
    public static iMOD instance;

    public iMOD() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        ItemInitNew.ITEMS.register(bus);
        FluidInit.FLUIDS.register(bus);
        BlockInit.BLOCKS.register(bus);

        ModTileEntityTypes.TILE_ENTITY_TYPES.register(bus);
        ModContainerTypes.CONTAINER_TYPES.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(BlockInit.blue_slime.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.brown_slime.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.cyan_slime.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.gray_slime.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.green_slime.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.light_blue_slime.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.light_gray_slime.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.lime_slime.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.magenta_slime.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.orange_slime.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.pink_slime.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.purple_slime.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.yellow_slime.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.white_slime.get(), RenderType.getTranslucent());
        });
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(block -> !(block instanceof FlowingFluidBlock)).forEach(block -> {
                    final Item.Properties properties = new Item.Properties().group(HystelTab.instance);
                    final BlockItem blockItem = new BlockItem(block, properties);
                    blockItem.setRegistryName(block.getRegistryName());
                    registry.register(blockItem);
        });
    }

    public static class HystelTab extends ItemGroup
    {
        public static final HystelTab instance = new HystelTab(ItemGroup.GROUPS.length, "hysteltab");

        private HystelTab(int index, String label)
        {
            super(index,label);
            this.setBackgroundImageName("hysteltab.png");
        }

        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ItemInit.bluestone_ingot);
        }

        @Override
        public boolean hasScrollbar() {
            return true;
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }
}
