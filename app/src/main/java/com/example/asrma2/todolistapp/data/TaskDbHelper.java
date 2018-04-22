package com.example.asrma2.todolistapp.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.asrma2.todolistapp.data.TaskContract.TaskEntry;


/**
 * Created by asrma2 on 2/4/18.
 */

public class TaskDbHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "tasksDb.db";

    private static final int VERSION = 1;

    TaskDbHelper(Context context) {

        super(context, DATABASE_NAME, null, VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        final String CREATE_TABLE = "CREATE TABLE "  + TaskEntry.TABLE_NAME + " (" +
                TaskEntry._ID                + " INTEGER PRIMARY KEY, " +
                TaskEntry.COLUMN_DESCRIPTION + " TEXT NOT NULL, " +
                TaskEntry.COLUMN_PRIORITY    + " INTEGER NOT NULL, " +
                TaskEntry.COLUMN_DATE        + " TEXT NOT NULL);";

        sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TaskEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
}
