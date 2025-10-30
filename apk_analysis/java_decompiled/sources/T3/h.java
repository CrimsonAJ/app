package T3;

import n3.C1630g;

/* loaded from: classes.dex */
public abstract class h implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f7099a;

    /* renamed from: b, reason: collision with root package name */
    public final g f7100b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7101c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7102d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7103e;

    /* renamed from: f, reason: collision with root package name */
    public final C1630g f7104f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7105g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7106h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7107i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7108k;

    public h(String str, g gVar, long j, int i9, long j4, C1630g c1630g, String str2, String str3, long j9, long j10, boolean z9) {
        this.f7099a = str;
        this.f7100b = gVar;
        this.f7101c = j;
        this.f7102d = i9;
        this.f7103e = j4;
        this.f7104f = c1630g;
        this.f7105g = str2;
        this.f7106h = str3;
        this.f7107i = j9;
        this.j = j10;
        this.f7108k = z9;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l9 = (Long) obj;
        long longValue = l9.longValue();
        long j = this.f7103e;
        if (j > longValue) {
            return 1;
        }
        if (j < l9.longValue()) {
            return -1;
        }
        return 0;
    }
}
