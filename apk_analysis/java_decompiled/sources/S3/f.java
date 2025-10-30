package S3;

import java.util.List;

/* loaded from: classes.dex */
public final class f extends P3.b {

    /* renamed from: d, reason: collision with root package name */
    public final List f6761d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6762e;

    public f(long j, List list) {
        super(0L, list.size() - 1);
        this.f6762e = j;
        this.f6761d = list;
    }

    @Override // P3.l
    public final long c() {
        a();
        T3.h hVar = (T3.h) this.f6761d.get((int) this.f5822c);
        return this.f6762e + hVar.f7103e + hVar.f7101c;
    }

    @Override // P3.l
    public final long h() {
        a();
        return this.f6762e + ((T3.h) this.f6761d.get((int) this.f5822c)).f7103e;
    }
}
