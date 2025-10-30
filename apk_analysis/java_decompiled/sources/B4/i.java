package B4;

import F4.v;
import F4.y;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static i f703c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f704a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f705b;

    public i(Context context) {
        this.f704a = context.getApplicationContext();
    }

    public static i a(Context context) {
        y.h(context);
        synchronized (i.class) {
            try {
                if (f703c == null) {
                    q.a(context);
                    f703c = new i(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f703c;
    }

    public static final n c(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i9 = 0; i9 < nVarArr.length; i9++) {
                if (nVarArr[i9].equals(oVar)) {
                    return nVarArr[i9];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L29
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = r1
            goto L27
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = r0
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r4 == 0) goto L48
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L48
            if (r5 == 0) goto L39
            B4.n[] r4 = B4.p.f719a
            B4.n r4 = c(r2, r4)
            goto L45
        L39:
            B4.n[] r4 = B4.p.f719a
            r4 = r4[r1]
            B4.n[] r5 = new B4.n[r0]
            r5[r1] = r4
            B4.n r4 = c(r2, r5)
        L45:
            if (r4 == 0) goto L48
            return r0
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B4.i.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    public boolean b(int i9) {
        t tVar;
        int length;
        boolean z9;
        ApplicationInfo applicationInfo;
        t tVar2;
        r rVar;
        PackageManager.NameNotFoundException nameNotFoundException;
        int i10 = 1;
        String[] packagesForUid = ((Context) this.f704a).getPackageManager().getPackagesForUid(i9);
        Exception exc = null;
        boolean z10 = false;
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            tVar = null;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    String str = packagesForUid[i11];
                    if (str == null) {
                        tVar = new t(z10, "null pkg", exc);
                    } else if (!str.equals((String) this.f705b)) {
                        m mVar = q.f720a;
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                q.c();
                                z9 = ((v) q.f722c).j1();
                            } finally {
                            }
                        } catch (O4.b | RemoteException e8) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                            z9 = z10;
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        if (z9) {
                            boolean a5 = h.a((Context) this.f704a);
                            StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                            try {
                                y.h(q.f724e);
                                try {
                                    q.c();
                                    Context context = (Context) N4.b.i1(N4.b.h1(new N4.b(q.f724e)));
                                    try {
                                        v vVar = (v) q.f722c;
                                        Parcel Q7 = vVar.Q();
                                        int i12 = V4.a.f7734a;
                                        Q7.writeInt(i10);
                                        int R2 = s8.n.R(Q7, 20293);
                                        s8.n.M(Q7, i10, str);
                                        s8.n.V(Q7, 2, 4);
                                        Q7.writeInt(a5 ? 1 : 0);
                                        s8.n.V(Q7, 3, 4);
                                        Q7.writeInt(0);
                                        s8.n.H(Q7, 4, new N4.b(context));
                                        s8.n.V(Q7, 5, 4);
                                        Q7.writeInt(0);
                                        s8.n.V(Q7, 6, 4);
                                        Q7.writeInt(1);
                                        s8.n.U(Q7, R2);
                                        Parcel g9 = vVar.g(Q7, 6);
                                        rVar = (r) V4.a.a(g9, r.CREATOR);
                                        g9.recycle();
                                    } catch (RemoteException e9) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
                                        tVar2 = new t(false, "module call", e9);
                                    }
                                } catch (O4.b e10) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                                    tVar2 = new t(false, "module init: ".concat(String.valueOf(e10.getMessage())), e10);
                                }
                                if (rVar.f725a) {
                                    AbstractC1570b.z(rVar.f728d);
                                    tVar = new t(true, null, null);
                                } else {
                                    String str2 = rVar.f726b;
                                    if (s8.e.g0(rVar.f727c) == 4) {
                                        nameNotFoundException = new PackageManager.NameNotFoundException();
                                    } else {
                                        nameNotFoundException = null;
                                    }
                                    if (str2 == null) {
                                        str2 = "error checking package certificate";
                                    }
                                    AbstractC1570b.z(rVar.f728d);
                                    s8.e.g0(rVar.f727c);
                                    tVar2 = new t(false, str2, nameNotFoundException);
                                    tVar = tVar2;
                                }
                            } finally {
                            }
                        } else {
                            try {
                                PackageInfo packageInfo = ((Context) this.f704a).getPackageManager().getPackageInfo(str, 64);
                                boolean a9 = h.a((Context) this.f704a);
                                if (packageInfo == null) {
                                    tVar = new t(false, "null pkg", null);
                                } else {
                                    Signature[] signatureArr = packageInfo.signatures;
                                    if (signatureArr != null && signatureArr.length == 1) {
                                        o oVar = new o(packageInfo.signatures[0].toByteArray());
                                        String str3 = packageInfo.packageName;
                                        StrictMode.ThreadPolicy allowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                        try {
                                            t b9 = q.b(str3, oVar, a9, false);
                                            StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                            if (b9.f731a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                StrictMode.ThreadPolicy allowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                try {
                                                    t b10 = q.b(str3, oVar, false, true);
                                                    StrictMode.setThreadPolicy(allowThreadDiskReads4);
                                                    if (b10.f731a) {
                                                        tVar = new t(false, "debuggable release cert app rejected", null);
                                                    }
                                                } finally {
                                                }
                                            }
                                            tVar = b9;
                                        } finally {
                                        }
                                    } else {
                                        tVar = new t(false, "single cert required", null);
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e11) {
                                tVar = new t(false, "no pkg ".concat(str), e11);
                            }
                        }
                        if (tVar.f731a) {
                            this.f705b = str;
                        }
                    } else {
                        tVar = t.f730d;
                    }
                    if (tVar.f731a) {
                        break;
                    }
                    i11++;
                    i10 = 1;
                    exc = null;
                    z10 = false;
                } else {
                    y.h(tVar);
                    break;
                }
            }
        } else {
            tVar = new t(false, "no pkgs", null);
        }
        if (!tVar.f731a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Exception exc2 = tVar.f733c;
            if (exc2 != null) {
                Log.d("GoogleCertificatesRslt", tVar.a(), exc2);
            } else {
                Log.d("GoogleCertificatesRslt", tVar.a());
            }
        }
        return tVar.f731a;
    }

    public i() {
        this.f704a = new CopyOnWriteArraySet();
    }
}
