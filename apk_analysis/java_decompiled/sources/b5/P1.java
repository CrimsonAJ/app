package b5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import z0.C2232a;
import z0.C2233b;

/* loaded from: classes.dex */
public final class P1 extends AbstractC0674x0 {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f10839i = {"firebase_", "google_", "ga_"};
    public static final String[] j = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    public SecureRandom f10840c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f10841d;

    /* renamed from: e, reason: collision with root package name */
    public int f10842e;

    /* renamed from: f, reason: collision with root package name */
    public B0.d f10843f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f10844g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f10845h;

    public P1(C0650n0 c0650n0) {
        super(c0650n0);
        this.f10845h = null;
        this.f10841d = new AtomicLong(0L);
    }

    public static void B0(C0612a1 c0612a1, Bundle bundle, boolean z9) {
        if (bundle != null && c0612a1 != null) {
            if (bundle.containsKey("_sc") && !z9) {
                z9 = false;
            } else {
                String str = c0612a1.f11019a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c0612a1.f11020b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c0612a1.f11021c);
                return;
            }
        }
        if (bundle != null && c0612a1 == null && z9) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void F0(O1 o12, String str, int i9, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        n1(i9, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i9 == 6 || i9 == 7 || i9 == 2) {
            bundle.putLong("_el", i10);
        }
        o12.E(str, "_err", bundle);
    }

    public static boolean R0(String str, String[] strArr) {
        F4.y.h(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean T0(String str) {
        String str2 = (String) E.r0.a(null);
        if (!str2.equals("*") && !Arrays.asList(str2.split(",")).contains(str)) {
            return false;
        }
        return true;
    }

    public static boolean c1(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    public static boolean f1(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    public static boolean g1(String str) {
        F4.y.e(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    public static boolean h1(Context context) {
        ActivityInfo receiverInfo;
        F4.y.h(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean i1(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean j1(Context context) {
        F4.y.h(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return i1(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return i1(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static byte[] m1(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static final boolean n1(int i9, Bundle bundle) {
        if (bundle != null && bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i9);
            return true;
        }
        return false;
    }

    public static String v0(String str, boolean z9, int i9) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) > i9) {
                if (z9) {
                    return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i9))).concat("...");
                }
            } else {
                return str;
            }
        }
        return null;
    }

    public static long v1(byte[] bArr) {
        F4.y.h(bArr);
        int length = bArr.length;
        if (length > 0) {
            int i9 = 0;
            long j4 = 0;
            for (int i10 = length - 1; i10 >= 0 && i10 >= bArr.length - 8; i10--) {
                j4 += (bArr[i10] & 255) << i9;
                i9 += 8;
            }
            return j4;
        }
        throw new IllegalStateException();
    }

    public static MessageDigest w0() {
        MessageDigest messageDigest;
        for (int i9 = 0; i9 < 2; i9++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList y0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0622e c0622e = (C0622e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c0622e.f11073a);
            bundle.putString("origin", c0622e.f11074b);
            bundle.putLong("creation_timestamp", c0622e.f11076d);
            bundle.putString("name", c0622e.f11075c.f10804b);
            Object f9 = c0622e.f11075c.f();
            F4.y.h(f9);
            D0.e(bundle, f9);
            bundle.putBoolean("active", c0622e.f11077e);
            String str = c0622e.f11078f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C0665t c0665t = c0622e.f11079g;
            if (c0665t != null) {
                bundle.putString("timed_out_event_name", c0665t.f11309a);
                C0663s c0663s = c0665t.f11310b;
                if (c0663s != null) {
                    bundle.putBundle("timed_out_event_params", c0663s.f());
                }
            }
            bundle.putLong("trigger_timeout", c0622e.f11080h);
            C0665t c0665t2 = c0622e.f11081i;
            if (c0665t2 != null) {
                bundle.putString("triggered_event_name", c0665t2.f11309a);
                C0663s c0663s2 = c0665t2.f11310b;
                if (c0663s2 != null) {
                    bundle.putBundle("triggered_event_params", c0663s2.f());
                }
            }
            bundle.putLong("triggered_timestamp", c0622e.f11075c.f10805c);
            bundle.putLong("time_to_live", c0622e.j);
            C0665t c0665t3 = c0622e.f11082k;
            if (c0665t3 != null) {
                bundle.putString("expired_event_name", c0665t3.f11309a);
                C0663s c0663s3 = c0665t3.f11310b;
                if (c0663s3 != null) {
                    bundle.putBundle("expired_event_params", c0663s3.f());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final void A0(Bundle bundle, int i9, String str, Object obj) {
        if (n1(i9, bundle)) {
            ((C0650n0) this.f1707a).getClass();
            bundle.putString("_ev", v0(str, true, 40));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void C0(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    P1 p12 = ((C0650n0) this.f1707a).f11231l;
                    C0650n0.d(p12);
                    p12.G0(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    public final void D0(Parcelable[] parcelableArr, int i9) {
        F4.y.h(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i10 = 0;
            boolean z9 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (g1(str) && !R0(str, D0.f10581h) && (i10 = i10 + 1) > i9) {
                    C0650n0 c0650n0 = (C0650n0) this.f1707a;
                    if (!c0650n0.f11227g.y0(null, E.s1) || !z9) {
                        V v8 = c0650n0.f11229i;
                        C0650n0.f(v8);
                        O o9 = c0650n0.f11232m;
                        v8.f10973h.d(o9.e(str), o9.b(bundle), "Param can't contain more than " + i9 + " item-scoped custom parameters");
                    }
                    n1(28, bundle);
                    bundle.remove(str);
                    z9 = true;
                }
            }
        }
    }

    public final void E0(W w7, int i9) {
        Bundle bundle = (Bundle) w7.f10988e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z9 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (g1(str) && (i10 = i10 + 1) > i9) {
                C0650n0 c0650n0 = (C0650n0) this.f1707a;
                if (!c0650n0.f11227g.y0(null, E.s1) || !z9) {
                    String m9 = A0.a.m("Event can't contain more than ", i9, " params");
                    V v8 = c0650n0.f11229i;
                    C0650n0.f(v8);
                    O o9 = c0650n0.f11232m;
                    v8.f10973h.d(o9.d((String) w7.f10986c), o9.b(bundle), m9);
                    n1(5, bundle);
                }
                bundle.remove(str);
                z9 = true;
            }
        }
    }

    public final void G0(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
                return;
            }
            if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
                return;
            }
            if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
                return;
            }
            if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
                return;
            }
            if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                C0650n0 c0650n0 = (C0650n0) this.f1707a;
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10975k.d(c0650n0.f11232m.e(str), str2, "Not putting event parameter. Invalid value type. name, type");
            }
        }
    }

    public final void H0(com.google.android.gms.internal.measurement.L l9, boolean z9) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z9);
        try {
            l9.v0(bundle);
        } catch (RemoteException e8) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10974i.c(e8, "Error returning boolean value to wrapper");
        }
    }

    public final void I0(com.google.android.gms.internal.measurement.L l9, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            l9.v0(bundle);
        } catch (RemoteException e8) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10974i.c(e8, "Error returning bundle list to wrapper");
        }
    }

    public final void J0(com.google.android.gms.internal.measurement.L l9, Bundle bundle) {
        try {
            l9.v0(bundle);
        } catch (RemoteException e8) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10974i.c(e8, "Error returning bundle value to wrapper");
        }
    }

    public final void K0(com.google.android.gms.internal.measurement.L l9, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            l9.v0(bundle);
        } catch (RemoteException e8) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10974i.c(e8, "Error returning byte array to wrapper");
        }
    }

    public final void L0(com.google.android.gms.internal.measurement.L l9, int i9) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i9);
        try {
            l9.v0(bundle);
        } catch (RemoteException e8) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10974i.c(e8, "Error returning int value to wrapper");
        }
    }

    public final void M0(com.google.android.gms.internal.measurement.L l9, long j4) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j4);
        try {
            l9.v0(bundle);
        } catch (RemoteException e8) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10974i.c(e8, "Error returning long value to wrapper");
        }
    }

    public final void N0(String str, com.google.android.gms.internal.measurement.L l9) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            l9.v0(bundle);
        } catch (RemoteException e8) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10974i.c(e8, "Error returning string value to wrapper");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int O0(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.P1.O0(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int P0(String str) {
        boolean equals = "_ldl".equals(str);
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (equals) {
            c0650n0.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            c0650n0.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            c0650n0.getClass();
            return 100;
        }
        c0650n0.getClass();
        return 36;
    }

    public final Object Q0(int i9, Object obj, boolean z9, boolean z10) {
        long j4;
        if (obj != null) {
            if (!(obj instanceof Long)) {
                if (obj instanceof Double) {
                    return obj;
                }
                if (obj instanceof Integer) {
                    return Long.valueOf(((Integer) obj).intValue());
                }
                if (obj instanceof Byte) {
                    return Long.valueOf(((Byte) obj).byteValue());
                }
                if (obj instanceof Short) {
                    return Long.valueOf(((Short) obj).shortValue());
                }
                if (obj instanceof Boolean) {
                    if (true != ((Boolean) obj).booleanValue()) {
                        j4 = 0;
                    } else {
                        j4 = 1;
                    }
                    return Long.valueOf(j4);
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                    if (z10) {
                        if ((obj instanceof Bundle[]) || (obj instanceof Parcelable[])) {
                            ArrayList arrayList = new ArrayList();
                            for (Parcelable parcelable : (Parcelable[]) obj) {
                                if (parcelable instanceof Bundle) {
                                    Bundle y12 = y1((Bundle) parcelable);
                                    if (!y12.isEmpty()) {
                                        arrayList.add(y12);
                                    }
                                }
                            }
                            return arrayList.toArray(new Bundle[arrayList.size()]);
                        }
                        return null;
                    }
                    return null;
                }
                return v0(obj.toString(), z9, i9);
            }
            return obj;
        }
        return null;
    }

    public final void S0(String str, String str2, Bundle bundle, List list, boolean z9) {
        int i9;
        int i10;
        String str3;
        V v8;
        String str4;
        int O02;
        List list2 = list;
        if (bundle != null) {
            C0650n0 c0650n0 = (C0650n0) this.f1707a;
            P1 p12 = ((C0650n0) c0650n0.f11227g.f1707a).f11231l;
            C0650n0.d(p12);
            if (true != p12.e1(231100000)) {
                i9 = 0;
            } else {
                i9 = 35;
            }
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i11 = 0;
            boolean z10 = false;
            while (it.hasNext()) {
                String str5 = (String) it.next();
                if (list2 != null && list2.contains(str5)) {
                    i10 = 0;
                } else {
                    if (!z9) {
                        i10 = r1(str5);
                    } else {
                        i10 = 0;
                    }
                    if (i10 == 0) {
                        i10 = q1(str5);
                    }
                }
                if (i10 != 0) {
                    if (i10 == 3) {
                        str3 = str5;
                    } else {
                        str3 = null;
                    }
                    A0(bundle, i10, str5, str3);
                    bundle.remove(str5);
                } else {
                    boolean c12 = c1(bundle.get(str5));
                    V v9 = c0650n0.f11229i;
                    if (c12) {
                        C0650n0.f(v9);
                        v9.f10975k.e("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str5);
                        O02 = 22;
                        v8 = v9;
                        str4 = null;
                    } else {
                        v8 = v9;
                        str4 = null;
                        O02 = O0(str, str5, bundle.get(str5), bundle, list2, z9, false);
                    }
                    if (O02 != 0 && !"_ev".equals(str5)) {
                        A0(bundle, O02, str5, bundle.get(str5));
                        bundle.remove(str5);
                    } else if (g1(str5) && !R0(str5, D0.f10581h)) {
                        i11++;
                        boolean e12 = e1(231100000);
                        O o9 = c0650n0.f11232m;
                        if (!e12) {
                            C0650n0.f(v8);
                            v8.f10973h.d(o9.d(str), o9.b(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                            n1(23, bundle);
                            bundle.remove(str5);
                        } else {
                            V v10 = v8;
                            if (i11 > i9) {
                                if (!c0650n0.f11227g.y0(str4, E.s1) || !z10) {
                                    C0650n0.f(v10);
                                    v10.f10973h.d(o9.d(str), o9.b(bundle), "Item can't contain more than " + i9 + " item-scoped custom params");
                                }
                                n1(28, bundle);
                                bundle.remove(str5);
                                list2 = list;
                                z10 = true;
                            }
                        }
                    }
                }
                list2 = list;
            }
        }
    }

    public final boolean U0(String str, String str2) {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        boolean y02 = c0650n0.f11227g.y0(null, E.f10684q1);
        String str3 = c0650n0.f11222b;
        V v8 = c0650n0.f11229i;
        if (y02) {
            if (!TextUtils.isEmpty(str)) {
                if (!l1(str)) {
                    if (TextUtils.isEmpty(str3)) {
                        C0650n0.f(v8);
                        v8.f10973h.c(V.t0(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                        return false;
                    }
                } else {
                    return true;
                }
            } else if (TextUtils.isEmpty(str3)) {
                C0650n0.f(v8);
                v8.f10973h.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                return false;
            }
        } else if (!TextUtils.isEmpty(str)) {
            if (!l1(str)) {
                if (TextUtils.isEmpty(str3)) {
                    C0650n0.f(v8);
                    v8.f10973h.c(V.t0(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                    return false;
                }
            } else {
                return true;
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                if (!l1(str2)) {
                    C0650n0.f(v8);
                    v8.f10973h.c(V.t0(str2), "Invalid admob_app_id. Analytics disabled.");
                    return false;
                }
                return true;
            }
            if (TextUtils.isEmpty(str3)) {
                C0650n0.f(v8);
                v8.f10973h.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
        }
        return false;
    }

    public final boolean V0(String str, int i9, String str2) {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (str2 == null) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10973h.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) > i9) {
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10973h.e("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i9), str2);
            return false;
        }
        return true;
    }

    public final boolean W0(String str, String[] strArr, String[] strArr2, String str2) {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (str2 == null) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10973h.c(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f10839i;
        for (int i9 = 0; i9 < 3; i9++) {
            if (str2.startsWith(strArr3[i9])) {
                V v9 = c0650n0.f11229i;
                C0650n0.f(v9);
                v9.f10973h.d(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr != null && R0(str2, strArr)) {
            if (strArr2 == null || !R0(str2, strArr2)) {
                V v10 = c0650n0.f11229i;
                C0650n0.f(v10);
                v10.f10973h.d(str, str2, "Name is reserved. Type, name");
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean X0(String str, String str2, int i9, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) > i9) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10975k.e("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
            return false;
        }
        return true;
    }

    public final boolean Y0(String str, String str2) {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (str2 == null) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10973h.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10973h.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt == 95) {
                codePointAt = 95;
            } else {
                V v10 = c0650n0.f11229i;
                C0650n0.f(v10);
                v10.f10973h.d(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                V v11 = c0650n0.f11229i;
                C0650n0.f(v11);
                v11.f10973h.d(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean Z0(String str, String str2) {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (str2 == null) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10973h.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10973h.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            V v10 = c0650n0.f11229i;
            C0650n0.f(v10);
            v10.f10973h.d(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                V v11 = c0650n0.f11229i;
                C0650n0.f(v11);
                v11.f10973h.d(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean a1(String str) {
        l0();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (M4.c.a(c0650n0.f11221a).f4790a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        V v8 = c0650n0.f11229i;
        C0650n0.f(v8);
        v8.f10977m.c(str, "Permission not granted");
        return false;
    }

    public final boolean b1(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((C0650n0) this.f1707a).f11227g.p0("debug.firebase.analytics.app").equals(str);
    }

    public final boolean d1(Context context, String str) {
        Signature[] signatureArr;
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo c3 = M4.c.a(context).c(64, str);
            if (c3 != null && (signatureArr = c3.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e8) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10971f.c(e8, "Package name not found");
            return true;
        } catch (CertificateException e9) {
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10971f.c(e9, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean e1(int i9) {
        Boolean bool = ((C0650n0) this.f1707a).m().f11197e;
        if (t1() < i9 / 1000) {
            if (bool == null || bool.booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k1(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f1707a
            b5.n0 r0 = (b5.C0650n0) r0
            b5.g r0 = r0.f11227g
            r1 = 0
            b5.D r2 = b5.E.f10684q1
            boolean r0 = r0.y0(r1, r2)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L28
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L27
            if (r8 != 0) goto L27
            F4.y.h(r5)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L27
            return r2
        L27:
            return r1
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L3e
            if (r3 != 0) goto L3e
            F4.y.h(r5)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L7f
            goto L80
        L3e:
            if (r0 == 0) goto L5c
            if (r3 == 0) goto L5c
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L55
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L55
            boolean r5 = r7.equals(r8)
            if (r5 != 0) goto L7f
            goto L80
        L55:
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L7f
            goto L80
        L5c:
            if (r0 != 0) goto L72
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 == 0) goto L65
            goto L7f
        L65:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L80
            boolean r5 = r7.equals(r8)
            if (r5 != 0) goto L7f
            goto L80
        L72:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L80
            boolean r5 = r7.equals(r8)
            if (r5 != 0) goto L7f
            goto L80
        L7f:
            return r1
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.P1.k1(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public final boolean l1(String str) {
        String str2;
        F4.y.h(str);
        if (true != ((C0650n0) this.f1707a).f11227g.y0(null, E.f10684q1)) {
            str2 = "^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$";
        } else {
            str2 = "^1:\\d+:android:[a-f0-9]+$";
        }
        return str.matches(str2);
    }

    @Override // b5.AbstractC0674x0
    public final boolean m0() {
        return true;
    }

    public final int o1(Object obj, String str) {
        boolean X02;
        if ("_ldl".equals(str)) {
            X02 = X0("user property referrer", str, P0(str), obj);
        } else {
            X02 = X0("user property", str, P0(str), obj);
        }
        if (X02) {
            return 0;
        }
        return 7;
    }

    public final Bundle p0(String str, Bundle bundle, List list, boolean z9) {
        int i9;
        int i10;
        String str2;
        String str3;
        List list2 = list;
        boolean R02 = R0(str, D0.f10577d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        P1 p12 = ((C0650n0) c0650n0.f11227g.f1707a).f11231l;
        C0650n0.d(p12);
        if (p12.e1(201500000)) {
            i9 = 100;
        } else {
            i9 = 25;
        }
        int i11 = i9;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i12 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 != null && list2.contains(str4)) {
                i10 = 0;
            } else {
                if (!z9) {
                    i10 = r1(str4);
                } else {
                    i10 = 0;
                }
                if (i10 == 0) {
                    i10 = q1(str4);
                }
            }
            if (i10 != 0) {
                if (i10 == 3) {
                    str3 = str4;
                } else {
                    str3 = null;
                }
                A0(bundle2, i10, str4, str3);
                bundle2.remove(str4);
            } else {
                int O02 = O0(str, str4, bundle.get(str4), bundle2, list2, z9, R02);
                if (O02 == 17) {
                    A0(bundle2, 17, str4, Boolean.FALSE);
                } else if (O02 != 0 && !"_ev".equals(str4)) {
                    if (O02 == 21) {
                        str2 = str;
                    } else {
                        str2 = str4;
                    }
                    A0(bundle2, O02, str2, bundle.get(str4));
                    bundle2.remove(str4);
                }
                if (g1(str4) && (i12 = i12 + 1) > i11) {
                    if (!c0650n0.f11227g.y0(null, E.s1) || !z10) {
                        String m9 = A0.a.m("Event can't contain more than ", i11, " params");
                        V v8 = c0650n0.f11229i;
                        C0650n0.f(v8);
                        O o9 = c0650n0.f11232m;
                        v8.f10973h.d(o9.d(str), o9.b(bundle), m9);
                    }
                    n1(5, bundle2);
                    bundle2.remove(str4);
                    z10 = true;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final int p1(String str) {
        if (!Y0("event", str)) {
            return 2;
        }
        if (!W0("event", D0.f10574a, D0.f10575b, str)) {
            return 13;
        }
        ((C0650n0) this.f1707a).getClass();
        if (!V0("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    public final B0.d q0() {
        int i9;
        int i10;
        int a5;
        C0.g gVar;
        Object obj;
        if (this.f10843f == null) {
            Context context = ((C0650n0) this.f1707a).f11221a;
            kotlin.jvm.internal.h.e(context, "context");
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i11 = Build.VERSION.SDK_INT;
            C2233b c2233b = C2233b.f25363a;
            int i12 = 0;
            if (i11 >= 33) {
                i9 = c2233b.a();
            } else {
                i9 = 0;
            }
            sb.append(i9);
            Log.d("MeasurementManager", sb.toString());
            if (i11 >= 33) {
                i10 = c2233b.a();
            } else {
                i10 = 0;
            }
            B0.d dVar = null;
            if (i10 >= 5) {
                Object systemService = context.getSystemService((Class<Object>) C0.c.g());
                kotlin.jvm.internal.h.d(systemService, "context.getSystemService…ementManager::class.java)");
                gVar = new C0.g(C0.c.c(systemService));
            } else {
                C2232a c2232a = C2232a.f25362a;
                if (i11 != 31 && i11 != 32) {
                    a5 = 0;
                } else {
                    a5 = c2232a.a();
                }
                if (a5 >= 9) {
                    try {
                        obj = new C0.b(0, context).invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 == 31 || i13 == 32) {
                            i12 = c2232a.a();
                        }
                        sb2.append(i12);
                        Log.d("MeasurementManager", sb2.toString());
                        obj = null;
                    }
                    gVar = (C0.g) obj;
                } else {
                    gVar = null;
                }
            }
            if (gVar != null) {
                dVar = new B0.d(gVar);
            }
            this.f10843f = dVar;
        }
        return this.f10843f;
    }

    public final int q1(String str) {
        if (!Y0("event param", str)) {
            return 3;
        }
        if (!W0("event param", null, null, str)) {
            return 14;
        }
        ((C0650n0) this.f1707a).getClass();
        if (!V0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public final C0665t r0(String str, Bundle bundle, String str2, long j4, boolean z9) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (p1(str) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str2);
            Bundle p02 = p0(str, bundle2, Collections.singletonList("_o"), true);
            if (z9) {
                p02 = y1(p02);
            }
            F4.y.h(p02);
            return new C0665t(str, new C0663s(p02), str2, j4);
        }
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        V v8 = c0650n0.f11229i;
        C0650n0.f(v8);
        v8.f10971f.c(c0650n0.f11232m.f(str), "Invalid conditional property event name");
        throw new IllegalArgumentException();
    }

    public final int r1(String str) {
        if (!Z0("event param", str)) {
            return 3;
        }
        if (!W0("event param", null, null, str)) {
            return 14;
        }
        ((C0650n0) this.f1707a).getClass();
        if (!V0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public final Object s0(Object obj, String str) {
        boolean equals = "_ev".equals(str);
        int i9 = 500;
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (equals) {
            c0650n0.f11227g.getClass();
            return Q0(Math.max(500, 256), obj, true, true);
        }
        if (f1(str)) {
            c0650n0.f11227g.getClass();
            i9 = Math.max(500, 256);
        } else {
            c0650n0.f11227g.getClass();
        }
        return Q0(i9, obj, false, true);
    }

    public final int s1(String str) {
        if (!Y0("user property", str)) {
            return 6;
        }
        if (!W0("user property", D0.f10582i, null, str)) {
            return 15;
        }
        ((C0650n0) this.f1707a).getClass();
        if (!V0("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    public final Object t0(Object obj, String str) {
        if ("_ldl".equals(str)) {
            return Q0(P0(str), obj, true, false);
        }
        return Q0(P0(str), obj, false, false);
    }

    public final int t1() {
        if (this.f10845h == null) {
            B4.g gVar = B4.g.f697b;
            Context context = ((C0650n0) this.f1707a).f11221a;
            gVar.getClass();
            int i9 = B4.h.f702e;
            int i10 = 0;
            try {
                i10 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f10845h = Integer.valueOf(i10 / 1000);
        }
        return this.f10845h.intValue();
    }

    public final String u0() {
        byte[] bArr = new byte[16];
        x0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long u1() {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.P1.u1():long");
    }

    public final long w1() {
        long andIncrement;
        long j4;
        AtomicLong atomicLong = this.f10841d;
        if (atomicLong.get() == 0) {
            synchronized (atomicLong) {
                long nanoTime = System.nanoTime();
                ((C0650n0) this.f1707a).f11233n.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i9 = this.f10842e + 1;
                this.f10842e = i9;
                j4 = nextLong + i9;
            }
            return j4;
        }
        AtomicLong atomicLong2 = this.f10841d;
        synchronized (atomicLong2) {
            atomicLong2.compareAndSet(-1L, 1L);
            andIncrement = atomicLong2.getAndIncrement();
        }
        return andIncrement;
    }

    public final SecureRandom x0() {
        l0();
        if (this.f10840c == null) {
            this.f10840c = new SecureRandom();
        }
        return this.f10840c;
    }

    public final Bundle x1(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("gbraid");
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            } else {
                str10 = "sfmc_id";
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e8) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10974i.c(e8, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final Bundle y1(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object s02 = s0(bundle.get(str), str);
                if (s02 == null) {
                    C0650n0 c0650n0 = (C0650n0) this.f1707a;
                    V v8 = c0650n0.f11229i;
                    C0650n0.f(v8);
                    v8.f10975k.c(c0650n0.f11232m.e(str), "Param value can't be null");
                } else {
                    G0(bundle2, str, s02);
                }
            }
        }
        return bundle2;
    }

    public final void z0(Bundle bundle, long j4) {
        long j9 = bundle.getLong("_et");
        if (j9 != 0) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10974i.c(Long.valueOf(j9), "Params already contained engagement");
        } else {
            j9 = 0;
        }
        bundle.putLong("_et", j4 + j9);
    }
}
