package v4;

import G0.C0135a;
import G0.L;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.C0916d;
import com.google.android.gms.internal.measurement.C0921e;
import com.google.android.gms.internal.measurement.C0931g;
import com.google.android.gms.internal.measurement.C0951k;
import com.google.android.gms.internal.measurement.C0971o;
import com.google.android.gms.internal.measurement.C0981q;
import com.google.android.gms.internal.measurement.C0987r1;
import com.google.android.gms.internal.measurement.InterfaceC0939h2;
import com.google.android.gms.internal.measurement.InterfaceC0966n;
import com.google.firebase.messaging.FirebaseMessagingService;
import i0.AbstractActivityC1369y;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import l4.AbstractC1566a;
import l6.C1574f;
import p6.C1862c;
import p6.InterfaceC1861b;
import u0.C2032c;
import x7.InterfaceC2179a;
import x7.InterfaceC2180b;
import x8.B;
import x8.C;
import x8.C2182b;
import x8.C2183c;
import x8.G;
import x8.H;
import x8.I;
import x8.K;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23805a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f23806b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23807c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f23808d = true;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f23809e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f23810f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f23811g = 0;

    public static int C(int[] iArr, int i9, int i10, int i11) {
        while (i10 < i11) {
            if (iArr[i10] == i9) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final boolean D(AssertionError assertionError) {
        boolean z9;
        Logger logger = x8.w.f24682a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null) {
                z9 = W7.d.N(message, "getsockname failed");
            } else {
                z9 = false;
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public static final boolean F(C0135a c0135a, int i9, int i10) {
        Set set;
        kotlin.jvm.internal.h.e(c0135a, "<this>");
        if ((i9 > i10 && c0135a.f2749l) || !c0135a.f2748k || ((set = c0135a.f2750m) != null && set.contains(Integer.valueOf(i9)))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void I(android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.e.I(android.content.Intent):void");
    }

    public static void J(String str, Bundle bundle) {
        String str2;
        try {
            C1574f.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            String str3 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e8) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e8);
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str3 = bundle.getString("google.c.a.udt");
            }
            if (str3 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str3));
                } catch (NumberFormatException e9) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e9);
                }
            }
            if (android.support.v4.media.d.k(bundle)) {
                str2 = "display";
            } else {
                str2 = "data";
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC1861b interfaceC1861b = (InterfaceC1861b) C1574f.c().b(InterfaceC1861b.class);
            if (interfaceC1861b != null) {
                ((C1862c) interfaceC1861b).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static int L(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static boolean N(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final C2182b O(Socket socket) {
        Logger logger = x8.w.f24682a;
        H h7 = new H(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.h.d(outputStream, "getOutputStream(...)");
        return new C2182b(h7, 0, new C2182b(outputStream, 1, h7));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, x8.K] */
    public static final C2183c P(InputStream inputStream) {
        Logger logger = x8.w.f24682a;
        kotlin.jvm.internal.h.e(inputStream, "<this>");
        return new C2183c(inputStream, (K) new Object());
    }

    public static final C2183c Q(Socket socket) {
        Logger logger = x8.w.f24682a;
        H h7 = new H(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.h.d(inputStream, "getInputStream(...)");
        return new C2183c(h7, new C2183c(inputStream, h7));
    }

    public static void R(ViewGroup viewGroup, boolean z9) {
        if (Build.VERSION.SDK_INT >= 29) {
            X0.v.b(viewGroup, z9);
        } else if (f23808d) {
            try {
                X0.v.b(viewGroup, z9);
            } catch (NoSuchMethodError unused) {
                f23808d = false;
            }
        }
    }

    public static Intent S(PackageManager packageManager, String telegramLink) {
        Intent intent;
        kotlin.jvm.internal.h.e(telegramLink, "telegramLink");
        try {
            try {
                try {
                    kotlin.jvm.internal.h.b(packageManager);
                    if (Build.VERSION.SDK_INT >= 33) {
                        Q.d.a(packageManager, "org.telegram.messenger", Q.d.b());
                    } else {
                        packageManager.getPackageInfo("org.telegram.messenger", 0);
                    }
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(telegramLink));
                    intent2.setPackage("org.telegram.messenger");
                    return intent2;
                } catch (Exception unused) {
                    intent = new Intent("android.intent.action.VIEW", Uri.parse(telegramLink));
                    return intent;
                }
            } catch (Exception unused2) {
                kotlin.jvm.internal.h.b(packageManager);
                if (Build.VERSION.SDK_INT >= 33) {
                    Q.d.a(packageManager, "org.thunderdog.challegram", Q.d.b());
                } else {
                    packageManager.getPackageInfo("org.thunderdog.challegram", 0);
                }
                Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(telegramLink));
                intent3.setPackage("org.telegram.messenger");
                return intent3;
            }
        } catch (Exception unused3) {
            intent = null;
            return intent;
        }
    }

    public static int T(Context context, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i9});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int[] U(Collection collection) {
        if (collection instanceof R5.a) {
            R5.a aVar = (R5.a) collection;
            return Arrays.copyOfRange(aVar.f6662a, aVar.f6663b, aVar.f6664c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            Object obj = array[i9];
            obj.getClass();
            iArr[i9] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, x8.g] */
    public static final String V(String str) {
        InetAddress k5;
        kotlin.jvm.internal.h.e(str, "<this>");
        int i9 = 0;
        int i10 = -1;
        if (W7.d.N(str, ":")) {
            if (W7.l.L(str, "[", false) && W7.l.G(str, "]", false)) {
                k5 = k(str, 1, str.length() - 1);
            } else {
                k5 = k(str, 0, str.length());
            }
            if (k5 != null) {
                byte[] address = k5.getAddress();
                if (address.length == 16) {
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < address.length) {
                        int i13 = i11;
                        while (i13 < 16 && address[i13] == 0 && address[i13 + 1] == 0) {
                            i13 += 2;
                        }
                        int i14 = i13 - i11;
                        if (i14 > i12 && i14 >= 4) {
                            i10 = i11;
                            i12 = i14;
                        }
                        i11 = i13 + 2;
                    }
                    ?? obj = new Object();
                    while (i9 < address.length) {
                        if (i9 == i10) {
                            obj.w0(58);
                            i9 += i12;
                            if (i9 == 16) {
                                obj.w0(58);
                            }
                        } else {
                            if (i9 > 0) {
                                obj.w0(58);
                            }
                            byte b9 = address[i9];
                            byte[] bArr = k8.c.f20141a;
                            obj.y0(((b9 & 255) << 8) | (address[i9 + 1] & 255));
                            i9 += 2;
                        }
                    }
                    return obj.q0();
                }
                if (address.length == 4) {
                    return k5.getHostAddress();
                }
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
            return null;
        }
        try {
            String ascii = IDN.toASCII(str);
            kotlin.jvm.internal.h.d(ascii, "toASCII(host)");
            Locale US = Locale.US;
            kotlin.jvm.internal.h.d(US, "US");
            String lowerCase = ascii.toLowerCase(US);
            kotlin.jvm.internal.h.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() != 0) {
                int length = lowerCase.length();
                for (int i15 = 0; i15 < length; i15++) {
                    char charAt = lowerCase.charAt(i15);
                    if (kotlin.jvm.internal.h.f(charAt, 31) <= 0 || kotlin.jvm.internal.h.f(charAt, 127) >= 0 || W7.d.R(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static InterfaceC0966n Y(C0987r1 c0987r1) {
        if (c0987r1 == null) {
            return InterfaceC0966n.f15543N;
        }
        int v8 = c0987r1.v() - 1;
        if (v8 != 1) {
            if (v8 != 2) {
                if (v8 != 3) {
                    if (v8 == 4) {
                        InterfaceC0939h2 q9 = c0987r1.q();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = q9.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Y((C0987r1) it.next()));
                        }
                        return new C0971o(c0987r1.o(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                }
                if (c0987r1.s()) {
                    return new C0921e(Boolean.valueOf(c0987r1.r()));
                }
                return new C0921e(null);
            }
            if (c0987r1.t()) {
                return new C0931g(Double.valueOf(c0987r1.n()));
            }
            return new C0931g(null);
        }
        if (c0987r1.u()) {
            return new C0981q(c0987r1.p());
        }
        return InterfaceC0966n.f15550U;
    }

    public static InterfaceC0966n Z(Object obj) {
        if (obj == null) {
            return InterfaceC0966n.f15544O;
        }
        if (obj instanceof String) {
            return new C0981q((String) obj);
        }
        if (obj instanceof Double) {
            return new C0931g((Double) obj);
        }
        if (obj instanceof Long) {
            return new C0931g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C0931g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C0921e((Boolean) obj);
        }
        if (obj instanceof Map) {
            C0951k c0951k = new C0951k();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                InterfaceC0966n Z6 = Z(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    c0951k.k((String) obj2, Z6);
                }
            }
            return c0951k;
        }
        if (obj instanceof List) {
            C0916d c0916d = new C0916d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c0916d.v(c0916d.p(), Z(it.next()));
            }
            return c0916d;
        }
        throw new IllegalArgumentException("Invalid value type");
    }

    public static final B a(G g9) {
        kotlin.jvm.internal.h.e(g9, "<this>");
        return new B(g9);
    }

    public static final C b(I i9) {
        kotlin.jvm.internal.h.e(i9, "<this>");
        return new C(i9);
    }

    public static int e(long j) {
        boolean z9;
        int i9 = (int) j;
        if (i9 == j) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return i9;
        }
        throw new IllegalArgumentException(Z0.a.r("Out of range: %s", Long.valueOf(j)));
    }

    public static int f(int i9, int i10) {
        if (i10 <= 1073741823) {
            return Math.min(Math.max(i9, i10), 1073741823);
        }
        throw new IllegalArgumentException(Z0.a.r("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i10), 1073741823));
    }

    public static final void g(int i9, int i10) {
        if (i9 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i9 + ") is greater than size (" + i10 + ").");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress k(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.e.k(java.lang.String, int, int):java.net.InetAddress");
    }

    public static boolean l() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C1574f.c();
            C1574f c3 = C1574f.c();
            c3.a();
            Context context = c3.f20587a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090 A[EDGE_INSN: B:48:0x0090->B:32:0x0090 BREAK  A[LOOP:0: B:10:0x0016->B:33:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m(G0.C r9, int r10, int r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.h.e(r9, r0)
            if (r10 != r11) goto La
            B7.t r9 = B7.t.f1135a
            return r9
        La:
            r0 = 1
            r1 = 0
            if (r11 <= r10) goto L10
            r2 = r0
            goto L11
        L10:
            r2 = r1
        L11:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L16:
            if (r2 == 0) goto L1b
            if (r10 >= r11) goto L91
            goto L1d
        L1b:
            if (r10 <= r11) goto L91
        L1d:
            java.util.LinkedHashMap r4 = r9.f2640a
            r5 = 0
            if (r2 == 0) goto L3a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L30
        L2e:
            r7 = r5
            goto L50
        L30:
            java.util.NavigableSet r6 = r4.descendingKeySet()
            A7.h r7 = new A7.h
            r7.<init>(r4, r6)
            goto L50
        L3a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L47
            goto L2e
        L47:
            java.util.Set r6 = r4.keySet()
            A7.h r7 = new A7.h
            r7.<init>(r4, r6)
        L50:
            if (r7 != 0) goto L53
            goto L90
        L53:
            java.lang.Object r4 = r7.f547a
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r6 = r7.f548b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8d
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L78
            int r8 = r10 + 1
            if (r8 > r7) goto L5f
            if (r7 > r11) goto L5f
            goto L7c
        L78:
            if (r11 > r7) goto L5f
            if (r7 >= r10) goto L5f
        L7c:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r4.get(r10)
            kotlin.jvm.internal.h.b(r10)
            r3.add(r10)
            r4 = r0
            r10 = r7
            goto L8e
        L8d:
            r4 = r1
        L8e:
            if (r4 != 0) goto L16
        L90:
            return r5
        L91:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.e.m(G0.C, int, int):java.util.List");
    }

    public static final u0.H n(View view) {
        Object next;
        kotlin.jvm.internal.h.e(view, "view");
        V7.f fVar = new V7.f(new V7.g(new V7.i(V7.l.g0(view, C2032c.f23476l), C2032c.f23477m, 2), false, new L(4)));
        if (!fVar.hasNext()) {
            next = null;
        } else {
            next = fVar.next();
        }
        u0.H h7 = (u0.H) next;
        if (h7 != null) {
            return h7;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i8.v o(javax.net.ssl.SSLSession r6) {
        /*
            B7.t r0 = B7.t.f1135a
            java.lang.String r1 = r6.getCipherSuite()
            if (r1 == 0) goto L7a
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L18
        L12:
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
        L18:
            if (r2 != 0) goto L6e
            i8.r r2 = i8.C1424n.f19107b
            i8.n r1 = r2.e(r1)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L66
            java.lang.String r3 = "NONE"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L5e
            i8.P r2 = Z0.a.g(r2)
            java.security.cert.Certificate[] r3 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            if (r3 == 0) goto L42
            int r4 = r3.length     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            java.util.List r3 = k8.c.l(r3)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            goto L43
        L42:
            r3 = r0
        L43:
            i8.v r4 = new i8.v
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            if (r6 == 0) goto L54
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.util.List r0 = k8.c.l(r6)
        L54:
            i8.u r6 = new i8.u
            r5 = 1
            r6.<init>(r3, r5)
            r4.<init>(r2, r1, r0, r6)
            return r4
        L5e:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r6.<init>(r0)
            throw r6
        L66:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            r6.<init>(r0)
            throw r6
        L6e:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == "
            java.lang.String r0 = r0.concat(r1)
            r6.<init>(r0)
            throw r6
        L7a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.e.o(javax.net.ssl.SSLSession):i8.v");
    }

    public static Object p(Class cls, Object obj) {
        if (obj instanceof InterfaceC2179a) {
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC2180b) {
            return p(cls, ((InterfaceC2180b) obj).e());
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + InterfaceC2179a.class + " or " + InterfaceC2180b.class);
    }

    public static int v(Context context) {
        Network network;
        if (context == null) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            kotlin.jvm.internal.h.d(allNetworks, "getAllNetworks(...)");
            if (allNetworks.length == 0) {
                network = null;
            } else {
                network = allNetworks[0];
            }
            activeNetwork = network;
        }
        return w(connectivityManager.getNetworkCapabilities(activeNetwork));
    }

    public static int w(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities != null) {
            StringBuilder sb = new StringBuilder();
            if (networkCapabilities.hasTransport(1)) {
                sb.append("1");
            }
            if (networkCapabilities.hasTransport(0)) {
                sb.append("2");
            }
            if (networkCapabilities.hasTransport(3)) {
                sb.append("3");
            }
            if (networkCapabilities.hasTransport(2)) {
                sb.append("4");
            }
            if (networkCapabilities.hasTransport(4)) {
                sb.append("5");
            }
            String sb2 = sb.toString();
            kotlin.jvm.internal.h.d(sb2, "toString(...)");
            Integer E8 = W7.k.E(sb2);
            if (E8 != null) {
                return E8.intValue();
            }
        }
        return 0;
    }

    public static final int z(int i9, int i10, int i11) {
        if (i11 > 0) {
            if (i9 < i10) {
                int i12 = i10 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i9 % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i10 - i14;
            }
        } else if (i11 < 0) {
            if (i9 > i10) {
                int i15 = -i11;
                int i16 = i9 % i15;
                if (i16 < 0) {
                    i16 += i15;
                }
                int i17 = i10 % i15;
                if (i17 < 0) {
                    i17 += i15;
                }
                int i18 = (i16 - i17) % i15;
                if (i18 < 0) {
                    i18 += i15;
                }
                return i18 + i10;
            }
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
        return i10;
    }

    public abstract int A();

    public com.google.firebase.messaging.u B(AbstractActivityC1369y abstractActivityC1369y, Object obj) {
        return null;
    }

    public abstract boolean E(float f9);

    public abstract boolean G(View view);

    public abstract boolean H(float f9, float f10);

    public abstract Object K(Intent intent, int i9);

    public abstract boolean M(View view, float f9);

    public abstract void W(ViewGroup.MarginLayoutParams marginLayoutParams, int i9);

    public abstract void X(ViewGroup.MarginLayoutParams marginLayoutParams, int i9, int i10);

    public abstract int c(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float d(int i9);

    public abstract Intent h(AbstractActivityC1369y abstractActivityC1369y, Object obj);

    public D3.c i(D3.e eVar) {
        boolean z9;
        ByteBuffer byteBuffer = eVar.f20704d;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        if (eVar.e(Integer.MIN_VALUE)) {
            return null;
        }
        return j(eVar, byteBuffer);
    }

    public abstract D3.c j(D3.e eVar, ByteBuffer byteBuffer);

    public abstract int q(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int r();

    public abstract int s();

    public abstract int t();

    public abstract int u();

    public abstract int x(View view);

    public abstract int y(CoordinatorLayout coordinatorLayout);
}
