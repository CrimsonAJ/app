package o5;

import F0.AbstractC0095a0;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import co.notix.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: o5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1701a extends AbstractC0095a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f21637a;

    /* renamed from: b, reason: collision with root package name */
    public final List f21638b;

    public C1701a() {
        Paint paint = new Paint();
        this.f21637a = paint;
        this.f21638b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // F0.AbstractC0095a0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        Paint paint = this.f21637a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f21638b.iterator();
        while (it.hasNext()) {
            ((AbstractC1703c) it.next()).getClass();
            ThreadLocal threadLocal = H.a.f2912a;
            float f9 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f9)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f9)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f9)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f9))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).K0()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f15918q.j(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f15918q.f(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f15918q.g(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f15918q.h(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
