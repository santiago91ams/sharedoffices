package android.sharedoffices.app;


import android.sharedoffices.model.User;

/**
 * Created by Alin on 08/07/2017.
 */

public class AppState {

    private static User currentUser;

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User currentUser) {
        AppState.currentUser = currentUser;
    }
}
