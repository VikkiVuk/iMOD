package com.VikkiVuk.iMOD.util.enums;

import com.VikkiVuk.iMOD.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier
{
    BLUESTONE(6, 2600, 10.9F, 9.0F, 30, () -> { return Ingredient.fromItems(ItemInit.bluestone_ingot); }),
    RUBY(5, 2000, 9.5F, 8.0F, 30, () -> { return Ingredient.fromItems(ItemInit.bluestone_ingot); }),
    CRACKED_NETHERITE(9, 3000, 16.9F, 11.2F, 30, () -> { return Ingredient.fromItems(ItemInit.cracked_netherite_ingot); }),
    FIREY_NETHERITE(8, 2900, 16F, 10.9F, 30, () -> { return Ingredient.fromItems(ItemInit.firey_netherite_ingot); }),
    COPPER(4, 1600, 7.9F, 7.0F, 30, () -> { return Ingredient.fromItems(ItemInit.bluestone_ingot); }),
    RAINBOW(7, 2600, 15.9F, 10.0F, 30, () -> { return Ingredient.fromItems(ItemInit.bluestone_ingot); });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
    {

        this.repairMaterial = new LazyValue<>(repairMaterial);
        this.enchantability = enchantability;
        this.attackDamage = attackDamage;
        this.efficiency = efficiency;
        this.maxUses = maxUses;
        this.harvestLevel = harvestLevel;
    }


    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}
