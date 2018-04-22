package com.example.asrma2.todolistapp.sync;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * Created by asrma2 on 8/4/18.
 */

public class ToDoIntentService extends IntentService {

    public ToDoIntentService() {
        super("ToDOIntentService");
    }
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        String action = intent.getAction();
        ReminderTask.executeTask(this, action);
    }
}
