package com.VikkiVuk.iMOD.registry;

import com.VikkiVuk.iMOD.iMOD;
import com.VikkiVuk.iMOD.objects.items.other.*;
import com.VikkiVuk.iMOD.util.materials.CustomArmorMaterials;
import com.VikkiVuk.iMOD.util.materials.CustomToolMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import javax.swing.*;

public class ATInit {
    // Tools
    public static ToolItem bluestone_pickaxe = new CustomPickaxeItem(CustomToolMaterials.bluestone, 1, -2.8F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem bluestone_axe = new CustomAxeItem(CustomToolMaterials.bluestone, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem bluestone_hoe = new CustomHoeItem(CustomToolMaterials.bluestone, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem bluestone_shovel = new CustomShovelItem(CustomToolMaterials.bluestone, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem bluestone_sword = new CustomSwordItem(CustomToolMaterials.bluestone, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));

    public static ToolItem ruby_pickaxe = new CustomPickaxeItem(CustomToolMaterials.ruby, 1, -2.8F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem ruby_axe = new CustomAxeItem(CustomToolMaterials.ruby, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem ruby_hoe = new CustomHoeItem(CustomToolMaterials.ruby, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem ruby_shovel = new CustomShovelItem(CustomToolMaterials.ruby, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem ruby_sword = new CustomSwordItem(CustomToolMaterials.ruby, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));

    public static ToolItem copper_pickaxe = new CustomPickaxeItem(CustomToolMaterials.copper, 1, -2.8F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem copper_axe = new CustomAxeItem(CustomToolMaterials.copper, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem copper_hoe = new CustomHoeItem(CustomToolMaterials.copper, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem copper_shovel = new CustomShovelItem(CustomToolMaterials.copper, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem copper_sword = new CustomSwordItem(CustomToolMaterials.copper, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));

    public static ToolItem rainbow_pickaxe = new CustomPickaxeItem(CustomToolMaterials.rainbow, 1, -2.8F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem rainbow_axe = new CustomAxeItem(CustomToolMaterials.rainbow, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem rainbow_hoe = new CustomHoeItem(CustomToolMaterials.rainbow, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem rainbow_shovel = new CustomShovelItem(CustomToolMaterials.rainbow, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));
    public static ToolItem rainbow_sword = new CustomSwordItem(CustomToolMaterials.rainbow, 7, -3.2F, new Item.Settings().group(iMOD.iTAB));

    // Armor
    public static final Item bluestone_helmet = new ArmorItem(CustomArmorMaterials.bluestone, EquipmentSlot.HEAD, new Item.Settings().group(iMOD.iTAB));
    public static final Item bluestone_chestplate = new ArmorItem(CustomArmorMaterials.bluestone, EquipmentSlot.CHEST, new Item.Settings().group(iMOD.iTAB));
    public static final Item bluestone_leggings = new ArmorItem(CustomArmorMaterials.bluestone, EquipmentSlot.LEGS, new Item.Settings().group(iMOD.iTAB));
    public static final Item bluestone_boots = new ArmorItem(CustomArmorMaterials.bluestone, EquipmentSlot.FEET, new Item.Settings().group(iMOD.iTAB));

    public static final Item ruby_helmet = new ArmorItem(CustomArmorMaterials.ruby, EquipmentSlot.HEAD, new Item.Settings().group(iMOD.iTAB));
    public static final Item ruby_chestplate = new ArmorItem(CustomArmorMaterials.ruby, EquipmentSlot.CHEST, new Item.Settings().group(iMOD.iTAB));
    public static final Item ruby_leggings = new ArmorItem(CustomArmorMaterials.ruby, EquipmentSlot.LEGS, new Item.Settings().group(iMOD.iTAB));
    public static final Item ruby_boots = new ArmorItem(CustomArmorMaterials.ruby, EquipmentSlot.FEET, new Item.Settings().group(iMOD.iTAB));

    public static final Item copper_helmet = new ArmorItem(CustomArmorMaterials.copper, EquipmentSlot.HEAD, new Item.Settings().group(iMOD.iTAB));
    public static final Item copper_chestplate = new ArmorItem(CustomArmorMaterials.copper, EquipmentSlot.CHEST, new Item.Settings().group(iMOD.iTAB));
    public static final Item copper_leggings = new ArmorItem(CustomArmorMaterials.copper, EquipmentSlot.LEGS, new Item.Settings().group(iMOD.iTAB));
    public static final Item copper_boots = new ArmorItem(CustomArmorMaterials.copper, EquipmentSlot.FEET, new Item.Settings().group(iMOD.iTAB));

    public static final Item rainbow_helmet = new ArmorItem(CustomArmorMaterials.rainbow, EquipmentSlot.HEAD, new Item.Settings().group(iMOD.iTAB));
    public static final Item rainbow_chestplate = new ArmorItem(CustomArmorMaterials.rainbow, EquipmentSlot.CHEST, new Item.Settings().group(iMOD.iTAB));
    public static final Item rainbow_leggings = new ArmorItem(CustomArmorMaterials.rainbow, EquipmentSlot.LEGS, new Item.Settings().group(iMOD.iTAB));
    public static final Item rainbow_boots = new ArmorItem(CustomArmorMaterials.rainbow, EquipmentSlot.FEET, new Item.Settings().group(iMOD.iTAB));
    
    public static void registerArmors(){
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_helmet"), bluestone_helmet);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_chestplate"), bluestone_chestplate);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_leggings"), bluestone_leggings);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_boots"), bluestone_boots);

        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_helmet"), ruby_helmet);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_chestplate"), ruby_chestplate);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_leggings"), ruby_leggings);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_boots"), ruby_boots);

        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_helmet"), copper_helmet);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_chestplate"), copper_chestplate);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_leggings"), copper_leggings);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_boots"), copper_boots);

        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_helmet"), rainbow_helmet);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_chestplate"), rainbow_chestplate);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_leggings"), rainbow_leggings);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_boots"), rainbow_boots);
    }

    public static void registerTools(){
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_pickaxe"), bluestone_pickaxe);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_axe"), bluestone_axe);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_hoe"), bluestone_hoe);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_shovel"), bluestone_shovel);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_sword"), bluestone_sword);

        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_pickaxe"), ruby_pickaxe);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_axe"), ruby_axe);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_hoe"), ruby_hoe);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_shovel"), ruby_shovel);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_sword"), ruby_sword);

        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_pickaxe"), copper_pickaxe);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_axe"), copper_axe);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_hoe"), copper_hoe);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_shovel"), copper_shovel);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_sword"), copper_sword);

        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_pickaxe"), rainbow_pickaxe);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_axe"), rainbow_axe);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_hoe"), rainbow_hoe);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_shovel"), rainbow_shovel);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_sword"), rainbow_sword);
    }
}
