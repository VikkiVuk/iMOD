package com.VikkiVuk.iMOD;


import com.VikkiVuk.iMOD.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
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
        instance = this;

        MinecraftForge.EVENT_BUS.register(this);
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
