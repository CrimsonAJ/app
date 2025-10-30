package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: z.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2230j {

    /* renamed from: a, reason: collision with root package name */
    public int f25330a;

    /* renamed from: b, reason: collision with root package name */
    public int f25331b;

    /* renamed from: c, reason: collision with root package name */
    public float f25332c;

    /* renamed from: d, reason: collision with root package name */
    public float f25333d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f25356f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = obtainStyledAttributes.getIndex(i9);
            if (index == 1) {
                this.f25332c = obtainStyledAttributes.getFloat(index, this.f25332c);
            } else if (index == 0) {
                int i10 = obtainStyledAttributes.getInt(index, this.f25330a);
                this.f25330a = i10;
                this.f25330a = l.f25346d[i10];
            } else if (index == 4) {
                this.f25331b = obtainStyledAttributes.getInt(index, this.f25331b);
            } else if (index == 3) {
                this.f25333d = obtainStyledAttributes.getFloat(index, this.f25333d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
