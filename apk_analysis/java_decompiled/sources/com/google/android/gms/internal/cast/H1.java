package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import u4.C2079d;

/* loaded from: classes.dex */
public final class H1 implements u4.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y2.r f14722a;

    public /* synthetic */ H1(Y2.r rVar) {
        this.f14722a = rVar;
    }

    @Override // u4.i
    public void a(u4.g gVar, int i9) {
        A3.E e8 = new A3.E(5, 10);
        e8.f47c = Integer.valueOf(i9);
        D d9 = new D(e8);
        Y2.r rVar = this.f14722a;
        Y2.r.W(rVar, d9);
        rVar.Y();
    }

    @Override // u4.i
    public /* bridge */ /* synthetic */ void d(u4.g gVar) {
    }

    @Override // u4.i
    public void e(u4.g gVar) {
        boolean z9;
        C2079d c2079d = (C2079d) gVar;
        A3.E e8 = new A3.E(2, 10);
        Y2.r rVar = this.f14722a;
        if (((BinderC0822g) rVar.f8649c).f14849h == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        e8.f48d = Boolean.valueOf(z9);
        Y2.r.W(rVar, new D(e8));
        i3 i3Var = (i3) rVar.f8650d;
        F4.y.h(i3Var);
        i3Var.a(c2079d);
        c2079d.f23684l = (H1) rVar.f8651e;
    }

    @Override // u4.i
    public void f(u4.g gVar, String str) {
        D d9 = new D(new A3.E(7, 10));
        Y2.r rVar = this.f14722a;
        Y2.r.W(rVar, d9);
        i3 i3Var = (i3) rVar.f8650d;
        F4.y.h(i3Var);
        i3Var.a((C2079d) gVar);
        i3 i3Var2 = (i3) rVar.f8650d;
        F4.y.h(i3Var2);
        String str2 = i3Var2.f14880k;
        if (str2 == null) {
            i3Var2.f14880k = str;
        } else if (!TextUtils.equals(str, str2)) {
            i3Var2.b(4);
        }
    }

    @Override // u4.i
    public void g(u4.g gVar, int i9) {
        A3.E e8 = new A3.E(6, 10);
        e8.f47c = Integer.valueOf(i9);
        D d9 = new D(e8);
        Y2.r rVar = this.f14722a;
        Y2.r.W(rVar, d9);
        i3 i3Var = (i3) rVar.f8650d;
        F4.y.h(i3Var);
        i3Var.a((C2079d) gVar);
    }

    @Override // u4.i
    public void h(u4.g gVar, String str) {
        D d9 = new D(new A3.E(4, 10));
        Y2.r rVar = this.f14722a;
        Y2.r.W(rVar, d9);
        i3 i3Var = (i3) rVar.f8650d;
        F4.y.h(i3Var);
        i3Var.a((C2079d) gVar);
        i3 i3Var2 = (i3) rVar.f8650d;
        F4.y.h(i3Var2);
        String str2 = i3Var2.f14880k;
        if (str2 == null) {
            i3Var2.f14880k = str;
        } else if (!TextUtils.equals(str, str2)) {
            i3Var2.b(4);
        }
    }

    @Override // u4.i
    public void i(u4.g gVar, int i9) {
        boolean z9;
        A3.E e8 = new A3.E(9, 10);
        e8.f47c = Integer.valueOf(i9);
        Y2.r rVar = this.f14722a;
        if (((BinderC0822g) rVar.f8649c).f14849h == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        e8.f48d = Boolean.valueOf(z9);
        Y2.r.W(rVar, new D(e8));
        rVar.Y();
    }

    @Override // u4.i
    public /* bridge */ /* synthetic */ void j(u4.g gVar, boolean z9) {
        D d9 = new D(new A3.E(4, 10));
        Y2.r rVar = this.f14722a;
        Y2.r.W(rVar, d9);
        i3 i3Var = (i3) rVar.f8650d;
        F4.y.h(i3Var);
        i3Var.a((C2079d) gVar);
    }

    @Override // u4.i
    public void k(u4.g gVar, int i9) {
        A3.E e8 = new A3.E(8, 10);
        e8.f47c = Integer.valueOf(i9);
        D d9 = new D(e8);
        Y2.r rVar = this.f14722a;
        Y2.r.W(rVar, d9);
        rVar.Y();
    }
}
