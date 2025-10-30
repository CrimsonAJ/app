package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final l f21368a;

    /* renamed from: b, reason: collision with root package name */
    public int f21369b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21370c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21371d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f21372e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21373f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z9, int i9) {
        this.f21371d = z9;
        this.f21372e = layoutInflater;
        this.f21368a = lVar;
        this.f21373f = i9;
        a();
    }

    public final void a() {
        l lVar = this.f21368a;
        n nVar = lVar.f21395v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.j;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((n) arrayList.get(i9)) == nVar) {
                    this.f21369b = i9;
                    return;
                }
            }
        }
        this.f21369b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i9) {
        ArrayList l9;
        l lVar = this.f21368a;
        if (this.f21371d) {
            lVar.i();
            l9 = lVar.j;
        } else {
            l9 = lVar.l();
        }
        int i10 = this.f21369b;
        if (i10 >= 0 && i9 >= i10) {
            i9++;
        }
        return (n) l9.get(i9);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l9;
        l lVar = this.f21368a;
        if (this.f21371d) {
            lVar.i();
            l9 = lVar.j;
        } else {
            l9 = lVar.l();
        }
        if (this.f21369b < 0) {
            return l9.size();
        }
        return l9.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i9) {
        return i9;
    }

    @Override // android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        int i10;
        boolean z9 = false;
        if (view == null) {
            view = this.f21372e.inflate(this.f21373f, viewGroup, false);
        }
        int i11 = getItem(i9).f21405b;
        int i12 = i9 - 1;
        if (i12 >= 0) {
            i10 = getItem(i12).f21405b;
        } else {
            i10 = i11;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f21368a.m() && i11 != i10) {
            z9 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z9);
        y yVar = (y) view;
        if (this.f21370c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.a(getItem(i9));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
