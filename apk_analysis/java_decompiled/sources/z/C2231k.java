package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2231k {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f25334m;

    /* renamed from: a, reason: collision with root package name */
    public float f25335a;

    /* renamed from: b, reason: collision with root package name */
    public float f25336b;

    /* renamed from: c, reason: collision with root package name */
    public float f25337c;

    /* renamed from: d, reason: collision with root package name */
    public float f25338d;

    /* renamed from: e, reason: collision with root package name */
    public float f25339e;

    /* renamed from: f, reason: collision with root package name */
    public float f25340f;

    /* renamed from: g, reason: collision with root package name */
    public float f25341g;

    /* renamed from: h, reason: collision with root package name */
    public float f25342h;

    /* renamed from: i, reason: collision with root package name */
    public float f25343i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25344k;

    /* renamed from: l, reason: collision with root package name */
    public float f25345l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25334m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f25358h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = obtainStyledAttributes.getIndex(i9);
            switch (f25334m.get(index)) {
                case 1:
                    this.f25335a = obtainStyledAttributes.getFloat(index, this.f25335a);
                    break;
                case 2:
                    this.f25336b = obtainStyledAttributes.getFloat(index, this.f25336b);
                    break;
                case 3:
                    this.f25337c = obtainStyledAttributes.getFloat(index, this.f25337c);
                    break;
                case 4:
                    this.f25338d = obtainStyledAttributes.getFloat(index, this.f25338d);
                    break;
                case 5:
                    this.f25339e = obtainStyledAttributes.getFloat(index, this.f25339e);
                    break;
                case 6:
                    this.f25340f = obtainStyledAttributes.getDimension(index, this.f25340f);
                    break;
                case 7:
                    this.f25341g = obtainStyledAttributes.getDimension(index, this.f25341g);
                    break;
                case 8:
                    this.f25342h = obtainStyledAttributes.getDimension(index, this.f25342h);
                    break;
                case 9:
                    this.f25343i = obtainStyledAttributes.getDimension(index, this.f25343i);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    this.f25344k = true;
                    this.f25345l = obtainStyledAttributes.getDimension(index, this.f25345l);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
