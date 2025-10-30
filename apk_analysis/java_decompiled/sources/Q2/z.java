package Q2;

import j3.F0;
import j3.G0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final F0 f6311a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6312b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6313c;

    public z(G0 g02, int i9, int i10, String str) {
        this.f6311a = (F0) g02.f19338a.get(i9);
        this.f6312b = i10;
        this.f6313c = str;
    }

    public final boolean a() {
        return this.f6311a.f19329e[this.f6312b];
    }
}
