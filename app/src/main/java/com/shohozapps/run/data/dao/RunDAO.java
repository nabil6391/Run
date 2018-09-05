package com.shohozapps.run.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;
import android.arch.persistence.room.Update;

import com.shohozapps.run.models.Run;
import com.shohozapps.run.models.RunWithLatLng;

import java.util.List;

@Dao
public interface RunDAO {
    @Transaction
    @Query("SELECT * FROM runs WHERE id LIKE :id")
    RunWithLatLng findById(String id);

    @Transaction
    @Query("SELECT * FROM runs ORDER BY dateTime DESC")
    List<RunWithLatLng> loadRunWithLatLng();

    @Insert
    void insertAll(List<Run> runs);

    @Insert
    long insert(Run run);

    @Update
    void update(Run run);

    @Delete
    void delete(Run run);
}
