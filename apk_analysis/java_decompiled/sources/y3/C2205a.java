package y3;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2205a extends Q0.b {

    /* renamed from: c, reason: collision with root package name */
    public final long f24774c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f24775d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f24776e;

    public C2205a(long j, int i9) {
        super(i9, 3);
        this.f24774c = j;
        this.f24775d = new ArrayList();
        this.f24776e = new ArrayList();
    }

    public final C2205a r(int i9) {
        ArrayList arrayList = this.f24776e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2205a c2205a = (C2205a) arrayList.get(i10);
            if (c2205a.f6039b == i9) {
                return c2205a;
            }
        }
        return null;
    }

    public final C2206b s(int i9) {
        ArrayList arrayList = this.f24775d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2206b c2206b = (C2206b) arrayList.get(i10);
            if (c2206b.f6039b == i9) {
                return c2206b;
            }
        }
        return null;
    }

    @Override // Q0.b
    public final String toString() {
        return Q0.b.d(this.f6039b) + " leaves: " + Arrays.toString(this.f24775d.toArray()) + " containers: " + Arrays.toString(this.f24776e.toArray());
    }
}
