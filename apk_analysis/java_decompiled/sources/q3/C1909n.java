package q3;

import j3.L;
import j3.M;
import java.util.Arrays;
import java.util.Collections;
import k4.C1499E;
import l4.y;

/* renamed from: q3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1909n {

    /* renamed from: a, reason: collision with root package name */
    public final int f22324a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22325b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22326c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22327d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22328e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22329f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22330g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22331h;

    /* renamed from: i, reason: collision with root package name */
    public final int f22332i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final C1499E f22333k;

    /* renamed from: l, reason: collision with root package name */
    public final D3.c f22334l;

    public C1909n(int i9, byte[] bArr) {
        Z3.f fVar = new Z3.f(bArr.length, bArr);
        fVar.o(i9 * 8);
        this.f22324a = fVar.i(16);
        this.f22325b = fVar.i(16);
        this.f22326c = fVar.i(24);
        this.f22327d = fVar.i(24);
        int i10 = fVar.i(20);
        this.f22328e = i10;
        this.f22329f = d(i10);
        this.f22330g = fVar.i(3) + 1;
        int i11 = fVar.i(5) + 1;
        this.f22331h = i11;
        this.f22332i = a(i11);
        int i12 = fVar.i(4);
        int i13 = fVar.i(32);
        int i14 = y.f20553a;
        this.j = ((i12 & 4294967295L) << 32) | (i13 & 4294967295L);
        this.f22333k = null;
        this.f22334l = null;
    }

    public static int a(int i9) {
        if (i9 != 8) {
            if (i9 != 12) {
                if (i9 != 16) {
                    if (i9 != 20) {
                        if (i9 != 24) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i9) {
        switch (i9) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f22328e;
    }

    public final M c(byte[] bArr, D3.c cVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i9 = this.f22327d;
        if (i9 <= 0) {
            i9 = -1;
        }
        D3.c cVar2 = this.f22334l;
        if (cVar2 != null) {
            if (cVar != null) {
                D3.b[] bVarArr = cVar.f1786a;
                if (bVarArr.length != 0) {
                    int i10 = y.f20553a;
                    D3.b[] bVarArr2 = cVar2.f1786a;
                    Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
                    System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
                    cVar = new D3.c(cVar2.f1787b, (D3.b[]) copyOf);
                }
            }
            cVar = cVar2;
        }
        L l9 = new L();
        l9.f19402k = "audio/flac";
        l9.f19403l = i9;
        l9.f19415x = this.f22330g;
        l9.f19416y = this.f22328e;
        l9.f19404m = Collections.singletonList(bArr);
        l9.f19401i = cVar;
        return new M(l9);
    }

    public C1909n(int i9, int i10, int i11, int i12, int i13, int i14, int i15, long j, C1499E c1499e, D3.c cVar) {
        this.f22324a = i9;
        this.f22325b = i10;
        this.f22326c = i11;
        this.f22327d = i12;
        this.f22328e = i13;
        this.f22329f = d(i13);
        this.f22330g = i14;
        this.f22331h = i15;
        this.f22332i = a(i15);
        this.j = j;
        this.f22333k = c1499e;
        this.f22334l = cVar;
    }
}
