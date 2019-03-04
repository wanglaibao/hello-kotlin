package com.laibao.kotlin.chapter01;

import org.jetbrains.annotations.NotNull;

import java.io.InputStream;
import java.io.OutputStream;

public class MyDocument implements Document{

    @Override
    public long getVersion() {
        return 0;
    }

    @Override
    public long getSize() {
        return 0;
    }

    @Override
    public void save(@NotNull InputStream input) {

    }

    @Override
    public void load(@NotNull OutputStream stream) {

    }

    @NotNull
    @Override
    public String getName() {
        return null;
    }

    @NotNull
    @Override
    public String getDescription() {
        return null;
    }
}
