package com.VikkiVuk.iMOD.objects.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class DiamondIngot extends Item {
    public DiamondIngot(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add( new TranslatableText("item.imod.diamond_ingot.tooltip").formatted(Formatting.GOLD) );
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }
}