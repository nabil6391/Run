package com.shohozapps.run.injection.components;

import com.shohozapps.run.injection.modules.EditActivityModule;
import com.shohozapps.run.injection.scopes.EditActivityScope;
import com.shohozapps.run.views.EditActivity;

import dagger.Subcomponent;

@EditActivityScope
@Subcomponent(modules = EditActivityModule.class)
public interface EditActivityComponent {
    void inject(EditActivity view);
}
