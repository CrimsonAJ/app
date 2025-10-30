package C1;

import Y7.AbstractC0480v;
import Y7.K;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0480v f1160a;

    /* renamed from: b, reason: collision with root package name */
    public final f8.d f1161b;

    /* renamed from: c, reason: collision with root package name */
    public final f8.d f1162c;

    /* renamed from: d, reason: collision with root package name */
    public final f8.d f1163d;

    /* renamed from: e, reason: collision with root package name */
    public final G1.a f1164e;

    /* renamed from: f, reason: collision with root package name */
    public final D1.d f1165f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f1166g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1167h;

    /* renamed from: i, reason: collision with root package name */
    public final b f1168i;
    public final b j;

    /* renamed from: k, reason: collision with root package name */
    public final b f1169k;

    public c() {
        f8.e eVar = K.f8773a;
        Z7.d dVar = d8.o.f17003a.f9070d;
        f8.d dVar2 = K.f8774b;
        G1.a aVar = G1.a.f2835a;
        D1.d dVar3 = D1.d.f1770a;
        Bitmap.Config config = H1.f.f2950b;
        b bVar = b.ENABLED;
        this.f1160a = dVar;
        this.f1161b = dVar2;
        this.f1162c = dVar2;
        this.f1163d = dVar2;
        this.f1164e = aVar;
        this.f1165f = dVar3;
        this.f1166g = config;
        this.f1167h = true;
        this.f1168i = bVar;
        this.j = bVar;
        this.f1169k = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (kotlin.jvm.internal.h.a(this.f1160a, cVar.f1160a) && kotlin.jvm.internal.h.a(this.f1161b, cVar.f1161b) && kotlin.jvm.internal.h.a(this.f1162c, cVar.f1162c) && kotlin.jvm.internal.h.a(this.f1163d, cVar.f1163d) && kotlin.jvm.internal.h.a(this.f1164e, cVar.f1164e) && this.f1165f == cVar.f1165f && this.f1166g == cVar.f1166g && this.f1167h == cVar.f1167h && this.f1168i == cVar.f1168i && this.j == cVar.j && this.f1169k == cVar.f1169k) {
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
        int hashCode = (this.f1163d.hashCode() + ((this.f1162c.hashCode() + ((this.f1161b.hashCode() + (this.f1160a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f1164e.getClass();
        int hashCode2 = (this.f1166g.hashCode() + ((this.f1165f.hashCode() + ((G1.a.class.hashCode() + hashCode) * 31)) * 31)) * 31;
        if (this.f1167h) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return this.f1169k.hashCode() + ((this.j.hashCode() + ((this.f1168i.hashCode() + ((((hashCode2 + i9) * 31) + 1237) * 923521)) * 31)) * 31);
    }
}
