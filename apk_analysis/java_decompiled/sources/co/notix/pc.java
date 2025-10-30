package co.notix;

import co.notix.lsi.LockScreenInterstitialActivity;

/* loaded from: classes.dex */
public final class pc extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public LockScreenInterstitialActivity f12938a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LockScreenInterstitialActivity f12940c;

    /* renamed from: d, reason: collision with root package name */
    public int f12941d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(LockScreenInterstitialActivity lockScreenInterstitialActivity, E7.d dVar) {
        super(dVar);
        this.f12940c = lockScreenInterstitialActivity;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12939b = obj;
        this.f12941d |= Integer.MIN_VALUE;
        return this.f12940c.a(this);
    }
}
