package f5;

import A6.t;
import D4.InterfaceC0093l;
import P.InterfaceC0314o;
import P.Q;
import P.u0;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import b5.RunnableC0659q0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f.C1148a;
import i.G;
import i0.AbstractC1336M;
import i0.AbstractComponentCallbacksC1366v;
import i0.C1328E;
import i0.C1331H;
import i8.N;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Optional;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import k4.C1499E;
import k4.H;
import k4.J;
import k4.M;
import l1.C1535g;
import l3.AbstractC1554c;
import l3.AbstractC1555d;
import l3.C1556e;
import l4.AbstractC1566a;
import o.w;
import org.json.JSONException;
import org.json.JSONObject;
import p.C1805l;
import p.InterfaceC1735B0;
import p.InterfaceC1811o;
import q6.C1917b;
import t0.AbstractC1984s;
import t0.C;
import t0.C1965A;
import t0.C1966B;
import t0.C1971e;
import t0.C1980n;
import t0.C1991z;
import t0.r;
import t4.C2009A;
import u4.C2077b;
import v1.C2094b;
import v1.C2095c;
import v1.C2098f;
import v1.C2099g;
import w4.InterfaceC2139a;
import w5.C2143c;
import x6.InterfaceC2178a;
import y6.x;
import z8.C2259h;
import z8.InterfaceC2257f;
import z8.InterfaceC2262k;
import z8.y;

/* renamed from: f5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1183o implements w, f.b, i6.h, Q.q, H, InterfaceC0314o, InterfaceC1735B0, o.j, InterfaceC0093l, InterfaceC1173e, InterfaceC2139a, C5.a, w6.b, InterfaceC2178a, InterfaceC2257f, InterfaceC2262k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17432a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17433b;

    public /* synthetic */ C1183o(int i9, Object obj) {
        this.f17432a = i9;
        this.f17433b = obj;
    }

    public static String F(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public C2099g A() {
        C2095c g9;
        t tVar = (t) this.f17433b;
        C2098f c2098f = (C2098f) tVar.f542d;
        synchronized (c2098f) {
            tVar.d(true);
            g9 = c2098f.g(((C2094b) tVar.f540b).f23728a);
        }
        if (g9 != null) {
            return new C2099g(g9);
        }
        return null;
    }

    public String B(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        ArrayList arrayList = (ArrayList) this.f17433b;
        int size = arrayList.size() - 2;
        int z9 = v4.e.z(size, 0, -2);
        if (z9 <= size) {
            while (!name.equalsIgnoreCase((String) arrayList.get(size))) {
                if (size != z9) {
                    size -= 2;
                } else {
                    return null;
                }
            }
            return (String) arrayList.get(size + 1);
        }
        return null;
    }

    public void C(r rVar, C1980n c1980n, ArrayList arrayList) {
        C1971e c1971e = (C1971e) this.f17433b;
        if (rVar == c1971e.f22986y && c1980n != null) {
            C1966B c1966b = c1971e.f22985x.f22840a;
            String d9 = c1980n.d();
            C1991z c1991z = new C1991z(c1966b, d9, c1971e.b(c1966b, d9));
            c1991z.i(c1980n);
            if (c1971e.f22966d != c1991z) {
                r rVar2 = c1971e.f22986y;
                C c3 = c1971e.f22985x;
                C1965A c1965a = c1971e.f22968f;
                if (c1965a != null) {
                    if (!c1965a.f22834i && !c1965a.j) {
                        c1965a.j = true;
                        AbstractC1984s abstractC1984s = c1965a.f22826a;
                        if (abstractC1984s != null) {
                            abstractC1984s.h(0);
                            abstractC1984s.d();
                        }
                    }
                    c1971e.f22968f = null;
                }
                C1965A c1965a2 = new C1965A(c1971e, c1991z, rVar2, 3, true, c3, arrayList);
                c1971e.f22968f = c1965a2;
                c1965a2.a();
                c1971e.f22985x = null;
                c1971e.f22986y = null;
                return;
            }
            return;
        }
        if (rVar == c1971e.f22967e) {
            if (c1980n != null) {
                c1971e.o(c1971e.f22966d, c1980n);
            }
            C1991z a5 = c1971e.f22966d.a();
            if (a5 != null) {
                a5.p(arrayList);
            }
        }
    }

    public void D(G6.e eVar, Thread thread, Throwable th) {
        y6.l lVar = (y6.l) this.f17433b;
        synchronized (lVar) {
            try {
                String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                try {
                    try {
                        x.a(lVar.f25066e.f25505a.b(new y6.j(lVar, System.currentTimeMillis(), th, thread, eVar)));
                    } catch (TimeoutException unused) {
                        Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                    }
                } catch (Exception e8) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e8);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void E(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        int i9 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f17433b;
            if (i9 < arrayList.size()) {
                if (name.equalsIgnoreCase((String) arrayList.get(i9))) {
                    arrayList.remove(i9);
                    arrayList.remove(i9);
                    i9 -= 2;
                }
                i9 += 2;
            } else {
                return;
            }
        }
    }

    @Override // D4.InterfaceC0093l
    public void H(Object obj, Object obj2) {
        y4.w wVar = (y4.w) obj;
        Context context = wVar.f2370c;
        C4.g gVar = new C4.g(-1, -1, 0, true);
        y4.g gVar2 = (y4.g) wVar.u();
        C4.f fVar = new C4.f(gVar);
        C2009A c2009a = (C2009A) this.f17433b;
        Parcel Q7 = gVar2.Q();
        com.google.android.gms.internal.cast.C.d(Q7, c2009a.f23128k);
        com.google.android.gms.internal.cast.C.c(Q7, fVar);
        gVar2.i1(Q7, 18);
        y4.g gVar3 = (y4.g) wVar.u();
        C4.f fVar2 = new C4.f(gVar);
        Parcel Q8 = gVar3.Q();
        com.google.android.gms.internal.cast.C.c(Q8, fVar2);
        gVar3.i1(Q8, 17);
        ((C1177i) obj2).b(null);
    }

    @Override // z8.InterfaceC2257f
    public Object a(y yVar) {
        C2259h c2259h = new C2259h(yVar);
        yVar.d(new G(24, c2259h));
        return c2259h;
    }

    @Override // z8.InterfaceC2262k
    public Object b(Object obj) {
        Optional ofNullable;
        ofNullable = Optional.ofNullable(((InterfaceC2262k) this.f17433b).b((N) obj));
        return ofNullable;
    }

    @Override // o.w
    public void c(o.l lVar, boolean z9) {
        ((i.w) this.f17433b).p(lVar);
    }

    @Override // f.b
    public void d(Object obj) {
        C1148a c1148a = (C1148a) obj;
        AbstractC1336M abstractC1336M = (AbstractC1336M) this.f17433b;
        C1331H c1331h = (C1331H) abstractC1336M.f18186D.pollLast();
        if (c1331h == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        C1535g c1535g = abstractC1336M.f18198c;
        String str = c1331h.f18174a;
        AbstractComponentCallbacksC1366v k5 = c1535g.k(str);
        if (k5 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        } else {
            k5.C(c1331h.f18175b, c1148a.f17224a, c1148a.f17225b);
        }
    }

    @Override // k4.H
    public B3.f e(J j, IOException iOException, int i9) {
        Q3.h hVar = ((Q3.d) this.f17433b).f6347a;
        hVar.getClass();
        AbstractC1566a.u("DashMediaSource", "Failed to resolve time offset.", iOException);
        hVar.x(true);
        return M.f20003e;
    }

    @Override // k4.H
    public void f(J j, long j4, long j9) {
        boolean z9;
        Q3.d dVar = (Q3.d) this.f17433b;
        synchronized (AbstractC1566a.f20481i) {
            z9 = AbstractC1566a.j;
        }
        if (!z9) {
            IOException iOException = new IOException(new ConcurrentModificationException());
            Q3.h hVar = dVar.f6347a;
            hVar.getClass();
            AbstractC1566a.u("DashMediaSource", "Failed to resolve time offset.", iOException);
            hVar.x(true);
            return;
        }
        dVar.a();
    }

    @Override // Q.q
    public boolean g(View view) {
        int width;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f17433b;
        boolean z9 = false;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        WeakHashMap weakHashMap = Q.f5546a;
        if (view.getLayoutDirection() == 1) {
            z9 = true;
        }
        int i9 = swipeDismissBehavior.f15834e;
        if ((i9 == 0 && z9) || (i9 == 1 && !z9)) {
            width = -view.getWidth();
        } else {
            width = view.getWidth();
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        s4.i iVar = swipeDismissBehavior.f15831b;
        if (iVar != null) {
            iVar.M(view);
        }
        return true;
    }

    @Override // p.InterfaceC1735B0
    public void h(o.l lVar, o.n nVar) {
        o.f fVar = (o.f) this.f17433b;
        o.e eVar = null;
        fVar.f21340f.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f21342h;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                if (lVar == ((o.e) arrayList.get(i9)).f21334b) {
                    break;
                } else {
                    i9++;
                }
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 == -1) {
            return;
        }
        int i10 = i9 + 1;
        if (i10 < arrayList.size()) {
            eVar = (o.e) arrayList.get(i10);
        }
        fVar.f21340f.postAtTime(new RunnableC0659q0(this, eVar, nVar, lVar, 9), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // x6.InterfaceC2178a
    public void i(y6.n nVar) {
        this.f17433b = nVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // z8.InterfaceC2257f
    public Type j() {
        return (Type) this.f17433b;
    }

    @Override // i6.h
    public Object k(String str) {
        return ((i6.j) this.f17433b).f(str, null);
    }

    @Override // o.j
    public boolean l(o.l lVar, MenuItem menuItem) {
        switch (this.f17432a) {
            case 12:
                InterfaceC1811o interfaceC1811o = ((ActionMenuView) this.f17433b).f9432z;
                if (interfaceC1811o != null) {
                    Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((G) interfaceC1811o).f17990b).f9496h0.f9332c).iterator();
                    while (it.hasNext()) {
                        if (((C1328E) it.next()).f18170a.o()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                ((Toolbar) this.f17433b).getClass();
                return false;
        }
    }

    @Override // o.w
    public boolean m(o.l lVar) {
        Window.Callback callback = ((i.w) this.f17433b).f18132l.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, lVar);
            return true;
        }
        return true;
    }

    @Override // p.InterfaceC1735B0
    public void n(o.l lVar, o.n nVar) {
        ((o.f) this.f17433b).f21340f.removeCallbacksAndMessages(lVar);
    }

    @Override // f5.InterfaceC1173e
    public void o(Object obj) {
        com.google.android.gms.internal.cast.J.h("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
        ((C2077b) this.f17433b).getClass();
    }

    @Override // w4.InterfaceC2139a
    public void p(Bitmap bitmap) {
        y4.b bVar = w4.i.f24188v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f9 = width;
            int i9 = (int) (((9.0f * f9) / 16.0f) + 0.5f);
            float f10 = (i9 - r3) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f9, bitmap.getHeight() + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, i9, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((w4.i) this.f17433b).b(bitmap2, 0);
    }

    @Override // w6.b
    public void q(String str, Bundle bundle) {
        y6.n nVar = (y6.n) this.f17433b;
        if (nVar != null) {
            try {
                String str2 = "$A$:" + F(str, bundle);
                y6.p pVar = nVar.f25081a;
                pVar.getClass();
                pVar.f25099o.f25505a.a(new y6.o(pVar, System.currentTimeMillis() - pVar.f25089d, str2, 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // C5.a
    public void r(Typeface typeface) {
        C2143c c2143c = (C2143c) this.f17433b;
        if (c2143c.m(typeface)) {
            c2143c.i(false);
        }
    }

    @Override // P.InterfaceC0314o
    public u0 t(View view, u0 u0Var) {
        m5.f fVar = (m5.f) this.f17433b;
        m5.e eVar = fVar.f20852m;
        if (eVar != null) {
            fVar.f20846f.f15859W.remove(eVar);
        }
        m5.e eVar2 = new m5.e(fVar.f20849i, u0Var);
        fVar.f20852m = eVar2;
        eVar2.e(fVar.getWindow());
        BottomSheetBehavior bottomSheetBehavior = fVar.f20846f;
        m5.e eVar3 = fVar.f20852m;
        ArrayList arrayList = bottomSheetBehavior.f15859W;
        if (!arrayList.contains(eVar3)) {
            arrayList.add(eVar3);
        }
        return u0Var;
    }

    public String toString() {
        switch (this.f17432a) {
            case 16:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f17433b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // o.j
    public void u(o.l lVar) {
        switch (this.f17432a) {
            case 12:
                C1183o c1183o = ((ActionMenuView) this.f17433b).f9427u;
                if (c1183o != null) {
                    c1183o.u(lVar);
                    return;
                }
                return;
            default:
                Toolbar toolbar = (Toolbar) this.f17433b;
                C1805l c1805l = toolbar.f9486a.f9426t;
                if (c1805l == null || !c1805l.e()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.f9496h0.f9332c).iterator();
                    while (it.hasNext()) {
                        ((C1328E) it.next()).f18170a.s();
                    }
                    return;
                }
                return;
        }
    }

    public void v(String name, String value) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        B6.u0.h(name);
        B6.u0.i(value, name);
        x(name, value);
    }

    public void w(String str) {
        int R2 = W7.d.R(str, ':', 1, 4);
        if (R2 != -1) {
            String substring = str.substring(0, R2);
            kotlin.jvm.internal.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = str.substring(R2 + 1);
            kotlin.jvm.internal.h.d(substring2, "this as java.lang.String).substring(startIndex)");
            x(substring, substring2);
            return;
        }
        if (str.charAt(0) == ':') {
            String substring3 = str.substring(1);
            kotlin.jvm.internal.h.d(substring3, "this as java.lang.String).substring(startIndex)");
            x("", substring3);
            return;
        }
        x("", str);
    }

    public void x(String name, String value) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        ArrayList arrayList = (ArrayList) this.f17433b;
        arrayList.add(name);
        arrayList.add(W7.d.j0(value).toString());
    }

    public void y(String name, String value) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        if (name.length() > 0) {
            int length = name.length();
            for (int i9 = 0; i9 < length; i9++) {
                char charAt = name.charAt(i9);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(k8.c.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i9), name).toString());
                }
            }
            x(name, value);
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    public i8.w z() {
        return new i8.w((String[]) ((ArrayList) this.f17433b).toArray(new String[0]));
    }

    public C1183o(s4.i iVar, C1499E c1499e) {
        this.f17432a = 14;
        this.f17433b = c1499e;
        iVar.T(new C1917b(1, this));
    }

    public C1183o(C1556e c1556e) {
        this.f17432a = 7;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c1556e.f20390a).setFlags(c1556e.f20391b).setUsage(c1556e.f20392c);
        int i9 = l4.y.f20553a;
        if (i9 >= 29) {
            AbstractC1554c.a(usage, c1556e.f20393d);
        }
        if (i9 >= 32) {
            AbstractC1555d.a(usage, c1556e.f20394e);
        }
        this.f17433b = usage.build();
    }

    public C1183o(int i9) {
        this.f17432a = i9;
        switch (i9) {
            case 23:
                return;
            default:
                this.f17433b = new ArrayList(20);
                return;
        }
    }

    @Override // k4.H
    public void s(J j, long j4, long j9, boolean z9) {
    }
}
