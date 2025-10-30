package com.google.android.material.datepicker;

import F0.AbstractC0095a0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class h extends AbstractC0095a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f15991a;

    public h(j jVar) {
        this.f15991a = jVar;
        v.c(null);
        v.c(null);
    }

    @Override // F0.AbstractC0095a0
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f15991a.getClass();
            throw null;
        }
    }
}
