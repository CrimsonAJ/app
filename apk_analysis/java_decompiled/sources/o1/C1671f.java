package o1;

import B7.u;
import B7.y;
import F0.B0;
import F0.C0099c0;
import N3.C0266q;
import P.InterfaceC0314o;
import P.u0;
import P5.AbstractC0349q;
import P5.C0352u;
import android.app.ActivityManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import b5.C0623e0;
import b5.C0650n0;
import b5.EnumC0631h;
import b5.S0;
import b5.V;
import b5.t1;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.j0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import k4.H;
import k4.J;
import k4.P;
import l4.AbstractC1566a;
import n1.C1606c;
import org.json.JSONObject;
import t1.C1994c;
import t1.C2004m;
import u1.EnumC2057e;
import x1.C2167k;
import y1.InterfaceC2201b;

/* renamed from: o1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1671f implements B0, InterfaceC0314o, P0.b, M.a, H, Q3.i, Y3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21472a;

    /* renamed from: b, reason: collision with root package name */
    public Object f21473b;

    public /* synthetic */ C1671f(int i9, Object obj) {
        this.f21472a = i9;
        this.f21473b = obj;
    }

    public static C1.p F(C2167k c2167k, C1.i iVar, A1.b bVar, A1.c cVar) {
        String str;
        boolean z9;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(iVar.f1191a.getResources(), cVar.f8a);
        EnumC2057e enumC2057e = EnumC2057e.f23577a;
        Map map = cVar.f9b;
        Object obj = map.get("coil#disk_cache_key");
        Boolean bool = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = map.get("coil#is_sampled");
        if (obj2 instanceof Boolean) {
            bool = (Boolean) obj2;
        }
        boolean z10 = false;
        if (bool != null) {
            z9 = bool.booleanValue();
        } else {
            z9 = false;
        }
        Bitmap.Config[] configArr = H1.f.f2949a;
        if (c2167k != null && c2167k.f24557g) {
            z10 = true;
        }
        return new C1.p(bitmapDrawable, iVar, enumC2057e, bVar, str, z9, z10);
    }

    @Override // Q3.i
    public long A(long j, long j4) {
        return 1L;
    }

    @Override // F0.B0
    public int B(View view) {
        C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
        ((androidx.recyclerview.widget.a) this.f21473b).getClass();
        return androidx.recyclerview.widget.a.E(view) + ((ViewGroup.MarginLayoutParams) c0099c0).rightMargin;
    }

    public Q.g C(int i9) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ac, code lost:
    
        if (r7 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0143, code lost:
    
        if (r0 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014a, code lost:
    
        if (r7 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012f, code lost:
    
        if (r1 <= 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x013b, code lost:
    
        if (java.lang.Math.abs(r2 - r5) <= r9) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0151 A[RETURN] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public A1.c D(C1.i r18, A1.b r19, D1.h r20, D1.g r21) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.C1671f.D(C1.i, A1.b, D1.h, D1.g):A1.c");
    }

    public A1.b E(C1.i iVar, Object obj, C1.m mVar, C1994c c1994c) {
        String str;
        Map linkedHashMap;
        iVar.getClass();
        List list = ((C2004m) this.f21473b).f23103g.f23060c;
        int size = list.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                A7.h hVar = (A7.h) list.get(i9);
                InterfaceC2201b interfaceC2201b = (InterfaceC2201b) hVar.f547a;
                if (((Class) hVar.f548b).isAssignableFrom(obj.getClass())) {
                    kotlin.jvm.internal.h.c(interfaceC2201b, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                    str = interfaceC2201b.a(obj, mVar);
                    if (str != null) {
                        break;
                    }
                }
                i9++;
            } else {
                str = null;
                break;
            }
        }
        if (str == null) {
            return null;
        }
        Map map = iVar.f1213x.f1233a;
        boolean isEmpty = map.isEmpty();
        u uVar = u.f1136a;
        if (isEmpty) {
            linkedHashMap = uVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
        }
        List list2 = iVar.f1196f;
        if (list2.isEmpty() && linkedHashMap.isEmpty()) {
            return new A1.b(str, uVar);
        }
        LinkedHashMap I4 = y.I(linkedHashMap);
        if (!list2.isEmpty()) {
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                I4.put(AbstractC0953k1.j(i10, "coil#transformation_"), ((F1.c) list2.get(i10)).b());
            }
            I4.put("coil#transformation_size", mVar.f1221d.toString());
        }
        return new A1.b(str, I4);
    }

    public int G(int i9) {
        WorkDatabase workDatabase;
        int i10;
        int i11;
        int i12;
        synchronized (C1671f.class) {
            try {
                workDatabase = (WorkDatabase) this.f21473b;
                workDatabase.c();
                Long k5 = workDatabase.r().k("next_job_scheduler_id");
                i10 = 0;
                if (k5 != null) {
                    i11 = k5.intValue();
                } else {
                    i11 = 0;
                }
                if (i11 == Integer.MAX_VALUE) {
                    i12 = 0;
                } else {
                    i12 = i11 + 1;
                }
                workDatabase.r().n(new C1606c(i12, "next_job_scheduler_id"));
                workDatabase.p();
                workDatabase.m();
                if (i11 >= 0 && i11 <= i9) {
                    i10 = i11;
                }
                ((WorkDatabase) this.f21473b).r().n(new C1606c(1, "next_job_scheduler_id"));
            } catch (Throwable th) {
                workDatabase.m();
                throw th;
            } finally {
            }
        }
        return i10;
    }

    public boolean H(int i9, int i10, Bundle bundle) {
        return false;
    }

    public JSONObject I() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f21473b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(y6.g.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e8) {
                        e = e8;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        y6.g.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    y6.g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            y6.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e9) {
            e = e9;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            y6.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // Y3.g
    public int J() {
        return 1;
    }

    public void K(int i9) {
        RecyclerView recyclerView = (RecyclerView) this.f21473b;
        View childAt = recyclerView.getChildAt(i9);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i9);
    }

    public void L() {
        t1 t1Var = (t1) this.f21473b;
        t1Var.l0();
        C0650n0 c0650n0 = (C0650n0) t1Var.f1707a;
        C0623e0 c0623e0 = c0650n0.f11228h;
        C0650n0.d(c0623e0);
        K4.a aVar = c0650n0.f11233n;
        aVar.getClass();
        if (c0623e0.u0(System.currentTimeMillis())) {
            C0623e0 c0623e02 = c0650n0.f11228h;
            C0650n0.d(c0623e02);
            c0623e02.f11093m.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10978n.b("Detected application was in foreground");
                aVar.getClass();
                O(System.currentTimeMillis());
            }
        }
    }

    public boolean M() {
        C0650n0 c0650n0 = (C0650n0) this.f21473b;
        if (TextUtils.isEmpty(c0650n0.f11222b)) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            if (Log.isLoggable(v8.w0(), 3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void N(long j) {
        t1 t1Var = (t1) this.f21473b;
        t1Var.l0();
        t1Var.p0();
        C0650n0 c0650n0 = (C0650n0) t1Var.f1707a;
        C0623e0 c0623e0 = c0650n0.f11228h;
        C0650n0.d(c0623e0);
        boolean u02 = c0623e0.u0(j);
        C0623e0 c0623e02 = c0650n0.f11228h;
        if (u02) {
            C0650n0.d(c0623e02);
            c0623e02.f11093m.a(true);
            c0650n0.i().t0();
        }
        C0650n0.d(c0623e02);
        c0623e02.f11097q.g(j);
        if (c0623e02.f11093m.b()) {
            O(j);
        }
    }

    public void O(long j) {
        t1 t1Var = (t1) this.f21473b;
        t1Var.l0();
        C0650n0 c0650n0 = (C0650n0) t1Var.f1707a;
        if (c0650n0.a()) {
            C0623e0 c0623e0 = c0650n0.f11228h;
            C0650n0.d(c0623e0);
            c0623e0.f11097q.g(j);
            c0650n0.f11233n.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10978n.c(Long.valueOf(elapsedRealtime), "Session started, time");
            long j4 = j / 1000;
            Long valueOf = Long.valueOf(j4);
            S0 s02 = c0650n0.f11235p;
            C0650n0.e(s02);
            s02.G0(j, valueOf, "auto", "_sid");
            C0650n0.d(c0623e0);
            c0623e0.f11098r.g(j4);
            c0623e0.f11093m.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j4);
            C0650n0.e(s02);
            s02.x0(j, bundle, "auto", "_s");
            String m9 = c0623e0.f11103w.m();
            if (!TextUtils.isEmpty(m9)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", m9);
                C0650n0.e(s02);
                s02.x0(j, bundle2, "auto", "_ssr");
            }
        }
    }

    public void P(b5.B0 b02, int i9) {
        EnumC0631h enumC0631h = EnumC0631h.UNSET;
        if (i9 != -30) {
            if (i9 != -20) {
                if (i9 != -10) {
                    if (i9 != 0) {
                        if (i9 == 30) {
                            enumC0631h = EnumC0631h.INITIALIZATION;
                        }
                    }
                } else {
                    enumC0631h = EnumC0631h.MANIFEST;
                }
            }
            enumC0631h = EnumC0631h.API;
        } else {
            enumC0631h = EnumC0631h.TCF;
        }
        ((EnumMap) this.f21473b).put((EnumMap) b02, (b5.B0) enumC0631h);
    }

    public void Q(b5.B0 b02, EnumC0631h enumC0631h) {
        ((EnumMap) this.f21473b).put((EnumMap) b02, (b5.B0) enumC0631h);
    }

    @Override // Y3.g
    public int a(long j) {
        return -1;
    }

    @Override // M.a
    public Cursor b(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f21473b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e8) {
            Log.w("FontsProvider", "Unable to query the content provider", e8);
            return null;
        }
    }

    @Override // Q3.i
    public long c(long j) {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f21473b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                C3.d.w((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // Q3.i
    public long d(long j, long j4) {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public B3.f e(k4.J r9, java.io.IOException r10, int r11) {
        /*
            r8 = this;
            r0 = 0
            int r1 = r8.f21472a
            switch(r1) {
                case 17: goto L19;
                default: goto L6;
            }
        L6:
            U3.v r9 = (U3.v) r9
            java.lang.Object r9 = r8.f21473b
            U3.x r9 = (U3.x) r9
            boolean r9 = r9.f7481f
            if (r9 != 0) goto L16
            java.lang.Object r9 = r8.f21473b
            U3.x r9 = (U3.x) r9
            O0.c r9 = r9.f7476a
        L16:
            B3.f r9 = k4.M.f20003e
            return r9
        L19:
            k4.P r9 = (k4.P) r9
            java.lang.Object r1 = r8.f21473b
            Q3.h r1 = (Q3.h) r1
            r1.getClass()
            N3.q r2 = new N3.q
            long r3 = r9.f20008a
            k4.V r3 = r9.f20011d
            android.net.Uri r3 = r3.f20034c
            r2.<init>()
            e1.q r3 = r1.f6378n
            r3.getClass()
            boolean r3 = r10 instanceof j3.j0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L6b
            boolean r3 = r10 instanceof java.io.FileNotFoundException
            if (r3 != 0) goto L6b
            boolean r3 = r10 instanceof k4.C1495A
            if (r3 != 0) goto L6b
            boolean r3 = r10 instanceof k4.L
            if (r3 != 0) goto L6b
            int r3 = k4.C1514n.f20070b
            r3 = r10
        L4a:
            if (r3 == 0) goto L5f
            boolean r6 = r3 instanceof k4.C1514n
            if (r6 == 0) goto L5a
            r6 = r3
            k4.n r6 = (k4.C1514n) r6
            int r6 = r6.f20071a
            r7 = 2008(0x7d8, float:2.814E-42)
            if (r6 != r7) goto L5a
            goto L6b
        L5a:
            java.lang.Throwable r3 = r3.getCause()
            goto L4a
        L5f:
            int r11 = r11 + (-1)
            int r11 = r11 * 1000
            r3 = 5000(0x1388, float:7.006E-42)
            int r11 = java.lang.Math.min(r11, r3)
            long r6 = (long) r11
            goto L6c
        L6b:
            r6 = r4
        L6c:
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 != 0) goto L73
            B3.f r11 = k4.M.f20004f
            goto L78
        L73:
            B3.f r11 = new B3.f
            r11.<init>(r0, r6, r0)
        L78:
            boolean r0 = r11.a()
            r0 = r0 ^ 1
            N3.G r1 = r1.f6381q
            int r9 = r9.f20010c
            r1.j(r2, r9, r10, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.C1671f.e(k4.J, java.io.IOException, int):B3.f");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [N3.M, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k4.O] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public void f(J j, long j4, long j9) {
        int size;
        switch (this.f21472a) {
            case 17:
                P p9 = (P) j;
                Q3.h hVar = (Q3.h) this.f21473b;
                hVar.getClass();
                long j10 = p9.f20008a;
                Uri uri = p9.f20011d.f20034c;
                ?? obj = new Object();
                hVar.f6378n.getClass();
                hVar.f6381q.f(obj, p9.f20010c);
                R3.c cVar = (R3.c) p9.f20013f;
                R3.c cVar2 = hVar.f6365f0;
                if (cVar2 == null) {
                    size = 0;
                } else {
                    size = cVar2.f6596m.size();
                }
                long j11 = cVar.b(0).f6616b;
                int i9 = 0;
                while (i9 < size && hVar.f6365f0.b(i9).f6616b < j11) {
                    i9++;
                }
                if (cVar.f6588d) {
                    if (size - i9 > cVar.f6596m.size()) {
                        AbstractC1566a.P("DashMediaSource", "Loaded out of sync manifest");
                    } else {
                        long j12 = hVar.f6375l0;
                        if (j12 != -9223372036854775807L && cVar.f6592h * 1000 <= j12) {
                            AbstractC1566a.P("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f6592h + ", " + hVar.f6375l0);
                        } else {
                            hVar.f6373k0 = 0;
                        }
                    }
                    int i10 = hVar.f6373k0;
                    hVar.f6373k0 = i10 + 1;
                    if (i10 < hVar.f6378n.f(p9.f20010c)) {
                        hVar.f6362D.postDelayed(hVar.f6386v, Math.min((hVar.f6373k0 - 1) * 1000, 5000));
                        return;
                    } else {
                        hVar.f6361C = new IOException();
                        return;
                    }
                }
                hVar.f6365f0 = cVar;
                hVar.f6366g0 = cVar.f6588d & hVar.f6366g0;
                hVar.f6368h0 = j4 - j9;
                hVar.f6370i0 = j4;
                synchronized (hVar.f6384t) {
                    try {
                        if (p9.f20009b.f20077a == hVar.Y) {
                            Uri uri2 = hVar.f6365f0.f6594k;
                            if (uri2 == null) {
                                uri2 = p9.f20011d.f20034c;
                            }
                            hVar.Y = uri2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (size == 0) {
                    R3.c cVar3 = hVar.f6365f0;
                    if (cVar3.f6588d) {
                        R3.u uVar = cVar3.f6593i;
                        if (uVar != null) {
                            String str = uVar.f6657b;
                            if (!l4.y.a(str, "urn:mpeg:dash:utc:direct:2014") && !l4.y.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                                if (!l4.y.a(str, "urn:mpeg:dash:utc:http-iso:2014") && !l4.y.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                                    if (!l4.y.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !l4.y.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                                        if (!l4.y.a(str, "urn:mpeg:dash:utc:ntp:2014") && !l4.y.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                            AbstractC1566a.u("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                                            hVar.x(true);
                                            return;
                                        } else {
                                            hVar.w();
                                            return;
                                        }
                                    }
                                    P p10 = new P(hVar.f6390z, Uri.parse(uVar.f6658c), 5, new Q6.f(11));
                                    hVar.f6359A.f(p10, new Q3.f(hVar), 1);
                                    hVar.f6381q.l(new C0266q(p10.f20009b), p10.f20010c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                                    return;
                                }
                                P p11 = new P(hVar.f6390z, Uri.parse(uVar.f6658c), 5, new Object());
                                hVar.f6359A.f(p11, new Q3.f(hVar), 1);
                                hVar.f6381q.l(new C0266q(p11.f20009b), p11.f20010c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                                return;
                            }
                            try {
                                hVar.f6371j0 = l4.y.K(uVar.f6658c) - hVar.f6370i0;
                                hVar.x(true);
                                return;
                            } catch (j0 e8) {
                                AbstractC1566a.u("DashMediaSource", "Failed to resolve time offset.", e8);
                                hVar.x(true);
                                return;
                            }
                        }
                        hVar.w();
                        return;
                    }
                    hVar.x(true);
                    return;
                }
                hVar.f6377m0 += i9;
                hVar.x(true);
                return;
            default:
                return;
        }
    }

    @Override // P0.b
    public P0.a g(String fileName) {
        kotlin.jvm.internal.h.e(fileName, "fileName");
        return new J0.a(((Q0.d) this.f21473b).Z());
    }

    public void i(String str, String str2) {
        String a5 = U3.o.a(str.trim());
        String trim = str2.trim();
        C1671f c1671f = (C1671f) this.f21473b;
        c1671f.getClass();
        AbstractC0349q.b(a5, trim);
        C0352u c0352u = (C0352u) c1671f.f21473b;
        Collection collection = (Collection) c0352u.get(a5);
        if (collection == null) {
            collection = new ArrayList();
            c0352u.put(a5, collection);
        }
        collection.add(trim);
    }

    @Override // F0.B0
    public int j() {
        androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) this.f21473b;
        return aVar.f10349n - aVar.J();
    }

    @Override // Q3.i
    public long k(long j, long j4) {
        return 0L;
    }

    public void l(List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            String str = (String) list.get(i9);
            int i10 = l4.y.f20553a;
            String[] split = str.split(":\\s?", 2);
            if (split.length == 2) {
                i(split[0], split[1]);
            }
        }
    }

    @Override // Y3.g
    public long m(int i9) {
        return 0L;
    }

    @Override // F0.B0
    public int n(View view) {
        C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
        ((androidx.recyclerview.widget.a) this.f21473b).getClass();
        return androidx.recyclerview.widget.a.B(view) - ((ViewGroup.MarginLayoutParams) c0099c0).leftMargin;
    }

    @Override // Q3.i
    public long o(long j, long j4) {
        return -9223372036854775807L;
    }

    @Override // Q3.i
    public R3.j p(long j) {
        return (R3.j) this.f21473b;
    }

    @Override // Q3.i
    public boolean q() {
        return true;
    }

    public Q.g r(int i9) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public void s(J j, long j4, long j9, boolean z9) {
        switch (this.f21472a) {
            case 17:
                P p9 = (P) j;
                Q3.h hVar = (Q3.h) this.f21473b;
                hVar.getClass();
                long j10 = p9.f20008a;
                Uri uri = p9.f20011d.f20034c;
                ?? obj = new Object();
                hVar.f6378n.getClass();
                hVar.f6381q.d(obj, p9.f20010c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                return;
            default:
                return;
        }
    }

    @Override // P.InterfaceC0314o
    public u0 t(View view, u0 u0Var) {
        int a5 = u0Var.a();
        I5.j jVar = (I5.j) this.f21473b;
        jVar.f3564m = a5;
        jVar.f3565n = u0Var.b();
        jVar.f3566o = u0Var.c();
        jVar.f();
        return u0Var;
    }

    public String toString() {
        switch (this.f21472a) {
            case 25:
                StringBuilder sb = new StringBuilder("1");
                for (b5.B0 b02 : b5.B0.values()) {
                    EnumC0631h enumC0631h = (EnumC0631h) ((EnumMap) this.f21473b).get(b02);
                    if (enumC0631h == null) {
                        enumC0631h = EnumC0631h.UNSET;
                    }
                    sb.append(enumC0631h.f11133a);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public String u(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            N6.d dVar = (N6.d) this.f21473b;
            N6.e eVar = new N6.e(stringWriter, dVar.f5238a, dVar.f5239b, dVar.f5240c, dVar.f5241d);
            eVar.h(obj);
            eVar.j();
            eVar.f5243b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // Q3.i
    public long v() {
        return 0L;
    }

    @Override // Y3.g
    public List w(long j) {
        return (List) this.f21473b;
    }

    @Override // F0.B0
    public View x(int i9) {
        return ((androidx.recyclerview.widget.a) this.f21473b).v(i9);
    }

    @Override // F0.B0
    public int y() {
        return ((androidx.recyclerview.widget.a) this.f21473b).I();
    }

    @Override // Q3.i
    public long z(long j) {
        return 1L;
    }

    public /* synthetic */ C1671f(Object obj, int i9, Object obj2) {
        this.f21472a = i9;
        this.f21473b = obj;
    }

    public C1671f(int i9) {
        this.f21472a = i9;
        switch (i9) {
            case 15:
                this.f21473b = C0352u.a();
                return;
            case 16:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f21473b = new Q.h(this);
                    return;
                } else {
                    this.f21473b = new Q.h(this);
                    return;
                }
            case 20:
                this.f21473b = new LinkedHashMap(5, 1.0f, false);
                return;
            case 21:
                this.f21473b = new C1671f(15);
                return;
            case 25:
                this.f21473b = new EnumMap(b5.B0.class);
                return;
            default:
                return;
        }
    }

    public C1671f(EnumMap enumMap) {
        this.f21472a = 25;
        EnumMap enumMap2 = new EnumMap(b5.B0.class);
        this.f21473b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public C1671f(Q0.d openHelper) {
        this.f21472a = 10;
        kotlin.jvm.internal.h.e(openHelper, "openHelper");
        this.f21473b = openHelper;
    }

    public C1671f(E6.e eVar) {
        this.f21472a = 7;
        this.f21473b = new File((File) eVar.f1969c, "com.crashlytics.settings.json");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1671f(String str, int i9, String str2) {
        this(21);
        this.f21472a = 21;
        i("User-Agent", str);
        i("CSeq", String.valueOf(i9));
        if (str2 != null) {
            i("Session", str2);
        }
    }

    public C1671f(C1.n nVar) {
        this.f21472a = 2;
        this.f21473b = y.I(nVar.f1233a);
    }

    public C1671f(Context context, Uri uri) {
        this.f21472a = 11;
        this.f21473b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // Q3.i
    public long h(long j, long j4) {
        return j4;
    }
}
