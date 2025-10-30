package i0;

import B6.u0;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0563y;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.InterfaceC0550k;
import androidx.lifecycle.InterfaceC0561w;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.C1;
import f5.C1183o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k4.C1499E;
import m0.C1581d;

/* renamed from: i0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC1366v implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0561w, k0, InterfaceC0550k, N0.g {

    /* renamed from: u0, reason: collision with root package name */
    public static final Object f18378u0 = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f18379A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f18380B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f18382D;

    /* renamed from: X, reason: collision with root package name */
    public ViewGroup f18383X;
    public View Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f18384Z;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f18386b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f18387c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f18388d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f18390f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC1366v f18392g;

    /* renamed from: g0, reason: collision with root package name */
    public C1363s f18393g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f18395h0;

    /* renamed from: i, reason: collision with root package name */
    public int f18396i;

    /* renamed from: i0, reason: collision with root package name */
    public LayoutInflater f18397i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f18398j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18399k;

    /* renamed from: k0, reason: collision with root package name */
    public String f18400k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18401l;

    /* renamed from: l0, reason: collision with root package name */
    public EnumC0555p f18402l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18403m;

    /* renamed from: m0, reason: collision with root package name */
    public C0563y f18404m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18405n;

    /* renamed from: n0, reason: collision with root package name */
    public W f18406n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18407o;

    /* renamed from: o0, reason: collision with root package name */
    public final androidx.lifecycle.E f18408o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18409p;

    /* renamed from: p0, reason: collision with root package name */
    public androidx.lifecycle.b0 f18410p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18411q;

    /* renamed from: q0, reason: collision with root package name */
    public C1 f18412q0;

    /* renamed from: r, reason: collision with root package name */
    public int f18413r;
    public final AtomicInteger r0;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC1336M f18414s;

    /* renamed from: s0, reason: collision with root package name */
    public final ArrayList f18415s0;

    /* renamed from: t, reason: collision with root package name */
    public C1368x f18416t;

    /* renamed from: t0, reason: collision with root package name */
    public final C1360p f18417t0;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC1366v f18419v;

    /* renamed from: w, reason: collision with root package name */
    public int f18420w;

    /* renamed from: x, reason: collision with root package name */
    public int f18421x;

    /* renamed from: y, reason: collision with root package name */
    public String f18422y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f18423z;

    /* renamed from: a, reason: collision with root package name */
    public int f18385a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f18389e = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    public String f18394h = null;
    public Boolean j = null;

    /* renamed from: u, reason: collision with root package name */
    public C1337N f18418u = new AbstractC1336M();

    /* renamed from: C, reason: collision with root package name */
    public boolean f18381C = true;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f18391f0 = true;

    /* JADX WARN: Type inference failed for: r0v4, types: [i0.M, i0.N] */
    public AbstractComponentCallbacksC1366v() {
        new A4.e(26, this);
        this.f18402l0 = EnumC0555p.f9897e;
        this.f18408o0 = new androidx.lifecycle.E();
        this.r0 = new AtomicInteger();
        this.f18415s0 = new ArrayList();
        this.f18417t0 = new C1360p(this);
        v();
    }

    public final boolean A() {
        if (this.f18413r > 0) {
            return true;
        }
        return false;
    }

    public void B() {
        this.f18382D = true;
    }

    public void C(int i9, int i10, Intent intent) {
        if (AbstractC1336M.H(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i9 + " resultCode: " + i10 + " data: " + intent);
        }
    }

    public void D(Activity activity) {
        this.f18382D = true;
    }

    public void E(Context context) {
        AbstractActivityC1369y abstractActivityC1369y;
        this.f18382D = true;
        C1368x c1368x = this.f18416t;
        if (c1368x == null) {
            abstractActivityC1369y = null;
        } else {
            abstractActivityC1369y = c1368x.f18426n;
        }
        if (abstractActivityC1369y != null) {
            this.f18382D = false;
            D(abstractActivityC1369y);
        }
    }

    public void F(Bundle bundle) {
        this.f18382D = true;
        a0();
        C1337N c1337n = this.f18418u;
        if (c1337n.f18214t >= 1) {
            return;
        }
        c1337n.f18188F = false;
        c1337n.f18189G = false;
        c1337n.f18194M.f18235i = false;
        c1337n.t(1);
    }

    public View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void H() {
        this.f18382D = true;
    }

    public void I() {
        this.f18382D = true;
    }

    public void J() {
        this.f18382D = true;
    }

    public LayoutInflater K(Bundle bundle) {
        C1368x c1368x = this.f18416t;
        if (c1368x != null) {
            AbstractActivityC1369y abstractActivityC1369y = c1368x.f18430r;
            LayoutInflater cloneInContext = abstractActivityC1369y.getLayoutInflater().cloneInContext(abstractActivityC1369y);
            cloneInContext.setFactory2(this.f18418u.f18201f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void M(Context context, AttributeSet attributeSet, Bundle bundle) {
        AbstractActivityC1369y abstractActivityC1369y;
        this.f18382D = true;
        C1368x c1368x = this.f18416t;
        if (c1368x == null) {
            abstractActivityC1369y = null;
        } else {
            abstractActivityC1369y = c1368x.f18426n;
        }
        if (abstractActivityC1369y != null) {
            this.f18382D = true;
        }
    }

    public void N() {
        this.f18382D = true;
    }

    public void O() {
        this.f18382D = true;
    }

    public void Q() {
        this.f18382D = true;
    }

    public void R() {
        this.f18382D = true;
    }

    public void T(Bundle bundle) {
        this.f18382D = true;
    }

    public void U(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f18418u.O();
        this.f18411q = true;
        this.f18406n0 = new W(this, u(), new A6.s(23, this));
        View G8 = G(layoutInflater, viewGroup);
        this.Y = G8;
        if (G8 != null) {
            this.f18406n0.b();
            if (AbstractC1336M.H(3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.Y + " for Fragment " + this);
            }
            View view = this.Y;
            W w7 = this.f18406n0;
            kotlin.jvm.internal.h.e(view, "<this>");
            view.setTag(R.id.view_tree_lifecycle_owner, w7);
            View view2 = this.Y;
            W w9 = this.f18406n0;
            kotlin.jvm.internal.h.e(view2, "<this>");
            view2.setTag(R.id.view_tree_view_model_store_owner, w9);
            View view3 = this.Y;
            W w10 = this.f18406n0;
            kotlin.jvm.internal.h.e(view3, "<this>");
            view3.setTag(R.id.view_tree_saved_state_registry_owner, w10);
            this.f18408o0.i(this.f18406n0);
            return;
        }
        if (this.f18406n0.f18267e == null) {
            this.f18406n0 = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final f.c V(f.b bVar, v4.e eVar) {
        M1.n nVar = (M1.n) this;
        C1183o c1183o = new C1183o(2, nVar);
        if (this.f18385a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            C1362r c1362r = new C1362r(nVar, c1183o, atomicReference, eVar, bVar);
            if (this.f18385a >= 0) {
                c1362r.a();
            } else {
                this.f18415s0.add(c1362r);
            }
            return new C1359o(atomicReference);
        }
        throw new IllegalStateException(AbstractC0953k1.m("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    public final AbstractActivityC1369y W() {
        AbstractActivityC1369y k5 = k();
        if (k5 != null) {
            return k5;
        }
        throw new IllegalStateException(AbstractC0953k1.m("Fragment ", this, " not attached to an activity."));
    }

    public final Context X() {
        Context m9 = m();
        if (m9 != null) {
            return m9;
        }
        throw new IllegalStateException(AbstractC0953k1.m("Fragment ", this, " not attached to a context."));
    }

    public final AbstractComponentCallbacksC1366v Y() {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18419v;
        if (abstractComponentCallbacksC1366v == null) {
            if (m() == null) {
                throw new IllegalStateException(AbstractC0953k1.m("Fragment ", this, " is not attached to any Fragment or host"));
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + m());
        }
        return abstractComponentCallbacksC1366v;
    }

    public final View Z() {
        View view = this.Y;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(AbstractC0953k1.m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [i0.H, java.lang.Object] */
    public final void a(Intent intent, int i9) {
        if (this.f18416t != null) {
            AbstractC1336M o9 = o();
            if (o9.f18183A != null) {
                String str = this.f18389e;
                ?? obj = new Object();
                obj.f18174a = str;
                obj.f18175b = i9;
                o9.f18186D.addLast(obj);
                o9.f18183A.a(intent);
                return;
            }
            C1368x c1368x = o9.f18215u;
            if (i9 == -1) {
                c1368x.f18427o.startActivity(intent, null);
                return;
            } else {
                c1368x.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
        throw new IllegalStateException(AbstractC0953k1.m("Fragment ", this, " not attached to Activity"));
    }

    public final void a0() {
        Bundle bundle;
        Bundle bundle2 = this.f18386b;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.f18418u.U(bundle);
            C1337N c1337n = this.f18418u;
            c1337n.f18188F = false;
            c1337n.f18189G = false;
            c1337n.f18194M.f18235i = false;
            c1337n.t(1);
        }
    }

    public final void b0(int i9, int i10, int i11, int i12) {
        if (this.f18393g0 == null && i9 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        i().f18368b = i9;
        i().f18369c = i10;
        i().f18370d = i11;
        i().f18371e = i12;
    }

    @Override // N0.g
    public final N0.f c() {
        return (N0.f) this.f18412q0.f15188c;
    }

    public final void c0(Bundle bundle) {
        boolean M7;
        AbstractC1336M abstractC1336M = this.f18414s;
        if (abstractC1336M != null) {
            if (abstractC1336M == null) {
                M7 = false;
            } else {
                M7 = abstractC1336M.M();
            }
            if (M7) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f18390f = bundle;
    }

    public final void d0(Intent intent) {
        C1368x c1368x = this.f18416t;
        if (c1368x != null) {
            c1368x.f18427o.startActivity(intent, null);
            return;
        }
        throw new IllegalStateException(AbstractC0953k1.m("Fragment ", this, " not attached to Activity"));
    }

    public Activity f() {
        return k();
    }

    public u0 g() {
        return new C1361q(this);
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z9;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f18420w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f18421x));
        printWriter.print(" mTag=");
        printWriter.println(this.f18422y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f18385a);
        printWriter.print(" mWho=");
        printWriter.print(this.f18389e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f18413r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f18399k);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f18401l);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f18405n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f18407o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f18423z);
        printWriter.print(" mDetached=");
        printWriter.print(this.f18379A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f18381C);
        printWriter.print(" mHasMenu=");
        int i16 = 0;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f18380B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f18391f0);
        if (this.f18414s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f18414s);
        }
        if (this.f18416t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f18416t);
        }
        if (this.f18419v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f18419v);
        }
        if (this.f18390f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f18390f);
        }
        if (this.f18386b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f18386b);
        }
        if (this.f18387c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f18387c);
        }
        if (this.f18388d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f18388d);
        }
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18392g;
        if (abstractComponentCallbacksC1366v == null) {
            AbstractC1336M abstractC1336M = this.f18414s;
            if (abstractC1336M != null && (str2 = this.f18394h) != null) {
                abstractComponentCallbacksC1366v = abstractC1336M.f18198c.j(str2);
            } else {
                abstractComponentCallbacksC1366v = null;
            }
        }
        if (abstractComponentCallbacksC1366v != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(abstractComponentCallbacksC1366v);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f18396i);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        C1363s c1363s = this.f18393g0;
        if (c1363s == null) {
            z9 = false;
        } else {
            z9 = c1363s.f18367a;
        }
        printWriter.println(z9);
        C1363s c1363s2 = this.f18393g0;
        if (c1363s2 == null) {
            i9 = 0;
        } else {
            i9 = c1363s2.f18368b;
        }
        if (i9 != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C1363s c1363s3 = this.f18393g0;
            if (c1363s3 == null) {
                i15 = 0;
            } else {
                i15 = c1363s3.f18368b;
            }
            printWriter.println(i15);
        }
        C1363s c1363s4 = this.f18393g0;
        if (c1363s4 == null) {
            i10 = 0;
        } else {
            i10 = c1363s4.f18369c;
        }
        if (i10 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C1363s c1363s5 = this.f18393g0;
            if (c1363s5 == null) {
                i14 = 0;
            } else {
                i14 = c1363s5.f18369c;
            }
            printWriter.println(i14);
        }
        C1363s c1363s6 = this.f18393g0;
        if (c1363s6 == null) {
            i11 = 0;
        } else {
            i11 = c1363s6.f18370d;
        }
        if (i11 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C1363s c1363s7 = this.f18393g0;
            if (c1363s7 == null) {
                i13 = 0;
            } else {
                i13 = c1363s7.f18370d;
            }
            printWriter.println(i13);
        }
        C1363s c1363s8 = this.f18393g0;
        if (c1363s8 == null) {
            i12 = 0;
        } else {
            i12 = c1363s8.f18371e;
        }
        if (i12 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C1363s c1363s9 = this.f18393g0;
            if (c1363s9 != null) {
                i16 = c1363s9.f18371e;
            }
            printWriter.println(i16);
        }
        if (this.f18383X != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f18383X);
        }
        if (this.Y != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.Y);
        }
        if (m() != null) {
            C1499E.i(this).d(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f18418u + ":");
        this.f18418u.u(AbstractC0953k1.n(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, i0.s] */
    public final C1363s i() {
        if (this.f18393g0 == null) {
            ?? obj = new Object();
            Object obj2 = f18378u0;
            obj.f18373g = obj2;
            obj.f18374h = obj2;
            obj.f18375i = obj2;
            obj.j = 1.0f;
            obj.f18376k = null;
            this.f18393g0 = obj;
        }
        return this.f18393g0;
    }

    public h0 j() {
        Application application;
        if (this.f18414s != null) {
            if (this.f18410p0 == null) {
                Context applicationContext = X().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && AbstractC1336M.H(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + X().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.f18410p0 = new androidx.lifecycle.b0(application, this, this.f18390f);
            }
            return this.f18410p0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final AbstractActivityC1369y k() {
        C1368x c1368x = this.f18416t;
        if (c1368x == null) {
            return null;
        }
        return c1368x.f18426n;
    }

    public final AbstractC1336M l() {
        if (this.f18416t != null) {
            return this.f18418u;
        }
        throw new IllegalStateException(AbstractC0953k1.m("Fragment ", this, " has not been attached yet."));
    }

    public Context m() {
        C1368x c1368x = this.f18416t;
        if (c1368x == null) {
            return null;
        }
        return c1368x.f18427o;
    }

    public final int n() {
        EnumC0555p enumC0555p = this.f18402l0;
        if (enumC0555p != EnumC0555p.f9894b && this.f18419v != null) {
            return Math.min(enumC0555p.ordinal(), this.f18419v.n());
        }
        return enumC0555p.ordinal();
    }

    public final AbstractC1336M o() {
        AbstractC1336M abstractC1336M = this.f18414s;
        if (abstractC1336M != null) {
            return abstractC1336M;
        }
        throw new IllegalStateException(AbstractC0953k1.m("Fragment ", this, " not associated with a fragment manager."));
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f18382D = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        W().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f18382D = true;
    }

    @Override // androidx.lifecycle.InterfaceC0550k
    public final C1581d p() {
        Application application;
        Context applicationContext = X().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && AbstractC1336M.H(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + X().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C1581d c1581d = new C1581d(0);
        LinkedHashMap linkedHashMap = c1581d.f20661a;
        if (application != null) {
            linkedHashMap.put(f0.f9883a, application);
        }
        linkedHashMap.put(androidx.lifecycle.Y.f9853a, this);
        linkedHashMap.put(androidx.lifecycle.Y.f9854b, this);
        Bundle bundle = this.f18390f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.Y.f9855c, bundle);
        }
        return c1581d;
    }

    public final Resources q() {
        return X().getResources();
    }

    public final String r(int i9) {
        return q().getString(i9);
    }

    public final String s(int i9, Object... objArr) {
        return q().getString(i9, objArr);
    }

    public final W t() {
        W w7 = this.f18406n0;
        if (w7 != null) {
            return w7;
        }
        throw new IllegalStateException(AbstractC0953k1.m("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f18389e);
        if (this.f18420w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f18420w));
        }
        if (this.f18422y != null) {
            sb.append(" tag=");
            sb.append(this.f18422y);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // androidx.lifecycle.k0
    public final j0 u() {
        if (this.f18414s != null) {
            if (n() != 1) {
                HashMap hashMap = this.f18414s.f18194M.f18232f;
                j0 j0Var = (j0) hashMap.get(this.f18389e);
                if (j0Var == null) {
                    j0 j0Var2 = new j0();
                    hashMap.put(this.f18389e, j0Var2);
                    return j0Var2;
                }
                return j0Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final void v() {
        this.f18404m0 = new C0563y(this);
        this.f18412q0 = new C1(this);
        this.f18410p0 = null;
        ArrayList arrayList = this.f18415s0;
        C1360p c1360p = this.f18417t0;
        if (!arrayList.contains(c1360p)) {
            if (this.f18385a >= 0) {
                c1360p.a();
            } else {
                arrayList.add(c1360p);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [i0.M, i0.N] */
    public final void w() {
        v();
        this.f18400k0 = this.f18389e;
        this.f18389e = UUID.randomUUID().toString();
        this.f18399k = false;
        this.f18401l = false;
        this.f18405n = false;
        this.f18407o = false;
        this.f18409p = false;
        this.f18413r = 0;
        this.f18414s = null;
        this.f18418u = new AbstractC1336M();
        this.f18416t = null;
        this.f18420w = 0;
        this.f18421x = 0;
        this.f18422y = null;
        this.f18423z = false;
        this.f18379A = false;
    }

    @Override // androidx.lifecycle.InterfaceC0561w
    public final D.n x() {
        return this.f18404m0;
    }

    public final boolean y() {
        if (this.f18416t != null && this.f18399k) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        boolean z9;
        if (!this.f18423z) {
            AbstractC1336M abstractC1336M = this.f18414s;
            if (abstractC1336M != null) {
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18419v;
                abstractC1336M.getClass();
                if (abstractComponentCallbacksC1366v == null) {
                    z9 = false;
                } else {
                    z9 = abstractComponentCallbacksC1366v.z();
                }
                if (z9) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public void L() {
    }

    public void P(Bundle bundle) {
    }

    public void S(View view) {
    }
}
