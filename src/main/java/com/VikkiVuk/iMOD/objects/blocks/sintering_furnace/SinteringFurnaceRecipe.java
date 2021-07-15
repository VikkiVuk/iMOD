package com.VikkiVuk.iMOD.objects.blocks.sintering_furnace;

import com.VikkiVuk.iMOD.util.SinteringFurnaceInit;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.registry.Registry;

public class SinteringFurnaceRecipe extends AbstractCookingRecipe {
    public SinteringFurnaceRecipe(Identifier id, String group, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(SinteringFurnaceInit.sintering_furnace_recipe, id, group, input, output, experience, cookTime);
    }

    public ItemStack createIcon() {
        return new ItemStack(SinteringFurnaceInit.sintering_furnace);
    }

    public RecipeSerializer<?> getSerializer() {
        return RecipeSerializer.SMELTING;
    }
}
