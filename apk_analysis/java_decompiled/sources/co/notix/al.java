package co.notix;

import co.notix.push.pull.PullWorker;

/* loaded from: classes.dex */
public final class al extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public PullWorker f11857a;

    /* renamed from: b, reason: collision with root package name */
    public long f11858b;

    /* renamed from: c, reason: collision with root package name */
    public long f11859c;

    /* renamed from: d, reason: collision with root package name */
    public int f11860d;

    /* renamed from: e, reason: collision with root package name */
    public int f11861e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f11862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PullWorker f11863g;

    /* renamed from: h, reason: collision with root package name */
    public int f11864h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(PullWorker pullWorker, E7.d dVar) {
        super(dVar);
        this.f11863g = pullWorker;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11862f = obj;
        this.f11864h |= Integer.MIN_VALUE;
        return this.f11863g.a(this);
    }
}
