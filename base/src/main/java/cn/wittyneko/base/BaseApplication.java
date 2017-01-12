package cn.wittyneko.base;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.support.multidex.MultiDex;

/**
 * Created by wittytutu on 17-1-12.
 */

public class BaseApplication extends Application {

    public static Context appContext;
    public static Handler appHandle;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
        if (appHandle == null) {
            appHandle = new Handler();
        }
    }
}
