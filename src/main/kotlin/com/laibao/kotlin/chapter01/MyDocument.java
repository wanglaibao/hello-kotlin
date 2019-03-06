package com.laibao.kotlin.chapter01;

import org.jetbrains.annotations.NotNull;

import java.io.InputStream;
import java.io.OutputStream;

public class MyDocument implements Document{

    public long getVersion() {
        return 0;
    }

    public long getSize() {
        return 0;
    }

    public void save(@NotNull InputStream input) {

    }

    public void load(@NotNull OutputStream stream) {

    }

    @NotNull
    public String getName() {
        return null;
    }

    @NotNull
    public String getDescription() {
        return null;
    }
}
