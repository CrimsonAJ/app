package co.notix;

import Y7.InterfaceC0484z;
import co.notix.domain.RequestVars;

/* loaded from: classes.dex */
public final class bh extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f11934a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11935b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ch f11936c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RequestVars f11939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(ch chVar, String str, String str2, RequestVars requestVars, E7.d dVar) {
        super(2, dVar);
        this.f11936c = chVar;
        this.f11937d = str;
        this.f11938e = str2;
        this.f11939f = requestVars;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        bh bhVar = new bh(this.f11936c, this.f11937d, this.f11938e, this.f11939f, dVar);
        bhVar.f11935b = obj;
        return bhVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((bh) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0135, code lost:
    
        if (b8.AbstractC0714M.m(new co.notix.wb(r10.f13216a), r9) != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0072, code lost:
    
        if (r10.a(r9) == r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.bh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
