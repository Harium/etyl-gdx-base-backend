package com.harium.etyl;

import com.harium.etyl.core.GDXCore;
import com.harium.etyl.loader.Loader;

/**
 * Placeholder of BaseEngine
 */
public abstract class BaseEngine<T> {

    protected int w;
    protected int h;

    protected GDXCore core;

    public BaseEngine(int w, int h) {
        super();

        this.w = w;
        this.h = h;
    }

    public void init() {

    }

    protected void initialSetup(String path) {

    }

    protected void initLoaders() {

    }

    public void addLoader(Loader loader) {

    }

    protected abstract T initCore();

    public abstract void setTitle(String title);

    public abstract void setIcon(String icon);

    public abstract void enableFullScreen();

    public abstract void disableFullScreen();
}
