package B3;

import A4.r;
import j3.L;
import j3.M;
import j3.j0;
import l4.y;
import q3.InterfaceC1907l;
import q3.u;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f641m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f642n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1907l f643a;

    /* renamed from: b, reason: collision with root package name */
    public final u f644b;

    /* renamed from: c, reason: collision with root package name */
    public final e f645c;

    /* renamed from: d, reason: collision with root package name */
    public final int f646d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f647e;

    /* renamed from: f, reason: collision with root package name */
    public final r f648f;

    /* renamed from: g, reason: collision with root package name */
    public final int f649g;

    /* renamed from: h, reason: collision with root package name */
    public final M f650h;

    /* renamed from: i, reason: collision with root package name */
    public int f651i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f652k;

    /* renamed from: l, reason: collision with root package name */
    public long f653l;

    public a(InterfaceC1907l interfaceC1907l, u uVar, e eVar) {
        this.f643a = interfaceC1907l;
        this.f644b = uVar;
        this.f645c = eVar;
        int i9 = eVar.f670b;
        int max = Math.max(1, i9 / 10);
        this.f649g = max;
        byte[] bArr = (byte[]) eVar.f673e;
        int length = bArr.length;
        byte b9 = bArr[0];
        byte b10 = bArr[1];
        int i10 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
        this.f646d = i10;
        int i11 = eVar.f669a;
        int i12 = eVar.f671c;
        int i13 = (((i12 - (i11 * 4)) * 8) / (eVar.f672d * i11)) + 1;
        if (i10 == i13) {
            int f9 = y.f(max, i10);
            this.f647e = new byte[f9 * i12];
            this.f648f = new r(i10 * 2 * i11 * f9);
            int i14 = ((i12 * i9) * 8) / i10;
            L l9 = new L();
            l9.f19402k = "audio/raw";
            l9.f19398f = i14;
            l9.f19399g = i14;
            l9.f19403l = max * 2 * i11;
            l9.f19415x = i11;
            l9.f19416y = i9;
            l9.f19417z = 2;
            this.f650h = new M(l9);
            return;
        }
        throw j0.a("Expected frames per block: " + i13 + "; got: " + i10, null);
    }

    @Override // B3.b
    public final void a(long j, int i9) {
        this.f643a.r(new g(this.f645c, this.f646d, i9, j));
        this.f644b.e(this.f650h);
    }

    @Override // B3.b
    public final void b(long j) {
        this.f651i = 0;
        this.j = j;
        this.f652k = 0;
        this.f653l = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // B3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(q3.C1902g r25, long r26) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.a.c(q3.g, long):boolean");
    }

    public final void d(int i9) {
        long j = this.j;
        long j4 = this.f653l;
        e eVar = this.f645c;
        long O8 = j + y.O(j4, 1000000L, eVar.f670b);
        int i10 = i9 * 2 * eVar.f669a;
        this.f644b.d(O8, 1, i10, this.f652k - i10, null);
        this.f653l += i9;
        this.f652k -= i10;
    }
}
