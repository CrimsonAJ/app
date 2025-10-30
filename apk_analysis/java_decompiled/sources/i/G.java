package i;

import D4.InterfaceC0093l;
import Y7.C0464h;
import a.AbstractC0485a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.WindowManager;
import b5.W;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.C0879u1;
import com.google.android.gms.internal.cast.C0886w0;
import com.google.android.gms.internal.cast.C0890x0;
import com.google.android.gms.internal.cast.C0897z;
import com.google.android.gms.internal.cast.EnumC0894y0;
import com.google.android.gms.internal.cast.Y;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.material.chip.ChipGroup;
import f5.AbstractC1176h;
import f5.AbstractC1178j;
import f5.C1177i;
import f5.C1185q;
import f5.InterfaceC1171c;
import f5.InterfaceC1173e;
import f5.InterfaceC1175g;
import i0.AbstractC1336M;
import i0.C1331H;
import j2.C1435b;
import j3.j0;
import java.io.EOFException;
import java.lang.reflect.Type;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k4.C1499E;
import l1.C1535g;
import l3.C1564m;
import l3.RunnableC1562k;
import l4.AbstractC1566a;
import m4.C1591b;
import o.SubMenuC1659D;
import org.json.JSONObject;
import p.C1805l;
import p.InterfaceC1811o;
import q3.C1902g;
import u4.C2077b;
import u4.C2079d;
import w3.C2138c;
import z8.C2259h;
import z8.C2266o;
import z8.InterfaceC2255d;
import z8.InterfaceC2257f;
import z8.InterfaceC2258g;
import z8.O;

/* loaded from: classes.dex */
public final class G implements f.b, i6.h, m4.q, o.w, InterfaceC1811o, q5.h, InterfaceC1173e, InterfaceC1171c, w5.g, InterfaceC0093l, InterfaceC1175g, InterfaceC2258g, InterfaceC2257f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17989a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17990b;

    public /* synthetic */ G(int i9, Object obj) {
        this.f17989a = i9;
        this.f17990b = obj;
    }

    @Override // f5.InterfaceC1171c
    public void G(AbstractC1176h abstractC1176h) {
        C2079d.e((C2079d) ((u4.j) this.f17990b).f23692g, "joinApplication", abstractC1176h);
    }

    @Override // D4.InterfaceC0093l
    public void H(Object obj, Object obj2) {
        y4.s sVar = (y4.s) obj;
        y4.q qVar = new y4.q(2, (C1177i) obj2);
        Context context = sVar.f2370c;
        C4.g gVar = new C4.g(-1, -1, 0, true);
        y4.j jVar = (y4.j) sVar.u();
        C4.f fVar = new C4.f(gVar);
        Parcel Q7 = jVar.Q();
        com.google.android.gms.internal.cast.C.d(Q7, qVar);
        Q7.writeStringArray((String[]) this.f17990b);
        com.google.android.gms.internal.cast.C.c(Q7, fVar);
        jVar.i1(Q7, 7);
    }

    @Override // z8.InterfaceC2257f
    public Object a(z8.y yVar) {
        C2259h c2259h = new C2259h(yVar);
        yVar.d(new com.google.firebase.messaging.u(c2259h));
        return c2259h;
    }

    @Override // m4.q
    public void b(C1435b c1435b) {
        c1435b.a(((WindowManager) this.f17990b).getDefaultDisplay());
    }

    @Override // o.w
    public void c(o.l lVar, boolean z9) {
        if (lVar instanceof SubMenuC1659D) {
            ((SubMenuC1659D) lVar).f21314z.k().c(false);
        }
        o.w wVar = ((C1805l) this.f17990b).f22011e;
        if (wVar != null) {
            wVar.c(lVar, z9);
        }
    }

    @Override // f.b
    public void d(Object obj) {
        int i9;
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Boolean) arrayList.get(i10)).booleanValue()) {
                i9 = 0;
            } else {
                i9 = -1;
            }
            iArr[i10] = i9;
        }
        AbstractC1336M abstractC1336M = (AbstractC1336M) this.f17990b;
        C1331H c1331h = (C1331H) abstractC1336M.f18186D.pollFirst();
        if (c1331h == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        C1535g c1535g = abstractC1336M.f18198c;
        String str = c1331h.f18174a;
        if (c1535g.k(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    @Override // z8.InterfaceC2258g
    public void e(InterfaceC2255d call, Throwable th) {
        switch (this.f17989a) {
            case 24:
                ((C2259h) this.f17990b).completeExceptionally(th);
                return;
            default:
                kotlin.jvm.internal.h.e(call, "call");
                ((C0464h) this.f17990b).resumeWith(AbstractC0485a.h(th));
                return;
        }
    }

    @Override // q5.h
    public void f(ChipGroup chipGroup, ArrayList arrayList) {
        ChipGroup chipGroup2 = (ChipGroup) this.f17990b;
        if (!chipGroup2.f15967h.f24213d) {
            return;
        }
        chipGroup2.getCheckedChipId();
        throw null;
    }

    @Override // z8.InterfaceC2258g
    public void g(InterfaceC2255d call, O o9) {
        switch (this.f17989a) {
            case 24:
                boolean g9 = o9.f25587a.g();
                C2259h c2259h = (C2259h) this.f17990b;
                if (g9) {
                    c2259h.complete(o9.f25588b);
                    return;
                } else {
                    c2259h.completeExceptionally(new C2266o(o9));
                    return;
                }
            default:
                kotlin.jvm.internal.h.e(call, "call");
                ((C0464h) this.f17990b).resumeWith(o9);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i(int i9, int i10, C1902g c1902g) {
        int i11;
        int i12;
        int i13;
        long j;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        w3.d dVar = (w3.d) this.f17990b;
        SparseArray sparseArray = dVar.f24129c;
        int i19 = 0;
        int i20 = 1;
        if (i9 != 161 && i9 != 163) {
            if (i9 != 165) {
                if (i9 != 16877) {
                    if (i9 != 16981) {
                        if (i9 != 18402) {
                            if (i9 != 21419) {
                                if (i9 != 25506) {
                                    if (i9 == 30322) {
                                        dVar.d(i9);
                                        byte[] bArr = new byte[i10];
                                        dVar.f24146u.f24090v = bArr;
                                        c1902g.e(bArr, 0, i10, false);
                                        return;
                                    }
                                    throw j0.a("Unexpected id: " + i9, null);
                                }
                                dVar.d(i9);
                                byte[] bArr2 = new byte[i10];
                                dVar.f24146u.f24079k = bArr2;
                                c1902g.e(bArr2, 0, i10, false);
                                return;
                            }
                            A4.r rVar = dVar.f24135i;
                            Arrays.fill((byte[]) rVar.f384c, (byte) 0);
                            c1902g.e((byte[]) rVar.f384c, 4 - i10, i10, false);
                            rVar.H(0);
                            dVar.f24148w = (int) rVar.y();
                            return;
                        }
                        byte[] bArr3 = new byte[i10];
                        c1902g.e(bArr3, 0, i10, false);
                        dVar.d(i9);
                        dVar.f24146u.j = new q3.t(1, 0, 0, bArr3);
                        return;
                    }
                    dVar.d(i9);
                    byte[] bArr4 = new byte[i10];
                    dVar.f24146u.f24078i = bArr4;
                    c1902g.e(bArr4, 0, i10, false);
                    return;
                }
                dVar.d(i9);
                C2138c c2138c = dVar.f24146u;
                int i21 = c2138c.f24076g;
                if (i21 != 1685485123 && i21 != 1685480259) {
                    c1902g.n(i10);
                    return;
                }
                byte[] bArr5 = new byte[i10];
                c2138c.f24059N = bArr5;
                c1902g.e(bArr5, 0, i10, false);
                return;
            }
            if (dVar.f24107G == 2) {
                C2138c c2138c2 = (C2138c) sparseArray.get(dVar.f24112M);
                if (dVar.f24115P == 4 && "V_VP9".equals(c2138c2.f24071b)) {
                    A4.r rVar2 = dVar.f24139n;
                    rVar2.E(i10);
                    c1902g.e((byte[]) rVar2.f384c, 0, i10, false);
                    return;
                }
                c1902g.n(i10);
                return;
            }
            return;
        }
        int i22 = dVar.f24107G;
        A4.r rVar3 = dVar.f24133g;
        if (i22 == 0) {
            w3.e eVar = dVar.f24127b;
            dVar.f24112M = (int) eVar.c(c1902g, false, true, 8);
            dVar.f24113N = eVar.f24155c;
            dVar.f24109I = -9223372036854775807L;
            dVar.f24107G = 1;
            rVar3.E(0);
        }
        C2138c c2138c3 = (C2138c) sparseArray.get(dVar.f24112M);
        if (c2138c3 == null) {
            c1902g.n(i10 - dVar.f24113N);
            dVar.f24107G = 0;
            return;
        }
        c2138c3.f24069X.getClass();
        if (dVar.f24107G == 1) {
            dVar.k(c1902g, 3);
            int i23 = (((byte[]) rVar3.f384c)[2] & 6) >> 1;
            int i24 = 255;
            if (i23 == 0) {
                dVar.K = 1;
                int[] iArr = dVar.f24111L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.f24111L = iArr;
                iArr[0] = (i10 - dVar.f24113N) - 3;
            } else {
                dVar.k(c1902g, 4);
                int i25 = (((byte[]) rVar3.f384c)[3] & 255) + 1;
                dVar.K = i25;
                int[] iArr2 = dVar.f24111L;
                if (iArr2 == null) {
                    iArr2 = new int[i25];
                } else if (iArr2.length < i25) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i25)];
                }
                dVar.f24111L = iArr2;
                if (i23 == 2) {
                    int i26 = (i10 - dVar.f24113N) - 4;
                    int i27 = dVar.K;
                    Arrays.fill(iArr2, 0, i27, i26 / i27);
                } else if (i23 == 1) {
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        i15 = dVar.K - 1;
                        if (i28 >= i15) {
                            break;
                        }
                        dVar.f24111L[i28] = 0;
                        while (true) {
                            i16 = i30 + 1;
                            dVar.k(c1902g, i16);
                            int i31 = ((byte[]) rVar3.f384c)[i30] & 255;
                            int[] iArr3 = dVar.f24111L;
                            i17 = iArr3[i28] + i31;
                            iArr3[i28] = i17;
                            if (i31 != 255) {
                                break;
                            } else {
                                i30 = i16;
                            }
                        }
                        i29 += i17;
                        i28++;
                        i30 = i16;
                    }
                    dVar.f24111L[i15] = ((i10 - dVar.f24113N) - i30) - i29;
                } else {
                    if (i23 == 3) {
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 4;
                        while (true) {
                            int i35 = dVar.K - i20;
                            if (i32 < i35) {
                                dVar.f24111L[i32] = i19;
                                int i36 = i34 + 1;
                                dVar.k(c1902g, i36);
                                if (((byte[]) rVar3.f384c)[i34] != 0) {
                                    int i37 = i20;
                                    int i38 = i19;
                                    while (true) {
                                        if (i38 < 8) {
                                            int i39 = i37 << (7 - i38);
                                            i13 = i19;
                                            if ((((byte[]) rVar3.f384c)[i34] & i39) != 0) {
                                                i14 = i36 + i38;
                                                dVar.k(c1902g, i14);
                                                j = ((byte[]) rVar3.f384c)[i34] & i24 & (~i39);
                                                while (i36 < i14) {
                                                    j = (j << 8) | (((byte[]) rVar3.f384c)[i36] & i24);
                                                    i36++;
                                                    i24 = 255;
                                                }
                                                if (i32 > 0) {
                                                    j -= (1 << ((i38 * 7) + 6)) - 1;
                                                }
                                            } else {
                                                i38++;
                                                i19 = i13;
                                                i24 = 255;
                                            }
                                        } else {
                                            i13 = i19;
                                            j = 0;
                                            i14 = i36;
                                            break;
                                        }
                                    }
                                    if (j < -2147483648L || j > 2147483647L) {
                                        break;
                                    }
                                    int i40 = (int) j;
                                    int[] iArr4 = dVar.f24111L;
                                    if (i32 != 0) {
                                        i40 += iArr4[i32 - 1];
                                    }
                                    iArr4[i32] = i40;
                                    i33 += i40;
                                    i32++;
                                    i34 = i14;
                                    i20 = i37;
                                    i19 = i13;
                                    i24 = 255;
                                } else {
                                    throw j0.a("No valid varint length mask found", null);
                                }
                            } else {
                                i12 = i19;
                                i11 = i20;
                                dVar.f24111L[i35] = ((i10 - dVar.f24113N) - i34) - i33;
                                break;
                            }
                        }
                        throw j0.a("EBML lacing sample size out of range.", null);
                    }
                    throw j0.a("Unexpected lacing value: " + i23, null);
                }
            }
            i12 = 0;
            i11 = 1;
            byte[] bArr6 = (byte[]) rVar3.f384c;
            dVar.f24108H = dVar.m((bArr6[i11] & 255) | (bArr6[i12] << 8)) + dVar.f24102B;
            if (c2138c3.f24073d != 2 && (i9 != 163 || (((byte[]) rVar3.f384c)[2] & 128) != 128)) {
                i18 = i12;
            } else {
                i18 = i11;
            }
            dVar.f24114O = i18;
            dVar.f24107G = 2;
            dVar.f24110J = i12;
        } else {
            i11 = 1;
        }
        if (i9 == 163) {
            while (true) {
                int i41 = dVar.f24110J;
                if (i41 < dVar.K) {
                    dVar.e(c2138c3, dVar.f24108H + ((dVar.f24110J * c2138c3.f24074e) / 1000), dVar.f24114O, dVar.n(c1902g, c2138c3, dVar.f24111L[i41], false), 0);
                    dVar.f24110J++;
                } else {
                    dVar.f24107G = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i42 = dVar.f24110J;
                if (i42 < dVar.K) {
                    int[] iArr5 = dVar.f24111L;
                    boolean z9 = i11;
                    iArr5[i42] = dVar.n(c1902g, c2138c3, iArr5[i42], z9);
                    dVar.f24110J += z9 ? 1 : 0;
                } else {
                    return;
                }
            }
        }
    }

    @Override // z8.InterfaceC2257f
    public Type j() {
        return (Type) this.f17990b;
    }

    @Override // i6.h
    public Object k(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (true) {
            i6.j jVar = (i6.j) this.f17990b;
            if (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                try {
                    return jVar.f(str, (Provider) obj);
                } catch (Exception e8) {
                    if (exc == null) {
                        exc = e8;
                    }
                }
            } else {
                return jVar.f(str, null);
            }
        }
    }

    public t4.n l() {
        t4.n nVar = (t4.n) this.f17990b;
        if (nVar.f23214a != null) {
            if (!Double.isNaN(nVar.f23217d) && nVar.f23217d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(nVar.f23218e)) {
                if (!Double.isNaN(nVar.f23219f) && nVar.f23219f >= 0.0d) {
                    return nVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override // o.w
    public boolean m(o.l lVar) {
        C1805l c1805l = (C1805l) this.f17990b;
        if (lVar == c1805l.f22009c) {
            return false;
        }
        c1805l.f22030y = ((SubMenuC1659D) lVar).f21313A.f21404a;
        o.w wVar = c1805l.f22011e;
        if (wVar == null) {
            return false;
        }
        return wVar.m(lVar);
    }

    public synchronized void n(i8.O route) {
        kotlin.jvm.internal.h.e(route, "route");
        ((LinkedHashSet) this.f17990b).remove(route);
    }

    @Override // f5.InterfaceC1173e
    public void o(Object obj) {
        int i9;
        int i10;
        C0890x0 c0890x0;
        EnumC0894y0 b9;
        C2077b c2077b = (C2077b) this.f17990b;
        Bundle bundle = (Bundle) obj;
        if (Y.f14790k) {
            Context context = c2077b.f23646a;
            y4.r rVar = c2077b.f23651f;
            Y y9 = new Y(context, rVar, c2077b.f23648c, c2077b.f23654i, c2077b.f23652g);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                i9 = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            boolean z9 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", false);
            Y.f14790k = z10;
            if (i9 == 0) {
                if (z9 || z10) {
                    i9 = 0;
                } else {
                    return;
                }
            }
            y9.f14798h = new C0897z(context, bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS", 5L));
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String n7 = AbstractC0953k1.n(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            y9.f14799i = i10;
            Y2.s.b(context);
            y9.f14797g = Y2.s.a().c(W2.a.f7875e).a("CAST_SENDER_SDK", new V2.c("proto"), new C0886w0(17));
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                y9.f14795e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(n7, 0);
            if (i9 != 0) {
                D4.n g9 = D4.n.g();
                g9.f1864e = new q3.w(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                g9.f1861b = new B4.d[]{t4.v.f23272c};
                g9.f1862c = false;
                g9.f1863d = 8426;
                C1185q c3 = rVar.c(0, g9.f());
                A4.q qVar = new A4.q(y9, packageName, i9, sharedPreferences);
                c3.getClass();
                c3.d(AbstractC1178j.f17414a, qVar);
            }
            if (z9) {
                F4.y.h(sharedPreferences);
                y4.b bVar = C0890x0.f15098i;
                synchronized (C0890x0.class) {
                    try {
                        if (C0890x0.f15099k == null) {
                            C0890x0.f15099k = new C0890x0(sharedPreferences, y9, packageName);
                        }
                        c0890x0 = C0890x0.f15099k;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                HashSet hashSet = c0890x0.f15105f;
                SharedPreferences sharedPreferences2 = c0890x0.f15101b;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = c0890x0.f15106g;
                hashSet2.clear();
                c0890x0.f15107h = 0L;
                String str = C0890x0.j;
                boolean equals = str.equals(string);
                String str2 = c0890x0.f15102c;
                if (equals && str2.equals(string2)) {
                    c0890x0.f15107h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j = sharedPreferences2.getLong(str3, 0L);
                            if (j != 0 && currentTimeMillis - j > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                EnumC0894y0 b10 = C0890x0.b(str3.substring(41));
                                if (b10 != null) {
                                    hashSet2.add(b10);
                                    hashSet.add(b10);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b9 = C0890x0.b(str3.substring(41))) != null) {
                                hashSet.add(b9);
                            }
                        }
                    }
                    c0890x0.c(hashSet3);
                    F4.y.h(c0890x0.f15104e);
                    F4.y.h(c0890x0.f15103d);
                    c0890x0.f15104e.post(c0890x0.f15103d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    c0890x0.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str).putString("feature_usage_package_name", str2).apply();
                }
                C0890x0.a(EnumC0894y0.CAST_CONTEXT);
            }
            if (Y.f14790k) {
                C0879u1.a();
            }
        }
    }

    public void p(long j, int i9) {
        w3.d dVar = (w3.d) this.f17990b;
        dVar.getClass();
        if (i9 != 20529) {
            if (i9 != 20530) {
                boolean z9 = true;
                int i10 = 3;
                switch (i9) {
                    case 131:
                        dVar.d(i9);
                        dVar.f24146u.f24073d = (int) j;
                        return;
                    case 136:
                        dVar.d(i9);
                        C2138c c2138c = dVar.f24146u;
                        if (j != 1) {
                            z9 = false;
                        }
                        c2138c.f24067V = z9;
                        return;
                    case 155:
                        dVar.f24109I = dVar.m(j);
                        return;
                    case 159:
                        dVar.d(i9);
                        dVar.f24146u.f24060O = (int) j;
                        return;
                    case 176:
                        dVar.d(i9);
                        dVar.f24146u.f24081m = (int) j;
                        return;
                    case 179:
                        dVar.c(i9);
                        dVar.f24103C.a(dVar.m(j));
                        return;
                    case 186:
                        dVar.d(i9);
                        dVar.f24146u.f24082n = (int) j;
                        return;
                    case 215:
                        dVar.d(i9);
                        dVar.f24146u.f24072c = (int) j;
                        return;
                    case 231:
                        dVar.f24102B = dVar.m(j);
                        return;
                    case 238:
                        dVar.f24115P = (int) j;
                        return;
                    case 241:
                        if (!dVar.f24105E) {
                            dVar.c(i9);
                            dVar.f24104D.a(j);
                            dVar.f24105E = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.f24116Q = true;
                        return;
                    case 16871:
                        dVar.d(i9);
                        dVar.f24146u.f24076g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw j0.a("ContentCompAlgo " + j + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw j0.a("DocTypeReadVersion " + j + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw j0.a("EBMLReadVersion " + j + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw j0.a("ContentEncAlgo " + j + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw j0.a("AESSettingsCipherMode " + j + " not supported", null);
                        }
                        return;
                    case 21420:
                        dVar.f24149x = j + dVar.f24142q;
                        return;
                    case 21432:
                        int i11 = (int) j;
                        dVar.d(i9);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        dVar.f24146u.f24091w = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f24146u.f24091w = 1;
                                return;
                            }
                            dVar.f24146u.f24091w = 2;
                            return;
                        }
                        dVar.f24146u.f24091w = 0;
                        return;
                    case 21680:
                        dVar.d(i9);
                        dVar.f24146u.f24083o = (int) j;
                        return;
                    case 21682:
                        dVar.d(i9);
                        dVar.f24146u.f24085q = (int) j;
                        return;
                    case 21690:
                        dVar.d(i9);
                        dVar.f24146u.f24084p = (int) j;
                        return;
                    case 21930:
                        dVar.d(i9);
                        C2138c c2138c2 = dVar.f24146u;
                        if (j != 1) {
                            z9 = false;
                        }
                        c2138c2.f24066U = z9;
                        return;
                    case 21998:
                        dVar.d(i9);
                        dVar.f24146u.f24075f = (int) j;
                        return;
                    case 22186:
                        dVar.d(i9);
                        dVar.f24146u.f24063R = j;
                        return;
                    case 22203:
                        dVar.d(i9);
                        dVar.f24146u.f24064S = j;
                        return;
                    case 25188:
                        dVar.d(i9);
                        dVar.f24146u.f24061P = (int) j;
                        return;
                    case 30114:
                        dVar.f24117R = j;
                        return;
                    case 30321:
                        dVar.d(i9);
                        int i12 = (int) j;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        dVar.f24146u.f24086r = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f24146u.f24086r = 2;
                                return;
                            }
                            dVar.f24146u.f24086r = 1;
                            return;
                        }
                        dVar.f24146u.f24086r = 0;
                        return;
                    case 2352003:
                        dVar.d(i9);
                        dVar.f24146u.f24074e = (int) j;
                        return;
                    case 2807729:
                        dVar.f24143r = j;
                        return;
                    default:
                        switch (i9) {
                            case 21945:
                                dVar.d(i9);
                                int i13 = (int) j;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        dVar.f24146u.f24047A = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f24146u.f24047A = 2;
                                return;
                            case 21946:
                                dVar.d(i9);
                                int i14 = (int) j;
                                if (i14 != 1) {
                                    if (i14 != 16) {
                                        if (i14 != 18) {
                                            if (i14 != 6 && i14 != 7) {
                                                i10 = -1;
                                            }
                                        } else {
                                            i10 = 7;
                                        }
                                    } else {
                                        i10 = 6;
                                    }
                                }
                                if (i10 != -1) {
                                    dVar.f24146u.f24094z = i10;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.d(i9);
                                dVar.f24146u.f24092x = true;
                                int a5 = C1591b.a((int) j);
                                if (a5 != -1) {
                                    dVar.f24146u.f24093y = a5;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.d(i9);
                                dVar.f24146u.f24048B = (int) j;
                                return;
                            case 21949:
                                dVar.d(i9);
                                dVar.f24146u.f24049C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            }
            if (j != 1) {
                throw j0.a("ContentEncodingScope " + j + " not supported", null);
            }
            return;
        }
        if (j == 0) {
            return;
        }
        throw j0.a("ContentEncodingOrder " + j + " not supported", null);
    }

    public void q(Exception exc) {
        AbstractC1566a.u("MediaCodecAudioRenderer", "Audio sink error", exc);
        C1564m c1564m = ((l3.H) this.f17990b).f20297d1;
        Handler handler = c1564m.f20413b;
        if (handler != null) {
            handler.post(new RunnableC1562k(c1564m, exc, 6));
        }
    }

    public D3.c r(C1902g c1902g, I3.g gVar) {
        A4.r rVar = (A4.r) this.f17990b;
        D3.c cVar = null;
        int i9 = 0;
        while (true) {
            try {
                c1902g.t((byte[]) rVar.f384c, 0, 10, false);
                rVar.H(0);
                if (rVar.z() != 4801587) {
                    break;
                }
                rVar.I(3);
                int w7 = rVar.w();
                int i10 = w7 + 10;
                if (cVar == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy((byte[]) rVar.f384c, 0, bArr, 0, 10);
                    c1902g.t(bArr, 10, w7, false);
                    cVar = new I3.i(gVar).a0(i10, bArr);
                } else {
                    c1902g.c(w7, false);
                }
                i9 += i10;
            } catch (EOFException unused) {
            }
        }
        c1902g.f22314f = 0;
        c1902g.c(i9, false);
        return cVar;
    }

    @Override // f5.InterfaceC1175g
    public C1185q s(Object obj) {
        if (((G6.c) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return s8.n.p(null);
        }
        C1499E c1499e = (C1499E) this.f17990b;
        y6.l.a((y6.l) c1499e.f19986c);
        y6.l lVar = (y6.l) c1499e.f19986c;
        lVar.f25073m.m(lVar.f25066e.f25505a, null);
        lVar.f25077q.d(null);
        return s8.n.p(null);
    }

    public /* synthetic */ G(y4.r rVar, String[] strArr) {
        this.f17989a = 22;
        this.f17990b = strArr;
    }

    public G(MediaInfo mediaInfo) {
        this.f17989a = 15;
        t4.n nVar = new t4.n(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f17990b = nVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public G(JSONObject jSONObject) {
        this.f17989a = 15;
        this.f17990b = new t4.n(jSONObject);
    }

    public G(ViewGroup viewGroup) {
        this.f17989a = 21;
        this.f17990b = viewGroup.getOverlay();
    }

    public G(int i9) {
        this.f17989a = i9;
        switch (i9) {
            case 8:
                this.f17990b = new LinkedHashSet();
                return;
            case 12:
                this.f17990b = new A4.r(10);
                return;
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                kotlin.jvm.internal.h.e(timeUnit, "timeUnit");
                this.f17990b = new W(m8.c.f20928h);
                return;
        }
    }

    @Override // m4.q
    public void h() {
    }
}
