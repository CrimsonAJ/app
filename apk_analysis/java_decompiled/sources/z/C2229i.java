package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import v.AbstractC2091a;

/* renamed from: z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2229i {

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f25325e;

    /* renamed from: a, reason: collision with root package name */
    public int f25326a;

    /* renamed from: b, reason: collision with root package name */
    public int f25327b;

    /* renamed from: c, reason: collision with root package name */
    public float f25328c;

    /* renamed from: d, reason: collision with root package name */
    public float f25329d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25325e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f25355e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = obtainStyledAttributes.getIndex(i9);
            switch (f25325e.get(index)) {
                case 1:
                    this.f25329d = obtainStyledAttributes.getFloat(index, this.f25329d);
                    break;
                case 2:
                    this.f25327b = obtainStyledAttributes.getInt(index, this.f25327b);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC2091a.f23716a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f25326a = l.f(obtainStyledAttributes, index, this.f25326a);
                    break;
                case 6:
                    this.f25328c = obtainStyledAttributes.getFloat(index, this.f25328c);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
