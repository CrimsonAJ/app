package C2;

import Y7.InterfaceC0484z;
import java.util.List;

/* renamed from: C2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075v extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public List f1410r;

    /* renamed from: s, reason: collision with root package name */
    public List f1411s;

    /* renamed from: t, reason: collision with root package name */
    public int f1412t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ E f1413u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f1414v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f1415w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0075v(E e8, long j, List list, E7.d dVar) {
        super(2, dVar);
        this.f1413u = e8;
        this.f1414v = j;
        this.f1415w = list;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0075v(this.f1413u, this.f1414v, this.f1415w, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0075v) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:7:0x0012, B:8:0x00a0, B:10:0x00a8, B:12:0x00ac, B:13:0x00b0, B:15:0x00b6, B:19:0x00c3, B:23:0x00e3, B:26:0x00ca, B:27:0x00ce, B:29:0x00d4, B:52:0x006e), top: B:2:0x0008 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.C0075v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
