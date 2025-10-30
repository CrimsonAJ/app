package Z;

import x8.B;
import x8.t;

/* loaded from: classes.dex */
public final class j extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public t f8900r;

    /* renamed from: s, reason: collision with root package name */
    public t f8901s;

    /* renamed from: t, reason: collision with root package name */
    public B f8902t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f8903u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k f8904v;

    /* renamed from: w, reason: collision with root package name */
    public int f8905w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, G7.c cVar) {
        super(cVar);
        this.f8904v = kVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f8903u = obj;
        this.f8905w |= Integer.MIN_VALUE;
        return this.f8904v.b(null, this);
    }
}
