package com.VikkiVuk.iMOD.registry;

import com.VikkiVuk.iMOD.objects.blocks.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

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
}
