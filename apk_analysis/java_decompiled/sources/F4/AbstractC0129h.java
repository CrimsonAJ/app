package F4;

import android.accounts.Account;
import java.util.Collections;
import java.util.Set;

/* renamed from: F4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0129h extends AbstractC0126e implements C4.c {

    /* renamed from: z, reason: collision with root package name */
    public final Set f2412z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC0129h(android.content.Context r10, android.os.Looper r11, int r12, b6.C0693o r13, C4.k r14, C4.l r15) {
        /*
            r9 = this;
            F4.J r3 = F4.J.a(r10)
            B4.f r4 = B4.f.f695d
            F4.y.h(r14)
            F4.y.h(r15)
            F4.k r6 = new F4.k
            r6.<init>(r14)
            F4.k r7 = new F4.k
            r7.<init>(r15)
            java.lang.Object r14 = r13.f11385d
            r8 = r14
            java.lang.String r8 = (java.lang.String) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r10 = r13.f11384c
            java.util.Set r10 = (java.util.Set) r10
            java.util.Iterator r11 = r10.iterator()
        L2a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L45
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L3d
            goto L2a
        L3d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L45:
            r0.f2412z = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F4.AbstractC0129h.<init>(android.content.Context, android.os.Looper, int, b6.o, C4.k, C4.l):void");
    }

    @Override // C4.c
    public final Set b() {
        if (m()) {
            return this.f2412z;
        }
        return Collections.EMPTY_SET;
    }

    @Override // F4.AbstractC0126e
    public final Account p() {
        return null;
    }

    @Override // F4.AbstractC0126e
    public final Set t() {
        return this.f2412z;
    }
}
