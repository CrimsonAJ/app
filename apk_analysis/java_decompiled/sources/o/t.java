package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class t implements InterfaceC1657B, x, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f21439a;

    public static int o(ListAdapter listAdapter, Context context, int i9) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i10 = 0;
        int i11 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = listAdapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i12, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i9) {
                return i9;
            }
            if (measuredWidth > i10) {
                i10 = measuredWidth;
            }
        }
        return i10;
    }

    public static boolean w(l lVar) {
        int size = lVar.f21380f.size();
        for (int i9 = 0; i9 < size; i9++) {
            MenuItem item = lVar.getItem(i9);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // o.x
    public final boolean g(n nVar) {
        return false;
    }

    @Override // o.x
    public final int getId() {
        return 0;
    }

    @Override // o.x
    public final boolean m(n nVar) {
        return false;
    }

    public abstract void n(l lVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j) {
        i iVar;
        int i10;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            iVar = (i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            iVar = (i) listAdapter;
        }
        l lVar = iVar.f21368a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i9);
        if (!(this instanceof f)) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        lVar.q(menuItem, this, i10);
    }

    public abstract void p(View view);

    public abstract void q(boolean z9);

    public abstract void r(int i9);

    public abstract void s(int i9);

    public abstract void t(PopupWindow.OnDismissListener onDismissListener);

    public abstract void u(boolean z9);

    public abstract void v(int i9);

    @Override // o.x
    public final void i(Context context, l lVar) {
    }
}
