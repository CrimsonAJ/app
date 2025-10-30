package com.google.android.material.internal;

import I5.e;
import P.Q;
import U.b;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import w5.C2142b;

/* loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f16073g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f16074d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16075e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16076f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, co.notix.R.attr.imageButtonStyle);
        this.f16075e = true;
        this.f16076f = true;
        Q.m(this, new e(4, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f16074d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i9) {
        if (this.f16074d) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i9 + 1), f16073g);
        }
        return super.onCreateDrawableState(i9);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2142b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2142b c2142b = (C2142b) parcelable;
        super.onRestoreInstanceState(c2142b.f7246a);
        setChecked(c2142b.f24215c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, w5.b, U.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        bVar.f24215c = this.f16074d;
        return bVar;
    }

    public void setCheckable(boolean z9) {
        if (this.f16075e != z9) {
            this.f16075e = z9;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        if (this.f16075e && this.f16074d != z9) {
            this.f16074d = z9;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z9) {
        this.f16076f = z9;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        if (this.f16076f) {
            super.setPressed(z9);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f16074d);
    }
}
