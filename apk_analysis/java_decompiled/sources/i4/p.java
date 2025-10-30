package i4;

import N3.m0;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f18593a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f18594b;

    public p(int i9, m0 m0Var, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC1566a.u("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f18593a = m0Var;
        this.f18594b = iArr;
    }
}
