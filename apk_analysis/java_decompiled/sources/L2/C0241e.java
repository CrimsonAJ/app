package L2;

import java.io.Serializable;

/* renamed from: L2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241e extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4594r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0242f f4595s;

    /* renamed from: t, reason: collision with root package name */
    public int f4596t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0241e(C0242f c0242f, G7.c cVar) {
        super(cVar);
        this.f4595s = c0242f;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4594r = obj;
        this.f4596t |= Integer.MIN_VALUE;
        Serializable a5 = this.f4595s.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
