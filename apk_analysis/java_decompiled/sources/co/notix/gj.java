package co.notix;

import co.notix.perseverance.worker.PerseveranceWorker;

/* loaded from: classes.dex */
public final class gj extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public String f12332a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PerseveranceWorker f12334c;

    /* renamed from: d, reason: collision with root package name */
    public int f12335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(PerseveranceWorker perseveranceWorker, E7.d dVar) {
        super(dVar);
        this.f12334c = perseveranceWorker;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12333b = obj;
        this.f12335d |= Integer.MIN_VALUE;
        return this.f12334c.a(this);
    }
}
