package E3;

import A4.r;
import D3.c;
import Z3.f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import v4.e;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1939h;

    public static F3.a a0(r rVar) {
        String r5 = rVar.r();
        r5.getClass();
        String r7 = rVar.r();
        r7.getClass();
        return new F3.a(r5, r7, rVar.q(), rVar.q(), Arrays.copyOfRange((byte[]) rVar.f384c, rVar.f382a, rVar.f383b));
    }

    @Override // v4.e
    public final c j(D3.e eVar, ByteBuffer byteBuffer) {
        boolean z9 = true;
        switch (this.f1939h) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                f fVar = new f(byteBuffer.limit(), byteBuffer.array());
                int i9 = 12;
                fVar.r(12);
                int f9 = (fVar.f() + fVar.i(12)) - 4;
                fVar.r(44);
                fVar.s(fVar.i(12));
                fVar.r(16);
                ArrayList arrayList = new ArrayList();
                while (fVar.f() < f9) {
                    fVar.r(48);
                    int i10 = fVar.i(8);
                    fVar.r(4);
                    int f10 = fVar.f() + fVar.i(i9);
                    String str = null;
                    String str2 = null;
                    while (fVar.f() < f10) {
                        int i11 = fVar.i(8);
                        int i12 = fVar.i(8);
                        boolean z10 = z9;
                        int f11 = fVar.f() + i12;
                        if (i11 == 2) {
                            int i13 = fVar.i(16);
                            fVar.r(8);
                            if (i13 == 3) {
                                while (fVar.f() < f11) {
                                    int i14 = fVar.i(8);
                                    Charset charset = O5.e.f5489a;
                                    byte[] bArr = new byte[i14];
                                    fVar.k(i14, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i15 = fVar.i(8);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        fVar.s(fVar.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i11 == 21) {
                            Charset charset2 = O5.e.f5489a;
                            byte[] bArr2 = new byte[i12];
                            fVar.k(i12, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        fVar.o(f11 * 8);
                        z9 = z10;
                    }
                    boolean z11 = z9;
                    fVar.o(f10 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i10, str.concat(str2)));
                    }
                    z9 = z11;
                    i9 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new c(arrayList);
            default:
                return new c(a0(new r(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
