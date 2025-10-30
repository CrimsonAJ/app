package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: p.E0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1741E0 extends C1812o0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f21803m;

    /* renamed from: n, reason: collision with root package name */
    public final int f21804n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1735B0 f21805o;

    /* renamed from: p, reason: collision with root package name */
    public o.n f21806p;

    public C1741E0(Context context, boolean z9) {
        super(context, z9);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f21803m = 21;
            this.f21804n = 22;
        } else {
            this.f21803m = 22;
            this.f21804n = 21;
        }
    }

    @Override // p.C1812o0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        o.i iVar;
        int i9;
        o.n nVar;
        int pointToPosition;
        int i10;
        if (this.f21805o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i9 = headerViewListAdapter.getHeadersCount();
                iVar = (o.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (o.i) adapter;
                i9 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i10 = pointToPosition - i9) >= 0 && i10 < iVar.getCount()) {
                nVar = iVar.getItem(i10);
            } else {
                nVar = null;
            }
            o.n nVar2 = this.f21806p;
            if (nVar2 != nVar) {
                o.l lVar = iVar.f21368a;
                if (nVar2 != null) {
                    this.f21805o.n(lVar, nVar2);
                }
                this.f21806p = nVar;
                if (nVar != null) {
                    this.f21805o.h(lVar, nVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        o.i iVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i9 == this.f21803m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i9 == this.f21804n) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                iVar = (o.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                iVar = (o.i) adapter;
            }
            iVar.f21368a.c(false);
            return true;
        }
        return super.onKeyDown(i9, keyEvent);
    }

    public void setHoverListener(InterfaceC1735B0 interfaceC1735B0) {
        this.f21805o = interfaceC1735B0;
    }

    @Override // p.C1812o0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
