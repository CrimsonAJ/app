package d;

import B6.u0;
import D.x;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.support.v4.media.session.y;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0563y;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.InterfaceC0550k;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import co.notix.R;
import com.google.android.gms.internal.measurement.C1;
import e.InterfaceC1132a;
import i0.AbstractActivityC1369y;
import i0.C1328E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import m0.C1581d;

/* renamed from: d.l */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1071l extends D.e implements k0, InterfaceC0550k, N0.g {

    /* renamed from: b */
    public final B4.i f16586b = new B4.i();

    /* renamed from: c */
    public final y f16587c;

    /* renamed from: d */
    public final C0563y f16588d;

    /* renamed from: e */
    public final C1 f16589e;

    /* renamed from: f */
    public j0 f16590f;

    /* renamed from: g */
    public b0 f16591g;

    /* renamed from: h */
    public C1082w f16592h;

    /* renamed from: i */
    public final ExecutorC1070k f16593i;
    public final C1 j;

    /* renamed from: k */
    public final AtomicInteger f16594k;

    /* renamed from: l */
    public final C1065f f16595l;

    /* renamed from: m */
    public final CopyOnWriteArrayList f16596m;

    /* renamed from: n */
    public final CopyOnWriteArrayList f16597n;

    /* renamed from: o */
    public final CopyOnWriteArrayList f16598o;

    /* renamed from: p */
    public final CopyOnWriteArrayList f16599p;

    /* renamed from: q */
    public final CopyOnWriteArrayList f16600q;

    /* renamed from: r */
    public boolean f16601r;

    /* renamed from: s */
    public boolean f16602s;

    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.measurement.C1, java.lang.Object] */
    public AbstractActivityC1071l() {
        AbstractActivityC1369y abstractActivityC1369y = (AbstractActivityC1369y) this;
        this.f16587c = new y(new A6.s(17, abstractActivityC1369y));
        C0563y c0563y = new C0563y(this);
        this.f16588d = c0563y;
        C1 c12 = new C1(this);
        this.f16589e = c12;
        this.f16592h = null;
        this.f16593i = new ExecutorC1070k(abstractActivityC1369y);
        new B2.i(9, abstractActivityC1369y);
        ?? obj = new Object();
        obj.f15187b = new Object();
        obj.f15188c = new ArrayList();
        this.j = obj;
        this.f16594k = new AtomicInteger();
        this.f16595l = new C1065f(abstractActivityC1369y);
        this.f16596m = new CopyOnWriteArrayList();
        this.f16597n = new CopyOnWriteArrayList();
        this.f16598o = new CopyOnWriteArrayList();
        this.f16599p = new CopyOnWriteArrayList();
        this.f16600q = new CopyOnWriteArrayList();
        this.f16601r = false;
        this.f16602s = false;
        int i9 = Build.VERSION.SDK_INT;
        c0563y.V(new C1066g(abstractActivityC1369y, 0));
        c0563y.V(new C1066g(abstractActivityC1369y, 1));
        c0563y.V(new C1066g(abstractActivityC1369y, 2));
        c12.a();
        Y.e(this);
        if (i9 <= 23) {
            C1067h c1067h = new C1067h();
            c1067h.f16580b = this;
            c0563y.V(c1067h);
        }
        ((N0.f) c12.f15188c).f("android:support:activity-result", new C1063d(abstractActivityC1369y, 0));
        J(new C1064e(abstractActivityC1369y, 0));
    }

    public static /* synthetic */ void D(AbstractActivityC1071l abstractActivityC1071l) {
        super.onBackPressed();
    }

    public final void H(O.a aVar) {
        this.f16596m.add(aVar);
    }

    public final void J(InterfaceC1132a interfaceC1132a) {
        B4.i iVar = this.f16586b;
        iVar.getClass();
        if (((AbstractActivityC1071l) iVar.f705b) != null) {
            interfaceC1132a.a();
        }
        ((CopyOnWriteArraySet) iVar.f704a).add(interfaceC1132a);
    }

    public final C1082w L() {
        if (this.f16592h == null) {
            this.f16592h = new C1082w(new A4.e(19, this));
            this.f16588d.V(new C1067h(this));
        }
        return this.f16592h;
    }

    public final void O() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.h.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.h.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.h.e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.h.e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        O();
        this.f16593i.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // N0.g
    public final N0.f c() {
        return (N0.f) this.f16589e.f15188c;
    }

    public h0 j() {
        Bundle bundle;
        if (this.f16591g == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.f16591g = new b0(application, this, bundle);
        }
        return this.f16591g;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        if (!this.f16595l.a(i9, i10, intent)) {
            super.onActivityResult(i9, i10, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        L().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f16596m.iterator();
        while (it.hasNext()) {
            ((O.a) it.next()).a(configuration);
        }
    }

    @Override // D.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f16589e.b(bundle);
        B4.i iVar = this.f16586b;
        iVar.getClass();
        iVar.f705b = this;
        Iterator it = ((CopyOnWriteArraySet) iVar.f704a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1132a) it.next()).a();
        }
        super.onCreate(bundle);
        int i9 = S.f9836b;
        P.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i9, Menu menu) {
        if (i9 == 0) {
            super.onCreatePanelMenu(i9, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.f16587c.f9332c).iterator();
            while (it.hasNext()) {
                ((C1328E) it.next()).f18170a.j();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i9, MenuItem menuItem) {
        if (super.onMenuItemSelected(i9, menuItem)) {
            return true;
        }
        if (i9 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f16587c.f9332c).iterator();
            while (it.hasNext()) {
                if (((C1328E) it.next()).f18170a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z9) {
        if (this.f16601r) {
            return;
        }
        Iterator it = this.f16599p.iterator();
        while (it.hasNext()) {
            ((O.a) it.next()).a(new D.f(z9));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f16598o.iterator();
        while (it.hasNext()) {
            ((O.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i9, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f16587c.f9332c).iterator();
        while (it.hasNext()) {
            ((C1328E) it.next()).f18170a.p();
        }
        super.onPanelClosed(i9, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z9) {
        if (this.f16602s) {
            return;
        }
        Iterator it = this.f16600q.iterator();
        while (it.hasNext()) {
            ((O.a) it.next()).a(new x(z9));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i9, View view, Menu menu) {
        if (i9 == 0) {
            super.onPreparePanel(i9, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.f16587c.f9332c).iterator();
            while (it.hasNext()) {
                ((C1328E) it.next()).f18170a.s();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        if (!this.f16595l.a(i9, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i9, strArr, iArr);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d.j, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C1069j c1069j;
        j0 j0Var = this.f16590f;
        if (j0Var == null && (c1069j = (C1069j) getLastNonConfigurationInstance()) != null) {
            j0Var = c1069j.f16581a;
        }
        if (j0Var == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f16581a = j0Var;
        return obj;
    }

    @Override // D.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0563y c0563y = this.f16588d;
        if (c0563y != null) {
            c0563y.q0(EnumC0555p.f9895c);
        }
        super.onSaveInstanceState(bundle);
        this.f16589e.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i9) {
        super.onTrimMemory(i9);
        Iterator it = this.f16597n.iterator();
        while (it.hasNext()) {
            ((O.a) it.next()).a(Integer.valueOf(i9));
        }
    }

    @Override // androidx.lifecycle.InterfaceC0550k
    public final C1581d p() {
        C1581d c1581d = new C1581d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c1581d.f20661a;
        if (application != null) {
            linkedHashMap.put(f0.f9883a, getApplication());
        }
        linkedHashMap.put(Y.f9853a, this);
        linkedHashMap.put(Y.f9854b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(Y.f9855c, getIntent().getExtras());
        }
        return c1581d;
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (u0.C()) {
                u0.d("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C1 c12 = this.j;
            synchronized (c12.f15187b) {
                try {
                    c12.f15186a = true;
                    ArrayList arrayList = (ArrayList) c12.f15188c;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        ((O7.a) obj).invoke();
                    }
                    ((ArrayList) c12.f15188c).clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i9) {
        O();
        this.f16593i.a(getWindow().getDecorView());
        super.setContentView(i9);
    }

    @Override // androidx.lifecycle.k0
    public final j0 u() {
        if (getApplication() != null) {
            if (this.f16590f == null) {
                C1069j c1069j = (C1069j) getLastNonConfigurationInstance();
                if (c1069j != null) {
                    this.f16590f = c1069j.f16581a;
                }
                if (this.f16590f == null) {
                    this.f16590f = new j0();
                }
            }
            return this.f16590f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.lifecycle.InterfaceC0561w
    public final D.n x() {
        return this.f16588d;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z9, Configuration newConfig) {
        this.f16601r = true;
        try {
            super.onMultiWindowModeChanged(z9, newConfig);
            this.f16601r = false;
            Iterator it = this.f16599p.iterator();
            while (it.hasNext()) {
                O.a aVar = (O.a) it.next();
                kotlin.jvm.internal.h.e(newConfig, "newConfig");
                aVar.a(new D.f(z9));
            }
        } catch (Throwable th) {
            this.f16601r = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z9, Configuration newConfig) {
        this.f16602s = true;
        try {
            super.onPictureInPictureModeChanged(z9, newConfig);
            this.f16602s = false;
            Iterator it = this.f16600q.iterator();
            while (it.hasNext()) {
                O.a aVar = (O.a) it.next();
                kotlin.jvm.internal.h.e(newConfig, "newConfig");
                aVar.a(new x(z9));
            }
        } catch (Throwable th) {
            this.f16602s = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        O();
        this.f16593i.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        O();
        this.f16593i.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
