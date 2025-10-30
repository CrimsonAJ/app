package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fl extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public String f12267a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f12268b;

    /* renamed from: c, reason: collision with root package name */
    public ic f12269c;

    /* renamed from: d, reason: collision with root package name */
    public String f12270d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f12271e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f12272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kl f12273g;

    /* renamed from: h, reason: collision with root package name */
    public int f12274h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(kl klVar, E7.d dVar) {
        super(dVar);
        this.f12273g = klVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12272f = obj;
        this.f12274h |= Integer.MIN_VALUE;
        return kl.a(this.f12273g, null, this);
    }
}
