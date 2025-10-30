package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10058a;

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10058a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float interpolation;
        boolean z9;
        super.onDraw(canvas);
        ArrayList arrayList = this.f10058a;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                O o9 = (O) it.next();
                BitmapDrawable bitmapDrawable = o9.f10047a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (o9.f10056k) {
                    z9 = false;
                } else {
                    float f9 = 0.0f;
                    float max = Math.max(0.0f, Math.min(1.0f, ((float) (drawingTime - o9.f10055i)) / ((float) o9.f10051e)));
                    if (o9.j) {
                        f9 = max;
                    }
                    Interpolator interpolator = o9.f10050d;
                    if (interpolator == null) {
                        interpolation = f9;
                    } else {
                        interpolation = interpolator.getInterpolation(f9);
                    }
                    int i9 = (int) (o9.f10053g * interpolation);
                    Rect rect = o9.f10052f;
                    int i10 = rect.top + i9;
                    Rect rect2 = o9.f10049c;
                    rect2.top = i10;
                    rect2.bottom = rect.bottom + i9;
                    float b9 = u0.z.b(o9.f10054h, 1.0f, interpolation, 1.0f);
                    o9.f10048b = b9;
                    BitmapDrawable bitmapDrawable2 = o9.f10047a;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (b9 * 255.0f));
                        bitmapDrawable2.setBounds(rect2);
                    }
                    if (o9.j && f9 >= 1.0f) {
                        o9.f10056k = true;
                        O0.c cVar = o9.f10057l;
                        if (cVar != null) {
                            s sVar = (s) cVar.f5264c;
                            sVar.f10147h0.remove((t0.C) cVar.f5263b);
                            sVar.Y.notifyDataSetChanged();
                        }
                    }
                    z9 = !o9.f10056k;
                }
                if (!z9) {
                    it.remove();
                }
            }
        }
    }
}
