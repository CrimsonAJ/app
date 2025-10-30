package G0;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f2728l = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name */
    public final E f2729a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2730b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2731c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2732d;

    /* renamed from: e, reason: collision with root package name */
    public final C0142h f2733e;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f2735g;

    /* renamed from: h, reason: collision with root package name */
    public final A6.t f2736h;

    /* renamed from: i, reason: collision with root package name */
    public final C0152s f2737i;
    public final AtomicBoolean j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public O7.a f2738k = new C2.P(1);

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f2734f = new LinkedHashMap();

    public X(E e8, HashMap hashMap, HashMap hashMap2, String[] strArr, boolean z9, C0142h c0142h) {
        String str;
        this.f2729a = e8;
        this.f2730b = hashMap;
        this.f2731c = hashMap2;
        this.f2732d = z9;
        this.f2733e = c0142h;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i9 = 0; i9 < length; i9++) {
            String str2 = strArr[i9];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
            this.f2734f.put(lowerCase, Integer.valueOf(i9));
            String str3 = (String) this.f2730b.get(strArr[i9]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                kotlin.jvm.internal.h.d(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i9] = lowerCase;
        }
        this.f2735g = strArr2;
        for (Map.Entry entry : this.f2730b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            kotlin.jvm.internal.h.d(lowerCase2, "toLowerCase(...)");
            if (this.f2734f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                kotlin.jvm.internal.h.d(lowerCase3, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f2734f;
                linkedHashMap.put(lowerCase3, B7.y.C(linkedHashMap, lowerCase2));
            }
        }
        this.f2736h = new A6.t(this.f2735g.length);
        this.f2737i = new C0152s(this.f2735g.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r4 == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(G0.X r4, G0.InterfaceC0154u r5, G7.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof G0.M
            if (r0 == 0) goto L16
            r0 = r6
            G0.M r0 = (G0.M) r0
            int r1 = r0.f2678u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f2678u = r1
            goto L1b
        L16:
            G0.M r0 = new G0.M
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.f2676s
            F7.a r6 = F7.a.f2587a
            int r1 = r0.f2678u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r5 = r0.f2675r
            java.util.Set r5 = (java.util.Set) r5
            a.AbstractC0485a.A(r4)
            return r5
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            java.lang.Object r5 = r0.f2675r
            G0.u r5 = (G0.InterfaceC0154u) r5
            a.AbstractC0485a.A(r4)
            goto L57
        L41:
            a.AbstractC0485a.A(r4)
            G0.L r4 = new G0.L
            r1 = 1
            r4.<init>(r1)
            r0.f2675r = r5
            r0.f2678u = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.c(r1, r4, r0)
            if (r4 != r6) goto L57
            goto L6b
        L57:
            java.util.Set r4 = (java.util.Set) r4
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L6c
            r0.f2675r = r4
            r0.f2678u = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = com.google.android.gms.internal.measurement.Y1.n(r5, r1, r0)
            if (r5 != r6) goto L6c
        L6b:
            return r6
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.X.a(G0.X, G0.u, G7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #2 {all -> 0x0095, blocks: (B:13:0x0082, B:15:0x008a, B:32:0x004a, B:36:0x0057, B:40:0x0069), top: B:31:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(G0.X r7, G7.c r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof G0.N
            if (r0 == 0) goto L16
            r0 = r8
            G0.N r0 = (G0.N) r0
            int r1 = r0.f2683v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f2683v = r1
            goto L1b
        L16:
            G0.N r0 = new G0.N
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f2681t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f2683v
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            A1.g r7 = r0.f2680s
            G0.X r0 = r0.f2679r
            a.AbstractC0485a.A(r8)     // Catch: java.lang.Throwable -> L30
            r2 = r7
            r7 = r0
            goto L82
        L30:
            r8 = move-exception
            goto La6
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            a.AbstractC0485a.A(r8)
            G0.E r8 = r7.f2729a
            A1.g r2 = r8.f2647f
            boolean r4 = r2.l()
            B7.v r5 = B7.v.f1137a
            if (r4 == 0) goto Laa
            java.util.concurrent.atomic.AtomicBoolean r4 = r7.j     // Catch: java.lang.Throwable -> L95
            r6 = 0
            boolean r4 = r4.compareAndSet(r3, r6)     // Catch: java.lang.Throwable -> L95
            if (r4 != 0) goto L57
            r2.H()
            return r5
        L57:
            O7.a r4 = r7.f2738k     // Catch: java.lang.Throwable -> L95
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L95
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L95
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L95
            if (r4 != 0) goto L69
            r2.H()
            return r5
        L69:
            G0.P r4 = new G0.P     // Catch: java.lang.Throwable -> L95
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L95
            r0.f2679r = r7     // Catch: java.lang.Throwable -> L95
            r0.f2680s = r2     // Catch: java.lang.Throwable -> L95
            r0.f2683v = r3     // Catch: java.lang.Throwable -> L95
            G0.y r8 = r8.f2645d     // Catch: java.lang.Throwable -> La4
            if (r8 == 0) goto L9c
            I0.b r8 = r8.f2816f     // Catch: java.lang.Throwable -> La4
            java.lang.Object r8 = r8.E(r4, r0)     // Catch: java.lang.Throwable -> La4
            if (r8 != r1) goto L82
            return r1
        L82:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L95
            boolean r0 = r8.isEmpty()     // Catch: java.lang.Throwable -> L95
            if (r0 != 0) goto L98
            G0.s r0 = r7.f2737i     // Catch: java.lang.Throwable -> L95
            r0.b(r8)     // Catch: java.lang.Throwable -> L95
            G0.h r7 = r7.f2733e     // Catch: java.lang.Throwable -> L95
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L95
            goto L98
        L95:
            r8 = move-exception
        L96:
            r7 = r2
            goto La6
        L98:
            r2.H()
            return r8
        L9c:
            java.lang.String r7 = "connectionManager"
            kotlin.jvm.internal.h.h(r7)     // Catch: java.lang.Throwable -> La4
            throw r5     // Catch: java.lang.Throwable -> La4
        La2:
            r8 = r7
            goto L96
        La4:
            r7 = move-exception
            goto La2
        La6:
            r7.H()
            throw r8
        Laa:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.X.b(G0.X, G7.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e5, code lost:
    
        if (com.google.android.gms.internal.measurement.Y1.n(r6, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r15 == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r13v6, types: [G0.u] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e5 -> B:11:0x00e8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(G0.X r12, G0.K r13, int r14, G7.c r15) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.X.c(G0.X, G0.K, int, G7.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v5, types: [G0.u] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x008d -> B:10:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(G0.X r8, G0.K r9, int r10, G7.c r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof G0.T
            if (r0 == 0) goto L16
            r0 = r11
            G0.T r0 = (G0.T) r0
            int r1 = r0.f2710y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f2710y = r1
            goto L1b
        L16:
            G0.T r0 = new G0.T
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f2708w
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f2710y
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f2707v
            int r9 = r0.f2706u
            java.lang.String[] r10 = r0.f2705t
            java.lang.String r2 = r0.f2704s
            G0.u r4 = r0.f2703r
            a.AbstractC0485a.A(r11)
            r11 = r10
            r10 = r4
            goto L90
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            a.AbstractC0485a.A(r11)
            java.lang.String[] r8 = r8.f2735g
            r8 = r8[r10]
            java.lang.String[] r10 = G0.X.f2728l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L50:
            if (r9 >= r8) goto L92
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DROP TRIGGER IF EXISTS `"
            r5.<init>(r6)
            r5.append(r4)
            r4 = 96
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r0.f2703r = r10
            r0.f2704s = r2
            r0.f2705t = r11
            r0.f2706u = r9
            r0.f2707v = r8
            r0.f2710y = r3
            java.lang.Object r4 = com.google.android.gms.internal.measurement.Y1.n(r10, r4, r0)
            if (r4 != r1) goto L90
            return r1
        L90:
            int r9 = r9 + r3
            goto L50
        L92:
            A7.n r8 = A7.n.f558a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.X.d(G0.X, G0.K, int, G7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(G7.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof G0.U
            if (r0 == 0) goto L13
            r0 = r7
            G0.U r0 = (G0.U) r0
            int r1 = r0.f2714u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2714u = r1
            goto L18
        L13:
            G0.U r0 = new G0.U
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f2712s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f2714u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            A1.g r0 = r0.f2711r
            a.AbstractC0485a.A(r7)     // Catch: java.lang.Throwable -> L29
            goto L58
        L29:
            r7 = move-exception
            goto L66
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            a.AbstractC0485a.A(r7)
            G0.E r7 = r6.f2729a
            A1.g r2 = r7.f2647f
            boolean r4 = r2.l()
            if (r4 == 0) goto L6a
            G0.W r4 = new G0.W     // Catch: java.lang.Throwable -> L64
            r5 = 0
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L64
            r0.f2711r = r2     // Catch: java.lang.Throwable -> L64
            r0.f2714u = r3     // Catch: java.lang.Throwable -> L64
            G0.y r7 = r7.f2645d     // Catch: java.lang.Throwable -> L64
            if (r7 == 0) goto L5c
            I0.b r7 = r7.f2816f     // Catch: java.lang.Throwable -> L64
            java.lang.Object r7 = r7.E(r4, r0)     // Catch: java.lang.Throwable -> L64
            if (r7 != r1) goto L57
            return r1
        L57:
            r0 = r2
        L58:
            r0.H()
            goto L6a
        L5c:
            java.lang.String r7 = "connectionManager"
            kotlin.jvm.internal.h.h(r7)     // Catch: java.lang.Throwable -> L64
            throw r5     // Catch: java.lang.Throwable -> L64
        L62:
            r0 = r2
            goto L66
        L64:
            r7 = move-exception
            goto L62
        L66:
            r0.H()
            throw r7
        L6a:
            A7.n r7 = A7.n.f558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.X.e(G7.c):java.lang.Object");
    }
}
