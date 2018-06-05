package ga.westpoint.appupdatetest;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefUtils {
    public static final String PREFS_FILE_NAME = "PREFS_FILE_NAME";
    public static void firstTimeAskingPermission(Context context, String permission, boolean isFirstTime){
        SharedPreferences sharedPreference = context.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        sharedPreference.edit().putBoolean(permission, isFirstTime).apply();
    }

    public static boolean isFirstTimeAskingPermission(Context context, String permission){
        return context.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE).getBoolean(permission, true);
    }
}
