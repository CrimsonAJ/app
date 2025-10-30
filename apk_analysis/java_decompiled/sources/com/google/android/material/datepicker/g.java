package com.google.android.material.datepicker;

import F0.G;
import F0.n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f15989E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ j f15990F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, int i9, int i10) {
        super(i9);
        this.f15990F = jVar;
        this.f15989E = i10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void H0(RecyclerView recyclerView, int i9) {
        G g9 = new G(recyclerView.getContext());
        g9.f2023a = i9;
        I0(g9);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void K0(n0 n0Var, int[] iArr) {
        int i9 = this.f15989E;
        j jVar = this.f15990F;
        if (i9 == 0) {
            iArr[0] = jVar.f15997C0.getWidth();
            iArr[1] = jVar.f15997C0.getWidth();
        } else {
            iArr[0] = jVar.f15997C0.getHeight();
            iArr[1] = jVar.f15997C0.getHeight();
        }
    }
}
