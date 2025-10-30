package co.notix;

import co.notix.lsi.LockScreenInterstitialWorker;

/* loaded from: classes.dex */
public final class hd extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public LockScreenInterstitialWorker f12372a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LockScreenInterstitialWorker f12374c;

    /* renamed from: d, reason: collision with root package name */
    public int f12375d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(LockScreenInterstitialWorker lockScreenInterstitialWorker, E7.d dVar) {
        super(dVar);
        this.f12374c = lockScreenInterstitialWorker;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12373b = obj;
        this.f12375d |= Integer.MIN_VALUE;
        return this.f12374c.a(this);
    }
}
