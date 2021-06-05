package com.VikkiVuk.iMOD.objects.items;

import com.VikkiVuk.iMOD.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class dollar extends Item {
    public dollar(Item.Properties properties) {
        super(properties);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        if(KeyboardHelper.isHoldingShift())
        {
            tooltip.add(new StringTextComponent("\u00A77" + "WELL, I dont know why you made this or how you got this, but this is just useless, unlike the dinkywinky thing you cant use this to smelt stuff."));
        }
        else
        {
            tooltip.add(new StringTextComponent("\u00A77" + "Hold" + "\u00A76" + " SHIFT " + "\u00A77" + "for more information"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}