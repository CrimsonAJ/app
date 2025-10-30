package I1;

import C2.C0057c;
import C2.C0059e;
import C2.E;
import C2.O;
import C2.S;
import C2.g0;
import G2.s;
import G2.t;
import G2.v;
import G2.x;
import L2.C0237a;
import L2.C0238b;
import L2.C0240d;
import L2.C0242f;
import L2.C0244h;
import L2.G;
import L2.H;
import L2.w;
import L2.z;
import O2.C0276b;
import O2.C0278d;
import O2.C0280f;
import O2.C0282h;
import O2.C0284j;
import O2.C0286l;
import O2.C0288n;
import O2.C0290p;
import O2.C0293t;
import O2.C0295v;
import O2.C0297x;
import O2.C0299z;
import O2.J;
import O2.L;
import O2.N;
import O2.P;
import O2.U;
import O2.V;
import O2.W;
import O2.Y;
import O2.a0;
import O2.b0;
import O2.d0;
import O2.f0;
import O2.r;
import P2.u;
import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import co.notix.R;
import com.anilab.data.model.response.LoginResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.tencent.mmkv.MMKV;
import i8.A;
import i8.C1417g;
import i8.D;
import java.io.File;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l1.C1535g;
import o7.C1730v;
import o7.y;
import y2.C2203a;
import y2.SharedPreferencesC2204b;
import y7.InterfaceC2220b;
import z8.Q;

/* loaded from: classes.dex */
public final class i implements InterfaceC2220b {

    /* renamed from: a, reason: collision with root package name */
    public final j f3289a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3290b;

    public i(j jVar, int i9) {
        this.f3289a = jVar;
        this.f3290b = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [O0.b] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, i8.z] */
    /* JADX WARN: Type inference failed for: r0v37, types: [i8.b, b6.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, i8.z] */
    /* JADX WARN: Type inference failed for: r7v21, types: [i8.D] */
    @Override // z7.InterfaceC2251a
    public final Object get() {
        Object h7;
        Object h9;
        int i9 = 3;
        Object obj = null;
        int i10 = 1;
        int i11 = 0;
        int i12 = this.f3290b;
        int i13 = i12 / 100;
        j jVar = this.f3289a;
        if (i13 != 0) {
            if (i13 == 1) {
                switch (i12) {
                    case 100:
                        return new w((C2203a) jVar.f3350d.get());
                    case 101:
                        return new f0((E) jVar.f3379q.get());
                    case 102:
                        return new u((g0) jVar.f3371m.get(), (x) jVar.f3375o.get());
                    case 103:
                        return new L((E) jVar.f3379q.get(), (t) jVar.f3346b1.get());
                    case 104:
                        return new t((s) jVar.f3330U.get());
                    case 105:
                        return new N((E) jVar.f3379q.get(), (s) jVar.f3330U.get());
                    case 106:
                        return new d0((E) jVar.f3379q.get(), (s) jVar.f3330U.get());
                    case 107:
                        return new P2.d((g0) jVar.f3371m.get());
                    case 108:
                        Context context = jVar.f3341a.f4790a;
                        AbstractC0485a.d(context);
                        return new K1.g(context);
                    default:
                        throw new AssertionError(i12);
                }
            }
            throw new AssertionError(i12);
        }
        switch (i12) {
            case 0:
                return new C0238b((C2203a) jVar.f3350d.get());
            case 1:
                Context context2 = jVar.f3341a.f4790a;
                AbstractC0485a.d(context2);
                y moshi = (y) jVar.f3347c.get();
                kotlin.jvm.internal.h.e(moshi, "moshi");
                MMKV.d(context2);
                SharedPreferencesC2204b sharedPreferencesC2204b = new SharedPreferencesC2204b(MMKV.a());
                if (!sharedPreferencesC2204b.getBoolean("MIGRATED", false)) {
                    try {
                        String str = context2.getApplicationInfo().dataDir;
                        h7 = Boolean.valueOf(!new File(str + "/shared_prefs/com.anilab.data.xml").exists());
                    } catch (Throwable th) {
                        h7 = AbstractC0485a.h(th);
                    }
                    Object obj2 = Boolean.FALSE;
                    if (h7 instanceof A7.i) {
                        h7 = obj2;
                    }
                    if (((Boolean) h7).booleanValue()) {
                        sharedPreferencesC2204b.putBoolean("MIGRATED", true);
                    }
                }
                if (!sharedPreferencesC2204b.getBoolean("MIGRATED", false)) {
                    try {
                        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
                        kotlin.jvm.internal.h.d(build, "build(...)");
                        O0.c cVar = new O0.c(context2, 0);
                        String keystoreAlias = build.getKeystoreAlias();
                        String str2 = (String) cVar.f5263b;
                        if (str2.equals(keystoreAlias)) {
                            cVar.f5264c = build;
                            ?? a5 = O0.b.a(context2, cVar.h());
                            if (a5.getBoolean("FIRST_RUN", true)) {
                                sharedPreferencesC2204b.putBoolean("MIGRATED", true);
                            } else {
                                sharedPreferencesC2204b = a5;
                            }
                        } else {
                            StringBuilder r5 = AbstractC0953k1.r("KeyGenParamSpec's key alias does not match provided alias (", str2, " vs ");
                            r5.append(build.getKeystoreAlias());
                            throw new IllegalArgumentException(r5.toString());
                        }
                    } catch (Exception unused) {
                        sharedPreferencesC2204b.putBoolean("MIGRATED", true);
                    }
                }
                return new C2203a(sharedPreferencesC2204b, moshi);
            case 2:
                return new y(new C1730v());
            case 3:
                return new C0237a((C2203a) jVar.f3350d.get());
            case 4:
                return new z((C2203a) jVar.f3350d.get());
            case 5:
                return new L2.y((C2203a) jVar.f3350d.get());
            case 6:
                return new P2.b((g0) jVar.f3371m.get());
            case 7:
                B2.b apiService = (B2.b) jVar.f3367k.get();
                C2203a encryptedPreference = (C2203a) jVar.f3350d.get();
                InterfaceC0484z coroutineScope = (InterfaceC0484z) jVar.f3369l.get();
                kotlin.jvm.internal.h.e(apiService, "apiService");
                kotlin.jvm.internal.h.e(encryptedPreference, "encryptedPreference");
                kotlin.jvm.internal.h.e(coroutineScope, "coroutineScope");
                return new g0(apiService, encryptedPreference, coroutineScope);
            case 8:
                Q retrofit = (Q) jVar.j.get();
                kotlin.jvm.internal.h.e(retrofit, "retrofit");
                Object b9 = retrofit.b(B2.b.class);
                kotlin.jvm.internal.h.d(b9, "create(...)");
                return (B2.b) b9;
            case 9:
                i8.E okHttpClient = (i8.E) jVar.f3364i.get();
                y moshi2 = (y) jVar.f3347c.get();
                C2203a encryptedPreference2 = (C2203a) jVar.f3350d.get();
                kotlin.jvm.internal.h.e(okHttpClient, "okHttpClient");
                kotlin.jvm.internal.h.e(moshi2, "moshi");
                kotlin.jvm.internal.h.e(encryptedPreference2, "encryptedPreference");
                C1535g c1535g = new C1535g(15);
                c1535g.f20182a = okHttpClient;
                c1535g.e(O4.h.t(encryptedPreference2));
                c1535g.b(new A8.a(moshi2));
                return c1535g.g();
            case R.styleable.GradientColor_android_endX /* 10 */:
                Context context3 = jVar.f3341a.f4790a;
                AbstractC0485a.d(context3);
                y moshi3 = (y) jVar.f3347c.get();
                C2203a encryptedPreference3 = (C2203a) jVar.f3350d.get();
                kotlin.jvm.internal.h.e(moshi3, "moshi");
                kotlin.jvm.internal.h.e(encryptedPreference3, "encryptedPreference");
                ?? d9 = new D();
                if (E2.d.f1936b.get()) {
                    D b10 = new i8.E(d9).b();
                    b10.f18952k = new C1417g(new File(context3.getCacheDir(), "okhttp-doh-cache"));
                    i8.E e8 = new i8.E(b10);
                    g6.o oVar = g6.o.f17761a;
                    String F2 = oVar.F();
                    kotlin.jvm.internal.h.e(F2, "<this>");
                    i8.x xVar = new i8.x();
                    xVar.e(null, F2);
                    i8.y b11 = xVar.b();
                    List o02 = B7.j.o0(new InetAddress[]{InetAddress.getByName(oVar.E()), InetAddress.getByName(oVar.D())});
                    D b12 = e8.b();
                    A a9 = j8.b.f19800c;
                    b12.d(new j8.a(0, b11.f19172d, o02));
                    d9.d(new j8.b(new i8.E(b12), b11));
                }
                d9.d(new w2.d(i9));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                d9.b(60L);
                d9.c();
                d9.e(30L);
                d9.a(new Object());
                d9.a(new B2.g(context3));
                d9.a(new B2.e(i11));
                d9.a(new B2.e(i10));
                i8.E e9 = new i8.E(d9);
                ?? obj3 = new Object();
                obj3.f11382a = e9;
                obj3.f11383b = moshi3;
                obj3.f11384c = encryptedPreference3;
                obj3.f11385d = g8.e.a();
                String o03 = g6.o.f17761a.o0();
                kotlin.jvm.internal.d a10 = kotlin.jvm.internal.p.a(LoginResponse.class);
                boolean equals = a10.equals(kotlin.jvm.internal.p.a(Float.TYPE));
                SharedPreferences sharedPreferences = encryptedPreference3.f24771a;
                if (equals) {
                    obj = (LoginResponse) Float.valueOf(sharedPreferences.getFloat(o03, 0.0f));
                } else if (a10.equals(kotlin.jvm.internal.p.a(Integer.TYPE))) {
                    obj = (LoginResponse) Integer.valueOf(sharedPreferences.getInt(o03, 0));
                } else if (a10.equals(kotlin.jvm.internal.p.a(Long.TYPE))) {
                    obj = (LoginResponse) Long.valueOf(sharedPreferences.getLong(o03, 0L));
                } else if (a10.equals(kotlin.jvm.internal.p.a(String.class))) {
                    Object string = sharedPreferences.getString(o03, "");
                    if (string != null) {
                        obj = (LoginResponse) string;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.anilab.data.model.response.LoginResponse");
                    }
                } else if (a10.equals(kotlin.jvm.internal.p.a(Boolean.TYPE))) {
                    obj = (LoginResponse) Boolean.valueOf(sharedPreferences.getBoolean(o03, false));
                } else {
                    String string2 = sharedPreferences.getString(o03, "");
                    if (string2 != null && string2.length() != 0) {
                        try {
                            h9 = encryptedPreference3.f24772b.a(LoginResponse.class).a(string2);
                        } catch (Throwable th2) {
                            h9 = AbstractC0485a.h(th2);
                        }
                        if (!(h9 instanceof A7.i)) {
                            obj = h9;
                        }
                    }
                }
                obj3.f11386e = (LoginResponse) obj;
                obj3.f11387f = Z0.a.q(new B2.i(i11, obj3));
                d9.a(new B2.l(i11, encryptedPreference3));
                d9.a(new Object());
                d9.f18949g = obj3;
                return new i8.E(d9);
            case R.styleable.GradientColor_android_endY /* 11 */:
                return B.a(B.b());
            case 12:
                return new P2.i((g0) jVar.f3371m.get(), (x) jVar.f3375o.get());
            case 13:
                return new Object();
            case 14:
                return new C0299z((E) jVar.f3379q.get(), (G2.e) jVar.f3386u.get());
            case 15:
                B2.b apiService2 = (B2.b) jVar.f3367k.get();
                C2203a encryptedPreference4 = (C2203a) jVar.f3350d.get();
                kotlin.jvm.internal.h.e(apiService2, "apiService");
                kotlin.jvm.internal.h.e(encryptedPreference4, "encryptedPreference");
                return new E(apiService2, encryptedPreference4);
            case 16:
                return new G2.e((G2.f) jVar.f3381r.get(), (G2.w) jVar.f3382s.get(), (G2.y) jVar.f3384t.get());
            case 17:
                return new Object();
            case 18:
                return new Object();
            case 19:
                return new Object();
            case 20:
                return new J((E) jVar.f3379q.get(), (G2.u) jVar.f3390w.get());
            case 21:
                return new G2.u((G2.f) jVar.f3381r.get(), (G2.w) jVar.f3382s.get(), (G2.y) jVar.f3384t.get());
            case 22:
                return new C0282h((E) jVar.f3379q.get(), (G2.f) jVar.f3381r.get());
            case 23:
                return new C0276b((E) jVar.f3379q.get(), (G2.f) jVar.f3381r.get());
            case 24:
                return new L2.l((O) jVar.f3291A.get(), (G2.c) jVar.f3293B.get());
            case 25:
                y moshi4 = (y) jVar.f3347c.get();
                B2.b apiService3 = (B2.b) jVar.f3367k.get();
                C2203a encryptedPreference5 = (C2203a) jVar.f3350d.get();
                kotlin.jvm.internal.h.e(moshi4, "moshi");
                kotlin.jvm.internal.h.e(apiService3, "apiService");
                kotlin.jvm.internal.h.e(encryptedPreference5, "encryptedPreference");
                return new O(moshi4, apiService3, encryptedPreference5);
            case 26:
                return new Object();
            case 27:
                return new C0278d((E) jVar.f3379q.get());
            case 28:
                return new C0284j((E) jVar.f3379q.get());
            case 29:
                return new Y((E) jVar.f3379q.get());
            case 30:
                E movieRepository = (E) jVar.f3379q.get();
                G2.f commentMapper = (G2.f) jVar.f3381r.get();
                kotlin.jvm.internal.h.e(movieRepository, "movieRepository");
                kotlin.jvm.internal.h.e(commentMapper, "commentMapper");
                return new Object();
            case 31:
                return new r((E) jVar.f3379q.get(), (G2.d) jVar.f3305H.get());
            case 32:
                return new G2.d((G2.f) jVar.f3381r.get(), (G2.w) jVar.f3382s.get());
            case 33:
                return new L2.u((C2203a) jVar.f3350d.get());
            case 34:
                return new P2.q((g0) jVar.f3371m.get());
            case 35:
                return new O2.B((E) jVar.f3379q.get(), (G2.k) jVar.f3312L.get());
            case 36:
                return new Object();
            case 37:
                return new C0288n((E) jVar.f3379q.get(), (G2.j) jVar.f3318O.get());
            case 38:
                return new G2.j((v) jVar.f3316N.get());
            case 39:
                return new Object();
            case 40:
                return new U((S) jVar.f3322Q.get());
            case 41:
                return new S();
            case 42:
                return new P2.y((g0) jVar.f3371m.get());
            case 43:
                return new C0286l((E) jVar.f3379q.get(), (s) jVar.f3330U.get());
            case 44:
                return new s((G2.n) jVar.f3328T.get());
            case 45:
                return new Object();
            case 46:
                return new M2.d((C0057c) jVar.f3334W.get(), (G2.n) jVar.f3328T.get());
            case 47:
                B2.b apiService4 = (B2.b) jVar.f3367k.get();
                C2203a encryptedPreference6 = (C2203a) jVar.f3350d.get();
                kotlin.jvm.internal.h.e(apiService4, "apiService");
                kotlin.jvm.internal.h.e(encryptedPreference6, "encryptedPreference");
                return new C0057c(apiService4, encryptedPreference6);
            case 48:
                return new L2.n((O) jVar.f3291A.get(), (G2.r) jVar.f3339Z.get());
            case 49:
                return new G2.r((G2.l) jVar.Y.get());
            case 50:
                return new Object();
            case 51:
                return new K2.b((O) jVar.f3291A.get(), (G2.g) jVar.f3345b0.get());
            case 52:
                return new Object();
            case 53:
                return new C0295v((E) jVar.f3379q.get(), (G2.o) jVar.f3357f0.get());
            case 54:
                return new G2.o((s) jVar.f3330U.get(), (G2.m) jVar.f3351d0.get(), (G2.h) jVar.f3354e0.get());
            case 55:
                return new Object();
            case 56:
                return new G2.h((s) jVar.f3330U.get());
            case 57:
                return new C0290p((E) jVar.f3379q.get(), (G2.o) jVar.f3357f0.get());
            case 58:
                return new O2.E((E) jVar.f3379q.get(), (s) jVar.f3330U.get());
            case 59:
                return new C0280f((E) jVar.f3379q.get());
            case 60:
                return new a0((E) jVar.f3379q.get());
            case 61:
                return new P2.e((g0) jVar.f3371m.get());
            case 62:
                return new P2.w((g0) jVar.f3371m.get());
            case 63:
                return new C0293t((E) jVar.f3379q.get(), (G2.h) jVar.f3354e0.get());
            case 64:
                return new W((C2203a) jVar.f3350d.get());
            case 65:
                return new b0((C2203a) jVar.f3350d.get());
            case 66:
                return new P2.o((g0) jVar.f3371m.get(), (x) jVar.f3375o.get());
            case 67:
                return new Object();
            case 68:
                return new P2.m((g0) jVar.f3371m.get(), (x) jVar.f3375o.get());
            case 69:
                return new P2.k((g0) jVar.f3371m.get(), (G2.w) jVar.f3382s.get());
            case 70:
                return new C0240d((O) jVar.f3291A.get());
            case 71:
                return new G((C2203a) jVar.f3350d.get());
            case 72:
                return new P2.g((g0) jVar.f3371m.get());
            case 73:
                return new L2.v((C2203a) jVar.f3350d.get());
            case 74:
                return new H((C2203a) jVar.f3350d.get());
            case 75:
                return new M2.b((C0057c) jVar.f3334W.get(), (G2.n) jVar.f3328T.get());
            case 76:
                return new L2.t((O) jVar.f3291A.get(), (G2.b) jVar.f3294B0.get());
            case 77:
                return new G2.b((G2.p) jVar.f3292A0.get());
            case 78:
                return new Object();
            case 79:
                return new C0242f((O) jVar.f3291A.get());
            case 80:
                return new C0244h((O) jVar.f3291A.get());
            case 81:
                return new Object();
            case 82:
                return new L2.x((C2203a) jVar.f3350d.get());
            case 83:
                return new Object();
            case 84:
                return new N2.d((C0059e) jVar.f3308I0.get());
            case 85:
                y moshi5 = (y) jVar.f3347c.get();
                kotlin.jvm.internal.h.e(moshi5, "moshi");
                return new C0059e(moshi5);
            case 86:
                return new N2.b((g0) jVar.f3371m.get());
            case 87:
                return new N2.f((g0) jVar.f3371m.get());
            case 88:
                return new O2.H((E) jVar.f3379q.get(), (s) jVar.f3330U.get());
            case 89:
                return new P((E) jVar.f3379q.get(), (G2.z) jVar.f3317N0.get());
            case 90:
                return new Object();
            case 91:
                return new L2.j((O) jVar.f3291A.get(), (G2.i) jVar.f3321P0.get());
            case 92:
                return new Object();
            case 93:
                return new O2.D((E) jVar.f3379q.get(), (s) jVar.f3330U.get());
            case 94:
                return new O2.S((E) jVar.f3379q.get(), (s) jVar.f3330U.get());
            case 95:
                return new P2.s((g0) jVar.f3371m.get());
            case 96:
                return new L2.A((C2203a) jVar.f3350d.get());
            case 97:
                return new C0297x((E) jVar.f3379q.get(), (G2.a) jVar.f3333V0.get());
            case 98:
                return new Object();
            case 99:
                return new V((C2203a) jVar.f3350d.get());
            default:
                throw new AssertionError(i12);
        }
    }
}
