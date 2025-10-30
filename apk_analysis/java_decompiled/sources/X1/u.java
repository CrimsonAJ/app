package X1;

import Y7.InterfaceC0484z;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f8294r;

    /* renamed from: s, reason: collision with root package name */
    public List f8295s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f8296t;

    /* renamed from: u, reason: collision with root package name */
    public int f8297u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f8298v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f8299w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f8300x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, boolean z9, E7.d dVar) {
        super(2, dVar);
        this.f8299w = yVar;
        this.f8300x = z9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        u uVar = new u(this.f8299w, this.f8300x, dVar);
        uVar.f8298v = obj;
        return uVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d5, code lost:
    
        if (r7.f(r15, r14) == r0) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
