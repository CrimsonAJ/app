package co.notix;

import android.widget.ImageView;

/* loaded from: classes.dex */
public final class q5 extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v5 f13023a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(v5 v5Var) {
        super(0);
        this.f13023a = v5Var;
    }

    @Override // O7.a
    public final Object invoke() {
        return (ImageView) this.f13023a.findViewById(R.id.iv_banner_image);
    }
}
