package com.VikkiVuk.iMOD.util.enums;

import com.VikkiVuk.iMOD.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

import static com.VikkiVuk.iMOD.iMOD.MOD_ID;

public enum ModArmorTier implements IArmorMaterial
{
    bluestone(MOD_ID + ":bluestone", 579, new int[]{7, 6, 8, 5}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, () -> {return Ingredient.fromItems(ItemInit.bluestone_ingot); }),
    ruby(MOD_ID + ":ruby", 500, new int[]{6, 5, 7, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, () -> {return Ingredient.fromItems(ItemInit.ruby); }),
    cracked_netherite(MOD_ID + ":cracked_netherite", 596, new int[]{11, 11, 11, 11}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, () -> {return Ingredient.fromItems(Items.NETHERITE_INGOT); }),
    firey_netherite(MOD_ID + ":firey_netherite", 595, new int[]{10, 10, 10, 10}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, () -> {return Ingredient.fromItems(Items.NETHERITE_INGOT); }),
    copper(MOD_ID + ":copper", 472, new int[]{4, 5, 6, 3}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, () -> {return Ingredient.fromItems(ItemInit.copper_ingot); }),
    rainbow(MOD_ID + ":rainbow", 589, new int[]{9, 9, 9, 9}, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, () -> {return Ingredient.fromItems(ItemInit.rainbow_gem); });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyValue<Ingredient> repairMaterial;

    private ModArmorTier(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn, int enchantabilityIn, SoundEvent equipSoundIn, float toughnessIn, Supplier<Ingredient> repairMaterialSupplier) {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountsIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = equipSoundIn;
        this.toughness = toughnessIn;
        this.repairMaterial = new LazyValue<>(repairMaterialSupplier);
    }

    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.1F;
    }

}
