package u0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0563y;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.InterfaceC0550k;
import androidx.lifecycle.InterfaceC0561w;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.google.android.gms.internal.measurement.C1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import m0.C1581d;

/* renamed from: u0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2042m implements InterfaceC0561w, k0, InterfaceC0550k, N0.g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23495a;

    /* renamed from: b, reason: collision with root package name */
    public C f23496b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f23497c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0555p f23498d;

    /* renamed from: e, reason: collision with root package name */
    public final C2049u f23499e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23500f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f23501g;

    /* renamed from: h, reason: collision with root package name */
    public final C0563y f23502h = new C0563y(this);

    /* renamed from: i, reason: collision with root package name */
    public final C1 f23503i = new C1(this);
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final A7.l f23504k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC0555p f23505l;

    /* renamed from: m, reason: collision with root package name */
    public final b0 f23506m;

    public C2042m(Context context, C c3, Bundle bundle, EnumC0555p enumC0555p, C2049u c2049u, String str, Bundle bundle2) {
        this.f23495a = context;
        this.f23496b = c3;
        this.f23497c = bundle;
        this.f23498d = enumC0555p;
        this.f23499e = c2049u;
        this.f23500f = str;
        this.f23501g = bundle2;
        A7.l q9 = Z0.a.q(new C2041l(this, 0));
        this.f23504k = Z0.a.q(new C2041l(this, 1));
        this.f23505l = EnumC0555p.f9894b;
        this.f23506m = (b0) q9.getValue();
    }

    public final Bundle a() {
        Bundle bundle = this.f23497c;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void b(EnumC0555p maxState) {
        kotlin.jvm.internal.h.e(maxState, "maxState");
        this.f23505l = maxState;
        d();
    }

    @Override // N0.g
    public final N0.f c() {
        return (N0.f) this.f23503i.f15188c;
    }

    public final void d() {
        if (!this.j) {
            C1 c12 = this.f23503i;
            c12.a();
            this.j = true;
            if (this.f23499e != null) {
                Y.e(this);
            }
            c12.b(this.f23501g);
        }
        int ordinal = this.f23498d.ordinal();
        int ordinal2 = this.f23505l.ordinal();
        C0563y c0563y = this.f23502h;
        if (ordinal < ordinal2) {
            c0563y.q0(this.f23498d);
        } else {
            c0563y.q0(this.f23505l);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj != null && (obj instanceof C2042m)) {
            C2042m c2042m = (C2042m) obj;
            if (kotlin.jvm.internal.h.a(this.f23500f, c2042m.f23500f) && kotlin.jvm.internal.h.a(this.f23496b, c2042m.f23496b) && kotlin.jvm.internal.h.a(this.f23502h, c2042m.f23502h) && kotlin.jvm.internal.h.a((N0.f) this.f23503i.f15188c, (N0.f) c2042m.f23503i.f15188c)) {
                Bundle bundle = this.f23497c;
                Bundle bundle2 = c2042m.f23497c;
                if (!kotlin.jvm.internal.h.a(bundle, bundle2)) {
                    if (bundle != null && (keySet = bundle.keySet()) != null) {
                        if (!keySet.isEmpty()) {
                            for (String str : keySet) {
                                Object obj3 = bundle.get(str);
                                if (bundle2 != null) {
                                    obj2 = bundle2.get(str);
                                } else {
                                    obj2 = null;
                                }
                                if (!kotlin.jvm.internal.h.a(obj3, obj2)) {
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> keySet;
        int i9;
        int hashCode = this.f23496b.hashCode() + (this.f23500f.hashCode() * 31);
        Bundle bundle = this.f23497c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i10 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                if (obj != null) {
                    i9 = obj.hashCode();
                } else {
                    i9 = 0;
                }
                hashCode = i10 + i9;
            }
        }
        return ((N0.f) this.f23503i.f15188c).hashCode() + ((this.f23502h.hashCode() + (hashCode * 31)) * 31);
    }

    @Override // androidx.lifecycle.InterfaceC0550k
    public final h0 j() {
        return this.f23506m;
    }

    @Override // androidx.lifecycle.InterfaceC0550k
    public final C1581d p() {
        Application application;
        C1581d c1581d = new C1581d(0);
        Context applicationContext = this.f23495a.getApplicationContext();
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        } else {
            application = null;
        }
        LinkedHashMap linkedHashMap = c1581d.f20661a;
        if (application != null) {
            linkedHashMap.put(f0.f9883a, application);
        }
        linkedHashMap.put(Y.f9853a, this);
        linkedHashMap.put(Y.f9854b, this);
        Bundle a5 = a();
        if (a5 != null) {
            linkedHashMap.put(Y.f9855c, a5);
        }
        return c1581d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C2042m.class.getSimpleName());
        sb.append("(" + this.f23500f + ')');
        sb.append(" destination=");
        sb.append(this.f23496b);
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "sb.toString()");
        return sb2;
    }

    @Override // androidx.lifecycle.k0
    public final j0 u() {
        if (this.j) {
            if (this.f23502h.f9908d != EnumC0555p.f9893a) {
                C2049u c2049u = this.f23499e;
                if (c2049u != null) {
                    String backStackEntryId = this.f23500f;
                    kotlin.jvm.internal.h.e(backStackEntryId, "backStackEntryId");
                    LinkedHashMap linkedHashMap = c2049u.f23538d;
                    j0 j0Var = (j0) linkedHashMap.get(backStackEntryId);
                    if (j0Var == null) {
                        j0 j0Var2 = new j0();
                        linkedHashMap.put(backStackEntryId, j0Var2);
                        return j0Var2;
                    }
                    return j0Var;
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
    }

    @Override // androidx.lifecycle.InterfaceC0561w
    public final D.n x() {
        return this.f23502h;
    }
}
