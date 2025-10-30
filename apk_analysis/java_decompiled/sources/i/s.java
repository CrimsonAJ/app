package i;

import P.Q;
import P.X;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import co.notix.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import l1.C1535g;
import n.AbstractC1595a;
import n.C1597c;
import s.C1939i;

/* loaded from: classes.dex */
public final class s implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f18087a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18088b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18089c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f18091e;

    public s(w wVar, Window.Callback callback) {
        this.f18091e = wVar;
        if (callback != null) {
            this.f18087a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f18088b = true;
            callback.onContentChanged();
        } finally {
            this.f18088b = false;
        }
    }

    public final boolean b(int i9, Menu menu) {
        return this.f18087a.onMenuOpened(i9, menu);
    }

    public final void c(int i9, Menu menu) {
        this.f18087a.onPanelClosed(i9, menu);
    }

    public final void d(List list, Menu menu, int i9) {
        n.l.a(this.f18087a, list, menu, i9);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f18087a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z9 = this.f18089c;
        Window.Callback callback = this.f18087a;
        if (z9) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.f18091e.s(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f18087a
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            i.w r2 = r6.f18091e
            r2.A()
            i.I r3 = r2.f18138o
            r4 = 0
            if (r3 == 0) goto L3d
            i.H r3 = r3.f18009o
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            o.l r3 = r3.f17992d
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            i.v r0 = r2.f18131k0
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.F(r0, r3, r7)
            if (r0 == 0) goto L52
            i.v r7 = r2.f18131k0
            if (r7 == 0) goto L3b
            r7.f18106l = r1
            goto L3b
        L52:
            i.v r0 = r2.f18131k0
            if (r0 != 0) goto L6a
            i.v r0 = r2.z(r4)
            r2.G(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.F(r0, r3, r7)
            r0.f18105k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            return r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.s.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f18087a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f18087a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f18087a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f18087a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f18087a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f18087a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f18088b) {
            this.f18087a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i9, Menu menu) {
        if (i9 == 0 && !(menu instanceof o.l)) {
            return false;
        }
        return this.f18087a.onCreatePanelMenu(i9, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i9) {
        return this.f18087a.onCreatePanelView(i9);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f18087a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i9, MenuItem menuItem) {
        return this.f18087a.onMenuItemSelected(i9, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i9, Menu menu) {
        b(i9, menu);
        w wVar = this.f18091e;
        if (i9 == 108) {
            wVar.A();
            I i10 = wVar.f18138o;
            if (i10 != null && true != i10.f18012r) {
                i10.f18012r = true;
                ArrayList arrayList = i10.f18013s;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
            return true;
        }
        wVar.getClass();
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i9, Menu menu) {
        if (this.f18090d) {
            this.f18087a.onPanelClosed(i9, menu);
            return;
        }
        c(i9, menu);
        w wVar = this.f18091e;
        if (i9 == 108) {
            wVar.A();
            I i10 = wVar.f18138o;
            if (i10 != null && i10.f18012r) {
                i10.f18012r = false;
                ArrayList arrayList = i10.f18013s;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
                return;
            }
            return;
        }
        if (i9 == 0) {
            v z9 = wVar.z(i9);
            if (z9.f18107m) {
                wVar.q(z9, false);
                return;
            }
            return;
        }
        wVar.getClass();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z9) {
        n.m.a(this.f18087a, z9);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i9, View view, Menu menu) {
        o.l lVar;
        if (menu instanceof o.l) {
            lVar = (o.l) menu;
        } else {
            lVar = null;
        }
        if (i9 == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.f21397x = true;
        }
        boolean onPreparePanel = this.f18087a.onPreparePanel(i9, view, menu);
        if (lVar != null) {
            lVar.f21397x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i9) {
        o.l lVar = this.f18091e.z(0).f18103h;
        if (lVar != null) {
            d(list, lVar, i9);
        } else {
            d(list, menu, i9);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return n.k.a(this.f18087a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f18087a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z9) {
        this.f18087a.onWindowFocusChanged(z9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, l1.g] */
    /* JADX WARN: Type inference failed for: r3v10, types: [n.a, n.d, java.lang.Object, o.j] */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i9) {
        ViewGroup viewGroup;
        int i10 = 1;
        boolean z9 = false;
        w wVar = this.f18091e;
        wVar.getClass();
        if (i9 != 0) {
            return n.k.b(this.f18087a, callback, i9);
        }
        Context context = wVar.f18130k;
        ?? obj = new Object();
        obj.f20183b = context;
        obj.f20182a = callback;
        obj.f20184c = new ArrayList();
        obj.f20185d = new C1939i(0);
        AbstractC1595a abstractC1595a = wVar.f18149u;
        if (abstractC1595a != null) {
            abstractC1595a.a();
        }
        O0.c cVar = new O0.c(wVar, obj, 25, z9);
        wVar.A();
        I i11 = wVar.f18138o;
        if (i11 != null) {
            H h7 = i11.f18009o;
            if (h7 != null) {
                h7.a();
            }
            i11.f18004i.setHideOnContentScrollEnabled(false);
            i11.f18006l.e();
            H h9 = new H(i11, i11.f18006l.getContext(), cVar);
            o.l lVar = h9.f17992d;
            lVar.w();
            try {
                if (((C1535g) h9.f17993e.f5263b).x(h9, lVar)) {
                    i11.f18009o = h9;
                    h9.g();
                    i11.f18006l.c(h9);
                    i11.C(true);
                } else {
                    h9 = null;
                }
                wVar.f18149u = h9;
            } finally {
                lVar.v();
            }
        }
        if (wVar.f18149u == null) {
            X x5 = wVar.f18157y;
            if (x5 != null) {
                x5.b();
            }
            AbstractC1595a abstractC1595a2 = wVar.f18149u;
            if (abstractC1595a2 != null) {
                abstractC1595a2.a();
            }
            if (wVar.f18151v == null) {
                boolean z10 = wVar.f18126g0;
                Context context2 = wVar.f18130k;
                if (z10) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C1597c c1597c = new C1597c(context2, 0);
                        c1597c.getTheme().setTo(newTheme);
                        context2 = c1597c;
                    }
                    wVar.f18151v = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    wVar.f18153w = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    wVar.f18153w.setContentView(wVar.f18151v);
                    wVar.f18153w.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    wVar.f18151v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    wVar.f18153w.setHeight(-2);
                    wVar.f18155x = new m(wVar, i10);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) wVar.f18114A.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        wVar.A();
                        I i12 = wVar.f18138o;
                        Context D8 = i12 != null ? i12.D() : null;
                        if (D8 != null) {
                            context2 = D8;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        wVar.f18151v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (wVar.f18151v != null) {
                X x9 = wVar.f18157y;
                if (x9 != null) {
                    x9.b();
                }
                wVar.f18151v.e();
                Context context3 = wVar.f18151v.getContext();
                ActionBarContextView actionBarContextView = wVar.f18151v;
                ?? obj2 = new Object();
                obj2.f20945c = context3;
                obj2.f20946d = actionBarContextView;
                obj2.f20947e = cVar;
                o.l lVar2 = new o.l(actionBarContextView.getContext());
                lVar2.f21385l = 1;
                obj2.f20950h = lVar2;
                lVar2.f21379e = obj2;
                if (((C1535g) cVar.f5263b).x(obj2, lVar2)) {
                    obj2.g();
                    wVar.f18151v.c(obj2);
                    wVar.f18149u = obj2;
                    if (wVar.f18159z && (viewGroup = wVar.f18114A) != null && viewGroup.isLaidOut()) {
                        wVar.f18151v.setAlpha(0.0f);
                        X a5 = Q.a(wVar.f18151v);
                        a5.a(1.0f);
                        wVar.f18157y = a5;
                        a5.d(new o(i10, wVar));
                    } else {
                        wVar.f18151v.setAlpha(1.0f);
                        wVar.f18151v.setVisibility(0);
                        if (wVar.f18151v.getParent() instanceof View) {
                            View view = (View) wVar.f18151v.getParent();
                            WeakHashMap weakHashMap = Q.f5546a;
                            P.F.c(view);
                        }
                    }
                    if (wVar.f18153w != null) {
                        wVar.f18132l.getDecorView().post(wVar.f18155x);
                    }
                } else {
                    wVar.f18149u = null;
                }
            }
            wVar.I();
            wVar.f18149u = wVar.f18149u;
        }
        wVar.I();
        AbstractC1595a abstractC1595a3 = wVar.f18149u;
        if (abstractC1595a3 != null) {
            return obj.n(abstractC1595a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f18087a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
