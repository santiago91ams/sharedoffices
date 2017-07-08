package android.sharedoffices.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Alin on 08/07/2017.
 */

public class AppPreferences{

    private SharedPreferences prefs;

    public AppPreferences(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

}
