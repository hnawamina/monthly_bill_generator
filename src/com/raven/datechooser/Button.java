package com.raven.datechooser;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author Administrator
 */
public final class Button extends JButton {

    /**
     *
     * @return
     */
    public boolean isPaintBackground() {
        return paintBackground;
    }

    /**
     *
     * @param paintBackground
     */
    public void setPaintBackground(boolean paintBackground) {
        this.paintBackground = paintBackground;
    }

    private Event event;
    private boolean paintBackground = true;
    private Color colorSelected;

    /**
     *
     */
    public Button() {
        setBorder(null);
        setContentAreaFilled(false);
        setFocusable(false);
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (!getText().equals("") && getName() != null) {
                    if (getName().equals("day") || getName().equals("year")) {
                        event.execute(me, Integer.valueOf(getText()));
                    } else {
                        event.execute(me, Integer.valueOf(getName()));
                    }
                    setBackground(getColorSelected());
                    setForeground(new Color(255, 255, 255));
                }
            }
        });
    }

    /**
     *
     * @return
     */
    public Event getEvent() {
        return event;
    }

    /**
     *
     * @param event
     */
    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public void paint(Graphics grphcs) {
        if (paintBackground) {
            int width = getWidth();
            int height = getHeight();
            int size = Math.min(width, height);
            int x = (width - size) / 2;
            int y = (height - size) / 2;
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillOval(x, y, size, size);
        }
        super.paint(grphcs);
    }

    /**
     *
     * @return
     */
    public Color getColorSelected() {
        return colorSelected;
    }

    /**
     *
     * @param colorSelected
     */
    public void setColorSelected(Color colorSelected) {
        this.colorSelected = colorSelected;
    }
}
