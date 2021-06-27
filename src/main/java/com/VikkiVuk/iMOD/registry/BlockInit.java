package com.VikkiVuk.iMOD.registry;

import com.VikkiVuk.iMOD.iMOD;
import com.VikkiVuk.iMOD.objects.blocks.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
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
    }

    public static void registerBlockItems() {
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_block"), new BlockItem(bluestone_block, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_block"), new BlockItem(ruby_block, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_block"), new BlockItem(copper_block, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_block"), new BlockItem(rainbow_block, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "light_blue_glowstone"), new BlockItem(light_blue_glowstone, new Item.Settings().group(iMOD.iTAB)));
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "customized_bobble"), new BlockItem(customized_bobble, new Item.Settings().group(iMOD.iTAB)));
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
    }
}
