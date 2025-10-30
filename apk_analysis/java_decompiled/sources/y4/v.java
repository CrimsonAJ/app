package y4;

import D4.InterfaceC0086e;
import F4.AbstractC0129h;
import F4.y;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import b6.C0693o;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.internal.cast.C;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import t4.C2014d;
import u4.D;

/* loaded from: classes.dex */
public final class v extends AbstractC0129h {
    public static final b r0 = new b("CastClientImpl", null);

    /* renamed from: s0, reason: collision with root package name */
    public static final Object f24980s0 = new Object();

    /* renamed from: t0, reason: collision with root package name */
    public static final Object f24981t0 = new Object();

    /* renamed from: A, reason: collision with root package name */
    public C2014d f24982A;

    /* renamed from: B, reason: collision with root package name */
    public final CastDevice f24983B;

    /* renamed from: C, reason: collision with root package name */
    public final D f24984C;

    /* renamed from: D, reason: collision with root package name */
    public final HashMap f24985D;

    /* renamed from: X, reason: collision with root package name */
    public final long f24986X;
    public final Bundle Y;

    /* renamed from: Z, reason: collision with root package name */
    public u f24987Z;

    /* renamed from: f0, reason: collision with root package name */
    public String f24988f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f24989g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f24990h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f24991i0;

    /* renamed from: j0, reason: collision with root package name */
    public double f24992j0;

    /* renamed from: k0, reason: collision with root package name */
    public t4.u f24993k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f24994l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f24995m0;

    /* renamed from: n0, reason: collision with root package name */
    public String f24996n0;

    /* renamed from: o0, reason: collision with root package name */
    public String f24997o0;

    /* renamed from: p0, reason: collision with root package name */
    public Bundle f24998p0;

    /* renamed from: q0, reason: collision with root package name */
    public final HashMap f24999q0;

    public v(Context context, Looper looper, C0693o c0693o, CastDevice castDevice, long j, D d9, Bundle bundle, D4.t tVar, D4.t tVar2) {
        super(context, looper, 10, c0693o, tVar, tVar2);
        this.f24983B = castDevice;
        this.f24984C = d9;
        this.f24986X = j;
        this.Y = bundle;
        this.f24985D = new HashMap();
        new AtomicLong(0L);
        this.f24999q0 = new HashMap();
        this.f24994l0 = -1;
        this.f24995m0 = -1;
        this.f24982A = null;
        this.f24988f0 = null;
        this.f24992j0 = 0.0d;
        G();
        this.f24989g0 = false;
        this.f24993k0 = null;
        G();
    }

    public static void E(v vVar, long j, int i9) {
        InterfaceC0086e interfaceC0086e;
        HashMap hashMap = vVar.f24999q0;
        synchronized (hashMap) {
            interfaceC0086e = (InterfaceC0086e) hashMap.remove(Long.valueOf(j));
        }
        if (interfaceC0086e != null) {
            ((s4.g) interfaceC0086e).J(new Status(i9, null, null, null));
        }
    }

    public final void F() {
        r0.b("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap hashMap = this.f24985D;
        synchronized (hashMap) {
            hashMap.clear();
        }
    }

    public final void G() {
        CastDevice castDevice = this.f24983B;
        y.i(castDevice, "device should not be null");
        e1.q qVar = castDevice.f14591i;
        if (!qVar.l(2048) && qVar.l(4) && !qVar.l(1)) {
            "Chromecast Audio".equals(castDevice.f14587e);
        }
    }

    @Override // F4.AbstractC0126e, C4.c
    public final int f() {
        return 12800000;
    }

    @Override // F4.AbstractC0126e, C4.c
    public final void l() {
        Object[] objArr = {this.f24987Z, Boolean.valueOf(a())};
        b bVar = r0;
        bVar.b("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        u uVar = this.f24987Z;
        v vVar = null;
        this.f24987Z = null;
        if (uVar != null) {
            v vVar2 = (v) uVar.f24978f.getAndSet(null);
            if (vVar2 != null) {
                vVar2.f24994l0 = -1;
                vVar2.f24995m0 = -1;
                vVar2.f24982A = null;
                vVar2.f24988f0 = null;
                vVar2.f24992j0 = 0.0d;
                vVar2.G();
                vVar2.f24989g0 = false;
                vVar2.f24993k0 = null;
                vVar = vVar2;
            }
            if (vVar != null) {
                F();
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
                    bVar.a(e8, "Error while disconnecting the controller interface", new Object[0]);
                }
                return;
            }
        }
        bVar.b("already disposed, so short-circuiting", new Object[0]);
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
    public final Bundle r() {
        Bundle bundle = this.f24998p0;
        if (bundle == null) {
            return null;
        }
        this.f24998p0 = null;
        return bundle;
    }

    @Override // F4.AbstractC0126e
    public final Bundle s() {
        Bundle bundle = new Bundle();
        r0.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f24996n0, this.f24997o0);
        CastDevice castDevice = this.f24983B;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f24986X);
        Bundle bundle2 = this.Y;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        u uVar = new u(this);
        this.f24987Z = uVar;
        bundle.putParcelable("listener", new BinderWrapper(uVar));
        String str = this.f24996n0;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f24997o0;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
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

    @Override // F4.AbstractC0126e
    public final void y(B4.b bVar) {
        super.y(bVar);
        F();
    }

    @Override // F4.AbstractC0126e
    public final void z(int i9, IBinder iBinder, Bundle bundle, int i10) {
        r0.b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i9));
        if (i9 == 0 || i9 == 2300) {
            this.f24990h0 = true;
            this.f24991i0 = true;
        }
        if (i9 == 2300) {
            Bundle bundle2 = new Bundle();
            this.f24998p0 = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i9 = 0;
        }
        super.z(i9, iBinder, bundle, i10);
    }
}
