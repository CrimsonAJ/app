package Z5;

import U5.k;
import android.support.v4.media.session.y;
import b5.C0675y;
import b6.AbstractC0694p;
import b6.C0684f;
import b6.C0685g;
import com.google.android.gms.internal.measurement.D1;
import e6.C1145a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements U5.c {

    /* renamed from: a, reason: collision with root package name */
    public final y f9061a;

    /* renamed from: b, reason: collision with root package name */
    public final C0675y f9062b;

    /* renamed from: c, reason: collision with root package name */
    public final C0675y f9063c;

    public b(y yVar) {
        this.f9061a = yVar;
        boolean isEmpty = ((C1145a) yVar.f9333d).f17216a.isEmpty();
        C0675y c0675y = AbstractC0694p.f11388a;
        if (!isEmpty) {
            C0684f c0684f = (C0684f) C0685g.f11367b.f11369a.get();
            c0684f = c0684f == null ? C0685g.f11368c : c0684f;
            AbstractC0694p.a(yVar);
            c0684f.getClass();
            this.f9062b = c0675y;
            this.f9063c = c0675y;
            return;
        }
        this.f9062b = c0675y;
        this.f9063c = c0675y;
    }

    @Override // U5.c
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] copyOf;
        C0675y c0675y = this.f9062b;
        y yVar = this.f9061a;
        try {
            byte[] bArr3 = ((k) yVar.f9332c).f7509c;
            if (bArr3 == null) {
                copyOf = null;
            } else {
                copyOf = Arrays.copyOf(bArr3, bArr3.length);
            }
            byte[] j = D1.j(copyOf, ((U5.c) ((k) yVar.f9332c).f7508b).a(bArr, bArr2));
            int i9 = ((k) yVar.f9332c).f7512f;
            c0675y.getClass();
            return j;
        } catch (GeneralSecurityException e8) {
            c0675y.getClass();
            throw e8;
        }
    }

    @Override // U5.c
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        y yVar = this.f9061a;
        C0675y c0675y = this.f9063c;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = yVar.M(copyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] b9 = ((U5.c) ((k) it.next()).f7508b).b(copyOfRange, bArr2);
                    c0675y.getClass();
                    return b9;
                } catch (GeneralSecurityException e8) {
                    c.f9064a.info("ciphertext prefix matches a key, but cannot decrypt: " + e8);
                }
            }
        }
        Iterator it2 = yVar.M(U5.b.f7495a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] b10 = ((U5.c) ((k) it2.next()).f7508b).b(bArr, bArr2);
                c0675y.getClass();
                return b10;
            } catch (GeneralSecurityException unused) {
            }
        }
        c0675y.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
