package co.notix;

import android.widget.FrameLayout;
import android.widget.ImageView;
import co.notix.interstitial.WebViewInterstitialActivity;

/* loaded from: classes.dex */
public final class jr extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewInterstitialActivity f12580a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(WebViewInterstitialActivity webViewInterstitialActivity) {
        super(0);
        this.f12580a = webViewInterstitialActivity;
    }

    @Override // O7.a
    public final Object invoke() {
        ImageView imageView = new ImageView(this.f12580a);
        imageView.setImageResource(R.drawable.notix_ic_notix_close);
        imageView.setLayoutParams(new FrameLayout.LayoutParams((int) h9.a(40), (int) h9.a(40), 8388613));
        imageView.setVisibility(4);
        return imageView;
    }
}
