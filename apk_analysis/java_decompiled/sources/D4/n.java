package D4;

import P.Q;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class n implements Y3.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1860a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1861b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1862c;

    /* renamed from: d, reason: collision with root package name */
    public int f1863d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1864e;

    public n(n nVar, B4.d[] dVarArr, boolean z9, int i9) {
        this.f1860a = 1;
        this.f1864e = nVar;
        this.f1861b = dVarArr;
        boolean z10 = false;
        if (dVarArr != null && z9) {
            z10 = true;
        }
        this.f1862c = z10;
        this.f1863d = i9;
    }

    public static n g() {
        n nVar = new n(0);
        nVar.f1862c = true;
        nVar.f1863d = 0;
        return nVar;
    }

    @Override // m3.c
    public void a() {
        this.f1862c = true;
    }

    @Override // m3.c
    public void b(Y3.k kVar) {
        boolean z9;
        boolean z10 = true;
        AbstractC1566a.m(!this.f1862c);
        if (this.f1863d == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        if (((Y3.k) this.f1864e) != kVar) {
            z10 = false;
        }
        AbstractC1566a.h(z10);
        this.f1863d = 2;
    }

    @Override // m3.c
    public Object d() {
        AbstractC1566a.m(!this.f1862c);
        if (this.f1863d == 2) {
            ArrayDeque arrayDeque = (ArrayDeque) this.f1861b;
            if (!arrayDeque.isEmpty()) {
                Y3.d dVar = (Y3.d) arrayDeque.removeFirst();
                Y3.k kVar = (Y3.k) this.f1864e;
                if (kVar.e(4)) {
                    dVar.b(4);
                } else {
                    long j = kVar.f20706f;
                    ByteBuffer byteBuffer = kVar.f20704d;
                    byteBuffer.getClass();
                    byte[] array = byteBuffer.array();
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(array, 0, array.length);
                    obtain.setDataPosition(0);
                    Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                    obtain.recycle();
                    ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    dVar.s(kVar.f20706f, new Y3.e(j, AbstractC1566a.x(Y3.b.f8678s, parcelableArrayList)), 0L);
                }
                kVar.r();
                this.f1863d = 0;
                return dVar;
            }
            return null;
        }
        return null;
    }

    @Override // m3.c
    public Object e() {
        AbstractC1566a.m(!this.f1862c);
        if (this.f1863d != 0) {
            return null;
        }
        this.f1863d = 1;
        return (Y3.k) this.f1864e;
    }

    public n f() {
        boolean z9;
        if (((InterfaceC0093l) this.f1864e) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        F4.y.a("execute parameter required", z9);
        return new n(this, (B4.d[]) this.f1861b, this.f1862c, this.f1863d);
    }

    @Override // m3.c
    public void flush() {
        AbstractC1566a.m(!this.f1862c);
        ((Y3.k) this.f1864e).r();
        this.f1863d = 0;
    }

    public void h(int i9) {
        switch (this.f1860a) {
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1861b;
                WeakReference weakReference = sideSheetBehavior.f16105p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1863d = i9;
                    if (!this.f1862c) {
                        View view = (View) sideSheetBehavior.f16105p.get();
                        A6.s sVar = (A6.s) this.f1864e;
                        WeakHashMap weakHashMap = Q.f5546a;
                        view.postOnAnimation(sVar);
                        this.f1862c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1861b;
                WeakReference weakReference2 = bottomSheetBehavior.f15857U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1863d = i9;
                    if (!this.f1862c) {
                        View view2 = (View) bottomSheetBehavior.f15857U.get();
                        m5.c cVar = (m5.c) this.f1864e;
                        WeakHashMap weakHashMap2 = Q.f5546a;
                        view2.postOnAnimation(cVar);
                        this.f1862c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public n(int i9) {
        this.f1860a = i9;
        switch (i9) {
            case 3:
                this.f1864e = new m3.f(1);
                this.f1861b = new ArrayDeque();
                for (int i10 = 0; i10 < 2; i10++) {
                    ((ArrayDeque) this.f1861b).addFirst(new Y3.d(this, 0));
                }
                this.f1863d = 0;
                return;
            default:
                return;
        }
    }

    public n(SideSheetBehavior sideSheetBehavior) {
        this.f1860a = 2;
        this.f1861b = sideSheetBehavior;
        this.f1864e = new A6.s(3, this);
    }

    public n(BottomSheetBehavior bottomSheetBehavior) {
        this.f1860a = 4;
        this.f1861b = bottomSheetBehavior;
        this.f1864e = new m5.c(0, this);
    }

    @Override // Y3.h
    public void c(long j) {
    }
}
