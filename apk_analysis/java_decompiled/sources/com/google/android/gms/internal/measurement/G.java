package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class G extends AbstractBinderC1015x implements L {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f15215e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15216f;

    public G() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f15215e = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L38
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L38
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected object type. Expected, Received: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L38:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.G.Q(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1015x
    public final boolean d(int i9, Parcel parcel, Parcel parcel2) {
        if (i9 == 1) {
            Bundle bundle = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
            AbstractC1020y.b(parcel);
            v0(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public final Bundle g(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f15215e;
        synchronized (atomicReference) {
            if (!this.f15216f) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f15215e.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void v0(Bundle bundle) {
        AtomicReference atomicReference = this.f15215e;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f15216f = true;
                } finally {
                    this.f15215e.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
