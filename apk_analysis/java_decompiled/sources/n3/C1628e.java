package n3;

import P5.D;
import P5.F;
import P5.I;
import P5.S;
import P5.f0;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import b5.G1;
import f5.C1183o;
import i.G;
import j3.AbstractC1455g;
import j3.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k4.C1499E;
import l4.AbstractC1566a;

/* renamed from: n3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1628e implements InterfaceC1638o {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f21095a;

    /* renamed from: b, reason: collision with root package name */
    public final k8.a f21096b;

    /* renamed from: c, reason: collision with root package name */
    public final G1 f21097c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f21098d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f21099e;

    /* renamed from: f, reason: collision with root package name */
    public final C1499E f21100f;

    /* renamed from: g, reason: collision with root package name */
    public final e1.q f21101g;

    /* renamed from: h, reason: collision with root package name */
    public final C1183o f21102h;

    /* renamed from: i, reason: collision with root package name */
    public final long f21103i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final Set f21104k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f21105l;

    /* renamed from: m, reason: collision with root package name */
    public int f21106m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC1645v f21107n;

    /* renamed from: o, reason: collision with root package name */
    public C1625b f21108o;

    /* renamed from: p, reason: collision with root package name */
    public C1625b f21109p;

    /* renamed from: q, reason: collision with root package name */
    public Looper f21110q;

    /* renamed from: r, reason: collision with root package name */
    public Handler f21111r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f21112s;

    /* renamed from: t, reason: collision with root package name */
    public k3.l f21113t;

    /* renamed from: u, reason: collision with root package name */
    public volatile C3.e f21114u;

    public C1628e(UUID uuid, G1 g12, HashMap hashMap, int[] iArr, e1.q qVar) {
        k8.a aVar = C1649z.f21146d;
        uuid.getClass();
        AbstractC1566a.g("Use C.CLEARKEY_UUID instead", !AbstractC1455g.f19617b.equals(uuid));
        this.f21095a = uuid;
        this.f21096b = aVar;
        this.f21097c = g12;
        this.f21098d = hashMap;
        this.f21099e = iArr;
        this.f21101g = qVar;
        this.f21100f = new C1499E(8);
        this.f21102h = new C1183o(10, this);
        this.j = new ArrayList();
        this.f21104k = Collections.newSetFromMap(new IdentityHashMap());
        this.f21105l = Collections.newSetFromMap(new IdentityHashMap());
        this.f21103i = 300000L;
    }

    public static boolean d(C1625b c1625b) {
        if (c1625b.f21081n == 1) {
            if (l4.y.f20553a >= 19) {
                C1631h f9 = c1625b.f();
                f9.getClass();
                if (!(f9.getCause() instanceof ResourceBusyException)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static ArrayList i(C1630g c1630g, UUID uuid, boolean z9) {
        ArrayList arrayList = new ArrayList(c1630g.f21123d);
        for (int i9 = 0; i9 < c1630g.f21123d; i9++) {
            C1629f c1629f = c1630g.f21120a[i9];
            if ((c1629f.a(uuid) || (AbstractC1455g.f19618c.equals(uuid) && c1629f.a(AbstractC1455g.f19617b))) && (c1629f.f21119e != null || z9)) {
                arrayList.add(c1629f);
            }
        }
        return arrayList;
    }

    @Override // n3.InterfaceC1638o
    public final void a() {
        int i9 = this.f21106m - 1;
        this.f21106m = i9;
        if (i9 != 0) {
            return;
        }
        if (this.f21103i != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.j);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((C1625b) arrayList.get(i10)).e(null);
            }
        }
        f0 it = I.p(this.f21104k).iterator();
        while (it.hasNext()) {
            ((C1627d) it.next()).a();
        }
        k();
    }

    @Override // n3.InterfaceC1638o
    public final void b() {
        InterfaceC1645v cVar;
        int i9 = this.f21106m;
        this.f21106m = i9 + 1;
        if (i9 == 0) {
            if (this.f21107n == null) {
                UUID uuid = this.f21095a;
                this.f21096b.getClass();
                try {
                    try {
                        try {
                            cVar = new C1649z(uuid);
                        } catch (Exception e8) {
                            throw new Exception(e8);
                        }
                    } catch (UnsupportedSchemeException e9) {
                        throw new Exception(e9);
                    }
                } catch (C1623C unused) {
                    AbstractC1566a.t("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    cVar = new e0.c(9);
                }
                this.f21107n = cVar;
                cVar.g(new G(7, this));
                return;
            }
            if (this.f21103i != -9223372036854775807L) {
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.j;
                    if (i10 < arrayList.size()) {
                        ((C1625b) arrayList.get(i10)).a(null);
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final InterfaceC1632i c(Looper looper, C1635l c1635l, M m9, boolean z9) {
        if (this.f21114u == null) {
            this.f21114u = new C3.e(this, looper, 7);
        }
        C1630g c1630g = m9.f19438o;
        int i9 = 0;
        ArrayList arrayList = null;
        if (c1630g == null) {
            int h7 = l4.n.h(m9.f19435l);
            InterfaceC1645v interfaceC1645v = this.f21107n;
            interfaceC1645v.getClass();
            if (interfaceC1645v.p() != 2 || !C1646w.f21140d) {
                int[] iArr = this.f21099e;
                while (true) {
                    if (i9 < iArr.length) {
                        if (iArr[i9] == h7) {
                            break;
                        }
                        i9++;
                    } else {
                        i9 = -1;
                        break;
                    }
                }
                if (i9 != -1 && interfaceC1645v.p() != 1) {
                    C1625b c1625b = this.f21108o;
                    if (c1625b == null) {
                        D d9 = F.f5901b;
                        C1625b f9 = f(S.f5926e, true, null, z9);
                        this.j.add(f9);
                        this.f21108o = f9;
                    } else {
                        c1625b.a(null);
                    }
                    return this.f21108o;
                }
            }
            return null;
        }
        if (this.f21112s == null) {
            arrayList = i(c1630g, this.f21095a, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f21095a);
                AbstractC1566a.u("DefaultDrmSessionMgr", "DRM error", exc);
                if (c1635l != null) {
                    c1635l.d(exc);
                }
                return new C1642s(new C1631h(exc, 6003));
            }
        }
        C1625b c1625b2 = this.f21109p;
        if (c1625b2 == null) {
            C1625b f10 = f(arrayList, false, c1635l, z9);
            this.f21109p = f10;
            this.j.add(f10);
            return f10;
        }
        c1625b2.a(c1635l);
        return c1625b2;
    }

    public final C1625b e(List list, boolean z9, C1635l c1635l) {
        this.f21107n.getClass();
        InterfaceC1645v interfaceC1645v = this.f21107n;
        byte[] bArr = this.f21112s;
        Looper looper = this.f21110q;
        looper.getClass();
        k3.l lVar = this.f21113t;
        lVar.getClass();
        C1625b c1625b = new C1625b(this.f21095a, interfaceC1645v, this.f21100f, this.f21102h, list, z9, z9, bArr, this.f21098d, this.f21097c, looper, this.f21101g, lVar);
        c1625b.a(c1635l);
        if (this.f21103i != -9223372036854775807L) {
            c1625b.a(null);
        }
        return c1625b;
    }

    public final C1625b f(List list, boolean z9, C1635l c1635l, boolean z10) {
        C1625b e8 = e(list, z9, c1635l);
        boolean d9 = d(e8);
        long j = this.f21103i;
        Set set = this.f21105l;
        if (d9 && !set.isEmpty()) {
            f0 it = I.p(set).iterator();
            while (it.hasNext()) {
                ((InterfaceC1632i) it.next()).e(null);
            }
            e8.e(c1635l);
            if (j != -9223372036854775807L) {
                e8.e(null);
            }
            e8 = e(list, z9, c1635l);
        }
        if (d(e8) && z10) {
            Set set2 = this.f21104k;
            if (!set2.isEmpty()) {
                f0 it2 = I.p(set2).iterator();
                while (it2.hasNext()) {
                    ((C1627d) it2.next()).a();
                }
                if (!set.isEmpty()) {
                    f0 it3 = I.p(set).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC1632i) it3.next()).e(null);
                    }
                }
                e8.e(c1635l);
                if (j != -9223372036854775807L) {
                    e8.e(null);
                }
                return e(list, z9, c1635l);
            }
        }
        return e8;
    }

    @Override // n3.InterfaceC1638o
    public final InterfaceC1632i g(C1635l c1635l, M m9) {
        boolean z9;
        if (this.f21106m > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        AbstractC1566a.n(this.f21110q);
        return c(this.f21110q, c1635l, m9, true);
    }

    @Override // n3.InterfaceC1638o
    public final int h(M m9) {
        InterfaceC1645v interfaceC1645v = this.f21107n;
        interfaceC1645v.getClass();
        int p9 = interfaceC1645v.p();
        C1630g c1630g = m9.f19438o;
        if (c1630g == null) {
            int h7 = l4.n.h(m9.f19435l);
            int i9 = 0;
            while (true) {
                int[] iArr = this.f21099e;
                if (i9 < iArr.length) {
                    if (iArr[i9] == h7) {
                        break;
                    }
                    i9++;
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 == -1) {
                return 0;
            }
        } else if (this.f21112s == null) {
            UUID uuid = this.f21095a;
            if (i(c1630g, uuid, true).isEmpty()) {
                if (c1630g.f21123d == 1 && c1630g.f21120a[0].a(AbstractC1455g.f19617b)) {
                    AbstractC1566a.P("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = c1630g.f21122c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : l4.y.f20553a < 25)) {
                return 1;
            }
        }
        return p9;
    }

    @Override // n3.InterfaceC1638o
    public final InterfaceC1637n j(C1635l c1635l, M m9) {
        boolean z9;
        if (this.f21106m > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        AbstractC1566a.n(this.f21110q);
        C1627d c1627d = new C1627d(this, c1635l);
        Handler handler = this.f21111r;
        handler.getClass();
        handler.post(new A6.r(c1627d, 22, m9));
        return c1627d;
    }

    public final void k() {
        if (this.f21107n != null && this.f21106m == 0 && this.j.isEmpty() && this.f21104k.isEmpty()) {
            InterfaceC1645v interfaceC1645v = this.f21107n;
            interfaceC1645v.getClass();
            interfaceC1645v.a();
            this.f21107n = null;
        }
    }

    @Override // n3.InterfaceC1638o
    public final void l(Looper looper, k3.l lVar) {
        boolean z9;
        synchronized (this) {
            try {
                Looper looper2 = this.f21110q;
                if (looper2 == null) {
                    this.f21110q = looper;
                    this.f21111r = new Handler(looper);
                } else {
                    if (looper2 == looper) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    AbstractC1566a.m(z9);
                    this.f21111r.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21113t = lVar;
    }
}
