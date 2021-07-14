package com.VikkiVuk.iMOD.util.materials;

import com.VikkiVuk.iMOD.iMOD;
import com.VikkiVuk.iMOD.registry.ItemInit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum CustomArmorMaterials implements ArmorMaterial {
    bluestone( "bluestone", 40, new int[]{5,8,10,5}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(ItemInit.bluestone_ingot);
    }),
    ruby("ruby", 38, new int[]{4,7,9,4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(ItemInit.ruby);
    }),
    copper("copper", 35, new int[]{2,5,7,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(ItemInit.copper_ingot);
    }),
    rainbow("rainbow", 45, new int[]{6,9,11,6}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(ItemInit.rainbow_gem);
    });

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    CustomArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
