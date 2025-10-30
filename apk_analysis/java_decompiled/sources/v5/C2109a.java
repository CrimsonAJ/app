package v5;

import F5.h;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2109a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f23894a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShapeableImageView f23895b;

    public C2109a(ShapeableImageView shapeableImageView) {
        this.f23895b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f23895b;
        if (shapeableImageView.f16062l == null) {
            return;
        }
        if (shapeableImageView.f16061k == null) {
            shapeableImageView.f16061k = new h(shapeableImageView.f16062l);
        }
        RectF rectF = shapeableImageView.f16056e;
        Rect rect = this.f23894a;
        rectF.round(rect);
        shapeableImageView.f16061k.setBounds(rect);
        shapeableImageView.f16061k.getOutline(outline);
    }
}
