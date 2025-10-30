package Y3;

import P5.D;
import P5.F;
import P5.S;
import java.util.List;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long f8701a;

    /* renamed from: b, reason: collision with root package name */
    public final S f8702b;

    public /* synthetic */ e(long j, S s9) {
        this.f8701a = j;
        this.f8702b = s9;
    }

    @Override // Y3.g
    public int J() {
        return 1;
    }

    @Override // Y3.g
    public int a(long j) {
        if (this.f8701a > j) {
            return 0;
        }
        return -1;
    }

    @Override // Y3.g
    public long m(int i9) {
        boolean z9;
        if (i9 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        return this.f8701a;
    }

    @Override // Y3.g
    public List w(long j) {
        if (j >= this.f8701a) {
            return this.f8702b;
        }
        D d9 = F.f5901b;
        return S.f5926e;
    }
}
