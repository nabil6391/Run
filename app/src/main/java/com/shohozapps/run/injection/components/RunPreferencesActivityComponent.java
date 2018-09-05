package com.shohozapps.run.injection.components;

import com.shohozapps.run.injection.modules.RunPreferencesActivityModule;
import com.shohozapps.run.injection.scopes.RunPreferencesScope;
import com.shohozapps.run.views.RunPreferencesActivity;

import dagger.Subcomponent;

@RunPreferencesScope
@Subcomponent(modules = {RunPreferencesActivityModule.class})
public interface RunPreferencesActivityComponent {
    void inject(RunPreferencesActivity activity);
}
