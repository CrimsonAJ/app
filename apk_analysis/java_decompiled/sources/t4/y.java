package t4;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C;
import java.util.Iterator;
import u4.C2079d;
import u4.E;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f23283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23284c;

    public /* synthetic */ y(z zVar, int i9, int i10) {
        this.f23282a = i10;
        this.f23283b = zVar;
        this.f23284c = i9;
    }

    private final void a() {
        z zVar = this.f23283b;
        C2009A c2009a = zVar.f23285f;
        c2009a.f23141x = -1;
        c2009a.f23142y = -1;
        c2009a.f23137t = null;
        c2009a.f23138u = null;
        c2009a.f23139v = 0.0d;
        c2009a.j();
        c2009a.f23140w = false;
        c2009a.f23143z = null;
        c2009a.f23127F = 1;
        int i9 = this.f23284c;
        synchronized (c2009a.f23126E) {
            try {
                Iterator it = c2009a.f23126E.iterator();
                while (it.hasNext()) {
                    u4.q qVar = ((E) it.next()).f23640a.f23678e;
                    if (qVar != null) {
                        try {
                            B4.b bVar = new B4.b(i9);
                            u4.o oVar = (u4.o) qVar;
                            Parcel Q7 = oVar.Q();
                            C.c(Q7, bVar);
                            oVar.g1(Q7, 3);
                        } catch (RemoteException e8) {
                            C2079d.f23675m.a(e8, "Unable to call %s on %s.", "onDisconnected", u4.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C2009A c2009a2 = zVar.f23285f;
        c2009a2.g();
        c2009a2.f(c2009a2.f23128k);
    }

    private final void b() {
        Iterator it;
        z zVar = this.f23283b;
        int i9 = this.f23284c;
        if (i9 == 0) {
            C2009A c2009a = zVar.f23285f;
            c2009a.f23127F = 3;
            c2009a.f23130m = true;
            c2009a.f23131n = true;
            synchronized (c2009a.f23126E) {
                try {
                    Iterator it2 = c2009a.f23126E.iterator();
                    while (it2.hasNext()) {
                        ((E) it2.next()).a();
                    }
                } finally {
                }
            }
            return;
        }
        C2009A c2009a2 = zVar.f23285f;
        c2009a2.f23127F = 1;
        synchronized (c2009a2.f23126E) {
            try {
                it = c2009a2.f23126E.iterator();
            } catch (RemoteException e8) {
                C2079d.f23675m.a(e8, "Unable to call %s on %s.", "onConnectionFailed", u4.q.class.getSimpleName());
            } finally {
            }
            while (it.hasNext()) {
                u4.q qVar = ((E) it.next()).f23640a.f23678e;
                if (qVar != null) {
                    B4.b bVar = new B4.b(i9);
                    u4.o oVar = (u4.o) qVar;
                    Parcel Q7 = oVar.Q();
                    C.c(Q7, bVar);
                    oVar.g1(Q7, 3);
                }
            }
        }
        zVar.f23285f.g();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23282a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f23283b.f23285f.f23125D.b(this.f23284c);
                return;
            default:
                C2009A c2009a = this.f23283b.f23285f;
                c2009a.f23127F = 4;
                int i9 = this.f23284c;
                synchronized (c2009a.f23126E) {
                    try {
                        Iterator it = c2009a.f23126E.iterator();
                        while (it.hasNext()) {
                            u4.q qVar = ((E) it.next()).f23640a.f23678e;
                            if (qVar != null) {
                                try {
                                    u4.o oVar = (u4.o) qVar;
                                    Parcel Q7 = oVar.Q();
                                    Q7.writeInt(i9);
                                    oVar.g1(Q7, 2);
                                } catch (RemoteException e8) {
                                    C2079d.f23675m.a(e8, "Unable to call %s on %s.", "onConnectionSuspended", u4.q.class.getSimpleName());
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
