package P1;

import Y7.InterfaceC0484z;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class A extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f5657r;

    /* renamed from: s, reason: collision with root package name */
    public Object f5658s;

    /* renamed from: t, reason: collision with root package name */
    public G f5659t;

    /* renamed from: u, reason: collision with root package name */
    public H2.e f5660u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f5661v;

    /* renamed from: w, reason: collision with root package name */
    public int f5662w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ G f5663x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f5664y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(G g9, int i9, E7.d dVar) {
        super(2, dVar);
        this.f5663x = g9;
        this.f5664y = i9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new A(this.f5663x, this.f5664y, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0060, code lost:
    
        if (r0 == r6) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023f, code lost:
    
        if (r10.f(r0, r23) == r6) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021e  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.lang.Iterable] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
