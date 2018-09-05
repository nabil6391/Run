package com.shohozapps.run.data;

import com.shohozapps.run.models.Run;
import com.shohozapps.run.models.RunLatLng;
import com.shohozapps.run.models.RunWithLatLng;

import java.util.List;

public interface RunDataSource {

    void getRuns(LoadRunsCallback callback);

    void getRunById(Long runId, GetRunCallback callback);

    void saveRun(Run run, List<RunLatLng> runLatLngList, SaveRunCallback callback);

    void updateRun(RunWithLatLng run);

    void deleteRun(Run run, DeleteRunCallback callback);

    interface LoadRunsCallback {
        void onRunsLoaded(List<RunWithLatLng> runs);

        void onDataNotAvailable();
    }

    interface GetRunCallback {
        void onRunLoaded(RunWithLatLng run);

        void onDataNotAvailable();
    }

    interface SaveRunCallback {
        void onRunSaved(Long runId);
    }

    interface DeleteRunCallback {
        void onRunDeleted();
    }
}
