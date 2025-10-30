package co.notix;

import java.util.List;

/* loaded from: classes.dex */
public final class hm extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public lm f12402a;

    /* renamed from: b, reason: collision with root package name */
    public List f12403b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12404c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm f12405d;

    /* renamed from: e, reason: collision with root package name */
    public int f12406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(lm lmVar, E7.d dVar) {
        super(dVar);
        this.f12405d = lmVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12404c = obj;
        this.f12406e |= Integer.MIN_VALUE;
        return this.f12405d.e(this);
    }
}
