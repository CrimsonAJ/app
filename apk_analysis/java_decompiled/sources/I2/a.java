package I2;

import B7.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;
import u0.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f3444a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3445b;

    /* renamed from: c, reason: collision with root package name */
    public String f3446c;

    /* renamed from: d, reason: collision with root package name */
    public List f3447d;

    /* renamed from: e, reason: collision with root package name */
    public List f3448e;

    /* renamed from: f, reason: collision with root package name */
    public List f3449f;

    /* renamed from: g, reason: collision with root package name */
    public b f3450g;

    /* renamed from: h, reason: collision with root package name */
    public d f3451h;

    /* renamed from: i, reason: collision with root package name */
    public long f3452i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3453k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3454l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f3455m;

    public a(long j, int i9, String str, List list, ArrayList arrayList, ArrayList arrayList2, b bVar, long j4, boolean z9, boolean z10, boolean z11, int i10) {
        long j9;
        int i11;
        String str2;
        List list2;
        List list3;
        b bVar2;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if ((i10 & 1) != 0) {
            j9 = 0;
        } else {
            j9 = j;
        }
        if ((i10 & 2) != 0) {
            i11 = 0;
        } else {
            i11 = i9;
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        int i12 = i10 & 8;
        List list4 = t.f1135a;
        if (i12 != 0) {
            list2 = list4;
        } else {
            list2 = list;
        }
        if ((i10 & 16) != 0) {
            list3 = list4;
        } else {
            list3 = arrayList;
        }
        list4 = (i10 & 32) == 0 ? arrayList2 : list4;
        if ((i10 & 64) != 0) {
            bVar2 = new b();
        } else {
            bVar2 = bVar;
        }
        d dVar = new d();
        long j10 = (i10 & 256) == 0 ? j4 : 0L;
        if ((i10 & 512) != 0) {
            z12 = false;
        } else {
            z12 = z9;
        }
        if ((i10 & 1024) != 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if ((i10 & 2048) != 0) {
            z14 = false;
        } else {
            z14 = z10;
        }
        if ((i10 & 4096) != 0) {
            z15 = false;
        } else {
            z15 = z11;
        }
        this.f3444a = j9;
        this.f3445b = i11;
        this.f3446c = str2;
        this.f3447d = list2;
        this.f3448e = list3;
        this.f3449f = list4;
        this.f3450g = bVar2;
        this.f3451h = dVar;
        this.f3452i = j10;
        this.j = z12;
        this.f3453k = z13;
        this.f3454l = z14;
        this.f3455m = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3444a == aVar.f3444a && this.f3445b == aVar.f3445b && h.a(this.f3446c, aVar.f3446c) && h.a(this.f3447d, aVar.f3447d) && h.a(this.f3448e, aVar.f3448e) && h.a(this.f3449f, aVar.f3449f) && h.a(this.f3450g, aVar.f3450g) && h.a(this.f3451h, aVar.f3451h) && this.f3452i == aVar.f3452i && this.j == aVar.j && this.f3453k == aVar.f3453k && this.f3454l == aVar.f3454l && this.f3455m == aVar.f3455m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11;
        long j = this.f3444a;
        int c3 = z.c(this.f3451h.f3465a, (this.f3450g.hashCode() + ((this.f3449f.hashCode() + ((this.f3448e.hashCode() + ((this.f3447d.hashCode() + z.c(this.f3446c, ((((int) (j ^ (j >>> 32))) * 31) + this.f3445b) * 31, 31)) * 31)) * 31)) * 31)) * 31, 31);
        long j4 = this.f3452i;
        int i12 = (c3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        int i13 = 1237;
        if (this.j) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i14 = (i12 + i9) * 31;
        if (this.f3453k) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i15 = (i14 + i10) * 31;
        if (this.f3454l) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i16 = (i15 + i11) * 31;
        if (this.f3455m) {
            i13 = 1231;
        }
        return i16 + i13;
    }

    public final String toString() {
        return "AnimeEpisode(id=" + this.f3444a + ", number=" + this.f3445b + ", name=" + this.f3446c + ", subtitles=" + this.f3447d + ", streamSub=" + this.f3448e + ", streamDub=" + this.f3449f + ", currentHls=" + this.f3450g + ", thumb=" + this.f3451h + ", positionMs=" + this.f3452i + ", playing=" + this.j + ", hasDetail=" + this.f3453k + ", ended=" + this.f3454l + ", isFiller=" + this.f3455m + ")";
    }
}
