package com.google.firebase.messaging;

import J1.AbstractC0165c;
import N3.m0;
import P.InterfaceC0314o;
import P.r0;
import P.u0;
import P5.AbstractC0349q;
import P5.F;
import P5.S;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.anilab.android.ui.player.PlayerActivity;
import f5.AbstractC1176h;
import f5.InterfaceC1169a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC1169a, InterfaceC0314o, i4.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f16474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16476c;

    public /* synthetic */ i(Object obj, Object obj2, boolean z9) {
        this.f16475b = obj;
        this.f16476c = obj2;
        this.f16474a = z9;
    }

    @Override // i4.l
    public S c(int i9, m0 m0Var, int[] iArr) {
        i4.o oVar = (i4.o) this.f16475b;
        oVar.getClass();
        i4.d dVar = new i4.d(oVar);
        P5.D d9 = F.f5901b;
        AbstractC0349q.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < m0Var.f5164a) {
            int i12 = i9;
            m0 m0Var2 = m0Var;
            i4.e eVar = new i4.e(i12, m0Var2, i10, (i4.h) this.f16476c, iArr[i10], this.f16474a, dVar);
            int i13 = i11 + 1;
            if (objArr.length < i13) {
                objArr = Arrays.copyOf(objArr, P5.C.e(objArr.length, i13));
            }
            objArr[i11] = eVar;
            i10++;
            i11 = i13;
            i9 = i12;
            m0Var = m0Var2;
        }
        return F.k(i11, objArr);
    }

    @Override // f5.InterfaceC1169a
    public Object i(AbstractC1176h abstractC1176h) {
        if (K4.b.d() && ((Integer) abstractC1176h.g()).intValue() == 402) {
            return j.a((Context) this.f16475b, (Intent) this.f16476c, this.f16474a).l(new C0.e(0), new X0.k(11));
        }
        return abstractC1176h;
    }

    @Override // P.InterfaceC0314o
    public u0 t(View view, u0 u0Var) {
        int i9;
        int i10;
        int i11 = PlayerActivity.f13798w0;
        r0 r0Var = u0Var.f5645a;
        H.c f9 = r0Var.f(137);
        int i12 = 8;
        boolean o9 = r0Var.o(8);
        kotlin.jvm.internal.k kVar = (kotlin.jvm.internal.k) this.f16475b;
        boolean z9 = kVar.f20155a;
        PlayerActivity playerActivity = (PlayerActivity) this.f16476c;
        if (o9 != z9) {
            AbstractC0165c abstractC0165c = playerActivity.f13799D;
            if (abstractC0165c != null) {
                kVar.f20155a = o9;
                FrameLayout layoutComment = abstractC0165c.f3849I;
                kotlin.jvm.internal.h.d(layoutComment, "layoutComment");
                if (!o9 && playerActivity.getResources().getConfiguration().orientation != 2) {
                    i12 = 0;
                }
                layoutComment.setVisibility(i12);
                if (o9) {
                    i10 = 0;
                } else {
                    i10 = f9.f2917d;
                }
                abstractC0165c.f3850J.setPadding(0, 0, 0, i10);
            } else {
                kotlin.jvm.internal.h.h("binding");
                throw null;
            }
        }
        if (this.f16474a) {
            i9 = f9.f2915b;
        } else {
            i9 = 0;
        }
        AbstractC0165c abstractC0165c2 = playerActivity.f13799D;
        if (abstractC0165c2 != null) {
            abstractC0165c2.f7853k.setPadding(0, i9, 0, f9.f2917d);
            return u0.f5644b;
        }
        kotlin.jvm.internal.h.h("binding");
        throw null;
    }
}
