package y3;

import l4.y;
import q3.u;

/* renamed from: y3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2212h {

    /* renamed from: a, reason: collision with root package name */
    public final u f24795a;

    /* renamed from: d, reason: collision with root package name */
    public r f24798d;

    /* renamed from: e, reason: collision with root package name */
    public C2210f f24799e;

    /* renamed from: f, reason: collision with root package name */
    public int f24800f;

    /* renamed from: g, reason: collision with root package name */
    public int f24801g;

    /* renamed from: h, reason: collision with root package name */
    public int f24802h;

    /* renamed from: i, reason: collision with root package name */
    public int f24803i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24805l;

    /* renamed from: b, reason: collision with root package name */
    public final q f24796b = new q();

    /* renamed from: c, reason: collision with root package name */
    public final A4.r f24797c = new A4.r(5, false);
    public final A4.r j = new A4.r(1);

    /* renamed from: k, reason: collision with root package name */
    public final A4.r f24804k = new A4.r(5, false);

    public C2212h(u uVar, r rVar, C2210f c2210f) {
        this.f24795a = uVar;
        this.f24798d = rVar;
        this.f24799e = c2210f;
        this.f24798d = rVar;
        this.f24799e = c2210f;
        uVar.e(rVar.f24907a.f24881f);
        d();
    }

    public final p a() {
        if (this.f24805l) {
            q qVar = this.f24796b;
            C2210f c2210f = qVar.f24891a;
            int i9 = y.f20553a;
            int i10 = c2210f.f24788a;
            p pVar = qVar.f24902m;
            if (pVar == null) {
                p[] pVarArr = this.f24798d.f24907a.f24885k;
                if (pVarArr == null) {
                    pVar = null;
                } else {
                    pVar = pVarArr[i10];
                }
            }
            if (pVar != null && pVar.f24886a) {
                return pVar;
            }
        }
        return null;
    }

    public final boolean b() {
        this.f24800f++;
        if (!this.f24805l) {
            return false;
        }
        int i9 = this.f24801g + 1;
        this.f24801g = i9;
        int[] iArr = this.f24796b.f24897g;
        int i10 = this.f24802h;
        if (i9 != iArr[i10]) {
            return true;
        }
        this.f24802h = i10 + 1;
        this.f24801g = 0;
        return false;
    }

    public final int c(int i9, int i10) {
        A4.r rVar;
        boolean z9;
        boolean z10;
        int i11;
        p a5 = a();
        if (a5 == null) {
            return 0;
        }
        q qVar = this.f24796b;
        int i12 = a5.f24889d;
        if (i12 != 0) {
            rVar = qVar.f24903n;
        } else {
            int i13 = y.f20553a;
            byte[] bArr = a5.f24890e;
            int length = bArr.length;
            A4.r rVar2 = this.f24804k;
            rVar2.F(length, bArr);
            i12 = bArr.length;
            rVar = rVar2;
        }
        int i14 = this.f24800f;
        if (qVar.f24900k && qVar.f24901l[i14]) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && i10 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        A4.r rVar3 = this.j;
        byte[] bArr2 = (byte[]) rVar3.f384c;
        if (z10) {
            i11 = 128;
        } else {
            i11 = 0;
        }
        bArr2[0] = (byte) (i11 | i12);
        rVar3.H(0);
        u uVar = this.f24795a;
        uVar.b(1, rVar3);
        uVar.b(i12, rVar);
        if (!z10) {
            return i12 + 1;
        }
        A4.r rVar4 = this.f24797c;
        if (!z9) {
            rVar4.E(8);
            byte[] bArr3 = (byte[]) rVar4.f384c;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i10 & 255);
            bArr3[4] = (byte) ((i9 >> 24) & 255);
            bArr3[5] = (byte) ((i9 >> 16) & 255);
            bArr3[6] = (byte) ((i9 >> 8) & 255);
            bArr3[7] = (byte) (i9 & 255);
            uVar.b(8, rVar4);
            return i12 + 9;
        }
        A4.r rVar5 = qVar.f24903n;
        int C8 = rVar5.C();
        rVar5.I(-2);
        int i15 = (C8 * 6) + 2;
        if (i10 != 0) {
            rVar4.E(i15);
            byte[] bArr4 = (byte[]) rVar4.f384c;
            rVar5.h(bArr4, 0, i15);
            int i16 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i10;
            bArr4[2] = (byte) ((i16 >> 8) & 255);
            bArr4[3] = (byte) (i16 & 255);
        } else {
            rVar4 = rVar5;
        }
        uVar.b(i15, rVar4);
        return i12 + 1 + i15;
    }

    public final void d() {
        q qVar = this.f24796b;
        qVar.f24894d = 0;
        qVar.f24905p = 0L;
        qVar.f24906q = false;
        qVar.f24900k = false;
        qVar.f24904o = false;
        qVar.f24902m = null;
        this.f24800f = 0;
        this.f24802h = 0;
        this.f24801g = 0;
        this.f24803i = 0;
        this.f24805l = false;
    }
}
