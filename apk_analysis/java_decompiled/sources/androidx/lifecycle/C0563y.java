package androidx.lifecycle;

import android.os.Looper;
import b8.AbstractC0714M;
import b8.C0718Q;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import q.C1866a;
import r.C1919a;
import r.C1921c;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563y extends D.n {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9906b;

    /* renamed from: c, reason: collision with root package name */
    public C1919a f9907c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0555p f9908d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f9909e;

    /* renamed from: f, reason: collision with root package name */
    public int f9910f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9911g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9912h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f9913i;
    public final C0718Q j;

    public C0563y(InterfaceC0561w interfaceC0561w) {
        super(1);
        this.f9906b = true;
        this.f9907c = new C1919a();
        EnumC0555p enumC0555p = EnumC0555p.f9894b;
        this.f9908d = enumC0555p;
        this.f9913i = new ArrayList();
        this.f9909e = new WeakReference(interfaceC0561w);
        this.j = AbstractC0714M.c(enumC0555p);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.x, java.lang.Object] */
    @Override // D.n
    public final void V(InterfaceC0560v observer) {
        InterfaceC0559u c0547h;
        Object obj;
        InterfaceC0561w interfaceC0561w;
        EnumC0554o enumC0554o;
        ArrayList arrayList = this.f9913i;
        int i9 = 1;
        kotlin.jvm.internal.h.e(observer, "observer");
        n0("addObserver");
        EnumC0555p enumC0555p = this.f9908d;
        EnumC0555p enumC0555p2 = EnumC0555p.f9893a;
        if (enumC0555p != enumC0555p2) {
            enumC0555p2 = EnumC0555p.f9894b;
        }
        ?? obj2 = new Object();
        HashMap hashMap = A.f9782a;
        boolean z9 = observer instanceof InterfaceC0559u;
        boolean z10 = observer instanceof InterfaceC0545f;
        boolean z11 = false;
        if (z9 && z10) {
            c0547h = new C0547h((InterfaceC0545f) observer, (InterfaceC0559u) observer);
        } else if (z10) {
            c0547h = new C0547h((InterfaceC0545f) observer, (InterfaceC0559u) null);
        } else if (z9) {
            c0547h = (InterfaceC0559u) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (A.b(cls) == 2) {
                Object obj3 = A.f9783b.get(cls);
                kotlin.jvm.internal.h.b(obj3);
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    InterfaceC0549j[] interfaceC0549jArr = new InterfaceC0549j[size];
                    if (size <= 0) {
                        c0547h = new N0.b(i9, interfaceC0549jArr);
                    } else {
                        A.a((Constructor) list.get(0), observer);
                        throw null;
                    }
                } else {
                    A.a((Constructor) list.get(0), observer);
                    throw null;
                }
            } else {
                c0547h = new C0547h(observer);
            }
        }
        obj2.f9905b = c0547h;
        obj2.f9904a = enumC0555p2;
        C1919a c1919a = this.f9907c;
        C1921c b9 = c1919a.b(observer);
        if (b9 != null) {
            obj = b9.f22579b;
        } else {
            HashMap hashMap2 = c1919a.f22574e;
            C1921c c1921c = new C1921c(observer, obj2);
            c1919a.f22588d++;
            C1921c c1921c2 = c1919a.f22586b;
            if (c1921c2 == null) {
                c1919a.f22585a = c1921c;
                c1919a.f22586b = c1921c;
            } else {
                c1921c2.f22580c = c1921c;
                c1921c.f22581d = c1921c2;
                c1919a.f22586b = c1921c;
            }
            hashMap2.put(observer, c1921c);
            obj = null;
        }
        if (((C0562x) obj) != null || (interfaceC0561w = (InterfaceC0561w) this.f9909e.get()) == null) {
            return;
        }
        if (this.f9910f != 0 || this.f9911g) {
            z11 = true;
        }
        EnumC0555p m02 = m0(observer);
        this.f9910f++;
        while (obj2.f9904a.compareTo(m02) < 0 && this.f9907c.f22574e.containsKey(observer)) {
            arrayList.add(obj2.f9904a);
            C0552m c0552m = EnumC0554o.Companion;
            EnumC0555p state = obj2.f9904a;
            c0552m.getClass();
            kotlin.jvm.internal.h.e(state, "state");
            int ordinal = state.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        enumC0554o = null;
                    } else {
                        enumC0554o = EnumC0554o.ON_RESUME;
                    }
                } else {
                    enumC0554o = EnumC0554o.ON_START;
                }
            } else {
                enumC0554o = EnumC0554o.ON_CREATE;
            }
            if (enumC0554o != null) {
                obj2.a(interfaceC0561w, enumC0554o);
                arrayList.remove(arrayList.size() - 1);
                m02 = m0(observer);
            } else {
                throw new IllegalStateException("no event up from " + obj2.f9904a);
            }
        }
        if (!z11) {
            r0();
        }
        this.f9910f--;
    }

    @Override // D.n
    public final EnumC0555p a0() {
        return this.f9908d;
    }

    @Override // D.n
    public final void g0(InterfaceC0560v observer) {
        kotlin.jvm.internal.h.e(observer, "observer");
        n0("removeObserver");
        this.f9907c.c(observer);
    }

    public final EnumC0555p m0(InterfaceC0560v interfaceC0560v) {
        C1921c c1921c;
        EnumC0555p enumC0555p;
        C0562x c0562x;
        HashMap hashMap = this.f9907c.f22574e;
        EnumC0555p enumC0555p2 = null;
        if (hashMap.containsKey(interfaceC0560v)) {
            c1921c = ((C1921c) hashMap.get(interfaceC0560v)).f22581d;
        } else {
            c1921c = null;
        }
        if (c1921c != null && (c0562x = (C0562x) c1921c.f22579b) != null) {
            enumC0555p = c0562x.f9904a;
        } else {
            enumC0555p = null;
        }
        ArrayList arrayList = this.f9913i;
        if (!arrayList.isEmpty()) {
            enumC0555p2 = (EnumC0555p) arrayList.get(arrayList.size() - 1);
        }
        EnumC0555p state1 = this.f9908d;
        kotlin.jvm.internal.h.e(state1, "state1");
        if (enumC0555p == null || enumC0555p.compareTo(state1) >= 0) {
            enumC0555p = state1;
        }
        if (enumC0555p2 != null && enumC0555p2.compareTo(enumC0555p) < 0) {
            return enumC0555p2;
        }
        return enumC0555p;
    }

    public final void n0(String str) {
        if (this.f9906b) {
            C1866a.f0().f22228m.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            } else {
                throw new IllegalStateException(A0.a.n("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void o0(EnumC0554o event) {
        kotlin.jvm.internal.h.e(event, "event");
        n0("handleLifecycleEvent");
        p0(event.a());
    }

    public final void p0(EnumC0555p enumC0555p) {
        EnumC0555p enumC0555p2 = this.f9908d;
        if (enumC0555p2 != enumC0555p) {
            EnumC0555p enumC0555p3 = EnumC0555p.f9894b;
            EnumC0555p enumC0555p4 = EnumC0555p.f9893a;
            if (enumC0555p2 == enumC0555p3 && enumC0555p == enumC0555p4) {
                throw new IllegalStateException(("no event down from " + this.f9908d + " in component " + this.f9909e.get()).toString());
            }
            this.f9908d = enumC0555p;
            if (!this.f9911g && this.f9910f == 0) {
                this.f9911g = true;
                r0();
                this.f9911g = false;
                if (this.f9908d == enumC0555p4) {
                    this.f9907c = new C1919a();
                    return;
                }
                return;
            }
            this.f9912h = true;
        }
    }

    public final void q0(EnumC0555p state) {
        kotlin.jvm.internal.h.e(state, "state");
        n0("setCurrentState");
        p0(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f9912h = false;
        r12.j.i(r12.f9908d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0563y.r0():void");
    }
}
