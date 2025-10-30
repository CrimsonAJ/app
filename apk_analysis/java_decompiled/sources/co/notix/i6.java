package co.notix;

import android.widget.TextView;

/* loaded from: classes.dex */
public final class i6 extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f12435a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(j6 j6Var) {
        super(0);
        this.f12435a = j6Var;
    }

    @Override // O7.a
    public final Object invoke() {
        return (TextView) this.f12435a.findViewById(R.id.tv_title);
    }
}
