package com.google.android.gms.internal.cast;

import P.AbstractC0324z;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Collections;
import t0.AbstractC1989x;
import t0.C1979m;
import t0.C1987v;
import u4.C2079d;

/* renamed from: com.google.android.gms.internal.cast.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0846m extends AbstractC1989x {

    /* renamed from: d, reason: collision with root package name */
    public static final y4.b f14914d = new y4.b("MediaRouterCallback", null);

    /* renamed from: a, reason: collision with root package name */
    public final C0842l f14915a;

    /* renamed from: b, reason: collision with root package name */
    public final BinderC0873t f14916b;

    /* renamed from: c, reason: collision with root package name */
    public final C0885w f14917c;

    public C0846m(C0842l c0842l, BinderC0873t binderC0873t, C0885w c0885w) {
        F4.y.h(c0842l);
        this.f14915a = c0842l;
        this.f14916b = binderC0873t;
        this.f14917c = c0885w;
    }

    @Override // t0.AbstractC1989x
    public final void d(t0.D d9, t0.C c3) {
        try {
            C0842l c0842l = this.f14915a;
            String str = c3.f22842c;
            Bundle bundle = c3.f22857s;
            Parcel Q7 = c0842l.Q();
            Q7.writeString(str);
            C.c(Q7, bundle);
            c0842l.g1(Q7, 1);
        } catch (RemoteException e8) {
            f14914d.a(e8, "Unable to call %s on %s.", "onRouteAdded", C0842l.class.getSimpleName());
        }
        o(d9);
    }

    @Override // t0.AbstractC1989x
    public final void e(t0.D d9, t0.C c3) {
        if (!c3.g()) {
            return;
        }
        try {
            C0842l c0842l = this.f14915a;
            String str = c3.f22842c;
            Bundle bundle = c3.f22857s;
            Parcel Q7 = c0842l.Q();
            Q7.writeString(str);
            C.c(Q7, bundle);
            c0842l.g1(Q7, 2);
        } catch (RemoteException e8) {
            f14914d.a(e8, "Unable to call %s on %s.", "onRouteChanged", C0842l.class.getSimpleName());
        }
        o(d9);
    }

    @Override // t0.AbstractC1989x
    public final void f(t0.C c3, t0.C c9) {
        int i9 = c3.f22850l;
        y4.b bVar = f14914d;
        String str = c3.f22842c;
        if (i9 != 1) {
            Log.i(bVar.f24917a, bVar.d("ignore onRouteConnected for non-remote connected routeId: %s", str));
            return;
        }
        Log.i(bVar.f24917a, bVar.d("onRouteConnected with connectedRouteId = %s", str));
        this.f14916b.f14987m = true;
        try {
            C0842l c0842l = this.f14915a;
            Parcel f12 = c0842l.f1(c0842l.Q(), 7);
            int readInt = f12.readInt();
            f12.recycle();
            String str2 = c9.f22842c;
            if (readInt >= 251600000) {
                Bundle bundle = c3.f22857s;
                Parcel Q7 = c0842l.Q();
                Q7.writeString(str2);
                Q7.writeString(str);
                C.c(Q7, bundle);
                c0842l.g1(Q7, 9);
                return;
            }
            Bundle bundle2 = c3.f22857s;
            Parcel Q8 = c0842l.Q();
            Q8.writeString(str2);
            Q8.writeString(str);
            C.c(Q8, bundle2);
            c0842l.g1(Q8, 8);
        } catch (RemoteException e8) {
            bVar.a(e8, "Unable to call %s on %s.", "onRouteConnected", C0842l.class.getSimpleName());
        }
    }

    @Override // t0.AbstractC1989x
    public final void g(t0.C c3, t0.C c9, int i9) {
        y4.b bVar = f14914d;
        if (c3 != null && c3.f22850l == 1) {
            Integer valueOf = Integer.valueOf(i9);
            String str = c3.f22842c;
            String str2 = c9.f22842c;
            Log.i(bVar.f24917a, bVar.d("onRouteDisconnected with disconnectedRouteId = %s, requestedRouteId = %s, reason = %d", str, str2, valueOf));
            this.f14916b.f14987m = false;
            try {
                C0842l c0842l = this.f14915a;
                Parcel f12 = c0842l.f1(c0842l.Q(), 7);
                int readInt = f12.readInt();
                f12.recycle();
                if (readInt >= 251600000) {
                    Bundle bundle = c3.f22857s;
                    Parcel Q7 = c0842l.Q();
                    Q7.writeString(str2);
                    Q7.writeString(str);
                    C.c(Q7, bundle);
                    Q7.writeInt(i9);
                    c0842l.g1(Q7, 10);
                    return;
                }
                Bundle bundle2 = c3.f22857s;
                Parcel Q8 = c0842l.Q();
                Q8.writeString(str);
                C.c(Q8, bundle2);
                Q8.writeInt(i9);
                c0842l.g1(Q8, 6);
                return;
            } catch (RemoteException e8) {
                bVar.a(e8, "Unable to call %s on %s.", "onRouteDisconnected", C0842l.class.getSimpleName());
                return;
            }
        }
        Log.i(bVar.f24917a, bVar.d("ignore onRouteDisconnected for invalid or non-remote disconnected route", new Object[0]));
    }

    @Override // t0.AbstractC1989x
    public final void h(t0.D d9, t0.C c3) {
        try {
            C0842l c0842l = this.f14915a;
            String str = c3.f22842c;
            Bundle bundle = c3.f22857s;
            Parcel Q7 = c0842l.Q();
            Q7.writeString(str);
            C.c(Q7, bundle);
            c0842l.g1(Q7, 3);
        } catch (RemoteException e8) {
            f14914d.a(e8, "Unable to call %s on %s.", "onRouteRemoved", C0842l.class.getSimpleName());
        }
        o(d9);
    }

    @Override // t0.AbstractC1989x
    public final void j(t0.D d9, t0.C c3, int i9, t0.C c9) {
        int i10 = c3.f22850l;
        y4.b bVar = f14914d;
        String str = c3.f22842c;
        if (i10 != 1) {
            Log.i(bVar.f24917a, bVar.d("ignore onRouteSelected for non-remote selected routeId: %s", str));
            return;
        }
        Log.i(bVar.f24917a, bVar.d("onRouteSelected with reason = %d, routeId = %s", Integer.valueOf(i9), str));
        try {
            C0842l c0842l = this.f14915a;
            Parcel f12 = c0842l.f1(c0842l.Q(), 7);
            int readInt = f12.readInt();
            f12.recycle();
            if (readInt >= 220400000) {
                String str2 = c9.f22842c;
                Bundle bundle = c3.f22857s;
                Parcel Q7 = c0842l.Q();
                Q7.writeString(str2);
                Q7.writeString(str);
                C.c(Q7, bundle);
                c0842l.g1(Q7, 8);
            } else {
                String str3 = c9.f22842c;
                Bundle bundle2 = c3.f22857s;
                Parcel Q8 = c0842l.Q();
                Q8.writeString(str3);
                C.c(Q8, bundle2);
                c0842l.g1(Q8, 4);
            }
        } catch (RemoteException e8) {
            bVar.a(e8, "Unable to call %s on %s.", "onRouteSelected", C0842l.class.getSimpleName());
        }
        o(d9);
    }

    @Override // t0.AbstractC1989x
    public final void l(t0.D d9, t0.C c3, int i9) {
        int i10 = c3.f22850l;
        y4.b bVar = f14914d;
        String str = c3.f22842c;
        if (i10 != 1) {
            Log.i(bVar.f24917a, bVar.d("ignore onRouteUnselected for non-remote routeId: %s", str));
            return;
        }
        Log.i(bVar.f24917a, bVar.d("onRouteUnselected with reason = %d, routeId = %s", Integer.valueOf(i9), str));
        try {
            C0842l c0842l = this.f14915a;
            Bundle bundle = c3.f22857s;
            Parcel Q7 = c0842l.Q();
            Q7.writeString(str);
            C.c(Q7, bundle);
            Q7.writeInt(i9);
            c0842l.g1(Q7, 6);
        } catch (RemoteException e8) {
            bVar.a(e8, "Unable to call %s on %s.", "onRouteUnselected", C0842l.class.getSimpleName());
        }
        o(d9);
    }

    public final void o(t0.D d9) {
        C2079d c2079d;
        boolean z9;
        C0885w c0885w = this.f14917c;
        if (c0885w != null && c0885w.f15078e && c0885w.f15074a.f23673q) {
            u4.h hVar = c0885w.f15079f;
            CastDevice castDevice = null;
            if (hVar != null) {
                c2079d = hVar.c();
            } else {
                c2079d = null;
            }
            if (c2079d != null) {
                F4.y.d();
                castDevice = c2079d.f23683k;
            }
            if (castDevice != null) {
                ArrayList arrayList = new ArrayList();
                d9.getClass();
                t0.D.b();
                ArrayList arrayList2 = t0.D.c().f22971i;
                int size = arrayList2.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList2.get(i9);
                    i9++;
                    t0.C c3 = (t0.C) obj;
                    CastDevice g9 = CastDevice.g(c3.f22857s);
                    if (g9 != null) {
                        if (!TextUtils.isEmpty(g9.f()) && !g9.f().startsWith("__cast_ble__") && !TextUtils.isEmpty(castDevice.f()) && !castDevice.f().startsWith("__cast_ble__")) {
                            z9 = y4.a.e(g9.f(), castDevice.f());
                        } else {
                            String str = g9.f14595n;
                            if (!TextUtils.isEmpty(str)) {
                                String str2 = castDevice.f14595n;
                                if (!TextUtils.isEmpty(str2)) {
                                    z9 = y4.a.e(str, str2);
                                }
                            }
                            z9 = false;
                        }
                        if (!z9) {
                            arrayList.add(new t0.Y(new D6.a(c3.f22842c)));
                        }
                    }
                }
                C0885w.f15073g.b("updateRouteListingPreference with %d available routes", Integer.valueOf(arrayList.size()));
                C1987v c1987v = new C1987v();
                c1987v.f23044b = Collections.EMPTY_LIST;
                c1987v.f23045c = true;
                c1987v.f23044b = Collections.unmodifiableList(new ArrayList(arrayList));
                t0.Z z10 = new t0.Z(c1987v);
                t0.D.b();
                C1979m c1979m = t0.D.c().f22979r;
                if (c1979m != null && Build.VERSION.SDK_INT >= 34) {
                    AbstractC0324z.k(c1979m.f23006i, AbstractC0324z.m(z10));
                }
            }
        }
    }
}
