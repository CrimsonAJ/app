package N5;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import i5.C1380a;
import l5.C1568a;

/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5214b;

    public /* synthetic */ a(int i9, Object obj) {
        this.f5213a = i9;
        this.f5214b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        C1380a c1380a;
        switch (this.f5213a) {
            case 0:
                b bVar = (b) this.f5214b;
                bVar.getClass();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                bVar.f5224i0 = iArr[0];
                view.getWindowVisibleDisplayFrame(bVar.f5218D);
                return;
            case 1:
                throw null;
            default:
                C1568a c1568a = (C1568a) this.f5214b;
                ImageView imageView = c1568a.f25442n;
                if (imageView.getVisibility() == 0 && (c1380a = c1568a.f25436g0) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    c1380a.setBounds(rect);
                    c1380a.i(imageView, null);
                    return;
                }
                return;
        }
    }
}
