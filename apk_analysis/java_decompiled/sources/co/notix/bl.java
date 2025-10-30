package co.notix;

import co.notix.push.pull.PullWorker;

/* loaded from: classes.dex */
public final class bl extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public PullWorker f11945a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PullWorker f11947c;

    /* renamed from: d, reason: collision with root package name */
    public int f11948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(PullWorker pullWorker, E7.d dVar) {
        super(dVar);
        this.f11947c = pullWorker;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11946b = obj;
        this.f11948d |= Integer.MIN_VALUE;
        return this.f11947c.b(this);
    }
}
