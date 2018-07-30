package com.harium.etyl.loader;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoaderTest {

    Loader loader;

    @Before
    public void setUp() {
        loader = new Loader();
    }

    @Test
    public void testSetUrl() {
        String url = "ABC";

        loader.setUrl(url);
        Assert.assertEquals(url, loader.url);
    }

}
