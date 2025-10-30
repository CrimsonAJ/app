package S3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e extends P3.e {
    public byte[] j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f6759k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f6760l;

    @Override // k4.J
    public final void a() {
        try {
            this.f5846i.g(this.f5839b);
            int i9 = 0;
            int i10 = 0;
            while (i9 != -1 && !this.f6759k) {
                byte[] bArr = this.j;
                if (bArr.length < i10 + 16384) {
                    this.j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i9 = this.f5846i.D(this.j, i10, 16384);
                if (i9 != -1) {
                    i10 += i9;
                }
            }
            if (!this.f6759k) {
                this.f6760l = Arrays.copyOf(this.j, i10);
            }
            s8.n.h(this.f5846i);
        } catch (Throwable th) {
            s8.n.h(this.f5846i);
            throw th;
        }
    }

    @Override // k4.J
    public final void c() {
        this.f6759k = true;
    }
}
