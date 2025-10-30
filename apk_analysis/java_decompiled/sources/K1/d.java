package K1;

import A7.j;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class d extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public String f4237r;

    /* renamed from: s, reason: collision with root package name */
    public g f4238s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f4239t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f4240u;

    /* renamed from: v, reason: collision with root package name */
    public int f4241v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, G7.c cVar) {
        super(cVar);
        this.f4240u = gVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4239t = obj;
        this.f4241v |= Integer.MIN_VALUE;
        Serializable a5 = this.f4240u.a(null, null, null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new j(a5);
    }
}
