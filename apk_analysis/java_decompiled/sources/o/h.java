package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import i.C1316b;
import i.C1320f;
import i.DialogInterfaceC1321g;

/* loaded from: classes.dex */
public final class h implements x, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f21362a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f21363b;

    /* renamed from: c, reason: collision with root package name */
    public l f21364c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f21365d;

    /* renamed from: e, reason: collision with root package name */
    public w f21366e;

    /* renamed from: f, reason: collision with root package name */
    public g f21367f;

    public h(Context context) {
        this.f21362a = context;
        this.f21363b = LayoutInflater.from(context);
    }

    @Override // o.x
    public final void b(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f21365d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // o.x
    public final void c(l lVar, boolean z9) {
        w wVar = this.f21366e;
        if (wVar != null) {
            wVar.c(lVar, z9);
        }
    }

    @Override // o.x
    public final void f(boolean z9) {
        g gVar = this.f21367f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
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
    public final void h(w wVar) {
        throw null;
    }

    @Override // o.x
    public final void i(Context context, l lVar) {
        if (this.f21362a != null) {
            this.f21362a = context;
            if (this.f21363b == null) {
                this.f21363b = LayoutInflater.from(context);
            }
        }
        this.f21364c = lVar;
        g gVar = this.f21367f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // o.x
    public final boolean j() {
        return false;
    }

    @Override // o.x
    public final Parcelable k() {
        if (this.f21365d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f21365d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, o.w, java.lang.Object, android.content.DialogInterface$OnDismissListener, o.m] */
    @Override // o.x
    public final boolean l(SubMenuC1659D subMenuC1659D) {
        if (!subMenuC1659D.hasVisibleItems()) {
            return false;
        }
        ?? obj = new Object();
        obj.f21398a = subMenuC1659D;
        Context context = subMenuC1659D.f21375a;
        C1320f c1320f = new C1320f(context);
        h hVar = new h(c1320f.getContext());
        obj.f21400c = hVar;
        hVar.f21366e = obj;
        subMenuC1659D.b(hVar, context);
        h hVar2 = obj.f21400c;
        if (hVar2.f21367f == null) {
            hVar2.f21367f = new g(hVar2);
        }
        g gVar = hVar2.f21367f;
        C1316b c1316b = c1320f.f18069a;
        c1316b.f18032k = gVar;
        c1316b.f18033l = obj;
        View view = subMenuC1659D.f21388o;
        if (view != null) {
            c1316b.f18027e = view;
        } else {
            c1316b.f18025c = subMenuC1659D.f21387n;
            c1320f.setTitle(subMenuC1659D.f21386m);
        }
        c1316b.j = obj;
        DialogInterfaceC1321g create = c1320f.create();
        obj.f21399b = create;
        create.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f21399b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f21399b.show();
        w wVar = this.f21366e;
        if (wVar != null) {
            wVar.m(subMenuC1659D);
            return true;
        }
        return true;
    }

    @Override // o.x
    public final boolean m(n nVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j) {
        this.f21364c.q(this.f21367f.getItem(i9), this, 0);
    }
}
