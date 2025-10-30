package n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import o.MenuC1656A;

/* renamed from: n.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1599e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20951a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1595a f20952b;

    public C1599e(Context context, AbstractC1595a abstractC1595a) {
        this.f20951a = context;
        this.f20952b = abstractC1595a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f20952b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f20952b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1656A(this.f20951a, this.f20952b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f20952b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f20952b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f20952b.f20937a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f20952b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f20952b.f20938b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f20952b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f20952b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f20952b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f20952b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f20952b.f20937a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f20952b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z9) {
        this.f20952b.o(z9);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i9) {
        this.f20952b.j(i9);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i9) {
        this.f20952b.m(i9);
    }
}
