package l1;

import A4.m;
import F0.ExecutorC0101e;
import I5.j;
import P.Q;
import U5.k;
import U5.l;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.viewpager2.widget.ViewPager2;
import b6.AbstractC0694p;
import b6.C0679a;
import b6.C0681c;
import b6.C0687i;
import b6.C0688j;
import b6.C0689k;
import b6.C0693o;
import b6.C0695q;
import b6.C0696r;
import b6.C0697s;
import b7.C0701c;
import co.notix.R;
import com.google.android.gms.internal.measurement.C0931g;
import com.google.android.gms.internal.measurement.C0961m;
import com.google.android.gms.internal.measurement.C0971o;
import com.google.android.gms.internal.measurement.C0974o2;
import com.google.android.gms.internal.measurement.C0987r1;
import com.google.android.gms.internal.measurement.C0995t;
import com.google.android.gms.internal.measurement.InterfaceC0966n;
import com.google.android.gms.internal.measurement.p4;
import com.google.firebase.messaging.s;
import h6.Z;
import h6.f0;
import h6.r0;
import i0.AbstractC1336M;
import i0.AbstractComponentCallbacksC1366v;
import i0.C1340Q;
import i0.C1343U;
import i8.E;
import i8.x;
import i8.y;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import n.AbstractC1595a;
import n.C1599e;
import o.MenuC1656A;
import q1.InterfaceC1871a;
import s.C1939i;
import s4.i;
import s8.n;
import t0.C1980n;
import z8.C2252a;
import z8.C2253b;
import z8.J;

/* renamed from: l1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1535g {

    /* renamed from: e, reason: collision with root package name */
    public static C1535g f20180e;

    /* renamed from: f, reason: collision with root package name */
    public static C1535g f20181f;

    /* renamed from: a, reason: collision with root package name */
    public Object f20182a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20183b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20184c;

    /* renamed from: d, reason: collision with root package name */
    public Object f20185d;

    public C1535g(int i9) {
        switch (i9) {
            case 7:
                this.f20182a = new HashMap();
                this.f20183b = new HashMap();
                this.f20184c = new HashMap();
                this.f20185d = new HashMap();
                return;
            case 8:
                C0995t c0995t = new C0995t(0);
                this.f20182a = c0995t;
                s sVar = new s((s) null, c0995t);
                this.f20184c = sVar;
                this.f20183b = sVar.y();
                C0974o2 c0974o2 = new C0974o2(1);
                this.f20185d = c0974o2;
                sVar.F("require", new p4(c0974o2));
                ((HashMap) c0974o2.f15559a).put("internal.platform", new Object());
                sVar.F("runtime.counter", new C0931g(Double.valueOf(0.0d)));
                return;
            case 9:
            case R.styleable.GradientColor_android_endX /* 10 */:
            case 13:
            case 14:
            default:
                this.f20182a = new Object();
                this.f20183b = new Handler(Looper.getMainLooper(), new m(1, this));
                return;
            case R.styleable.GradientColor_android_endY /* 11 */:
                this.f20182a = new ArrayList();
                this.f20183b = new HashMap();
                this.f20184c = new HashMap();
                return;
            case 12:
                this.f20183b = new ArrayDeque();
                this.f20184c = new ArrayDeque();
                this.f20185d = new ArrayDeque();
                return;
            case 15:
                this.f20184c = new ArrayList();
                this.f20185d = new ArrayList();
                return;
        }
    }

    public static C1535g r() {
        if (f20181f == null) {
            f20181f = new C1535g(2);
        }
        return f20181f;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, l1.g] */
    public static synchronized C1535g s(Context context, InterfaceC1871a interfaceC1871a) {
        C1535g c1535g;
        synchronized (C1535g.class) {
            try {
                if (f20180e == null) {
                    ?? obj = new Object();
                    Context applicationContext = context.getApplicationContext();
                    obj.f20182a = new AbstractC1531c(applicationContext, interfaceC1871a);
                    obj.f20183b = new AbstractC1531c(applicationContext, interfaceC1871a);
                    obj.f20184c = new C1533e(applicationContext, interfaceC1871a);
                    obj.f20185d = new AbstractC1531c(applicationContext, interfaceC1871a);
                    f20180e = obj;
                }
                c1535g = f20180e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1535g;
    }

    public void A(C0679a c0679a) {
        c0679a.getClass();
        C0695q c0695q = new C0695q(C0693o.class, c0679a.f11362a);
        HashMap hashMap = (HashMap) this.f20183b;
        if (hashMap.containsKey(c0695q)) {
            C0679a c0679a2 = (C0679a) hashMap.get(c0695q);
            if (c0679a2.equals(c0679a) && c0679a.equals(c0679a2)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + c0695q);
        }
        hashMap.put(c0695q, c0679a);
    }

    public void B(C0681c c0681c) {
        C0696r c0696r = new C0696r(c0681c.f11364a, C0693o.class);
        HashMap hashMap = (HashMap) this.f20182a;
        if (hashMap.containsKey(c0696r)) {
            C0681c c0681c2 = (C0681c) hashMap.get(c0696r);
            if (c0681c2.equals(c0681c) && c0681c.equals(c0681c2)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + c0696r);
        }
        hashMap.put(c0696r, c0681c);
    }

    public void C(C0688j c0688j) {
        c0688j.getClass();
        C0695q c0695q = new C0695q(AbstractC0694p.class, c0688j.f11374a);
        HashMap hashMap = (HashMap) this.f20185d;
        if (hashMap.containsKey(c0695q)) {
            C0688j c0688j2 = (C0688j) hashMap.get(c0695q);
            if (c0688j2.equals(c0688j) && c0688j.equals(c0688j2)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + c0695q);
        }
        hashMap.put(c0695q, c0688j);
    }

    public void D(C0689k c0689k) {
        C0696r c0696r = new C0696r(c0689k.f11375a, AbstractC0694p.class);
        HashMap hashMap = (HashMap) this.f20184c;
        if (hashMap.containsKey(c0696r)) {
            C0689k c0689k2 = (C0689k) hashMap.get(c0696r);
            if (c0689k2.equals(c0689k) && c0689k.equals(c0689k2)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + c0696r);
        }
        hashMap.put(c0696r, c0689k);
    }

    public void E(I5.f fVar) {
        synchronized (this.f20182a) {
            try {
                if (t(fVar)) {
                    I5.m mVar = (I5.m) this.f20184c;
                    if (mVar.f3581c) {
                        mVar.f3581c = false;
                        G(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized int F() {
        return ((ArrayDeque) this.f20184c).size() + ((ArrayDeque) this.f20185d).size();
    }

    public void G(I5.m mVar) {
        int i9 = mVar.f3580b;
        if (i9 == -2) {
            return;
        }
        if (i9 <= 0) {
            if (i9 == -1) {
                i9 = 1500;
            } else {
                i9 = 2750;
            }
        }
        Handler handler = (Handler) this.f20183b;
        handler.removeCallbacksAndMessages(mVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, mVar), i9);
    }

    public Bundle H(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f20184c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public void I() {
        I5.m mVar = (I5.m) this.f20185d;
        if (mVar != null) {
            this.f20184c = mVar;
            this.f20185d = null;
            I5.f fVar = (I5.f) mVar.f3579a.get();
            if (fVar != null) {
                Handler handler = j.f3551y;
                handler.sendMessage(handler.obtainMessage(0, fVar.f3532a));
            } else {
                this.f20184c = null;
            }
        }
    }

    public void J() {
        int a5;
        int i9;
        ViewPager2 viewPager2 = (ViewPager2) this.f20185d;
        int i10 = android.R.id.accessibilityActionPageLeft;
        Q.j(viewPager2, android.R.id.accessibilityActionPageLeft);
        boolean z9 = false;
        Q.h(viewPager2, 0);
        Q.j(viewPager2, android.R.id.accessibilityActionPageRight);
        Q.h(viewPager2, 0);
        Q.j(viewPager2, android.R.id.accessibilityActionPageUp);
        Q.h(viewPager2, 0);
        Q.j(viewPager2, android.R.id.accessibilityActionPageDown);
        Q.h(viewPager2, 0);
        if (viewPager2.getAdapter() != null && (a5 = viewPager2.getAdapter().a()) != 0 && viewPager2.f10408r) {
            int orientation = viewPager2.getOrientation();
            C0701c c0701c = (C0701c) this.f20183b;
            i iVar = (i) this.f20182a;
            if (orientation == 0) {
                if (viewPager2.f10398g.f10338b.getLayoutDirection() == 1) {
                    z9 = true;
                }
                if (z9) {
                    i9 = 16908360;
                } else {
                    i9 = 16908361;
                }
                if (z9) {
                    i10 = 16908361;
                }
                if (viewPager2.f10395d < a5 - 1) {
                    Q.k(viewPager2, new Q.e(i9), iVar);
                }
                if (viewPager2.f10395d > 0) {
                    Q.k(viewPager2, new Q.e(i10), c0701c);
                    return;
                }
                return;
            }
            if (viewPager2.f10395d < a5 - 1) {
                Q.k(viewPager2, new Q.e(android.R.id.accessibilityActionPageDown), iVar);
            }
            if (viewPager2.f10395d > 0) {
                Q.k(viewPager2, new Q.e(android.R.id.accessibilityActionPageUp), c0701c);
            }
        }
    }

    public InterfaceC0966n K(s sVar, C0987r1... c0987r1Arr) {
        InterfaceC0966n interfaceC0966n = InterfaceC0966n.f15543N;
        for (C0987r1 c0987r1 : c0987r1Arr) {
            interfaceC0966n = v4.e.Y(c0987r1);
            n.W((s) this.f20184c);
            if ((interfaceC0966n instanceof C0971o) || (interfaceC0966n instanceof C0961m)) {
                interfaceC0966n = ((C0995t) this.f20182a).a(sVar, interfaceC0966n);
            }
        }
        return interfaceC0966n;
    }

    public void a(ArrayList arrayList) {
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        ArrayList arrayList2 = (ArrayList) this.f20184c;
                        if (!arrayList2.contains(intentFilter)) {
                            arrayList2.add(intentFilter);
                        }
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("filters must not be null");
    }

    public void b(A8.a aVar) {
        ((ArrayList) this.f20184c).add(aVar);
    }

    public void c(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        if (!((ArrayList) this.f20182a).contains(abstractComponentCallbacksC1366v)) {
            synchronized (((ArrayList) this.f20182a)) {
                ((ArrayList) this.f20182a).add(abstractComponentCallbacksC1366v);
            }
            abstractComponentCallbacksC1366v.f18399k = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC1366v);
    }

    public void d(Object obj, Object obj2, f0 f0Var, boolean z9) {
        byte[] array;
        if (((ConcurrentHashMap) this.f20183b) != null) {
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (f0Var.D() == Z.ENABLED) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f20183b;
                Integer valueOf = Integer.valueOf(f0Var.B());
                byte[] bArr = null;
                if (f0Var.C() == r0.RAW) {
                    valueOf = null;
                }
                U5.b a5 = C0687i.f11372b.a(C0693o.e(f0Var.A().B(), f0Var.A().C(), f0Var.A().A(), f0Var.C(), valueOf));
                int ordinal = f0Var.C().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        } else {
                            array = U5.b.f7495a;
                        }
                    }
                    array = ByteBuffer.allocate(5).put((byte) 0).putInt(f0Var.B()).array();
                } else {
                    array = ByteBuffer.allocate(5).put((byte) 1).putInt(f0Var.B()).array();
                }
                k kVar = new k(obj, obj2, array, f0Var.D(), f0Var.C(), f0Var.B(), f0Var.A().B(), a5);
                ArrayList arrayList = new ArrayList();
                arrayList.add(kVar);
                byte[] bArr2 = kVar.f7509c;
                if (bArr2 != null) {
                    bArr = Arrays.copyOf(bArr2, bArr2.length);
                }
                l lVar = new l(bArr);
                List list = (List) concurrentHashMap.put(lVar, Collections.unmodifiableList(arrayList));
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list);
                    arrayList2.add(kVar);
                    concurrentHashMap.put(lVar, Collections.unmodifiableList(arrayList2));
                }
                if (z9) {
                    if (((k) this.f20184c) == null) {
                        this.f20184c = kVar;
                        return;
                    }
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                return;
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addPrimitive cannot be called after build");
    }

    public void e(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        x xVar = new x();
        xVar.e(null, str);
        y b9 = xVar.b();
        if ("".equals(b9.f19174f.get(r0.size() - 1))) {
            this.f20183b = b9;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + b9);
        }
    }

    public C1980n f() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>((ArrayList) this.f20184c);
        Bundle bundle = (Bundle) this.f20182a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>((ArrayList) this.f20183b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>((HashSet) this.f20185d));
        return new C1980n(bundle);
    }

    public z8.Q g() {
        if (((y) this.f20183b) != null) {
            E e8 = (E) this.f20182a;
            if (e8 == null) {
                e8 = new E();
            }
            ExecutorC0101e executorC0101e = J.f25535a;
            C2252a c2252a = J.f25537c;
            ArrayList arrayList = new ArrayList((ArrayList) this.f20185d);
            List a5 = c2252a.a(executorC0101e);
            arrayList.addAll(a5);
            List c3 = c2252a.c();
            int size = c3.size();
            ArrayList arrayList2 = (ArrayList) this.f20184c;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
            arrayList3.add(new C2253b(0));
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(c3);
            y yVar = (y) this.f20183b;
            List unmodifiableList = Collections.unmodifiableList(arrayList3);
            List unmodifiableList2 = Collections.unmodifiableList(arrayList);
            a5.size();
            return new z8.Q(e8, yVar, unmodifiableList, unmodifiableList2);
        }
        throw new IllegalStateException("Base URL required.");
    }

    public boolean h(I5.m mVar, int i9) {
        I5.f fVar = (I5.f) mVar.f3579a.get();
        if (fVar == null) {
            return false;
        }
        ((Handler) this.f20183b).removeCallbacksAndMessages(mVar);
        Handler handler = j.f3551y;
        handler.sendMessage(handler.obtainMessage(1, i9, 0, fVar.f3532a));
        return true;
    }

    public synchronized ExecutorService i() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f20182a) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = k8.c.f20147g + " Dispatcher";
                h.e(name, "name");
                this.f20182a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new k8.b(name, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f20182a;
            h.b(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public AbstractComponentCallbacksC1366v j(String str) {
        C1343U c1343u = (C1343U) ((HashMap) this.f20183b).get(str);
        if (c1343u != null) {
            return c1343u.f18251c;
        }
        return null;
    }

    public AbstractComponentCallbacksC1366v k(String str) {
        for (C1343U c1343u : ((HashMap) this.f20183b).values()) {
            if (c1343u != null) {
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = c1343u.f18251c;
                if (!str.equals(abstractComponentCallbacksC1366v.f18389e)) {
                    abstractComponentCallbacksC1366v = abstractComponentCallbacksC1366v.f18418u.f18198c.k(str);
                }
                if (abstractComponentCallbacksC1366v != null) {
                    return abstractComponentCallbacksC1366v;
                }
            }
        }
        return null;
    }

    public void l(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        z();
    }

    public void m(n8.d dVar) {
        dVar.f21258b.decrementAndGet();
        l((ArrayDeque) this.f20184c, dVar);
    }

    public C1599e n(AbstractC1595a abstractC1595a) {
        ArrayList arrayList = (ArrayList) this.f20184c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            C1599e c1599e = (C1599e) arrayList.get(i9);
            if (c1599e != null && c1599e.f20952b == abstractC1595a) {
                return c1599e;
            }
        }
        C1599e c1599e2 = new C1599e((Context) this.f20183b, abstractC1595a);
        arrayList.add(c1599e2);
        return c1599e2;
    }

    public ArrayList o() {
        ArrayList arrayList = new ArrayList();
        for (C1343U c1343u : ((HashMap) this.f20183b).values()) {
            if (c1343u != null) {
                arrayList.add(c1343u);
            }
        }
        return arrayList;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (C1343U c1343u : ((HashMap) this.f20183b).values()) {
            if (c1343u != null) {
                arrayList.add(c1343u.f18251c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List q() {
        ArrayList arrayList;
        if (((ArrayList) this.f20182a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f20182a)) {
            arrayList = new ArrayList((ArrayList) this.f20182a);
        }
        return arrayList;
    }

    public boolean t(I5.f fVar) {
        I5.m mVar = (I5.m) this.f20184c;
        if (mVar != null && fVar != null && mVar.f3579a.get() == fVar) {
            return true;
        }
        return false;
    }

    public void u(C1343U c1343u) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = c1343u.f18251c;
        String str = abstractComponentCallbacksC1366v.f18389e;
        HashMap hashMap = (HashMap) this.f20183b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC1366v.f18389e, c1343u);
        if (AbstractC1336M.H(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC1366v);
        }
    }

    public void v(C1343U c1343u) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = c1343u.f18251c;
        if (abstractComponentCallbacksC1366v.f18380B) {
            ((C1340Q) this.f20185d).g(abstractComponentCallbacksC1366v);
        }
        HashMap hashMap = (HashMap) this.f20183b;
        if (hashMap.get(abstractComponentCallbacksC1366v.f18389e) == c1343u && ((C1343U) hashMap.put(abstractComponentCallbacksC1366v.f18389e, null)) != null && AbstractC1336M.H(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC1366v);
        }
    }

    public boolean w(AbstractC1595a abstractC1595a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f20182a).onActionItemClicked(n(abstractC1595a), new o.s((Context) this.f20183b, (J.a) menuItem));
    }

    public boolean x(AbstractC1595a abstractC1595a, o.l lVar) {
        C1599e n7 = n(abstractC1595a);
        C1939i c1939i = (C1939i) this.f20185d;
        Menu menu = (Menu) c1939i.get(lVar);
        if (menu == null) {
            menu = new MenuC1656A((Context) this.f20183b, lVar);
            c1939i.put(lVar, menu);
        }
        return ((ActionMode.Callback) this.f20182a).onCreateActionMode(n7, menu);
    }

    public void y(I5.f fVar) {
        synchronized (this.f20182a) {
            try {
                if (t(fVar)) {
                    I5.m mVar = (I5.m) this.f20184c;
                    if (!mVar.f3581c) {
                        mVar.f3581c = true;
                        ((Handler) this.f20183b).removeCallbacksAndMessages(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        byte[] bArr = k8.c.f20141a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f20183b).iterator();
                h.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    n8.d dVar = (n8.d) it.next();
                    if (((ArrayDeque) this.f20184c).size() >= 64) {
                        break;
                    }
                    if (dVar.f21258b.get() < 5) {
                        it.remove();
                        dVar.f21258b.incrementAndGet();
                        arrayList.add(dVar);
                        ((ArrayDeque) this.f20184c).add(dVar);
                    }
                }
                F();
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            n8.d dVar2 = (n8.d) arrayList.get(i9);
            ExecutorService i10 = i();
            dVar2.getClass();
            n8.g gVar = dVar2.f21259c;
            C1535g c1535g = gVar.f21262a.f18972a;
            byte[] bArr2 = k8.c.f20141a;
            try {
                try {
                    ((ThreadPoolExecutor) i10).execute(dVar2);
                } catch (RejectedExecutionException e8) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e8);
                    gVar.l(interruptedIOException);
                    dVar2.f21257a.f(gVar, interruptedIOException);
                    gVar.f21262a.f18972a.m(dVar2);
                }
            } catch (Throwable th2) {
                gVar.f21262a.f18972a.m(dVar2);
                throw th2;
            }
        }
    }

    public C1535g(C0697s c0697s) {
        this.f20182a = new HashMap(c0697s.f11393a);
        this.f20183b = new HashMap(c0697s.f11394b);
        this.f20184c = new HashMap(c0697s.f11395c);
        this.f20185d = new HashMap(c0697s.f11396d);
    }

    public C1535g(String str, String str2) {
        this.f20183b = new ArrayList();
        this.f20184c = new ArrayList();
        this.f20185d = new HashSet();
        Bundle bundle = new Bundle();
        this.f20182a = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            }
            throw new NullPointerException("name must not be null");
        }
        throw new NullPointerException("id must not be null");
    }
}
