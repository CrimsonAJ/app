package j2;

import M1.D;
import N3.C0266q;
import N3.C0270v;
import android.util.Log;
import android.view.Display;
import c7.C0784d;
import c7.n;
import co.notix.R;
import com.anilab.android.ui.register.RegisterFragment;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.messaging.s;
import f.C1148a;
import f5.AbstractC1176h;
import f5.InterfaceC1169a;
import f7.InterfaceC1187a;
import i4.v;
import j3.C1446b0;
import j3.C1461l;
import j3.C1462m;
import j3.SurfaceHolderCallbackC1438A;
import j3.Y;
import j3.m0;
import j3.p0;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import k3.C1485a;
import k3.C1494j;
import l4.AbstractC1566a;
import l4.y;
import m4.t;
import p.c1;
import q3.C1909n;
import q3.InterfaceC1898c;
import t0.W;
import t0.X;
import v6.C2110a;
import v6.C2111b;
import v6.C2112c;
import y3.C2213i;
import y3.o;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1435b implements f.b, l4.i, InterfaceC1898c, s6.d, S6.a, z5.i, O5.f, InterfaceC1169a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19200b;

    public /* synthetic */ C1435b(int i9, Object obj) {
        this.f19199a = i9;
        this.f19200b = obj;
    }

    public void a(Display display) {
        t tVar = (t) this.f19200b;
        tVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            tVar.f20820k = refreshRate;
            tVar.f20821l = (refreshRate * 80) / 100;
        } else {
            AbstractC1566a.P("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            tVar.f20820k = -9223372036854775807L;
            tVar.f20821l = -9223372036854775807L;
        }
    }

    @Override // O5.f
    public Object apply(Object obj) {
        o oVar = (o) obj;
        ((C2213i) this.f19200b).getClass();
        return oVar;
    }

    @Override // f.b
    public void d(Object obj) {
        RegisterFragment registerFragment = (RegisterFragment) this.f19200b;
        C1148a c1148a = (C1148a) obj;
        if (c1148a.f17224a == -1) {
            try {
                String str = ((GoogleSignInAccount) s8.e.F(c1148a.f17225b).h(C4.e.class)).f14546c;
                if (str != null) {
                    j jVar = (j) registerFragment.f13823D0.getValue();
                    jVar.getClass();
                    jVar.d(true, new h(jVar, str, null));
                    return;
                }
                registerFragment.o0(new D(R.string.message_login_failed));
            } catch (C4.e e8) {
                if (e8.f1568a.f14660a == 7) {
                    registerFragment.o0(new D(R.string.message_no_internet));
                } else {
                    registerFragment.o0(new D(R.string.msg_unknown_error));
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:1|(1:3)(1:166)|4|(1:6)|(1:8)(1:165)|9|(3:160|161|(1:163)(1:164))(3:13|(3:156|157|(1:159))(4:17|(2:20|18)|21|22)|23)|24|(1:26)|27|(3:29|(3:31|32|33)(1:35)|34)|36|37|(23:38|39|(1:41)(1:153)|42|43|(1:45)|46|47|(1:49)|50|(1:52)|(1:54)(1:151)|55|(2:56|(3:58|(2:60|61)(1:63)|62)(1:64))|65|(1:67)|68|69|(1:71)(1:150)|(1:73)(1:149)|74|(5:136|(1:138)|139|41b|144)(1:78)|79)|(18:83|(1:85)(2:132|(1:134))|(3:87|(1:89)|90)(2:128|(2:130|131))|91|92|93|94|95|96|97|(8:119|120|(1:122)|123|110|111|(2:113|(1:115))|116)|106|(1:108)|109|110|111|(0)|116)|135|(0)(0)|91|92|93|94|95|96|97|(2:99|101)|119|120|(0)|123|110|111|(0)|116) */
    /* JADX WARN: Can't wrap try/catch for region: R(55:1|(1:3)(1:166)|4|(1:6)|(1:8)(1:165)|9|(3:160|161|(1:163)(1:164))(3:13|(3:156|157|(1:159))(4:17|(2:20|18)|21|22)|23)|24|(1:26)|27|(3:29|(3:31|32|33)(1:35)|34)|36|37|38|39|(1:41)(1:153)|42|43|(1:45)|46|47|(1:49)|50|(1:52)|(1:54)(1:151)|55|(2:56|(3:58|(2:60|61)(1:63)|62)(1:64))|65|(1:67)|68|69|(1:71)(1:150)|(1:73)(1:149)|74|(5:136|(1:138)|139|41b|144)(1:78)|79|(18:83|(1:85)(2:132|(1:134))|(3:87|(1:89)|90)(2:128|(2:130|131))|91|92|93|94|95|96|97|(8:119|120|(1:122)|123|110|111|(2:113|(1:115))|116)|106|(1:108)|109|110|111|(0)|116)|135|(0)(0)|91|92|93|94|95|96|97|(2:99|101)|119|120|(0)|123|110|111|(0)|116) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x05ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x05e4, code lost:
    
        android.util.Log.e(r2, "Crashlytics was not started due to an exception during initialization", r0);
        r15.f25092g = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x046e  */
    /* JADX WARN: Type inference failed for: r4v19, types: [G6.e, java.lang.Object] */
    @Override // s6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(Y2.r r57) {
        /*
            Method dump skipped, instructions count: 1664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C1435b.e(Y2.r):java.lang.Object");
    }

    @Override // S6.a
    public void h(S6.b bVar) {
        switch (this.f19199a) {
            case 17:
                C2110a c2110a = (C2110a) this.f19200b;
                c2110a.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                c2110a.f23898b.set((C2110a) bVar.get());
                return;
            default:
                s sVar = ((n) ((InterfaceC1187a) bVar.get())).a().f11721i;
                Set set = (Set) sVar.f16507e;
                C2111b c2111b = (C2111b) this.f19200b;
                set.add(c2111b);
                AbstractC1176h b9 = ((d7.d) sVar.f16504b).b();
                b9.d((Executor) sVar.f16506d, new C0784d(sVar, b9, c2111b, 4));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                    return;
                }
                return;
        }
    }

    @Override // f5.InterfaceC1169a
    public Object i(AbstractC1176h abstractC1176h) {
        boolean z9;
        switch (this.f19199a) {
            case 21:
                ((c1) this.f19200b).getClass();
                if (abstractC1176h.j()) {
                    y6.b bVar = (y6.b) abstractC1176h.g();
                    C2112c c2112c = C2112c.f23900a;
                    c2112c.c("Crashlytics report successfully enqueued to DataTransport: " + bVar.f25031b);
                    File file = bVar.f25032c;
                    if (file.delete()) {
                        c2112c.c("Deleted report file: " + file.getPath());
                    } else {
                        c2112c.g("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                    z9 = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", abstractC1176h.f());
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 22:
                ((CountDownLatch) this.f19200b).countDown();
                return null;
            case 23:
                return (AbstractC1176h) ((y6.j) this.f19200b).call();
            default:
                ((Runnable) this.f19200b).run();
                return s8.n.p(null);
        }
    }

    @Override // l4.i
    public void invoke(Object obj) {
        switch (this.f19199a) {
            case 1:
                ((p0) obj).B((C1446b0) this.f19200b);
                return;
            case 2:
                ((p0) obj).r((v) this.f19200b);
                return;
            case 3:
                ((p0) obj).o((List) this.f19200b);
                return;
            case 4:
                ((p0) obj).y((Y3.c) this.f19200b);
                return;
            case 5:
                ((p0) obj).B(((SurfaceHolderCallbackC1438A) this.f19200b).f19226a.f19272l0);
                return;
            case 6:
                ((p0) obj).t((D3.c) this.f19200b);
                return;
            case 7:
                ((p0) obj).f((C1461l) this.f19200b);
                return;
            case 8:
                C1494j c1494j = (C1494j) obj;
                c1494j.getClass();
                c1494j.f19973v = ((C0270v) this.f19200b).f5200a;
                return;
            case 9:
                ((C1494j) obj).f19965n = (C1462m) this.f19200b;
                return;
            case R.styleable.GradientColor_android_endX /* 10 */:
                C1494j c1494j2 = (C1494j) obj;
                int i9 = c1494j2.f19975x;
                m3.d dVar = (m3.d) this.f19200b;
                c1494j2.f19975x = i9 + dVar.f20698g;
                c1494j2.f19976y += dVar.f20696e;
                return;
            case R.styleable.GradientColor_android_endY /* 11 */:
            default:
                ((p0) obj).K((Y) this.f19200b, 2);
                return;
            case 12:
                ((p0) obj).A((m0) this.f19200b);
                return;
        }
    }

    @Override // q3.InterfaceC1898c
    public long k(long j) {
        return y.j((j * r0.f22328e) / 1000000, 0L, ((C1909n) this.f19200b).j - 1);
    }

    public /* synthetic */ C1435b(C1485a c1485a, C0266q c0266q, C0270v c0270v, IOException iOException, boolean z9) {
        this.f19199a = 8;
        this.f19200b = c0270v;
    }

    public /* synthetic */ C1435b(C1485a c1485a, Object obj, int i9) {
        this.f19199a = i9;
        this.f19200b = obj;
    }

    public /* synthetic */ C1435b(X x5, W w7) {
        this.f19199a = 14;
        this.f19200b = x5;
    }
}
