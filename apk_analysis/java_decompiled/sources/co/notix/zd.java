package co.notix;

import java.util.List;

/* loaded from: classes.dex */
public final class zd extends ae {

    /* renamed from: a, reason: collision with root package name */
    public final long f13661a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13662b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13663c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13664d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13665e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13666f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13667g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13668h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13669i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final List f13670k;

    /* renamed from: l, reason: collision with root package name */
    public final long f13671l;

    /* renamed from: m, reason: collision with root package name */
    public final long f13672m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f13673n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(long j, String appVersion, String str, String uuid, String packageName, int i9, int i10, String model, String manufacturer, List supportedAbis, long j4, long j9, boolean z9) {
        super(0);
        kotlin.jvm.internal.h.e(appVersion, "appVersion");
        kotlin.jvm.internal.h.e(uuid, "uuid");
        kotlin.jvm.internal.h.e(packageName, "packageName");
        kotlin.jvm.internal.h.e(model, "model");
        kotlin.jvm.internal.h.e(manufacturer, "manufacturer");
        kotlin.jvm.internal.h.e(supportedAbis, "supportedAbis");
        this.f13661a = j;
        this.f13662b = appVersion;
        this.f13663c = str;
        this.f13664d = uuid;
        this.f13665e = packageName;
        this.f13666f = i9;
        this.f13667g = i10;
        this.f13668h = "0.1.86";
        this.f13669i = model;
        this.j = manufacturer;
        this.f13670k = supportedAbis;
        this.f13671l = j4;
        this.f13672m = j9;
        this.f13673n = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd)) {
            return false;
        }
        zd zdVar = (zd) obj;
        return this.f13661a == zdVar.f13661a && kotlin.jvm.internal.h.a(this.f13662b, zdVar.f13662b) && kotlin.jvm.internal.h.a(this.f13663c, zdVar.f13663c) && kotlin.jvm.internal.h.a(this.f13664d, zdVar.f13664d) && kotlin.jvm.internal.h.a(this.f13665e, zdVar.f13665e) && this.f13666f == zdVar.f13666f && this.f13667g == zdVar.f13667g && kotlin.jvm.internal.h.a(this.f13668h, zdVar.f13668h) && kotlin.jvm.internal.h.a(this.f13669i, zdVar.f13669i) && kotlin.jvm.internal.h.a(this.j, zdVar.j) && kotlin.jvm.internal.h.a(this.f13670k, zdVar.f13670k) && this.f13671l == zdVar.f13671l && this.f13672m == zdVar.f13672m && this.f13673n == zdVar.f13673n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        long j = this.f13661a;
        int a5 = h.a(this.f13662b, ((int) (j ^ (j >>> 32))) * 31, 31);
        String str = this.f13663c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (this.f13670k.hashCode() + h.a(this.j, h.a(this.f13669i, h.a(this.f13668h, (this.f13667g + ((this.f13666f + h.a(this.f13665e, h.a(this.f13664d, (a5 + hashCode) * 31, 31), 31)) * 31)) * 31, 31), 31), 31)) * 31;
        long j4 = this.f13671l;
        int i9 = (((int) (j4 ^ (j4 >>> 32))) + hashCode2) * 31;
        long j9 = this.f13672m;
        int i10 = (((int) (j9 ^ (j9 >>> 32))) + i9) * 31;
        boolean z9 = this.f13673n;
        int i11 = z9;
        if (z9 != 0) {
            i11 = 1;
        }
        return i10 + i11;
    }

    public final String toString() {
        return "GeneralMetrics(createdDateTimestamp=" + this.f13661a + ", appVersion=" + this.f13662b + ", appId=" + this.f13663c + ", uuid=" + this.f13664d + ", packageName=" + this.f13665e + ", androidApi=" + this.f13666f + ", targetSdkVersion=" + this.f13667g + ", notixSdkVersion=" + this.f13668h + ", model=" + this.f13669i + ", manufacturer=" + this.j + ", supportedAbis=" + this.f13670k + ", foregroundTime=" + this.f13671l + ", periodicWorkerRunCount=" + this.f13672m + ", canPostNotifications=" + this.f13673n + ')';
    }
}
