package com.shohozapps.run.injection.components;

import com.shohozapps.run.injection.modules.RunPreferencesFragmentModule;
import com.shohozapps.run.injection.scopes.RunPreferencesFragmentScope;
import com.shohozapps.run.views.RunPreferencesFragment;

import dagger.Subcomponent;

@RunPreferencesFragmentScope
@Subcomponent(modules = {RunPreferencesFragmentModule.class})
public interface RunPreferencesFragmentComponent {
    void inject(RunPreferencesFragment fragment);
}
