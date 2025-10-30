package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import Y2.j;
import Y2.s;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.y;
import android.util.Base64;
import e3.f;
import i3.AbstractC1379a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14496a = 0;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i9 = intent.getExtras().getInt("attemptNumber");
        s.b(context);
        y a5 = j.a();
        a5.V(queryParameter);
        a5.f9333d = AbstractC1379a.b(intValue);
        if (queryParameter2 != null) {
            a5.f9332c = Base64.decode(queryParameter2, 0);
        }
        e3.j jVar = s.a().f8656d;
        j B9 = a5.B();
        ?? obj = new Object();
        jVar.getClass();
        jVar.f17175e.execute(new f(jVar, B9, i9, obj));
    }
}
