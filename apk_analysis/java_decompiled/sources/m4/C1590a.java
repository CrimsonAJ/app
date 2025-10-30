package m4;

import j3.j0;
import java.util.ArrayList;
import l4.AbstractC1566a;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1590a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20717a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20718b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20719c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20720d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20721e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20722f;

    public C1590a(ArrayList arrayList, int i9, int i10, int i11, float f9, String str) {
        this.f20717a = arrayList;
        this.f20718b = i9;
        this.f20719c = i10;
        this.f20720d = i11;
        this.f20721e = f9;
        this.f20722f = str;
    }

    public static C1590a a(A4.r rVar) {
        byte[] bArr;
        float f9;
        String str;
        int i9;
        int i10;
        try {
            rVar.I(4);
            int x5 = (rVar.x() & 3) + 1;
            if (x5 != 3) {
                ArrayList arrayList = new ArrayList();
                int x9 = rVar.x() & 31;
                int i11 = 0;
                while (true) {
                    bArr = AbstractC1566a.f20473a;
                    if (i11 >= x9) {
                        break;
                    }
                    int C8 = rVar.C();
                    int i12 = rVar.f382a;
                    rVar.I(C8);
                    byte[] bArr2 = (byte[]) rVar.f384c;
                    byte[] bArr3 = new byte[C8 + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i12, bArr3, 4, C8);
                    arrayList.add(bArr3);
                    i11++;
                }
                int x10 = rVar.x();
                for (int i13 = 0; i13 < x10; i13++) {
                    int C9 = rVar.C();
                    int i14 = rVar.f382a;
                    rVar.I(C9);
                    byte[] bArr4 = (byte[]) rVar.f384c;
                    byte[] bArr5 = new byte[C9 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i14, bArr5, 4, C9);
                    arrayList.add(bArr5);
                }
                if (x9 > 0) {
                    l4.q H8 = AbstractC1566a.H((byte[]) arrayList.get(0), x5, ((byte[]) arrayList.get(0)).length);
                    int i15 = H8.f20528e;
                    int i16 = H8.f20529f;
                    f9 = H8.f20530g;
                    str = AbstractC1566a.e(H8.f20524a, H8.f20525b, H8.f20526c);
                    i9 = i15;
                    i10 = i16;
                } else {
                    f9 = 1.0f;
                    str = null;
                    i9 = -1;
                    i10 = -1;
                }
                return new C1590a(arrayList, x5, i9, i10, f9, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw j0.a("Error parsing AVC config", e8);
        }
    }
}
