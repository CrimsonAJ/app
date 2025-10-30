package c6;

import android.support.v4.media.session.y;
import b5.C0675y;
import b6.AbstractC0694p;
import b6.C0684f;
import b6.C0685g;
import com.google.android.gms.internal.measurement.D1;
import e6.C1145a;
import h6.r0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements U5.j {

    /* renamed from: a, reason: collision with root package name */
    public final y f11698a;

    /* renamed from: b, reason: collision with root package name */
    public final C0675y f11699b;

    /* renamed from: c, reason: collision with root package name */
    public final C0675y f11700c;

    public o(y yVar) {
        this.f11698a = yVar;
        boolean isEmpty = ((C1145a) yVar.f9333d).f17216a.isEmpty();
        C0675y c0675y = AbstractC0694p.f11388a;
        if (!isEmpty) {
            C0684f c0684f = (C0684f) C0685g.f11367b.f11369a.get();
            c0684f = c0684f == null ? C0685g.f11368c : c0684f;
            AbstractC0694p.a(yVar);
            c0684f.getClass();
            this.f11699b = c0675y;
            this.f11700c = c0675y;
            return;
        }
        this.f11699b = c0675y;
        this.f11700c = c0675y;
    }

    @Override // U5.j
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        C0675y c0675y = this.f11700c;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            y yVar = this.f11698a;
            for (U5.k kVar : yVar.M(copyOf)) {
                if (kVar.f7511e.equals(r0.LEGACY)) {
                    bArr3 = D1.j(bArr2, p.f11702b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((U5.j) kVar.f7508b).a(copyOfRange, bArr3);
                    c0675y.getClass();
                    return;
                } catch (GeneralSecurityException e8) {
                    p.f11701a.info("tag prefix matches a key, but cannot verify: " + e8);
                }
            }
            Iterator it = yVar.M(U5.b.f7495a).iterator();
            while (it.hasNext()) {
                try {
                    ((U5.j) ((U5.k) it.next()).f7508b).a(bArr, bArr2);
                    c0675y.getClass();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            c0675y.getClass();
            throw new GeneralSecurityException("invalid MAC");
        }
        c0675y.getClass();
        throw new GeneralSecurityException("tag too short");
    }

    @Override // U5.j
    public final byte[] b(byte[] bArr) {
        byte[] copyOf;
        C0675y c0675y = this.f11699b;
        y yVar = this.f11698a;
        if (((U5.k) yVar.f9332c).f7511e.equals(r0.LEGACY)) {
            bArr = D1.j(bArr, p.f11702b);
        }
        try {
            byte[] bArr2 = ((U5.k) yVar.f9332c).f7509c;
            if (bArr2 == null) {
                copyOf = null;
            } else {
                copyOf = Arrays.copyOf(bArr2, bArr2.length);
            }
            byte[] j = D1.j(copyOf, ((U5.j) ((U5.k) yVar.f9332c).f7508b).b(bArr));
            int i9 = ((U5.k) yVar.f9332c).f7512f;
            c0675y.getClass();
            return j;
        } catch (GeneralSecurityException e8) {
            c0675y.getClass();
            throw e8;
        }
    }
}
