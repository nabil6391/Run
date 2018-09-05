package com.shohozapps.run.injection.components;


import com.shohozapps.run.injection.modules.DetailsActivityModule;
import com.shohozapps.run.injection.modules.DetailsPresenterModule;
import com.shohozapps.run.injection.scopes.DetailsActivityScope;
import com.shohozapps.run.views.DetailsActivity;

import dagger.Subcomponent;

@DetailsActivityScope
@Subcomponent(modules = {DetailsActivityModule.class, DetailsPresenterModule.class})
public interface DetailsActivityComponent {
    void inject(DetailsActivity detailsActivity);
}
