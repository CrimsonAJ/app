package u4;

import J1.AbstractC0165c;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b5.G1;
import com.anilab.android.ui.player.PlayerActivity;
import com.anilab.android.ui.views.FreakLoading;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.cast.BinderC0873t;
import com.google.android.gms.internal.cast.C0830i;
import com.google.android.gms.internal.cast.H1;
import g2.C1228e;
import i.G;
import java.util.HashSet;
import java.util.Iterator;
import t4.C2009A;
import w4.AsyncTaskC2140b;

/* loaded from: classes.dex */
public final class j extends S4.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f23691f = 2;

    /* renamed from: g, reason: collision with root package name */
    public final Object f23692g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0830i c0830i) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 2);
        this.f23692g = c0830i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // S4.c
    public final boolean g1(int i9, Parcel parcel, Parcel parcel2) {
        boolean z9;
        int i10;
        long f9;
        Object[] objArr;
        String str;
        CastDevice castDevice;
        CastDevice castDevice2;
        Object obj = this.f23692g;
        int i11 = 0;
        switch (this.f23691f) {
            case 0:
                C1228e c1228e = (C1228e) obj;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            return false;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    }
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.cast.C.b(parcel);
                    c1228e.getClass();
                    int i12 = PlayerActivity.f13798w0;
                    if (readInt == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    PlayerActivity playerActivity = c1228e.f17663a;
                    playerActivity.Y = z9;
                    if (readInt == 3) {
                        ((D.n) playerActivity.b0()).f(false);
                    }
                    AbstractC0165c abstractC0165c = playerActivity.f13799D;
                    if (abstractC0165c != null) {
                        FreakLoading freakLoading = abstractC0165c.f3845E;
                        kotlin.jvm.internal.h.d(freakLoading, "freakLoading");
                        if (readInt != 3) {
                            i11 = 8;
                        }
                        freakLoading.setVisibility(i11);
                        parcel2.writeNoException();
                        return true;
                    }
                    kotlin.jvm.internal.h.h("binding");
                    throw null;
                }
                N4.b bVar = new N4.b(c1228e);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.C.d(parcel2, bVar);
                return true;
            case 1:
                g gVar = (g) obj;
                switch (i9) {
                    case 1:
                        N4.b bVar2 = new N4.b(gVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.C.d(parcel2, bVar2);
                        return true;
                    case 2:
                        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.C.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.C.b(parcel);
                        ((C2079d) gVar).f(bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        Bundle bundle2 = (Bundle) com.google.android.gms.internal.cast.C.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.C.b(parcel);
                        ((C2079d) gVar).f(bundle2);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        int i13 = com.google.android.gms.internal.cast.C.f14693a;
                        if (parcel.readInt() != 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        com.google.android.gms.internal.cast.C.b(parcel);
                        C2079d c2079d = (C2079d) gVar;
                        q qVar = c2079d.f23678e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel Q7 = oVar.Q();
                                Q7.writeInt(i10);
                                Q7.writeInt(0);
                                oVar.g1(Q7, 6);
                            } catch (RemoteException e8) {
                                C2079d.f23675m.a(e8, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            c2079d.a(0);
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        C2079d c2079d2 = (C2079d) gVar;
                        c2079d2.getClass();
                        F4.y.d();
                        v4.h hVar = c2079d2.j;
                        if (hVar == null) {
                            f9 = 0;
                        } else {
                            f9 = hVar.f() - c2079d2.j.a();
                        }
                        parcel2.writeNoException();
                        parcel2.writeLong(f9);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 7:
                        Bundle bundle3 = (Bundle) com.google.android.gms.internal.cast.C.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.C.b(parcel);
                        C2079d c2079d3 = (C2079d) gVar;
                        c2079d3.getClass();
                        c2079d3.f23683k = CastDevice.g(bundle3);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        Bundle bundle4 = (Bundle) com.google.android.gms.internal.cast.C.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.C.b(parcel);
                        C2079d c2079d4 = (C2079d) gVar;
                        c2079d4.getClass();
                        c2079d4.f23683k = CastDevice.g(bundle4);
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        Bundle bundle5 = (Bundle) com.google.android.gms.internal.cast.C.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.C.b(parcel);
                        C2079d c2079d5 = (C2079d) gVar;
                        c2079d5.getClass();
                        CastDevice g9 = CastDevice.g(bundle5);
                        if (g9 != null && !g9.equals(c2079d5.f23683k)) {
                            String str2 = g9.f14586d;
                            if (!TextUtils.isEmpty(str2) && ((castDevice2 = c2079d5.f23683k) == null || !TextUtils.equals(castDevice2.f14586d, str2))) {
                                objArr = true;
                            } else {
                                objArr = false;
                            }
                            c2079d5.f23683k = g9;
                            if (true != objArr) {
                                str = "unchanged";
                            } else {
                                str = "changed";
                            }
                            C2079d.f23675m.b("update to device (%s) with name %s", g9, str);
                            if (objArr != false && (castDevice = c2079d5.f23683k) != null) {
                                w4.i iVar = c2079d5.f23681h;
                                if (iVar != null) {
                                    y4.b bVar3 = w4.i.f24188v;
                                    Log.i(bVar3.f24917a, bVar3.d("update Cast device to %s", castDevice));
                                    iVar.f24202o = castDevice;
                                    iVar.c();
                                }
                                Iterator it = new HashSet(c2079d5.f23677d).iterator();
                                while (it.hasNext()) {
                                    ((D) it.next()).getClass();
                                }
                                H1 h12 = c2079d5.f23684l;
                                if (h12 != null) {
                                    h12.f14722a.X().f14890u++;
                                }
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    default:
                        return false;
                }
            case 2:
                C0830i c0830i = (C0830i) obj;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                return false;
                            }
                            parcel2.writeNoException();
                            parcel2.writeInt(12451000);
                            return true;
                        }
                        String str3 = c0830i.f14857b;
                        parcel2.writeNoException();
                        parcel2.writeString(str3);
                        return true;
                    }
                    boolean z10 = c0830i.f14859d.f23662e;
                    parcel2.writeNoException();
                    int i14 = com.google.android.gms.internal.cast.C.f14693a;
                    parcel2.writeInt(z10 ? 1 : 0);
                    return true;
                }
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.C.b(parcel);
                c0830i.getClass();
                Context context = c0830i.f14856a;
                C2078c c2078c = c0830i.f14859d;
                BinderC0873t binderC0873t = c0830i.f14860e;
                N4.a c3 = new C2079d(c0830i.f14856a, c0830i.f14857b, readString, c2078c, binderC0873t, new w4.i(context, c2078c, binderC0873t)).c();
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.C.d(parcel2, c3);
                return true;
            case 3:
                C2079d c2079d6 = (C2079d) obj;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                if (i9 != 5) {
                                    return false;
                                }
                                parcel2.writeNoException();
                                parcel2.writeInt(12451000);
                                return true;
                            }
                            int readInt2 = parcel.readInt();
                            com.google.android.gms.internal.cast.C.b(parcel);
                            C2079d.d(c2079d6, readInt2);
                            parcel2.writeNoException();
                            return true;
                        }
                        String readString2 = parcel.readString();
                        com.google.android.gms.internal.cast.C.b(parcel);
                        C2009A c2009a = c2079d6.f23682i;
                        if (c2009a != null && c2009a.f23127F == 3) {
                            D4.n g10 = D4.n.g();
                            g10.f1864e = new t4.x(c2009a, readString2);
                            g10.f1863d = 8409;
                            c2009a.c(1, g10.f());
                        }
                        parcel2.writeNoException();
                        return true;
                    }
                    String readString3 = parcel.readString();
                    t4.i iVar2 = (t4.i) com.google.android.gms.internal.cast.C.a(parcel, t4.i.CREATOR);
                    com.google.android.gms.internal.cast.C.b(parcel);
                    C2009A c2009a2 = c2079d6.f23682i;
                    if (c2009a2 != null && c2009a2.f23127F == 3) {
                        D4.n g11 = D4.n.g();
                        g11.f1864e = new G1(c2009a2, readString3, iVar2);
                        g11.f1863d = 8406;
                        c2009a2.c(1, g11.f()).k(new com.google.firebase.messaging.u(this));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.cast.C.b(parcel);
                C2009A c2009a3 = c2079d6.f23682i;
                if (c2009a3 != null && c2009a3.f23127F == 3) {
                    D4.n g12 = D4.n.g();
                    g12.f1864e = new t4.w(c2009a3, readString4, readString5, i11);
                    g12.f1863d = 8407;
                    c2009a3.c(1, g12.f()).k(new G(17, this));
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i9 != 1) {
                    if (i9 != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                com.google.android.gms.internal.cast.C.b(parcel);
                AsyncTaskC2140b.a((AsyncTaskC2140b) obj, new Long[]{Long.valueOf(readLong), Long.valueOf(readLong2)});
                parcel2.writeNoException();
                return true;
        }
    }

    public j(C1228e c1228e) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 2);
        this.f23692g = c1228e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C2079d c2079d) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 2);
        this.f23692g = c2079d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 2);
        this.f23692g = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AsyncTaskC2140b asyncTaskC2140b) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 2);
        this.f23692g = asyncTaskC2140b;
    }
}
