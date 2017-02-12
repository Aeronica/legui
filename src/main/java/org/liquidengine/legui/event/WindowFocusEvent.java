package org.liquidengine.legui.event;

import org.liquidengine.legui.component.Component;
import org.liquidengine.legui.component.Frame;

/**
 * Created by ShchAlexander on 03.02.2017.
 */
public class WindowFocusEvent extends AbstractEvent {
    private final boolean focused;

    public WindowFocusEvent(Component controller, Frame frame, boolean focused) {
        super(controller, frame);
        this.focused = focused;
    }

    public boolean isFocused() {
        return focused;
    }

}