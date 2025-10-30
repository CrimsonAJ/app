package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class T implements C4.o {

    /* renamed from: a, reason: collision with root package name */
    public final P f14764a;

    public T(P p9) {
        this.f14764a = p9;
    }

    @Override // C4.o
    public final Status d() {
        return Status.f14655e;
    }

    public final String toString() {
        P p9 = this.f14764a;
        F4.y.h(p9);
        boolean z9 = true;
        if (p9.f14756a != 1) {
            z9 = false;
        }
        return "OptInOptionsResultImpl[" + z9 + "]";
    }
}
