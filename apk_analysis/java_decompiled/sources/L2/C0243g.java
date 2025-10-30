package L2;

import java.io.Serializable;

/* renamed from: L2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243g extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4598r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0244h f4599s;

    /* renamed from: t, reason: collision with root package name */
    public int f4600t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0243g(C0244h c0244h, G7.c cVar) {
        super(cVar);
        this.f4599s = c0244h;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4598r = obj;
        this.f4600t |= Integer.MIN_VALUE;
        Serializable a5 = this.f4599s.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
