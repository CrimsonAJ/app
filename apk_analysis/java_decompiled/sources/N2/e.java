package N2;

import A7.j;

/* loaded from: classes.dex */
public final class e extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4900r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f4901s;

    /* renamed from: t, reason: collision with root package name */
    public int f4902t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, G7.c cVar) {
        super(cVar);
        this.f4901s = fVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4900r = obj;
        this.f4902t |= Integer.MIN_VALUE;
        Object a5 = this.f4901s.a(null, false, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new j(a5);
    }
}
