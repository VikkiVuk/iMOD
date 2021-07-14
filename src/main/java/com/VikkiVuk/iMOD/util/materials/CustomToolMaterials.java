package com.VikkiVuk.iMOD.util.materials;

import com.VikkiVuk.iMOD.registry.ItemInit;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum CustomToolMaterials implements ToolMaterial {
    bluestone(6, 2600, 10.9F, 9.0F, 30, () -> {
        return Ingredient.ofItems(ItemInit.bluestone_ingot);
    }),

    ruby(5, 2000, 9.5F, 8.0F, 30,() -> {
        return Ingredient.ofItems(ItemInit.ruby);
    }),

    copper(4, 1600, 7.9F, 7.0F, 30,() -> {
        return Ingredient.ofItems(ItemInit.copper_ingot);
    }),

    rainbow(7, 2600, 15.9F, 10.0F, 30,() -> {
        return Ingredient.ofItems(ItemInit.rainbow_gem);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    CustomToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient) this.repairIngredient.get();
    }
}
