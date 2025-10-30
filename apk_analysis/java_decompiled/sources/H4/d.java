package H4;

import D4.t;
import F4.AbstractC0129h;
import F4.n;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b6.C0693o;

/* loaded from: classes.dex */
public final class d extends AbstractC0129h {

    /* renamed from: A, reason: collision with root package name */
    public final n f3110A;

    public d(Context context, Looper looper, C0693o c0693o, n nVar, t tVar, t tVar2) {
        super(context, looper, 270, c0693o, tVar, tVar2);
        this.f3110A = nVar;
    }

    @Override // F4.AbstractC0126e, C4.c
    public final int f() {
        return 203400000;
    }

    @Override // F4.AbstractC0126e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new S4.a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // F4.AbstractC0126e
    public final B4.d[] q() {
        return T4.b.f7207b;
    }

    @Override // F4.AbstractC0126e
    public final Bundle s() {
        n nVar = this.f3110A;
        nVar.getClass();
        Bundle bundle = new Bundle();
        String str = nVar.f2433a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // F4.AbstractC0126e
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // F4.AbstractC0126e
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // F4.AbstractC0126e
    public final boolean x() {
        return true;
    }
}
