package com.shohozapps.run.injection.modules;

import android.content.Intent;

import com.shohozapps.run.contracts.RunPreferencesContract;
import com.shohozapps.run.injection.scopes.RunPreferencesScope;
import com.shohozapps.run.presenters.RunPreferencesPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class RunPreferencesActivityModule {
    private RunPreferencesContract.Activity activity;

    public RunPreferencesActivityModule(RunPreferencesContract.Activity activity) {
        this.activity = activity;
    }

    @Provides
    @RunPreferencesScope
    RunPreferencesContract.Activity provideActivity() {
        return activity;
    }

    @Provides
    @RunPreferencesScope
    RunPreferencesContract.Presenter providePresenter(RunPreferencesContract.Activity activity) {
        return new RunPreferencesPresenter(activity);
    }

    @Provides
    @RunPreferencesScope
    Intent providesIntent() {
        return new Intent();
    }
}
