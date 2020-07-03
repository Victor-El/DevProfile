package me.codeenzyme.devprofile.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import me.codeenzyme.devprofile.data.local.model.Profile;

@Database(entities = {Profile.class}, version = 1, exportSchema = false)
public abstract class DevDatabase extends RoomDatabase {
    public abstract DevDao devDao();
}
