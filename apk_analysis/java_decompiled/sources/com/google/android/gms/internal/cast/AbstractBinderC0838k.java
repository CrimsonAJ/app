package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import co.notix.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import t0.AbstractC1989x;
import t0.C1971e;
import t0.C1988w;

/* renamed from: com.google.android.gms.internal.cast.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0838k extends S4.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14898f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractBinderC0838k(String str, int i9) {
        super(str, 2);
        this.f14898f = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [S4.a] */
    @Override // S4.c
    public final boolean g1(int i9, Parcel parcel, Parcel parcel2) {
        boolean z9;
        int i10 = 0;
        switch (this.f14898f) {
            case 0:
                C0842l c0842l = null;
                Bundle bundle = null;
                switch (i9) {
                    case 1:
                        Bundle bundle2 = (Bundle) C.a(parcel, Bundle.CREATOR);
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                            if (queryLocalInterface instanceof C0842l) {
                                c0842l = (C0842l) queryLocalInterface;
                            } else {
                                c0842l = new S4.a(readStrongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", 3);
                            }
                        }
                        C.b(parcel);
                        BinderC0873t binderC0873t = (BinderC0873t) this;
                        C1988w b9 = C1988w.b(bundle2);
                        if (b9 != null) {
                            HashMap hashMap = binderC0873t.f14984i;
                            if (!hashMap.containsKey(b9)) {
                                hashMap.put(b9, new HashSet());
                            }
                            ((Set) hashMap.get(b9)).add(new C0846m(c0842l, binderC0873t, binderC0873t.j));
                        }
                        parcel2.writeNoException();
                        break;
                    case 2:
                        Bundle bundle3 = (Bundle) C.a(parcel, Bundle.CREATOR);
                        int readInt = parcel.readInt();
                        C.b(parcel);
                        BinderC0873t binderC0873t2 = (BinderC0873t) this;
                        C1988w b10 = C1988w.b(bundle3);
                        if (b10 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                binderC0873t2.j1(b10, readInt);
                            } else {
                                new T4.d(Looper.getMainLooper(), 4).post(new RunnableC0869s(binderC0873t2, b10, readInt, i10));
                            }
                        }
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle4 = (Bundle) C.a(parcel, Bundle.CREATOR);
                        C.b(parcel);
                        final BinderC0873t binderC0873t3 = (BinderC0873t) this;
                        final C1988w b11 = C1988w.b(bundle4);
                        if (b11 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                binderC0873t3.k1(b11);
                            } else {
                                new T4.d(Looper.getMainLooper(), 4).post(new Runnable() { // from class: com.google.android.gms.internal.cast.r
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        BinderC0873t.this.k1(b11);
                                    }
                                });
                            }
                        }
                        parcel2.writeNoException();
                        break;
                    case 4:
                        Bundle bundle5 = (Bundle) C.a(parcel, Bundle.CREATOR);
                        int readInt2 = parcel.readInt();
                        C.b(parcel);
                        BinderC0873t binderC0873t4 = (BinderC0873t) this;
                        C1988w b12 = C1988w.b(bundle5);
                        if (b12 != null) {
                            binderC0873t4.f14982g.getClass();
                            t0.D.b();
                            C1971e c3 = t0.D.c();
                            c3.getClass();
                            if (!b12.d()) {
                                if ((readInt2 & 2) != 0 || !c3.f22977p) {
                                    t0.F f9 = c3.f22982u;
                                    if (f9 != null && f9.f22869b && c3.h()) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    ArrayList arrayList = c3.f22971i;
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        t0.C c9 = (t0.C) arrayList.get(i11);
                                        if (((readInt2 & 1) != 0 && c9.d()) || ((z9 && !c9.d() && c9.c() != c3.f22979r) || !c9.h(b12))) {
                                        }
                                    }
                                }
                                i10 = 1;
                            }
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(i10);
                        break;
                    case 5:
                        String readString = parcel.readString();
                        C.b(parcel);
                        y4.b bVar = BinderC0873t.f14981n;
                        bVar.b("select route with routeId = %s", readString);
                        ((BinderC0873t) this).f14982g.getClass();
                        t0.D.b();
                        ArrayList arrayList2 = t0.D.c().f22971i;
                        int size2 = arrayList2.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size2) {
                                Object obj = arrayList2.get(i12);
                                i12++;
                                t0.C c10 = (t0.C) obj;
                                if (c10.f22842c.equals(readString)) {
                                    bVar.b("media route is found and selected", new Object[0]);
                                    c10.l(true);
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                    case 6:
                        ((BinderC0873t) this).f14982g.getClass();
                        t0.D.b();
                        t0.C c11 = t0.D.c().f22983v;
                        if (c11 != null) {
                            c11.l(true);
                            parcel2.writeNoException();
                            break;
                        } else {
                            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                        }
                    case 7:
                        ((BinderC0873t) this).f14982g.getClass();
                        t0.D.b();
                        t0.C c12 = t0.D.c().f22983v;
                        if (c12 != null) {
                            boolean equals = t0.D.f().f22842c.equals(c12.f22842c);
                            parcel2.writeNoException();
                            int i13 = C.f14693a;
                            parcel2.writeInt(equals ? 1 : 0);
                            break;
                        } else {
                            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                        }
                    case 8:
                        String readString2 = parcel.readString();
                        C.b(parcel);
                        ((BinderC0873t) this).f14982g.getClass();
                        t0.D.b();
                        ArrayList arrayList3 = t0.D.c().f22971i;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size3) {
                                Object obj2 = arrayList3.get(i14);
                                i14++;
                                t0.C c13 = (t0.C) obj2;
                                if (c13.f22842c.equals(readString2)) {
                                    bundle = c13.f22857s;
                                }
                            }
                        }
                        parcel2.writeNoException();
                        if (bundle == null) {
                            parcel2.writeInt(0);
                            break;
                        } else {
                            parcel2.writeInt(1);
                            bundle.writeToParcel(parcel2, 1);
                            break;
                        }
                    case 9:
                        ((BinderC0873t) this).f14982g.getClass();
                        String str = t0.D.f().f22842c;
                        parcel2.writeNoException();
                        parcel2.writeString(str);
                        break;
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        BinderC0873t binderC0873t5 = (BinderC0873t) this;
                        HashMap hashMap2 = binderC0873t5.f14984i;
                        Iterator it = hashMap2.values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((Set) it.next()).iterator();
                            while (it2.hasNext()) {
                                binderC0873t5.f14982g.h((AbstractC1989x) it2.next());
                            }
                        }
                        hashMap2.clear();
                        parcel2.writeNoException();
                        break;
                    case 12:
                        ((BinderC0873t) this).f14982g.getClass();
                        t0.D.b();
                        t0.C c14 = t0.D.c().f22984w;
                        if (c14 != null && t0.D.f().f22842c.equals(c14.f22842c)) {
                            i10 = 1;
                        }
                        parcel2.writeNoException();
                        int i15 = C.f14693a;
                        parcel2.writeInt(i10);
                        break;
                    case 13:
                        int readInt3 = parcel.readInt();
                        C.b(parcel);
                        ((BinderC0873t) this).f14982g.getClass();
                        t0.D.i(readInt3);
                        parcel2.writeNoException();
                        break;
                    default:
                        return false;
                }
                return true;
            default:
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                return false;
                            }
                            parcel2.writeNoException();
                            parcel2.writeInt(12451000);
                        } else {
                            BinderC0822g binderC0822g = (BinderC0822g) this;
                            y4.b bVar2 = BinderC0822g.f14847i;
                            Log.i(bVar2.f24917a, bVar2.d("onAppEnteredBackground", new Object[0]));
                            binderC0822g.f14849h = 2;
                            Iterator it3 = binderC0822g.f14848g.iterator();
                            while (it3.hasNext()) {
                                C0862q c0862q = ((C0858p) it3.next()).f14942a;
                                c0862q.getClass();
                                C0862q.f14951f.b("Stopping RouteDiscovery.", new Object[0]);
                                c0862q.f14954c.clear();
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    C0877u c0877u = c0862q.f14956e;
                                    if (c0877u.f15006b == null) {
                                        c0877u.f15006b = t0.D.d(c0877u.f15005a);
                                    }
                                    t0.D d9 = c0877u.f15006b;
                                    if (d9 != null) {
                                        d9.h(c0862q);
                                    }
                                } else {
                                    new T4.d(Looper.getMainLooper(), 4).post(new RunnableC0850n(c0862q, i10));
                                }
                            }
                            parcel2.writeNoException();
                        }
                    } else {
                        BinderC0822g binderC0822g2 = (BinderC0822g) this;
                        y4.b bVar3 = BinderC0822g.f14847i;
                        Log.i(bVar3.f24917a, bVar3.d("onAppEnteredForeground", new Object[0]));
                        binderC0822g2.f14849h = 1;
                        Iterator it4 = binderC0822g2.f14848g.iterator();
                        while (it4.hasNext()) {
                            ((C0858p) it4.next()).f14942a.o();
                        }
                        parcel2.writeNoException();
                    }
                } else {
                    N4.b bVar4 = new N4.b((BinderC0822g) this);
                    parcel2.writeNoException();
                    C.d(parcel2, bVar4);
                }
                return true;
        }
    }
}
