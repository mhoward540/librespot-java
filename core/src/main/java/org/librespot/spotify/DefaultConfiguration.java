package org.librespot.spotify;

import org.jetbrains.annotations.NotNull;
import org.librespot.spotify.player.Player;

import java.io.File;

/**
 * @author Gianlu
 */
public final class DefaultConfiguration extends AbsConfiguration {

    //****************//
    //---- PLAYER ----//
    //****************//

    @NotNull
    @Override
    public Player.AudioQuality preferredQuality() {
        return Player.AudioQuality.VORBIS_320;
    }

    @Override
    public float normalisationPregain() {
        return 0;
    }

    @Override
    public boolean pauseWhenLoading() {
        return false;
    }

    //****************//
    //---- CACHE -----//
    //****************//

    @Override
    public boolean cacheEnabled() {
        return true;
    }

    @Override
    public @NotNull File cacheDir() {
        return new File("./cache/");
    }

    @Override
    public boolean doCleanUp() {
        return true;
    }
}