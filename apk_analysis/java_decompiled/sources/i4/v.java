package i4;

import P5.AbstractC0349q;
import P5.I;
import P5.S;
import P5.X;
import j3.InterfaceC1453f;

/* loaded from: classes.dex */
public class v implements InterfaceC1453f {

    /* renamed from: A, reason: collision with root package name */
    public static final v f18624A = new v(new u());

    /* renamed from: a, reason: collision with root package name */
    public final int f18625a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18626b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18627c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18628d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18629e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18630f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18631g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18632h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18633i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f18634k;

    /* renamed from: l, reason: collision with root package name */
    public final S f18635l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18636m;

    /* renamed from: n, reason: collision with root package name */
    public final S f18637n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18638o;

    /* renamed from: p, reason: collision with root package name */
    public final int f18639p;

    /* renamed from: q, reason: collision with root package name */
    public final int f18640q;

    /* renamed from: r, reason: collision with root package name */
    public final S f18641r;

    /* renamed from: s, reason: collision with root package name */
    public final S f18642s;

    /* renamed from: t, reason: collision with root package name */
    public final int f18643t;

    /* renamed from: u, reason: collision with root package name */
    public final int f18644u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f18645v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f18646w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f18647x;

    /* renamed from: y, reason: collision with root package name */
    public final X f18648y;

    /* renamed from: z, reason: collision with root package name */
    public final I f18649z;

    public v(u uVar) {
        this.f18625a = uVar.f18599a;
        this.f18626b = uVar.f18600b;
        this.f18627c = uVar.f18601c;
        this.f18628d = uVar.f18602d;
        this.f18629e = uVar.f18603e;
        this.f18630f = uVar.f18604f;
        this.f18631g = uVar.f18605g;
        this.f18632h = uVar.f18606h;
        this.f18633i = uVar.f18607i;
        this.j = uVar.j;
        this.f18634k = uVar.f18608k;
        this.f18635l = uVar.f18609l;
        this.f18636m = uVar.f18610m;
        this.f18637n = uVar.f18611n;
        this.f18638o = uVar.f18612o;
        this.f18639p = uVar.f18613p;
        this.f18640q = uVar.f18614q;
        this.f18641r = uVar.f18615r;
        this.f18642s = uVar.f18616s;
        this.f18643t = uVar.f18617t;
        this.f18644u = uVar.f18618u;
        this.f18645v = uVar.f18619v;
        this.f18646w = uVar.f18620w;
        this.f18647x = uVar.f18621x;
        this.f18648y = X.a(uVar.f18622y);
        this.f18649z = I.p(uVar.f18623z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.u, java.lang.Object] */
    public u a() {
        ?? obj = new Object();
        obj.c(this);
        return obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                v vVar = (v) obj;
                if (this.f18625a == vVar.f18625a && this.f18626b == vVar.f18626b && this.f18627c == vVar.f18627c && this.f18628d == vVar.f18628d && this.f18629e == vVar.f18629e && this.f18630f == vVar.f18630f && this.f18631g == vVar.f18631g && this.f18632h == vVar.f18632h && this.f18634k == vVar.f18634k && this.f18633i == vVar.f18633i && this.j == vVar.j && this.f18635l.equals(vVar.f18635l) && this.f18636m == vVar.f18636m && this.f18637n.equals(vVar.f18637n) && this.f18638o == vVar.f18638o && this.f18639p == vVar.f18639p && this.f18640q == vVar.f18640q && this.f18641r.equals(vVar.f18641r) && this.f18642s.equals(vVar.f18642s) && this.f18643t == vVar.f18643t && this.f18644u == vVar.f18644u && this.f18645v == vVar.f18645v && this.f18646w == vVar.f18646w && this.f18647x == vVar.f18647x) {
                    X x5 = this.f18648y;
                    x5.getClass();
                    if (AbstractC0349q.e(x5, vVar.f18648y) && this.f18649z.equals(vVar.f18649z)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f18649z.hashCode() + ((this.f18648y.hashCode() + ((((((((((((this.f18642s.hashCode() + ((this.f18641r.hashCode() + ((((((((this.f18637n.hashCode() + ((((this.f18635l.hashCode() + ((((((((((((((((((((((this.f18625a + 31) * 31) + this.f18626b) * 31) + this.f18627c) * 31) + this.f18628d) * 31) + this.f18629e) * 31) + this.f18630f) * 31) + this.f18631g) * 31) + this.f18632h) * 31) + (this.f18634k ? 1 : 0)) * 31) + this.f18633i) * 31) + this.j) * 31)) * 31) + this.f18636m) * 31)) * 31) + this.f18638o) * 31) + this.f18639p) * 31) + this.f18640q) * 31)) * 31)) * 31) + this.f18643t) * 31) + this.f18644u) * 31) + (this.f18645v ? 1 : 0)) * 31) + (this.f18646w ? 1 : 0)) * 31) + (this.f18647x ? 1 : 0)) * 31)) * 31);
    }
}
