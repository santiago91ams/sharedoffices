package android.sharedoffices.app;

import android.app.Application;

/**
 * Created by Alin on 08/07/2017.
 */

public class App extends Application {

    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }


    public static App getInstance() {
        return instance;
    }
}
