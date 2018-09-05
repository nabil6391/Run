package com.shohozapps.run.injection.modules;

import com.shohozapps.run.contracts.RunPreferencesFragmentContract;
import com.shohozapps.run.injection.scopes.RunPreferencesFragmentScope;
import com.shohozapps.run.presenters.RunPreferencesFragmentPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class RunPreferencesFragmentModule {
    private RunPreferencesFragmentContract.Fragment fragment;

    public RunPreferencesFragmentModule(RunPreferencesFragmentContract.Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    @RunPreferencesFragmentScope
    RunPreferencesFragmentContract.Fragment provideFragment() {
        return fragment;
    }

    @Provides
    @RunPreferencesFragmentScope
    RunPreferencesFragmentContract.Presenter providePresenter(RunPreferencesFragmentContract.Fragment fragment) {
        return new RunPreferencesFragmentPresenter(fragment);
    }
}
