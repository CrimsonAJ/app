package w;

import com.google.firebase.messaging.s;
import java.util.ArrayList;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2123c {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2122b f23927d;

    /* renamed from: a, reason: collision with root package name */
    public i f23924a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f23925b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f23926c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f23928e = false;

    public C2123c(s sVar) {
        this.f23927d = new C2121a(this, sVar);
    }

    public final void a(C2125e c2125e, int i9) {
        this.f23927d.b(c2125e.i(i9), 1.0f);
        this.f23927d.b(c2125e.i(i9), -1.0f);
    }

    public final void b(i iVar, i iVar2, i iVar3, int i9) {
        boolean z9 = false;
        if (i9 != 0) {
            if (i9 < 0) {
                i9 *= -1;
                z9 = true;
            }
            this.f23925b = i9;
        }
        if (!z9) {
            this.f23927d.b(iVar, -1.0f);
            this.f23927d.b(iVar2, 1.0f);
            this.f23927d.b(iVar3, 1.0f);
        } else {
            this.f23927d.b(iVar, 1.0f);
            this.f23927d.b(iVar2, -1.0f);
            this.f23927d.b(iVar3, -1.0f);
        }
    }

    public final void c(i iVar, i iVar2, i iVar3, int i9) {
        boolean z9 = false;
        if (i9 != 0) {
            if (i9 < 0) {
                i9 *= -1;
                z9 = true;
            }
            this.f23925b = i9;
        }
        if (!z9) {
            this.f23927d.b(iVar, -1.0f);
            this.f23927d.b(iVar2, 1.0f);
            this.f23927d.b(iVar3, -1.0f);
        } else {
            this.f23927d.b(iVar, 1.0f);
            this.f23927d.b(iVar2, -1.0f);
            this.f23927d.b(iVar3, 1.0f);
        }
    }

    public i d(boolean[] zArr) {
        return e(zArr, null);
    }

    public final i e(boolean[] zArr, i iVar) {
        int i9;
        int g9 = this.f23927d.g();
        i iVar2 = null;
        float f9 = 0.0f;
        for (int i10 = 0; i10 < g9; i10++) {
            float a5 = this.f23927d.a(i10);
            if (a5 < 0.0f) {
                i i11 = this.f23927d.i(i10);
                if ((zArr == null || !zArr[i11.f23952b]) && i11 != iVar && (((i9 = i11.f23961l) == 3 || i9 == 4) && a5 < f9)) {
                    f9 = a5;
                    iVar2 = i11;
                }
            }
        }
        return iVar2;
    }

    public final void f(i iVar) {
        i iVar2 = this.f23924a;
        if (iVar2 != null) {
            this.f23927d.b(iVar2, -1.0f);
            this.f23924a = null;
        }
        float d9 = this.f23927d.d(iVar, true) * (-1.0f);
        this.f23924a = iVar;
        if (d9 == 1.0f) {
            return;
        }
        this.f23925b /= d9;
        this.f23927d.j(d9);
    }

    public final void g(i iVar, boolean z9) {
        if (iVar.f23956f) {
            float c3 = this.f23927d.c(iVar);
            this.f23925b = (iVar.f23955e * c3) + this.f23925b;
            this.f23927d.d(iVar, z9);
            if (z9) {
                iVar.b(this);
            }
        }
    }

    public void h(C2123c c2123c, boolean z9) {
        float h7 = this.f23927d.h(c2123c, z9);
        this.f23925b = (c2123c.f23925b * h7) + this.f23925b;
        if (z9) {
            c2123c.f23924a.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            w.i r0 = r10.f23924a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            w.i r1 = r10.f23924a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = com.google.android.gms.internal.measurement.AbstractC0953k1.n(r0, r1)
            float r1 = r10.f23925b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f23925b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            w.b r5 = r10.f23927d
            int r5 = r5.g()
        L40:
            if (r4 >= r5) goto La0
            w.b r6 = r10.f23927d
            w.i r6 = r6.i(r4)
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            w.b r7 = r10.f23927d
            float r7 = r7.a(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9d
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7a
            java.lang.String r1 = "- "
            java.lang.String r0 = com.google.android.gms.internal.measurement.AbstractC0953k1.n(r0, r1)
        L68:
            float r7 = r7 * r9
            goto L7a
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = com.google.android.gms.internal.measurement.AbstractC0953k1.n(r0, r1)
            goto L7a
        L73:
            java.lang.String r1 = " - "
            java.lang.String r0 = com.google.android.gms.internal.measurement.AbstractC0953k1.n(r0, r1)
            goto L68
        L7a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L85
            java.lang.String r0 = com.google.android.gms.internal.measurement.AbstractC0953k1.n(r0, r6)
            goto L9c
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L9c:
            r1 = r3
        L9d:
            int r4 = r4 + 1
            goto L40
        La0:
            if (r1 != 0) goto La8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = com.google.android.gms.internal.measurement.AbstractC0953k1.n(r0, r1)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2123c.toString():java.lang.String");
    }
}
