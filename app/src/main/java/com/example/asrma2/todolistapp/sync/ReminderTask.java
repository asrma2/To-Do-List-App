package com.example.asrma2.todolistapp.sync;

import android.content.Context;

import com.example.asrma2.todolistapp.utilities.NotificationUtils;
import com.example.asrma2.todolistapp.utilities.PreferenceUtilities;

/**
 * Created by asrma2 on 8/4/18.
 */

public class ReminderTask {

    public static final String ACTION_MOVE_TODO = "move-todo";
    public static final String ACTION_DISMISS_NOTIFICATION = "dismiss-notification";
    public static final String ACTION_SEND_NOTIFICATION = "send-notification";

    public static void executeTask(Context context, String action) {
        if (ACTION_MOVE_TODO.equals(action)) {
            moveToDo(context);
        } else if (ACTION_DISMISS_NOTIFICATION.equals(action)) {
            deleteToDo(context);
        } else if (ACTION_SEND_NOTIFICATION.equals(action)) {
            sendNotification(context);
        }
    }

    private static void moveToDo(Context context) {
        PreferenceUtilities.incrementWaterCount(context);
        NotificationUtils.clearAllNotifications(context);
    }

    private static void deleteToDo(Context context) {
        PreferenceUtilities.incrementChargingReminderCount(context);
        NotificationUtils.clearAllNotifications(context);
    }

    private static void sendNotification(Context context) {
        PreferenceUtilities.incrementChargingReminderCount(context);
        NotificationUtils.remindUserBecauseDateChanged(context);
    }

}
