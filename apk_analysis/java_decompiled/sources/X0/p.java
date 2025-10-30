package X0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public m f8218a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f8219b;

    /* JADX WARN: Removed duplicated region for block: B:115:0x01f4 A[EDGE_INSN: B:115:0x01f4->B:116:0x01f4 BREAK  A[LOOP:1: B:16:0x0086->B:28:0x01ea], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.p.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f8219b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = q.f8222c;
        ViewGroup viewGroup2 = this.f8219b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) q.b().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                ((m) obj).B(viewGroup2);
            }
        }
        this.f8218a.k(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
