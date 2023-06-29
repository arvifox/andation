package com.arvifox.andation.intent

fun restartApplication(ctx: Context) {
        launchIntent = ctx.getPackageManager().getLaunchIntentForPackage(ctx.getPackageName())
        pendingStartIntent = PendingIntent
                .getActivity(ctx, 0, launchIntent, PendingIntent.FLAG_UPDATE_CURRENT)

        mgr = (AlarmManager) ctx.getSystemService(Context.ALARM_SERVICE)
        mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 1000, pendingStartIntent)
        System.exit(2)
    }
    