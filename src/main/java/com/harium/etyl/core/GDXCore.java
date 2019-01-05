package com.harium.etyl.core;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.assets.AssetManager;
import com.harium.etyl.commons.context.Context;
import com.harium.etyl.commons.context.Session;
import com.harium.etyl.commons.context.load.LoaderListener;
import com.harium.etyl.commons.module.Module;

/**
 * Placeholder of GDXCore
 */
public class GDXCore extends ApplicationAdapter implements InputProcessor, LoaderListener<Context> {

    AssetManager assets;
    Session session = new Session();

    public GDXCore(int w, int h) {

    }

    public Session getSession() {
        return session;
    }

    public AssetManager getAssets() {
        return assets;
    }

    public boolean keyDown(int keycode) {
        return false;
    }

    public boolean keyUp(int keycode) {
        return false;
    }

    public boolean keyTyped(char character) {
        return false;
    }

    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    public boolean scrolled(int amount) {
        return false;
    }

    public void onLoad(Context context) {

    }

    public void addModule(Module module) {

    }
}
