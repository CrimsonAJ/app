package d7;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import c7.C0787g;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l6.C1574f;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f16928s = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f16929t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f16930a;

    /* renamed from: c, reason: collision with root package name */
    public int f16932c;

    /* renamed from: f, reason: collision with root package name */
    public HttpURLConnection f16935f;

    /* renamed from: g, reason: collision with root package name */
    public D0.b f16936g;

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f16937h;

    /* renamed from: i, reason: collision with root package name */
    public final i f16938i;
    public final C1574f j;

    /* renamed from: k, reason: collision with root package name */
    public final T6.e f16939k;

    /* renamed from: l, reason: collision with root package name */
    public final d f16940l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f16941m;

    /* renamed from: q, reason: collision with root package name */
    public final m f16945q;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16931b = false;

    /* renamed from: o, reason: collision with root package name */
    public final Random f16943o = new Random();

    /* renamed from: p, reason: collision with root package name */
    public final K4.a f16944p = K4.a.f4292a;

    /* renamed from: n, reason: collision with root package name */
    public final String f16942n = "firebase";

    /* renamed from: d, reason: collision with root package name */
    public boolean f16933d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16934e = false;

    /* renamed from: r, reason: collision with root package name */
    public final Object f16946r = new Object();

    public k(C1574f c1574f, T6.e eVar, i iVar, d dVar, Context context, LinkedHashSet linkedHashSet, m mVar, ScheduledExecutorService scheduledExecutorService) {
        this.f16930a = linkedHashSet;
        this.f16937h = scheduledExecutorService;
        this.f16932c = Math.max(8 - mVar.c().f16947a, 1);
        this.j = c1574f;
        this.f16938i = iVar;
        this.f16939k = eVar;
        this.f16940l = dVar;
        this.f16941m = context;
        this.f16945q = mVar;
    }

    public static boolean d(int i9) {
        if (i9 != 408 && i9 != 429 && i9 != 502 && i9 != 503 && i9 != 504) {
            return false;
        }
        return true;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized boolean a() {
        boolean z9;
        if (!this.f16930a.isEmpty() && !this.f16931b && !this.f16933d) {
            if (!this.f16934e) {
                z9 = true;
            }
        }
        z9 = false;
        return z9;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f16935f;
        if (httpURLConnection != null && !this.f16934e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e8) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e8);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e9) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e9);
            }
        }
    }

    public final String c(String str) {
        String str2;
        C1574f c1574f = this.j;
        c1574f.a();
        Matcher matcher = f16929t.matcher(c1574f.f20589c.f20602b);
        if (matcher.matches()) {
            str2 = matcher.group(1);
        } else {
            str2 = null;
        }
        return "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/" + str2 + "/namespaces/" + str + ":streamFetchInvalidations";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [c7.g, l6.h] */
    public final synchronized void e(long j) {
        try {
            if (!a()) {
                return;
            }
            int i9 = this.f16932c;
            if (i9 > 0) {
                this.f16932c = i9 - 1;
                this.f16937h.schedule(new A4.e(20, this), j, TimeUnit.MILLISECONDS);
            } else if (!this.f16934e) {
                g(new l6.h("Unable to connect to the server. Check your connection and try again."));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(C0787g c0787g) {
        Iterator it = this.f16930a.iterator();
        while (it.hasNext()) {
            ((I1.c) it.next()).a(c0787g);
        }
    }

    public final synchronized void h() {
        this.f16932c = 8;
    }

    public final synchronized void i() {
        this.f16944p.getClass();
        e(Math.max(0L, this.f16945q.c().f16948b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final synchronized void j(boolean z9) {
        this.f16931b = z9;
    }

    public final void k(boolean z9) {
        HttpURLConnection httpURLConnection;
        synchronized (this.f16946r) {
            try {
                this.f16934e = z9;
                D0.b bVar = this.f16936g;
                if (bVar != null) {
                    bVar.f1737a = z9;
                }
                if (Build.VERSION.SDK_INT >= 26 && z9 && (httpURLConnection = this.f16935f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            l6.f r9 = r6.j
            r9.a()
            l6.i r0 = r9.f20589c
            java.lang.String r1 = r0.f20601a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.f16941m
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r4 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            byte[] r5 = K4.b.c(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            if (r5 != 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            android.util.Log.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
        L45:
            r1 = r4
            goto L62
        L47:
            java.lang.String r1 = K4.b.a(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            goto L62
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r2, r1)
            goto L45
        L62:
            java.lang.String r2 = "X-Android-Cert"
            r7.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Google-GFE-Can-Retry"
            java.lang.String r2 = "yes"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "X-Accept-Response-Streaming"
            java.lang.String r2 = "true"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept"
            r7.setRequestProperty(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.a()
            java.lang.String r2 = r0.f20602b
            java.util.regex.Pattern r3 = d7.k.f16929t
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L9c
            r3 = 1
            java.lang.String r4 = r2.group(r3)
        L9c:
            java.lang.String r2 = "project"
            r1.put(r2, r4)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.f16942n
            r1.put(r2, r3)
            d7.i r2 = r6.f16938i
            d7.m r2 = r2.f16922g
            android.content.SharedPreferences r2 = r2.f16951a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.a()
            java.lang.String r9 = "appId"
            java.lang.String r0 = r0.f20602b
            r1.put(r9, r0)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "22.1.2"
            r1.put(r9, r0)
            java.lang.String r9 = "appInstanceId"
            r1.put(r9, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream
            java.io.OutputStream r7 = r7.getOutputStream()
            r9.<init>(r7)
            r9.write(r8)
            r9.flush()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.k.l(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized D0.b m(HttpURLConnection httpURLConnection) {
        return new D0.b(httpURLConnection, this.f16938i, this.f16940l, this.f16930a, new I1.c(1, this), this.f16937h);
    }

    public final void n(Date date) {
        m mVar = this.f16945q;
        int i9 = mVar.c().f16947a + 1;
        int i10 = 8;
        if (i9 < 8) {
            i10 = i9;
        }
        mVar.f(i9, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f16928s[i10 - 1]) / 2) + this.f16943o.nextInt((int) r2)));
    }
}
