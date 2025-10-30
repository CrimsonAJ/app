package X0;

import N3.m0;
import P5.S;
import a7.C0508e;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.util.Base64;
import b5.G1;
import b6.C0693o;
import b6.InterfaceC0680b;
import b7.C0699a;
import b7.C0700b;
import b7.C0701c;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import f5.AbstractC1176h;
import f5.C1185q;
import f5.InterfaceC1169a;
import f5.InterfaceC1175g;
import h6.C1287b;
import h6.Q;
import h6.r0;
import i.G;
import i3.AbstractC1379a;
import j3.C1446b0;
import j3.C1462m;
import j3.InterfaceC1451e;
import j3.InterfaceC1453f;
import j3.L;
import j3.M;
import j3.N;
import j3.O;
import j3.P;
import j3.T;
import j3.V;
import j3.Y;
import j3.p0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import k3.C1489e;
import l4.AbstractC1566a;
import m4.C1591b;
import n3.C1630g;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements l, V2.g, InterfaceC1451e, s6.d, InterfaceC0680b, InterfaceC1175g, InterfaceC1169a, P6.a, V2.e, f3.f, O5.f, l4.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8186a;

    public /* synthetic */ k(int i9) {
        this.f8186a = i9;
    }

    @Override // b6.InterfaceC0680b
    public U5.b a(C0693o c0693o) {
        switch (this.f8186a) {
            case 7:
                if (((String) c0693o.f11382a).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        C1287b D8 = C1287b.D((AbstractC1037h) c0693o.f11384c, C1043n.a());
                        if (D8.B() == 0) {
                            G1 g12 = new G1(4, false);
                            g12.f10717b = null;
                            g12.f10718c = null;
                            g12.f10719d = c6.d.f11669f;
                            g12.A(D8.z().size());
                            int y9 = D8.A().y();
                            if (y9 >= 10 && 16 >= y9) {
                                g12.f10718c = Integer.valueOf(y9);
                                g12.f10719d = c6.f.a((r0) c0693o.f11386e);
                                c6.e c3 = g12.c();
                                G1 g13 = new G1(3, false);
                                g13.f10718c = null;
                                g13.f10719d = null;
                                g13.f10717b = c3;
                                g13.f10718c = new G(4, k6.a.a(D8.z().f()));
                                g13.f10719d = (Integer) c0693o.f11387f;
                                return g13.b();
                            }
                            throw new GeneralSecurityException(AbstractC0953k1.j(y9, "Invalid tag size for AesCmacParameters: "));
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (com.google.crypto.tink.shaded.protobuf.B | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing AesCmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
            default:
                if (((String) c0693o.f11382a).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        Q E8 = Q.E((AbstractC1037h) c0693o.f11384c, C1043n.a());
                        if (E8.C() == 0) {
                            com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(8, false);
                            sVar.f16504b = null;
                            sVar.f16505c = null;
                            sVar.f16506d = null;
                            sVar.f16507e = c6.d.f11677o;
                            sVar.f16504b = Integer.valueOf(E8.A().size());
                            sVar.f16505c = Integer.valueOf(E8.B().A());
                            sVar.f16506d = c6.l.a(E8.B().z());
                            sVar.f16507e = c6.l.b((r0) c0693o.f11386e);
                            c6.k d9 = sVar.d();
                            G1 g14 = new G1(5, false);
                            g14.f10718c = null;
                            g14.f10719d = null;
                            g14.f10717b = d9;
                            g14.f10718c = new G(4, k6.a.a(E8.A().f()));
                            g14.f10719d = (Integer) c0693o.f11387f;
                            return g14.d();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (com.google.crypto.tink.shaded.protobuf.B | IllegalArgumentException unused2) {
                        throw new GeneralSecurityException("Parsing HmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
    }

    @Override // V2.e
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f8186a) {
            case 14:
                C0508e c0508e = (C0508e) obj;
                android.support.v4.media.session.y yVar = com.google.firebase.messaging.o.f16493a;
                yVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    yVar.D(c0508e, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 15:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        android.support.v4.media.session.y a5 = Y2.j.a();
                        a5.V(rawQuery.getString(1));
                        a5.f9333d = AbstractC1379a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a5.f9332c = decode;
                        arrayList.add(a5.B());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            default:
                return new C1489e((l4.u) obj);
        }
    }

    @Override // V2.g
    public void b(Exception exc) {
    }

    @Override // j3.InterfaceC1451e
    public InterfaceC1453f c(Bundle bundle) {
        CharSequence charSequence;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        Bitmap bitmap;
        float f9;
        int i9;
        int i10;
        float f10;
        int i11;
        float f11;
        int i12;
        float f12;
        int i13;
        boolean z9;
        float f13;
        S x5;
        List aVar;
        boolean z10;
        T t7;
        C1446b0 c1446b0;
        j3.Q q9;
        V v8;
        boolean z11;
        float f14 = -3.4028235E38f;
        int i14 = 13;
        boolean z12 = true;
        boolean z13 = false;
        switch (this.f8186a) {
            case 4:
                CharSequence charSequence2 = bundle.getCharSequence(Integer.toString(0, 36));
                if (charSequence2 != null) {
                    charSequence = charSequence2;
                } else {
                    charSequence = null;
                }
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
                if (alignment3 != null) {
                    alignment = alignment3;
                } else {
                    alignment = null;
                }
                Layout.Alignment alignment4 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
                if (alignment4 != null) {
                    alignment2 = alignment4;
                } else {
                    alignment2 = null;
                }
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                } else {
                    bitmap = null;
                }
                int i15 = Integer.MIN_VALUE;
                if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
                    f9 = bundle.getFloat(Integer.toString(4, 36));
                    i9 = bundle.getInt(Integer.toString(5, 36));
                } else {
                    f9 = -3.4028235E38f;
                    i9 = Integer.MIN_VALUE;
                }
                if (bundle.containsKey(Integer.toString(6, 36))) {
                    i10 = bundle.getInt(Integer.toString(6, 36));
                } else {
                    i10 = Integer.MIN_VALUE;
                }
                if (bundle.containsKey(Integer.toString(7, 36))) {
                    f10 = bundle.getFloat(Integer.toString(7, 36));
                } else {
                    f10 = -3.4028235E38f;
                }
                if (bundle.containsKey(Integer.toString(8, 36))) {
                    i11 = bundle.getInt(Integer.toString(8, 36));
                } else {
                    i11 = Integer.MIN_VALUE;
                }
                if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
                    f11 = bundle.getFloat(Integer.toString(10, 36));
                    i12 = bundle.getInt(Integer.toString(9, 36));
                } else {
                    f11 = -3.4028235E38f;
                    i12 = Integer.MIN_VALUE;
                }
                if (bundle.containsKey(Integer.toString(11, 36))) {
                    f12 = bundle.getFloat(Integer.toString(11, 36));
                } else {
                    f12 = -3.4028235E38f;
                }
                if (bundle.containsKey(Integer.toString(12, 36))) {
                    f14 = bundle.getFloat(Integer.toString(12, 36));
                }
                float f15 = f14;
                if (bundle.containsKey(Integer.toString(13, 36))) {
                    i13 = bundle.getInt(Integer.toString(13, 36));
                } else {
                    i13 = -16777216;
                    z12 = false;
                }
                int i16 = i13;
                if (!bundle.getBoolean(Integer.toString(14, 36), false)) {
                    z9 = false;
                } else {
                    z9 = z12;
                }
                if (bundle.containsKey(Integer.toString(15, 36))) {
                    i15 = bundle.getInt(Integer.toString(15, 36));
                }
                int i17 = i15;
                if (bundle.containsKey(Integer.toString(16, 36))) {
                    f13 = bundle.getFloat(Integer.toString(16, 36));
                } else {
                    f13 = 0.0f;
                }
                return new Y3.b(charSequence, alignment, alignment2, bitmap, f9, i9, i10, f10, i11, i12, f11, f12, f15, z9, i16, i17, f13);
            case 16:
                Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
                bundle2.getClass();
                ArrayList parcelableArrayList = bundle2.getParcelableArrayList(Integer.toString(0, 36));
                if (parcelableArrayList == null) {
                    P5.D d9 = P5.F.f5901b;
                    x5 = S.f5926e;
                } else {
                    x5 = AbstractC1566a.x(M.f19419f0, parcelableArrayList);
                }
                m0 m0Var = new m0(bundle2.getString(Integer.toString(1, 36), ""), (M[]) x5.toArray(new M[0]));
                int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
                intArray.getClass();
                if (intArray.length == 0) {
                    aVar = Collections.EMPTY_LIST;
                } else {
                    aVar = new R5.a(0, intArray.length, intArray);
                }
                return new i4.t(m0Var, aVar);
            case 24:
                L l9 = new L();
                if (bundle != null) {
                    ClassLoader classLoader = AbstractC1566a.class.getClassLoader();
                    int i18 = l4.y.f20553a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(Integer.toString(0, 36));
                M m9 = M.f19418Z;
                String str = m9.f19425a;
                if (string == null) {
                    string = str;
                }
                l9.f19393a = string;
                String string2 = bundle.getString(Integer.toString(1, 36));
                if (string2 == null) {
                    string2 = m9.f19426b;
                }
                l9.f19394b = string2;
                String string3 = bundle.getString(Integer.toString(2, 36));
                if (string3 == null) {
                    string3 = m9.f19427c;
                }
                l9.f19395c = string3;
                l9.f19396d = bundle.getInt(Integer.toString(3, 36), m9.f19428d);
                l9.f19397e = bundle.getInt(Integer.toString(4, 36), m9.f19429e);
                l9.f19398f = bundle.getInt(Integer.toString(5, 36), m9.f19430f);
                l9.f19399g = bundle.getInt(Integer.toString(6, 36), m9.f19431g);
                String string4 = bundle.getString(Integer.toString(7, 36));
                if (string4 == null) {
                    string4 = m9.f19433i;
                }
                l9.f19400h = string4;
                D3.c cVar = (D3.c) bundle.getParcelable(Integer.toString(8, 36));
                if (cVar == null) {
                    cVar = m9.j;
                }
                l9.f19401i = cVar;
                String string5 = bundle.getString(Integer.toString(9, 36));
                if (string5 == null) {
                    string5 = m9.f19434k;
                }
                l9.j = string5;
                String string6 = bundle.getString(Integer.toString(10, 36));
                if (string6 == null) {
                    string6 = m9.f19435l;
                }
                l9.f19402k = string6;
                l9.f19403l = bundle.getInt(Integer.toString(11, 36), m9.f19436m);
                ArrayList arrayList = new ArrayList();
                int i19 = 0;
                while (true) {
                    byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + "_" + Integer.toString(i19, 36));
                    if (byteArray == null) {
                        l9.f19404m = arrayList;
                        l9.f19405n = (C1630g) bundle.getParcelable(Integer.toString(13, 36));
                        l9.f19406o = bundle.getLong(Integer.toString(14, 36), m9.f19439p);
                        l9.f19407p = bundle.getInt(Integer.toString(15, 36), m9.f19440q);
                        l9.f19408q = bundle.getInt(Integer.toString(16, 36), m9.f19441r);
                        l9.f19409r = bundle.getFloat(Integer.toString(17, 36), m9.f19442s);
                        l9.f19410s = bundle.getInt(Integer.toString(18, 36), m9.f19443t);
                        l9.f19411t = bundle.getFloat(Integer.toString(19, 36), m9.f19444u);
                        l9.f19412u = bundle.getByteArray(Integer.toString(20, 36));
                        l9.f19413v = bundle.getInt(Integer.toString(21, 36), m9.f19446w);
                        Bundle bundle3 = bundle.getBundle(Integer.toString(22, 36));
                        if (bundle3 != null) {
                            l9.f19414w = new C1591b(bundle3.getInt(Integer.toString(0, 36), -1), bundle3.getInt(Integer.toString(1, 36), -1), bundle3.getInt(Integer.toString(2, 36), -1), bundle3.getByteArray(Integer.toString(3, 36)));
                        }
                        l9.f19415x = bundle.getInt(Integer.toString(23, 36), m9.f19448y);
                        l9.f19416y = bundle.getInt(Integer.toString(24, 36), m9.f19449z);
                        l9.f19417z = bundle.getInt(Integer.toString(25, 36), m9.f19420A);
                        l9.f19389A = bundle.getInt(Integer.toString(26, 36), m9.f19421B);
                        l9.f19390B = bundle.getInt(Integer.toString(27, 36), m9.f19422C);
                        l9.f19391C = bundle.getInt(Integer.toString(28, 36), m9.f19423D);
                        l9.f19392D = bundle.getInt(Integer.toString(29, 36), m9.f19424X);
                        return new M(l9);
                    }
                    arrayList.add(byteArray);
                    i19++;
                }
            case 25:
                if (bundle.getInt(Integer.toString(0, 36), -1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AbstractC1566a.h(z10);
                if (bundle.getBoolean(Integer.toString(1, 36), false)) {
                    return new N(bundle.getBoolean(Integer.toString(2, 36), false));
                }
                return new N();
            case 26:
                String string7 = bundle.getString(Integer.toString(0, 36), "");
                string7.getClass();
                Bundle bundle4 = bundle.getBundle(Integer.toString(1, 36));
                if (bundle4 == null) {
                    t7 = T.f19469f;
                } else {
                    t7 = new T(bundle4.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle4.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle4.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle4.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle4.getFloat(Integer.toString(4, 36), -3.4028235E38f));
                }
                Bundle bundle5 = bundle.getBundle(Integer.toString(2, 36));
                if (bundle5 == null) {
                    c1446b0 = C1446b0.f19533Z;
                } else {
                    c1446b0 = (C1446b0) C1446b0.f19534f0.c(bundle5);
                }
                C1446b0 c1446b02 = c1446b0;
                Bundle bundle6 = bundle.getBundle(Integer.toString(3, 36));
                if (bundle6 == null) {
                    q9 = j3.Q.f19463g;
                } else {
                    q9 = (j3.Q) P.f19457f.c(bundle6);
                }
                j3.Q q10 = q9;
                Bundle bundle7 = bundle.getBundle(Integer.toString(4, 36));
                if (bundle7 == null) {
                    v8 = V.f19480c;
                } else {
                    v8 = (V) V.f19481d.c(bundle7);
                }
                return new Y(string7, q10, null, t7, c1446b02, v8);
            case 27:
                O o9 = new O();
                long j = bundle.getLong(Integer.toString(0, 36), 0L);
                if (j >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC1566a.h(z11);
                o9.f19452a = j;
                long j4 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
                if (j4 != Long.MIN_VALUE && j4 < 0) {
                    z12 = false;
                }
                AbstractC1566a.h(z12);
                o9.f19453b = j4;
                o9.f19454c = bundle.getBoolean(Integer.toString(2, 36), false);
                o9.f19455d = bundle.getBoolean(Integer.toString(3, 36), false);
                o9.f19456e = bundle.getBoolean(Integer.toString(4, 36), false);
                return new P(o9);
            case 28:
                return new T(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
            default:
                G1 g12 = new G1(i14, z13);
                g12.f10718c = (Uri) bundle.getParcelable(Integer.toString(0, 36));
                g12.f10717b = bundle.getString(Integer.toString(1, 36));
                g12.f10719d = bundle.getBundle(Integer.toString(2, 36));
                return new V(g12);
        }
    }

    @Override // s6.d
    public Object e(Y2.r rVar) {
        switch (this.f8186a) {
            case 5:
                Set M7 = rVar.M(C0699a.class);
                C0701c c0701c = C0701c.f11402c;
                if (c0701c == null) {
                    synchronized (C0701c.class) {
                        try {
                            c0701c = C0701c.f11402c;
                            if (c0701c == null) {
                                c0701c = new C0701c(0);
                                C0701c.f11402c = c0701c;
                            }
                        } finally {
                        }
                    }
                }
                return new C0700b(M7, c0701c);
            case 18:
                return FirebaseSessionsRegistrar.b(rVar);
            default:
                return FirebaseSessionsRegistrar.a(rVar);
        }
    }

    @Override // X0.l
    public void f(j jVar, m mVar) {
        switch (this.f8186a) {
            case 0:
                jVar.a(mVar);
                return;
            case 1:
                jVar.d();
                return;
            default:
                jVar.e();
                return;
        }
    }

    @Override // f5.InterfaceC1169a
    public Object i(AbstractC1176h abstractC1176h) {
        switch (this.f8186a) {
            case R.styleable.GradientColor_android_endY /* 11 */:
                return 403;
            default:
                return -1;
        }
    }

    @Override // l4.i
    public void invoke(Object obj) {
        p0 p0Var = (p0) obj;
        switch (this.f8186a) {
            case 21:
                p0Var.G(new C1462m(2, new RuntimeException("Player release timed out."), 1003));
                return;
            case 22:
                p0Var.m();
                return;
            default:
                p0Var.l();
                return;
        }
    }

    @Override // f5.InterfaceC1175g
    public C1185q s(Object obj) {
        return s8.n.p(null);
    }
}
