package g2;

import Y7.InterfaceC0484z;
import java.util.List;

/* renamed from: g2.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1217T extends G7.j implements O7.p {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ List f17592A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ long f17593B;

    /* renamed from: r, reason: collision with root package name */
    public Object f17594r;

    /* renamed from: s, reason: collision with root package name */
    public a0 f17595s;

    /* renamed from: t, reason: collision with root package name */
    public List f17596t;

    /* renamed from: u, reason: collision with root package name */
    public int f17597u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a0 f17598v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f17599w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f17600x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f17601y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f17602z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217T(a0 a0Var, long j, String str, String str2, int i9, List list, long j4, E7.d dVar) {
        super(2, dVar);
        this.f17598v = a0Var;
        this.f17599w = j;
        this.f17600x = str;
        this.f17601y = str2;
        this.f17602z = i9;
        this.f17592A = list;
        this.f17593B = j4;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1217T(this.f17598v, this.f17599w, this.f17600x, this.f17601y, this.f17602z, this.f17592A, this.f17593B, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1217T) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e2, code lost:
    
        if (r6.f(r13, r12) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        if (r6.e(r13, r12) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006c, code lost:
    
        if (r13 == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C1217T.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
