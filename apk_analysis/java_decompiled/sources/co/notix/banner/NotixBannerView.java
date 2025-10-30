package co.notix.banner;

import Y7.B;
import Y7.InterfaceC0465h0;
import Y7.InterfaceC0484z;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import b8.AbstractC0714M;
import b8.C0718Q;
import b8.InterfaceC0707F;
import co.notix.banner.BannerSize;
import co.notix.cg;
import co.notix.dg;
import co.notix.domain.RequestVars;
import co.notix.g;
import co.notix.h9;
import co.notix.i;
import co.notix.ir;
import co.notix.j7;
import co.notix.jg;
import co.notix.kg;
import co.notix.m;
import co.notix.mg;
import co.notix.sf;
import co.notix.tf;
import co.notix.uf;
import co.notix.utils.ExperimentalNotixApi;
import co.notix.v5;
import co.notix.wq;
import co.notix.yf;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.h;

@Keep
@ExperimentalNotixApi
/* loaded from: classes.dex */
public final class NotixBannerView extends FrameLayout {
    private final mg callbackExecutor;
    private InterfaceC0465h0 contentLoadJob;
    private final InterfaceC0707F contentLoadedF;
    private final InterfaceC0484z csDefault;
    private final InterfaceC0484z csMain;
    private final InterfaceC0707F isAttachedF;
    private final InterfaceC0707F isVisibleF;
    private final InterfaceC0707F layoutF;
    private NotixBannerListener listener;
    private final AtomicBoolean loadCalled;
    private NotixBannerLoader loader;
    private BannerRequest request;
    private BannerSize responseSize;
    private final InterfaceC0707F timeVisibleF;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotixBannerView(Context context) {
        this(context, null, 0, 6, null);
        h.e(context, "context");
    }

    private final void addListeners() {
        B.r(this.csDefault, null, new yf(this, null), 3);
        B.r(this.csDefault, null, new cg(this, null), 3);
        B.r(this.csDefault, null, new dg(this, null), 3);
    }

    private final int calculateStickyHeightDp(BannerSize.Sticky sticky) {
        return Math.max(50, (int) ((Integer.valueOf(getResources().getDisplayMetrics().heightPixels).floatValue() / Resources.getSystem().getDisplayMetrics().density) * 0.15d));
    }

    private final NotixBannerLoader createLoader(BannerRequest bannerRequest) {
        tf tfVar = uf.f13293a;
        long zoneId = bannerRequest.getZoneId();
        String placement = bannerRequest.getPlacement();
        Integer experiment = bannerRequest.getExperiment();
        Integer num = (Integer) getSimpleDp(bannerRequest.getSize()).f547a;
        Integer num2 = (Integer) getSimpleDp(bannerRequest.getSize()).f548b;
        bannerRequest.getRefreshIntervalMillis();
        sf sfVar = new sf(tfVar.f13226b.f13358b.a(new j7(zoneId, new RequestVars(placement, null, null, null, null, 30, null), experiment, num, num2)));
        sfVar.startLoading();
        return sfVar;
    }

    private final void disposeLoader() {
        NotixBannerLoader notixBannerLoader = this.loader;
        if (notixBannerLoader != null) {
            notixBannerLoader.stopLoading();
        }
        this.loader = null;
    }

    private final A7.h getSimpleDp(BannerSize bannerSize) {
        if (bannerSize instanceof BannerSize.Inline) {
            BannerSize.Inline inline = (BannerSize.Inline) bannerSize;
            return new A7.h(Integer.valueOf(inline.getWidth()), Integer.valueOf(inline.getMaxHeight()));
        }
        if (bannerSize instanceof BannerSize.Sticky) {
            BannerSize.Sticky sticky = (BannerSize.Sticky) bannerSize;
            return new A7.h(Integer.valueOf(sticky.getWidth()), Integer.valueOf(calculateStickyHeightDp(sticky)));
        }
        if (bannerSize instanceof BannerSize.Fixed) {
            BannerSize.Fixed fixed = (BannerSize.Fixed) bannerSize;
            return new A7.h(Integer.valueOf(fixed.getWidth()), Integer.valueOf(fixed.getHeight()));
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadOnce() {
        InterfaceC0465h0 interfaceC0465h0 = this.contentLoadJob;
        if (interfaceC0465h0 == null || !interfaceC0465h0.a()) {
            this.contentLoadJob = B.r(this.csDefault, null, new jg(this, null), 3);
        }
    }

    private static final int onMeasure$makeMs(int i9) {
        return View.MeasureSpec.makeMeasureSpec((int) h9.a(Integer.valueOf(i9)), 1073741824);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setContent(g gVar) {
        int i9;
        A7.h simpleDp;
        A7.h simpleDp2;
        int i10 = 0;
        if (gVar instanceof i) {
            Context context = getContext();
            h.d(context, "context");
            v5 v5Var = new v5(context, null, 0);
            addView(v5Var);
            i iVar = (i) gVar;
            BannerSize bannerSize = this.responseSize;
            if (bannerSize != null && (simpleDp2 = getSimpleDp(bannerSize)) != null) {
                i9 = ((Number) simpleDp2.f547a).intValue();
            } else {
                i9 = 0;
            }
            BannerSize bannerSize2 = this.responseSize;
            if (bannerSize2 != null && (simpleDp = getSimpleDp(bannerSize2)) != null) {
                i10 = ((Number) simpleDp.f548b).intValue();
            }
            v5Var.a(iVar, i9, i10, new kg(this));
            return;
        }
        if (gVar instanceof m) {
            Context context2 = getContext();
            h.d(context2, "context");
            ir irVar = new ir(context2, null, 0);
            addView(irVar);
            irVar.setContent((m) gVar);
        }
    }

    public final NotixBannerListener getListener() {
        return this.listener;
    }

    public final void load(BannerRequest request) {
        h.e(request, "request");
        if (this.loadCalled.getAndSet(true)) {
            return;
        }
        this.request = request;
        this.loader = createLoader(request);
        loadOnce();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0707F interfaceC0707F = this.isAttachedF;
        Boolean bool = Boolean.TRUE;
        C0718Q c0718q = (C0718Q) interfaceC0707F;
        c0718q.getClass();
        c0718q.j(null, bool);
        BannerRequest bannerRequest = this.request;
        if (bannerRequest != null) {
            this.loader = createLoader(bannerRequest);
        }
        addListeners();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0707F interfaceC0707F = this.isAttachedF;
        Boolean bool = Boolean.FALSE;
        C0718Q c0718q = (C0718Q) interfaceC0707F;
        c0718q.getClass();
        c0718q.j(null, bool);
        B.e(this.csDefault.g());
        B.e(this.csMain.g());
        disposeLoader();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        InterfaceC0707F interfaceC0707F = this.layoutF;
        Rect rect = new Rect(i9, i10, i11, i12);
        C0718Q c0718q = (C0718Q) interfaceC0707F;
        c0718q.getClass();
        c0718q.j(null, rect);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        A7.h simpleDp;
        A7.h simpleDp2;
        BannerSize bannerSize = this.responseSize;
        int i11 = 0;
        int onMeasure$makeMs = onMeasure$makeMs((bannerSize == null || (simpleDp2 = getSimpleDp(bannerSize)) == null) ? 0 : ((Number) simpleDp2.f547a).intValue());
        BannerSize bannerSize2 = this.responseSize;
        if (bannerSize2 != null && (simpleDp = getSimpleDp(bannerSize2)) != null) {
            i11 = ((Number) simpleDp.f548b).intValue();
        }
        super.onMeasure(onMeasure$makeMs, onMeasure$makeMs(i11));
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z9) {
        super.onVisibilityAggregated(z9);
        InterfaceC0707F interfaceC0707F = this.isVisibleF;
        Boolean valueOf = Boolean.valueOf(z9);
        C0718Q c0718q = (C0718Q) interfaceC0707F;
        c0718q.getClass();
        c0718q.j(null, valueOf);
    }

    public final void setListener(NotixBannerListener notixBannerListener) {
        this.listener = notixBannerListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotixBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        h.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotixBannerView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        h.e(context, "context");
        this.csMain = wq.f().c();
        this.csDefault = wq.f().a();
        this.callbackExecutor = wq.s();
        Boolean bool = Boolean.FALSE;
        this.isAttachedF = AbstractC0714M.c(bool);
        this.isVisibleF = AbstractC0714M.c(bool);
        this.layoutF = AbstractC0714M.c(null);
        this.timeVisibleF = AbstractC0714M.c(0L);
        this.contentLoadedF = AbstractC0714M.c(bool);
        this.loadCalled = new AtomicBoolean(false);
    }

    public /* synthetic */ NotixBannerView(Context context, AttributeSet attributeSet, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i9);
    }
}
