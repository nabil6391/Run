package com.shohozapps.run.injection.modules;

import com.shohozapps.run.data.AppDatabase;
import com.shohozapps.run.data.RunDataSource;
import com.shohozapps.run.data.RunLocalDataSource;
import com.shohozapps.run.data.RunRepository;
import com.shohozapps.run.data.dao.RunDAO;
import com.shohozapps.run.data.dao.RunDAO_Impl;
import com.shohozapps.run.data.dao.RunLatLngDAO;
import com.shohozapps.run.data.dao.RunLatLngDAO_Impl;
import com.shohozapps.run.util.MainThreadExecutor;

import java.util.concurrent.Executor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RunRepositoryModule {
    @Provides
    @Singleton
    RunRepository providesRunRepository(RunDataSource runDataSource) {
        return new RunRepository(runDataSource);
    }

    @Provides
    @Singleton
    RunDataSource providesRunLocalDataSource(Executor executor, RunDAO runDao, RunLatLngDAO runLatLngDAO) {
        return new RunLocalDataSource(executor, runDao, runLatLngDAO);
    }

    @Provides
    Executor providesExecutor() {
        return new MainThreadExecutor();
    }

    @Provides
    @Singleton
    RunDAO providesRunDao(AppDatabase appDatabase) {
        return new RunDAO_Impl(appDatabase);
    }

    @Provides
    @Singleton
    RunLatLngDAO providesRunLatLngDao(AppDatabase appDatabase) {
        return new RunLatLngDAO_Impl(appDatabase);
    }
}
