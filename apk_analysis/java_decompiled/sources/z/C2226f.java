package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2226f {

    /* renamed from: a, reason: collision with root package name */
    public final float f25255a;

    /* renamed from: b, reason: collision with root package name */
    public final float f25256b;

    /* renamed from: c, reason: collision with root package name */
    public final float f25257c;

    /* renamed from: d, reason: collision with root package name */
    public final float f25258d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25259e;

    public C2226f(Context context, XmlResourceParser xmlResourceParser) {
        this.f25255a = Float.NaN;
        this.f25256b = Float.NaN;
        this.f25257c = Float.NaN;
        this.f25258d = Float.NaN;
        this.f25259e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f25359i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = obtainStyledAttributes.getIndex(i9);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f25259e);
                this.f25259e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new l().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f25258d = obtainStyledAttributes.getDimension(index, this.f25258d);
            } else if (index == 2) {
                this.f25256b = obtainStyledAttributes.getDimension(index, this.f25256b);
            } else if (index == 3) {
                this.f25257c = obtainStyledAttributes.getDimension(index, this.f25257c);
            } else if (index == 4) {
                this.f25255a = obtainStyledAttributes.getDimension(index, this.f25255a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
