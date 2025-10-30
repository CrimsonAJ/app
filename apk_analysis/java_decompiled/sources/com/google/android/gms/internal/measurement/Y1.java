package com.google.android.gms.internal.measurement;

import G0.InterfaceC0154u;
import Y7.C0464h;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import co.notix.R;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import f5.C1185q;
import i0.AbstractActivityC1369y;
import i0.C1359o;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import k4.C1499E;
import l4.AbstractC1566a;
import p1.AbstractC1845h;
import p1.C1840c;
import p1.C1844g;
import q3.C1902g;
import u0.C2032c;

/* loaded from: classes.dex */
public abstract class Y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15409a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15410b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15411c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f15412d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f15413e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f15414f;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f15415g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f15416h;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f15417i;
    public static Boolean j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f15418k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f15419l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f15420m = 0;

    public static C1499E A(A4.r rVar) {
        rVar.I(1);
        int z9 = rVar.z();
        long j4 = rVar.f382a + z9;
        int i9 = z9 / 18;
        long[] jArr = new long[i9];
        long[] jArr2 = new long[i9];
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                break;
            }
            long q9 = rVar.q();
            if (q9 == -1) {
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                break;
            }
            jArr[i10] = q9;
            jArr2[i10] = rVar.q();
            rVar.I(2);
            i10++;
        }
        rVar.I((int) (j4 - rVar.f382a));
        return new C1499E(jArr, 14, jArr2);
    }

    public static final void B(AbstractActivityC1369y abstractActivityC1369y, C1359o activityResult, String clientId) {
        boolean z9;
        Intent a5;
        kotlin.jvm.internal.h.e(activityResult, "activityResult");
        kotlin.jvm.internal.h.e(clientId, "clientId");
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f14556k;
        new HashSet();
        new HashMap();
        F4.y.h(googleSignInOptions);
        HashSet hashSet = new HashSet(googleSignInOptions.f14564b);
        String str = googleSignInOptions.f14569g;
        Account account = googleSignInOptions.f14565c;
        String str2 = googleSignInOptions.f14570h;
        HashMap g9 = GoogleSignInOptions.g(googleSignInOptions.f14571i);
        String str3 = googleSignInOptions.j;
        hashSet.add(GoogleSignInOptions.f14558m);
        F4.y.e(clientId);
        if (str == null || str.equals(clientId)) {
            z9 = true;
        } else {
            z9 = false;
        }
        F4.y.a("two different server client ids provided", z9);
        hashSet.add(GoogleSignInOptions.f14557l);
        if (hashSet.contains(GoogleSignInOptions.f14561p)) {
            Scope scope = GoogleSignInOptions.f14560o;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        if (account == null || !hashSet.isEmpty()) {
            hashSet.add(GoogleSignInOptions.f14559n);
        }
        com.google.android.gms.internal.cast.L x5 = s8.e.x(abstractActivityC1369y, new GoogleSignInOptions(3, new ArrayList(hashSet), account, true, googleSignInOptions.f14567e, googleSignInOptions.f14568f, clientId, str2, g9, str3));
        int e8 = x5.e();
        int i9 = e8 - 1;
        if (e8 != 0) {
            C4.b bVar = x5.f1581d;
            Context context = x5.f1578a;
            if (i9 != 2) {
                if (i9 != 3) {
                    s4.h.f22732a.f("getNoImplementationSignInIntent()", new Object[0]);
                    a5 = s4.h.a(context, (GoogleSignInOptions) bVar);
                    a5.setAction("com.google.android.gms.auth.NO_IMPL");
                } else {
                    a5 = s4.h.a(context, (GoogleSignInOptions) bVar);
                }
            } else {
                s4.h.f22732a.f("getFallbackSignInIntent()", new Object[0]);
                a5 = s4.h.a(context, (GoogleSignInOptions) bVar);
                a5.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            }
            activityResult.a(a5);
            return;
        }
        throw null;
    }

    public static int D(double d9) {
        if (!Double.isNaN(d9)) {
            if (d9 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d9 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d9);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static void E(Window window, boolean z9) {
        int i9;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            I.b.f(window, z9);
            return;
        }
        if (i10 >= 30) {
            I.b.e(window, z9);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z9) {
            i9 = systemUiVisibility & (-1793);
        } else {
            i9 = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i9);
    }

    public static B3.f F(int i9, C1902g c1902g, A4.r rVar) {
        B3.f b9 = B3.f.b(c1902g, rVar);
        while (true) {
            int i10 = b9.f674a;
            if (i10 != i9) {
                AbstractC0953k1.v("Ignoring unknown WAV chunk: ", i10, "WavHeaderReader");
                long j4 = b9.f675b + 8;
                if (j4 <= 2147483647L) {
                    c1902g.n((int) j4);
                    b9 = B3.f.b(c1902g, rVar);
                } else {
                    throw j3.j0.c("Chunk is too large (~2GB+) to skip; id: " + i10);
                }
            } else {
                return b9;
            }
        }
    }

    public static InterfaceC0966n I(InterfaceC0946j interfaceC0946j, C0981q c0981q, com.google.firebase.messaging.s sVar, ArrayList arrayList) {
        String str = c0981q.f15572a;
        if (interfaceC0946j.d(str)) {
            InterfaceC0966n i9 = interfaceC0946j.i(str);
            if (i9 instanceof AbstractC0936h) {
                return ((AbstractC0936h) i9).a(sVar, arrayList);
            }
            throw new IllegalArgumentException(AbstractC0953k1.n(str, " is not a function"));
        }
        if ("hasOwnProperty".equals(str)) {
            s8.n.a0(1, "hasOwnProperty", arrayList);
            if (interfaceC0946j.d(((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0)).c())) {
                return InterfaceC0966n.f15548S;
            }
            return InterfaceC0966n.f15549T;
        }
        throw new IllegalArgumentException(u0.z.e("Object has no function ", str));
    }

    public static V1 J() {
        String str;
        ClassLoader classLoader = Y1.class.getClassLoader();
        if (!V1.class.equals(V1.class)) {
            if (!V1.class.getPackage().equals(Y1.class.getPackage())) {
                throw new IllegalArgumentException(V1.class.getName());
            }
            str = V1.class.getPackage().getName() + ".BlazeGenerated" + V1.class.getSimpleName() + "Loader";
        } else {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        }
        try {
            try {
                try {
                    try {
                        A0.a.x(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (IllegalAccessException e8) {
                        throw new IllegalStateException(e8);
                    } catch (InvocationTargetException e9) {
                        throw new IllegalStateException(e9);
                    }
                } catch (InstantiationException e10) {
                    throw new IllegalStateException(e10);
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = Arrays.asList(new Y1[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                    break;
                } catch (ServiceConfigurationError e12) {
                    Logger.getLogger(U1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(V1.class.getSimpleName()), (Throwable) e12);
                }
            }
            if (arrayList.size() == 1) {
                return (V1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (V1) V1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(e13);
            } catch (NoSuchMethodException e14) {
                throw new IllegalStateException(e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    public static final Object a(C1185q c1185q, G7.c cVar) {
        if (c1185q.i()) {
            Exception f9 = c1185q.f();
            if (f9 == null) {
                if (!c1185q.f17438d) {
                    return c1185q.g();
                }
                throw new CancellationException("Task " + c1185q + " was cancelled normally.");
            }
            throw f9;
        }
        C0464h c0464h = new C0464h(1, D1.A(cVar));
        c0464h.s();
        c1185q.b(h8.a.f17970a, new h8.b(c0464h));
        return c0464h.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(D.n r6, G7.c r7) {
        /*
            boolean r0 = r7 instanceof H1.b
            if (r0 == 0) goto L13
            r0 = r7
            H1.b r0 = (H1.b) r0
            int r1 = r0.f2945u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2945u = r1
            goto L18
        L13:
            H1.b r0 = new H1.b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f2944t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f2945u
            A7.n r3 = A7.n.f558a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            kotlin.jvm.internal.o r6 = r0.f2943s
            D.n r0 = r0.f2942r
            a.AbstractC0485a.A(r7)     // Catch: java.lang.Throwable -> L2d
            goto L71
        L2d:
            r7 = move-exception
            goto L80
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            a.AbstractC0485a.A(r7)
            androidx.lifecycle.p r7 = r6.a0()
            androidx.lifecycle.p r2 = androidx.lifecycle.EnumC0555p.f9896d
            int r7 = r7.compareTo(r2)
            if (r7 < 0) goto L47
            return r3
        L47:
            kotlin.jvm.internal.o r7 = new kotlin.jvm.internal.o
            r7.<init>()
            r0.f2942r = r6     // Catch: java.lang.Throwable -> L7b
            r0.f2943s = r7     // Catch: java.lang.Throwable -> L7b
            r0.f2945u = r4     // Catch: java.lang.Throwable -> L7b
            Y7.h r2 = new Y7.h     // Catch: java.lang.Throwable -> L7b
            E7.d r0 = com.google.android.gms.internal.measurement.D1.A(r0)     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L7b
            r2.s()     // Catch: java.lang.Throwable -> L7b
            H1.c r0 = new H1.c     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7b
            r7.f20159a = r0     // Catch: java.lang.Throwable -> L7b
            r6.V(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r2.r()     // Catch: java.lang.Throwable -> L7b
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r6
            r6 = r7
        L71:
            java.lang.Object r6 = r6.f20159a
            androidx.lifecycle.v r6 = (androidx.lifecycle.InterfaceC0560v) r6
            if (r6 == 0) goto L7a
            r0.g0(r6)
        L7a:
            return r3
        L7b:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L80:
            java.lang.Object r6 = r6.f20159a
            androidx.lifecycle.v r6 = (androidx.lifecycle.InterfaceC0560v) r6
            if (r6 == 0) goto L89
            r0.g0(r6)
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Y1.b(D.n, G7.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [E7.d, V7.k, java.lang.Object] */
    public static final void c(View view) {
        kotlin.jvm.internal.h.e(view, "<this>");
        P.U u9 = new P.U(view, null);
        ?? obj = new Object();
        obj.f7837d = u9.create(obj, obj);
        while (obj.hasNext()) {
            View view2 = (View) obj.next();
            T.a aVar = (T.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new T.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f6966a;
            int a02 = B7.l.a0(arrayList);
            if (-1 < a02) {
                arrayList.get(a02).getClass();
                throw new ClassCastException();
            }
        }
    }

    public static boolean h(C1902g c1902g) {
        A4.r rVar = new A4.r(8);
        int i9 = B3.f.b(c1902g, rVar).f674a;
        if (i9 != 1380533830 && i9 != 1380333108) {
            return false;
        }
        c1902g.t((byte[]) rVar.f384c, 0, 4, false);
        rVar.H(0);
        int i10 = rVar.i();
        if (i10 != 1463899717) {
            AbstractC1566a.t("WavHeaderReader", "Unsupported form type: " + i10);
            return false;
        }
        return true;
    }

    public static void i(int i9) {
        if (2 <= i9 && i9 < 37) {
            return;
        }
        StringBuilder p9 = A0.a.p("radix ", i9, " was not in valid range ");
        p9.append(new T7.a(2, 36, 1));
        throw new IllegalArgumentException(p9.toString());
    }

    public static byte[] j(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = i9 * 2;
                int digit = Character.digit(str.charAt(i10), 16);
                int digit2 = Character.digit(str.charAt(i10 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i9] = (byte) ((digit * 16) + digit2);
                } else {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    public static String k(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            int i9 = b9 & 255;
            sb.append("0123456789abcdef".charAt(i9 / 16));
            sb.append("0123456789abcdef".charAt(i9 % 16));
        }
        return sb.toString();
    }

    public static final boolean l(char c3, char c9, boolean z9) {
        if (c3 == c9) {
            return true;
        }
        if (!z9) {
            return false;
        }
        char upperCase = Character.toUpperCase(c3);
        char upperCase2 = Character.toUpperCase(c9);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static String m(AbstractC1037h abstractC1037h) {
        StringBuilder sb = new StringBuilder(abstractC1037h.size());
        for (int i9 = 0; i9 < abstractC1037h.size(); i9++) {
            byte b9 = abstractC1037h.b(i9);
            if (b9 != 34) {
                if (b9 != 39) {
                    if (b9 != 92) {
                        switch (b9) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case R.styleable.GradientColor_android_endX /* 10 */:
                                sb.append("\\n");
                                break;
                            case R.styleable.GradientColor_android_endY /* 11 */:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (b9 >= 32 && b9 <= 126) {
                                    sb.append((char) b9);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((b9 >>> 6) & 3) + 48));
                                    sb.append((char) (((b9 >>> 3) & 7) + 48));
                                    sb.append((char) ((b9 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static final Object n(InterfaceC0154u interfaceC0154u, String str, G7.c cVar) {
        Object c3 = interfaceC0154u.c(str, new G0.L(0), cVar);
        if (c3 == F7.a.f2587a) {
            return c3;
        }
        return A7.n.f558a;
    }

    public static String o(Context context, int i9) {
        String valueOf;
        kotlin.jvm.internal.h.e(context, "context");
        if (i9 <= 16777215) {
            return String.valueOf(i9);
        }
        try {
            valueOf = context.getResources().getResourceName(i9);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i9);
        }
        kotlin.jvm.internal.h.d(valueOf, "try {\n                  …tring()\n                }");
        return valueOf;
    }

    public static final void p(Activity activity) {
        InputMethodManager inputMethodManager;
        kotlin.jvm.internal.h.e(activity, "<this>");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
            Object systemService = activity.getSystemService("input_method");
            if (systemService instanceof InputMethodManager) {
                inputMethodManager = (InputMethodManager) systemService;
            } else {
                inputMethodManager = null;
            }
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    public static boolean q(Context context) {
        boolean z9;
        PackageManager packageManager = context.getPackageManager();
        if (f15417i == null) {
            if (Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z9 = true;
            } else {
                z9 = false;
            }
            f15417i = Boolean.valueOf(z9);
        }
        return f15417i.booleanValue();
    }

    public static boolean r(Resources resources) {
        boolean z9 = false;
        if (resources == null) {
            return false;
        }
        if (f15415g == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z9 = true;
            }
            f15415g = Boolean.valueOf(z9);
        }
        return f15415g.booleanValue();
    }

    public static boolean s(Context context) {
        Resources resources = context.getResources();
        boolean z9 = false;
        if (resources == null) {
            return false;
        }
        if (f15413e == null) {
            if ((resources.getConfiguration().screenLayout & 15) > 3 || r(resources)) {
                z9 = true;
            }
            f15413e = Boolean.valueOf(z9);
        }
        return f15413e.booleanValue();
    }

    public static boolean t(Context context) {
        boolean z9;
        PackageManager packageManager = context.getPackageManager();
        if (j == null) {
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z9 = false;
            } else {
                z9 = true;
            }
            j = Boolean.valueOf(z9);
        }
        return j.booleanValue();
    }

    public static boolean u(char c3) {
        if (!Character.isWhitespace(c3) && !Character.isSpaceChar(c3)) {
            return false;
        }
        return true;
    }

    public static final boolean v(int i9, u0.C c3) {
        kotlin.jvm.internal.h.e(c3, "<this>");
        int i10 = u0.C.j;
        Iterator it = V7.l.g0(c3, C2032c.j).iterator();
        while (it.hasNext()) {
            if (((u0.C) it.next()).f23381h == i9) {
                return true;
            }
        }
        return false;
    }

    public abstract void G();

    public abstract void H();

    public boolean d() {
        return false;
    }

    public abstract boolean e(AbstractC1845h abstractC1845h, C1840c c1840c, C1840c c1840c2);

    public abstract boolean f(AbstractC1845h abstractC1845h, Object obj, Object obj2);

    public abstract boolean g(AbstractC1845h abstractC1845h, C1844g c1844g, C1844g c1844g2);

    public abstract void w(int i9);

    public abstract void x(Typeface typeface, boolean z9);

    public abstract void y(C1844g c1844g, C1844g c1844g2);

    public abstract void z(C1844g c1844g, Thread thread);

    public void C() {
    }
}
