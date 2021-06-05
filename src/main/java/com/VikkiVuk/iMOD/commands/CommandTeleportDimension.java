package com.VikkiVuk.iMOD.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Dimension;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class CommandTeleportDimension implements Command<CommandSource> {

	private static final CommandTeleportDimension CMD = new CommandTeleportDimension();

	public static ArgumentBuilder<CommandSource, ?> register(CommandDispatcher<CommandSource> dispatcher) {
		return Commands.literal("dim")
				.requires(cs -> cs.hasPermissionLevel(0))
				.executes(CMD);
	}

	@Override
	public int run(CommandContext<CommandSource> context) throws CommandSyntaxException {
		ServerPlayerEntity player = context.getSource().asPlayer();
		int x = player.getPosition().getX();
		int z = player.getPosition().getZ();
		if (player.getEntityWorld().equals(Dimension.OVERWORLD)) {
			ServerWorld world = player.getServer().getWorld(World.THE_NETHER);
			player.teleport(world, x, 200, z, 2f,2f);
		} else {
			/*ServerWorld world = player.getServer().getLevel(ModDimensions.TUTDIM);
			TeleportationTools.teleport(player, world, new BlockPos(x, 200, z));*/
		}
		return 0;
	}

	public static CommandTeleportDimension getCMD() {
		return CMD;
	}

	public String getName()
	{
		return "tpdimension";
	}
}