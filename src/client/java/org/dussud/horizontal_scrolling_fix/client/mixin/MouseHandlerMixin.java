package org.dussud.horizontal_scrolling_fix.client.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.MouseHandler;
import org.dussud.horizontal_scrolling_fix.HorizontalScrollingFix;
import org.joml.Vector2i;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(MouseHandler.class)
public class MouseHandlerMixin {
    @ModifyVariable(method = "onScroll", at = @At(value = "STORE"), index = 15, ordinal = 0)
    private int modifyOnScrollI(int original, @Local Vector2i vector2i) {
        HorizontalScrollingFix.LOGGER.debug("Original scroll vector vector2i = {}", vector2i);
        HorizontalScrollingFix.LOGGER.debug("Original scroll value i = {}", original);

        if (vector2i.y == 0) {
            if (!HorizontalScrollingFix.manager.getConfig().horizontalScrollingEnabled) {
                return 0;
            } else if (HorizontalScrollingFix.manager.getConfig().horizontalScrollingDirectionReversed) {
                return -1 * original;
            }
        }

        return original;
    }
}
