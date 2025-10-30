package A3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f167f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f168a;

    /* renamed from: b, reason: collision with root package name */
    public int f169b;

    /* renamed from: c, reason: collision with root package name */
    public int f170c;

    /* renamed from: d, reason: collision with root package name */
    public int f171d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f172e;

    public final void a(byte[] bArr, int i9, int i10) {
        if (!this.f168a) {
            return;
        }
        int i11 = i10 - i9;
        byte[] bArr2 = this.f172e;
        int length = bArr2.length;
        int i12 = this.f170c + i11;
        if (length < i12) {
            this.f172e = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i9, this.f172e, this.f170c, i11);
        this.f170c += i11;
    }
}
