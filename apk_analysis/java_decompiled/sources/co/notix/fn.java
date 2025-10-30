package co.notix;

import java.util.Set;

/* loaded from: classes.dex */
public final class fn extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public Set f12276a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vn f12278c;

    /* renamed from: d, reason: collision with root package name */
    public int f12279d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(vn vnVar, E7.d dVar) {
        super(dVar);
        this.f12278c = vnVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12277b = obj;
        this.f12279d |= Integer.MIN_VALUE;
        return this.f12278c.a((Set) null, this);
    }
}
