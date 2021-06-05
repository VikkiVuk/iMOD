package com.VikkiVuk.iMOD;


import com.VikkiVuk.iMOD.init.BlockInit;
import com.VikkiVuk.iMOD.init.ItemInit;
import com.VikkiVuk.iMOD.world.OreGeneration;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("imod")
@Mod.EventBusSubscriber(modid = iMOD.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class iMOD
{
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "imod";
    public static iMOD instance;

    public iMOD() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(BlockInit.blue_slime.getBlock(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.brown_slime.getBlock(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.cyan_slime.getBlock(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.gray_slime.getBlock(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.green_slime.getBlock(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.light_blue_slime.getBlock(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.light_gray_slime.getBlock(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.lime_slime.getBlock(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.magenta_slime.getBlock(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.orange_slime.getBlock(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.pink_slime.getBlock(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.purple_slime.getBlock(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.yellow_slime.getBlock(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(BlockInit.white_slime.getBlock(), RenderType.getTranslucent());
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
