package com.VikkiVuk.iMOD.init;

import com.VikkiVuk.iMOD.iMOD;
import com.VikkiVuk.iMOD.objects.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = iMOD.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(iMOD.MOD_ID)
public class BlockInit
{
    public static final Block bluestone_block = null;
    public static final Block ruby_block = null;
    public static final Block copper_block = null;
    //public static final Block rainbow_block = null;
    public static final Chairsy chairsy = null;
    public static final TokenAtm token_atm = null;
    public static final BlockCGM custom_glassy_mobble = null;
    public static final BlockBC better_cauldron = null;
    public static final BlockSpeaker speaker = null;
    public static final BlockResta custom_resta = null;
    public static final CoffaTable coffee_table = null;
    public static final BlockHS hystel_something = null;
    public static final BlockSH santa_hat = null;
    public static final Block customized_bobble = null;
    public static final IllusionBlock custom_block = null;
    //public static final WifiRouter wifi_router = null;
    public static final BlockTV tv = null;
    //Ores
    public static final Block bluestone_ore = null;
    public static final Block ruby_ore = null;
    public static final Block copper_ore = null;
    public static final Block rainbow_ore = null;


    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new Block(Block.Properties.of(Material.METAL).sound(SoundType.METAL).strength(1.9F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("bluestone_block"));
        event.getRegistry().register(new Block(Block.Properties.of(Material.METAL).sound(SoundType.METAL).strength(1.5F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("ruby_block"));
        event.getRegistry().register(new Block(Block.Properties.of(Material.METAL).sound(SoundType.METAL).strength(1.1F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("copper_block"));
        event.getRegistry().register(new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.1F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("bluestone_ore"));
        event.getRegistry().register(new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.1F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("ruby_ore"));
        event.getRegistry().register(new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.1F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("copper_ore"));
        event.getRegistry().register(new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.1F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("rainbow_ore"));
        event.getRegistry().register(new TokenAtm());
        event.getRegistry().register(new Chairsy());
        event.getRegistry().register(new BlockResta());
        event.getRegistry().register(new BlockCGM());
        event.getRegistry().register(new BlockHS());
        event.getRegistry().register(new BlockBC());
        event.getRegistry().register(new BlockSH());
        event.getRegistry().register(new BlockCB());
        event.getRegistry().register(new BlockSpeaker());
        event.getRegistry().register(new IllusionBlock());
        event.getRegistry().register(new CoffaTable());
        event.getRegistry().register(new BlockTV());
       // event.getRegistry().register(new WifiRouter());
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event)

    {
        Item.Properties properties = new Item.Properties().tab(iMOD.iTAB);
        event.getRegistry().register(new BlockItem(bluestone_block, new Item.Properties().tab(iMOD.iTAB)).setRegistryName("bluestone_block"));
        event.getRegistry().register(new BlockItem(ruby_block, new Item.Properties().tab(iMOD.iTAB)).setRegistryName("ruby_block"));
        event.getRegistry().register(new BlockItem(copper_block, new Item.Properties().tab(iMOD.iTAB)).setRegistryName("copper_block"));
        event.getRegistry().register(new BlockItem(bluestone_ore, new Item.Properties().tab(iMOD.iTAB)).setRegistryName("bluestone_ore"));
        event.getRegistry().register(new BlockItem(ruby_ore, new Item.Properties().tab(iMOD.iTAB)).setRegistryName("ruby_ore"));
        event.getRegistry().register(new BlockItem(copper_ore, new Item.Properties().tab(iMOD.iTAB)).setRegistryName("copper_ore"));
        event.getRegistry().register(new BlockItem(rainbow_ore, new Item.Properties().tab(iMOD.iTAB)).setRegistryName("rainbow_ore"));
        event.getRegistry().register(new BlockItem(token_atm, properties).setRegistryName("token_atm"));
        event.getRegistry().register(new BlockItem(chairsy, properties).setRegistryName("chairsy"));
        event.getRegistry().register(new BlockItem(custom_resta, properties).setRegistryName("custom_resta"));
        event.getRegistry().register(new BlockItem(custom_glassy_mobble, properties).setRegistryName("custom_glassy_mobble"));
        event.getRegistry().register(new BlockItem(hystel_something, properties).setRegistryName("hystel_something"));
        event.getRegistry().register(new BlockItem(better_cauldron, properties).setRegistryName("better_cauldron"));
        event.getRegistry().register(new BlockItem(santa_hat, properties).setRegistryName("santa_hat"));
        event.getRegistry().register(new BlockItem(customized_bobble, properties).setRegistryName("customized_bobble"));
        event.getRegistry().register(new BlockItem(speaker, properties).setRegistryName("speaker"));
        event.getRegistry().register(new BlockItem(custom_block, properties).setRegistryName("custom_block"));
        event.getRegistry().register(new BlockItem(coffee_table, properties).setRegistryName("coffee_table"));
        event.getRegistry().register(new BlockItem(tv, properties).setRegistryName("tv"));
        //event.getRegistry().register(new BlockItem(wifi_router, properties).setRegistryName("wifi_router"));

    }
}
