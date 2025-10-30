package Z3;

import A4.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: h, reason: collision with root package name */
    public final int f8985h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8986i;
    public final int j;

    /* renamed from: n, reason: collision with root package name */
    public List f8990n;

    /* renamed from: o, reason: collision with root package name */
    public List f8991o;

    /* renamed from: p, reason: collision with root package name */
    public int f8992p;

    /* renamed from: q, reason: collision with root package name */
    public int f8993q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8994r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8995s;

    /* renamed from: t, reason: collision with root package name */
    public byte f8996t;

    /* renamed from: u, reason: collision with root package name */
    public byte f8997u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8999w;

    /* renamed from: x, reason: collision with root package name */
    public long f9000x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f8982y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f8983z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f8976A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f8977B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f8978C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f8979D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f8980E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F, reason: collision with root package name */
    public static final boolean[] f8981F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    public final r f8984g = new r(5, false);

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f8988l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public b f8989m = new b(0, 4);

    /* renamed from: v, reason: collision with root package name */
    public int f8998v = 0;

    /* renamed from: k, reason: collision with root package name */
    public final long f8987k = 16000000;

    public c(String str, int i9) {
        int i10;
        if ("application/x-mp4-cea-608".equals(str)) {
            i10 = 2;
        } else {
            i10 = 3;
        }
        this.f8985h = i10;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        AbstractC1566a.P("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.j = 0;
                        this.f8986i = 0;
                    } else {
                        this.j = 1;
                        this.f8986i = 1;
                    }
                } else {
                    this.j = 0;
                    this.f8986i = 1;
                }
            } else {
                this.j = 1;
                this.f8986i = 0;
            }
        } else {
            this.j = 0;
            this.f8986i = 0;
        }
        l(0);
        k();
        this.f8999w = true;
        this.f9000x = -9223372036854775807L;
    }

    @Override // Z3.i
    public final j f() {
        List list = this.f8990n;
        this.f8991o = list;
        list.getClass();
        return new j(list, 0);
    }

    @Override // Z3.i, m3.c
    public final void flush() {
        super.flush();
        this.f8990n = null;
        this.f8991o = null;
        l(0);
        this.f8993q = 4;
        this.f8989m.f8975h = 4;
        k();
        this.f8994r = false;
        this.f8995s = false;
        this.f8996t = (byte) 0;
        this.f8997u = (byte) 0;
        this.f8998v = 0;
        this.f8999w = true;
        this.f9000x = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x01c5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // Z3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(Z3.h r15) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.c.g(Z3.h):void");
    }

    @Override // Z3.i, m3.c
    /* renamed from: h */
    public final Y3.d d() {
        Y3.d dVar;
        Y3.d d9 = super.d();
        if (d9 != null) {
            return d9;
        }
        long j = this.f8987k;
        if (j != -9223372036854775807L) {
            long j4 = this.f9000x;
            if (j4 != -9223372036854775807L && this.f9053e - j4 >= j && (dVar = (Y3.d) this.f9050b.pollFirst()) != null) {
                this.f8990n = Collections.EMPTY_LIST;
                this.f9000x = -9223372036854775807L;
                dVar.s(this.f9053e, f(), Long.MAX_VALUE);
                return dVar;
            }
            return null;
        }
        return null;
    }

    @Override // Z3.i
    public final boolean i() {
        if (this.f8990n != this.f8991o) {
            return true;
        }
        return false;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f8988l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i9 = 2;
        for (int i10 = 0; i10 < size; i10++) {
            Y3.b c3 = ((b) arrayList.get(i10)).c(Integer.MIN_VALUE);
            arrayList2.add(c3);
            if (c3 != null) {
                i9 = Math.min(i9, c3.f8687i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            Y3.b bVar = (Y3.b) arrayList2.get(i11);
            if (bVar != null) {
                if (bVar.f8687i != i9) {
                    bVar = ((b) arrayList.get(i11)).c(i9);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.f8989m;
        bVar.f8974g = this.f8992p;
        bVar.f8968a.clear();
        bVar.f8969b.clear();
        bVar.f8970c.setLength(0);
        bVar.f8971d = 15;
        bVar.f8972e = 0;
        bVar.f8973f = 0;
        ArrayList arrayList = this.f8988l;
        arrayList.clear();
        arrayList.add(this.f8989m);
    }

    public final void l(int i9) {
        int i10 = this.f8992p;
        if (i10 != i9) {
            this.f8992p = i9;
            if (i9 == 3) {
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f8988l;
                    if (i11 < arrayList.size()) {
                        ((b) arrayList.get(i11)).f8974g = i9;
                        i11++;
                    } else {
                        return;
                    }
                }
            } else {
                k();
                if (i10 != 3 && i9 != 1 && i9 != 0) {
                    return;
                }
                this.f8990n = Collections.EMPTY_LIST;
            }
        }
    }

    @Override // Z3.i, m3.c
    public final void a() {
    }
}
