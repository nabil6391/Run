package com.shohozapps.run.injection.modules;

import android.content.Context;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.shohozapps.run.contracts.RunContract;
import com.shohozapps.run.injection.scopes.RunningActivityScope;
import com.shohozapps.run.models.Run;
import com.shohozapps.run.models.RunLatLng;
import com.shohozapps.run.services.RunService;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class RunServiceModule {
    @Provides
    @RunningActivityScope
    RunContract.RunService providesRunService(@Named("activity_context") Context context,
                                              DecimalFormat df,
                                              RunContract.Activity view,
                                              Run model,
                                              List<RunLatLng> runLatLngs,
                                              FusedLocationProviderClient locationClient,
                                              LocationRequest locationRequest,
                                              LocationSettingsRequest.Builder builder) {

        return new RunService(context, df, view, model, runLatLngs, locationClient, locationRequest, builder);
    }

    @Provides
    @RunningActivityScope
    List<RunLatLng> providesRunLatLngList() {
        return new ArrayList<>();
    }

    @Provides
    FusedLocationProviderClient providesFusedLocationProviderClient(@Named("activity_context") Context context) {
        return new FusedLocationProviderClient(context);
    }

    @Provides
    LocationRequest providesLocationRequest() {
        return new LocationRequest();
    }

    @Provides
    LocationSettingsRequest.Builder providesBuilder() {
        return new LocationSettingsRequest.Builder();
    }

    @Provides
    DecimalFormat providesDecimalFormat() {
        return new DecimalFormat("#0.00");
    }
}
