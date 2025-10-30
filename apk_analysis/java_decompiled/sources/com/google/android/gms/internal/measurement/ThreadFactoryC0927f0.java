package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0927f0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f15482a = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f15482a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
