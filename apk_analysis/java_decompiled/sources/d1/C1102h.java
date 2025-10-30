package d1;

import F0.h0;
import F0.n0;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import b7.C0701c;

/* renamed from: d1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1102h extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f16708E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1102h(ViewPager2 viewPager2) {
        super(1);
        this.f16708E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void K0(n0 n0Var, int[] iArr) {
        ViewPager2 viewPager2 = this.f16708E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.K0(n0Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void a0(h0 h0Var, n0 n0Var, Q.g gVar) {
        super.a0(h0Var, n0Var, gVar);
        this.f16708E.f10410t.getClass();
    }

    @Override // androidx.recyclerview.widget.a
    public final void b0(h0 h0Var, n0 n0Var, View view, Q.g gVar) {
        int i9;
        int i10;
        ViewPager2 viewPager2 = (ViewPager2) this.f16708E.f10410t.f20185d;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.f10398g.getClass();
            i9 = androidx.recyclerview.widget.a.L(view);
        } else {
            i9 = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.f10398g.getClass();
            i10 = androidx.recyclerview.widget.a.L(view);
        } else {
            i10 = 0;
        }
        gVar.j(C0701c.I(false, i9, 1, i10, 1));
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean p0(h0 h0Var, n0 n0Var, int i9, Bundle bundle) {
        this.f16708E.f10410t.getClass();
        return super.p0(h0Var, n0Var, i9, bundle);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean u0(RecyclerView recyclerView, View view, Rect rect, boolean z9, boolean z10) {
        return false;
    }
}
