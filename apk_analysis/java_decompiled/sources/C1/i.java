package C1;

import Y7.AbstractC0480v;
import android.content.Context;
import android.graphics.Bitmap;
import i8.w;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1191a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1192b;

    /* renamed from: c, reason: collision with root package name */
    public final E1.a f1193c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap.Config f1194d;

    /* renamed from: e, reason: collision with root package name */
    public final D1.d f1195e;

    /* renamed from: f, reason: collision with root package name */
    public final List f1196f;

    /* renamed from: g, reason: collision with root package name */
    public final G1.a f1197g;

    /* renamed from: h, reason: collision with root package name */
    public final w f1198h;

    /* renamed from: i, reason: collision with root package name */
    public final q f1199i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1200k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1201l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1202m;

    /* renamed from: n, reason: collision with root package name */
    public final b f1203n;

    /* renamed from: o, reason: collision with root package name */
    public final b f1204o;

    /* renamed from: p, reason: collision with root package name */
    public final b f1205p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0480v f1206q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC0480v f1207r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC0480v f1208s;

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC0480v f1209t;

    /* renamed from: u, reason: collision with root package name */
    public final D.n f1210u;

    /* renamed from: v, reason: collision with root package name */
    public final D1.i f1211v;

    /* renamed from: w, reason: collision with root package name */
    public final D1.g f1212w;

    /* renamed from: x, reason: collision with root package name */
    public final n f1213x;

    /* renamed from: y, reason: collision with root package name */
    public final d f1214y;

    /* renamed from: z, reason: collision with root package name */
    public final c f1215z;

    public i(Context context, Object obj, E1.a aVar, Bitmap.Config config, D1.d dVar, List list, G1.a aVar2, w wVar, q qVar, boolean z9, boolean z10, boolean z11, boolean z12, b bVar, b bVar2, b bVar3, AbstractC0480v abstractC0480v, AbstractC0480v abstractC0480v2, AbstractC0480v abstractC0480v3, AbstractC0480v abstractC0480v4, D.n nVar, D1.i iVar, D1.g gVar, n nVar2, d dVar2, c cVar) {
        this.f1191a = context;
        this.f1192b = obj;
        this.f1193c = aVar;
        this.f1194d = config;
        this.f1195e = dVar;
        this.f1196f = list;
        this.f1197g = aVar2;
        this.f1198h = wVar;
        this.f1199i = qVar;
        this.j = z9;
        this.f1200k = z10;
        this.f1201l = z11;
        this.f1202m = z12;
        this.f1203n = bVar;
        this.f1204o = bVar2;
        this.f1205p = bVar3;
        this.f1206q = abstractC0480v;
        this.f1207r = abstractC0480v2;
        this.f1208s = abstractC0480v3;
        this.f1209t = abstractC0480v4;
        this.f1210u = nVar;
        this.f1211v = iVar;
        this.f1212w = gVar;
        this.f1213x = nVar2;
        this.f1214y = dVar2;
        this.f1215z = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (kotlin.jvm.internal.h.a(this.f1191a, iVar.f1191a) && this.f1192b.equals(iVar.f1192b) && kotlin.jvm.internal.h.a(this.f1193c, iVar.f1193c) && this.f1194d == iVar.f1194d && this.f1195e == iVar.f1195e && kotlin.jvm.internal.h.a(this.f1196f, iVar.f1196f) && kotlin.jvm.internal.h.a(this.f1197g, iVar.f1197g) && kotlin.jvm.internal.h.a(this.f1198h, iVar.f1198h) && this.f1199i.equals(iVar.f1199i) && this.j == iVar.j && this.f1200k == iVar.f1200k && this.f1201l == iVar.f1201l && this.f1202m == iVar.f1202m && this.f1203n == iVar.f1203n && this.f1204o == iVar.f1204o && this.f1205p == iVar.f1205p && kotlin.jvm.internal.h.a(this.f1206q, iVar.f1206q) && kotlin.jvm.internal.h.a(this.f1207r, iVar.f1207r) && kotlin.jvm.internal.h.a(this.f1208s, iVar.f1208s) && kotlin.jvm.internal.h.a(this.f1209t, iVar.f1209t) && kotlin.jvm.internal.h.a(this.f1210u, iVar.f1210u) && this.f1211v.equals(iVar.f1211v) && this.f1212w == iVar.f1212w && this.f1213x.equals(iVar.f1213x) && this.f1214y.equals(iVar.f1214y) && kotlin.jvm.internal.h.a(this.f1215z, iVar.f1215z)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11;
        int i12;
        int hashCode = (this.f1192b.hashCode() + (this.f1191a.hashCode() * 31)) * 31;
        E1.a aVar = this.f1193c;
        if (aVar != null) {
            i9 = aVar.f1926b.hashCode();
        } else {
            i9 = 0;
        }
        int hashCode2 = (this.f1196f.hashCode() + ((this.f1195e.hashCode() + ((this.f1194d.hashCode() + ((hashCode + i9) * 923521)) * 961)) * 29791)) * 31;
        this.f1197g.getClass();
        int hashCode3 = (this.f1199i.f1242a.hashCode() + ((((G1.a.class.hashCode() + hashCode2) * 31) + Arrays.hashCode(this.f1198h.f19159a)) * 31)) * 31;
        int i13 = 1237;
        if (this.j) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (hashCode3 + i10) * 31;
        if (this.f1200k) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        if (this.f1201l) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i16 = (i15 + i12) * 31;
        if (this.f1202m) {
            i13 = 1231;
        }
        return this.f1215z.hashCode() + ((this.f1214y.hashCode() + ((this.f1213x.f1233a.hashCode() + ((this.f1212w.hashCode() + ((this.f1211v.hashCode() + ((this.f1210u.hashCode() + ((this.f1209t.hashCode() + ((this.f1208s.hashCode() + ((this.f1207r.hashCode() + ((this.f1206q.hashCode() + ((this.f1205p.hashCode() + ((this.f1204o.hashCode() + ((this.f1203n.hashCode() + ((i16 + i13) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-1807454463))) * 31);
    }
}
