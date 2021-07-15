package com.VikkiVuk.iMOD.util;

import com.VikkiVuk.iMOD.iMOD;
import com.VikkiVuk.iMOD.objects.blocks.sintering_furnace.SinteringFurnace;
import com.VikkiVuk.iMOD.objects.blocks.sintering_furnace.SinteringFurnaceBlockEntity;
import com.VikkiVuk.iMOD.objects.blocks.sintering_furnace.SinteringFurnaceRecipe;
import com.VikkiVuk.iMOD.objects.blocks.sintering_furnace.SinteringFurnaceScreenHandler;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.recipe.*;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SinteringFurnaceInit {
    public static final Block sintering_furnace = new SinteringFurnace(FabricBlockSettings.of(Material.METAL));
    public static final BlockItem sintering_furnace_block_item = new BlockItem(sintering_furnace, new Item.Settings().group(iMOD.iTAB));

    public static final BlockEntityType sintering_furnace_block_entity = FabricBlockEntityTypeBuilder.create(SinteringFurnaceBlockEntity::new, sintering_furnace).build(null);

    public static ScreenHandlerType<SinteringFurnaceScreenHandler> sintering_furnace_screen_handler = null;


    public static final RecipeType<SinteringFurnaceRecipe> sintering_furnace_recipe = new RecipeType<SinteringFurnaceRecipe>() {
        public String toString() {
            return "sintering_furnace_recipe";
        }};

    public static void register(){
        Registry.register(Registry.RECIPE_TYPE, new Identifier("sintering_furnace_recipe"), sintering_furnace_recipe);
        Registry.register(Registry.BLOCK, new Identifier(iMOD.MOD_ID, "sintering_furnace"), sintering_furnace);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(iMOD.MOD_ID, "sintering_furnace"), sintering_furnace_block_entity);

        sintering_furnace_screen_handler = ScreenHandlerRegistry.registerSimple(new Identifier(iMOD.MOD_ID, "sintering_furnace"), SinteringFurnaceScreenHandler::new);

        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "sintering_furnace"), sintering_furnace_block_item);
    }
}
