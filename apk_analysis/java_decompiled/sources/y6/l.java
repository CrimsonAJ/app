package y6;

import B6.B;
import B6.C0033l0;
import B6.C0035m0;
import B6.C0037n0;
import B6.C0039o0;
import B6.J;
import B6.K;
import B6.O0;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import f5.AbstractC1178j;
import f5.C1177i;
import f5.C1181m;
import f5.C1185q;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import k4.C1499E;
import p.c1;
import u0.z;
import u6.C2082a;
import v6.C2110a;
import v6.C2112c;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: r, reason: collision with root package name */
    public static final E6.b f25060r = new E6.b(3);

    /* renamed from: s, reason: collision with root package name */
    public static final Charset f25061s = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f25062a;

    /* renamed from: b, reason: collision with root package name */
    public final D4.v f25063b;

    /* renamed from: c, reason: collision with root package name */
    public final C1499E f25064c;

    /* renamed from: d, reason: collision with root package name */
    public final E6.e f25065d;

    /* renamed from: e, reason: collision with root package name */
    public final z6.d f25066e;

    /* renamed from: f, reason: collision with root package name */
    public final u f25067f;

    /* renamed from: g, reason: collision with root package name */
    public final E6.e f25068g;

    /* renamed from: h, reason: collision with root package name */
    public final C2218a f25069h;

    /* renamed from: i, reason: collision with root package name */
    public final A6.f f25070i;
    public final C2110a j;

    /* renamed from: k, reason: collision with root package name */
    public final C2082a f25071k;

    /* renamed from: l, reason: collision with root package name */
    public final i f25072l;

    /* renamed from: m, reason: collision with root package name */
    public final c1 f25073m;

    /* renamed from: n, reason: collision with root package name */
    public r f25074n;

    /* renamed from: o, reason: collision with root package name */
    public final C1177i f25075o = new C1177i();

    /* renamed from: p, reason: collision with root package name */
    public final C1177i f25076p = new C1177i();

    /* renamed from: q, reason: collision with root package name */
    public final C1177i f25077q = new C1177i();

    public l(Context context, u uVar, D4.v vVar, E6.e eVar, C1499E c1499e, C2218a c2218a, E6.e eVar2, A6.f fVar, c1 c1Var, C2110a c2110a, C2082a c2082a, i iVar, z6.d dVar) {
        new AtomicBoolean(false);
        this.f25062a = context;
        this.f25067f = uVar;
        this.f25063b = vVar;
        this.f25068g = eVar;
        this.f25064c = c1499e;
        this.f25069h = c2218a;
        this.f25065d = eVar2;
        this.f25070i = fVar;
        this.j = c2110a;
        this.f25071k = c2082a;
        this.f25072l = iVar;
        this.f25073m = c1Var;
        this.f25066e = dVar;
    }

    public static C1185q a(l lVar) {
        C1185q e8;
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : E6.e.e(((File) lVar.f25068g.f1969c).listFiles(f25060r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    e8 = s8.n.p(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    e8 = s8.n.e(new ScheduledThreadPoolExecutor(1), new k(lVar, parseLong));
                }
                arrayList.add(e8);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return s8.n.C(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04cf A[LOOP:2: B:74:0x04cf->B:80:0x04ec, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0506  */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29, types: [int] */
    /* JADX WARN: Type inference failed for: r12v49, types: [java.lang.Object, B6.O] */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r33v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6, types: [B6.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [B6.C, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r33, G6.e r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.l.b(boolean, G6.e, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, B6.M] */
    /* JADX WARN: Type inference failed for: r13v7, types: [B6.I, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, B6.i0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [B6.A, java.lang.Object] */
    public final void c(String str, Boolean bool) {
        int i9;
        String str2;
        String str3;
        String str4;
        int i10;
        Integer num;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String e8 = z.e("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", e8, null);
        }
        Locale locale = Locale.US;
        u uVar = this.f25067f;
        C2218a c2218a = this.f25069h;
        String str5 = uVar.f25120c;
        String str6 = c2218a.f25027f;
        String str7 = uVar.c().f25033a;
        if (c2218a.f25025d != null) {
            i9 = 4;
        } else {
            i9 = 1;
        }
        C0035m0 c0035m0 = new C0035m0(str5, str6, c2218a.f25028g, str7, z.a(i9), c2218a.f25029h);
        String str8 = Build.VERSION.RELEASE;
        String str9 = Build.VERSION.CODENAME;
        C0039o0 c0039o0 = new C0039o0(g.g());
        Context context = this.f25062a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        f fVar = f.f25042a;
        String str10 = Build.CPU_ABI;
        boolean isEmpty = TextUtils.isEmpty(str10);
        f fVar2 = f.f25042a;
        if (isEmpty) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            f fVar3 = (f) f.f25043b.get(str10.toLowerCase(locale));
            if (fVar3 != null) {
                fVar2 = fVar3;
            }
        }
        int ordinal = fVar2.ordinal();
        String str11 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a5 = g.a(context);
        boolean f9 = g.f();
        int c3 = g.c();
        String str12 = Build.MANUFACTURER;
        String str13 = Build.PRODUCT;
        this.j.d(str, currentTimeMillis, new C0033l0(c0035m0, c0039o0, new C0037n0(ordinal, availableProcessors, a5, blockCount, f9, c3)));
        if (bool.booleanValue() && str != null) {
            E6.e eVar = this.f25065d;
            synchronized (((String) eVar.f1967a)) {
                eVar.f1967a = str;
                str4 = str13;
                str2 = str9;
                str3 = str12;
                i10 = 4;
                ((z6.d) eVar.f1969c).f25506b.a(new A6.q(eVar, str, ((A6.e) ((AtomicMarkableReference) ((A6.t) eVar.f1970d).f540b).getReference()).a(), ((A6.p) eVar.f1972f).a(), 0));
            }
        } else {
            str2 = str9;
            str3 = str12;
            str4 = str13;
            i10 = 4;
        }
        A6.f fVar4 = this.f25070i;
        ((A6.d) fVar4.f505b).b();
        fVar4.f505b = A6.f.f503c;
        if (str != null) {
            fVar4.f505b = new A6.n(((E6.e) fVar4.f504a).b(str, "userlog"));
        }
        this.f25072l.a(str);
        c1 c1Var = this.f25073m;
        q qVar = (q) c1Var.f21976a;
        Charset charset = O0.f841a;
        ?? obj = new Object();
        obj.f737a = "19.4.4";
        C2218a c2218a2 = qVar.f25104c;
        String str14 = c2218a2.f25022a;
        if (str14 != null) {
            obj.f738b = str14;
            u uVar2 = qVar.f25103b;
            String str15 = uVar2.c().f25033a;
            if (str15 != null) {
                obj.f740d = str15;
                obj.f741e = uVar2.c().f25034b;
                obj.f742f = uVar2.c().f25035c;
                String str16 = c2218a2.f25027f;
                if (str16 != null) {
                    obj.f744h = str16;
                    String str17 = c2218a2.f25028g;
                    if (str17 != null) {
                        obj.f745i = str17;
                        obj.f739c = i10;
                        obj.f748m = (byte) (obj.f748m | 1);
                        ?? obj2 = new Object();
                        obj2.f792f = false;
                        byte b9 = (byte) (obj2.f798m | 2);
                        obj2.f790d = currentTimeMillis;
                        obj2.f798m = (byte) (b9 | 1);
                        if (str != null) {
                            obj2.f788b = str;
                            String str18 = q.f25101g;
                            if (str18 != null) {
                                obj2.f787a = str18;
                                String str19 = uVar2.f25120c;
                                if (str19 != null) {
                                    String str20 = uVar2.c().f25033a;
                                    C1499E c1499e = c2218a2.f25029h;
                                    if (((R3.u) c1499e.f19986c) == null) {
                                        c1499e.f19986c = new R3.u(c1499e);
                                    }
                                    R3.u uVar3 = (R3.u) c1499e.f19986c;
                                    String str21 = uVar3.f6657b;
                                    if (uVar3 == null) {
                                        c1499e.f19986c = new R3.u(c1499e);
                                    }
                                    obj2.f793g = new K(str19, str16, str17, str20, str21, ((R3.u) c1499e.f19986c).f6658c);
                                    ?? obj3 = new Object();
                                    obj3.f973a = 3;
                                    obj3.f977e = (byte) (obj3.f977e | 1);
                                    if (str8 != null) {
                                        obj3.f974b = str8;
                                        String str22 = str2;
                                        if (str22 != null) {
                                            obj3.f975c = str22;
                                            obj3.f976d = g.g();
                                            obj3.f977e = (byte) (obj3.f977e | 2);
                                            obj2.f795i = obj3.a();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i11 = 7;
                                            if (!TextUtils.isEmpty(str10) && (num = (Integer) q.f25100f.get(str10.toLowerCase(locale))) != null) {
                                                i11 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long a9 = g.a(qVar.f25102a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean f10 = g.f();
                                            int c9 = g.c();
                                            ?? obj4 = new Object();
                                            obj4.f816a = i11;
                                            byte b10 = (byte) (obj4.j | 1);
                                            obj4.j = b10;
                                            if (str11 != null) {
                                                obj4.f817b = str11;
                                                obj4.f818c = availableProcessors2;
                                                obj4.f819d = a9;
                                                obj4.f820e = blockCount2;
                                                obj4.f821f = f10;
                                                obj4.f822g = c9;
                                                obj4.j = (byte) (((byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16)) | 32);
                                                String str23 = str3;
                                                if (str23 != null) {
                                                    obj4.f823h = str23;
                                                    String str24 = str4;
                                                    if (str24 != null) {
                                                        obj4.f824i = str24;
                                                        obj2.j = obj4.a();
                                                        obj2.f797l = 3;
                                                        obj2.f798m = (byte) (obj2.f798m | 4);
                                                        obj.j = obj2.a();
                                                        B a10 = obj.a();
                                                        E6.e eVar2 = ((E6.c) c1Var.f21977b).f1963b;
                                                        J j = a10.f757k;
                                                        if (j == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str25 = j.f800b;
                                                        try {
                                                            E6.c.f1959g.getClass();
                                                            E6.c.f(eVar2.b(str25, "report"), C6.b.f1615a.u(a10));
                                                            File b11 = eVar2.b(str25, "start-time");
                                                            long j4 = j.f802d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b11), E6.c.f1957e);
                                                            try {
                                                                outputStreamWriter.write("");
                                                                b11.setLastModified(j4 * 1000);
                                                                outputStreamWriter.close();
                                                            } finally {
                                                            }
                                                        } catch (IOException e9) {
                                                            String e10 = z.e("Could not persist report for session ", str25);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", e10, e9);
                                                            }
                                                        }
                                                    } else {
                                                        throw new NullPointerException("Null modelClass");
                                                    }
                                                } else {
                                                    throw new NullPointerException("Null manufacturer");
                                                }
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        } else {
                                            throw new NullPointerException("Null buildVersion");
                                        }
                                    } else {
                                        throw new NullPointerException("Null version");
                                    }
                                } else {
                                    throw new NullPointerException("Null identifier");
                                }
                            } else {
                                throw new NullPointerException("Null generator");
                            }
                        } else {
                            throw new NullPointerException("Null identifier");
                        }
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                } else {
                    throw new NullPointerException("Null buildVersion");
                }
            } else {
                throw new NullPointerException("Null installationUuid");
            }
        } else {
            throw new NullPointerException("Null gmpAppId");
        }
    }

    public final boolean d(G6.e eVar) {
        boolean z9;
        z6.d.a();
        r rVar = this.f25074n;
        if (rVar != null && rVar.f25111e.get()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, eVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e8) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e8);
            return false;
        }
    }

    public final String e() {
        NavigableSet c3 = ((E6.c) this.f25073m.f21977b).c();
        if (!c3.isEmpty()) {
            return (String) c3.first();
        }
        return null;
    }

    public final String f() {
        String string;
        InputStream resourceAsStream;
        Context context = this.f25062a;
        int d9 = g.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        if (d9 == 0) {
            string = null;
        } else {
            string = context.getResources().getString(d9);
        }
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f25061s), 0);
        }
        ClassLoader classLoader = l.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream != null) {
            try {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Read version control info from file", null);
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = resourceAsStream.read(bArr);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            String encodeToString = Base64.encodeToString(byteArray, 0);
                            resourceAsStream.close();
                            return encodeToString;
                        }
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
    }

    public final void g() {
        boolean z9;
        try {
            String f9 = f();
            if (f9 != null) {
                try {
                    ((A6.t) this.f25065d.f1971e).l("com.crashlytics.version-control-info", f9);
                } catch (IllegalArgumentException e8) {
                    Context context = this.f25062a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            throw e8;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e9) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e9);
        }
    }

    public final void h(C1185q c1185q) {
        C1185q c1185q2;
        C1185q a5;
        E6.e eVar = ((E6.c) this.f25073m.f21977b).f1963b;
        boolean isEmpty = E6.e.e(((File) eVar.f1971e).listFiles()).isEmpty();
        C1177i c1177i = this.f25075o;
        if (isEmpty && E6.e.e(((File) eVar.f1972f).listFiles()).isEmpty() && E6.e.e(((File) eVar.f1973g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            c1177i.d(Boolean.FALSE);
            return;
        }
        C2112c c2112c = C2112c.f23900a;
        c2112c.f("Crash reports are available to be sent.");
        D4.v vVar = this.f25063b;
        if (vVar.b()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            c1177i.d(Boolean.FALSE);
            a5 = s8.n.p(Boolean.TRUE);
        } else {
            c2112c.c("Automatic data collection is disabled.");
            c2112c.f("Notifying that unsent reports are available.");
            c1177i.d(Boolean.TRUE);
            synchronized (vVar.f1897c) {
                c1185q2 = ((C1177i) vVar.f1898d).f17413a;
            }
            e0.c cVar = new e0.c(16);
            c1185q2.getClass();
            D4.q qVar = AbstractC1178j.f17414a;
            C1185q c1185q3 = new C1185q();
            c1185q2.f17436b.f(new C1181m(qVar, cVar, c1185q3));
            c1185q2.s();
            c2112c.c("Waiting for send/deleteUnsentReports to be called.");
            a5 = z6.a.a(c1185q3, this.f25076p.f17413a);
        }
        a5.m(this.f25066e.f25505a, new C1499E(this, c1185q, 23, false));
    }
}
