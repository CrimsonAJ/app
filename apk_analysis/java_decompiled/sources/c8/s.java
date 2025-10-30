package c8;

import Y7.InterfaceC0484z;
import b8.InterfaceC0725e;
import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class s extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public a8.i f11796r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f11797s;

    /* renamed from: t, reason: collision with root package name */
    public int f11798t;

    /* renamed from: u, reason: collision with root package name */
    public int f11799u;

    /* renamed from: v, reason: collision with root package name */
    public int f11800v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f11801w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725e[] f11802x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ G7.j f11803y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0726f f11804z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(E7.d dVar, O7.q qVar, InterfaceC0726f interfaceC0726f, InterfaceC0725e[] interfaceC0725eArr) {
        super(2, dVar);
        this.f11802x = interfaceC0725eArr;
        this.f11803y = (G7.j) qVar;
        this.f11804z = interfaceC0726f;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G7.j, O7.q] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        s sVar = new s(dVar, this.f11803y, this.f11804z, this.f11802x);
        sVar.f11801w = obj;
        return sVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0096, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
    
        if (r12 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
    
        r13 = r12.f1138a;
        r14 = r11[r13];
        r11[r13] = r12.f1139b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        if (r14 != r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        if (r9[r13] == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
    
        r9[r13] = (byte) r2;
        r12 = r10.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:
    
        if ((r12 instanceof a8.k) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        r12 = (B7.w) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (r12 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c5, code lost:
    
        if (r6 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        r12 = r18.f11803y;
        r18.f11801w = r11;
        r18.f11796r = r10;
        r18.f11797s = r9;
        r18.f11798t = r6;
        r18.f11799u = r2;
        r18.f11800v = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00db, code lost:
    
        if (r12.invoke(r18.f11804z, r11, r18) != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r6 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dd, code lost:
    
        return r1;
     */
    /* JADX WARN: Type inference failed for: r12v12, types: [G7.j, O7.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00db -> B:10:0x0084). Please report as a decompilation issue!!! */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
