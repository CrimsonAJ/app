package co.notix;

import android.widget.TextView;
import co.notix.appopen.AppOpenActivity;

/* loaded from: classes.dex */
public final class a7 extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppOpenActivity f11826a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(AppOpenActivity appOpenActivity) {
        super(0);
        this.f11826a = appOpenActivity;
    }

    @Override // O7.a
    public final Object invoke() {
        return (TextView) this.f11826a.findViewById(R.id.tv_appopen_description);
    }
}
