package com.sourcery.wallpapers;

import android.app.Activity;
import android.app.WallpaperManager;
import android.os.Bundle;

public class NoWallpaper extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
        try {
            WallpaperManager wm = WallpaperManager.getInstance(this);
            wm.setResource(R.drawable.black);
        } catch (java.io.IOException e) {
        }
    }
}