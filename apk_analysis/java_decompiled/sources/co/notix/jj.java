package co.notix;

import co.notix.perseverance.worker.PerseveranceWorker;

/* loaded from: classes.dex */
public final class jj extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PerseveranceWorker f12562b;

    /* renamed from: c, reason: collision with root package name */
    public int f12563c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(PerseveranceWorker perseveranceWorker, E7.d dVar) {
        super(dVar);
        this.f12562b = perseveranceWorker;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12561a = obj;
        this.f12563c |= Integer.MIN_VALUE;
        PerseveranceWorker perseveranceWorker = this.f12562b;
        g8.a aVar = PerseveranceWorker.f12959d;
        return perseveranceWorker.a((String) null, this);
    }
}
