package co.notix;

import Y7.InterfaceC0484z;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class eh extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public kb f12159a;

    /* renamed from: b, reason: collision with root package name */
    public Map f12160b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12161c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f12162d;

    /* renamed from: e, reason: collision with root package name */
    public String f12163e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f12164f;

    /* renamed from: g, reason: collision with root package name */
    public int f12165g;

    /* renamed from: h, reason: collision with root package name */
    public int f12166h;

    /* renamed from: i, reason: collision with root package name */
    public int f12167i;
    public final /* synthetic */ eo j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ gh f12168k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f12169l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f12170m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f12171n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Set f12172o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ O7.l f12173p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ no f12174q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(eo eoVar, gh ghVar, int i9, String str, boolean z9, Set set, O7.l lVar, no noVar, E7.d dVar) {
        super(2, dVar);
        this.j = eoVar;
        this.f12168k = ghVar;
        this.f12169l = i9;
        this.f12170m = str;
        this.f12171n = z9;
        this.f12172o = set;
        this.f12173p = lVar;
        this.f12174q = noVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new eh(this.j, this.f12168k, this.f12169l, this.f12170m, this.f12171n, this.f12172o, this.f12173p, this.f12174q, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((eh) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0122, code lost:
    
        if (r0 == r9) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0126, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0137, code lost:
    
        if (r0 == r9) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00ac, code lost:
    
        if (r0 == r9) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x020d, code lost:
    
        if (r1 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0210, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x021c, code lost:
    
        if (r1 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0223, code lost:
    
        if (r1 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0153, code lost:
    
        if (r0 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016a, code lost:
    
        r14 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:
    
        if (r0 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0167, code lost:
    
        if (r0 != null) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x029b  */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [co.notix.kb] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0287 -> B:7:0x0291). Please report as a decompilation issue!!! */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.eh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
