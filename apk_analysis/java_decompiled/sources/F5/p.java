package F5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p extends v {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2542c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f2543d;

    public p(ArrayList arrayList, Matrix matrix) {
        this.f2542c = arrayList;
        this.f2543d = matrix;
    }

    @Override // F5.v
    public final void a(Matrix matrix, E5.a aVar, int i9, Canvas canvas) {
        ArrayList arrayList = this.f2542c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((v) obj).a(this.f2543d, aVar, i9, canvas);
        }
    }
}
