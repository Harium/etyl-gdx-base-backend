package com.harium.etyl;

public abstract class DesktopEngine<T> {

    protected int w;
    protected int h;

    public DesktopEngine(int w, int h) {
        super();

        this.w = w;
        this.h = h;
    }

    public void init() {

    }

    public abstract T initCore();

    public abstract void setTitle(String title);

    public abstract void setIcon(String icon);

    public abstract void enableFullScreen();

    public abstract void disableFullScreen();
}
