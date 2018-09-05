package com.shohozapps.run.injection.modules;

import com.shohozapps.run.contracts.DetailsContract;
import com.shohozapps.run.data.RunRepository;
import com.shohozapps.run.injection.scopes.DetailsActivityScope;
import com.shohozapps.run.models.RunLatLng;
import com.shohozapps.run.models.RunWithLatLng;
import com.shohozapps.run.presenters.DetailsPresenter;
import com.shohozapps.run.util.StringFormatter;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

@Module
public class DetailsPresenterModule {
    @Provides
    @DetailsActivityScope
    DetailsContract.Presenter providesDetailsPresenter(DetailsContract.Activity view,
                                                       List<RunLatLng> mapMarkerCoordinates,
                                                       RunRepository runRepository,
                                                       RunWithLatLng run,
                                                       StringFormatter formatter) {
        return new DetailsPresenter(view, mapMarkerCoordinates, runRepository, run, formatter);
    }

    @Provides
    List<RunLatLng> providesArrayList() {
        return new ArrayList<>();
    }

    @Provides
    @DetailsActivityScope
    RunWithLatLng providesRunWithLatLng() {
        return new RunWithLatLng();
    }
}
