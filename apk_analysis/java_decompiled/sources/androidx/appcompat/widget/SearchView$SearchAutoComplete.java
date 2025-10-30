package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import m5.c;
import p.AbstractC1757M0;
import p.C1813p;

/* loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends C1813p {

    /* renamed from: e, reason: collision with root package name */
    public int f9479e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9480f;

    /* renamed from: g, reason: collision with root package name */
    public final c f9481g;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9481g = new c(3, this);
        this.f9479e = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i9 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i9 >= 960 && i10 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i9 < 600) {
            if (i9 < 640 || i10 < 480) {
                return 160;
            }
            return 192;
        }
        return 192;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        if (this.f9479e > 0 && !super.enoughToFilter()) {
            return false;
        }
        return true;
    }

    @Override // p.C1813p, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f9480f) {
            c cVar = this.f9481g;
            removeCallbacks(cVar);
            post(cVar);
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z9, int i9, Rect rect) {
        super.onFocusChanged(z9, i9, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i9, KeyEvent keyEvent) {
        if (i9 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i9, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        if (!z9) {
        } else {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z9) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        c cVar = this.f9481g;
        if (!z9) {
            this.f9480f = false;
            removeCallbacks(cVar);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (inputMethodManager.isActive(this)) {
                this.f9480f = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
                return;
            }
            this.f9480f = true;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i9) {
        super.setThreshold(i9);
        this.f9479e = i9;
    }

    public void setSearchView(AbstractC1757M0 abstractC1757M0) {
    }
}
