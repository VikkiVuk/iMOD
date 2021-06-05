package com.VikkiVuk.iMOD;


import com.VikkiVuk.iMOD.world.OreGeneration;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
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

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
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
            return new ItemStack(Blocks.SLIME_BLOCK);
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
