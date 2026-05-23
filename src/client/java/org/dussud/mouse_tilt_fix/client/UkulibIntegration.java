package org.dussud.mouse_tilt_fix.client;

import net.minecraft.client.gui.screens.Screen;
import net.uku3lig.ukulib.api.UkulibAPI;

import java.util.function.UnaryOperator;

public class UkulibIntegration implements UkulibAPI {
    @Override
    public UnaryOperator<Screen> supplyConfigScreen() {
        return (parent) -> new MouseTiltFixConfigScreen(parent);
    }
}
