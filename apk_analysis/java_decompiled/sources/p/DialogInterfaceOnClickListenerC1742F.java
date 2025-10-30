package p;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import i.C1316b;
import i.C1320f;
import i.DialogInterfaceC1321g;

/* renamed from: p.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1742F implements InterfaceC1752K, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC1321g f21807a;

    /* renamed from: b, reason: collision with root package name */
    public C1744G f21808b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f21809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1754L f21810d;

    public DialogInterfaceOnClickListenerC1742F(C1754L c1754l) {
        this.f21810d = c1754l;
    }

    @Override // p.InterfaceC1752K
    public final boolean a() {
        DialogInterfaceC1321g dialogInterfaceC1321g = this.f21807a;
        if (dialogInterfaceC1321g != null) {
            return dialogInterfaceC1321g.isShowing();
        }
        return false;
    }

    @Override // p.InterfaceC1752K
    public final int b() {
        return 0;
    }

    @Override // p.InterfaceC1752K
    public final Drawable c() {
        return null;
    }

    @Override // p.InterfaceC1752K
    public final void dismiss() {
        DialogInterfaceC1321g dialogInterfaceC1321g = this.f21807a;
        if (dialogInterfaceC1321g != null) {
            dialogInterfaceC1321g.dismiss();
            this.f21807a = null;
        }
    }

    @Override // p.InterfaceC1752K
    public final void f(CharSequence charSequence) {
        this.f21809c = charSequence;
    }

    @Override // p.InterfaceC1752K
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p.InterfaceC1752K
    public final void i(int i9) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p.InterfaceC1752K
    public final void j(int i9) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p.InterfaceC1752K
    public final void k(int i9) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p.InterfaceC1752K
    public final void l(int i9, int i10) {
        if (this.f21808b == null) {
            return;
        }
        C1754L c1754l = this.f21810d;
        C1320f c1320f = new C1320f(c1754l.getPopupContext());
        CharSequence charSequence = this.f21809c;
        if (charSequence != null) {
            c1320f.setTitle(charSequence);
        }
        C1744G c1744g = this.f21808b;
        int selectedItemPosition = c1754l.getSelectedItemPosition();
        C1316b c1316b = c1320f.f18069a;
        c1316b.f18032k = c1744g;
        c1316b.f18033l = this;
        c1316b.f18036o = selectedItemPosition;
        c1316b.f18035n = true;
        DialogInterfaceC1321g create = c1320f.create();
        this.f21807a = create;
        AlertController$RecycleListView alertController$RecycleListView = create.f18071f.f18048e;
        alertController$RecycleListView.setTextDirection(i9);
        alertController$RecycleListView.setTextAlignment(i10);
        this.f21807a.show();
    }

    @Override // p.InterfaceC1752K
    public final int m() {
        return 0;
    }

    @Override // p.InterfaceC1752K
    public final CharSequence o() {
        return this.f21809c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        C1754L c1754l = this.f21810d;
        c1754l.setSelection(i9);
        if (c1754l.getOnItemClickListener() != null) {
            c1754l.performItemClick(null, i9, this.f21808b.getItemId(i9));
        }
        dismiss();
    }

    @Override // p.InterfaceC1752K
    public final void p(ListAdapter listAdapter) {
        this.f21808b = (C1744G) listAdapter;
    }
}
