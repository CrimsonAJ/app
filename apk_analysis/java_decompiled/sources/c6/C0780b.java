package c6;

import b6.C0682d;
import com.google.crypto.tink.shaded.protobuf.AbstractC1030a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import h6.C1286a;
import h6.C1287b;
import h6.C1288c;
import h6.C1289d;
import h6.C1290e;
import h6.C1291f;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780b extends D.n {
    @Override // D.n
    public final AbstractC1030a X(AbstractC1030a abstractC1030a) {
        C1289d c1289d = (C1289d) abstractC1030a;
        C1286a C8 = C1287b.C();
        C8.h();
        C1287b.w((C1287b) C8.f16404b);
        byte[] a5 = i6.n.a(c1289d.y());
        C1036g d9 = AbstractC1037h.d(a5, 0, a5.length);
        C8.h();
        C1287b.x((C1287b) C8.f16404b, d9);
        C1291f z9 = c1289d.z();
        C8.h();
        C1287b.y((C1287b) C8.f16404b, z9);
        return (C1287b) C8.c();
    }

    @Override // D.n
    public final Map e0() {
        HashMap hashMap = new HashMap();
        C1288c A2 = C1289d.A();
        A2.h();
        C1289d.w((C1289d) A2.f16404b);
        C1290e z9 = C1291f.z();
        z9.h();
        C1291f.w((C1291f) z9.f16404b);
        C1291f c1291f = (C1291f) z9.c();
        A2.h();
        C1289d.x((C1289d) A2.f16404b, c1291f);
        hashMap.put("AES_CMAC", new C0682d((C1289d) A2.c(), 1));
        C1288c A9 = C1289d.A();
        A9.h();
        C1289d.w((C1289d) A9.f16404b);
        C1290e z10 = C1291f.z();
        z10.h();
        C1291f.w((C1291f) z10.f16404b);
        C1291f c1291f2 = (C1291f) z10.c();
        A9.h();
        C1289d.x((C1289d) A9.f16404b, c1291f2);
        hashMap.put("AES256_CMAC", new C0682d((C1289d) A9.c(), 1));
        C1288c A10 = C1289d.A();
        A10.h();
        C1289d.w((C1289d) A10.f16404b);
        C1290e z11 = C1291f.z();
        z11.h();
        C1291f.w((C1291f) z11.f16404b);
        C1291f c1291f3 = (C1291f) z11.c();
        A10.h();
        C1289d.x((C1289d) A10.f16404b, c1291f3);
        hashMap.put("AES256_CMAC_RAW", new C0682d((C1289d) A10.c(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // D.n
    public final AbstractC1030a f0(AbstractC1037h abstractC1037h) {
        return C1289d.B(abstractC1037h, C1043n.a());
    }

    @Override // D.n
    public final void k0(AbstractC1030a abstractC1030a) {
        C1289d c1289d = (C1289d) abstractC1030a;
        c.l(c1289d.z());
        if (c1289d.y() == 32) {
        } else {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
