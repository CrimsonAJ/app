package m7;

import O7.p;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.o f20872r;

    /* renamed from: s, reason: collision with root package name */
    public kotlin.jvm.internal.o f20873s;

    /* renamed from: t, reason: collision with root package name */
    public int f20874t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f20875u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f20876v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, E7.d dVar) {
        super(2, dVar);
        this.f20876v = eVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        c cVar = new c(this.f20876v, dVar);
        cVar.f20875u = obj;
        return cVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((JSONObject) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0184, code lost:
    
        if (r0 == r5) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x015f, code lost:
    
        if (r0 == r5) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013c, code lost:
    
        if (r2 == r5) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0117, code lost:
    
        if (r3 == r5) goto L85;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f4  */
    /* JADX WARN: Type inference failed for: r11v2, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.internal.o, java.lang.Object] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
