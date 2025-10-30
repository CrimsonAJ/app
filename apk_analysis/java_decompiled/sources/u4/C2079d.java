package u4;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.AbstractC0826h;
import com.google.android.gms.internal.cast.BinderC0873t;
import com.google.android.gms.internal.cast.C0834j;
import com.google.android.gms.internal.cast.H1;
import f5.AbstractC1176h;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t4.C2009A;
import t4.C2014d;

/* renamed from: u4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2079d extends g {

    /* renamed from: m, reason: collision with root package name */
    public static final y4.b f23675m = new y4.b("CastSession", null);

    /* renamed from: c, reason: collision with root package name */
    public final Context f23676c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f23677d;

    /* renamed from: e, reason: collision with root package name */
    public final q f23678e;

    /* renamed from: f, reason: collision with root package name */
    public final C2078c f23679f;

    /* renamed from: g, reason: collision with root package name */
    public final BinderC0873t f23680g;

    /* renamed from: h, reason: collision with root package name */
    public final w4.i f23681h;

    /* renamed from: i, reason: collision with root package name */
    public C2009A f23682i;
    public v4.h j;

    /* renamed from: k, reason: collision with root package name */
    public CastDevice f23683k;

    /* renamed from: l, reason: collision with root package name */
    public H1 f23684l;

    public C2079d(Context context, String str, String str2, C2078c c2078c, BinderC0873t binderC0873t, w4.i iVar) {
        super(context, str, str2);
        this.f23677d = new HashSet();
        this.f23676c = context.getApplicationContext();
        this.f23679f = c2078c;
        this.f23680g = binderC0873t;
        this.f23681h = iVar;
        N4.a c3 = c();
        j jVar = new j(this);
        y4.b bVar = AbstractC0826h.f14853a;
        q qVar = null;
        if (c3 != null) {
            try {
                qVar = AbstractC0826h.b(context).j1(c2078c, c3, jVar);
            } catch (RemoteException | C2080e e8) {
                AbstractC0826h.f14853a.a(e8, "Unable to call %s on %s.", "newCastSessionImpl", C0834j.class.getSimpleName());
            }
        }
        this.f23678e = qVar;
    }

    public static void d(C2079d c2079d, int i9) {
        w4.i iVar = c2079d.f23681h;
        if (iVar.f24204q) {
            iVar.f24204q = false;
            v4.h hVar = iVar.f24201n;
            if (hVar != null) {
                F4.y.d();
                C c3 = iVar.f24200m;
                if (c3 != null) {
                    hVar.f23854h.remove(c3);
                }
            }
            iVar.f24191c.h1(null);
            Y2.r rVar = iVar.f24196h;
            if (rVar != null) {
                rVar.V();
                rVar.f8651e = null;
            }
            Y2.r rVar2 = iVar.f24197i;
            if (rVar2 != null) {
                rVar2.V();
                rVar2.f8651e = null;
            }
            android.support.v4.media.session.y yVar = iVar.f24203p;
            if (yVar != null) {
                yVar.W(null, null);
                iVar.f24203p.Y(new MediaMetadataCompat(new Bundle()));
                iVar.j(0, null);
            }
            android.support.v4.media.session.y yVar2 = iVar.f24203p;
            if (yVar2 != null) {
                ((android.support.v4.media.session.t) yVar2.f9331b).f9318a.setActive(false);
                Iterator it = ((ArrayList) yVar2.f9333d).iterator();
                if (!it.hasNext()) {
                    android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) iVar.f24203p.f9331b;
                    tVar.f9321d = true;
                    tVar.f9322e.kill();
                    int i10 = Build.VERSION.SDK_INT;
                    MediaSession mediaSession = tVar.f9318a;
                    if (i10 == 27) {
                        try {
                            Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                            declaredField.setAccessible(true);
                            Handler handler = (Handler) declaredField.get(mediaSession);
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                            }
                        } catch (Exception e8) {
                            Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e8);
                        }
                    }
                    mediaSession.setCallback(null);
                    mediaSession.release();
                    iVar.f24203p = null;
                } else {
                    throw A0.a.h(it);
                }
            }
            iVar.f24201n = null;
            iVar.f24202o = null;
            iVar.h();
            if (i9 == 0) {
                iVar.i();
            }
        }
        C2009A c2009a = c2079d.f23682i;
        if (c2009a != null) {
            c2009a.i();
            c2079d.f23682i = null;
        }
        c2079d.f23683k = null;
        v4.h hVar2 = c2079d.j;
        if (hVar2 != null) {
            hVar2.t(null);
            c2079d.j = null;
        }
    }

    public static void e(C2079d c2079d, String str, AbstractC1176h abstractC1176h) {
        int i9 = 0;
        y4.b bVar = f23675m;
        q qVar = c2079d.f23678e;
        if (qVar == null) {
            return;
        }
        try {
            if (abstractC1176h.j()) {
                y4.t tVar = (y4.t) abstractC1176h.g();
                if (tVar.f24973a.f()) {
                    bVar.b("%s() -> success result", str);
                    v4.h hVar = new v4.h(new y4.n());
                    c2079d.j = hVar;
                    hVar.t(c2079d.f23682i);
                    c2079d.j.o(new C(i9, c2079d));
                    c2079d.j.s();
                    w4.i iVar = c2079d.f23681h;
                    v4.h hVar2 = c2079d.j;
                    F4.y.d();
                    iVar.a(hVar2, c2079d.f23683k);
                    C2014d c2014d = tVar.f24974b;
                    F4.y.h(c2014d);
                    String str2 = tVar.f24975c;
                    String str3 = tVar.f24976d;
                    F4.y.h(str3);
                    boolean z9 = tVar.f24977e;
                    o oVar = (o) qVar;
                    Parcel Q7 = oVar.Q();
                    com.google.android.gms.internal.cast.C.c(Q7, c2014d);
                    Q7.writeString(str2);
                    Q7.writeString(str3);
                    Q7.writeInt(z9 ? 1 : 0);
                    oVar.g1(Q7, 4);
                    return;
                }
                Status status = tVar.f24973a;
                bVar.b("%s() -> failure result", str);
                int i10 = status.f14660a;
                o oVar2 = (o) qVar;
                Parcel Q8 = oVar2.Q();
                Q8.writeInt(i10);
                oVar2.g1(Q8, 5);
                return;
            }
            Exception f9 = abstractC1176h.f();
            if (f9 instanceof C4.e) {
                int i11 = ((C4.e) f9).f1568a.f14660a;
                o oVar3 = (o) qVar;
                Parcel Q9 = oVar3.Q();
                Q9.writeInt(i11);
                oVar3.g1(Q9, 5);
                return;
            }
            o oVar4 = (o) qVar;
            Parcel Q10 = oVar4.Q();
            Q10.writeInt(2476);
            oVar4.g1(Q10, 5);
        } catch (RemoteException e8) {
            bVar.a(e8, "Unable to call %s on %s.", "methods", q.class.getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.C2079d.f(android.os.Bundle):void");
    }
}
