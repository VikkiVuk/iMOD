package com.VikkiVuk.iMOD.commands;

import com.VikkiVuk.iMOD.iMOD;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.tree.LiteralCommandNode;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;

public class ModCommands {
    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        LiteralCommandNode<CommandSource> cmdTut = dispatcher.register(Commands.literal(iMOD.MOD_ID)
                .then(CommandTeleportDimension.register(dispatcher))
        );

        dispatcher.register(Commands.literal("imod").redirect(cmdTut));
    }

}
