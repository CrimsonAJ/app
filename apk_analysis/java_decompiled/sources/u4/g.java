package u4;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.AbstractC0826h;
import com.google.android.gms.internal.cast.C0834j;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: b, reason: collision with root package name */
    public static final y4.b f23686b = new y4.b("Session", null);

    /* renamed from: a, reason: collision with root package name */
    public final x f23687a;

    public g(Context context, String str, String str2) {
        x xVar;
        try {
            xVar = AbstractC0826h.b(context).l1(str, str2, new j(this));
        } catch (RemoteException | C2080e e8) {
            AbstractC0826h.f14853a.a(e8, "Unable to call %s on %s.", "newSessionImpl", C0834j.class.getSimpleName());
            xVar = null;
        }
        this.f23687a = xVar;
    }

    public final void a(int i9) {
        x xVar = this.f23687a;
        if (xVar == null) {
            return;
        }
        try {
            v vVar = (v) xVar;
            Parcel Q7 = vVar.Q();
            Q7.writeInt(i9);
            vVar.g1(Q7, 13);
        } catch (RemoteException e8) {
            f23686b.a(e8, "Unable to call %s on %s.", "notifySessionEnded", x.class.getSimpleName());
        }
    }

    public final int b() {
        F4.y.d();
        x xVar = this.f23687a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel f12 = vVar.f1(vVar.Q(), 17);
                int readInt = f12.readInt();
                f12.recycle();
                if (readInt >= 211100000) {
                    v vVar2 = (v) xVar;
                    Parcel f13 = vVar2.f1(vVar2.Q(), 18);
                    int readInt2 = f13.readInt();
                    f13.recycle();
                    return readInt2;
                }
            } catch (RemoteException e8) {
                f23686b.a(e8, "Unable to call %s on %s.", "getSessionStartType", x.class.getSimpleName());
            }
        }
        return 0;
    }

    public final N4.a c() {
        x xVar = this.f23687a;
        if (xVar != null) {
            try {
                v vVar = (v) xVar;
                Parcel f12 = vVar.f1(vVar.Q(), 1);
                N4.a h12 = N4.b.h1(f12.readStrongBinder());
                f12.recycle();
                return h12;
            } catch (RemoteException e8) {
                f23686b.a(e8, "Unable to call %s on %s.", "getWrappedObject", x.class.getSimpleName());
            }
        }
        return null;
    }
}
