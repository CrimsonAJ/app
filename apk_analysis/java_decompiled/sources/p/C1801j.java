package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import co.notix.R;
import com.google.android.gms.internal.measurement.D1;
import o.C1661b;

/* renamed from: p.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1801j extends AppCompatImageView implements InterfaceC1807m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1805l f22001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1801j(C1805l c1805l, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f22001d = c1805l;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        D1.J(this, getContentDescription());
        setOnTouchListener(new C1661b(this, this));
    }

    @Override // p.InterfaceC1807m
    public final boolean b() {
        return false;
    }

    @Override // p.InterfaceC1807m
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f22001d.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i9, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i9, i10, i11, i12);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
