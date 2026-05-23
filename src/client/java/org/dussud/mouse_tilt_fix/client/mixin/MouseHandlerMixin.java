package org.dussud.mouse_tilt_fix.client.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.MouseHandler;
import org.dussud.mouse_tilt_fix.MouseTiltFix;
import org.joml.Vector2i;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(MouseHandler.class)
public class MouseHandlerMixin {
    @ModifyVariable(method = "onScroll", at = @At(value = "STORE"), index = 15, ordinal = 0)
    private int modifyOnScrollI(int original, @Local Vector2i vector2i) {
        MouseTiltFix.LOGGER.debug("Original scroll vector vector2i = {}", vector2i);
        MouseTiltFix.LOGGER.debug("Original scroll value i = {}", original);

        if (vector2i.y == 0) {
            if (!MouseTiltFix.manager.getConfig().lateralScrollingEnabled) {
                return 0;
            } else if (MouseTiltFix.manager.getConfig().reverseLateralScrollingDirection) {
                return -1 * original;
            }
        }

        return original;
    }
}
