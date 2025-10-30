package co.notix;

import java.util.Set;

/* loaded from: classes.dex */
public final class fh extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public Set f12257a;

    /* renamed from: b, reason: collision with root package name */
    public O7.l f12258b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12259c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gh f12260d;

    /* renamed from: e, reason: collision with root package name */
    public int f12261e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh(gh ghVar, E7.d dVar) {
        super(dVar);
        this.f12260d = ghVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12259c = obj;
        this.f12261e |= Integer.MIN_VALUE;
        Object a5 = gh.a(this.f12260d, null, null, null, null, null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
