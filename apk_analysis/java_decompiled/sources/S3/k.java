package S3;

import A3.C0000a;
import A3.C0002c;
import A3.C0003d;
import A3.C0005f;
import A3.G;
import B6.u0;
import P5.D;
import P5.F;
import P5.S;
import android.net.Uri;
import android.text.TextUtils;
import j3.L;
import j3.M;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import k4.C1516p;
import k4.InterfaceC1513m;
import l4.AbstractC1566a;
import l4.x;
import l4.y;
import n3.C1630g;
import q3.C1902g;
import q3.InterfaceC1905j;
import x3.C2172d;
import y3.C2213i;

/* loaded from: classes.dex */
public final class k extends P3.k {

    /* renamed from: j0, reason: collision with root package name */
    public static final AtomicInteger f6787j0 = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public final boolean f6788A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f6789B;

    /* renamed from: C, reason: collision with root package name */
    public b f6790C;

    /* renamed from: D, reason: collision with root package name */
    public r f6791D;

    /* renamed from: X, reason: collision with root package name */
    public int f6792X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public volatile boolean f6793Z;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f6794f0;

    /* renamed from: g0, reason: collision with root package name */
    public S f6795g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f6796h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f6797i0;

    /* renamed from: k, reason: collision with root package name */
    public final int f6798k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6799l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f6800m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f6801n;

    /* renamed from: o, reason: collision with root package name */
    public final int f6802o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC1513m f6803p;

    /* renamed from: q, reason: collision with root package name */
    public final C1516p f6804q;

    /* renamed from: r, reason: collision with root package name */
    public final b f6805r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f6806s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f6807t;

    /* renamed from: u, reason: collision with root package name */
    public final x f6808u;

    /* renamed from: v, reason: collision with root package name */
    public final c f6809v;

    /* renamed from: w, reason: collision with root package name */
    public final List f6810w;

    /* renamed from: x, reason: collision with root package name */
    public final C1630g f6811x;

    /* renamed from: y, reason: collision with root package name */
    public final I3.i f6812y;

    /* renamed from: z, reason: collision with root package name */
    public final A4.r f6813z;

    public k(c cVar, InterfaceC1513m interfaceC1513m, C1516p c1516p, M m9, boolean z9, InterfaceC1513m interfaceC1513m2, C1516p c1516p2, boolean z10, Uri uri, List list, int i9, Object obj, long j, long j4, long j9, int i10, boolean z11, int i11, boolean z12, boolean z13, x xVar, C1630g c1630g, b bVar, I3.i iVar, A4.r rVar, boolean z14, k3.l lVar) {
        super(interfaceC1513m, c1516p, m9, i9, obj, j, j4, j9);
        this.f6788A = z9;
        this.f6802o = i10;
        this.f6797i0 = z11;
        this.f6799l = i11;
        this.f6804q = c1516p2;
        this.f6803p = interfaceC1513m2;
        this.Y = c1516p2 != null;
        this.f6789B = z10;
        this.f6800m = uri;
        this.f6806s = z13;
        this.f6808u = xVar;
        this.f6807t = z12;
        this.f6809v = cVar;
        this.f6810w = list;
        this.f6811x = c1630g;
        this.f6805r = bVar;
        this.f6812y = iVar;
        this.f6813z = rVar;
        this.f6801n = z14;
        D d9 = F.f5901b;
        this.f6795g0 = S.f5926e;
        this.f6798k = f6787j0.getAndIncrement();
    }

    public static byte[] f(String str) {
        int i9;
        if (u0.L(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i9 = byteArray.length - 16;
        } else {
            i9 = 0;
        }
        System.arraycopy(byteArray, i9, bArr, (16 - byteArray.length) + i9, byteArray.length - i9);
        return bArr;
    }

    @Override // k4.J
    public final void a() {
        b bVar;
        this.f6791D.getClass();
        if (this.f6790C == null && (bVar = this.f6805r) != null) {
            InterfaceC1905j interfaceC1905j = bVar.f6755a;
            if ((interfaceC1905j instanceof G) || (interfaceC1905j instanceof C2213i)) {
                this.f6790C = bVar;
                this.Y = false;
            }
        }
        if (this.Y) {
            InterfaceC1513m interfaceC1513m = this.f6803p;
            interfaceC1513m.getClass();
            C1516p c1516p = this.f6804q;
            c1516p.getClass();
            e(interfaceC1513m, c1516p, this.f6789B, false);
            this.f6792X = 0;
            this.Y = false;
        }
        if (!this.f6793Z) {
            if (!this.f6807t) {
                e(this.f5846i, this.f5839b, this.f6788A, true);
            }
            this.f6794f0 = !this.f6793Z;
        }
    }

    @Override // k4.J
    public final void c() {
        this.f6793Z = true;
    }

    @Override // P3.k
    public final boolean d() {
        throw null;
    }

    public final void e(InterfaceC1513m interfaceC1513m, C1516p c1516p, boolean z9, boolean z10) {
        C1516p c3;
        long j;
        long j4;
        boolean z11 = false;
        if (z9) {
            if (this.f6792X != 0) {
                z11 = true;
            }
            c3 = c1516p;
        } else {
            c3 = c1516p.c(this.f6792X);
        }
        try {
            C1902g h7 = h(interfaceC1513m, c3, z10);
            if (z11) {
                h7.n(this.f6792X);
            }
            while (!this.f6793Z) {
                try {
                    try {
                        if (this.f6790C.f6755a.f(h7, b.f6754d) != 0) {
                            break;
                        }
                    } catch (EOFException e8) {
                        if ((this.f5841d.f19429e & 16384) != 0) {
                            this.f6790C.f6755a.b(0L, 0L);
                            j = h7.f22312d;
                            j4 = c1516p.f20081e;
                        } else {
                            throw e8;
                        }
                    }
                } catch (Throwable th) {
                    this.f6792X = (int) (h7.f22312d - c1516p.f20081e);
                    throw th;
                }
            }
            j = h7.f22312d;
            j4 = c1516p.f20081e;
            this.f6792X = (int) (j - j4);
        } finally {
            s8.n.h(interfaceC1513m);
        }
    }

    public final int g(int i9) {
        AbstractC1566a.m(!this.f6801n);
        S s9 = this.f6795g0;
        if (i9 >= s9.f5928d) {
            return 0;
        }
        return ((Integer) s9.get(i9)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1902g h(InterfaceC1513m interfaceC1513m, C1516p c1516p, boolean z9) {
        boolean z10;
        long j;
        long j4;
        String str;
        int i9;
        b bVar;
        b bVar2;
        int i10;
        ArrayList arrayList;
        x xVar;
        InterfaceC1905j c0000a;
        boolean z11;
        boolean z12;
        int i11;
        List list;
        List singletonList;
        int i12;
        int i13;
        long j9;
        boolean z13;
        InterfaceC1905j c2172d;
        long g9 = interfaceC1513m.g(c1516p);
        int i14 = 0;
        int i15 = 1;
        if (z9) {
            try {
                x xVar2 = this.f6808u;
                boolean z14 = this.f6806s;
                long j10 = this.f5844g;
                synchronized (xVar2) {
                    try {
                        if (xVar2.f20549a == 9223372036854775806L) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        AbstractC1566a.m(z10);
                        if (xVar2.f20550b == -9223372036854775807L) {
                            if (z14) {
                                xVar2.f20552d.set(Long.valueOf(j10));
                            } else {
                                while (xVar2.f20550b == -9223372036854775807L) {
                                    xVar2.wait();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        C1902g c1902g = new C1902g(interfaceC1513m, c1516p.f20081e, g9);
        if (this.f6790C == null) {
            A4.r rVar = this.f6813z;
            c1902g.f22314f = 0;
            try {
                rVar.E(10);
                c1902g.t((byte[]) rVar.f384c, 0, 10, false);
                if (rVar.z() == 4801587) {
                    rVar.I(3);
                    int w7 = rVar.w();
                    int i16 = w7 + 10;
                    byte[] bArr = (byte[]) rVar.f384c;
                    if (i16 > bArr.length) {
                        rVar.E(i16);
                        System.arraycopy(bArr, 0, (byte[]) rVar.f384c, 0, 10);
                    }
                    c1902g.t((byte[]) rVar.f384c, 10, w7, false);
                    D3.c a02 = this.f6812y.a0(w7, (byte[]) rVar.f384c);
                    if (a02 != null) {
                        for (D3.b bVar3 : a02.f1786a) {
                            if (bVar3 instanceof I3.m) {
                                I3.m mVar = (I3.m) bVar3;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.f3518b)) {
                                    System.arraycopy(mVar.f3519c, 0, (byte[]) rVar.f384c, 0, 8);
                                    rVar.H(0);
                                    rVar.G(8);
                                    j = rVar.q() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (EOFException unused2) {
            }
            j = -9223372036854775807L;
            c1902g.f22314f = 0;
            b bVar4 = this.f6805r;
            if (bVar4 != null) {
                InterfaceC1905j interfaceC1905j = bVar4.f6755a;
                if (!(interfaceC1905j instanceof G) && !(interfaceC1905j instanceof C2213i)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AbstractC1566a.m(!z13);
                InterfaceC1905j interfaceC1905j2 = bVar4.f6755a;
                boolean z15 = interfaceC1905j2 instanceof v;
                x xVar3 = bVar4.f6757c;
                M m9 = bVar4.f6756b;
                if (z15) {
                    c2172d = new v(m9.f19427c, xVar3);
                } else if (interfaceC1905j2 instanceof C0003d) {
                    c2172d = new C0003d();
                } else if (interfaceC1905j2 instanceof C0000a) {
                    c2172d = new C0000a();
                } else if (interfaceC1905j2 instanceof C0002c) {
                    c2172d = new C0002c();
                } else if (interfaceC1905j2 instanceof C2172d) {
                    c2172d = new C2172d();
                } else {
                    throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(interfaceC1905j2.getClass().getSimpleName()));
                }
                bVar2 = new b(c2172d, m9, xVar3);
                j4 = -9223372036854775807L;
                i9 = 1;
            } else {
                c cVar = this.f6809v;
                Uri uri = c1516p.f20077a;
                M m10 = this.f5841d;
                List list2 = this.f6810w;
                x xVar4 = this.f6808u;
                j4 = -9223372036854775807L;
                Map l9 = interfaceC1513m.l();
                cVar.getClass();
                int B9 = AbstractC1566a.B(m10.f19435l);
                List list3 = (List) l9.get("Content-Type");
                if (list3 != null && !list3.isEmpty()) {
                    str = (String) list3.get(0);
                } else {
                    str = null;
                }
                int B10 = AbstractC1566a.B(str);
                int C8 = AbstractC1566a.C(uri);
                ArrayList arrayList2 = new ArrayList(7);
                c.a(B9, arrayList2);
                c.a(B10, arrayList2);
                c.a(C8, arrayList2);
                int[] iArr = c.f6758b;
                int i17 = 0;
                for (int i18 = 7; i17 < i18; i18 = 7) {
                    c.a(iArr[i17], arrayList2);
                    i17++;
                }
                c1902g.f22314f = 0;
                int i19 = 0;
                InterfaceC1905j interfaceC1905j3 = null;
                while (true) {
                    if (i19 < arrayList2.size()) {
                        int intValue = ((Integer) arrayList2.get(i19)).intValue();
                        if (intValue != 0) {
                            if (intValue != i15) {
                                i9 = i15;
                                if (intValue != 2) {
                                    if (intValue != 7) {
                                        if (intValue != 8) {
                                            if (intValue != 11) {
                                                if (intValue != 13) {
                                                    i10 = i19;
                                                    arrayList = arrayList2;
                                                    xVar = xVar4;
                                                    c0000a = null;
                                                } else {
                                                    c0000a = new v(m10.f19427c, xVar4);
                                                    i10 = i19;
                                                    arrayList = arrayList2;
                                                }
                                            } else {
                                                if (list2 != null) {
                                                    i12 = 48;
                                                    singletonList = list2;
                                                } else {
                                                    L l10 = new L();
                                                    l10.f19402k = "application/cea-608";
                                                    singletonList = Collections.singletonList(new M(l10));
                                                    i12 = 16;
                                                }
                                                i10 = i19;
                                                String str2 = m10.f19433i;
                                                arrayList = arrayList2;
                                                if (!TextUtils.isEmpty(str2)) {
                                                    if (l4.n.b(str2, "audio/mp4a-latm") == null) {
                                                        i12 |= 2;
                                                    }
                                                    if (l4.n.b(str2, "video/avc") == null) {
                                                        i12 |= 4;
                                                    }
                                                }
                                                c0000a = new G(2, xVar4, new C0005f(singletonList, i12));
                                            }
                                            xVar = xVar4;
                                        } else {
                                            i10 = i19;
                                            arrayList = arrayList2;
                                            x xVar5 = xVar4;
                                            D3.c cVar2 = m10.j;
                                            if (cVar2 != null) {
                                                int i20 = 0;
                                                while (true) {
                                                    D3.b[] bVarArr = cVar2.f1786a;
                                                    if (i20 >= bVarArr.length) {
                                                        break;
                                                    }
                                                    D3.b bVar5 = bVarArr[i20];
                                                    if (bVar5 instanceof u) {
                                                        z12 = !((u) bVar5).f6919c.isEmpty();
                                                        break;
                                                    }
                                                    i20++;
                                                }
                                            }
                                            z12 = false;
                                            if (z12) {
                                                i11 = 4;
                                            } else {
                                                i11 = 0;
                                            }
                                            if (list2 != null) {
                                                list = list2;
                                            } else {
                                                list = Collections.EMPTY_LIST;
                                            }
                                            xVar = xVar5;
                                            c0000a = new C2213i(i11, xVar5, null, list, null);
                                        }
                                    } else {
                                        i10 = i19;
                                        arrayList = arrayList2;
                                        xVar = xVar4;
                                        c0000a = new C2172d(0L);
                                    }
                                } else {
                                    i10 = i19;
                                    arrayList = arrayList2;
                                    xVar = xVar4;
                                    c0000a = new C0003d();
                                }
                            } else {
                                i10 = i19;
                                arrayList = arrayList2;
                                i9 = i15;
                                xVar = xVar4;
                                c0000a = new C0002c();
                            }
                        } else {
                            i10 = i19;
                            arrayList = arrayList2;
                            i9 = i15;
                            xVar = xVar4;
                            c0000a = new C0000a();
                        }
                        c0000a.getClass();
                        try {
                            z11 = c0000a.j(c1902g);
                            i14 = 0;
                            c1902g.f22314f = 0;
                        } catch (EOFException unused3) {
                            i14 = 0;
                            c1902g.f22314f = 0;
                            z11 = false;
                        } catch (Throwable th2) {
                            c1902g.f22314f = 0;
                            throw th2;
                        }
                        if (z11) {
                            bVar = new b(c0000a, m10, xVar);
                            break;
                        }
                        if (interfaceC1905j3 == null && (intValue == B9 || intValue == B10 || intValue == C8 || intValue == 11)) {
                            interfaceC1905j3 = c0000a;
                        }
                        xVar4 = xVar;
                        i19 = i10 + 1;
                        i15 = i9;
                        arrayList2 = arrayList;
                    } else {
                        i9 = i15;
                        interfaceC1905j3.getClass();
                        bVar = new b(interfaceC1905j3, m10, xVar4);
                        break;
                    }
                }
                bVar2 = bVar;
            }
            this.f6790C = bVar2;
            InterfaceC1905j interfaceC1905j4 = bVar2.f6755a;
            if (!(interfaceC1905j4 instanceof C0003d) && !(interfaceC1905j4 instanceof C0000a) && !(interfaceC1905j4 instanceof C0002c) && !(interfaceC1905j4 instanceof C2172d)) {
                i13 = i14;
            } else {
                i13 = i9;
            }
            if (i13 != 0) {
                r rVar2 = this.f6791D;
                if (j != j4) {
                    j9 = this.f6808u.b(j);
                } else {
                    j9 = this.f5844g;
                }
                if (rVar2.f6901t0 != j9) {
                    rVar2.f6901t0 = j9;
                    q[] qVarArr = rVar2.f6904v;
                    int length = qVarArr.length;
                    int i21 = i14;
                    while (i21 < length) {
                        q qVar = qVarArr[i21];
                        if (qVar.f5052F != j9) {
                            qVar.f5052F = j9;
                            qVar.f5078z = i9;
                        }
                        i21++;
                        i9 = 1;
                    }
                }
            } else {
                r rVar3 = this.f6791D;
                if (rVar3.f6901t0 != 0) {
                    rVar3.f6901t0 = 0L;
                    q[] qVarArr2 = rVar3.f6904v;
                    int length2 = qVarArr2.length;
                    for (int i22 = i14; i22 < length2; i22++) {
                        q qVar2 = qVarArr2[i22];
                        if (qVar2.f5052F != 0) {
                            qVar2.f5052F = 0L;
                            qVar2.f5078z = true;
                        }
                    }
                }
            }
            this.f6791D.f6907x.clear();
            this.f6790C.f6755a.i(this.f6791D);
        }
        r rVar4 = this.f6791D;
        C1630g c1630g = this.f6811x;
        if (!y.a(rVar4.f6903u0, c1630g)) {
            rVar4.f6903u0 = c1630g;
            while (true) {
                q[] qVarArr3 = rVar4.f6904v;
                if (i14 >= qVarArr3.length) {
                    break;
                }
                if (rVar4.f6888m0[i14]) {
                    q qVar3 = qVarArr3[i14];
                    qVar3.f6861I = c1630g;
                    qVar3.f5078z = true;
                }
                i14++;
            }
        }
        return c1902g;
    }
}
