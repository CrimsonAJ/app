package N2;

import A7.j;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class a extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public J2.a f4891r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f4892s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f4893t;

    /* renamed from: u, reason: collision with root package name */
    public int f4894u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, G7.c cVar) {
        super(cVar);
        this.f4893t = bVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4892s = obj;
        this.f4894u |= Integer.MIN_VALUE;
        Serializable a5 = this.f4893t.a(null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new j(a5);
    }
}
