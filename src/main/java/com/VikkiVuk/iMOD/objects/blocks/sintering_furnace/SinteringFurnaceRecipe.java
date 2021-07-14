package com.VikkiVuk.iMOD.objects.blocks.sintering_furnace;

import com.VikkiVuk.iMOD.util.SinteringFurnaceInit;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;

public class SinteringFurnaceRecipe extends AbstractCookingRecipe {
    public SinteringFurnaceRecipe(Identifier id, String group, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(SinteringFurnaceInit.sintering_furnace_recipe_type, id, group, input, output, experience, cookTime);
    }


    @Override
    public RecipeSerializer<?> getSerializer() {
        return SinteringFurnaceInit.SINTERING_FURNACE_RECIPE_SERIALIZER;
    }
}