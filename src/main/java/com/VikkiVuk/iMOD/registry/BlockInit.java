package com.VikkiVuk.iMOD.registry;

import com.VikkiVuk.iMOD.iMOD;
import com.VikkiVuk.iMOD.objects.blocks.*;
import com.VikkiVuk.iMOD.objects.blocks.other.CustomSlimeBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit {
    // Normal blocks
    public static final Block bluestone_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(1.9F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
    public static final Block ruby_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(1.9F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
    public static final Block copper_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(1.9F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
    public static final Block rainbow_block = new Block(FabricBlockSettings.of(Material.METAL).hardness(1.9F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
    public static final Block light_blue_glowstone = new Block(FabricBlockSettings.of(Material.GLASS).hardness(1.9F).sounds(BlockSoundGroup.GLASS).breakByHand(true));
    public static final Block customized_bobble = new Block(FabricBlockSettings.of(Material.STONE).hardness(1.9F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());
    public static final Block custom_block = new Block(FabricBlockSettings.of(Material.STONE).hardness(1.9F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool());

    // Custom Models/Blocks
    public static final Block chairsy = new Chairsy();
    public static final Block token_atm = new TokenATM();
    public static final Block custom_glassy_mobble = new CustomGlassyMobble();
    public static final Block better_cauldron = new BetterCauldron();
    public static final Block speaker = new Speaker();
    public static final Block custom_resta = new CustomResta();
    public static final Block coffee_table = new CoffeeTable();
    public static final Block santa_hat = new SantaHat();
    public static final Block wifi_router = new WifiRouter();
    public static final Block tv = new TV();

    // Slimes
    public static final Block blue_slime = new CustomSlimeBlock();
    public static final Block brown_slime = new CustomSlimeBlock();
    public static final Block cyan_slime = new CustomSlimeBlock();
    public static final Block gray_slime = new CustomSlimeBlock();
    public static final Block green_slime = new CustomSlimeBlock();
    public static final Block light_blue_slime = new CustomSlimeBlock();
    public static final Block light_gray_slime = new CustomSlimeBlock();
    public static final Block lime_slime = new CustomSlimeBlock();
    public static final Block magenta_slime = new CustomSlimeBlock();
    public static final Block pink_slime = new CustomSlimeBlock();
    public static final Block purple_slime = new CustomSlimeBlock();
    public static final Block white_slime = new CustomSlimeBlock();
    public static final Block yellow_slime = new CustomSlimeBlock();
    public static final Block orange_slime = new CustomSlimeBlock();

    //Planks
    public static final Block bluestone_planks = new Block(FabricBlockSettings.of(Material.METAL).strength(1.9F,10.8F).breakByTool(FabricToolTags.PICKAXES,2).sounds(BlockSoundGroup.METAL).requiresTool());
    public static final Block ruby_planks = new Block(FabricBlockSettings.of(Material.METAL).strength(1.9F,10.8F).breakByTool(FabricToolTags.PICKAXES,2).sounds(BlockSoundGroup.METAL).requiresTool());
    public static final Block copper_planks = new Block(FabricBlockSettings.of(Material.METAL).strength(1.9F,10.8F).breakByTool(FabricToolTags.PICKAXES,2).sounds(BlockSoundGroup.METAL).requiresTool());

    //Ores
    public static final Block bluestone_ore = new Block(FabricBlockSettings.of(Material.METAL).strength(1.9F,10.8F).breakByTool(FabricToolTags.PICKAXES,2).sounds(BlockSoundGroup.METAL).requiresTool());
    public static final Block ruby_ore = new Block(FabricBlockSettings.of(Material.METAL).strength(1.9F,10.8F).breakByTool(FabricToolTags.PICKAXES,2).sounds(BlockSoundGroup.METAL).requiresTool());
    public static final Block copper_ore = new Block(FabricBlockSettings.of(Material.METAL).strength(1.9F,10.8F).breakByTool(FabricToolTags.PICKAXES,2).sounds(BlockSoundGroup.METAL).requiresTool());
    public static final Block rainbow_ore = new Block(FabricBlockSettings.of(Material.METAL).strength(1.9F,10.8F).breakByTool(FabricToolTags.PICKAXES,2).sounds(BlockSoundGroup.METAL).requiresTool());

    public static void registerBlocks() {
        // Normal Blocks
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "bluestone_block"), bluestone_block);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "ruby_block"), ruby_block);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "copper_block"), copper_block);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "rainbow_block"), rainbow_block);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "light_blue_glowstone"), light_blue_glowstone);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "customized_bobble"), customized_bobble);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "custom_block"), custom_block);

        // Custom Models
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "chairsy"), chairsy);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "token_atm"), token_atm);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "custom_glassy_mobble"), custom_glassy_mobble);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "better_cauldron"), better_cauldron);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "speaker"), speaker);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "custom_resta"), custom_resta);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "coffee_table"), coffee_table);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "wifi_router"), wifi_router);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "tv"), tv);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "santa_hat"), santa_hat);

        // Slime Blocks
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "blue_slime"), blue_slime);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "brown_slime"), brown_slime);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "cyan_slime"), cyan_slime);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "gray_slime"), gray_slime);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "green_slime"), green_slime);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "light_blue_slime"), light_blue_slime);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "light_gray_slime"), light_gray_slime);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "lime_slime"), lime_slime);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "magenta_slime"), magenta_slime);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "pink_slime"), pink_slime);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "purple_slime"), purple_slime);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "white_slime"), white_slime);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "yellow_slime"), yellow_slime);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "orange_slime"), orange_slime);

        // Planks
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "bluestone_planks"), bluestone_planks);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "ruby_planks"), ruby_planks);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "copper_planks"), copper_planks);

        // Ores
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "bluestone_ore"), bluestone_ore);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "ruby_ore"), ruby_ore);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "copper_ore"), copper_ore);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "rainbow_ore"), rainbow_ore);
    }

    public static void registerBlockItems() {
        // Normal blocks
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_block"), new BlockItem(bluestone_block, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_block"), new BlockItem(ruby_block, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_block"), new BlockItem(copper_block, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_block"), new BlockItem(rainbow_block, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "light_blue_glowstone"), new BlockItem(light_blue_glowstone, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "customized_bobble"), new BlockItem(customized_bobble, new Item.Settings().group(iMOD.iTAB)));

        // Custom blocks(models)
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "custom_block"), new BlockItem(custom_block, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "chairsy"), new BlockItem(chairsy, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "token_atm"), new BlockItem(token_atm, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "custom_glassy_mobble"), new BlockItem(custom_glassy_mobble, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "better_cauldron"), new BlockItem(better_cauldron, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "speaker"), new BlockItem(speaker, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "custom_resta"), new BlockItem(custom_resta, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "coffee_table"), new BlockItem(coffee_table, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "wifi_router"), new BlockItem(wifi_router, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "tv"), new BlockItem(tv, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "santa_hat"), new BlockItem(santa_hat, new Item.Settings().group(iMOD.iTAB)));

        // Slimes
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "blue_slime"), new BlockItem(blue_slime, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "brown_slime"), new BlockItem(brown_slime, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "cyan_slime"), new BlockItem(cyan_slime, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "gray_slime"), new BlockItem(gray_slime, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "green_slime"), new BlockItem(green_slime, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "light_blue_slime"), new BlockItem(light_blue_slime, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "light_gray_slime"), new BlockItem(light_gray_slime, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "lime_slime"), new BlockItem(lime_slime, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "magenta_slime"), new BlockItem(magenta_slime, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "pink_slime"), new BlockItem(pink_slime, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "purple_slime"), new BlockItem(purple_slime, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "white_slime"), new BlockItem(white_slime, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "yellow_slime"), new BlockItem(yellow_slime, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "orange_slime"), new BlockItem(orange_slime, new Item.Settings().group(iMOD.iTAB)));

        // Planks
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_planks"), new BlockItem(bluestone_planks, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_planks"), new BlockItem(ruby_planks, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_planks"), new BlockItem(copper_planks, new Item.Settings().group(iMOD.iTAB)));

        // Ores
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_ore"), new BlockItem(bluestone_ore, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_ore"), new BlockItem(ruby_ore, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_ore"), new BlockItem(copper_ore, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_ore"), new BlockItem(rainbow_ore, new Item.Settings().group(iMOD.iTAB)));
    }
}
