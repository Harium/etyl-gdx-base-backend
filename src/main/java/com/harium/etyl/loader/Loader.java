package com.harium.etyl.loader;

import com.badlogic.gdx.assets.AssetManager;

public class Loader {

    AssetManager assets;
    String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAssets(AssetManager assets) {
        this.assets = assets;
    }

    public void dispose() {

    }
}
