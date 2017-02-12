package org.liquidengine.legui.event;

import org.joml.Vector2f;
import org.liquidengine.legui.component.Component;
import org.liquidengine.legui.component.Frame;

/**
 * Created by Aliaksandr_Shcherbin on 2/9/2017.
 */
public class MouseDragEvent extends AbstractEvent {

    private final Vector2f delta;

    public MouseDragEvent(Component controller, Frame frame, Vector2f delta) {
        super(controller, frame);
        this.delta = delta;
    }

    public Vector2f getDelta() {
        return delta;
    }
}