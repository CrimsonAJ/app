package androidx.mediarouter.app;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: androidx.mediarouter.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0574j implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f10097b;

    public ViewTreeObserverOnGlobalLayoutListenerC0574j(s sVar, boolean z9) {
        this.f10097b = sVar;
        this.f10096a = z9;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i9;
        int i10;
        boolean z9;
        boolean z10;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        ImageView.ScaleType scaleType;
        s sVar = this.f10097b;
        sVar.f10168t.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (sVar.f10131D0) {
            sVar.f10132E0 = true;
            return;
        }
        int i11 = sVar.f10124A.getLayoutParams().height;
        s.n(sVar.f10124A, -1);
        sVar.t(sVar.h());
        View decorView = sVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(sVar.getWindow().getAttributes().width, 1073741824), 0);
        s.n(sVar.f10124A, i11);
        if ((sVar.f10170u.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) sVar.f10170u.getDrawable()).getBitmap()) != null) {
            i9 = sVar.k(bitmap.getWidth(), bitmap.getHeight());
            ImageView imageView = sVar.f10170u;
            if (bitmap.getWidth() >= bitmap.getHeight()) {
                scaleType = ImageView.ScaleType.FIT_XY;
            } else {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            imageView.setScaleType(scaleType);
        } else {
            i9 = 0;
        }
        int l9 = sVar.l(sVar.h());
        int size = sVar.f10142Z.size();
        boolean m9 = sVar.m();
        t0.C c3 = sVar.f10148i;
        if (m9) {
            i10 = Collections.unmodifiableList(c3.f22860v).size() * sVar.f10156m0;
        } else {
            i10 = 0;
        }
        if (size > 0) {
            i10 += sVar.f10160o0;
        }
        int min = Math.min(i10, sVar.f10158n0);
        if (!sVar.f10129C0) {
            min = 0;
        }
        int max = Math.max(i9, min) + l9;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (sVar.f10166s.getMeasuredHeight() - sVar.f10168t.getMeasuredHeight());
        if (i9 > 0 && max <= height) {
            sVar.f10170u.setVisibility(0);
            s.n(sVar.f10170u, i9);
        } else {
            if (sVar.f10124A.getMeasuredHeight() + sVar.f10141X.getLayoutParams().height >= sVar.f10168t.getMeasuredHeight()) {
                sVar.f10170u.setVisibility(8);
            }
            max = min + l9;
            i9 = 0;
        }
        if (sVar.h() && max <= height) {
            sVar.f10126B.setVisibility(0);
        } else {
            sVar.f10126B.setVisibility(8);
        }
        if (sVar.f10126B.getVisibility() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        sVar.t(z9);
        if (sVar.f10126B.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int l10 = sVar.l(z10);
        int max2 = Math.max(i9, min) + l10;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        sVar.f10124A.clearAnimation();
        sVar.f10141X.clearAnimation();
        sVar.f10168t.clearAnimation();
        boolean z11 = this.f10096a;
        if (z11) {
            sVar.g(sVar.f10124A, l10);
            sVar.g(sVar.f10141X, min);
            sVar.g(sVar.f10168t, height);
        } else {
            s.n(sVar.f10124A, l10);
            s.n(sVar.f10141X, min);
            s.n(sVar.f10168t, height);
        }
        s.n(sVar.f10165r, rect.height());
        List unmodifiableList = Collections.unmodifiableList(c3.f22860v);
        if (unmodifiableList.isEmpty()) {
            sVar.f10142Z.clear();
            sVar.Y.notifyDataSetChanged();
            return;
        }
        if (new HashSet(sVar.f10142Z).equals(new HashSet(unmodifiableList))) {
            sVar.Y.notifyDataSetChanged();
            return;
        }
        if (z11) {
            OverlayListView overlayListView = sVar.f10141X;
            r rVar = sVar.Y;
            hashMap = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i12 = 0; i12 < overlayListView.getChildCount(); i12++) {
                Object item = rVar.getItem(firstVisiblePosition + i12);
                View childAt = overlayListView.getChildAt(i12);
                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            hashMap = null;
        }
        if (z11) {
            OverlayListView overlayListView2 = sVar.f10141X;
            r rVar2 = sVar.Y;
            hashMap2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i13 = 0; i13 < overlayListView2.getChildCount(); i13++) {
                Object item2 = rVar2.getItem(firstVisiblePosition2 + i13);
                View childAt2 = overlayListView2.getChildAt(i13);
                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(createBitmap));
                hashMap2.put(item2, new BitmapDrawable(sVar.j.getResources(), createBitmap));
            }
        } else {
            hashMap2 = null;
        }
        ArrayList arrayList = sVar.f10142Z;
        HashSet hashSet = new HashSet(unmodifiableList);
        hashSet.removeAll(arrayList);
        sVar.f10143f0 = hashSet;
        HashSet hashSet2 = new HashSet(sVar.f10142Z);
        hashSet2.removeAll(unmodifiableList);
        sVar.f10145g0 = hashSet2;
        sVar.f10142Z.addAll(0, sVar.f10143f0);
        sVar.f10142Z.removeAll(sVar.f10145g0);
        sVar.Y.notifyDataSetChanged();
        if (z11 && sVar.f10129C0) {
            if (sVar.f10145g0.size() + sVar.f10143f0.size() > 0) {
                sVar.f10141X.setEnabled(false);
                sVar.f10141X.requestLayout();
                sVar.f10131D0 = true;
                sVar.f10141X.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0576l(sVar, hashMap, hashMap2));
                return;
            }
        }
        sVar.f10143f0 = null;
        sVar.f10145g0 = null;
    }
}
