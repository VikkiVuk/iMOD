package com.VikkiVuk.iMOD.registry;

import com.VikkiVuk.iMOD.iMOD;
import com.VikkiVuk.iMOD.objects.items.DiamondIngot;
import com.VikkiVuk.iMOD.objects.items.DinkyWinky;
import com.VikkiVuk.iMOD.objects.items.Dollar;
import com.VikkiVuk.iMOD.objects.items.Microphone;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

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
}
