package j7;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f19792a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f19793b = Collections.synchronizedMap(new LinkedHashMap());

    public static C1477a a(d dVar) {
        Map dependencies = f19793b;
        h.d(dependencies, "dependencies");
        Object obj = dependencies.get(dVar);
        if (obj != null) {
            return (C1477a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[Catch: all -> 0x00c0, TRY_ENTER, TryCatch #0 {all -> 0x00c0, blocks: (B:12:0x0092, B:23:0x00a7, B:24:0x00bf), top: B:11:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0090 -> B:10:0x0091). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(G7.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof j7.b
            if (r0 == 0) goto L13
            r0 = r11
            j7.b r0 = (j7.b) r0
            int r1 = r0.f19791z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19791z = r1
            goto L18
        L13:
            j7.b r0 = new j7.b
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f19789x
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f19791z
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r2 = r0.f19788w
            java.util.Map r4 = r0.f19787v
            g8.a r5 = r0.f19786u
            j7.d r6 = r0.f19785t
            java.util.Iterator r7 = r0.f19784s
            java.util.Map r8 = r0.f19783r
            a.AbstractC0485a.A(r11)
            goto L91
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3b:
            a.AbstractC0485a.A(r11)
            java.util.Map r11 = j7.c.f19793b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.h.d(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r11.size()
            int r4 = B7.y.D(r4)
            r2.<init>(r4)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r7 = r11
            r4 = r2
        L5c:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Lc5
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            j7.d r6 = (j7.d) r6
            java.lang.Object r11 = r11.getValue()
            j7.a r11 = (j7.C1477a) r11
            g8.d r5 = r11.f19781a
            r0.f19783r = r4
            r0.f19784s = r7
            r0.f19785t = r6
            r0.f19786u = r5
            r0.f19787v = r4
            r0.f19788w = r2
            r0.f19791z = r3
            java.lang.Object r11 = r5.d(r0)
            if (r11 != r1) goto L90
            return r1
        L90:
            r8 = r4
        L91:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            kotlin.jvm.internal.h.e(r6, r9)     // Catch: java.lang.Throwable -> Lc0
            j7.a r9 = a(r6)     // Catch: java.lang.Throwable -> Lc0
            y6.i r9 = r9.f19782b     // Catch: java.lang.Throwable -> Lc0
            if (r9 == 0) goto La7
            r5.a(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L5c
        La7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc0
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r0 = move-exception
            r5.a(r11)
            throw r0
        Lc5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.c.b(G7.c):java.lang.Object");
    }
}
