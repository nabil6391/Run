package com.shohozapps.run.contracts;


public interface RunPreferencesContract {
    interface Activity {
        void restartActivity();

        void endActivityResultCancelled();

        void endActivityResultOK();

        void registerSharedPreferencesListener();

        void unregisterSharedPreferencesListener();
    }

    interface Presenter {
        void onActivityResumed();

        void onActivityPaused();

        void onBackPressed();

        void onDistanceUnitsChanged();

        void onThemeChanged();
    }
}
