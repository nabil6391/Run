package com.shohozapps.run.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.shohozapps.run.data.dao.RunDAO;
import com.shohozapps.run.data.dao.RunLatLngDAO;
import com.shohozapps.run.models.Run;
import com.shohozapps.run.models.RunLatLng;

@Database(entities = {Run.class, RunLatLng.class}, version = 4)
@TypeConverters(DateConverter.class)
public abstract class AppDatabase extends RoomDatabase {
    public abstract RunDAO runDAO();

    public abstract RunLatLngDAO runLatLngDAO();
}
