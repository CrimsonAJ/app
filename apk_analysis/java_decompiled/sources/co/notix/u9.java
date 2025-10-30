package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u9 extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public String f13279a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f13280b;

    /* renamed from: c, reason: collision with root package name */
    public ic f13281c;

    /* renamed from: d, reason: collision with root package name */
    public String f13282d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f13283e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f13284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ia f13285g;

    /* renamed from: h, reason: collision with root package name */
    public int f13286h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(ia iaVar, E7.d dVar) {
        super(dVar);
        this.f13285g = iaVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13284f = obj;
        this.f13286h |= Integer.MIN_VALUE;
        return this.f13285g.a(null, this);
    }
}
