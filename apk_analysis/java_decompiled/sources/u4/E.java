package u4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.H1;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2079d f23640a;

    public E(C2079d c2079d) {
        this.f23640a = c2079d;
    }

    public final void a() {
        C2079d c2079d = this.f23640a;
        if (c2079d.f23678e != null) {
            try {
                v4.h hVar = c2079d.j;
                if (hVar != null) {
                    hVar.s();
                }
                o oVar = (o) c2079d.f23678e;
                Parcel Q7 = oVar.Q();
                int i9 = com.google.android.gms.internal.cast.C.f14693a;
                Q7.writeInt(0);
                oVar.g1(Q7, 1);
            } catch (RemoteException e8) {
                C2079d.f23675m.a(e8, "Unable to call %s on %s.", "onConnected", q.class.getSimpleName());
            }
            H1 h12 = c2079d.f23684l;
            if (h12 != null) {
                Y2.r.W(h12.f14722a, new com.google.android.gms.internal.cast.D(new A3.E(3, 10)));
            }
        }
    }
}
