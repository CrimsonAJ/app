package co.notix;

import co.notix.lsi.LockScreenInterstitialWorker;

/* loaded from: classes.dex */
public final class id extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public LockScreenInterstitialWorker f12451a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LockScreenInterstitialWorker f12453c;

    /* renamed from: d, reason: collision with root package name */
    public int f12454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id(LockScreenInterstitialWorker lockScreenInterstitialWorker, E7.d dVar) {
        super(dVar);
        this.f12453c = lockScreenInterstitialWorker;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12452b = obj;
        this.f12454d |= Integer.MIN_VALUE;
        return this.f12453c.b(this);
    }
}
