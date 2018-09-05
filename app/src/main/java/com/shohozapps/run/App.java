package com.shohozapps.run;

import android.app.Application;

import com.google.android.gms.maps.MapsInitializer;
import com.shohozapps.run.injection.components.AppComponent;
import com.shohozapps.run.injection.components.DaggerAppComponent;
import com.shohozapps.run.injection.modules.AppModule;

import timber.log.Timber;

public class App extends Application {
    public static final int GPS_ACCURACY_BAD_THRESHOLD = 20;
    public static final int GPS_ACCURACY_GOOD_THRESHOLD = 10;

    private static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        // initialize Google Maps API classes here to reduce load time when selecting
        // first DetailsActivity
        MapsInitializer.initialize(this);

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        appComponent.inject(this);
    }
}
