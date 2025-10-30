package N3;

import j3.C0;
import j3.D0;
import j3.E0;

/* renamed from: N3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268t extends E0 {

    /* renamed from: b, reason: collision with root package name */
    public final j3.Y f5191b;

    public C0268t(j3.Y y9) {
        this.f5191b = y9;
    }

    @Override // j3.E0
    public final int b(Object obj) {
        if (obj == C0267s.f5188e) {
            return 0;
        }
        return -1;
    }

    @Override // j3.E0
    public final C0 f(int i9, C0 c02, boolean z9) {
        Integer num;
        Object obj = null;
        if (z9) {
            num = 0;
        } else {
            num = null;
        }
        if (z9) {
            obj = C0267s.f5188e;
        }
        c02.h(num, obj, 0, -9223372036854775807L, 0L, O3.b.f5451f, true);
        return c02;
    }

    @Override // j3.E0
    public final int h() {
        return 1;
    }

    @Override // j3.E0
    public final Object l(int i9) {
        return C0267s.f5188e;
    }

    @Override // j3.E0
    public final D0 m(int i9, D0 d02, long j) {
        d02.b(D0.f19300r, this.f5191b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        d02.f19313l = true;
        return d02;
    }

    @Override // j3.E0
    public final int o() {
        return 1;
    }
}
