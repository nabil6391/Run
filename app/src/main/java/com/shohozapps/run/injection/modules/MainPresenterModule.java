package com.shohozapps.run.injection.modules;


import com.shohozapps.run.contracts.MainContract;
import com.shohozapps.run.injection.scopes.MainActivityScope;
import com.shohozapps.run.presenters.MainPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainPresenterModule {
    @Provides
    @MainActivityScope
    MainContract.Presenter providesMainPresenter(MainContract.Activity activity) {
        return new MainPresenter(activity);
    }
}
