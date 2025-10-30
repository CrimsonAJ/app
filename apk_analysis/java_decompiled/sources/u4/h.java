package u4;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final y4.b f23688c = new y4.b("SessionManager", null);

    /* renamed from: a, reason: collision with root package name */
    public final y f23689a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f23690b;

    public h(y yVar, Context context) {
        this.f23689a = yVar;
        this.f23690b = context;
    }

    public final void a(i iVar) {
        F4.y.d();
        try {
            y yVar = this.f23689a;
            z zVar = new z(iVar);
            Parcel Q7 = yVar.Q();
            com.google.android.gms.internal.cast.C.d(Q7, zVar);
            yVar.g1(Q7, 2);
        } catch (RemoteException e8) {
            f23688c.a(e8, "Unable to call %s on %s.", "addSessionManagerListener", y.class.getSimpleName());
        }
    }

    public final void b(boolean z9) {
        y4.b bVar = f23688c;
        F4.y.d();
        try {
            Log.i(bVar.f24917a, bVar.d("End session for %s", this.f23690b.getPackageName()));
            y yVar = this.f23689a;
            Parcel Q7 = yVar.Q();
            int i9 = com.google.android.gms.internal.cast.C.f14693a;
            Q7.writeInt(1);
            Q7.writeInt(z9 ? 1 : 0);
            yVar.g1(Q7, 6);
        } catch (RemoteException e8) {
            bVar.a(e8, "Unable to call %s on %s.", "endCurrentSession", y.class.getSimpleName());
        }
    }

    public final C2079d c() {
        F4.y.d();
        g d9 = d();
        if (d9 != null && (d9 instanceof C2079d)) {
            return (C2079d) d9;
        }
        return null;
    }

    public final g d() {
        F4.y.d();
        try {
            y yVar = this.f23689a;
            Parcel f12 = yVar.f1(yVar.Q(), 1);
            N4.a h12 = N4.b.h1(f12.readStrongBinder());
            f12.recycle();
            return (g) N4.b.i1(h12);
        } catch (RemoteException e8) {
            f23688c.a(e8, "Unable to call %s on %s.", "getWrappedCurrentSession", y.class.getSimpleName());
            return null;
        }
    }
}
