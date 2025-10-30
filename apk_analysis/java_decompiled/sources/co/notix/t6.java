package co.notix;

import android.widget.LinearLayout;
import co.notix.appopen.AppOpenActivity;

/* loaded from: classes.dex */
public final class t6 extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppOpenActivity f13213a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(AppOpenActivity appOpenActivity) {
        super(0);
        this.f13213a = appOpenActivity;
    }

    @Override // O7.a
    public final Object invoke() {
        return (LinearLayout) this.f13213a.findViewById(R.id.ll_appopen_continue_container);
    }
}
