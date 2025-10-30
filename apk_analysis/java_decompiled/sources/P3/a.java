package P3;

import j3.M;
import k4.C1516p;
import k4.InterfaceC1513m;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public abstract class a extends k {

    /* renamed from: k, reason: collision with root package name */
    public final long f5816k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5817l;

    /* renamed from: m, reason: collision with root package name */
    public O0.c f5818m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f5819n;

    public a(InterfaceC1513m interfaceC1513m, C1516p c1516p, M m9, int i9, Object obj, long j, long j4, long j9, long j10, long j11) {
        super(interfaceC1513m, c1516p, m9, i9, obj, j, j4, j11);
        this.f5816k = j9;
        this.f5817l = j10;
    }

    public final int e(int i9) {
        int[] iArr = this.f5819n;
        AbstractC1566a.n(iArr);
        return iArr[i9];
    }
}
