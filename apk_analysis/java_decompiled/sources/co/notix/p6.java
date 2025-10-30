package co.notix;

import android.widget.ImageView;
import co.notix.appopen.AppOpenActivity;

/* loaded from: classes.dex */
public final class p6 extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppOpenActivity f12929a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(AppOpenActivity appOpenActivity) {
        super(0);
        this.f12929a = appOpenActivity;
    }

    @Override // O7.a
    public final Object invoke() {
        return (ImageView) this.f12929a.findViewById(R.id.iv_appopen_continue);
    }
}
