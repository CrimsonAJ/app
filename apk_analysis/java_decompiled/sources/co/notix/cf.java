package co.notix;

import android.os.Parcelable;

/* loaded from: classes.dex */
public final class cf extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public df f12009a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f12010b;

    /* renamed from: c, reason: collision with root package name */
    public String f12011c;

    /* renamed from: d, reason: collision with root package name */
    public String f12012d;

    /* renamed from: e, reason: collision with root package name */
    public Object f12013e;

    /* renamed from: f, reason: collision with root package name */
    public Parcelable f12014f;

    /* renamed from: g, reason: collision with root package name */
    public int f12015g;

    /* renamed from: h, reason: collision with root package name */
    public int f12016h;

    /* renamed from: i, reason: collision with root package name */
    public int f12017i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f12018k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ df f12019l;

    /* renamed from: m, reason: collision with root package name */
    public int f12020m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(df dfVar, E7.d dVar) {
        super(dVar);
        this.f12019l = dfVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12018k = obj;
        this.f12020m |= Integer.MIN_VALUE;
        return this.f12019l.b(null, this);
    }
}
