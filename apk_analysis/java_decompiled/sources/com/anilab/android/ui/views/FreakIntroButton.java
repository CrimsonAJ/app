package com.anilab.android.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import co.notix.R;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class FreakIntroButton extends MaterialButton {

    /* renamed from: t, reason: collision with root package name */
    public long f13851t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13852u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreakIntroButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
    }

    public final void e(boolean z9, boolean z10) {
        if (this.f13852u == z9) {
            return;
        }
        this.f13852u = z9;
        if (z9) {
            if (z10 && this.f13851t == 0) {
                setText(R.string.label_next_episode);
                setIconResource(R.drawable.ic_next);
                return;
            } else {
                setText(R.string.label_skip_outro);
                setIcon(null);
                return;
            }
        }
        setText(R.string.label_skip_intro);
        setIcon(null);
    }

    public final void setOutroStartMs(long j) {
        this.f13851t = j;
    }
}
