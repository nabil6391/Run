package com.shohozapps.run.injection.components;


import com.shohozapps.run.App;
import com.shohozapps.run.injection.modules.AppModule;
import com.shohozapps.run.injection.modules.AudioCueServiceModule;
import com.shohozapps.run.injection.modules.DetailsActivityModule;
import com.shohozapps.run.injection.modules.EditActivityModule;
import com.shohozapps.run.injection.modules.HandlerModule;
import com.shohozapps.run.injection.modules.MainActivityModule;
import com.shohozapps.run.injection.modules.RunActivityContextModule;
import com.shohozapps.run.injection.modules.RunActivityModule;
import com.shohozapps.run.injection.modules.RunPreferencesActivityModule;
import com.shohozapps.run.injection.modules.RunPreferencesFragmentModule;
import com.shohozapps.run.injection.modules.RunRepositoryModule;
import com.shohozapps.run.injection.modules.StringFormatterModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, HandlerModule.class, RunRepositoryModule.class, StringFormatterModule.class})
public interface AppComponent {
    void inject(App app);

    AudioCueServiceComponent plus(AudioCueServiceModule audioCueServiceModule);

    DetailsActivityComponent plus(DetailsActivityModule detailsActivityModule);

    EditActivityComponent plus(EditActivityModule editActivityModule);

    MainActivityComponent plus(MainActivityModule mainActivityModule);

    RunActivityComponent plus(RunActivityModule activityModule, RunActivityContextModule contextModule);

    RunPreferencesActivityComponent plus(RunPreferencesActivityModule runPreferencesActivityModule);

    RunPreferencesFragmentComponent plus(RunPreferencesFragmentModule runPreferencesFragmentModule);
}
