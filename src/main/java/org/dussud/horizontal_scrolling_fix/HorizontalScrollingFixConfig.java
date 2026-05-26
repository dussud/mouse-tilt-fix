package org.dussud.horizontal_scrolling_fix;

import java.io.Serializable;

public class HorizontalScrollingFixConfig implements Serializable {
    public boolean isHorizontalScrollingEnabled() {
        return horizontalScrollingEnabled;
    }

    public boolean isHorizontalScrollingDirectionReversed() {
        return horizontalScrollingDirectionReversed;
    }

    public void enableHorizontalScrolling(boolean horizontalScrollingEnabled) {
        this.horizontalScrollingEnabled = horizontalScrollingEnabled;
    }

    public void reverseHorizontalScrollingDirection(boolean reverseHorizontalScrollingDirection) {
        this.horizontalScrollingDirectionReversed = reverseHorizontalScrollingDirection;
    }

    public boolean horizontalScrollingEnabled = false;
    public boolean horizontalScrollingDirectionReversed =  true;
}
