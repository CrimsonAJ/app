package g4;

import Y3.g;
import java.util.Collections;
import java.util.List;
import l4.AbstractC1566a;

/* renamed from: g4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1253b implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final C1253b f17714b = new C1253b();

    /* renamed from: a, reason: collision with root package name */
    public final List f17715a;

    public C1253b(Y3.b bVar) {
        this.f17715a = Collections.singletonList(bVar);
    }

    @Override // Y3.g
    public final int J() {
        return 1;
    }

    @Override // Y3.g
    public final int a(long j) {
        if (j < 0) {
            return 0;
        }
        return -1;
    }

    @Override // Y3.g
    public final long m(int i9) {
        boolean z9;
        if (i9 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        return 0L;
    }

    @Override // Y3.g
    public final List w(long j) {
        if (j >= 0) {
            return this.f17715a;
        }
        return Collections.EMPTY_LIST;
    }

    public C1253b() {
        this.f17715a = Collections.EMPTY_LIST;
    }
}
