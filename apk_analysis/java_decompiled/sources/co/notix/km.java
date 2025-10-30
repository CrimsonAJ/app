package co.notix;

import java.util.List;

/* loaded from: classes.dex */
public final class km extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f12627a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.m f12628b;

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.m f12629c;

    /* renamed from: d, reason: collision with root package name */
    public lm f12630d;

    /* renamed from: e, reason: collision with root package name */
    public List f12631e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f12632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lm f12633g;

    /* renamed from: h, reason: collision with root package name */
    public int f12634h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(lm lmVar, E7.d dVar) {
        super(dVar);
        this.f12633g = lmVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12632f = obj;
        this.f12634h |= Integer.MIN_VALUE;
        return this.f12633g.f(this);
    }
}
