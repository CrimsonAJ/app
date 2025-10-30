package co.notix;

import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class c6 extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f11986a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(j6 j6Var) {
        super(0);
        this.f11986a = j6Var;
    }

    @Override // O7.a
    public final Object invoke() {
        return (LinearLayout) this.f11986a.findViewById(R.id.ll_content_container);
    }
}
