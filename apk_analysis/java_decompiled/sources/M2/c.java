package M2;

import A7.j;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public d f4772r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f4773s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f4774t;

    /* renamed from: u, reason: collision with root package name */
    public int f4775u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, G7.c cVar) {
        super(cVar);
        this.f4774t = dVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4773s = obj;
        this.f4775u |= Integer.MIN_VALUE;
        Serializable a5 = this.f4774t.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new j(a5);
    }
}
