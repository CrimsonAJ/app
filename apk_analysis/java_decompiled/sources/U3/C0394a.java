package U3;

import P5.X;
import b5.W;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import i8.C1411a;
import j3.j0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import l4.AbstractC1566a;
import q8.C1918a;

/* renamed from: U3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0394a {

    /* renamed from: a, reason: collision with root package name */
    public int f7336a;

    /* renamed from: b, reason: collision with root package name */
    public int f7337b;

    /* renamed from: c, reason: collision with root package name */
    public int f7338c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7339d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7340e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7341f;

    /* renamed from: g, reason: collision with root package name */
    public Object f7342g;

    /* renamed from: h, reason: collision with root package name */
    public Object f7343h;

    /* renamed from: i, reason: collision with root package name */
    public Object f7344i;

    public C0394a(W connectionPool, C1411a c1411a, n8.g call) {
        kotlin.jvm.internal.h.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.h.e(call, "call");
        this.f7339d = connectionPool;
        this.f7340e = c1411a;
        this.f7341f = call;
    }

    public static String b(int i9, int i10, int i11, String str) {
        int i12 = l4.y.f20553a;
        Locale locale = Locale.US;
        return i9 + " " + str + "/" + i10 + "/" + i11;
    }

    public C0396c a() {
        boolean z9;
        String b9;
        C0395b a5;
        HashMap hashMap = (HashMap) this.f7344i;
        try {
            if (hashMap.containsKey("rtpmap")) {
                String str = (String) hashMap.get("rtpmap");
                int i9 = l4.y.f20553a;
                a5 = C0395b.a(str);
            } else {
                int i10 = this.f7337b;
                if (i10 < 96) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.h(z9);
                if (i10 != 0) {
                    if (i10 != 8) {
                        if (i10 != 10) {
                            if (i10 == 11) {
                                b9 = b(11, 44100, 1, "L16");
                            } else {
                                throw new IllegalStateException(AbstractC0953k1.j(i10, "Unsupported static paylod type "));
                            }
                        } else {
                            b9 = b(10, 44100, 2, "L16");
                        }
                    } else {
                        b9 = b(8, 8000, 1, "PCMA");
                    }
                } else {
                    b9 = b(0, 8000, 1, "PCMU");
                }
                a5 = C0395b.a(b9);
            }
            return new C0396c(this, X.a(hashMap), a5);
        } catch (j0 e8) {
            throw new IllegalStateException(e8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d9  */
    /* JADX WARN: Type inference failed for: r2v23, types: [U6.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n8.i c(int r12, int r13, int r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.C0394a.c(int, int, int, boolean, boolean):n8.i");
    }

    public boolean d(i8.y url) {
        kotlin.jvm.internal.h.e(url, "url");
        i8.y yVar = ((C1411a) this.f7340e).f19063h;
        if (url.f19173e == yVar.f19173e && kotlin.jvm.internal.h.a(url.f19172d, yVar.f19172d)) {
            return true;
        }
        return false;
    }

    public void e(IOException e8) {
        kotlin.jvm.internal.h.e(e8, "e");
        this.f7344i = null;
        if ((e8 instanceof q8.A) && ((q8.A) e8).f22446a == 8) {
            this.f7336a++;
        } else if (e8 instanceof C1918a) {
            this.f7337b++;
        } else {
            this.f7338c++;
        }
    }

    public C0394a(String str, int i9, int i10, String str2) {
        this.f7339d = str;
        this.f7336a = i9;
        this.f7340e = str2;
        this.f7337b = i10;
        this.f7344i = new HashMap();
        this.f7338c = -1;
    }
}
