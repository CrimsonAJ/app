package F0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    public Q f2060a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2061b;

    /* renamed from: c, reason: collision with root package name */
    public long f2062c;

    /* renamed from: d, reason: collision with root package name */
    public long f2063d;

    /* renamed from: e, reason: collision with root package name */
    public long f2064e;

    /* renamed from: f, reason: collision with root package name */
    public long f2065f;

    public static void b(r0 r0Var) {
        RecyclerView recyclerView;
        int i9 = r0Var.j;
        if (!r0Var.g() && (i9 & 4) == 0 && (recyclerView = r0Var.f2226r) != null) {
            recyclerView.K(r0Var);
        }
    }

    public abstract boolean a(r0 r0Var, r0 r0Var2, Y y9, Y y10);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(F0.r0 r10) {
        /*
            r9 = this;
            F0.Q r0 = r9.f2060a
            if (r0 == 0) goto Lb7
            r1 = 1
            r10.o(r1)
            F0.r0 r2 = r10.f2217h
            r3 = 0
            if (r2 == 0) goto L13
            F0.r0 r2 = r10.f2218i
            if (r2 != 0) goto L13
            r10.f2217h = r3
        L13:
            r10.f2218i = r3
            int r2 = r10.j
            r2 = r2 & 16
            if (r2 == 0) goto L1d
            goto Lb7
        L1d:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f2054a
            r0.l0()
            A3.F r2 = r0.f10276f
            java.lang.Object r3 = r2.f52d
            F0.h r3 = (F0.C0104h) r3
            java.lang.Object r4 = r2.f51c
            o1.f r4 = (o1.C1671f) r4
            int r5 = r2.f50b
            r6 = 0
            android.view.View r7 = r10.f2210a
            if (r5 != r1) goto L43
            java.lang.Object r1 = r2.f54f
            android.view.View r1 = (android.view.View) r1
            if (r1 != r7) goto L3b
        L39:
            r1 = r6
            goto L6e
        L3b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r10.<init>(r0)
            throw r10
        L43:
            r8 = 2
            if (r5 == r8) goto Laf
            r2.f50b = r8     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r4.f21473b     // Catch: java.lang.Throwable -> L59
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5     // Catch: java.lang.Throwable -> L59
            int r5 = r5.indexOfChild(r7)     // Catch: java.lang.Throwable -> L59
            r8 = -1
            if (r5 != r8) goto L5b
            r2.o(r7)     // Catch: java.lang.Throwable -> L59
        L56:
            r2.f50b = r6
            goto L6e
        L59:
            r10 = move-exception
            goto Lac
        L5b:
            boolean r8 = r3.I(r5)     // Catch: java.lang.Throwable -> L59
            if (r8 == 0) goto L6b
            r3.K(r5)     // Catch: java.lang.Throwable -> L59
            r2.o(r7)     // Catch: java.lang.Throwable -> L59
            r4.K(r5)     // Catch: java.lang.Throwable -> L59
            goto L56
        L6b:
            r2.f50b = r6
            goto L39
        L6e:
            if (r1 == 0) goto L9b
            F0.r0 r2 = androidx.recyclerview.widget.RecyclerView.N(r7)
            F0.h0 r3 = r0.f10273c
            r3.l(r2)
            r3.i(r2)
            boolean r2 = androidx.recyclerview.widget.RecyclerView.f10233b1
            if (r2 == 0) goto L9b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "after removing animated view: "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RecyclerView"
            android.util.Log.d(r3, r2)
        L9b:
            r2 = r1 ^ 1
            r0.n0(r2)
            if (r1 != 0) goto Lb7
            boolean r10 = r10.k()
            if (r10 == 0) goto Lb7
            r0.removeDetachedView(r7, r6)
            return
        Lac:
            r2.f50b = r6
            throw r10
        Laf:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r10.<init>(r0)
            throw r10
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.Z.c(F0.r0):void");
    }

    public abstract void d(r0 r0Var);

    public abstract void e();

    public abstract boolean f();
}
