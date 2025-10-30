package A3;

import java.util.Arrays;

/* renamed from: A3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f146e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f147a;

    /* renamed from: b, reason: collision with root package name */
    public int f148b;

    /* renamed from: c, reason: collision with root package name */
    public int f149c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f150d;

    public final void a(byte[] bArr, int i9, int i10) {
        if (!this.f147a) {
            return;
        }
        int i11 = i10 - i9;
        byte[] bArr2 = this.f150d;
        int length = bArr2.length;
        int i12 = this.f148b + i11;
        if (length < i12) {
            this.f150d = Arrays.copyOf(bArr2, i12 * 2);
        }
        System.arraycopy(bArr, i9, this.f150d, this.f148b, i11);
        this.f148b += i11;
    }
}
