package w3;

import i.G;
import java.util.ArrayDeque;
import q3.C1902g;

/* renamed from: w3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2137b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24040a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f24041b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final e f24042c = new e();

    /* renamed from: d, reason: collision with root package name */
    public G f24043d;

    /* renamed from: e, reason: collision with root package name */
    public int f24044e;

    /* renamed from: f, reason: collision with root package name */
    public int f24045f;

    /* renamed from: g, reason: collision with root package name */
    public long f24046g;

    public final long a(C1902g c1902g, int i9) {
        c1902g.e(this.f24040a, 0, i9, false);
        long j = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j = (j << 8) | (r0[i10] & 255);
        }
        return j;
    }
}
