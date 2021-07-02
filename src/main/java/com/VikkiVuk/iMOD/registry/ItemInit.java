package com.VikkiVuk.iMOD.registry;

import com.VikkiVuk.iMOD.iMOD;
import com.VikkiVuk.iMOD.objects.items.DiamondIngot;
import com.VikkiVuk.iMOD.objects.items.DinkyWinky;
import com.VikkiVuk.iMOD.objects.items.Dollar;
import com.VikkiVuk.iMOD.objects.items.Microphone;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

import static com.VikkiVuk.iMOD.iMOD.MOD_ID;

public class ItemInit {
    // Ingots and gems
    public static final Item bluestone_ingot = new Item(new Item.Settings().group(iMOD.iTAB));
    public static final Item ruby = new Item(new Item.Settings().group(iMOD.iTAB));
    public static final Item copper_ingot = new Item(new Item.Settings().group(iMOD.iTAB));
    public static final Item rainbow_gem = new Item(new Item.Settings().group(iMOD.iTAB));
    public static final Item compressed_iron = new Item(new Item.Settings().group(iMOD.iTAB));
    public static final Item ruby_ingot = new Item(new Item.Settings().group(iMOD.iTAB));

    //Miscellaneous
    public static final Item dinky_winky = new DinkyWinky(new Item.Settings().group(iMOD.iTAB));
    public static final Item microphone = new Microphone(new Item.Settings().group(iMOD.iTAB));
    public static final Item dollar = new Dollar(new Item.Settings().group(iMOD.iTAB));
    public static final Item diamond_ingot = new DiamondIngot(new Item.Settings().group(iMOD.iTAB));
    public static final Item flour_bag = new Item(new Item.Settings().group(iMOD.iTAB));
    public static final Item wheat_flour = new Item(new Item.Settings().group(iMOD.iTAB));

    //Sticks
    public static final Item bluestone_stick = new Item(new Item.Settings().group(iMOD.iTAB));
    public static final Item ruby_stick = new Item(new Item.Settings().group(iMOD.iTAB));
    public static final Item copper_stick = new Item(new Item.Settings().group(iMOD.iTAB));
    public static final Item rainbow_stick = new Item(new Item.Settings().group(iMOD.iTAB));

    //Tokens for the Token ATM
    public static final Item bluestone_token = new Item(new Item.Settings().group(iMOD.iTAB));
    public static final Item ruby_token = new Item(new Item.Settings().group(iMOD.iTAB));
    public static final Item copper_token = new Item(new Item.Settings().group(iMOD.iTAB));
    public static final Item rainbow_token = new Item(new Item.Settings().group(iMOD.iTAB));

    //Food
    public static final Item cheesseburger = new Item(new Item.Settings().group(iMOD.iTAB).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.2F).meat().build()));
    public static final Item bacon = new Item(new Item.Settings().group(iMOD.iTAB).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.2F).meat().build()));
    public static final Item beefburger = new Item(new Item.Settings().group(iMOD.iTAB).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.2F).meat().build()));
    public static final Item beefpatty = new Item(new Item.Settings().group(iMOD.iTAB).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.2F).meat().build()));
    public static final Item butter = new Item(new Item.Settings().group(iMOD.iTAB).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.2F).meat().build()));
    public static final Item cheesse = new Item(new Item.Settings().group(iMOD.iTAB).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.2F).meat().build()));
    public static final Item cracker = new Item(new Item.Settings().group(iMOD.iTAB).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.2F).meat().build()));
    public static final Item cheesse_and_cracker = new Item(new Item.Settings().group(iMOD.iTAB).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.2F).meat().build()));
    public static final Item fries = new Item(new Item.Settings().group(iMOD.iTAB).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.2F).meat().build()));
    public static final Item pizza = new Item(new Item.Settings().group(iMOD.iTAB).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.2F).meat().build()));
    public static final Item grated_cheesse = new Item(new Item.Settings().group(iMOD.iTAB).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.2F).meat().build()));
    public static final Item rice = new Item(new Item.Settings().group(iMOD.iTAB).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.2F).meat().build()));
    public static final Item rice_bowl = new Item(new Item.Settings().group(iMOD.iTAB).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.2F).meat().build()));
    public static final Item tomato = new Item(new Item.Settings().group(iMOD.iTAB).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.2F).meat().build()));

    public static void registerItems() {
        // Ingots and Gems
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_ingot"), bluestone_ingot);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby"), ruby);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_ingot"), copper_ingot);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_gem"), rainbow_gem);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "compressed_iron"), compressed_iron);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_ingot"), ruby_ingot);

        // Misc
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "dinky_winky"), dinky_winky);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "diamond_ingot"), diamond_ingot);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "dollar"), dollar);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "microphone"), microphone);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "flour_bag"), flour_bag);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "wheat_flour"), wheat_flour);

        // Sticks
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_stick"), bluestone_stick);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_stick"), ruby_stick);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_stick"), copper_stick);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_stick"), rainbow_stick);

        // Tokens
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bluestone_token"), bluestone_token);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "ruby_token"), ruby_token);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "copper_token"), copper_token);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rainbow_token"), rainbow_token);

        // Food
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "cheesseburger"), cheesseburger);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "beefburger"), beefburger);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "beefpatty"), beefpatty);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "bacon"), bacon);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "butter"), butter);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "cheesse"), cheesse);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "cheesse_and_cracker"), cheesse_and_cracker);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "fries"), fries);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "pizza"), pizza);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "grated_cheesse"), grated_cheesse);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rice"), rice);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "rice_bowl"), rice_bowl);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "tomato"), tomato);
        Registry.register(Registry.ITEM, new Identifier(iMOD.MOD_ID, "cracker"), cracker);
    }

   /* public enum ModItemTier implements IItemTier
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

    }*/
}
