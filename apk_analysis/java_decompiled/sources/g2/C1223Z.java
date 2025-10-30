package g2;

import Y7.InterfaceC0484z;
import java.util.Iterator;

/* renamed from: g2.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1223Z extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public a0 f17622r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f17623s;

    /* renamed from: t, reason: collision with root package name */
    public long f17624t;

    /* renamed from: u, reason: collision with root package name */
    public int f17625u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f17626v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f17627w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f17628x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1223Z(boolean z9, a0 a0Var, long j, E7.d dVar) {
        super(2, dVar);
        this.f17626v = z9;
        this.f17627w = a0Var;
        this.f17628x = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1223Z(this.f17626v, this.f17627w, this.f17628x, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1223Z) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ab  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C1223Z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
