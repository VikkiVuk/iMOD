package com.VikkiVuk.iMOD.init;

import com.VikkiVuk.iMOD.iMOD;
import com.VikkiVuk.iMOD.objects.blocks.*;
import com.VikkiVuk.iMOD.objects.blocks.SlimeBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
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
    //public static final BlockHS hystel_something = null;
    public static final BlockSH santa_hat = null;
    public static final Block customized_bobble = null;
    public static final IllusionBlock custom_block = null;
    public static final WifiRouter wifi_router = null;
    public static final BlockTV tv = null;

    //Slime blocks
    public static final SlimeBlock blue_slime = null;
    public static final SlimeBlock brown_slime = null;
    public static final SlimeBlock cyan_slime = null;
    public static final SlimeBlock gray_slime = null;
    public static final SlimeBlock green_slime = null;
    public static final SlimeBlock light_blue_slime = null;
    public static final SlimeBlock light_gray_slime = null;
    public static final SlimeBlock lime_slime = null;
    public static final SlimeBlock magenta_slime = null;
    public static final SlimeBlock orange_slime = null;
    public static final SlimeBlock pink_slime = null;
    public static final SlimeBlock purple_slime = null;
    public static final SlimeBlock white_slime = null;
    public static final SlimeBlock yellow_slime = null;

    //Ores
    public static final Block bluestone_ore = null;
    public static final Block ruby_ore = null;
    public static final Block copper_ore = null;
    public static final Block rainbow_ore = null;


    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1.9F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("bluestone_block"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1.5F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("ruby_block"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1.1F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("copper_block"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.1F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("bluestone_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.1F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("ruby_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.1F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("copper_ore"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.1F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("rainbow_ore"));
        event.getRegistry().register(new TokenAtm());
        event.getRegistry().register(new Chairsy());
        event.getRegistry().register(new BlockResta());
        event.getRegistry().register(new BlockCGM());
       // event.getRegistry().register(new BlockHS()); // Deprecated since the team is not called Hystel Studios anymore. And the mod is not called HystelMC
        event.getRegistry().register(new BlockBC());
        event.getRegistry().register(new BlockSH());
        event.getRegistry().register(new BlockCB());
        event.getRegistry().register(new BlockSpeaker());
        event.getRegistry().register(new IllusionBlock());
        event.getRegistry().register(new CoffaTable());
        event.getRegistry().register(new BlockTV());
        event.getRegistry().register(new WifiRouter());

        // Slime blocks use one class, the reason is because they only change colors nothing else.
        event.getRegistry().register(new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()).setRegistryName("blue_slime"));
        event.getRegistry().register(new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()).setRegistryName("brown_slime"));
        event.getRegistry().register(new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()).setRegistryName("cyan_slime"));
        event.getRegistry().register(new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()).setRegistryName("gray_slime"));
        event.getRegistry().register(new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()).setRegistryName("green_slime"));
        event.getRegistry().register(new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()).setRegistryName("light_blue_slime"));
        event.getRegistry().register(new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()).setRegistryName("light_gray_slime"));
        event.getRegistry().register(new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()).setRegistryName("lime_slime"));
        event.getRegistry().register(new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()).setRegistryName("magenta_slime"));
        event.getRegistry().register(new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()).setRegistryName("orange_slime"));
        event.getRegistry().register(new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()).setRegistryName("pink_slime"));
        event.getRegistry().register(new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()).setRegistryName("purple_slime"));
        event.getRegistry().register(new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()).setRegistryName("white_slime"));
        event.getRegistry().register(new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()).setRegistryName("yellow_slime"));
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event)

    {
        Item.Properties properties = new Item.Properties().group(iMOD.HystelTab.instance);
        event.getRegistry().register(new BlockItem(bluestone_block, new Item.Properties().group(iMOD.HystelTab.instance)).setRegistryName("bluestone_block"));
        event.getRegistry().register(new BlockItem(ruby_block, new Item.Properties().group(iMOD.HystelTab.instance)).setRegistryName("ruby_block"));
        event.getRegistry().register(new BlockItem(copper_block, new Item.Properties().group(iMOD.HystelTab.instance)).setRegistryName("copper_block"));
        event.getRegistry().register(new BlockItem(bluestone_ore, new Item.Properties().group(iMOD.HystelTab.instance)).setRegistryName("bluestone_ore"));
        event.getRegistry().register(new BlockItem(ruby_ore, new Item.Properties().group(iMOD.HystelTab.instance)).setRegistryName("ruby_ore"));
        event.getRegistry().register(new BlockItem(copper_ore, new Item.Properties().group(iMOD.HystelTab.instance)).setRegistryName("copper_ore"));
        event.getRegistry().register(new BlockItem(rainbow_ore, new Item.Properties().group(iMOD.HystelTab.instance)).setRegistryName("rainbow_ore"));
        event.getRegistry().register(new BlockItem(token_atm, properties).setRegistryName("token_atm"));
        event.getRegistry().register(new BlockItem(chairsy, properties).setRegistryName("chairsy"));
        event.getRegistry().register(new BlockItem(custom_resta, properties).setRegistryName("custom_resta"));
        event.getRegistry().register(new BlockItem(custom_glassy_mobble, properties).setRegistryName("custom_glassy_mobble"));
       // event.getRegistry().register(new BlockItem(hystel_something, properties).setRegistryName("hystel_something"));
        event.getRegistry().register(new BlockItem(better_cauldron, properties).setRegistryName("better_cauldron"));
        event.getRegistry().register(new BlockItem(santa_hat, properties).setRegistryName("santa_hat"));
        event.getRegistry().register(new BlockItem(customized_bobble, properties).setRegistryName("customized_bobble"));
        event.getRegistry().register(new BlockItem(speaker, properties).setRegistryName("speaker"));
        event.getRegistry().register(new BlockItem(custom_block, properties).setRegistryName("custom_block"));
        event.getRegistry().register(new BlockItem(coffee_table, properties).setRegistryName("coffee_table"));
        event.getRegistry().register(new BlockItem(tv, properties).setRegistryName("tv"));
        event.getRegistry().register(new BlockItem(wifi_router, properties).setRegistryName("wifi_router"));
        // Slime blocks, again.
        event.getRegistry().register(new BlockItem(blue_slime, properties).setRegistryName("blue_slime"));
        event.getRegistry().register(new BlockItem(brown_slime, properties).setRegistryName("brown_slime"));
        event.getRegistry().register(new BlockItem(cyan_slime, properties).setRegistryName("cyan_slime"));
        event.getRegistry().register(new BlockItem(gray_slime, properties).setRegistryName("gray_slime"));
        event.getRegistry().register(new BlockItem(green_slime, properties).setRegistryName("green_slime"));
        event.getRegistry().register(new BlockItem(light_blue_slime, properties).setRegistryName("light_blue_slime"));
        event.getRegistry().register(new BlockItem(light_gray_slime, properties).setRegistryName("light_gray_slime"));
        event.getRegistry().register(new BlockItem(lime_slime, properties).setRegistryName("lime_slime"));
        event.getRegistry().register(new BlockItem(magenta_slime, properties).setRegistryName("magenta_slime"));
        event.getRegistry().register(new BlockItem(orange_slime, properties).setRegistryName("orange_slime"));
        event.getRegistry().register(new BlockItem(pink_slime, properties).setRegistryName("pink_slime"));
        event.getRegistry().register(new BlockItem(purple_slime, properties).setRegistryName("purple_slime"));
        event.getRegistry().register(new BlockItem(white_slime, properties).setRegistryName("white_slime"));
        event.getRegistry().register(new BlockItem(yellow_slime, properties).setRegistryName("yellow_slime"));
    }
}
