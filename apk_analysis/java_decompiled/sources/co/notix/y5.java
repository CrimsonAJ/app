package co.notix;

import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class y5 extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f13576a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(j6 j6Var) {
        super(0);
        this.f13576a = j6Var;
    }

    @Override // O7.a
    public final Object invoke() {
        return (FrameLayout) this.f13576a.findViewById(R.id.fl_button_container);
    }
}
