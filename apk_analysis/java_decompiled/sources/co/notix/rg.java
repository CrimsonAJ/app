package co.notix;

import Y7.InterfaceC0484z;
import android.content.Context;

/* loaded from: classes.dex */
public final class rg extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sg f13115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f13116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(sg sgVar, Context context, E7.d dVar) {
        super(2, dVar);
        this.f13115b = sgVar;
        this.f13116c = context;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new rg(this.f13115b, this.f13116c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((rg) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:1|(9:(1:(1:(27:5|6|7|8|(1:12)|14|15|(1:17)|18|19|20|(1:22)|24|25|(1:27)|28|29|30|31|32|33|34|35|36|37|(1:39)|40)(2:63|64))(1:65))(1:73)|32|33|34|35|36|37|(0)|40)|66|(2:68|(1:70))|6|7|8|(2:10|12)|14|15|(0)|18|19|20|(0)|24|25|(0)|28|29|30|31|(3:(0)|(1:53)|(1:46))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0167, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0168, code lost:
    
        r0 = a.AbstractC0485a.h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0116, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        r1 = a.AbstractC0485a.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e2, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e6, code lost:
    
        r11 = a.AbstractC0485a.h(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0095, code lost:
    
        if (r11 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0097, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0070, code lost:
    
        if (r11 == r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0112 A[Catch: all -> 0x0116, TRY_LEAVE, TryCatch #3 {all -> 0x0116, blocks: (B:20:0x010c, B:22:0x0112), top: B:19:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0172  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.rg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
