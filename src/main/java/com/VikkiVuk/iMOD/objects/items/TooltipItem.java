package com.VikkiVuk.iMOD.objects.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.EnchantedGoldenAppleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class TooltipItem extends Item {
    private static String ItemName = null;
    private static Boolean isGlowing = null;

    public TooltipItem(Settings settings, String itemName, Boolean hasGlow) {
        super(settings);
        ItemName = itemName;
        isGlowing = hasGlow;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("item.imod." + ItemName + ".tooltip").formatted(Formatting.GOLD) );
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        if (isGlowing == true) {
            return true;
        } else {
            return false;
        }
    }
}
