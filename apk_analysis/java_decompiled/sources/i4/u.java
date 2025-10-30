package i4;

import N3.m0;
import P5.D;
import P5.F;
import P5.S;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class u {

    /* renamed from: e, reason: collision with root package name */
    public int f18603e;

    /* renamed from: f, reason: collision with root package name */
    public int f18604f;

    /* renamed from: g, reason: collision with root package name */
    public int f18605g;

    /* renamed from: h, reason: collision with root package name */
    public int f18606h;

    /* renamed from: l, reason: collision with root package name */
    public S f18609l;

    /* renamed from: m, reason: collision with root package name */
    public int f18610m;

    /* renamed from: n, reason: collision with root package name */
    public S f18611n;

    /* renamed from: o, reason: collision with root package name */
    public int f18612o;

    /* renamed from: p, reason: collision with root package name */
    public int f18613p;

    /* renamed from: q, reason: collision with root package name */
    public int f18614q;

    /* renamed from: r, reason: collision with root package name */
    public S f18615r;

    /* renamed from: s, reason: collision with root package name */
    public S f18616s;

    /* renamed from: t, reason: collision with root package name */
    public int f18617t;

    /* renamed from: u, reason: collision with root package name */
    public int f18618u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f18619v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18620w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f18621x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap f18622y;

    /* renamed from: z, reason: collision with root package name */
    public HashSet f18623z;

    /* renamed from: a, reason: collision with root package name */
    public int f18599a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public int f18600b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f18601c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f18602d = Integer.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f18607i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18608k = true;

    public u() {
        D d9 = F.f5901b;
        S s9 = S.f5926e;
        this.f18609l = s9;
        this.f18610m = 0;
        this.f18611n = s9;
        this.f18612o = 0;
        this.f18613p = Integer.MAX_VALUE;
        this.f18614q = Integer.MAX_VALUE;
        this.f18615r = s9;
        this.f18616s = s9;
        this.f18617t = 0;
        this.f18618u = 0;
        this.f18619v = false;
        this.f18620w = false;
        this.f18621x = false;
        this.f18622y = new HashMap();
        this.f18623z = new HashSet();
    }

    public v a() {
        return new v(this);
    }

    public u b(int i9) {
        Iterator it = this.f18622y.values().iterator();
        while (it.hasNext()) {
            if (((t) it.next()).f18597a.f5166c == i9) {
                it.remove();
            }
        }
        return this;
    }

    public final void c(v vVar) {
        this.f18599a = vVar.f18625a;
        this.f18600b = vVar.f18626b;
        this.f18601c = vVar.f18627c;
        this.f18602d = vVar.f18628d;
        this.f18603e = vVar.f18629e;
        this.f18604f = vVar.f18630f;
        this.f18605g = vVar.f18631g;
        this.f18606h = vVar.f18632h;
        this.f18607i = vVar.f18633i;
        this.j = vVar.j;
        this.f18608k = vVar.f18634k;
        this.f18609l = vVar.f18635l;
        this.f18610m = vVar.f18636m;
        this.f18611n = vVar.f18637n;
        this.f18612o = vVar.f18638o;
        this.f18613p = vVar.f18639p;
        this.f18614q = vVar.f18640q;
        this.f18615r = vVar.f18641r;
        this.f18616s = vVar.f18642s;
        this.f18617t = vVar.f18643t;
        this.f18618u = vVar.f18644u;
        this.f18619v = vVar.f18645v;
        this.f18620w = vVar.f18646w;
        this.f18621x = vVar.f18647x;
        this.f18623z = new HashSet(vVar.f18649z);
        this.f18622y = new HashMap(vVar.f18648y);
    }

    public u d() {
        this.f18618u = -3;
        return this;
    }

    public u e(int i9) {
        this.f18599a = Integer.MAX_VALUE;
        this.f18600b = i9;
        return this;
    }

    public u f(int i9) {
        this.f18603e = 0;
        this.f18604f = i9;
        return this;
    }

    public u g(t tVar) {
        m0 m0Var = tVar.f18597a;
        b(m0Var.f5166c);
        this.f18622y.put(m0Var, tVar);
        return this;
    }

    public u h(int i9) {
        this.f18623z.remove(Integer.valueOf(i9));
        return this;
    }

    public u i(int i9, int i10) {
        this.f18607i = i9;
        this.j = i10;
        this.f18608k = true;
        return this;
    }
}
