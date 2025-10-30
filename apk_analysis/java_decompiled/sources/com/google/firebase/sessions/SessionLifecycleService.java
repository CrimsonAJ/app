package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import i7.b0;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final HandlerThread f16547a = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: b, reason: collision with root package name */
    public b0 f16548b;

    /* renamed from: c, reason: collision with root package name */
    public Messenger f16549c;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Messenger messenger;
        Object parcelableExtra;
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
            messenger = (Messenger) parcelableExtra;
        } else {
            messenger = (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        }
        if (messenger != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = messenger;
            b0 b0Var = this.f16548b;
            if (b0Var != null) {
                b0Var.sendMessage(obtain);
            }
        }
        Messenger messenger2 = this.f16549c;
        if (messenger2 == null) {
            return null;
        }
        return messenger2.getBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.f16547a;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        h.d(looper, "handlerThread.looper");
        this.f16548b = new b0(looper);
        this.f16549c = new Messenger(this.f16548b);
        Log.d("SessionLifecycleService", "Service created on process " + Process.myPid());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f16547a.quit();
    }
}
