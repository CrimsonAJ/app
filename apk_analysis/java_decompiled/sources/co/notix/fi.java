package co.notix;

import co.notix.periodicworker.PeriodicWorker;

/* loaded from: classes.dex */
public final class fi extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PeriodicWorker f12263b;

    /* renamed from: c, reason: collision with root package name */
    public int f12264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(PeriodicWorker periodicWorker, E7.d dVar) {
        super(dVar);
        this.f12263b = periodicWorker;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12262a = obj;
        this.f12264c |= Integer.MIN_VALUE;
        return this.f12263b.b(this);
    }
}
