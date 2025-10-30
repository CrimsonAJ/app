package p;

import android.view.View;
import android.view.ViewConfiguration;
import o.InterfaceC1657B;

/* renamed from: p.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1818r0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f22064a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22065b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22066c;

    /* renamed from: d, reason: collision with root package name */
    public final View f22067d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC1816q0 f22068e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC1816q0 f22069f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22070g;

    /* renamed from: h, reason: collision with root package name */
    public int f22071h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f22072i = new int[2];

    public AbstractViewOnTouchListenerC1818r0(View view) {
        this.f22067d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f22064a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f22065b = tapTimeout;
        this.f22066c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC1816q0 runnableC1816q0 = this.f22069f;
        View view = this.f22067d;
        if (runnableC1816q0 != null) {
            view.removeCallbacks(runnableC1816q0);
        }
        RunnableC1816q0 runnableC1816q02 = this.f22068e;
        if (runnableC1816q02 != null) {
            view.removeCallbacks(runnableC1816q02);
        }
    }

    public abstract InterfaceC1657B b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC1657B b9 = b();
        if (b9 != null && b9.a()) {
            b9.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.AbstractViewOnTouchListenerC1818r0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f22070g = false;
        this.f22071h = -1;
        RunnableC1816q0 runnableC1816q0 = this.f22068e;
        if (runnableC1816q0 != null) {
            this.f22067d.removeCallbacks(runnableC1816q0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
