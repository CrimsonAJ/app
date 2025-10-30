package co.notix;

import co.notix.perseverance.worker.PerseveranceWorker;

/* loaded from: classes.dex */
public final class hj extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public PerseveranceWorker f12390a;

    /* renamed from: b, reason: collision with root package name */
    public ni f12391b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12392c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PerseveranceWorker f12393d;

    /* renamed from: e, reason: collision with root package name */
    public int f12394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(PerseveranceWorker perseveranceWorker, E7.d dVar) {
        super(dVar);
        this.f12393d = perseveranceWorker;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12392c = obj;
        this.f12394e |= Integer.MIN_VALUE;
        return PerseveranceWorker.a(this.f12393d, (E7.d) this);
    }
}
