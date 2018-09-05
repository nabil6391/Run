package com.shohozapps.run.injection.modules;


import android.content.Context;

import com.shohozapps.run.injection.scopes.RunningActivityScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class RunActivityContextModule {
    private final Context context;

    public RunActivityContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @Named("activity_context")
    @RunningActivityScope
    Context providesContext() {
        return context;
    }
}
