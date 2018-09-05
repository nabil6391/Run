package com.shohozapps.run.injection.components;


import com.shohozapps.run.injection.modules.MainActivityModule;
import com.shohozapps.run.injection.modules.MainPresenterModule;
import com.shohozapps.run.injection.scopes.MainActivityScope;
import com.shohozapps.run.views.MainActivity;

import dagger.Subcomponent;

@MainActivityScope
@Subcomponent(modules = {MainActivityModule.class, MainPresenterModule.class})
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
