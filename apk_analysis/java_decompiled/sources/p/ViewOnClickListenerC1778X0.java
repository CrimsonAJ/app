package p;

import android.content.Context;
import android.view.View;
import android.view.Window;
import o.C1660a;

/* renamed from: p.X0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1778X0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C1660a f21926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1780Y0 f21927b;

    /* JADX WARN: Type inference failed for: r0v0, types: [o.a, java.lang.Object] */
    public ViewOnClickListenerC1778X0(C1780Y0 c1780y0) {
        this.f21927b = c1780y0;
        Context context = c1780y0.f21928a.getContext();
        CharSequence charSequence = c1780y0.f21935h;
        ?? obj = new Object();
        obj.f21319e = 4096;
        obj.f21321g = 4096;
        obj.f21325l = null;
        obj.f21326m = null;
        obj.f21327n = false;
        obj.f21328o = false;
        obj.f21329p = 16;
        obj.f21323i = context;
        obj.f21315a = charSequence;
        this.f21926a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1780Y0 c1780y0 = this.f21927b;
        Window.Callback callback = c1780y0.f21937k;
        if (callback != null && c1780y0.f21938l) {
            callback.onMenuItemSelected(0, this.f21926a);
        }
    }
}
