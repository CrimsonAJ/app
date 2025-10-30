package o;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import i.DialogInterfaceC1321g;

/* loaded from: classes.dex */
public final class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC1659D f21398a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC1321g f21399b;

    /* renamed from: c, reason: collision with root package name */
    public h f21400c;

    @Override // o.w
    public final void c(l lVar, boolean z9) {
        DialogInterfaceC1321g dialogInterfaceC1321g;
        if ((z9 || lVar == this.f21398a) && (dialogInterfaceC1321g = this.f21399b) != null) {
            dialogInterfaceC1321g.dismiss();
        }
    }

    @Override // o.w
    public final boolean m(l lVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        h hVar = this.f21400c;
        if (hVar.f21367f == null) {
            hVar.f21367f = new g(hVar);
        }
        this.f21398a.q(hVar.f21367f.getItem(i9), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f21400c.c(this.f21398a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i9, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC1659D subMenuC1659D = this.f21398a;
        if (i9 == 82 || i9 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f21399b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f21399b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC1659D.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC1659D.performShortcut(i9, keyEvent, 0);
    }
}
