package m4;

import j3.j0;
import java.util.Collections;
import java.util.List;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f20741a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20742b;

    /* renamed from: c, reason: collision with root package name */
    public final float f20743c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20744d;

    public e(List list, int i9, float f9, String str) {
        this.f20741a = list;
        this.f20742b = i9;
        this.f20743c = f9;
        this.f20744d = str;
    }

    public static e a(A4.r rVar) {
        boolean z9;
        List singletonList;
        int i9;
        try {
            rVar.I(21);
            int x5 = rVar.x() & 3;
            int x9 = rVar.x();
            int i10 = rVar.f382a;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                z9 = true;
                if (i12 >= x9) {
                    break;
                }
                rVar.I(1);
                int C8 = rVar.C();
                for (int i14 = 0; i14 < C8; i14++) {
                    int C9 = rVar.C();
                    i13 += C9 + 4;
                    rVar.I(C9);
                }
                i12++;
            }
            rVar.H(i10);
            byte[] bArr = new byte[i13];
            float f9 = 1.0f;
            String str = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 < x9) {
                int x10 = rVar.x() & 63;
                int C10 = rVar.C();
                int i17 = i11;
                while (i17 < C10) {
                    int C11 = rVar.C();
                    boolean z10 = z9;
                    System.arraycopy(AbstractC1566a.f20476d, i11, bArr, i16, 4);
                    int i18 = i16 + 4;
                    System.arraycopy((byte[]) rVar.f384c, rVar.f382a, bArr, i18, C11);
                    if (x10 == 33 && i17 == 0) {
                        l4.o G8 = AbstractC1566a.G(bArr, i18, i18 + C11);
                        float f10 = G8.f20521i;
                        i9 = x5;
                        str = AbstractC1566a.f(G8.f20513a, G8.f20514b, G8.f20515c, G8.f20516d, G8.f20517e, G8.f20518f);
                        f9 = f10;
                    } else {
                        i9 = x5;
                    }
                    i16 = i18 + C11;
                    rVar.I(C11);
                    i17++;
                    z9 = z10;
                    x5 = i9;
                    i11 = 0;
                }
                i15++;
                i11 = 0;
            }
            int i19 = x5;
            if (i13 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new e(singletonList, i19 + 1, f9, str);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw j0.a("Error parsing HEVC config", e8);
        }
    }
}
