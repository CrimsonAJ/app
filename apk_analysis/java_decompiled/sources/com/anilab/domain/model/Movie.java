package com.anilab.domain.model;

import A1.a;
import B7.k;
import G0.L;
import J2.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import u0.z;

/* loaded from: classes.dex */
public final class Movie implements Parcelable {
    public static final Parcelable.Creator<Movie> CREATOR = new a(25);

    /* renamed from: a, reason: collision with root package name */
    public final long f14414a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14415b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14416c;

    /* renamed from: d, reason: collision with root package name */
    public final List f14417d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14418e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14419f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14420g;

    /* renamed from: h, reason: collision with root package name */
    public final b f14421h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14422i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f14423k;

    /* renamed from: l, reason: collision with root package name */
    public final int f14424l;

    /* renamed from: m, reason: collision with root package name */
    public final double f14425m;

    /* renamed from: n, reason: collision with root package name */
    public final long f14426n;

    /* renamed from: o, reason: collision with root package name */
    public final List f14427o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14428p;

    /* renamed from: q, reason: collision with root package name */
    public final List f14429q;

    /* renamed from: r, reason: collision with root package name */
    public double f14430r;

    /* renamed from: s, reason: collision with root package name */
    public final String f14431s;

    /* renamed from: t, reason: collision with root package name */
    public final String f14432t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f14433u;

    /* renamed from: v, reason: collision with root package name */
    public final String f14434v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Movie(long r29, java.lang.String r31, java.lang.String r32, java.util.List r33, java.lang.String r34, java.lang.String r35, int r36, J2.b r37, java.lang.String r38, int r39, int r40, int r41, double r42, long r44, java.util.List r46, boolean r47, java.lang.String r48, java.lang.String r49, boolean r50, int r51) {
        /*
            r28 = this;
            r0 = r51
            r1 = r0 & 8
            B7.t r22 = B7.t.f1135a
            if (r1 == 0) goto Lb
            r7 = r22
            goto Ld
        Lb:
            r7 = r33
        Ld:
            r1 = r0 & 16
            java.lang.String r2 = ""
            if (r1 == 0) goto L15
            r8 = r2
            goto L17
        L15:
            r8 = r34
        L17:
            r1 = r0 & 32
            if (r1 == 0) goto L1d
            r9 = r2
            goto L1f
        L1d:
            r9 = r35
        L1f:
            r1 = r0 & 64
            r3 = 0
            if (r1 == 0) goto L26
            r10 = r3
            goto L28
        L26:
            r10 = r36
        L28:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L2e
            r12 = r2
            goto L30
        L2e:
            r12 = r38
        L30:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L36
            r13 = r3
            goto L38
        L36:
            r13 = r39
        L38:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L3e
            r14 = r3
            goto L40
        L3e:
            r14 = r40
        L40:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L46
            r15 = r3
            goto L48
        L46:
            r15 = r41
        L48:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L51
            r4 = 0
            r16 = r4
            goto L53
        L51:
            r16 = r42
        L53:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L5c
            r4 = 0
            r18 = r4
            goto L5e
        L5c:
            r18 = r44
        L5e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L65
            r20 = r22
            goto L67
        L65:
            r20 = r46
        L67:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L70
            r21 = r3
            goto L72
        L70:
            r21 = r47
        L72:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L7a
            r25 = r2
            goto L7c
        L7a:
            r25 = r48
        L7c:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L84
            r26 = r2
            goto L86
        L84:
            r26 = r49
        L86:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L8e
            r27 = r3
            goto L90
        L8e:
            r27 = r50
        L90:
            r23 = 0
            r2 = r28
            r3 = r29
            r5 = r31
            r6 = r32
            r11 = r37
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anilab.domain.model.Movie.<init>(long, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, int, J2.b, java.lang.String, int, int, int, double, long, java.util.List, boolean, java.lang.String, java.lang.String, boolean, int):void");
    }

    public final String a() {
        if (!this.f14427o.isEmpty()) {
            return k.u0(this.f14427o, null, null, null, new L(2), 31);
        }
        return this.f14434v;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Movie)) {
            return false;
        }
        Movie movie = (Movie) obj;
        return this.f14414a == movie.f14414a && h.a(this.f14415b, movie.f14415b) && h.a(this.f14416c, movie.f14416c) && h.a(this.f14417d, movie.f14417d) && h.a(this.f14418e, movie.f14418e) && h.a(this.f14419f, movie.f14419f) && this.f14420g == movie.f14420g && this.f14421h == movie.f14421h && h.a(this.f14422i, movie.f14422i) && this.j == movie.j && this.f14423k == movie.f14423k && this.f14424l == movie.f14424l && Double.compare(this.f14425m, movie.f14425m) == 0 && this.f14426n == movie.f14426n && h.a(this.f14427o, movie.f14427o) && this.f14428p == movie.f14428p && h.a(this.f14429q, movie.f14429q) && Double.compare(this.f14430r, movie.f14430r) == 0 && h.a(this.f14431s, movie.f14431s) && h.a(this.f14432t, movie.f14432t) && this.f14433u == movie.f14433u;
    }

    public final int hashCode() {
        int i9;
        long j = this.f14414a;
        int c3 = (((((z.c(this.f14422i, (this.f14421h.hashCode() + ((z.c(this.f14419f, z.c(this.f14418e, (this.f14417d.hashCode() + z.c(this.f14416c, z.c(this.f14415b, ((int) (j ^ (j >>> 32))) * 31, 31), 31)) * 31, 31), 31) + this.f14420g) * 31)) * 31, 31) + this.j) * 31) + this.f14423k) * 31) + this.f14424l) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.f14425m);
        int i10 = (c3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        long j4 = this.f14426n;
        int hashCode = (this.f14427o.hashCode() + ((i10 + ((int) (j4 ^ (j4 >>> 32)))) * 31)) * 31;
        int i11 = 1237;
        if (this.f14428p) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int hashCode2 = (this.f14429q.hashCode() + ((hashCode + i9) * 31)) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f14430r);
        int c9 = z.c(this.f14432t, z.c(this.f14431s, (hashCode2 + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2))) * 31, 31), 31);
        if (this.f14433u) {
            i11 = 1231;
        }
        return c9 + i11;
    }

    public final String toString() {
        return "Movie(id=" + this.f14414a + ", posterPath=" + this.f14415b + ", title=" + this.f14416c + ", allNames=" + this.f14417d + ", overview=" + this.f14418e + ", numberSeason=" + this.f14419f + ", year=" + this.f14420g + ", type=" + this.f14421h + ", slug=" + this.f14422i + ", numberEpisode=" + this.j + ", latestEpisode=" + this.f14423k + ", hasDub=" + this.f14424l + ", score=" + this.f14425m + ", updateAt=" + this.f14426n + ", genres=" + this.f14427o + ", inWatchList=" + this.f14428p + ", votes=" + this.f14429q + ", rating=" + this.f14430r + ", ratingType=" + this.f14431s + ", quality=" + this.f14432t + ", isPin=" + this.f14433u + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        h.e(dest, "dest");
        dest.writeLong(this.f14414a);
        dest.writeString(this.f14415b);
        dest.writeString(this.f14416c);
        dest.writeStringList(this.f14417d);
        dest.writeString(this.f14418e);
        dest.writeString(this.f14419f);
        dest.writeInt(this.f14420g);
        dest.writeString(this.f14421h.name());
        dest.writeString(this.f14422i);
        dest.writeInt(this.j);
        dest.writeInt(this.f14423k);
        dest.writeInt(this.f14424l);
        dest.writeDouble(this.f14425m);
        dest.writeLong(this.f14426n);
        List list = this.f14427o;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Genre) it.next()).writeToParcel(dest, i9);
        }
        dest.writeInt(this.f14428p ? 1 : 0);
        List list2 = this.f14429q;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((H2.z) it2.next()).writeToParcel(dest, i9);
        }
        dest.writeDouble(this.f14430r);
        dest.writeString(this.f14431s);
        dest.writeString(this.f14432t);
        dest.writeInt(this.f14433u ? 1 : 0);
    }

    public Movie(long j, String posterPath, String title, List allNames, String overview, String numberSeason, int i9, b type, String slug, int i10, int i11, int i12, double d9, long j4, List genres, boolean z9, List list, double d10, String ratingType, String quality, boolean z10) {
        h.e(posterPath, "posterPath");
        h.e(title, "title");
        h.e(allNames, "allNames");
        h.e(overview, "overview");
        h.e(numberSeason, "numberSeason");
        h.e(type, "type");
        h.e(slug, "slug");
        h.e(genres, "genres");
        h.e(ratingType, "ratingType");
        h.e(quality, "quality");
        this.f14414a = j;
        this.f14415b = posterPath;
        this.f14416c = title;
        this.f14417d = allNames;
        this.f14418e = overview;
        this.f14419f = numberSeason;
        this.f14420g = i9;
        this.f14421h = type;
        this.f14422i = slug;
        this.j = i10;
        this.f14423k = i11;
        this.f14424l = i12;
        this.f14425m = d9;
        this.f14426n = j4;
        this.f14427o = genres;
        this.f14428p = z9;
        this.f14429q = list;
        this.f14430r = d10;
        this.f14431s = ratingType;
        this.f14432t = quality;
        this.f14433u = z10;
        this.f14434v = "";
    }
}
