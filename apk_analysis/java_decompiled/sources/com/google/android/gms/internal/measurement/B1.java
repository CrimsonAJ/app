package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* loaded from: classes.dex */
public final class B1 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        J1.f15233i.incrementAndGet();
    }
}
