package co.notix;

import android.widget.ImageView;
import co.notix.appopen.AppOpenActivity;

/* loaded from: classes.dex */
public final class o6 extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppOpenActivity f12861a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(AppOpenActivity appOpenActivity) {
        super(0);
        this.f12861a = appOpenActivity;
    }

    @Override // O7.a
    public final Object invoke() {
        return (ImageView) this.f12861a.findViewById(R.id.iv_appopen_click);
    }
}
