package f0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import d0.C1091i;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1158j implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f17262a;

    public C1158j(TransformationMethod transformationMethod) {
        this.f17262a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f17262a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && C1091i.a().b() == 1) {
            C1091i a5 = C1091i.a();
            a5.getClass();
            return a5.e(charSequence, 0, charSequence.length());
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z9, int i9, Rect rect) {
        TransformationMethod transformationMethod = this.f17262a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z9, i9, rect);
        }
    }
}
