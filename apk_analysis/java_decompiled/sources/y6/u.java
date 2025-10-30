package y6;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;
import v6.C2112c;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f25116g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    public static final String f25117h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    public final O5.g f25118a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f25119b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25120c;

    /* renamed from: d, reason: collision with root package name */
    public final T6.e f25121d;

    /* renamed from: e, reason: collision with root package name */
    public final D4.v f25122e;

    /* renamed from: f, reason: collision with root package name */
    public c f25123f;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, O5.g] */
    public u(Context context, String str, T6.e eVar, D4.v vVar) {
        if (context != null) {
            if (str != null) {
                this.f25119b = context;
                this.f25120c = str;
                this.f25121d = eVar;
                this.f25122e = vVar;
                this.f25118a = new Object();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f25116g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(1:5))|6|(7:18|19|9|10|11|12|13)|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y6.t b(boolean r9) {
        /*
            r8 = this;
            z6.c r2 = z6.d.f25504d
            G0.D r0 = new G0.D
            java.lang.Class<z6.c> r3 = z6.c.class
            java.lang.String r4 = "isNotMainThread"
            r1 = 0
            java.lang.String r5 = "isNotMainThread()Z"
            r6 = 0
            r7 = 5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            if (r0 != 0) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Must not be called on a main thread, was called on "
            r0.<init>(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L44
            android.util.Log.d(r2, r0, r1)
        L44:
            r3 = 10000(0x2710, double:4.9407E-320)
            T6.e r5 = r8.f25121d
            if (r9 == 0) goto L63
            r9 = r5
            T6.d r9 = (T6.d) r9     // Catch: java.lang.Exception -> L5c
            f5.q r9 = r9.e()     // Catch: java.lang.Exception -> L5c
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L5c
            java.lang.Object r9 = s8.n.c(r9, r3, r0)     // Catch: java.lang.Exception -> L5c
            T6.a r9 = (T6.a) r9     // Catch: java.lang.Exception -> L5c
            java.lang.String r9 = r9.f7209a     // Catch: java.lang.Exception -> L5c
            goto L64
        L5c:
            r0 = move-exception
            r9 = r0
            java.lang.String r0 = "Error getting Firebase authentication token."
            android.util.Log.w(r2, r0, r9)
        L63:
            r9 = r1
        L64:
            T6.d r5 = (T6.d) r5     // Catch: java.lang.Exception -> L74
            f5.q r0 = r5.d()     // Catch: java.lang.Exception -> L74
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L74
            java.lang.Object r0 = s8.n.c(r0, r3, r5)     // Catch: java.lang.Exception -> L74
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L74
            r1 = r0
            goto L7a
        L74:
            r0 = move-exception
            java.lang.String r3 = "Error getting Firebase installation id."
            android.util.Log.w(r2, r3, r0)
        L7a:
            y6.t r0 = new y6.t
            r0.<init>(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.u.b(boolean):y6.t");
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f25123f;
        if (cVar != null && (cVar.f25034b != null || !this.f25122e.b())) {
            return this.f25123f;
        }
        C2112c c2112c = C2112c.f23900a;
        c2112c.f("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f25119b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        c2112c.f("Cached Firebase Installation ID: " + string);
        if (this.f25122e.b()) {
            t b9 = b(false);
            c2112c.f("Fetched Firebase Installation ID: " + b9.f25114a);
            if (b9.f25114a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b9 = new t(str, null);
            }
            if (Objects.equals(b9.f25114a, string)) {
                this.f25123f = new c(sharedPreferences.getString("crashlytics.installation.id", null), b9.f25114a, b9.f25115b);
            } else {
                this.f25123f = new c(a(sharedPreferences, b9.f25114a), b9.f25114a, b9.f25115b);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f25123f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        } else {
            this.f25123f = new c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        }
        c2112c.f("Install IDs: " + this.f25123f);
        return this.f25123f;
    }

    public final String d() {
        String str;
        O5.g gVar = this.f25118a;
        Context context = this.f25119b;
        synchronized (gVar) {
            try {
                if (gVar.f5494a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    gVar.f5494a = installerPackageName;
                }
                if ("".equals(gVar.f5494a)) {
                    str = null;
                } else {
                    str = gVar.f5494a;
                }
            } finally {
            }
        }
        return str;
    }
}
