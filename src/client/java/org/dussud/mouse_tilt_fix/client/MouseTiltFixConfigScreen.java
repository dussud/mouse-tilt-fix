package org.dussud.mouse_tilt_fix.client;

import net.minecraft.client.gui.screens.Screen;
import net.uku3lig.ukulib.config.option.CyclingOption;
import net.uku3lig.ukulib.config.option.WidgetCreator;
import net.uku3lig.ukulib.config.screen.AbstractConfigScreen;
import org.dussud.mouse_tilt_fix.MouseTiltFix;
import org.dussud.mouse_tilt_fix.MouseTiltFixConfig;

public class MouseTiltFixConfigScreen extends AbstractConfigScreen<MouseTiltFixConfig> {
    protected MouseTiltFixConfigScreen(Screen parent) {
        super("mouse-tilt-fix.config.title", parent, MouseTiltFix.manager);
    }

    @Override
    protected WidgetCreator[] getWidgets(MouseTiltFixConfig config) {
        return new WidgetCreator[]{
                CyclingOption.ofBoolean("mouse-tilt-fix.option.lateralScrollingEnabled", config.isLateralScrollingEnabled(), config::enableLateralScrolling).wide(),
                CyclingOption.ofBoolean("mouse-tilt-fix.option.lateralScrollingDirectionReversed", config.isLateralScrollingDirectionReversed(), config::reverseLateralScrollingDirection).wide()
        };
    }
}
