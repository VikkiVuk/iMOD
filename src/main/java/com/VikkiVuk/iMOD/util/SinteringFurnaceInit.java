package com.VikkiVuk.iMOD.util;

import com.VikkiVuk.iMOD.iMOD;
import com.VikkiVuk.iMOD.objects.blocks.sintering_furnace.SinteringFurnace;
import com.VikkiVuk.iMOD.objects.blocks.sintering_furnace.SinteringFurnaceBlockEntity;
import com.VikkiVuk.iMOD.objects.blocks.sintering_furnace.SinteringFurnaceRecipe;
import com.VikkiVuk.iMOD.objects.blocks.sintering_furnace.SinteringFurnaceScreenHandler;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandlerType;

public class SinteringFurnaceInit {
    public static final Block sintering_furnace = new SinteringFurnace(FabricBlockSettings.of(Material.METAL));
    public static final BlockEntityType sintering_furnace_block_entity = BlockEntityType.Builder.create(SinteringFurnaceBlockEntity::new, sintering_furnace).build(null);
    public static final RecipeType<SinteringFurnaceRecipe> sintering_furnace_recipe_type = new RecipeType<>() {
        @Override
        public String toString() {
            return "sintering_furnace";
        }
    };

    public static final RecipeSerializer<SinteringFurnaceRecipe> SINTERING_FURNACE_RECIPE_SERIALIZER = new CookingRecipeSerializer<>(SinteringFurnaceRecipe::new, 200);

    public static final ScreenHandlerType<SinteringFurnaceScreenHandler> sintering_furnace_screen_handler = SinteringFurnaceScreenHandler::new;

    public static void register(){

    }
}
