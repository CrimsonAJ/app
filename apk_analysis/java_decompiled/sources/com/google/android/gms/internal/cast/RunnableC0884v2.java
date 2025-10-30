package com.google.android.gms.internal.cast;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* renamed from: com.google.android.gms.internal.cast.v2 */
/* loaded from: classes.dex */
public final class RunnableC0884v2 extends AbstractOwnableSynchronizer implements Runnable {

    /* renamed from: a */
    public final C2 f15072a;

    public /* synthetic */ RunnableC0884v2(C2 c22) {
        this.f15072a = c22;
    }

    public static /* synthetic */ void a(RunnableC0884v2 runnableC0884v2, Thread thread) {
        runnableC0884v2.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.f15072a.toString();
    }
}
