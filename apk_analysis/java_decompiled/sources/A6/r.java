package A6;

import A3.E;
import G0.I;
import J1.AbstractC0204u0;
import N3.A;
import N3.T;
import P5.C;
import P5.F;
import P5.G;
import P5.S;
import P5.X;
import P5.f0;
import U3.B;
import U3.w;
import U3.z;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import androidx.profileinstaller.ProfileInstallerInitializer;
import b5.R0;
import co.notix.R;
import com.anilab.android.ui.search.SearchFragment;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.u;
import f5.C1177i;
import j2.C1435b;
import j3.C0;
import j3.C1440C;
import j3.C1441D;
import j3.C1462m;
import j3.C1474z;
import j3.E0;
import j3.J;
import j3.M;
import j3.SurfaceHolderCallbackC1438A;
import j3.Z;
import j3.j0;
import j3.l0;
import j3.t0;
import j3.u0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.C1485a;
import k3.C1489e;
import l3.C1564m;
import l3.D;
import l4.AbstractC1566a;
import l4.y;
import m4.v;
import n3.C1627d;
import n3.C1628e;
import o1.C1671f;
import p.c1;
import q3.C1908m;
import t6.ScheduledFutureC2023h;
import t6.ThreadFactoryC2016a;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f536c;

    public /* synthetic */ r(w wVar, byte[] bArr, S s9) {
        this.f534a = 8;
        this.f535b = wVar;
        this.f536c = bArr;
    }

    private final void a() {
        C1564m c1564m = (C1564m) this.f535b;
        m3.d dVar = (m3.d) this.f536c;
        c1564m.getClass();
        synchronized (dVar) {
        }
        SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A = c1564m.f20414c;
        int i9 = y.f20553a;
        C1489e c1489e = surfaceHolderCallbackC1438A.f19226a.f19283r;
        c1489e.T(c1489e.P((A) c1489e.f19931d.f11386e), 1013, new Z(27));
    }

    private final void b() {
        AudioTrack audioTrack = (AudioTrack) this.f535b;
        H1.k kVar = (H1.k) this.f536c;
        try {
            audioTrack.flush();
            audioTrack.release();
            kVar.d();
            synchronized (D.f20239d0) {
                try {
                    int i9 = D.f20241f0 - 1;
                    D.f20241f0 = i9;
                    if (i9 == 0) {
                        D.f20240e0.shutdown();
                        D.f20240e0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            kVar.d();
            synchronized (D.f20239d0) {
                try {
                    int i10 = D.f20241f0 - 1;
                    D.f20241f0 = i10;
                    if (i10 == 0) {
                        D.f20240e0.shutdown();
                        D.f20240e0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    private final void c() {
        C1564m c1564m = (C1564m) this.f535b;
        m3.d dVar = (m3.d) this.f536c;
        c1564m.getClass();
        synchronized (dVar) {
        }
        SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A = c1564m.f20414c;
        int i9 = y.f20553a;
        C1489e c1489e = surfaceHolderCallbackC1438A.f19226a.f19283r;
        C1485a P8 = c1489e.P((A) c1489e.f19931d.f11386e);
        c1489e.T(P8, 1020, new C1435b(P8, dVar, 10));
    }

    private final void d() {
        S6.a aVar;
        s6.n nVar = (s6.n) this.f535b;
        S6.b bVar = (S6.b) this.f536c;
        if (nVar.f22781b == s6.n.f22779d) {
            synchronized (nVar) {
                aVar = nVar.f22780a;
                nVar.f22780a = null;
                nVar.f22781b = bVar;
            }
            aVar.h(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void e() {
        s6.m mVar = (s6.m) this.f535b;
        S6.b bVar = (S6.b) this.f536c;
        synchronized (mVar) {
            try {
                if (mVar.f22777b == null) {
                    mVar.f22776a.add(bVar);
                } else {
                    mVar.f22777b.add(bVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v50, types: [N3.M, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v88, types: [N3.M, java.io.IOException] */
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        q3.r c1908m;
        long j;
        int i9;
        boolean z9;
        boolean z10;
        String str;
        boolean z11;
        boolean z12;
        U3.A a5;
        S s9;
        boolean z13;
        long j4;
        long j9;
        boolean z14;
        boolean z15 = true;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        z16 = false;
        switch (this.f534a) {
            case 0:
                E6.e eVar = (E6.e) this.f535b;
                ((h) eVar.f1968b).i((String) eVar.f1967a, (List) this.f536c);
                return;
            case 1:
                ((ProfileInstallerInitializer) this.f535b).getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = D0.h.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new D0.e((Context) this.f536c, false ? 1 : 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 2:
                F6.c cVar = (F6.c) this.f535b;
                cVar.getClass();
                try {
                    Y2.s.a().f8656d.a(((Y2.j) cVar.f2584h.f8647a).b(V2.d.f7662c), 1);
                } catch (Exception unused) {
                }
                ((CountDownLatch) this.f536c).countDown();
                return;
            case 3:
                ((G.b) this.f535b).i((Typeface) this.f536c);
                return;
            case 4:
                Runnable runnable = (Runnable) this.f535b;
                I i10 = (I) this.f536c;
                try {
                    runnable.run();
                    return;
                } finally {
                }
            case 5:
                T t7 = (T) this.f535b;
                H3.c cVar2 = t7.f4994q;
                q3.r rVar = (q3.r) this.f536c;
                if (cVar2 == null) {
                    c1908m = rVar;
                    j = -9223372036854775807L;
                } else {
                    j = -9223372036854775807L;
                    c1908m = new C1908m(-9223372036854775807L);
                }
                t7.f5001x = c1908m;
                t7.f5002y = rVar.h();
                if (!t7.f4973X && rVar.h() == j) {
                    z16 = true;
                }
                t7.f5003z = z16;
                if (z16) {
                    i9 = 7;
                } else {
                    i9 = 1;
                }
                t7.f4969A = i9;
                t7.f4982g.w(t7.f5002y, rVar.e(), t7.f5003z);
                if (!t7.f4998u) {
                    t7.n();
                    return;
                }
                return;
            case 6:
                T3.b bVar = (T3.b) this.f535b;
                bVar.f7076i = false;
                bVar.b((Uri) this.f536c);
                return;
            case 7:
                O0.c cVar3 = (O0.c) this.f535b;
                F f9 = (F) this.f536c;
                U3.n nVar = (U3.n) cVar3.f5264c;
                nVar.getClass();
                Pattern pattern = U3.y.f7482a;
                CharSequence charSequence = (CharSequence) f9.get(0);
                Pattern pattern2 = U3.y.f7483b;
                boolean matches = pattern2.matcher(charSequence).matches();
                E e8 = nVar.f7412g;
                if (matches) {
                    Matcher matcher = pattern2.matcher((CharSequence) f9.get(0));
                    AbstractC1566a.h(matcher.matches());
                    String group = matcher.group(1);
                    group.getClass();
                    int parseInt = Integer.parseInt(group);
                    int indexOf = f9.indexOf("");
                    if (indexOf > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC1566a.h(z11);
                    List subList = f9.subList(1, indexOf);
                    C1671f c1671f = new C1671f(21);
                    c1671f.l(subList);
                    U3.o oVar = new U3.o(c1671f);
                    String a9 = new O5.g(U3.y.f7489h, 0).a(f9.subList(indexOf + 1, f9.size()));
                    String b9 = oVar.b("CSeq");
                    b9.getClass();
                    int parseInt2 = Integer.parseInt(b9);
                    SparseArray sparseArray = nVar.f7411f;
                    z zVar = (z) sparseArray.get(parseInt2);
                    if (zVar != null) {
                        sparseArray.remove(parseInt2);
                        s4.i iVar = nVar.f7406a;
                        X x5 = X.f5938g;
                        int i11 = zVar.f7491b;
                        try {
                        } catch (j0 e9) {
                            U3.n.d(nVar, new IOException(e9));
                            return;
                        }
                        if (parseInt != 200) {
                            if (parseInt != 401) {
                                if (parseInt == 301 || parseInt == 302) {
                                    if (nVar.f7418n != -1) {
                                        nVar.f7418n = 0;
                                    }
                                    String b10 = oVar.b("Location");
                                    if (b10 == null) {
                                        iVar.R("Redirection without new location.", null);
                                        return;
                                    }
                                    Uri parse = Uri.parse(b10);
                                    nVar.f7413h = U3.y.e(parse);
                                    nVar.j = U3.y.c(parse);
                                    e8.r(e8.j(2, nVar.f7415k, x5, nVar.f7413h));
                                    return;
                                }
                            } else if (nVar.j != null && !nVar.f7420p) {
                                F c3 = oVar.f7423a.c(U3.o.a("WWW-Authenticate"));
                                if (!c3.isEmpty()) {
                                    for (int i12 = 0; i12 < c3.size(); i12++) {
                                        l4.s d9 = U3.y.d((String) c3.get(i12));
                                        nVar.f7417m = d9;
                                        if (d9.f20538a == 2) {
                                            e8.q();
                                            nVar.f7420p = true;
                                            return;
                                        }
                                    }
                                    e8.q();
                                    nVar.f7420p = true;
                                    return;
                                }
                                throw j0.b("Missing WWW-Authenticate header in a 401 response.", null);
                            }
                            U3.n.d(nVar, new IOException(U3.y.g(i11) + " " + parseInt));
                            return;
                        }
                        switch (i11) {
                            case 1:
                            case 3:
                            case 7:
                            case 8:
                            case 9:
                            case R.styleable.GradientColor_android_endY /* 11 */:
                            case 12:
                                return;
                            case 2:
                                U3.D a10 = U3.E.a(a9);
                                U3.A a11 = U3.A.f7298c;
                                String str2 = (String) a10.f7316a.get("range");
                                if (str2 != null) {
                                    try {
                                        a11 = U3.A.a(str2);
                                    } catch (j0 e10) {
                                        iVar.R("SDP format error.", e10);
                                        return;
                                    }
                                }
                                S a12 = U3.n.a(a10, nVar.f7413h);
                                if (a12.isEmpty()) {
                                    iVar.R("No playable track.", null);
                                    return;
                                } else {
                                    iVar.S(a11, a12);
                                    nVar.f7419o = true;
                                    return;
                                }
                            case 4:
                                F o9 = F.o(U3.y.b(oVar.b("Public")));
                                if (nVar.f7416l == null) {
                                    if (!o9.isEmpty() && !o9.contains(2)) {
                                        iVar.R("DESCRIBE not supported.", null);
                                        return;
                                    }
                                    e8.r(e8.j(2, nVar.f7415k, x5, nVar.f7413h));
                                    return;
                                }
                                return;
                            case 5:
                                if (nVar.f7418n == 2) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                AbstractC1566a.m(z12);
                                nVar.f7418n = 1;
                                nVar.f7421q = false;
                                long j10 = nVar.f7422r;
                                if (j10 != -9223372036854775807L) {
                                    nVar.F(y.T(j10));
                                    return;
                                }
                                return;
                            case 6:
                                String b11 = oVar.b("Range");
                                if (b11 == null) {
                                    a5 = U3.A.f7298c;
                                } else {
                                    a5 = U3.A.a(b11);
                                }
                                try {
                                    String b12 = oVar.b("RTP-Info");
                                    if (b12 == null) {
                                        P5.D d10 = F.f5901b;
                                        s9 = S.f5926e;
                                    } else {
                                        s9 = B.a(nVar.f7413h, b12);
                                    }
                                } catch (j0 unused2) {
                                    P5.D d11 = F.f5901b;
                                    s9 = S.f5926e;
                                }
                                F o10 = F.o(s9);
                                if (nVar.f7418n == 1) {
                                    z18 = true;
                                }
                                AbstractC1566a.m(z18);
                                nVar.f7418n = 2;
                                if (nVar.f7416l == null) {
                                    U3.m mVar = new U3.m(nVar);
                                    nVar.f7416l = mVar;
                                    if (!mVar.f7404b) {
                                        mVar.f7404b = true;
                                        mVar.f7403a.postDelayed(mVar, 30000L);
                                    }
                                }
                                nVar.f7422r = -9223372036854775807L;
                                nVar.f7407b.O(y.H(a5.f7300a), o10);
                                return;
                            case R.styleable.GradientColor_android_endX /* 10 */:
                                String b13 = oVar.b("Session");
                                String b14 = oVar.b("Transport");
                                if (b13 != null && b14 != null) {
                                    Matcher matcher2 = U3.y.f7485d.matcher(b13);
                                    if (matcher2.matches()) {
                                        String group2 = matcher2.group(1);
                                        group2.getClass();
                                        String group3 = matcher2.group(2);
                                        if (group3 != null) {
                                            try {
                                                Integer.parseInt(group3);
                                            } catch (NumberFormatException e11) {
                                                throw j0.b(b13, e11);
                                            }
                                        }
                                        if (nVar.f7418n != -1) {
                                            z17 = true;
                                        }
                                        AbstractC1566a.m(z17);
                                        nVar.f7418n = 1;
                                        nVar.f7415k = group2;
                                        nVar.g();
                                        return;
                                    }
                                    throw j0.b(b13, null);
                                }
                                throw j0.b("Missing mandatory session or transport header", null);
                            default:
                                throw new IllegalStateException();
                        }
                        U3.n.d(nVar, new IOException(e9));
                        return;
                    }
                    return;
                }
                Matcher matcher3 = U3.y.f7482a.matcher((CharSequence) f9.get(0));
                AbstractC1566a.h(matcher3.matches());
                String group4 = matcher3.group(1);
                group4.getClass();
                U3.y.a(group4);
                String group5 = matcher3.group(2);
                group5.getClass();
                Uri.parse(group5);
                int indexOf2 = f9.indexOf("");
                if (indexOf2 > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.h(z9);
                List subList2 = f9.subList(1, indexOf2);
                C1671f c1671f2 = new C1671f(21);
                c1671f2.l(subList2);
                U3.o oVar2 = new U3.o(c1671f2);
                new O5.g(U3.y.f7489h, 0).a(f9.subList(indexOf2 + 1, f9.size()));
                String b15 = oVar2.b("CSeq");
                b15.getClass();
                int parseInt3 = Integer.parseInt(b15);
                U3.n nVar2 = (U3.n) e8.f48d;
                E e12 = new E(405, new U3.o(new C1671f(nVar2.f7408c, parseInt3, nVar2.f7415k)), "");
                U3.o oVar3 = (U3.o) e12.f47c;
                if (oVar3.b("CSeq") != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AbstractC1566a.h(z10);
                C c9 = new C();
                int i13 = e12.f46b;
                if (i13 != 200) {
                    if (i13 != 461) {
                        if (i13 != 500) {
                            if (i13 != 505) {
                                if (i13 != 301) {
                                    if (i13 != 302) {
                                        if (i13 != 400) {
                                            if (i13 != 401) {
                                                if (i13 != 404) {
                                                    if (i13 != 405) {
                                                        switch (i13) {
                                                            case 454:
                                                                str = "Session Not Found";
                                                                break;
                                                            case 455:
                                                                str = "Method Not Valid In This State";
                                                                break;
                                                            case 456:
                                                                str = "Header Field Not Valid";
                                                                break;
                                                            case 457:
                                                                str = "Invalid Range";
                                                                break;
                                                            default:
                                                                throw new IllegalArgumentException();
                                                        }
                                                    } else {
                                                        str = "Method Not Allowed";
                                                    }
                                                } else {
                                                    str = "Not Found";
                                                }
                                            } else {
                                                str = "Unauthorized";
                                            }
                                        } else {
                                            str = "Bad Request";
                                        }
                                    } else {
                                        str = "Move Temporarily";
                                    }
                                } else {
                                    str = "Move Permanently";
                                }
                            } else {
                                str = "RTSP Version Not Supported";
                            }
                        } else {
                            str = "Internal Server Error";
                        }
                    } else {
                        str = "Unsupported Transport";
                    }
                } else {
                    str = "OK";
                }
                int i14 = y.f20553a;
                Locale locale = Locale.US;
                c9.a("RTSP/1.0 " + i13 + " " + str);
                G g9 = oVar3.f7423a;
                f0 it = g9.f5902d.keySet().iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    F c10 = g9.c(str3);
                    for (int i15 = 0; i15 < c10.size(); i15++) {
                        c9.a(String.format(Locale.US, "%s: %s", str3, c10.get(i15)));
                    }
                }
                c9.a("");
                c9.a((String) e12.f48d);
                nVar2.f7414i.d(c9.d());
                e8.f46b = Math.max(e8.f46b, parseInt3 + 1);
                return;
            case 8:
                w wVar = (w) this.f535b;
                byte[] bArr = (byte[]) this.f536c;
                wVar.getClass();
                try {
                    wVar.f7471a.write(bArr);
                    return;
                } catch (Exception unused3) {
                    if (!wVar.f7474d.f7481f) {
                        O0.c cVar4 = wVar.f7474d.f7476a;
                        return;
                    }
                    return;
                }
            case 9:
                ((R0) this.f535b).a((Intent) this.f536c);
                return;
            case R.styleable.GradientColor_android_endX /* 10 */:
                C1177i c1177i = (C1177i) this.f536c;
                u uVar = FirebaseMessaging.f16440l;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f535b;
                firebaseMessaging.getClass();
                try {
                    c1177i.b(firebaseMessaging.a());
                    return;
                } catch (Exception e13) {
                    c1177i.a(e13);
                    return;
                }
            case R.styleable.GradientColor_android_endY /* 11 */:
                C1177i c1177i2 = (C1177i) this.f536c;
                try {
                    c1177i2.b(((com.google.firebase.messaging.m) this.f535b).a());
                    return;
                } catch (Exception e14) {
                    c1177i2.a(e14);
                    return;
                }
            case 12:
                int i16 = JobInfoSchedulerService.f14497a;
                ((JobInfoSchedulerService) this.f535b).jobFinished((JobParameters) this.f536c, false);
                return;
            case 13:
                Runnable runnable2 = (Runnable) this.f536c;
                ((I) this.f535b).getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                }
            case 14:
                C1441D c1441d = (C1441D) this.f535b;
                j3.G g10 = (j3.G) this.f536c;
                int i17 = c1441d.f19261f0 - g10.f19332c;
                c1441d.f19261f0 = i17;
                if (g10.f19333d) {
                    c1441d.f19263g0 = g10.f19334e;
                    c1441d.f19265h0 = true;
                }
                if (g10.f19335f) {
                    c1441d.f19267i0 = g10.f19336g;
                }
                if (i17 == 0) {
                    E0 e02 = g10.f19331b.f19667a;
                    if (!c1441d.f19251F0.f19667a.p() && e02.p()) {
                        c1441d.f19252G0 = -1;
                        c1441d.f19253H0 = 0L;
                    }
                    if (!e02.p()) {
                        List asList = Arrays.asList(((u0) e02).f19750h);
                        if (asList.size() == c1441d.f19277o.size()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        AbstractC1566a.m(z14);
                        for (int i18 = 0; i18 < asList.size(); i18++) {
                            ((C1440C) c1441d.f19277o.get(i18)).f19234b = (E0) asList.get(i18);
                        }
                    }
                    if (c1441d.f19265h0) {
                        if (g10.f19331b.f19668b.equals(c1441d.f19251F0.f19668b) && g10.f19331b.f19670d == c1441d.f19251F0.f19683r) {
                            z15 = false;
                        }
                        if (z15) {
                            if (!e02.p() && !g10.f19331b.f19668b.a()) {
                                l0 l0Var = g10.f19331b;
                                A a13 = l0Var.f19668b;
                                long j11 = l0Var.f19670d;
                                Object obj = a13.f5207a;
                                C0 c02 = c1441d.f19275n;
                                e02.g(obj, c02);
                                j9 = j11 + c02.f19239e;
                            } else {
                                j9 = g10.f19331b.f19670d;
                            }
                            j4 = j9;
                            z13 = z15;
                            c1441d.f19265h0 = false;
                            c1441d.K0(g10.f19331b, 1, c1441d.f19267i0, false, z13, c1441d.f19263g0, j4, -1, false);
                            return;
                        }
                        z13 = z15;
                    } else {
                        z13 = false;
                    }
                    j4 = -9223372036854775807L;
                    c1441d.f19265h0 = false;
                    c1441d.K0(g10.f19331b, 1, c1441d.f19267i0, false, z13, c1441d.f19263g0, j4, -1, false);
                    return;
                }
                return;
            case 15:
                t0 t0Var = (t0) this.f536c;
                ((J) this.f535b).getClass();
                try {
                    synchronized (t0Var) {
                    }
                    try {
                        t0Var.f19733a.d(t0Var.f19736d, t0Var.f19737e);
                        return;
                    } finally {
                        t0Var.b(true);
                    }
                } catch (C1462m e15) {
                    AbstractC1566a.u("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e15);
                    throw new RuntimeException(e15);
                }
            case 16:
                if (!((SearchFragment) this.f535b).h0().f20222m) {
                    ((AbstractC0204u0) this.f536c).f4098B.h0(0);
                    return;
                }
                return;
            case 17:
                a();
                return;
            case 18:
                b();
                return;
            case 19:
                ((k4.r) this.f536c).a(((l4.s) this.f535b).e());
                return;
            case 20:
                C1564m c1564m = (C1564m) this.f535b;
                c1564m.getClass();
                int i19 = y.f20553a;
                C1441D c1441d2 = c1564m.f20414c.f19226a;
                v vVar = (v) this.f536c;
                c1441d2.f19249D0 = vVar;
                c1441d2.f19271l.e(25, new C1474z(vVar));
                return;
            case 21:
                c();
                return;
            case 22:
                C1627d c1627d = (C1627d) this.f535b;
                C1628e c1628e = c1627d.f21094d;
                if (c1628e.f21106m != 0 && !c1627d.f21093c) {
                    Looper looper = c1628e.f21110q;
                    looper.getClass();
                    c1627d.f21092b = c1628e.c(looper, c1627d.f21091a, (M) this.f536c, false);
                    c1628e.f21104k.add(c1627d);
                    return;
                }
                return;
            case 23:
                n4.k kVar = (n4.k) this.f535b;
                SurfaceTexture surfaceTexture = kVar.f21207g;
                Surface surface = kVar.f21208h;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.f536c;
                Surface surface2 = new Surface(surfaceTexture2);
                kVar.f21207g = surfaceTexture2;
                kVar.f21208h = surface2;
                Iterator it2 = kVar.f21201a.iterator();
                while (it2.hasNext()) {
                    ((SurfaceHolderCallbackC1438A) it2.next()).f19226a.G0(surface2);
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 24:
                d();
                return;
            case 25:
                e();
                return;
            case 26:
                ThreadFactoryC2016a threadFactoryC2016a = (ThreadFactoryC2016a) this.f535b;
                Process.setThreadPriority(threadFactoryC2016a.f23289c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC2016a.f23290d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f536c).run();
                return;
            case 27:
                Callable callable = (Callable) this.f535b;
                ScheduledFutureC2023h scheduledFutureC2023h = (ScheduledFutureC2023h) ((u) this.f536c).f16512a;
                try {
                    scheduledFutureC2023h.j(callable.call());
                    return;
                } catch (Exception e16) {
                    scheduledFutureC2023h.k(e16);
                    return;
                }
            case 28:
                ((y6.l) this.f535b).c((String) this.f536c, Boolean.FALSE);
                return;
            default:
                y6.l lVar = ((y6.p) this.f535b).f25092g;
                Thread currentThread = Thread.currentThread();
                lVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                y6.r rVar2 = lVar.f25074n;
                if (rVar2 == null || !rVar2.f25111e.get()) {
                    long j12 = currentTimeMillis / 1000;
                    String e17 = lVar.e();
                    if (e17 == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    c cVar5 = new c(e17, j12, Collections.EMPTY_MAP);
                    c1 c1Var = lVar.f25073m;
                    c1Var.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(e17);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    c1Var.h((Throwable) this.f536c, currentThread, "error", cVar5, false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ r(Object obj, int i9, Object obj2) {
        this.f534a = i9;
        this.f535b = obj;
        this.f536c = obj2;
    }

    public /* synthetic */ r(y6.p pVar, Throwable th) {
        this.f534a = 29;
        Map map = Collections.EMPTY_MAP;
        this.f535b = pVar;
        this.f536c = th;
    }
}
