package org.dussud.horizontal_scrolling_fix.client;

import net.minecraft.client.gui.screens.Screen;
import net.uku3lig.ukulib.config.option.CyclingOption;
import net.uku3lig.ukulib.config.option.WidgetCreator;
import net.uku3lig.ukulib.config.screen.AbstractConfigScreen;
import org.dussud.horizontal_scrolling_fix.HorizontalScrollingFix;
import org.dussud.horizontal_scrolling_fix.HorizontalScrollingFixConfig;

public class HorizontalScrollingFixConfigScreen extends AbstractConfigScreen<HorizontalScrollingFixConfig> {
    protected HorizontalScrollingFixConfigScreen(Screen parent) {
        super("mouse-tilt-fix.config.title", parent, HorizontalScrollingFix.manager);
    }

    @Override
    protected WidgetCreator[] getWidgets(HorizontalScrollingFixConfig config) {
        return new WidgetCreator[]{
                CyclingOption.ofBoolean("mouse-tilt-fix.option.horizontalScrollingEnabled", config.isHorizontalScrollingEnabled(), config::enableHorizontalScrolling).wide(),
                CyclingOption.ofBoolean("mouse-tilt-fix.option.horizontalScrollingDirectionReversed", config.isHorizontalScrollingDirectionReversed(), config::reverseHorizontalScrollingDirection).wide()
        };
    }
}
