package b5;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0904a2;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.C0906b;
import com.google.android.gms.internal.measurement.C0908b1;
import com.google.android.gms.internal.measurement.C0913c1;
import com.google.android.gms.internal.measurement.C0918d1;
import com.google.android.gms.internal.measurement.C0933g1;
import com.google.android.gms.internal.measurement.C0943i1;
import com.google.android.gms.internal.measurement.C0958l1;
import com.google.android.gms.internal.measurement.C0963m1;
import com.google.android.gms.internal.measurement.C0968n1;
import com.google.android.gms.internal.measurement.C0969n2;
import com.google.android.gms.internal.measurement.C0982q0;
import com.google.android.gms.internal.measurement.C0996t0;
import com.google.android.gms.internal.measurement.C1006v0;
import com.google.android.gms.internal.measurement.C1011w0;
import com.google.android.gms.internal.measurement.C1023y2;
import com.google.android.gms.internal.measurement.InterfaceC0934g2;
import com.google.android.gms.internal.measurement.InterfaceC0939h2;
import com.google.android.gms.internal.measurement.K3;
import com.google.android.gms.internal.measurement.V1;
import com.google.android.gms.internal.measurement.Y1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class Z extends D1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(J1 j12, int i9) {
        super(j12);
        this.f11003d = i9;
    }

    public static final String A0(boolean z9, boolean z10, boolean z11) {
        StringBuilder sb = new StringBuilder();
        if (z9) {
            sb.append("Dynamic ");
        }
        if (z10) {
            sb.append("Sequence ");
        }
        if (z11) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void B0(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                z0(builder, str3, string, set);
            }
        }
    }

    public static final void C0(StringBuilder sb, String str, C0933g1 c0933g1) {
        Integer num;
        Integer num2;
        Long l9;
        if (c0933g1 == null) {
            return;
        }
        y0(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c0933g1.o() != 0) {
            y0(4, sb);
            sb.append("results: ");
            int i9 = 0;
            for (Long l10 : c0933g1.u()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(l10);
                i9 = i10;
            }
            sb.append('\n');
        }
        if (c0933g1.q() != 0) {
            y0(4, sb);
            sb.append("status: ");
            int i11 = 0;
            for (Long l11 : c0933g1.w()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb.append(", ");
                }
                sb.append(l11);
                i11 = i12;
            }
            sb.append('\n');
        }
        if (c0933g1.n() != 0) {
            y0(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (com.google.android.gms.internal.measurement.T0 t02 : c0933g1.t()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb.append(", ");
                }
                if (t02.t()) {
                    num2 = Integer.valueOf(t02.n());
                } else {
                    num2 = null;
                }
                sb.append(num2);
                sb.append(":");
                if (t02.s()) {
                    l9 = Long.valueOf(t02.o());
                } else {
                    l9 = null;
                }
                sb.append(l9);
                i13 = i14;
            }
            sb.append("}\n");
        }
        if (c0933g1.p() != 0) {
            y0(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (C0943i1 c0943i1 : c0933g1.v()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb.append(", ");
                }
                if (c0943i1.u()) {
                    num = Integer.valueOf(c0943i1.o());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(": [");
                Iterator it = c0943i1.r().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i17 = i18;
                }
                sb.append("]");
                i15 = i16;
            }
            sb.append("}\n");
        }
        y0(3, sb);
        sb.append("}\n");
    }

    public static final void D0(StringBuilder sb, int i9, String str, Object obj) {
        if (obj == null) {
            return;
        }
        y0(i9 + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void E0(StringBuilder sb, int i9, String str, C0996t0 c0996t0) {
        String str2;
        if (c0996t0 == null) {
            return;
        }
        y0(i9, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c0996t0.s()) {
            int x5 = c0996t0.x();
            if (x5 != 1) {
                if (x5 != 2) {
                    if (x5 != 3) {
                        if (x5 != 4) {
                            str2 = "BETWEEN";
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            D0(sb, i9, "comparison_type", str2);
        }
        if (c0996t0.u()) {
            D0(sb, i9, "match_as_float", Boolean.valueOf(c0996t0.r()));
        }
        if (c0996t0.t()) {
            D0(sb, i9, "comparison_value", c0996t0.o());
        }
        if (c0996t0.w()) {
            D0(sb, i9, "min_comparison_value", c0996t0.q());
        }
        if (c0996t0.v()) {
            D0(sb, i9, "max_comparison_value", c0996t0.p());
        }
        y0(i9, sb);
        sb.append("}\n");
    }

    public static int F0(C0913c1 c0913c1, String str) {
        for (int i9 = 0; i9 < ((C0918d1) c0913c1.f15439b).U1(); i9++) {
            if (str.equals(((C0918d1) c0913c1.f15439b).p(i9).s())) {
                return i9;
            }
        }
        return -1;
    }

    public static Bundle M0(Map map, boolean z9) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z9) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        arrayList2.add(M0((Map) arrayList.get(i9), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    public static C0665t O0(C0906b c0906b) {
        String str;
        Object obj;
        Bundle M02 = M0(c0906b.f15445c, true);
        if (M02.containsKey("_o") && (obj = M02.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String d9 = D0.d(c0906b.f15443a, D0.f10574a, D0.f10576c);
        if (d9 == null) {
            d9 = c0906b.f15443a;
        }
        return new C0665t(d9, new C0663s(M02), str2, c0906b.f15444b);
    }

    public static AbstractC0904a2 R0(AbstractC0904a2 abstractC0904a2, byte[] bArr) {
        V1 v12;
        V1 v13 = V1.f15319a;
        if (v13 == null) {
            synchronized (V1.class) {
                try {
                    v12 = V1.f15319a;
                    if (v12 == null) {
                        C1023y2 c1023y2 = C1023y2.f15696c;
                        v12 = Y1.J();
                        V1.f15319a = v12;
                    }
                } finally {
                }
            }
            v13 = v12;
        }
        if (v13 != null) {
            abstractC0904a2.getClass();
            abstractC0904a2.f(bArr, bArr.length, v13);
            return abstractC0904a2;
        }
        abstractC0904a2.getClass();
        int length = bArr.length;
        V1 v14 = V1.f15319a;
        C1023y2 c1023y22 = C1023y2.f15696c;
        abstractC0904a2.f(bArr, length, V1.f15320b);
        return abstractC0904a2;
    }

    public static ArrayList V0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i9 = 0; i9 < length; i9++) {
            long j = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i9 * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(W0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(W0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(W0((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap W0(android.os.Bundle r10, boolean r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r11 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = W0(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = W0(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.HashMap r3 = W0(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.Z.W0(android.os.Bundle, boolean):java.util.HashMap");
    }

    public static boolean Z0(InterfaceC0934g2 interfaceC0934g2, int i9) {
        if (i9 < ((C0969n2) interfaceC0934g2).f15554c * 64) {
            if (((1 << (i9 % 64)) & ((Long) ((C0969n2) interfaceC0934g2).get(i9 / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean p0(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    public static Bundle[] r0(InterfaceC0939h2 interfaceC0939h2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC0939h2.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.Y0 y02 = (com.google.android.gms.internal.measurement.Y0) it.next();
            if (y02 != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.Y0 y03 : y02.u()) {
                    if (y03.J()) {
                        bundle.putString(y03.s(), y03.t());
                    } else if (y03.H()) {
                        bundle.putLong(y03.s(), y03.q());
                    } else if (y03.F()) {
                        bundle.putDouble(y03.s(), y03.n());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void s0(com.google.android.gms.internal.measurement.U0 u02, String str, Long l9) {
        List q9 = u02.q();
        int i9 = 0;
        while (true) {
            if (i9 < q9.size()) {
                if (str.equals(((com.google.android.gms.internal.measurement.Y0) q9.get(i9)).s())) {
                    break;
                } else {
                    i9++;
                }
            } else {
                i9 = -1;
                break;
            }
        }
        com.google.android.gms.internal.measurement.X0 r5 = com.google.android.gms.internal.measurement.Y0.r();
        r5.l(str);
        r5.k(l9.longValue());
        if (i9 >= 0) {
            u02.j();
            com.google.android.gms.internal.measurement.V0.A((com.google.android.gms.internal.measurement.V0) u02.f15439b, i9, (com.google.android.gms.internal.measurement.Y0) r5.h());
        } else {
            u02.m(r5);
        }
    }

    public static final Bundle t0(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.Y0 y02 = (com.google.android.gms.internal.measurement.Y0) it.next();
            String s9 = y02.s();
            if (y02.F()) {
                bundle.putDouble(s9, y02.n());
            } else if (y02.G()) {
                bundle.putFloat(s9, y02.o());
            } else if (y02.J()) {
                bundle.putString(s9, y02.t());
            } else if (y02.H()) {
                bundle.putLong(s9, y02.q());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.Y0 u0(com.google.android.gms.internal.measurement.V0 v02, String str) {
        for (com.google.android.gms.internal.measurement.Y0 y02 : v02.u()) {
            if (y02.s().equals(str)) {
                return y02;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable v0(com.google.android.gms.internal.measurement.V0 v02, String str) {
        com.google.android.gms.internal.measurement.Y0 u02 = u0(v02, str);
        if (u02 != null) {
            if (u02.J()) {
                return u02.t();
            }
            if (u02.H()) {
                return Long.valueOf(u02.q());
            }
            if (u02.F()) {
                return Double.valueOf(u02.n());
            }
            if (u02.p() > 0) {
                return r0((InterfaceC0939h2) u02.u());
            }
            return null;
        }
        return null;
    }

    public static final void y0(int i9, StringBuilder sb) {
        for (int i10 = 0; i10 < i9; i10++) {
            sb.append("  ");
        }
    }

    public static final void z0(Uri.Builder builder, String str, String str2, Set set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    public void J0(String str, E1 e12, C0908b1 c0908b1, X x5) {
        String str2;
        URL url;
        byte[] c3;
        C0647m0 c0647m0;
        Map map;
        String str3 = e12.f10702a;
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        l0();
        m0();
        try {
            url = new URI(str3).toURL();
            this.f11361b.a();
            c3 = c0908b1.c();
            c0647m0 = c0650n0.j;
            C0650n0.f(c0647m0);
            map = e12.f10703b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            c0647m0.u0(new Y(this, str2, url, c3, map, x5));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10971f.d(V.t0(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
        }
    }

    public boolean K0() {
        m0();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C0650n0) this.f1707a).f11221a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public long L0(byte[] bArr) {
        F4.y.h(bArr);
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        P1 p12 = c0650n0.f11231l;
        C0650n0.d(p12);
        p12.l0();
        MessageDigest w02 = P1.w0();
        if (w02 == null) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10971f.b("Failed to get MD5");
            return 0L;
        }
        return P1.v1(w02.digest(bArr));
    }

    public Parcelable N0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (G4.b unused) {
                V v8 = ((C0650n0) this.f1707a).f11229i;
                C0650n0.f(v8);
                v8.f10971f.b("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public x1 P0(String str, C0913c1 c0913c1, com.google.android.gms.internal.measurement.U0 u02, String str2) {
        int indexOf;
        K3.b();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (c0650n0.f11227g.y0(str, E.f10629W0)) {
            c0650n0.f11233n.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            D d9 = E.f10691u0;
            C0628g c0628g = c0650n0.f11227g;
            String[] split = c0628g.x0(str, d9).split(",");
            HashSet hashSet = new HashSet(split.length);
            for (String str3 : split) {
                Objects.requireNonNull(str3);
                if (!hashSet.add(str3)) {
                    throw new IllegalArgumentException("duplicate element: ".concat(str3));
                }
            }
            Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
            J1 j12 = this.f11361b;
            F1 f12 = j12.j;
            C0635i0 c0635i0 = f12.f11361b.f10742a;
            J1.J(c0635i0);
            String B02 = c0635i0.B0(str);
            Uri.Builder builder = new Uri.Builder();
            C0650n0 c0650n02 = (C0650n0) f12.f1707a;
            builder.scheme(c0650n02.f11227g.x0(str, E.f10674n0));
            boolean isEmpty = TextUtils.isEmpty(B02);
            C0628g c0628g2 = c0650n02.f11227g;
            if (!isEmpty) {
                builder.authority(B02 + "." + c0628g2.x0(str, E.f10677o0));
            } else {
                builder.authority(c0628g2.x0(str, E.f10677o0));
            }
            builder.path(c0628g2.x0(str, E.f10680p0));
            z0(builder, "gmp_app_id", ((C0918d1) c0913c1.f15439b).B(), unmodifiableSet);
            c0628g.s0();
            z0(builder, "gmp_version", String.valueOf(119002L), unmodifiableSet);
            String s9 = ((C0918d1) c0913c1.f15439b).s();
            D d10 = E.f10634Z0;
            boolean y02 = c0628g.y0(str, d10);
            C0635i0 c0635i02 = j12.f10742a;
            if (y02) {
                J1.J(c0635i02);
                if (c0635i02.p0(str)) {
                    s9 = "";
                }
            }
            z0(builder, "app_instance_id", s9, unmodifiableSet);
            z0(builder, "rdid", ((C0918d1) c0913c1.f15439b).F(), unmodifiableSet);
            z0(builder, "bundle_id", c0913c1.B(), unmodifiableSet);
            String p9 = u02.p();
            String d11 = D0.d(p9, D0.f10576c, D0.f10574a);
            if (true != TextUtils.isEmpty(d11)) {
                p9 = d11;
            }
            z0(builder, "app_event_name", p9, unmodifiableSet);
            z0(builder, "app_version", String.valueOf(((C0918d1) c0913c1.f15439b).M0()), unmodifiableSet);
            String D8 = ((C0918d1) c0913c1.f15439b).D();
            if (c0628g.y0(str, d10)) {
                J1.J(c0635i02);
                if (c0635i02.q0(str) && !TextUtils.isEmpty(D8) && (indexOf = D8.indexOf(".")) != -1) {
                    D8 = D8.substring(0, indexOf);
                }
            }
            z0(builder, "os_version", D8, unmodifiableSet);
            z0(builder, "timestamp", String.valueOf(u02.l()), unmodifiableSet);
            String str4 = "1";
            if (((C0918d1) c0913c1.f15439b).H1()) {
                z0(builder, "lat", "1", unmodifiableSet);
            }
            z0(builder, "privacy_sandbox_version", String.valueOf(((C0918d1) c0913c1.f15439b).M()), unmodifiableSet);
            z0(builder, "trigger_uri_source", "1", unmodifiableSet);
            z0(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), unmodifiableSet);
            z0(builder, "request_uuid", str2, unmodifiableSet);
            List<com.google.android.gms.internal.measurement.Y0> q9 = u02.q();
            Bundle bundle = new Bundle();
            for (com.google.android.gms.internal.measurement.Y0 y03 : q9) {
                String s10 = y03.s();
                if (y03.F()) {
                    bundle.putString(s10, String.valueOf(y03.n()));
                } else if (y03.G()) {
                    bundle.putString(s10, String.valueOf(y03.o()));
                } else if (y03.J()) {
                    bundle.putString(s10, y03.t());
                } else if (y03.H()) {
                    bundle.putString(s10, String.valueOf(y03.q()));
                }
            }
            B0(builder, c0628g.x0(str, E.f10689t0).split("\\|"), bundle, unmodifiableSet);
            List<C0968n1> unmodifiableList = Collections.unmodifiableList(((C0918d1) c0913c1.f15439b).K());
            Bundle bundle2 = new Bundle();
            for (C0968n1 c0968n1 : unmodifiableList) {
                String s11 = c0968n1.s();
                if (c0968n1.C()) {
                    bundle2.putString(s11, String.valueOf(c0968n1.n()));
                } else if (c0968n1.D()) {
                    bundle2.putString(s11, String.valueOf(c0968n1.o()));
                } else if (c0968n1.G()) {
                    bundle2.putString(s11, c0968n1.t());
                } else if (c0968n1.E()) {
                    bundle2.putString(s11, String.valueOf(c0968n1.p()));
                }
            }
            B0(builder, c0628g.x0(str, E.f10687s0).split("\\|"), bundle2, unmodifiableSet);
            if (true != ((C0918d1) c0913c1.f15439b).G1()) {
                str4 = "0";
            }
            z0(builder, "dma", str4, unmodifiableSet);
            if (!((C0918d1) c0913c1.f15439b).x().isEmpty()) {
                z0(builder, "dma_cps", ((C0918d1) c0913c1.f15439b).x(), unmodifiableSet);
            }
            if (((C0918d1) c0913c1.f15439b).J1()) {
                com.google.android.gms.internal.measurement.M0 h22 = ((C0918d1) c0913c1.f15439b).h2();
                if (!h22.B().isEmpty()) {
                    z0(builder, "dl_gclid", h22.B(), unmodifiableSet);
                }
                if (!h22.A().isEmpty()) {
                    z0(builder, "dl_gbraid", h22.A(), unmodifiableSet);
                }
                if (!h22.z().isEmpty()) {
                    z0(builder, "dl_gs", h22.z(), unmodifiableSet);
                }
                if (h22.v() > 0) {
                    z0(builder, "dl_ss_ts", String.valueOf(h22.v()), unmodifiableSet);
                }
                if (!h22.E().isEmpty()) {
                    z0(builder, "mr_gclid", h22.E(), unmodifiableSet);
                }
                if (!h22.D().isEmpty()) {
                    z0(builder, "mr_gbraid", h22.D(), unmodifiableSet);
                }
                if (!h22.C().isEmpty()) {
                    z0(builder, "mr_gs", h22.C(), unmodifiableSet);
                }
                if (h22.w() > 0) {
                    z0(builder, "mr_click_ts", String.valueOf(h22.w()), unmodifiableSet);
                }
            }
            return new x1(currentTimeMillis, builder.build().toString(), 1);
        }
        return null;
    }

    public com.google.android.gms.internal.measurement.V0 Q0(Q3.j jVar) {
        Bundle bundle;
        com.google.android.gms.internal.measurement.U0 r5 = com.google.android.gms.internal.measurement.V0.r();
        r5.j();
        com.google.android.gms.internal.measurement.V0.B(jVar.f6393c, (com.google.android.gms.internal.measurement.V0) r5.f15439b);
        C0663s c0663s = (C0663s) jVar.f6397g;
        Iterator<String> it = c0663s.f11300a.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            bundle = c0663s.f11300a;
            if (!hasNext) {
                break;
            }
            String next = it.next();
            com.google.android.gms.internal.measurement.X0 r7 = com.google.android.gms.internal.measurement.Y0.r();
            r7.l(next);
            Object obj = bundle.get(next);
            F4.y.h(obj);
            X0(r7, obj);
            r5.m(r7);
        }
        String str = (String) jVar.f6396f;
        if (!TextUtils.isEmpty(str) && bundle.get("_o") == null) {
            com.google.android.gms.internal.measurement.X0 r9 = com.google.android.gms.internal.measurement.Y0.r();
            r9.l("_o");
            r9.m(str);
            r5.n((com.google.android.gms.internal.measurement.Y0) r9.h());
        }
        return (com.google.android.gms.internal.measurement.V0) r5.h();
    }

    public String S0(C0908b1 c0908b1) {
        Long l9;
        Long l10;
        String str;
        String str2;
        com.google.android.gms.internal.measurement.P0 i22;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (c0908b1.B()) {
            D0(sb, 0, "upload_subdomain", c0908b1.s());
        }
        if (c0908b1.A()) {
            D0(sb, 0, "sgtm_join_id", c0908b1.r());
        }
        for (C0918d1 c0918d1 : c0908b1.t()) {
            if (c0918d1 != null) {
                y0(1, sb);
                sb.append("bundle {\n");
                if (c0918d1.d1()) {
                    D0(sb, 1, "protocol_version", Integer.valueOf(c0918d1.R1()));
                }
                C0650n0 c0650n0 = (C0650n0) this.f1707a;
                if (c0650n0.f11227g.y0(c0918d1.r(), E.f10609M0) && c0918d1.g1()) {
                    D0(sb, 1, "session_stitching_token", c0918d1.G());
                }
                D0(sb, 1, "platform", c0918d1.E());
                if (c0918d1.Y0()) {
                    D0(sb, 1, "gmp_version", Long.valueOf(c0918d1.a2()));
                }
                if (c0918d1.m1()) {
                    D0(sb, 1, "uploading_gmp_version", Long.valueOf(c0918d1.g2()));
                }
                if (c0918d1.W0()) {
                    D0(sb, 1, "dynamite_version", Long.valueOf(c0918d1.Y1()));
                }
                if (c0918d1.P0()) {
                    D0(sb, 1, "config_version", Long.valueOf(c0918d1.W1()));
                }
                D0(sb, 1, "gmp_app_id", c0918d1.B());
                D0(sb, 1, "admob_app_id", c0918d1.q());
                D0(sb, 1, "app_id", c0918d1.r());
                D0(sb, 1, "app_version", c0918d1.u());
                if (c0918d1.K1()) {
                    D0(sb, 1, "app_version_major", Integer.valueOf(c0918d1.M0()));
                }
                D0(sb, 1, "firebase_instance_id", c0918d1.A());
                if (c0918d1.U0()) {
                    D0(sb, 1, "dev_cert_hash", Long.valueOf(c0918d1.X1()));
                }
                D0(sb, 1, "app_store", c0918d1.t());
                if (c0918d1.l1()) {
                    D0(sb, 1, "upload_timestamp_millis", Long.valueOf(c0918d1.f2()));
                }
                if (c0918d1.i1()) {
                    D0(sb, 1, "start_timestamp_millis", Long.valueOf(c0918d1.d2()));
                }
                if (c0918d1.X0()) {
                    D0(sb, 1, "end_timestamp_millis", Long.valueOf(c0918d1.Z1()));
                }
                if (c0918d1.c1()) {
                    D0(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c0918d1.c2()));
                }
                if (c0918d1.b1()) {
                    D0(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c0918d1.b2()));
                }
                D0(sb, 1, "app_instance_id", c0918d1.s());
                D0(sb, 1, "resettable_device_id", c0918d1.F());
                D0(sb, 1, "ds_id", c0918d1.z());
                if (c0918d1.a1()) {
                    D0(sb, 1, "limited_ad_tracking", Boolean.valueOf(c0918d1.H1()));
                }
                D0(sb, 1, "os_version", c0918d1.D());
                D0(sb, 1, "device_model", c0918d1.y());
                D0(sb, 1, "user_default_language", c0918d1.H());
                if (c0918d1.k1()) {
                    D0(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c0918d1.T1()));
                }
                if (c0918d1.O0()) {
                    D0(sb, 1, "bundle_sequential_index", Integer.valueOf(c0918d1.M1()));
                }
                if (c0918d1.T0()) {
                    D0(sb, 1, "delivery_index", Integer.valueOf(c0918d1.P1()));
                }
                if (c0918d1.f1()) {
                    D0(sb, 1, "service_upload", Boolean.valueOf(c0918d1.I1()));
                }
                D0(sb, 1, "health_monitor", c0918d1.C());
                if (c0918d1.e1()) {
                    D0(sb, 1, "retry_counter", Integer.valueOf(c0918d1.S1()));
                }
                if (c0918d1.R0()) {
                    D0(sb, 1, "consent_signals", c0918d1.w());
                }
                if (c0918d1.Z0()) {
                    D0(sb, 1, "is_dma_region", Boolean.valueOf(c0918d1.G1()));
                }
                if (c0918d1.S0()) {
                    D0(sb, 1, "core_platform_services", c0918d1.x());
                }
                if (c0918d1.Q0()) {
                    D0(sb, 1, "consent_diagnostics", c0918d1.v());
                }
                if (c0918d1.j1()) {
                    D0(sb, 1, "target_os_version", Long.valueOf(c0918d1.e2()));
                }
                K3.b();
                if (c0650n0.f11227g.y0(c0918d1.r(), E.f10629W0)) {
                    D0(sb, 1, "ad_services_version", Integer.valueOf(c0918d1.M()));
                    if (c0918d1.L1() && (i22 = c0918d1.i2()) != null) {
                        y0(2, sb);
                        sb.append("attribution_eligibility_status {\n");
                        D0(sb, 2, "eligible", Boolean.valueOf(i22.y()));
                        D0(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(i22.A()));
                        D0(sb, 2, "pre_r", Boolean.valueOf(i22.B()));
                        D0(sb, 2, "r_extensions_too_old", Boolean.valueOf(i22.C()));
                        D0(sb, 2, "adservices_extension_too_old", Boolean.valueOf(i22.x()));
                        D0(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(i22.w()));
                        D0(sb, 2, "measurement_manager_disabled", Boolean.valueOf(i22.z()));
                        y0(2, sb);
                        sb.append("}\n");
                    }
                }
                if (c0918d1.J1()) {
                    com.google.android.gms.internal.measurement.M0 h22 = c0918d1.h2();
                    y0(2, sb);
                    sb.append("ad_campaign_info {\n");
                    if (h22.p()) {
                        D0(sb, 2, "deep_link_gclid", h22.B());
                    }
                    if (h22.o()) {
                        D0(sb, 2, "deep_link_gbraid", h22.A());
                    }
                    if (h22.n()) {
                        D0(sb, 2, "deep_link_gad_source", h22.z());
                    }
                    if (h22.q()) {
                        D0(sb, 2, "deep_link_session_millis", Long.valueOf(h22.v()));
                    }
                    if (h22.u()) {
                        D0(sb, 2, "market_referrer_gclid", h22.E());
                    }
                    if (h22.t()) {
                        D0(sb, 2, "market_referrer_gbraid", h22.D());
                    }
                    if (h22.s()) {
                        D0(sb, 2, "market_referrer_gad_source", h22.C());
                    }
                    if (h22.r()) {
                        D0(sb, 2, "market_referrer_click_millis", Long.valueOf(h22.w()));
                    }
                    y0(2, sb);
                    sb.append("}\n");
                }
                if (c0918d1.N0()) {
                    D0(sb, 1, "batching_timestamp_millis", Long.valueOf(c0918d1.V1()));
                }
                if (c0918d1.h1()) {
                    C0958l1 o9 = c0918d1.o();
                    y0(2, sb);
                    sb.append("sgtm_diagnostics {\n");
                    int s9 = o9.s();
                    if (s9 != 1) {
                        if (s9 != 2) {
                            if (s9 != 3) {
                                if (s9 != 4) {
                                    str = "SDK_SERVICE_UPLOAD";
                                } else {
                                    str = "PACKAGE_SERVICE_UPLOAD";
                                }
                            } else {
                                str = "SDK_CLIENT_UPLOAD";
                            }
                        } else {
                            str = "GA_UPLOAD";
                        }
                    } else {
                        str = "UPLOAD_TYPE_UNKNOWN";
                    }
                    D0(sb, 2, "upload_type", str);
                    D0(sb, 2, "client_upload_eligibility", AbstractC0953k1.y(o9.o()));
                    int r5 = o9.r();
                    if (r5 != 1) {
                        if (r5 != 2) {
                            if (r5 != 3) {
                                if (r5 != 4) {
                                    if (r5 != 5) {
                                        str2 = "NON_PLAY_MISSING_SGTM_SERVER_URL";
                                    } else {
                                        str2 = "MISSING_SGTM_PROXY_INFO";
                                    }
                                } else {
                                    str2 = "MISSING_SGTM_SETTINGS";
                                }
                            } else {
                                str2 = "NOT_IN_ROLLOUT";
                            }
                        } else {
                            str2 = "SERVICE_UPLOAD_ELIGIBLE";
                        }
                    } else {
                        str2 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    }
                    D0(sb, 2, "service_upload_eligibility", str2);
                    y0(2, sb);
                    sb.append("}\n");
                }
                InterfaceC0939h2<C0968n1> K = c0918d1.K();
                O o10 = c0650n0.f11232m;
                if (K != null) {
                    for (C0968n1 c0968n1 : K) {
                        if (c0968n1 != null) {
                            y0(2, sb);
                            sb.append("user_property {\n");
                            Double d9 = null;
                            if (c0968n1.F()) {
                                l9 = Long.valueOf(c0968n1.q());
                            } else {
                                l9 = null;
                            }
                            D0(sb, 2, "set_timestamp_millis", l9);
                            D0(sb, 2, "name", o10.f(c0968n1.s()));
                            D0(sb, 2, "string_value", c0968n1.t());
                            if (c0968n1.E()) {
                                l10 = Long.valueOf(c0968n1.p());
                            } else {
                                l10 = null;
                            }
                            D0(sb, 2, "int_value", l10);
                            if (c0968n1.C()) {
                                d9 = Double.valueOf(c0968n1.n());
                            }
                            D0(sb, 2, "double_value", d9);
                            y0(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                InterfaceC0939h2<com.google.android.gms.internal.measurement.R0> I4 = c0918d1.I();
                if (I4 != null) {
                    for (com.google.android.gms.internal.measurement.R0 r0 : I4) {
                        if (r0 != null) {
                            y0(2, sb);
                            sb.append("audience_membership {\n");
                            if (r0.w()) {
                                D0(sb, 2, "audience_id", Integer.valueOf(r0.n()));
                            }
                            if (r0.x()) {
                                D0(sb, 2, "new_audience", Boolean.valueOf(r0.v()));
                            }
                            C0(sb, "current_data", r0.p());
                            if (r0.y()) {
                                C0(sb, "previous_data", r0.q());
                            }
                            y0(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                InterfaceC0939h2<com.google.android.gms.internal.measurement.V0> J8 = c0918d1.J();
                if (J8 != null) {
                    for (com.google.android.gms.internal.measurement.V0 v02 : J8) {
                        if (v02 != null) {
                            y0(2, sb);
                            sb.append("event {\n");
                            D0(sb, 2, "name", o10.d(v02.t()));
                            if (v02.F()) {
                                D0(sb, 2, "timestamp_millis", Long.valueOf(v02.q()));
                            }
                            if (v02.E()) {
                                D0(sb, 2, "previous_timestamp_millis", Long.valueOf(v02.p()));
                            }
                            if (v02.D()) {
                                D0(sb, 2, "count", Integer.valueOf(v02.n()));
                            }
                            if (v02.o() != 0) {
                                w0(sb, 2, (InterfaceC0939h2) v02.u());
                            }
                            y0(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                y0(1, sb);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    public String T0(C1006v0 c1006v0) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (c1006v0.v()) {
            D0(sb, 0, "filter_id", Integer.valueOf(c1006v0.n()));
        }
        D0(sb, 0, "property_name", ((C0650n0) this.f1707a).f11232m.f(c1006v0.q()));
        String A02 = A0(c1006v0.s(), c1006v0.t(), c1006v0.u());
        if (!A02.isEmpty()) {
            D0(sb, 0, "filter_type", A02);
        }
        x0(sb, 1, c1006v0.o());
        sb.append("}\n");
        return sb.toString();
    }

    public List U0(InterfaceC0934g2 interfaceC0934g2, List list) {
        int i9;
        ArrayList arrayList = new ArrayList(interfaceC0934g2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            C0650n0 c0650n0 = (C0650n0) this.f1707a;
            if (intValue < 0) {
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10974i.c(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue2 = num.intValue() / 64;
                if (intValue2 >= arrayList.size()) {
                    V v9 = c0650n0.f11229i;
                    C0650n0.f(v9);
                    v9.f10974i.d(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue2, Long.valueOf(((Long) arrayList.get(intValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i9 = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i9);
    }

    public void X0(com.google.android.gms.internal.measurement.X0 x02, Object obj) {
        x02.j();
        com.google.android.gms.internal.measurement.Y0.A((com.google.android.gms.internal.measurement.Y0) x02.f15439b);
        x02.j();
        com.google.android.gms.internal.measurement.Y0.y((com.google.android.gms.internal.measurement.Y0) x02.f15439b);
        x02.j();
        com.google.android.gms.internal.measurement.Y0.x((com.google.android.gms.internal.measurement.Y0) x02.f15439b);
        x02.j();
        com.google.android.gms.internal.measurement.Y0.z((com.google.android.gms.internal.measurement.Y0) x02.f15439b);
        if (obj instanceof String) {
            x02.m((String) obj);
            return;
        }
        if (obj instanceof Long) {
            x02.k(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            x02.j();
            com.google.android.gms.internal.measurement.Y0.B((com.google.android.gms.internal.measurement.Y0) x02.f15439b, doubleValue);
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.X0 r5 = com.google.android.gms.internal.measurement.Y0.r();
                    for (String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.X0 r7 = com.google.android.gms.internal.measurement.Y0.r();
                        r7.l(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            r7.k(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            r7.m((String) obj2);
                        } else if (obj2 instanceof Double) {
                            double doubleValue2 = ((Double) obj2).doubleValue();
                            r7.j();
                            com.google.android.gms.internal.measurement.Y0.B((com.google.android.gms.internal.measurement.Y0) r7.f15439b, doubleValue2);
                        }
                        r5.j();
                        com.google.android.gms.internal.measurement.Y0.w((com.google.android.gms.internal.measurement.Y0) r5.f15439b, (com.google.android.gms.internal.measurement.Y0) r7.h());
                    }
                    if (((com.google.android.gms.internal.measurement.Y0) r5.f15439b).p() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.Y0) r5.h());
                    }
                }
            }
            x02.j();
            com.google.android.gms.internal.measurement.Y0.v((com.google.android.gms.internal.measurement.Y0) x02.f15439b, arrayList);
            return;
        }
        V v8 = ((C0650n0) this.f1707a).f11229i;
        C0650n0.f(v8);
        v8.f10971f.c(obj, "Ignoring invalid (type) event param value");
    }

    public void Y0(C0963m1 c0963m1, Object obj) {
        F4.y.h(obj);
        c0963m1.j();
        C0968n1.w((C0968n1) c0963m1.f15439b);
        c0963m1.j();
        C0968n1.v((C0968n1) c0963m1.f15439b);
        c0963m1.j();
        C0968n1.u((C0968n1) c0963m1.f15439b);
        if (obj instanceof String) {
            c0963m1.j();
            C0968n1.B((C0968n1) c0963m1.f15439b, (String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            c0963m1.j();
            C0968n1.y((C0968n1) c0963m1.f15439b, longValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            c0963m1.j();
            C0968n1.x((C0968n1) c0963m1.f15439b, doubleValue);
        } else {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10971f.c(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public boolean a1(long j, long j4) {
        if (j != 0 && j4 > 0) {
            ((C0650n0) this.f1707a).f11233n.getClass();
            if (Math.abs(System.currentTimeMillis() - j) <= j4) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // b5.D1
    public final void o0() {
        int i9 = this.f11003d;
    }

    public byte[] q0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10971f.c(e8, "Failed to gzip content");
            throw e8;
        }
    }

    public void w0(StringBuilder sb, int i9, InterfaceC0939h2 interfaceC0939h2) {
        String str;
        String str2;
        Long l9;
        if (interfaceC0939h2 != null) {
            int i10 = i9 + 1;
            Iterator it = interfaceC0939h2.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.Y0 y02 = (com.google.android.gms.internal.measurement.Y0) it.next();
                if (y02 != null) {
                    y0(i10, sb);
                    sb.append("param {\n");
                    Double d9 = null;
                    if (y02.I()) {
                        str = ((C0650n0) this.f1707a).f11232m.e(y02.s());
                    } else {
                        str = null;
                    }
                    D0(sb, i10, "name", str);
                    if (y02.J()) {
                        str2 = y02.t();
                    } else {
                        str2 = null;
                    }
                    D0(sb, i10, "string_value", str2);
                    if (y02.H()) {
                        l9 = Long.valueOf(y02.q());
                    } else {
                        l9 = null;
                    }
                    D0(sb, i10, "int_value", l9);
                    if (y02.F()) {
                        d9 = Double.valueOf(y02.n());
                    }
                    D0(sb, i10, "double_value", d9);
                    if (y02.p() > 0) {
                        w0(sb, i10, (InterfaceC0939h2) y02.u());
                    }
                    y0(i10, sb);
                    sb.append("}\n");
                }
            }
        }
    }

    public void x0(StringBuilder sb, int i9, C0982q0 c0982q0) {
        String str;
        if (c0982q0 == null) {
            return;
        }
        y0(i9, sb);
        sb.append("filter {\n");
        if (c0982q0.t()) {
            D0(sb, i9, "complement", Boolean.valueOf(c0982q0.s()));
        }
        if (c0982q0.v()) {
            D0(sb, i9, "param_name", ((C0650n0) this.f1707a).f11232m.e(c0982q0.q()));
        }
        if (c0982q0.w()) {
            int i10 = i9 + 1;
            C1011w0 p9 = c0982q0.p();
            if (p9 != null) {
                y0(i10, sb);
                sb.append("string_filter {\n");
                if (p9.u()) {
                    switch (p9.v()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    D0(sb, i10, "match_type", str);
                }
                if (p9.t()) {
                    D0(sb, i10, "expression", p9.p());
                }
                if (p9.s()) {
                    D0(sb, i10, "case_sensitive", Boolean.valueOf(p9.r()));
                }
                if (p9.n() > 0) {
                    y0(i9 + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : p9.q()) {
                        y0(i9 + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                y0(i10, sb);
                sb.append("}\n");
            }
        }
        if (c0982q0.u()) {
            E0(sb, i9 + 1, "number_filter", c0982q0.o());
        }
        y0(i9, sb);
        sb.append("}\n");
    }

    private final void G0() {
    }

    private final void H0() {
    }

    private final void I0() {
    }
}
