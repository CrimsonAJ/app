package P1;

import Y7.InterfaceC0484z;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class C extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f5667r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f5668s;

    /* renamed from: t, reason: collision with root package name */
    public int f5669t;

    /* renamed from: u, reason: collision with root package name */
    public int f5670u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G f5671v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f5672w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f5673x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(G g9, String str, String str2, E7.d dVar) {
        super(2, dVar);
        this.f5671v = g9;
        this.f5672w = str;
        this.f5673x = str2;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C(this.f5671v, this.f5672w, this.f5673x, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x004d, code lost:
    
        if (r2 == r1) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0282 A[SYNTHETIC] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.C.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
