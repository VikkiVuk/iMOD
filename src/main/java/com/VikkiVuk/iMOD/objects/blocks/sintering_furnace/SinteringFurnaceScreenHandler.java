package com.VikkiVuk.iMOD.objects.blocks.sintering_furnace;

import com.VikkiVuk.iMOD.util.SinteringFurnaceInit;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;

public class SinteringFurnaceScreenHandler extends AbstractFurnaceScreenHandler {
    public SinteringFurnaceScreenHandler(int i, PlayerInventory playerInventory) {
        super(SinteringFurnaceInit.sintering_furnace_screen_handler, SinteringFurnaceInit.sintering_furnace_recipe_type, RecipeBookCategory.FURNACE, i, playerInventory);
    }

    public SinteringFurnaceScreenHandler(int i, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(SinteringFurnaceInit.sintering_furnace_screen_handler, SinteringFurnaceInit.sintering_furnace_recipe_type, RecipeBookCategory.FURNACE, i, playerInventory, inventory, propertyDelegate);
    }
}