package co.notix;

import android.widget.ImageView;

/* loaded from: classes.dex */
public final class g6 extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f12297a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(j6 j6Var) {
        super(0);
        this.f12297a = j6Var;
    }

    @Override // O7.a
    public final Object invoke() {
        return (ImageView) this.f12297a.findViewById(R.id.iv_image);
    }
}
