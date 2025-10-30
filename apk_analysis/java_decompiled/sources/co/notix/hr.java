package co.notix;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final class hr extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ir f12415a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr(ir irVar) {
        super(0);
        this.f12415a = irVar;
    }

    @Override // O7.a
    public final Object invoke() {
        return (WebView) this.f12415a.findViewById(R.id.wv_banner);
    }
}
