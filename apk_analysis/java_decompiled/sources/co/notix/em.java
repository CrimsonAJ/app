package co.notix;

import java.util.List;

/* loaded from: classes.dex */
public final class em extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f12186a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12187b;

    /* renamed from: c, reason: collision with root package name */
    public g8.a f12188c;

    /* renamed from: d, reason: collision with root package name */
    public List f12189d;

    /* renamed from: e, reason: collision with root package name */
    public ql f12190e;

    /* renamed from: f, reason: collision with root package name */
    public long f12191f;

    /* renamed from: g, reason: collision with root package name */
    public long f12192g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12193h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ lm f12194i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(lm lmVar, E7.d dVar) {
        super(dVar);
        this.f12194i = lmVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12193h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f12194i.a((ll) null, this);
    }
}
