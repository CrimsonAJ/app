package y8;

import java.util.ArrayList;
import x8.y;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final y f25150a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25151b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25152c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25153d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25154e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25155f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25156g;

    /* renamed from: h, reason: collision with root package name */
    public final long f25157h;

    /* renamed from: i, reason: collision with root package name */
    public final int f25158i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f25159k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f25160l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f25161m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f25162n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f25163o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f25164p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f25165q;

    public h(y canonicalPath, boolean z9, String comment, long j, long j4, long j9, int i9, long j10, int i10, int i11, Long l9, Long l10, Long l11, Integer num, Integer num2, Integer num3) {
        kotlin.jvm.internal.h.e(canonicalPath, "canonicalPath");
        kotlin.jvm.internal.h.e(comment, "comment");
        this.f25150a = canonicalPath;
        this.f25151b = z9;
        this.f25152c = comment;
        this.f25153d = j;
        this.f25154e = j4;
        this.f25155f = j9;
        this.f25156g = i9;
        this.f25157h = j10;
        this.f25158i = i10;
        this.j = i11;
        this.f25159k = l9;
        this.f25160l = l10;
        this.f25161m = l11;
        this.f25162n = num;
        this.f25163o = num2;
        this.f25164p = num3;
        this.f25165q = new ArrayList();
    }

    public /* synthetic */ h(y yVar, boolean z9, String str, long j, long j4, long j9, int i9, long j10, int i10, int i11, Long l9, Long l10, Long l11, int i12) {
        this(yVar, z9, (i12 & 4) != 0 ? "" : str, (i12 & 8) != 0 ? -1L : j, (i12 & 16) != 0 ? -1L : j4, (i12 & 32) != 0 ? -1L : j9, (i12 & 64) != 0 ? -1 : i9, (i12 & 128) != 0 ? -1L : j10, (i12 & 256) != 0 ? -1 : i10, (i12 & 512) != 0 ? -1 : i11, (i12 & 1024) != 0 ? null : l9, (i12 & 2048) != 0 ? null : l10, (i12 & 4096) != 0 ? null : l11, null, null, null);
    }
}
