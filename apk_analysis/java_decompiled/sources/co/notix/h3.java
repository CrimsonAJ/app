package co.notix;

import Y7.B;
import Y7.InterfaceC0465h0;
import co.notix.appopen.AppOpenData;
import co.notix.banner.BannerData;
import co.notix.interstitial.InterstitialData;
import co.notix.p000native.NativeData;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final i3 f12351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12352b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12353c;

    public h3(i3 adLoaderDelegate, int i9) {
        kotlin.jvm.internal.h.e(adLoaderDelegate, "adLoaderDelegate");
        this.f12351a = adLoaderDelegate;
        this.f12352b = i9;
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.h.d(uuid, "randomUUID().toString()");
        this.f12353c = uuid;
    }

    public final e3 a() {
        c4 c4Var = (c4) this.f12351a;
        c4Var.getClass();
        return a((g) B.v(E7.j.f1978a, new q3(c4Var, null)));
    }

    public abstract e3 a(g gVar);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitNext(long r5, E7.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof co.notix.f3
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.f3 r0 = (co.notix.f3) r0
            int r1 = r0.f12219d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12219d = r1
            goto L18
        L13:
            co.notix.f3 r0 = new co.notix.f3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f12217b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12219d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            co.notix.h3 r5 = r0.f12216a
            a.AbstractC0485a.A(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            a.AbstractC0485a.A(r7)
            co.notix.i3 r7 = r4.f12351a
            r0.f12216a = r4
            r0.f12219d = r3
            co.notix.c4 r7 = (co.notix.c4) r7
            r7.getClass()
            co.notix.o3 r2 = new co.notix.o3
            r3 = 0
            r2.<init>(r7, r3)
            java.lang.Object r7 = Y7.B.D(r5, r2, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = r4
        L4d:
            co.notix.g r7 = (co.notix.g) r7
            co.notix.e3 r5 = r5.a(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.h3.awaitNext(long, E7.d):java.lang.Object");
    }

    public final void doOnNextAvailable(O7.l callback) {
        kotlin.jvm.internal.h.e(callback, "callback");
        doOnNextAvailable(callback, 5000L);
    }

    public /* bridge */ /* synthetic */ AppOpenData getNext() {
        return (AppOpenData) a();
    }

    public final boolean hasNext() {
        c4 c4Var = (c4) this.f12351a;
        c4Var.getClass();
        return ((Boolean) B.v(E7.j.f1978a, new r3(c4Var, null))).booleanValue();
    }

    public final void startLoading() {
        i3 i3Var = this.f12351a;
        String loaderId = this.f12353c;
        int i9 = this.f12352b;
        c4 c4Var = (c4) i3Var;
        c4Var.getClass();
        kotlin.jvm.internal.h.e(loaderId, "loaderId");
        if (c4Var.f11982i.isEmpty() && c4Var.f11984l == null) {
            c4Var.f11984l = B.r(c4Var.f11976c, null, new a4(c4Var, null), 3);
        }
        c4Var.f11982i.put(loaderId, Integer.valueOf(i9));
    }

    public final void stopLoading() {
        i3 i3Var = this.f12351a;
        String loaderId = this.f12353c;
        c4 c4Var = (c4) i3Var;
        c4Var.getClass();
        kotlin.jvm.internal.h.e(loaderId, "loaderId");
        c4Var.f11982i.remove(loaderId);
        if (c4Var.f11982i.isEmpty()) {
            InterfaceC0465h0 interfaceC0465h0 = c4Var.f11984l;
            if (interfaceC0465h0 != null) {
                interfaceC0465h0.d(null);
            }
            c4Var.f11984l = null;
        }
    }

    public final void doOnNextAvailable(O7.l callback, long j) {
        kotlin.jvm.internal.h.e(callback, "callback");
        i3 i3Var = this.f12351a;
        g3 g3Var = new g3(callback, this);
        c4 c4Var = (c4) i3Var;
        c4Var.getClass();
        B.r(c4Var.f11976c, null, new p3(g3Var, c4Var, j, null), 3);
    }

    /* renamed from: getNext, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ BannerData m0getNext() {
        return (BannerData) a();
    }

    /* renamed from: getNext, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterstitialData m1getNext() {
        return (InterstitialData) a();
    }

    /* renamed from: getNext, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ NativeData m2getNext() {
        return (NativeData) a();
    }
}
