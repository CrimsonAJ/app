package c8;

import java.util.Arrays;

/* renamed from: c8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0792b {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0794d[] f11747a;

    /* renamed from: b, reason: collision with root package name */
    public int f11748b;

    /* renamed from: c, reason: collision with root package name */
    public int f11749c;

    /* renamed from: d, reason: collision with root package name */
    public F f11750d;

    public final AbstractC0794d b() {
        AbstractC0794d abstractC0794d;
        F f9;
        synchronized (this) {
            try {
                AbstractC0794d[] abstractC0794dArr = this.f11747a;
                if (abstractC0794dArr == null) {
                    abstractC0794dArr = e();
                    this.f11747a = abstractC0794dArr;
                } else if (this.f11748b >= abstractC0794dArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC0794dArr, abstractC0794dArr.length * 2);
                    kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
                    this.f11747a = (AbstractC0794d[]) copyOf;
                    abstractC0794dArr = (AbstractC0794d[]) copyOf;
                }
                int i9 = this.f11749c;
                do {
                    abstractC0794d = abstractC0794dArr[i9];
                    if (abstractC0794d == null) {
                        abstractC0794d = c();
                        abstractC0794dArr[i9] = abstractC0794d;
                    }
                    i9++;
                    if (i9 >= abstractC0794dArr.length) {
                        i9 = 0;
                    }
                } while (!abstractC0794d.a(this));
                this.f11749c = i9;
                this.f11748b++;
                f9 = this.f11750d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f9 != null) {
            f9.t(1);
        }
        return abstractC0794d;
    }

    public abstract AbstractC0794d c();

    public abstract AbstractC0794d[] e();

    public final void f(AbstractC0794d abstractC0794d) {
        F f9;
        int i9;
        E7.d[] b9;
        synchronized (this) {
            try {
                int i10 = this.f11748b - 1;
                this.f11748b = i10;
                f9 = this.f11750d;
                if (i10 == 0) {
                    this.f11749c = 0;
                }
                kotlin.jvm.internal.h.c(abstractC0794d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b9 = abstractC0794d.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (E7.d dVar : b9) {
            if (dVar != null) {
                dVar.resumeWith(A7.n.f558a);
            }
        }
        if (f9 != null) {
            f9.t(-1);
        }
    }
}
