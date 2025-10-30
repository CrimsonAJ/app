package K1;

import b8.C0718Q;
import i8.N;
import kotlin.jvm.internal.h;
import q2.C1892u;
import x8.C2187g;
import x8.InterfaceC2189i;
import x8.p;

/* loaded from: classes.dex */
public final class a extends p {

    /* renamed from: b, reason: collision with root package name */
    public long f4231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f4232c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, InterfaceC2189i interfaceC2189i) {
        super(interfaceC2189i);
        this.f4232c = bVar;
    }

    @Override // x8.p, x8.I
    public final long b0(C2187g sink, long j) {
        long j4;
        h.e(sink, "sink");
        long b02 = super.b0(sink, j);
        b bVar = this.f4232c;
        if (((C1892u) bVar.f4236d) != null) {
            long j9 = this.f4231b;
            if (b02 != -1) {
                j4 = b02;
            } else {
                j4 = 0;
            }
            long j10 = j9 + j4;
            this.f4231b = j10;
            N n7 = bVar.f4234b;
            int a5 = (int) ((j10 * 100) / n7.a());
            long j11 = 1024;
            long j12 = this.f4231b / j11;
            long a9 = n7.a() / j11;
            C1892u c1892u = (C1892u) bVar.f4236d;
            switch (c1892u.f22270a) {
                case 0:
                    C0718Q c0718q = c1892u.f22271b.f22279h;
                    Integer valueOf = Integer.valueOf(a5);
                    c0718q.getClass();
                    c0718q.j(null, valueOf);
                    break;
                default:
                    C0718Q c0718q2 = c1892u.f22271b.f22279h;
                    Integer valueOf2 = Integer.valueOf(a5);
                    c0718q2.getClass();
                    c0718q2.j(null, valueOf2);
                    break;
            }
        }
        return b02;
    }
}
