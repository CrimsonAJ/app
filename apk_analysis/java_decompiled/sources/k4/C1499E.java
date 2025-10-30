package k4;

import B6.u0;
import P.InterfaceC0314o;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.InterfaceC0561w;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.work.impl.WorkDatabase_Impl;
import f5.C1177i;
import f5.C1183o;
import f5.C1185q;
import f5.InterfaceC1175g;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n0.C1601a;
import n0.C1602b;
import n0.C1603c;
import n1.C1605b;
import n1.C1606c;
import n3.C1625b;
import o7.C1724p;
import p3.C1856a;
import q3.InterfaceC1905j;
import q6.C1917b;
import s4.C1957d;
import w4.InterfaceC2139a;
import x8.C2190j;
import z8.C2263l;
import z8.InterfaceC2255d;
import z8.InterfaceC2257f;
import z8.InterfaceC2258g;

/* renamed from: k4.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1499E implements InterfaceC1512l, InterfaceC2139a, InterfaceC0314o, InterfaceC1175g, InterfaceC2257f, InterfaceC2258g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19984a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19985b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19986c;

    public /* synthetic */ C1499E(int i9, boolean z9) {
        this.f19984a = i9;
    }

    public static C1499E i(InterfaceC0561w interfaceC0561w) {
        return new C1499E(interfaceC0561w, ((k0) interfaceC0561w).u());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, x8.g] */
    public static C1499E o(String... strArr) {
        try {
            C2190j[] c2190jArr = new C2190j[strArr.length];
            ?? obj = new Object();
            for (int i9 = 0; i9 < strArr.length; i9++) {
                C1724p.h0(obj, strArr[i9]);
                obj.h0();
                c2190jArr[i9] = obj.j0(obj.f24644b);
            }
            return new C1499E((String[]) strArr.clone(), 11, u0.F(c2190jArr));
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // z8.InterfaceC2257f
    public Object a(z8.y yVar) {
        Executor executor = (Executor) this.f19986c;
        if (executor == null) {
            return yVar;
        }
        return new C2263l(executor, yVar);
    }

    public void b() {
        String str = (String) this.f19985b;
        try {
            E6.e eVar = (E6.e) this.f19986c;
            eVar.getClass();
            new File((File) eVar.f1969c, str).createNewFile();
        } catch (IOException e8) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e8);
        }
    }

    @Override // k4.InterfaceC1512l
    public InterfaceC1513m c() {
        return new C1856a((i8.E) this.f19986c, (C1499E) this.f19985b);
    }

    public void d(String str, PrintWriter printWriter) {
        boolean z9;
        C1603c c1603c = (C1603c) this.f19986c;
        if (c1603c.f21007d.i() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i9 = 0; i9 < c1603c.f21007d.i(); i9++) {
                C1601a c1601a = (C1601a) c1603c.f21007d.j(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(c1603c.f21007d.f(i9));
                printWriter.print(": ");
                printWriter.println(c1601a.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                Object obj = null;
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(c1601a.f21001l);
                C1957d c1957d = c1601a.f21001l;
                String str3 = str2 + "  ";
                c1957d.getClass();
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(c1957d.f22719a);
                if (c1957d.f22720b || c1957d.f22723e) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(c1957d.f22720b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(c1957d.f22723e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (c1957d.f22721c || c1957d.f22722d) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(c1957d.f22721c);
                    printWriter.print(" mReset=");
                    printWriter.println(c1957d.f22722d);
                }
                if (c1957d.f22725g != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(c1957d.f22725g);
                    printWriter.print(" waiting=");
                    c1957d.f22725g.getClass();
                    printWriter.println(false);
                }
                if (c1957d.f22726h != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(c1957d.f22726h);
                    printWriter.print(" waiting=");
                    c1957d.f22726h.getClass();
                    printWriter.println(false);
                }
                if (c1601a.f21003n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(c1601a.f21003n);
                    C1602b c1602b = c1601a.f21003n;
                    c1602b.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(c1602b.f21005b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                C1957d c1957d2 = c1601a.f21001l;
                Object obj2 = c1601a.f9795e;
                if (obj2 != androidx.lifecycle.E.f9790k) {
                    obj = obj2;
                }
                c1957d2.getClass();
                StringBuilder sb = new StringBuilder(64);
                if (obj == null) {
                    sb.append("null");
                } else {
                    Class<?> cls = obj.getClass();
                    sb.append(cls.getSimpleName());
                    sb.append("{");
                    sb.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb.append("}");
                }
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                if (c1601a.f9793c > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                printWriter.println(z9);
            }
        }
    }

    @Override // z8.InterfaceC2258g
    public void e(InterfaceC2255d interfaceC2255d, Throwable th) {
        ((C2263l) this.f19986c).f25617a.execute(new N3.E(this, (InterfaceC2258g) this.f19985b, th, 12));
    }

    public ArrayList f(String str) {
        G0.G a5 = G0.G.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            a5.t(1);
        } else {
            a5.m(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f19985b;
        workDatabase_Impl.b();
        Cursor w7 = s8.n.w(workDatabase_Impl, a5, false);
        try {
            ArrayList arrayList = new ArrayList(w7.getCount());
            while (w7.moveToNext()) {
                arrayList.add(w7.getString(0));
            }
            return arrayList;
        } finally {
            w7.close();
            a5.g();
        }
    }

    @Override // z8.InterfaceC2258g
    public void g(InterfaceC2255d interfaceC2255d, z8.O o9) {
        ((C2263l) this.f19986c).f25617a.execute(new N3.E(this, (InterfaceC2258g) this.f19985b, o9, 11));
    }

    public InterfaceC1905j h(Object... objArr) {
        Constructor d9;
        synchronized (((AtomicBoolean) this.f19986c)) {
            if (!((AtomicBoolean) this.f19986c).get()) {
                try {
                    d9 = ((k8.a) this.f19985b).d();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f19986c).set(true);
                } catch (Exception e8) {
                    throw new RuntimeException("Error instantiating extension", e8);
                }
            }
            d9 = null;
        }
        if (d9 == null) {
            return null;
        }
        try {
            return (InterfaceC1905j) d9.newInstance(objArr);
        } catch (Exception e9) {
            throw new IllegalStateException("Unexpected error creating extractor", e9);
        }
    }

    @Override // z8.InterfaceC2257f
    public Type j() {
        return (Type) this.f19985b;
    }

    public Long k(String str) {
        G0.G a5 = G0.G.a(1, "SELECT long_value FROM Preference where `key`=?");
        a5.m(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f19985b;
        workDatabase_Impl.b();
        Cursor w7 = s8.n.w(workDatabase_Impl, a5, false);
        try {
            Long l9 = null;
            if (w7.moveToFirst() && !w7.isNull(0)) {
                l9 = Long.valueOf(w7.getLong(0));
            }
            return l9;
        } finally {
            w7.close();
            a5.g();
        }
    }

    public synchronized Map l() {
        try {
            if (((Map) this.f19986c) == null) {
                this.f19986c = Collections.unmodifiableMap(new HashMap((HashMap) this.f19985b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f19986c;
    }

    public ArrayList m(String str) {
        G0.G a5 = G0.G.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            a5.t(1);
        } else {
            a5.m(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f19985b;
        workDatabase_Impl.b();
        Cursor w7 = s8.n.w(workDatabase_Impl, a5, false);
        try {
            ArrayList arrayList = new ArrayList(w7.getCount());
            while (w7.moveToNext()) {
                arrayList.add(w7.getString(0));
            }
            return arrayList;
        } finally {
            w7.close();
            a5.g();
        }
    }

    public void n(C1606c c1606c) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f19985b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((C1605b) this.f19986c).l(c1606c);
            workDatabase_Impl.p();
        } finally {
            workDatabase_Impl.m();
        }
    }

    @Override // w4.InterfaceC2139a
    public void p(Bitmap bitmap) {
        C1499E c1499e = (C1499E) this.f19985b;
        c1499e.f19986c = bitmap;
        w4.g gVar = (w4.g) this.f19986c;
        gVar.f24178l = c1499e;
        gVar.b();
    }

    public void q(int i9, Bundle bundle) {
        w6.b bVar;
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i9 + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                bVar = (v4.q) this.f19985b;
            } else {
                bVar = (C1183o) this.f19986c;
            }
            if (bVar != null) {
                bVar.q(string, bundle2);
            }
        }
    }

    public void r(Exception exc, boolean z9) {
        int i9;
        this.f19986c = null;
        HashSet hashSet = (HashSet) this.f19985b;
        P5.F o9 = P5.F.o(hashSet);
        hashSet.clear();
        P5.D listIterator = o9.listIterator(0);
        while (listIterator.hasNext()) {
            C1625b c1625b = (C1625b) listIterator.next();
            c1625b.getClass();
            if (z9) {
                i9 = 1;
            } else {
                i9 = 3;
            }
            c1625b.j(exc, i9);
        }
    }

    @Override // f5.InterfaceC1175g
    public C1185q s(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        y6.l lVar = (y6.l) this.f19986c;
        if (!booleanValue) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
            }
            Iterator it = E6.e.e(((File) lVar.f25068g.f1969c).listFiles(y6.l.f25060r)).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            E6.e eVar = ((E6.c) lVar.f25073m.f21977b).f1963b;
            E6.c.a(E6.e.e(((File) eVar.f1971e).listFiles()));
            E6.c.a(E6.e.e(((File) eVar.f1972f).listFiles()));
            E6.c.a(E6.e.e(((File) eVar.f1973g).listFiles()));
            lVar.f25077q.d(null);
            return s8.n.p(null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
        }
        boolean booleanValue2 = bool.booleanValue();
        D4.v vVar = lVar.f25063b;
        if (booleanValue2) {
            ((C1177i) vVar.f1900f).d(null);
            return ((C1185q) this.f19985b).m(lVar.f25066e.f25505a, new i.G(23, this));
        }
        vVar.getClass();
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [k4.G, java.lang.Object] */
    @Override // P.InterfaceC0314o
    public P.u0 t(View view, P.u0 u0Var) {
        ?? obj = new Object();
        G g9 = (G) this.f19986c;
        obj.f19989a = g9.f19989a;
        obj.f19990b = g9.f19990b;
        obj.f19991c = g9.f19991c;
        obj.f19992d = g9.f19992d;
        return ((w5.q) this.f19985b).d(view, u0Var, obj);
    }

    public String toString() {
        switch (this.f19984a) {
            case 3:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((InterfaceC0561w) this.f19985b).getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d3, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(android.content.Context r13, android.content.res.XmlResourceParser r14) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.C1499E.u(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r15.equals(r4.f21588d) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(int r18, j3.Y r19, com.google.android.gms.cast.MediaInfo r20, java.lang.String r21, long r22) {
        /*
            r17 = this;
            r0 = r18
            r1 = r20
            r2 = r17
            java.lang.Object r3 = r2.f19986c
            android.util.SparseArray r3 = (android.util.SparseArray) r3
            o3.f r4 = o3.f.f21584f
            java.lang.Object r4 = r3.get(r0, r4)
            o3.f r4 = (o3.f) r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L1b
        L19:
            r7 = r5
            goto L2d
        L1b:
            long r7 = r1.f14612e
            r9 = -1
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 == 0) goto L19
            r9 = -1000(0xfffffffffffffc18, double:NaN)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 == 0) goto L19
            long r7 = l4.y.H(r7)
        L2d:
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L33
            long r7 = r4.f21585a
        L33:
            r10 = r7
            if (r1 != 0) goto L3a
            boolean r1 = r4.f21587c
        L38:
            r14 = r1
            goto L43
        L3a:
            r7 = 2
            int r1 = r1.f14609b
            if (r1 != r7) goto L41
            r1 = 1
            goto L38
        L41:
            r1 = 0
            goto L38
        L43:
            int r1 = (r22 > r5 ? 1 : (r22 == r5 ? 0 : -1))
            if (r1 != 0) goto L4b
            long r5 = r4.f21586b
            r12 = r5
            goto L4d
        L4b:
            r12 = r22
        L4d:
            long r5 = r4.f21585a
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 != 0) goto L75
            long r5 = r4.f21586b
            int r1 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r1 != 0) goto L75
            boolean r1 = r4.f21587c
            if (r14 != r1) goto L75
            java.lang.String r1 = r4.f21589e
            r5 = r21
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L72
            j3.Y r1 = r4.f21588d
            r15 = r19
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L79
            goto L81
        L72:
            r15 = r19
            goto L79
        L75:
            r15 = r19
            r5 = r21
        L79:
            o3.f r9 = new o3.f
            r16 = r5
            r9.<init>(r10, r12, r14, r15, r16)
            r4 = r9
        L81:
            r3.put(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.C1499E.v(int, j3.Y, com.google.android.gms.cast.MediaInfo, java.lang.String, long):void");
    }

    public /* synthetic */ C1499E(Object obj, int i9, Object obj2) {
        this.f19984a = i9;
        this.f19985b = obj;
        this.f19986c = obj2;
    }

    public /* synthetic */ C1499E(Object obj, Object obj2, int i9, boolean z9) {
        this.f19984a = i9;
        this.f19985b = obj2;
        this.f19986c = obj;
    }

    public C1499E(E4.a aVar) {
        this.f19984a = 21;
        this.f19985b = aVar == null ? null : aVar.f1941b;
    }

    public C1499E(s4.i iVar, C1499E c1499e) {
        this.f19984a = 16;
        this.f19986c = c1499e;
        iVar.T(new C1917b(0, this));
        this.f19985b = new HashSet();
    }

    public C1499E(WorkDatabase_Impl workDatabase_Impl, int i9) {
        this.f19984a = i9;
        switch (i9) {
            case 5:
                this.f19985b = workDatabase_Impl;
                this.f19986c = new C1605b(workDatabase_Impl, 1);
                return;
            case 6:
                this.f19985b = workDatabase_Impl;
                this.f19986c = new C1605b(workDatabase_Impl, 3);
                return;
            case 7:
                this.f19985b = workDatabase_Impl;
                this.f19986c = new C1605b(workDatabase_Impl, 6);
                return;
            default:
                this.f19985b = workDatabase_Impl;
                this.f19986c = new C1605b(workDatabase_Impl, 0);
                return;
        }
    }

    public C1499E(Context context) {
        this.f19984a = 19;
        this.f19985b = context;
        this.f19986c = null;
    }

    public C1499E(InterfaceC0561w interfaceC0561w, j0 j0Var) {
        this.f19984a = 3;
        this.f19985b = interfaceC0561w;
        this.f19986c = (C1603c) new android.support.v4.media.session.y(j0Var, C1603c.f21006f).J(C1603c.class);
    }

    public C1499E(Q6.f fVar) {
        this.f19984a = 10;
        this.f19986c = new SparseArray();
        this.f19985b = new HashMap();
    }

    public C1499E(int i9) {
        this.f19984a = i9;
        switch (i9) {
            case 8:
                this.f19985b = new HashSet();
                return;
            case 25:
                this.f19985b = new AtomicInteger();
                this.f19986c = new AtomicInteger();
                return;
            default:
                this.f19985b = new HashMap();
                return;
        }
    }

    public C1499E(i8.E e8) {
        this.f19984a = 12;
        this.f19986c = e8;
        this.f19985b = new C1499E(0);
    }

    public C1499E(MediaCodec.CryptoInfo cryptoInfo) {
        this.f19984a = 2;
        this.f19985b = cryptoInfo;
        this.f19986c = com.google.android.material.datepicker.u.d();
    }

    public C1499E(k8.a aVar) {
        this.f19984a = 13;
        this.f19985b = aVar;
        this.f19986c = new AtomicBoolean(false);
    }

    public C1499E(Object obj) {
        this.f19984a = 9;
        this.f19985b = obj;
    }
}
