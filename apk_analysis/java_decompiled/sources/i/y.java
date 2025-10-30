package i;

import a.AbstractC0485a;
import android.R;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import d.DialogC1072m;

/* loaded from: classes.dex */
public class y extends DialogC1072m implements InterfaceC1323i {

    /* renamed from: d, reason: collision with root package name */
    public w f18162d;

    /* renamed from: e, reason: collision with root package name */
    public final x f18163e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [i.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130968997(0x7f0401a5, float:1.7546663E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            i.x r2 = new i.x
            r2.<init>()
            r4.f18163e = r2
            i.l r2 = r4.d()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r2
            i.w r5 = (i.w) r5
            r5.r0 = r6
            r2.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.y.<init>(android.content.Context, int):void");
    }

    @Override // d.DialogC1072m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        w wVar = (w) d();
        wVar.v();
        ((ViewGroup) wVar.f18114A.findViewById(R.id.content)).addView(view, layoutParams);
        wVar.f18134m.a(wVar.f18132l.getCallback());
    }

    public final l d() {
        if (this.f18162d == null) {
            G0.I i9 = l.f18073a;
            this.f18162d = new w(getContext(), getWindow(), this, this);
        }
        return this.f18162d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        d().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0485a.l(this.f18163e, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i9) {
        w wVar = (w) d();
        wVar.v();
        return wVar.f18132l.findViewById(i9);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        w wVar = (w) d();
        if (wVar.f18138o != null) {
            wVar.A();
            wVar.f18138o.getClass();
            wVar.B(0);
        }
    }

    @Override // d.DialogC1072m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().c();
    }

    @Override // d.DialogC1072m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        w wVar = (w) d();
        wVar.A();
        I i9 = wVar.f18138o;
        if (i9 != null) {
            i9.f18020z = false;
            n.j jVar = i9.f18019y;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // d.DialogC1072m, android.app.Dialog
    public void setContentView(int i9) {
        b();
        d().g(i9);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().j(charSequence);
    }

    @Override // d.DialogC1072m, android.app.Dialog
    public void setContentView(View view) {
        b();
        d().h(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i9) {
        super.setTitle(i9);
        d().j(getContext().getString(i9));
    }

    @Override // d.DialogC1072m, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        d().i(view, layoutParams);
    }
}
