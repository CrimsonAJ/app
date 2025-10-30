package s4;

import D4.InterfaceC0093l;
import F0.B0;
import F0.C0099c0;
import F0.I;
import F4.C0134m;
import N3.b0;
import N3.e0;
import N3.f0;
import N3.m0;
import N3.n0;
import P.C0305f;
import P.InterfaceC0302c;
import P.InterfaceC0307h;
import P.InterfaceC0314o;
import P.Q;
import P.u0;
import P5.F;
import P5.S;
import Q.q;
import U3.A;
import U3.B;
import U3.C0399f;
import U3.C0400g;
import U3.n;
import U3.p;
import U3.r;
import U3.s;
import U3.t;
import U3.u;
import U3.x;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.core.widget.NestedScrollView;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.viewpager2.widget.ViewPager2;
import b5.C0;
import b5.C0623e0;
import b5.C0635i0;
import b5.C0647m0;
import b5.C0650n0;
import b5.E;
import b5.EnumC0678z0;
import b5.J1;
import b5.O1;
import b5.S0;
import b5.T;
import b5.V;
import b5.X;
import b7.C0701c;
import co.notix.R;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.measurement.BinderC0937h0;
import com.google.android.gms.internal.measurement.C0952k0;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.material.appbar.AppBarLayout;
import f5.AbstractC1176h;
import f5.C1177i;
import f5.C1183o;
import f5.C1185q;
import f5.InterfaceC1171c;
import f5.InterfaceC1173e;
import j3.j0;
import java.io.IOException;
import java.io.Serializable;
import java.net.BindException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import k4.C1515o;
import k4.H;
import k4.J;
import k4.M;
import k4.O;
import l1.C1535g;
import l4.AbstractC1566a;
import l4.y;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p.InterfaceC1790d0;
import q3.InterfaceC1907l;
import q6.C1917b;

/* loaded from: classes.dex */
public final class i implements InterfaceC1171c, D0.c, B0, InterfaceC0093l, Q0.f, InterfaceC0302c, InterfaceC0307h, e0, InterfaceC1907l, H, b0, O, O1, X, InterfaceC0314o, q, InterfaceC1173e, Y3.g, InterfaceC1790d0 {

    /* renamed from: b, reason: collision with root package name */
    public static i f22733b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f22734a;

    public /* synthetic */ i(Object obj) {
        this.f22734a = obj;
    }

    public static i L(int i9, int i10, int i11) {
        return new i(AccessibilityNodeInfo.CollectionInfo.obtain(i9, i10, false, i11));
    }

    public static synchronized i U(Context context) {
        i W6;
        synchronized (i.class) {
            W6 = W(context.getApplicationContext());
        }
        return W6;
    }

    public static synchronized i W(Context context) {
        synchronized (i.class) {
            i iVar = f22733b;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f22733b = iVar2;
            return iVar2;
        }
    }

    public static i X(String str) {
        EnumC0678z0 enumC0678z0;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            enumC0678z0 = C0.c(str.charAt(0));
        } else {
            enumC0678z0 = EnumC0678z0.UNINITIALIZED;
        }
        return new i(enumC0678z0);
    }

    @Override // N3.b0
    public void A() {
        s sVar = (s) this.f22734a;
        sVar.f7437b.post(new p(sVar, 1));
    }

    @Override // F0.B0
    public int B(View view) {
        C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
        ((androidx.recyclerview.widget.a) this.f22734a).getClass();
        return androidx.recyclerview.widget.a.z(view) + ((ViewGroup.MarginLayoutParams) c0099c0).bottomMargin;
    }

    @Override // P.InterfaceC0307h
    public float D() {
        return -((NestedScrollView) this.f22734a).getVerticalScrollFactorCompat();
    }

    @Override // b5.O1
    public void E(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        S0 s02 = (S0) this.f22734a;
        if (isEmpty) {
            ((C0650n0) s02.f1707a).f11233n.getClass();
            s02.v0("auto", "_err", bundle, true, true, System.currentTimeMillis());
        } else {
            s02.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
    }

    @Override // Q0.f
    public void F(Q0.e eVar) {
        J0.e eVar2 = (J0.e) this.f22734a;
        int length = eVar2.f3591d.length;
        for (int i9 = 1; i9 < length; i9++) {
            int i10 = eVar2.f3591d[i9];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                eVar.t(i9);
                            }
                        } else {
                            byte[] bArr = eVar2.f3595h[i9];
                            kotlin.jvm.internal.h.b(bArr);
                            eVar.U(i9, bArr);
                        }
                    } else {
                        String str = eVar2.f3594g[i9];
                        kotlin.jvm.internal.h.b(str);
                        eVar.m(i9, str);
                    }
                } else {
                    eVar.u(i9, eVar2.f3593f[i9]);
                }
            } else {
                eVar.z(eVar2.f3592e[i9], i9);
            }
        }
    }

    @Override // f5.InterfaceC1171c
    public void G(AbstractC1176h abstractC1176h) {
        ((CountDownLatch) this.f22734a).countDown();
    }

    @Override // D4.InterfaceC0093l
    public void H(Object obj, Object obj2) {
        C1177i c1177i = (C1177i) obj2;
        H4.a aVar = (H4.a) ((H4.d) obj).u();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar.f6930g);
        int i9 = T4.a.f7205a;
        C0134m c0134m = (C0134m) this.f22734a;
        if (c0134m == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            c0134m.writeToParcel(obtain, 0);
        }
        try {
            aVar.f6929f.transact(1, obtain, null, 1);
            obtain.recycle();
            c1177i.b(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // P.InterfaceC0307h
    public void I() {
        ((NestedScrollView) this.f22734a).f9595d.abortAnimation();
    }

    @Override // Y3.g
    public int J() {
        return 1;
    }

    @Override // P.InterfaceC0302c
    public void K(int i9) {
        ((ContentInfo.Builder) this.f22734a).setFlags(i9);
    }

    public void M(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((I5.j) this.f22734a).a(0);
    }

    public void N(int i9, int i10) {
        ((I) this.f22734a).f2055a.e(i9, i10);
    }

    public void O(long j, F f9) {
        C0399f c0399f;
        ArrayList arrayList = new ArrayList(f9.size());
        for (int i9 = 0; i9 < f9.size(); i9++) {
            String path = ((B) f9.get(i9)).f7304c.getPath();
            path.getClass();
            arrayList.add(path);
        }
        for (int i10 = 0; i10 < ((s) this.f22734a).f7441f.size(); i10++) {
            if (!arrayList.contains(((U3.q) ((s) this.f22734a).f7441f.get(i10)).f7427b.f7359b.f7466b.getPath())) {
                t tVar = (t) ((s) this.f22734a).f7442g.f11404b;
                tVar.f7462n = false;
                tVar.v();
                if (((s) this.f22734a).d()) {
                    s sVar = (s) this.f22734a;
                    sVar.f7451q = true;
                    sVar.f7448n = -9223372036854775807L;
                    sVar.f7447m = -9223372036854775807L;
                    sVar.f7449o = -9223372036854775807L;
                }
            }
        }
        for (int i11 = 0; i11 < f9.size(); i11++) {
            B b9 = (B) f9.get(i11);
            s sVar2 = (s) this.f22734a;
            Uri uri = b9.f7304c;
            int i12 = 0;
            while (true) {
                ArrayList arrayList2 = sVar2.f7440e;
                if (i12 < arrayList2.size()) {
                    if (!((r) arrayList2.get(i12)).f7433d) {
                        U3.q qVar = ((r) arrayList2.get(i12)).f7430a;
                        if (qVar.f7427b.f7359b.f7466b.equals(uri)) {
                            c0399f = qVar.f7427b;
                            break;
                        }
                    }
                    i12++;
                } else {
                    c0399f = null;
                    break;
                }
            }
            if (c0399f != null) {
                long j4 = b9.f7302a;
                if (j4 != -9223372036854775807L) {
                    C0400g c0400g = c0399f.f7364g;
                    c0400g.getClass();
                    if (!c0400g.f7374h) {
                        c0399f.f7364g.f7375i = j4;
                    }
                }
                int i13 = b9.f7303b;
                C0400g c0400g2 = c0399f.f7364g;
                c0400g2.getClass();
                if (!c0400g2.f7374h) {
                    c0399f.f7364g.j = i13;
                }
                if (((s) this.f22734a).d()) {
                    s sVar3 = (s) this.f22734a;
                    if (sVar3.f7448n == sVar3.f7447m) {
                        long j9 = b9.f7302a;
                        c0399f.f7366i = j;
                        c0399f.j = j9;
                    }
                }
            }
        }
        if (((s) this.f22734a).d()) {
            s sVar4 = (s) this.f22734a;
            long j10 = sVar4.f7448n;
            long j11 = sVar4.f7447m;
            if (j10 == j11) {
                sVar4.f7448n = -9223372036854775807L;
                sVar4.f7447m = -9223372036854775807L;
                return;
            } else {
                sVar4.f7448n = -9223372036854775807L;
                sVar4.w(j11);
                return;
            }
        }
        s sVar5 = (s) this.f22734a;
        long j12 = sVar5.f7449o;
        if (j12 != -9223372036854775807L && sVar5.f7456v) {
            sVar5.w(j12);
            ((s) this.f22734a).f7449o = -9223372036854775807L;
        }
    }

    public void P() {
        S3.l lVar = (S3.l) this.f22734a;
        int i9 = lVar.f6830r - 1;
        lVar.f6830r = i9;
        if (i9 > 0) {
            return;
        }
        int i10 = 0;
        for (S3.r rVar : lVar.f6832t) {
            rVar.b();
            i10 += rVar.f6877g0.f5170a;
        }
        m0[] m0VarArr = new m0[i10];
        int i11 = 0;
        for (S3.r rVar2 : lVar.f6832t) {
            rVar2.b();
            int i12 = rVar2.f6877g0.f5170a;
            int i13 = 0;
            while (i13 < i12) {
                rVar2.b();
                m0VarArr[i11] = rVar2.f6877g0.a(i13);
                i13++;
                i11++;
            }
        }
        lVar.f6831s = new n0(m0VarArr);
        lVar.f6829q.C(lVar);
    }

    public void Q(int i9, int i10) {
        ((I) this.f22734a).f2055a.f(i9, i10);
    }

    public void R(String str, IOException iOException) {
        IOException iOException2;
        if (iOException == null) {
            iOException2 = new IOException(str);
        } else {
            iOException2 = new IOException(str, iOException);
        }
        ((s) this.f22734a).f7445k = iOException2;
    }

    public void S(A a5, S s9) {
        s sVar;
        boolean z9;
        int i9 = 0;
        while (true) {
            int i10 = s9.f5928d;
            sVar = (s) this.f22734a;
            if (i9 >= i10) {
                break;
            }
            r rVar = new r(sVar, (u) s9.get(i9), i9, sVar.f7443h);
            sVar.f7440e.add(rVar);
            rVar.f7431b.f(rVar.f7430a.f7427b, sVar.f7438c, 0);
            i9++;
        }
        C0701c c0701c = sVar.f7442g;
        long j = a5.f7300a;
        long j4 = a5.f7301b;
        long H8 = y.H(j4 - j);
        t tVar = (t) c0701c.f11404b;
        tVar.f7461m = H8;
        boolean z10 = true;
        if (j4 == -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        tVar.f7462n = !z9;
        if (j4 != -9223372036854775807L) {
            z10 = false;
        }
        tVar.f7463o = z10;
        tVar.f7464p = false;
        tVar.v();
    }

    public void T(C1917b c1917b) {
        C0952k0 c0952k0 = (C0952k0) this.f22734a;
        c0952k0.getClass();
        ArrayList arrayList = c0952k0.f15517e;
        synchronized (arrayList) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                try {
                    if (c1917b.equals(((Pair) arrayList.get(i9)).first)) {
                        Log.w(c0952k0.f15513a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            BinderC0937h0 binderC0937h0 = new BinderC0937h0(c1917b);
            arrayList.add(new Pair(c1917b, binderC0937h0));
            if (c0952k0.f15520h != null) {
                try {
                    c0952k0.f15520h.registerOnMeasurementEventListener(binderC0937h0);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(c0952k0.f15513a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c0952k0.b(new Y(c0952k0, binderC0937h0, 3));
        }
    }

    public synchronized void V() {
        C1955b c1955b = (C1955b) this.f22734a;
        ReentrantLock reentrantLock = c1955b.f22714a;
        reentrantLock.lock();
        try {
            c1955b.f22715b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void Y(int i9, String str, List list, boolean z9, boolean z10) {
        T t7;
        int i10 = i9 - 1;
        C0635i0 c0635i0 = (C0635i0) this.f22734a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        V v8 = ((C0650n0) c0635i0.f1707a).f11229i;
                        C0650n0.f(v8);
                        t7 = v8.f10976l;
                    } else if (z9) {
                        V v9 = ((C0650n0) c0635i0.f1707a).f11229i;
                        C0650n0.f(v9);
                        t7 = v9.j;
                    } else if (!z10) {
                        V v10 = ((C0650n0) c0635i0.f1707a).f11229i;
                        C0650n0.f(v10);
                        t7 = v10.f10975k;
                    } else {
                        V v11 = ((C0650n0) c0635i0.f1707a).f11229i;
                        C0650n0.f(v11);
                        t7 = v11.f10974i;
                    }
                } else {
                    V v12 = ((C0650n0) c0635i0.f1707a).f11229i;
                    C0650n0.f(v12);
                    t7 = v12.f10978n;
                }
            } else if (z9) {
                V v13 = ((C0650n0) c0635i0.f1707a).f11229i;
                C0650n0.f(v13);
                t7 = v13.f10972g;
            } else if (!z10) {
                V v14 = ((C0650n0) c0635i0.f1707a).f11229i;
                C0650n0.f(v14);
                t7 = v14.f10973h;
            } else {
                V v15 = ((C0650n0) c0635i0.f1707a).f11229i;
                C0650n0.f(v15);
                t7 = v15.f10971f;
            }
        } else {
            V v16 = ((C0650n0) c0635i0.f1707a).f11229i;
            C0650n0.f(v16);
            t7 = v16.f10977m;
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    t7.b(str);
                    return;
                } else {
                    t7.e(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            t7.d(list.get(0), list.get(1), str);
            return;
        }
        t7.c(list.get(0), str);
    }

    public void Z(String str, Bundle bundle) {
        String uri;
        C0650n0 c0650n0 = (C0650n0) this.f22734a;
        C0647m0 c0647m0 = c0650n0.j;
        C0650n0.f(c0647m0);
        c0647m0.l0();
        if (!c0650n0.a()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                C0623e0 c0623e0 = c0650n0.f11228h;
                C0650n0.d(c0623e0);
                c0623e0.f11104x.n(uri);
                c0650n0.f11233n.getClass();
                c0623e0.f11105y.g(System.currentTimeMillis());
            }
        }
    }

    @Override // Y3.g
    public int a(long j) {
        if (j < 0) {
            return 0;
        }
        return -1;
    }

    public boolean a0() {
        C0623e0 c0623e0 = ((C0650n0) this.f22734a).f11228h;
        C0650n0.d(c0623e0);
        if (c0623e0.f11105y.f() > 0) {
            return true;
        }
        return false;
    }

    @Override // P.InterfaceC0302c
    public C0305f b() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f22734a).build();
        return new C0305f(new C0701c(build));
    }

    public boolean b0() {
        if (a0()) {
            C0650n0 c0650n0 = (C0650n0) this.f22734a;
            c0650n0.f11233n.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            C0623e0 c0623e0 = c0650n0.f11228h;
            C0650n0.d(c0623e0);
            if (currentTimeMillis - c0623e0.f11105y.f() > c0650n0.f11227g.t0(null, E.f10662j0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // P.InterfaceC0302c
    public void c(Bundle bundle) {
        ((ContentInfo.Builder) this.f22734a).setExtras(bundle);
    }

    @Override // Q0.f
    public String d() {
        return ((J0.e) this.f22734a).f3599b;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [N3.M, java.io.IOException] */
    @Override // k4.H
    public B3.f e(J j, IOException iOException, int i9) {
        C0399f c0399f = (C0399f) j;
        s sVar = (s) this.f22734a;
        if (!sVar.f7453s) {
            sVar.f7445k = iOException;
        } else if (iOException.getCause() instanceof BindException) {
            int i10 = sVar.f7455u;
            sVar.f7455u = i10 + 1;
            if (i10 < 3) {
                return M.f20002d;
            }
        } else {
            sVar.f7446l = new IOException(c0399f.f7359b.f7466b.toString(), iOException);
        }
        return M.f20003e;
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [N3.M, java.io.IOException] */
    @Override // k4.H
    public void f(J j, long j4, long j9) {
        C0399f c0399f = (C0399f) j;
        s sVar = (s) this.f22734a;
        if (sVar.p() == 0) {
            if (!sVar.f7456v) {
                n nVar = sVar.f7439d;
                nVar.getClass();
                try {
                    nVar.close();
                    x xVar = new x(new O0.c(nVar));
                    nVar.f7414i = xVar;
                    xVar.a(nVar.s(nVar.f7413h));
                    nVar.f7415k = null;
                    nVar.f7420p = false;
                    nVar.f7417m = null;
                } catch (IOException e8) {
                    ((s) nVar.f7407b.f22734a).f7446l = new IOException(e8);
                }
                sVar.f7443h.getClass();
                Q6.f fVar = new Q6.f(13);
                ArrayList arrayList = sVar.f7440e;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                ArrayList arrayList3 = sVar.f7441f;
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    r rVar = (r) arrayList.get(i9);
                    if (!rVar.f7433d) {
                        U3.q qVar = rVar.f7430a;
                        r rVar2 = new r(sVar, qVar.f7426a, i9, fVar);
                        arrayList2.add(rVar2);
                        U3.q qVar2 = rVar2.f7430a;
                        rVar2.f7431b.f(qVar2.f7427b, sVar.f7438c, 0);
                        if (arrayList3.contains(qVar)) {
                            arrayList4.add(qVar2);
                        }
                    } else {
                        arrayList2.add(rVar);
                    }
                }
                F o9 = F.o(arrayList);
                arrayList.clear();
                arrayList.addAll(arrayList2);
                arrayList3.clear();
                arrayList3.addAll(arrayList4);
                for (int i10 = 0; i10 < o9.size(); i10++) {
                    ((r) o9.get(i10)).a();
                }
                sVar.f7456v = true;
                return;
            }
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList5 = sVar.f7440e;
            if (i11 < arrayList5.size()) {
                r rVar3 = (r) arrayList5.get(i11);
                if (rVar3.f7430a.f7427b == c0399f) {
                    rVar3.a();
                    return;
                }
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // Q.q
    public boolean g(View view) {
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) ((C1535g) this.f22734a).f20185d;
        if (viewPager2.f10408r) {
            viewPager2.c(currentItem, true);
        }
        return true;
    }

    @Override // D0.c
    public void h(int i9, Serializable serializable) {
        String str;
        switch (i9) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case R.styleable.GradientColor_android_endX /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case R.styleable.GradientColor_android_endY /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i9 != 6 && i9 != 7 && i9 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
        ((ProfileInstallReceiver) this.f22734a).setResultCode(i9);
    }

    @Override // q3.InterfaceC1907l
    public void i() {
        s sVar = (s) this.f22734a;
        sVar.f7437b.post(new p(sVar, 0));
    }

    @Override // F0.B0
    public int j() {
        androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) this.f22734a;
        return aVar.f10350o - aVar.H();
    }

    @Override // k4.O
    public Object k(Uri uri, C1515o c1515o) {
        try {
            XmlPullParser newPullParser = ((XmlPullParserFactory) this.f22734a).newPullParser();
            newPullParser.setInput(c1515o, null);
            return (X3.c) new X3.g(uri.toString()).e(newPullParser);
        } catch (XmlPullParserException e8) {
            throw j0.b(null, e8);
        }
    }

    @Override // b5.X
    public void l(String str, int i9, IOException iOException, byte[] bArr, Map map) {
        ((J1) this.f22734a).o(str, i9, iOException, bArr, map);
    }

    @Override // Y3.g
    public long m(int i9) {
        boolean z9;
        if (i9 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        return 0L;
    }

    @Override // F0.B0
    public int n(View view) {
        C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
        ((androidx.recyclerview.widget.a) this.f22734a).getClass();
        return androidx.recyclerview.widget.a.F(view) - ((ViewGroup.MarginLayoutParams) c0099c0).topMargin;
    }

    @Override // f5.InterfaceC1173e
    public void o(Object obj) {
        ((C1177i) ((C1183o) this.f22734a).f17433b).f17413a.p();
    }

    @Override // P.InterfaceC0307h
    public boolean p(float f9) {
        if (f9 == 0.0f) {
            return false;
        }
        I();
        ((NestedScrollView) this.f22734a).j((int) f9);
        return true;
    }

    @Override // D0.c
    public void q() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // k4.H
    public /* bridge */ /* synthetic */ void s(J j, long j4, long j9, boolean z9) {
    }

    @Override // P.InterfaceC0314o
    public u0 t(View view, u0 u0Var) {
        u0 u0Var2;
        boolean z9;
        AppBarLayout appBarLayout = (AppBarLayout) this.f22734a;
        WeakHashMap weakHashMap = Q.f5546a;
        if (appBarLayout.getFitsSystemWindows()) {
            u0Var2 = u0Var;
        } else {
            u0Var2 = null;
        }
        if (!Objects.equals(appBarLayout.f15728g, u0Var2)) {
            appBarLayout.f15728g = u0Var2;
            if (appBarLayout.f15742v != null && appBarLayout.getTopInset() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            appBarLayout.setWillNotDraw(!z9);
            appBarLayout.requestLayout();
        }
        return u0Var;
    }

    @Override // q3.InterfaceC1907l
    public q3.u u(int i9, int i10) {
        r rVar = (r) ((s) this.f22734a).f7440e.get(i9);
        rVar.getClass();
        return rVar.f7432c;
    }

    @Override // N3.e0
    public void v(f0 f0Var) {
        S3.l lVar = (S3.l) this.f22734a;
        lVar.f6829q.v(lVar);
    }

    @Override // Y3.g
    public List w(long j) {
        if (j >= 0) {
            return (List) this.f22734a;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // F0.B0
    public View x(int i9) {
        return ((androidx.recyclerview.widget.a) this.f22734a).v(i9);
    }

    @Override // F0.B0
    public int y() {
        return ((androidx.recyclerview.widget.a) this.f22734a).K();
    }

    @Override // P.InterfaceC0302c
    public void z(Uri uri) {
        ((ContentInfo.Builder) this.f22734a).setLinkUri(uri);
    }

    public i(Context context) {
        String d9;
        C1955b a5 = C1955b.a(context);
        this.f22734a = a5;
        a5.b();
        String d10 = a5.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d10) || (d9 = a5.d(C1955b.f("googleSignInOptions", d10))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.f(d9);
        } catch (JSONException unused) {
        }
    }

    public i(ArrayList arrayList) {
        this.f22734a = Collections.unmodifiableList(arrayList);
    }

    public i(int i9) {
        switch (i9) {
            case 27:
                this.f22734a = new C1185q();
                return;
            default:
                try {
                    this.f22734a = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e8) {
                    throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e8);
                }
        }
    }

    public i(EditText editText) {
        this.f22734a = new O0.c(editText);
    }

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f22734a = new R.f(uri, clipDescription, uri2);
        } else {
            this.f22734a = new android.support.v4.media.session.y(uri, clipDescription, uri2, 14);
        }
    }

    public i(ClipData clipData, int i9) {
        this.f22734a = C3.q.n(clipData, i9);
    }

    @Override // q3.InterfaceC1907l
    public void r(q3.r rVar) {
    }
}
