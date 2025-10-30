package co.notix;

import co.notix.perseverance.worker.PerseveranceWorker;

/* loaded from: classes.dex */
public final class kj extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public PerseveranceWorker f12614a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PerseveranceWorker f12616c;

    /* renamed from: d, reason: collision with root package name */
    public int f12617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(PerseveranceWorker perseveranceWorker, E7.d dVar) {
        super(dVar);
        this.f12616c = perseveranceWorker;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12615b = obj;
        this.f12617d |= Integer.MIN_VALUE;
        return this.f12616c.b(this);
    }
}
