package com.shohozapps.run.injection.modules;

import com.shohozapps.run.contracts.RunContract;
import com.shohozapps.run.data.RunRepository;
import com.shohozapps.run.injection.scopes.RunningActivityScope;
import com.shohozapps.run.models.Run;
import com.shohozapps.run.models.RunLatLng;
import com.shohozapps.run.presenters.RunPresenter;
import com.shohozapps.run.util.StringFormatter;

import java.util.Date;
import java.util.List;

import dagger.Module;
import dagger.Provides;

@Module
public class RunPresenterModule {
    @Provides
    @RunningActivityScope
    RunContract.Presenter providePresenter(RunContract.Activity activity,
                                           Run model,
                                           RunContract.RunService runService,
                                           RunRepository runRepository,
                                           List<RunLatLng> runLatLngList,
                                           StringFormatter formatter) {
        return new RunPresenter(activity, model, runService, runRepository, runLatLngList, formatter);
    }

    @Provides
    @RunningActivityScope
    Run providesRun() {
        Run run = new Run();
        run.setDateTime(new Date());

        return run;
    }
}
