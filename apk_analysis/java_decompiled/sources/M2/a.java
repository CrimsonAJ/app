package M2;

import A7.j;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class a extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public b f4766r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f4767s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f4768t;

    /* renamed from: u, reason: collision with root package name */
    public int f4769u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, G7.c cVar) {
        super(cVar);
        this.f4768t = bVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4767s = obj;
        this.f4769u |= Integer.MIN_VALUE;
        Serializable a5 = this.f4768t.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new j(a5);
    }
}
