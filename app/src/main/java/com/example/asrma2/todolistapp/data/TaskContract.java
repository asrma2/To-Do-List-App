package com.example.asrma2.todolistapp.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by asrma2 on 2/4/18.
 */

public class TaskContract {

    public static final String AUTHORITY = "com.example.asrma2.todolistapp";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + AUTHORITY);

    public static final String PATH_TASKS = "tasks";

    public static final class TaskEntry implements BaseColumns {

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_TASKS).build();

        public static final String TABLE_NAME = "tasks";

        public static final String COLUMN_DESCRIPTION = "description";

        public static final String COLUMN_PRIORITY = "priority";

        public static final String COLUMN_DATE = "date";

    }

}
