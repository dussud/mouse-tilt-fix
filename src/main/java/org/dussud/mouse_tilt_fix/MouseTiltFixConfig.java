package org.dussud.mouse_tilt_fix;

import java.io.Serializable;

public class MouseTiltFixConfig implements Serializable {
    public boolean isLateralScrollingEnabled() {
        return lateralScrollingEnabled;
    }

    public boolean isLateralScrollingDirectionReversed() {
        return reverseLateralScrollingDirection;
    }

    public void enableLateralScrolling(boolean lateralScrollingEnabled) {
        this.lateralScrollingEnabled = lateralScrollingEnabled;
    }

    public void reverseLateralScrollingDirection(boolean reverseLateralScrollingDirection) {
        this.reverseLateralScrollingDirection = reverseLateralScrollingDirection;
    }

    public boolean lateralScrollingEnabled = false;
    public boolean reverseLateralScrollingDirection = true;
}
