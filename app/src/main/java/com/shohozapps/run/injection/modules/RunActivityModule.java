package com.shohozapps.run.injection.modules;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.util.TypedValue;

import com.shohozapps.run.R;
import com.shohozapps.run.contracts.RunContract;
import com.shohozapps.run.injection.scopes.RunningActivityScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class RunActivityModule {
    private RunContract.Activity activity;

    public RunActivityModule(RunContract.Activity activity) {
        this.activity = activity;
    }

    @Provides
    @RunningActivityScope
    RunContract.Activity providesActivity() {
        return activity;
    }

    @Provides
    Intent providesIntent() {
        return new Intent();
    }

    @Provides
    @RunningActivityScope
    NotificationCompat.Builder providesNotificationCompatBuilder(@Named("activity_context") Context context) {
        return new NotificationCompat.Builder(
                context, context.getString(R.string.notification_channel_id)
        );
    }

    @Provides
    @RunningActivityScope
    NotificationManagerCompat providesNotificationManagerCompat(@Named("activity_context") Context context) {
        return NotificationManagerCompat.from(context);
    }

    @Provides
    @RunningActivityScope
    TypedValue providesTypedValue() {
        return new TypedValue();
    }
}
