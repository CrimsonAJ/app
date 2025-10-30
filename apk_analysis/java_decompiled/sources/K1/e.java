package K1;

import A7.j;
import android.net.Uri;

/* loaded from: classes.dex */
public final class e extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public Uri f4242r;

    /* renamed from: s, reason: collision with root package name */
    public g f4243s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f4244t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f4245u;

    /* renamed from: v, reason: collision with root package name */
    public int f4246v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, G7.c cVar) {
        super(cVar);
        this.f4245u = gVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f4244t = obj;
        this.f4246v |= Integer.MIN_VALUE;
        Object b9 = this.f4245u.b(null, null, null, this);
        if (b9 == F7.a.f2587a) {
            return b9;
        }
        return new j(b9);
    }
}
