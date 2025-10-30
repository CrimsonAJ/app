package L2;

import java.io.Serializable;

/* renamed from: L2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239c extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4590r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0240d f4591s;

    /* renamed from: t, reason: collision with root package name */
    public int f4592t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0239c(C0240d c0240d, G7.c cVar) {
        super(cVar);
        this.f4591s = c0240d;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4590r = obj;
        this.f4592t |= Integer.MIN_VALUE;
        Serializable a5 = this.f4591s.a(null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
