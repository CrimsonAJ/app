package A5;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public Y0.b f387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f389c;

    public /* synthetic */ c(View view, int i9) {
        this.f388b = i9;
        this.f389c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.f388b) {
            case 0:
                d dVar = (d) this.f389c;
                dVar.setIndeterminate(false);
                dVar.b(dVar.f391b);
                return;
            case 1:
                d dVar2 = (d) this.f389c;
                if (!dVar2.f395f) {
                    dVar2.setVisibility(dVar2.f396g);
                    return;
                }
                return;
            default:
                ColorStateList colorStateList = ((MaterialCheckBox) this.f389c).f15933o;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    return;
                }
                return;
        }
    }

    public void b(Drawable drawable) {
        switch (this.f388b) {
            case 2:
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) this.f389c;
                ColorStateList colorStateList = materialCheckBox.f15933o;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(materialCheckBox.f15937s, colorStateList.getDefaultColor()));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(Drawable drawable) {
    }
}
