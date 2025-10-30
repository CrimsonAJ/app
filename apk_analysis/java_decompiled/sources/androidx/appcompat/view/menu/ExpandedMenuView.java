package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import b5.G1;
import o.k;
import o.l;
import o.n;
import o.z;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k, z, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f9346b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public l f9347a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        G1 w7 = G1.w(context, attributeSet, f9346b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) w7.f10718c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(w7.o(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(w7.o(1));
        }
        w7.y();
    }

    @Override // o.z
    public final void b(l lVar) {
        this.f9347a = lVar;
    }

    @Override // o.k
    public final boolean c(n nVar) {
        return this.f9347a.q(nVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j) {
        c((n) getAdapter().getItem(i9));
    }
}
