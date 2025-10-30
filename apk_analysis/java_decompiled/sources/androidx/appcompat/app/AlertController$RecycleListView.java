package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import h.AbstractC1260a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f9334a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9335b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1260a.f17823t);
        this.f9335b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f9334a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
