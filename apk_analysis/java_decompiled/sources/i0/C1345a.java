package i0;

import android.util.Log;
import androidx.lifecycle.EnumC0555p;
import co.notix.R;
import j0.AbstractC1430d;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1345a implements InterfaceC1333J {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18282a;

    /* renamed from: b, reason: collision with root package name */
    public int f18283b;

    /* renamed from: c, reason: collision with root package name */
    public int f18284c;

    /* renamed from: d, reason: collision with root package name */
    public int f18285d;

    /* renamed from: e, reason: collision with root package name */
    public int f18286e;

    /* renamed from: f, reason: collision with root package name */
    public int f18287f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18288g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18289h;

    /* renamed from: i, reason: collision with root package name */
    public String f18290i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f18291k;

    /* renamed from: l, reason: collision with root package name */
    public int f18292l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f18293m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f18294n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f18295o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18296p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC1336M f18297q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18298r;

    /* renamed from: s, reason: collision with root package name */
    public int f18299s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18300t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1345a(AbstractC1336M abstractC1336M) {
        this();
        abstractC1336M.E();
        C1368x c1368x = abstractC1336M.f18215u;
        if (c1368x != null) {
            c1368x.f18427o.getClassLoader();
        }
        this.f18299s = -1;
        this.f18300t = false;
        this.f18297q = abstractC1336M;
    }

    @Override // i0.InterfaceC1333J
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC1336M.H(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f18288g) {
            AbstractC1336M abstractC1336M = this.f18297q;
            if (abstractC1336M.f18199d == null) {
                abstractC1336M.f18199d = new ArrayList();
            }
            abstractC1336M.f18199d.add(this);
            return true;
        }
        return true;
    }

    public final void b(C1344V c1344v) {
        this.f18282a.add(c1344v);
        c1344v.f18257d = this.f18283b;
        c1344v.f18258e = this.f18284c;
        c1344v.f18259f = this.f18285d;
        c1344v.f18260g = this.f18286e;
    }

    public final void c(String str) {
        if (this.f18289h) {
            this.f18288g = true;
            this.f18290i = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void d(int i9) {
        if (this.f18288g) {
            if (AbstractC1336M.H(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i9);
            }
            ArrayList arrayList = this.f18282a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1344V c1344v = (C1344V) arrayList.get(i10);
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = c1344v.f18255b;
                if (abstractComponentCallbacksC1366v != null) {
                    abstractComponentCallbacksC1366v.f18413r += i9;
                    if (AbstractC1336M.H(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c1344v.f18255b + " to " + c1344v.f18255b.f18413r);
                    }
                }
            }
        }
    }

    public final int e(boolean z9) {
        if (!this.f18298r) {
            if (AbstractC1336M.H(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new X());
                h("  ", printWriter, true);
                printWriter.close();
            }
            this.f18298r = true;
            boolean z10 = this.f18288g;
            AbstractC1336M abstractC1336M = this.f18297q;
            if (z10) {
                this.f18299s = abstractC1336M.f18204i.getAndIncrement();
            } else {
                this.f18299s = -1;
            }
            abstractC1336M.v(this, z9);
            return this.f18299s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void f() {
        if (!this.f18288g) {
            this.f18289h = false;
            this.f18297q.y(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void g(int i9, AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, String str, int i10) {
        String str2 = abstractComponentCallbacksC1366v.f18400k0;
        if (str2 != null) {
            AbstractC1430d.c(abstractComponentCallbacksC1366v, str2);
        }
        Class<?> cls = abstractComponentCallbacksC1366v.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = abstractComponentCallbacksC1366v.f18422y;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC1366v + ": was " + abstractComponentCallbacksC1366v.f18422y + " now " + str);
                }
                abstractComponentCallbacksC1366v.f18422y = str;
            }
            if (i9 != 0) {
                if (i9 != -1) {
                    int i11 = abstractComponentCallbacksC1366v.f18420w;
                    if (i11 != 0 && i11 != i9) {
                        throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC1366v + ": was " + abstractComponentCallbacksC1366v.f18420w + " now " + i9);
                    }
                    abstractComponentCallbacksC1366v.f18420w = i9;
                    abstractComponentCallbacksC1366v.f18421x = i9;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC1366v + " with tag " + str + " to container view with no id");
                }
            }
            b(new C1344V(i10, abstractComponentCallbacksC1366v));
            abstractComponentCallbacksC1366v.f18414s = this.f18297q;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void h(String str, PrintWriter printWriter, boolean z9) {
        String str2;
        if (z9) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f18290i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f18299s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f18298r);
            if (this.f18287f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f18287f));
            }
            if (this.f18283b != 0 || this.f18284c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f18283b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f18284c));
            }
            if (this.f18285d != 0 || this.f18286e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f18285d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f18286e));
            }
            if (this.j != 0 || this.f18291k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f18291k);
            }
            if (this.f18292l != 0 || this.f18293m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f18292l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f18293m);
            }
        }
        ArrayList arrayList = this.f18282a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                C1344V c1344v = (C1344V) arrayList.get(i9);
                switch (c1344v.f18254a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + c1344v.f18254a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c1344v.f18255b);
                if (z9) {
                    if (c1344v.f18257d != 0 || c1344v.f18258e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c1344v.f18257d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c1344v.f18258e));
                    }
                    if (c1344v.f18259f != 0 || c1344v.f18260g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c1344v.f18259f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c1344v.f18260g));
                    }
                }
            }
        }
    }

    public final void i(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        AbstractC1336M abstractC1336M = abstractComponentCallbacksC1366v.f18414s;
        if (abstractC1336M != null && abstractC1336M != this.f18297q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC1366v.toString() + " is already attached to a FragmentManager.");
        }
        b(new C1344V(3, abstractComponentCallbacksC1366v));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, i0.V] */
    public final void j(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, EnumC0555p enumC0555p) {
        AbstractC1336M abstractC1336M = abstractComponentCallbacksC1366v.f18414s;
        AbstractC1336M abstractC1336M2 = this.f18297q;
        if (abstractC1336M == abstractC1336M2) {
            if (enumC0555p == EnumC0555p.f9894b && abstractComponentCallbacksC1366v.f18385a > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC0555p + " after the Fragment has been created");
            }
            if (enumC0555p != EnumC0555p.f9893a) {
                ?? obj = new Object();
                obj.f18254a = 10;
                obj.f18255b = abstractComponentCallbacksC1366v;
                obj.f18256c = false;
                obj.f18261h = abstractComponentCallbacksC1366v.f18402l0;
                obj.f18262i = enumC0555p;
                b(obj);
                return;
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC0555p + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + abstractC1336M2);
    }

    public final void k(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        AbstractC1336M abstractC1336M = abstractComponentCallbacksC1366v.f18414s;
        if (abstractC1336M != null && abstractC1336M != this.f18297q) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC1366v.toString() + " is already attached to a FragmentManager.");
        }
        b(new C1344V(8, abstractComponentCallbacksC1366v));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f18299s >= 0) {
            sb.append(" #");
            sb.append(this.f18299s);
        }
        if (this.f18290i != null) {
            sb.append(" ");
            sb.append(this.f18290i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, i0.V] */
    public C1345a(C1345a c1345a) {
        this();
        c1345a.f18297q.E();
        C1368x c1368x = c1345a.f18297q.f18215u;
        if (c1368x != null) {
            c1368x.f18427o.getClassLoader();
        }
        ArrayList arrayList = c1345a.f18282a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            C1344V c1344v = (C1344V) obj;
            ArrayList arrayList2 = this.f18282a;
            ?? obj2 = new Object();
            obj2.f18254a = c1344v.f18254a;
            obj2.f18255b = c1344v.f18255b;
            obj2.f18256c = c1344v.f18256c;
            obj2.f18257d = c1344v.f18257d;
            obj2.f18258e = c1344v.f18258e;
            obj2.f18259f = c1344v.f18259f;
            obj2.f18260g = c1344v.f18260g;
            obj2.f18261h = c1344v.f18261h;
            obj2.f18262i = c1344v.f18262i;
            arrayList2.add(obj2);
        }
        this.f18283b = c1345a.f18283b;
        this.f18284c = c1345a.f18284c;
        this.f18285d = c1345a.f18285d;
        this.f18286e = c1345a.f18286e;
        this.f18287f = c1345a.f18287f;
        this.f18288g = c1345a.f18288g;
        this.f18289h = c1345a.f18289h;
        this.f18290i = c1345a.f18290i;
        this.f18292l = c1345a.f18292l;
        this.f18293m = c1345a.f18293m;
        this.j = c1345a.j;
        this.f18291k = c1345a.f18291k;
        if (c1345a.f18294n != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f18294n = arrayList3;
            arrayList3.addAll(c1345a.f18294n);
        }
        if (c1345a.f18295o != null) {
            ArrayList arrayList4 = new ArrayList();
            this.f18295o = arrayList4;
            arrayList4.addAll(c1345a.f18295o);
        }
        this.f18296p = c1345a.f18296p;
        this.f18299s = -1;
        this.f18300t = false;
        this.f18297q = c1345a.f18297q;
        this.f18298r = c1345a.f18298r;
        this.f18299s = c1345a.f18299s;
        this.f18300t = c1345a.f18300t;
    }

    public C1345a() {
        this.f18282a = new ArrayList();
        this.f18289h = true;
        this.f18296p = false;
    }
}
