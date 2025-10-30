package co.notix;

import android.widget.ProgressBar;
import co.notix.appopen.AppOpenActivity;

/* loaded from: classes.dex */
public final class w6 extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppOpenActivity f13404a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(AppOpenActivity appOpenActivity) {
        super(0);
        this.f13404a = appOpenActivity;
    }

    @Override // O7.a
    public final Object invoke() {
        return (ProgressBar) this.f13404a.findViewById(R.id.pb_appopen_continue);
    }
}
