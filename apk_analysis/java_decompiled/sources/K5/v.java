package K5;

import android.view.View;
import android.widget.AdapterView;
import p.C1733A0;
import p.C1748I;
import p.C1754L;

/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4417b;

    public /* synthetic */ v(int i9, Object obj) {
        this.f4416a = i9;
        this.f4417b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j) {
        Object item;
        int selectedItemPosition;
        switch (this.f4416a) {
            case 0:
                View view2 = null;
                x xVar = (x) this.f4417b;
                if (i9 < 0) {
                    C1733A0 c1733a0 = xVar.f4421e;
                    if (!c1733a0.f21795z.isShowing()) {
                        item = null;
                    } else {
                        item = c1733a0.f21773c.getSelectedItem();
                    }
                } else {
                    item = xVar.getAdapter().getItem(i9);
                }
                x.a(xVar, item);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                C1733A0 c1733a02 = xVar.f4421e;
                if (onItemClickListener != null) {
                    if (view == null || i9 < 0) {
                        if (c1733a02.f21795z.isShowing()) {
                            view2 = c1733a02.f21773c.getSelectedView();
                        }
                        view = view2;
                        if (!c1733a02.f21795z.isShowing()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = c1733a02.f21773c.getSelectedItemPosition();
                        }
                        i9 = selectedItemPosition;
                        if (!c1733a02.f21795z.isShowing()) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = c1733a02.f21773c.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(c1733a02.f21773c, view, i9, j);
                }
                c1733a02.dismiss();
                return;
            default:
                C1748I c1748i = (C1748I) this.f4417b;
                c1748i.f21821f0.setSelection(i9);
                C1754L c1754l = c1748i.f21821f0;
                if (c1754l.getOnItemClickListener() != null) {
                    c1754l.performItemClick(view, i9, c1748i.f21819X.getItemId(i9));
                }
                c1748i.dismiss();
                return;
        }
    }
}
