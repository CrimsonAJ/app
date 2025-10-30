package o8;

import i8.L;
import kotlin.jvm.internal.h;
import x8.C2190j;

/* loaded from: classes.dex */
public abstract class c {
    static {
        C2190j c2190j = C2190j.f24645d;
        e0.c.D("\"\\");
        e0.c.D("\t ,=");
    }

    public static final boolean a(L l9) {
        if (!h.a(l9.f19029a.f19006b, "HEAD")) {
            int i9 = l9.f19032d;
            if (((i9 >= 100 && i9 < 200) || i9 == 204 || i9 == 304) && k8.c.k(l9) == -1 && !"chunked".equalsIgnoreCase(L.d(l9, "Transfer-Encoding"))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b9, code lost:
    
        if (r3.f7942a.matcher(r0).matches() == false) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x020f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(i8.r r35, i8.y r36, i8.w r37) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.c.b(i8.r, i8.y, i8.w):void");
    }
}
