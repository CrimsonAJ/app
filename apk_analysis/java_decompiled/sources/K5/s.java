package K5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f4383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4384c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f4385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f4386e;

    public s(u uVar, int i9, TextView textView, int i10, TextView textView2) {
        this.f4386e = uVar;
        this.f4382a = i9;
        this.f4383b = textView;
        this.f4384c = i10;
        this.f4385d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i9 = this.f4382a;
        u uVar = this.f4386e;
        uVar.f4403n = i9;
        uVar.f4401l = null;
        TextView textView = this.f4383b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f4384c == 1 && (appCompatTextView = uVar.f4407r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f4385d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f4385d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
