package y4;

import F4.AbstractC0129h;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import b6.C0693o;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.cast.C;

/* loaded from: classes.dex */
public final class w extends AbstractC0129h {

    /* renamed from: X, reason: collision with root package name */
    public static final b f25000X = new b("CastClientImplCxless", null);

    /* renamed from: A, reason: collision with root package name */
    public final CastDevice f25001A;

    /* renamed from: B, reason: collision with root package name */
    public final long f25002B;

    /* renamed from: C, reason: collision with root package name */
    public final Bundle f25003C;

    /* renamed from: D, reason: collision with root package name */
    public final String f25004D;

    public w(Context context, Looper looper, C0693o c0693o, CastDevice castDevice, long j, Bundle bundle, String str, D4.t tVar, D4.t tVar2) {
        super(context, looper, 10, c0693o, tVar, tVar2);
        this.f25001A = castDevice;
        this.f25002B = j;
        this.f25003C = bundle;
        this.f25004D = str;
    }

    @Override // F4.AbstractC0126e
    public final boolean A() {
        return true;
    }

    @Override // F4.AbstractC0126e, C4.c
    public final int f() {
        return 19390000;
    }

    @Override // F4.AbstractC0126e, C4.c
    public final void l() {
        try {
            try {
                g gVar = (g) u();
                C4.f fVar = new C4.f(new C4.g(-1, -1, 0, true));
                Parcel Q7 = gVar.Q();
                C.c(Q7, fVar);
                gVar.i1(Q7, 1);
            } finally {
                super.l();
            }
        } catch (RemoteException | IllegalStateException e8) {
            f25000X.a(e8, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // F4.AbstractC0126e
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof g) {
            return (g) queryLocalInterface;
        }
        return new g(iBinder);
    }

    @Override // F4.AbstractC0126e
    public final B4.d[] q() {
        return t4.v.f23274e;
    }

    @Override // F4.AbstractC0126e
    public final Bundle s() {
        Bundle bundle = new Bundle();
        f25000X.b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.f25001A;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f25002B);
        bundle.putString("connectionless_client_record_id", this.f25004D);
        Bundle bundle2 = this.f25003C;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // F4.AbstractC0126e
    public final String v() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // F4.AbstractC0126e
    public final String w() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
