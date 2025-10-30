package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import co.notix.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f21360a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f21361b;

    public g(h hVar) {
        this.f21361b = hVar;
        a();
    }

    public final void a() {
        l lVar = this.f21361b.f21364c;
        n nVar = lVar.f21395v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.j;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((n) arrayList.get(i9)) == nVar) {
                    this.f21360a = i9;
                    return;
                }
            }
        }
        this.f21360a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i9) {
        h hVar = this.f21361b;
        l lVar = hVar.f21364c;
        lVar.i();
        ArrayList arrayList = lVar.j;
        hVar.getClass();
        int i10 = this.f21360a;
        if (i10 >= 0 && i9 >= i10) {
            i9++;
        }
        return (n) arrayList.get(i9);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        h hVar = this.f21361b;
        l lVar = hVar.f21364c;
        lVar.i();
        int size = lVar.j.size();
        hVar.getClass();
        if (this.f21360a < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i9) {
        return i9;
    }

    @Override // android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f21361b.f21363b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).a(getItem(i9));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
