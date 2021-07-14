package com.VikkiVuk.iMOD.objects.blocks.sintering_furnace;

import com.VikkiVuk.iMOD.util.SinteringFurnaceInit;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;

public class SinteringFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    public SinteringFurnaceBlockEntity() {
        super(SinteringFurnaceInit.sintering_furnace_block_entity, SinteringFurnaceInit.sintering_furnace_recipe_type);
    }

    @Override
    protected Text getContainerName() {
        return Text.of("Sintering Furnace");
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new SinteringFurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
