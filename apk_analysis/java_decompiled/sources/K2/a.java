package K2;

import A7.j;
import G7.c;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: r, reason: collision with root package name */
    public b f4251r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f4252s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f4253t;

    /* renamed from: u, reason: collision with root package name */
    public int f4254u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f4253t = bVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4252s = obj;
        this.f4254u |= Integer.MIN_VALUE;
        Object a5 = this.f4253t.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new j(a5);
    }
}
