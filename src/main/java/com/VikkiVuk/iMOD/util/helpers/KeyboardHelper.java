package com.VikkiVuk.iMOD.util.helpers;

import net.minecraft.client.Keyboard;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.input.Input;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.client.search.SearchManager;
import org.lwjgl.glfw.GLFW;

import javax.swing.*;

public class KeyboardHelper {
    private static final long WINDOW = MinecraftClient.getInstance().getWindow().getHandle();

    public static boolean isHoldingShift()
    {
        return Screen.hasShiftDown();
    }
}
