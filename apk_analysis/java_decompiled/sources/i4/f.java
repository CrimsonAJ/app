package i4;

import P5.AbstractC0356y;
import j3.M;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18528a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18529b;

    public f(M m9, int i9) {
        this.f18528a = (m9.f19428d & 1) != 0;
        this.f18529b = o.e(i9, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        return AbstractC0356y.f6012a.c(this.f18529b, fVar.f18529b).c(this.f18528a, fVar.f18528a).e();
    }
}
