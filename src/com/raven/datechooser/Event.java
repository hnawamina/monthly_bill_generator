package com.raven.datechooser;

import java.awt.event.MouseEvent;

/**
 *
 * @author Administrator
 */
public interface Event {

    /**
     *
     * @param evt
     * @param num
     */
    public void execute(MouseEvent evt, int num);
}
