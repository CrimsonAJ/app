package co.notix;

import android.widget.TextView;
import co.notix.appopen.AppOpenActivity;

/* loaded from: classes.dex */
public final class z6 extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppOpenActivity f13631a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(AppOpenActivity appOpenActivity) {
        super(0);
        this.f13631a = appOpenActivity;
    }

    @Override // O7.a
    public final Object invoke() {
        return (TextView) this.f13631a.findViewById(R.id.tv_appopen_appname);
    }
}
