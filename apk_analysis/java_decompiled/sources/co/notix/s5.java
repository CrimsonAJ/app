package co.notix;

import android.widget.TextView;

/* loaded from: classes.dex */
public final class s5 extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v5 f13150a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(v5 v5Var) {
        super(0);
        this.f13150a = v5Var;
    }

    @Override // O7.a
    public final Object invoke() {
        return (TextView) this.f13150a.findViewById(R.id.tv_banner_ad_label);
    }
}
