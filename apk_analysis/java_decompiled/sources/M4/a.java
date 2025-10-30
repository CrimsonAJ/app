package M4;

import B.j;
import B6.u0;
import B7.m;
import D1.g;
import W7.k;
import W7.l;
import Y2.r;
import a8.EnumC0509a;
import a8.e;
import a8.i;
import a8.p;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.widget.EdgeEffect;
import android.widget.EditText;
import b7.C0699a;
import com.anilab.android.ui.player.PlayerActivity;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import i0.AbstractActivityC1369y;
import i0.AbstractComponentCallbacksC1366v;
import i8.A;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import k3.C1487c;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.h;
import s6.C1961a;
import s6.C1962b;
import z2.C2235a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f4781a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f4782b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4783c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4784d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4785e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f4786f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f4787g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f4788h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f4789i = 0;

    public a() {
        new ConcurrentHashMap();
    }

    public static long A(String str) {
        int i9;
        char c3;
        int length = str.length();
        h.e(str, "<this>");
        if (length >= 0) {
            if (length <= str.length()) {
                long j = 0;
                int i10 = 0;
                while (i10 < length) {
                    char charAt = str.charAt(i10);
                    if (charAt < 128) {
                        j++;
                    } else {
                        if (charAt < 2048) {
                            i9 = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i11 = i10 + 1;
                            if (i11 < length) {
                                c3 = str.charAt(i11);
                            } else {
                                c3 = 0;
                            }
                            if (charAt <= 56319 && c3 >= 56320 && c3 <= 57343) {
                                j += 4;
                                i10 += 2;
                            } else {
                                j++;
                                i10 = i11;
                            }
                        } else {
                            i9 = 3;
                        }
                        j += i9;
                    }
                    i10++;
                }
                return j;
            }
            StringBuilder p9 = A0.a.p("endIndex > string.length: ", length, " > ");
            p9.append(str.length());
            throw new IllegalArgumentException(p9.toString().toString());
        }
        throw new IllegalArgumentException(A0.a.l("endIndex < beginIndex: ", length, 0, " < ").toString());
    }

    public static Intent B(PackageManager packageManager, String telegramLink) {
        Intent intent;
        h.e(telegramLink, "telegramLink");
        try {
            try {
                try {
                    h.b(packageManager);
                    q(packageManager, "org.telegram.messenger");
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(telegramLink));
                    intent2.setPackage("org.telegram.messenger");
                    return intent2;
                } catch (Exception unused) {
                    intent = null;
                    return intent;
                }
            } catch (Exception unused2) {
                h.b(packageManager);
                q(packageManager, "org.thunderdog.challegram");
                Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(telegramLink));
                intent3.setPackage("org.telegram.messenger");
                return intent3;
            }
        } catch (Exception unused3) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(telegramLink));
            return intent;
        }
    }

    public static e a(int i9, int i10, EnumC0509a enumC0509a) {
        int i11 = i10 & 2;
        EnumC0509a enumC0509a2 = EnumC0509a.f9184a;
        if (i11 != 0) {
            enumC0509a = enumC0509a2;
        }
        if (i9 != -2) {
            if (i9 != -1) {
                if (i9 != 0) {
                    if (i9 != Integer.MAX_VALUE) {
                        if (enumC0509a == enumC0509a2) {
                            return new e(i9);
                        }
                        return new p(i9, enumC0509a);
                    }
                    return new e(Integer.MAX_VALUE);
                }
                if (enumC0509a == enumC0509a2) {
                    return new e(0);
                }
                return new p(1, enumC0509a);
            }
            if (enumC0509a == enumC0509a2) {
                return new p(1, EnumC0509a.f9185b);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (enumC0509a == enumC0509a2) {
            i.f9227M.getClass();
            return new e(a8.h.f9226b);
        }
        return new p(1, enumC0509a);
    }

    public static final double b(int i9, int i10, int i11, int i12, g gVar) {
        double d9 = i11 / i9;
        double d10 = i12 / i10;
        int ordinal = gVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Math.min(d9, d10);
            }
            throw new RuntimeException();
        }
        return Math.max(d9, d10);
    }

    public static C1962b c(String str, String str2) {
        C0699a c0699a = new C0699a(str, str2);
        C1961a a5 = C1962b.a(C0699a.class);
        a5.f22744e = 1;
        a5.f22745f = new C1487c(c0699a);
        return a5.b();
    }

    public static final r i(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, d dVar, O7.a aVar, O7.a aVar2, O7.a aVar3) {
        h.e(abstractComponentCallbacksC1366v, "<this>");
        return new r(dVar, aVar, aVar3, aVar2);
    }

    public static final int j(Context context, int i9) {
        return (int) TypedValue.applyDimension(1, i9, context.getResources().getDisplayMetrics());
    }

    public static long k(String str) {
        int i9;
        Object obj;
        if (!W7.d.U(str)) {
            List b02 = W7.d.b0(str, new String[]{":"});
            ArrayList arrayList = new ArrayList(m.f0(b02, 10));
            Iterator it = b02.iterator();
            while (true) {
                int i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Integer E8 = k.E((String) it.next());
                if (E8 != null) {
                    i10 = E8.intValue();
                }
                arrayList.add(Integer.valueOf(i10));
            }
            int size = arrayList.size();
            if (2 <= size && size < 4) {
                if (arrayList.size() == 3) {
                    i9 = ((Number) arrayList.get(0)).intValue();
                } else {
                    i9 = 0;
                }
                if (arrayList.size() == 3) {
                    obj = arrayList.get(1);
                } else {
                    obj = arrayList.get(0);
                }
                return ((((Number) obj).intValue() * 60) + (i9 * 3600) + ((Number) B7.k.v0(arrayList)).intValue()) * 1000;
            }
            return 0L;
        }
        return 0L;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static C1962b n(String str, k8.a aVar) {
        C1961a a5 = C1962b.a(C0699a.class);
        a5.f22744e = 1;
        a5.a(s6.h.a(Context.class));
        a5.f22745f = new N1.h(str, 3, aVar);
        return a5.b();
    }

    public static A o(String str) {
        h.e(str, "<this>");
        Matcher matcher = A.f18925d.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            h.d(group, "typeSubtype.group(1)");
            Locale US = Locale.US;
            h.d(US, "US");
            String lowerCase = group.toLowerCase(US);
            h.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            h.d(group2, "typeSubtype.group(2)");
            h.d(group2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = A.f18926e.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group3 = matcher2.group(1);
                    if (group3 == null) {
                        end = matcher2.end();
                    } else {
                        String group4 = matcher2.group(2);
                        if (group4 == null) {
                            group4 = matcher2.group(3);
                        } else if (l.L(group4, "'", false) && l.G(group4, "'", false) && group4.length() > 2) {
                            group4 = group4.substring(1, group4.length() - 1);
                            h.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        arrayList.add(group3);
                        arrayList.add(group4);
                        end = matcher2.end();
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    h.d(substring, "this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    sb.append("\" for: \"");
                    throw new IllegalArgumentException(AbstractC0953k1.p(sb, str, '\"').toString());
                }
            }
            return new A(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
        }
        throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
    }

    public static float p(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return S.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void q(PackageManager packageManager, String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            Q.d.a(packageManager, str, Q.d.b());
        } else {
            packageManager.getPackageInfo(str, 0);
        }
    }

    public static SharedPreferences r(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static Intent s(AbstractActivityC1369y abstractActivityC1369y, long j, String animeName, long j4, String poster, int i9, List allNames) {
        h.e(animeName, "animeName");
        h.e(poster, "poster");
        h.e(allNames, "allNames");
        Intent intent = new Intent(abstractActivityC1369y, (Class<?>) PlayerActivity.class);
        intent.putExtra("extra_id", j);
        intent.putExtra("extra_name", animeName);
        intent.putExtra("extra_poster", poster);
        intent.putExtra("extra_episode_id", j4);
        intent.putExtra("extra_year", i9);
        intent.putStringArrayListExtra("extra_al_names", new ArrayList<>(allNames));
        return intent;
    }

    public static boolean t(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }

    public static synchronized boolean u(Context context) {
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f4781a;
            if (context2 != null && (bool = f4782b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f4782b = null;
            if (K4.b.d()) {
                f4782b = Boolean.valueOf(B4.e.z(applicationContext.getPackageManager()));
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f4782b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f4782b = Boolean.FALSE;
                }
            }
            f4781a = applicationContext;
            return f4782b.booleanValue();
        }
    }

    public static float v(EdgeEffect edgeEffect, float f9, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return S.c.c(edgeEffect, f9, f10);
        }
        S.b.a(edgeEffect, f9, f10);
        return f9;
    }

    public static final List w(P0.c cVar) {
        int m9 = u0.m(cVar, "id");
        int m10 = u0.m(cVar, "seq");
        int m11 = u0.m(cVar, "from");
        int m12 = u0.m(cVar, "to");
        C7.c cVar2 = new C7.c(10);
        while (cVar.W()) {
            cVar2.add(new M0.a(cVar.i(m11), (int) cVar.H(m9), (int) cVar.H(m10), cVar.i(m12)));
        }
        return B7.k.B0(u0.e(cVar2));
    }

    public static final M0.d x(P0.a aVar, String str, boolean z9) {
        String str2;
        P0.c d02 = aVar.d0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int m9 = u0.m(d02, "seqno");
            int m10 = u0.m(d02, "cid");
            int m11 = u0.m(d02, "name");
            int m12 = u0.m(d02, "desc");
            if (m9 != -1 && m10 != -1 && m11 != -1 && m12 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (d02.W()) {
                    if (((int) d02.H(m10)) >= 0) {
                        int H8 = (int) d02.H(m9);
                        String i9 = d02.i(m11);
                        if (d02.H(m12) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        linkedHashMap.put(Integer.valueOf(H8), i9);
                        linkedHashMap2.put(Integer.valueOf(H8), str2);
                    }
                }
                List C02 = B7.k.C0(linkedHashMap.entrySet(), new j(6));
                ArrayList arrayList = new ArrayList(m.f0(C02, 10));
                Iterator it = C02.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List H02 = B7.k.H0(arrayList);
                List C03 = B7.k.C0(linkedHashMap2.entrySet(), new j(7));
                ArrayList arrayList2 = new ArrayList(m.f0(C03, 10));
                Iterator it2 = C03.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                M0.d dVar = new M0.d(str, z9, H02, B7.k.H0(arrayList2));
                AbstractC1002u1.k(d02, null);
                return dVar;
            }
            AbstractC1002u1.k(d02, null);
            return null;
        } finally {
        }
    }

    public static long y(A4.r rVar, int i9, int i10) {
        rVar.H(i9);
        if (rVar.e() < 5) {
            return -9223372036854775807L;
        }
        int i11 = rVar.i();
        if ((8388608 & i11) != 0 || ((2096896 & i11) >> 8) != i10 || (i11 & 32) == 0 || rVar.x() < 7 || rVar.e() < 7 || (rVar.x() & 16) != 16) {
            return -9223372036854775807L;
        }
        rVar.h(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((255 & r0[4]) >> 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static A7.h z(java.util.List r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L2b
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L3e
            r2 = 2
            if (r1 >= r2) goto Lb
            goto L2b
        Lb:
            r1 = 0
            java.lang.Object r1 = r7.get(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3e
            long r1 = k(r1)     // Catch: java.lang.Throwable -> L3e
            r3 = 1
            java.lang.Object r7 = r7.get(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L3e
            long r3 = k(r7)     // Catch: java.lang.Throwable -> L3e
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L2d
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L2d
        L2b:
            r2 = r0
            goto L44
        L2d:
            if (r7 != 0) goto L30
            goto L2b
        L30:
            java.lang.Long r7 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L3e
            A7.h r2 = new A7.h     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r7, r1)     // Catch: java.lang.Throwable -> L3e
            goto L44
        L3e:
            r7 = move-exception
            A7.i r7 = a.AbstractC0485a.h(r7)
            goto L45
        L44:
            r7 = r2
        L45:
            boolean r1 = r7 instanceof A7.i
            if (r1 == 0) goto L4a
            goto L4b
        L4a:
            r0 = r7
        L4b:
            A7.h r0 = (A7.h) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.a.z(java.util.List):A7.h");
    }

    public abstract Typeface d(Context context, G.e eVar, Resources resources, int i9);

    public abstract Typeface e(Context context, M.i[] iVarArr, int i9);

    public Typeface f(Context context, List list, int i9) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface g(Context context, InputStream inputStream) {
        File x5 = O4.h.x(context);
        if (x5 == null) {
            return null;
        }
        try {
            if (!O4.h.o(x5, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(x5.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            x5.delete();
        }
    }

    public Typeface h(Context context, Resources resources, int i9, String str, int i10) {
        File x5 = O4.h.x(context);
        if (x5 == null) {
            return null;
        }
        try {
            if (!O4.h.n(x5, resources, i9)) {
                return null;
            }
            return Typeface.createFromFile(x5.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            x5.delete();
        }
    }

    public M.i m(M.i[] iVarArr, int i9) {
        int i10;
        boolean z9;
        int i11;
        new C2235a(6);
        if ((i9 & 1) == 0) {
            i10 = 400;
        } else {
            i10 = 700;
        }
        if ((i9 & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        M.i iVar = null;
        int i12 = Integer.MAX_VALUE;
        for (M.i iVar2 : iVarArr) {
            int abs = Math.abs(iVar2.f4671c - i10) * 2;
            if (iVar2.f4672d == z9) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int i13 = abs + i11;
            if (iVar == null || i12 > i13) {
                iVar = iVar2;
                i12 = i13;
            }
        }
        return iVar;
    }
}
