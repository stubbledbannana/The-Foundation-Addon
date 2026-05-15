package com.foundation.hud;

import com.foundation.FoundationAddon;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class THCHud extends HudElement {
    /**
     * The {@code name} parameter should be in kebab-case.
     */
    public static final HudElementInfo<FoundationHud> INFO = new HudElementInfo<>(FoundationAddon.HUD_GROUP, "foundation", "Foundation HUD element.", FoundationHud::new);

    public FoundationHud() {
        super(INFO);
    }

    @Override
    public void render(HudRenderer renderer) {
        setSize(renderer.textWidth("Foundation element", true), renderer.textHeight(true));

        // Render background
        renderer.quad(x, y, getWidth(), getHeight(), Color.LIGHT_GRAY);

        // Render text
        renderer.text("Foundation element", x, y, Color.WHITE, true);
    }
}
