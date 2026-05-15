package com.foundation;

import com.foundation.hud.FoundationHud;
import com.foundation.modules.ArmorNotify;
import com.foundation.modules.AntiFeetPlace;
import com.foundation.modules.AutoPortal;
import com.foundation.modules.SurroundPlus;
import com.foundation.modules.NoJumpDelay;
import com.foundation.modules.Phase;
import com.foundation.modules.DiscordNotifs;
import com.foundation.modules.AntiAnnouncement;
import com.foundation.modules.AutoFuckModule;
import com.foundation.modules.NewChunks;
import com.foundation.modules.BetterLocator;
import com.foundation.modules.AutoLogin;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

    public class FoundationAddon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Foundation");
    public static final HudGroup HUD_GROUP = new HudGroup("Foundation");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Foundation Addon");

        // Modules
        Modules.get().add(new ArmorNotify());
        Modules.get().add(new AntiFeetPlace());
        Modules.get().add(new AutoPortal());
        Modules.get().add(new SurroundPlus());
        Modules.get().add(new NoJumpDelay());
        Modules.get().add(new Phase());
        Modules.get().add(new DiscordNotifs());
        Modules.get().add(new AntiAnnouncement());
        Modules.get().add(new AutoFuckModule());
        Modules.get().add(new NewChunks());
        Modules.get().add(new BetterLocator());
        Modules.get().add(new AutoLogin());

        // HUD
        Hud.get().register(FoundationHud.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.foundation";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("StubbledBannana", "foundation-addon");
    }
}
