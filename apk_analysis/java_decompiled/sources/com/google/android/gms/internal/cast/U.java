package com.google.android.gms.internal.cast;

import F4.AbstractC0129h;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import b6.C0693o;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class U extends AbstractC0129h {

    /* renamed from: A, reason: collision with root package name */
    public final AtomicReference f14775A;

    public U(Context context, Looper looper, C0693o c0693o, D4.t tVar, D4.t tVar2) {
        super(context, looper, 41, c0693o, tVar, tVar2);
        this.f14775A = new AtomicReference();
    }

    @Override // F4.AbstractC0126e
    public final boolean A() {
        return true;
    }

    @Override // F4.AbstractC0126e, C4.c
    public final int f() {
        return 12600000;
    }

    @Override // F4.AbstractC0126e, C4.c
    public final void l() {
        try {
        } catch (RemoteException e8) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e8);
        }
        if (this.f14775A.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        super.l();
    }

    @Override // F4.AbstractC0126e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        if (queryLocalInterface instanceof S) {
            return (S) queryLocalInterface;
        }
        return new S4.a(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService", 3);
    }

    @Override // F4.AbstractC0126e
    public final B4.d[] q() {
        return J.f14729b;
    }

    @Override // F4.AbstractC0126e
    public final String v() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // F4.AbstractC0126e
    public final String w() {
        return "com.google.android.gms.usagereporting.service.START";
    }
}
