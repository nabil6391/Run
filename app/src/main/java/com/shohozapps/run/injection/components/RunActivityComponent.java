package com.shohozapps.run.injection.components;

import com.shohozapps.run.injection.modules.RunActivityContextModule;
import com.shohozapps.run.injection.modules.RunActivityModule;
import com.shohozapps.run.injection.modules.RunPresenterModule;
import com.shohozapps.run.injection.modules.RunServiceModule;
import com.shohozapps.run.injection.scopes.RunningActivityScope;
import com.shohozapps.run.presenters.RunPresenter;
import com.shohozapps.run.services.RunService;
import com.shohozapps.run.views.RunActivity;

import dagger.Subcomponent;

@RunningActivityScope
@Subcomponent(modules = {
        RunActivityContextModule.class,
        RunActivityModule.class,
        RunPresenterModule.class,
        RunServiceModule.class,
})
public interface RunActivityComponent {
    void inject(RunActivity activity);

    void inject(RunPresenter presenter);

    void inject(RunService service);
}
