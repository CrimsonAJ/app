package com.google.firebase.messaging;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;
import java.lang.invoke.MethodHandles;

/* renamed from: com.google.firebase.messaging.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1059e {
    public static /* synthetic */ NotificationChannel A(String str) {
        return new NotificationChannel("cast_media_notification", str, 2);
    }

    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ NotificationChannel e(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }

    public static /* synthetic */ AudioFocusRequest.Builder i(int i9) {
        return new AudioFocusRequest.Builder(i9);
    }

    public static /* synthetic */ AudioFocusRequest.Builder j(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return MethodHandles.Lookup.class;
    }

    public static /* bridge */ /* synthetic */ MethodHandles.Lookup n(Object obj) {
        return (MethodHandles.Lookup) obj;
    }

    public static /* synthetic */ void p() {
    }
}
