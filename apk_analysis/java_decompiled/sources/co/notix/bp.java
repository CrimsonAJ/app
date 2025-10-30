package co.notix;

import co.notix.worker.SelfRestartingWorker;

/* loaded from: classes.dex */
public final class bp extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public SelfRestartingWorker f11956a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11957b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelfRestartingWorker f11958c;

    /* renamed from: d, reason: collision with root package name */
    public int f11959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(SelfRestartingWorker selfRestartingWorker, E7.d dVar) {
        super(dVar);
        this.f11958c = selfRestartingWorker;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f11957b = obj;
        this.f11959d |= Integer.MIN_VALUE;
        return SelfRestartingWorker.a(this.f11958c, this);
    }
}
