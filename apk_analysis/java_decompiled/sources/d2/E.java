package d2;

import Y7.InterfaceC0484z;
import com.anilab.domain.model.Movie;

/* loaded from: classes.dex */
public final class E extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f16720r;

    /* renamed from: s, reason: collision with root package name */
    public K f16721s;

    /* renamed from: t, reason: collision with root package name */
    public Movie f16722t;

    /* renamed from: u, reason: collision with root package name */
    public int f16723u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ K f16724v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Movie f16725w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Y7.F f16726x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(K k5, Movie movie, Y7.F f9, E7.d dVar) {
        super(2, dVar);
        this.f16724v = k5;
        this.f16725w = movie;
        this.f16726x = f9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new E(this.f16724v, this.f16725w, this.f16726x, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r2 == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
