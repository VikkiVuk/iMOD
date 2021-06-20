package com.VikkiVuk.iMOD.init;

import com.VikkiVuk.iMOD.iMOD;
import com.VikkiVuk.iMOD.objects.blocks.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, iMOD.MOD_ID);

    // Normal blocks
    public static final RegistryObject<Block> bluestone_block = BLOCKS.register("bluestone_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1.9F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).setRequiresTool()));
    public static final RegistryObject<Block> ruby_block = BLOCKS.register("ruby_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1.9F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).setRequiresTool()));
    public static final RegistryObject<Block> copper_block = BLOCKS.register("copper_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1.9F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).setRequiresTool()));
    public static final RegistryObject<Block> rainbow_block = BLOCKS.register("rainbow_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1.9F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).setRequiresTool()));

    // Custom Models/Blocks
    public static final RegistryObject<Block> chairsy = BLOCKS.register("chairsy", Chairsy::new);
    public static final RegistryObject<Block> token_atm = BLOCKS.register("token_atm", TokenAtm::new);
    public static final RegistryObject<Block> custom_glassy_mobble = BLOCKS.register("custom_glassy_mobble", BlockCGM::new);
    public static final RegistryObject<Block> better_cauldron = BLOCKS.register("better_cauldron", BlockBC::new);
    public static final RegistryObject<Block> speaker = BLOCKS.register("speaker", BlockSpeaker::new);
    public static final RegistryObject<Block> custom_resta = BLOCKS.register("custom_resta", BlockResta::new);
    public static final RegistryObject<Block> coffee_table = BLOCKS.register("coffee_table", CoffaTable::new);
    public static final RegistryObject<Block> santa_hat = BLOCKS.register("santa_hat", BlockSH::new);
    public static final RegistryObject<Block> customized_bobble = BLOCKS.register("customized_bobble", BlockCB::new);
    public static final RegistryObject<Block> custom_block = BLOCKS.register("custom_block", IllusionBlock::new);
    public static final RegistryObject<Block> wifi_router = BLOCKS.register("wifi_router", WifiRouter::new);
    public static final RegistryObject<Block> tv = BLOCKS.register("tv", BlockTV::new);

    // Slimes
    public static final RegistryObject<Block> blue_slime = BLOCKS.register("blue_slime", () -> new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()));
    public static final RegistryObject<Block> brown_slime = BLOCKS.register("brown_slime", () -> new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()));
    public static final RegistryObject<Block> cyan_slime = BLOCKS.register("cyan_slime", () -> new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()));
    public static final RegistryObject<Block> gray_slime = BLOCKS.register("gray_slime", () -> new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()));
    public static final RegistryObject<Block> green_slime = BLOCKS.register("green_slime", () -> new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()));
    public static final RegistryObject<Block> light_blue_slime = BLOCKS.register("light_blue_slime", () -> new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()));
    public static final RegistryObject<Block> light_gray_slime = BLOCKS.register("light_gray_slime", () -> new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()));
    public static final RegistryObject<Block> lime_slime = BLOCKS.register("lime_slime", () -> new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()));
    public static final RegistryObject<Block> magenta_slime = BLOCKS.register("magenta_slime", () -> new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()));
    public static final RegistryObject<Block> pink_slime = BLOCKS.register("pink_slime", () -> new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()));
    public static final RegistryObject<Block> purple_slime = BLOCKS.register("purple_slime", () -> new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()));
    public static final RegistryObject<Block> white_slime = BLOCKS.register("white_slime", () -> new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()));
    public static final RegistryObject<Block> yellow_slime = BLOCKS.register("yellow_slime", () -> new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()));
    public static final RegistryObject<Block> orange_slime = BLOCKS.register("orange_slime", () -> new SlimeBlock(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.GRASS).slipperiness(0.8F).sound(SoundType.SLIME).notSolid()));

    //Planks
    public static final RegistryObject<Block> bluestone_planks = BLOCKS.register("bluestone_planks", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1.9F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).setRequiresTool()));
    public static final RegistryObject<Block> ruby_planks = BLOCKS.register("ruby_planks", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1.9F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).setRequiresTool()));
    public static final RegistryObject<Block> copper_planks = BLOCKS.register("copper_planks", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1.9F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).setRequiresTool()));

    //Ores
    public static final RegistryObject<Block> bluestone_ore = BLOCKS.register("bluestone_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1.9F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).setRequiresTool()));
    public static final RegistryObject<Block> ruby_ore = BLOCKS.register("ruby_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1.9F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).setRequiresTool()));
    public static final RegistryObject<Block> copper_ore = BLOCKS.register("copper_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1.9F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).setRequiresTool()));
    public static final RegistryObject<Block> rainbow_ore = BLOCKS.register("rainbow_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1.9F,10.8F).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).setRequiresTool()));

    // Tile Entities
    public static final RegistryObject<Block> quarry = BLOCKS.register("quarry", () -> new BlockQuarry(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1.9F,10.8F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> bluestone_chest = BLOCKS.register("storage_unit", () -> new BlockBluestoneChest(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1.9F,10.8F).sound(SoundType.METAL)));
}
