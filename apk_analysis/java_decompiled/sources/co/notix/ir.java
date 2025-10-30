package co.notix;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class ir extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final A7.e f12499a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        kotlin.jvm.internal.h.e(context, "context");
        this.f12499a = Z0.a.q(new hr(this));
        View.inflate(context, R.layout.notix_layout_banner_webview, this);
        a();
    }

    private final WebView getWv() {
        Object value = this.f12499a.getValue();
        kotlin.jvm.internal.h.d(value, "<get-wv>(...)");
        return (WebView) value;
    }

    public final void a() {
        WebSettings settings = getWv().getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setBuiltInZoomControls(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(false);
        settings.setMediaPlaybackRequiresUserGesture(true);
        settings.setMixedContentMode(0);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        WebView wv = getWv();
        CookieManager cookieManager = CookieManager.getInstance();
        if (cookieManager != null) {
            cookieManager.setAcceptThirdPartyCookies(wv, true);
        }
        wv.setHorizontalScrollbarOverlay(false);
        wv.setHorizontalScrollBarEnabled(false);
        wv.setVerticalScrollbarOverlay(false);
        wv.setVerticalScrollBarEnabled(false);
        wv.setBackgroundColor(0);
        wv.setScrollBarStyle(0);
    }

    public final void setContent(m adContent) {
        kotlin.jvm.internal.h.e(adContent, "adContent");
        String str = adContent.f12753c;
        if (str != null && !W7.d.U(str)) {
            getWv().loadDataWithBaseURL("https://example.com", adContent.f12753c, "text/html", null, "https://example.com");
            return;
        }
        WebView wv = getWv();
        String str2 = adContent.f12752b;
        kotlin.jvm.internal.h.b(str2);
        wv.loadUrl(str2);
    }
}
