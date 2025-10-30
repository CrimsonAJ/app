package Y0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import s.C1935e;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f8522a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8523b;

    /* renamed from: c, reason: collision with root package name */
    public float f8524c;

    /* renamed from: d, reason: collision with root package name */
    public float f8525d;

    /* renamed from: e, reason: collision with root package name */
    public float f8526e;

    /* renamed from: f, reason: collision with root package name */
    public float f8527f;

    /* renamed from: g, reason: collision with root package name */
    public float f8528g;

    /* renamed from: h, reason: collision with root package name */
    public float f8529h;

    /* renamed from: i, reason: collision with root package name */
    public float f8530i;
    public final Matrix j;

    /* renamed from: k, reason: collision with root package name */
    public String f8531k;

    public l() {
        this.f8522a = new Matrix();
        this.f8523b = new ArrayList();
        this.f8524c = 0.0f;
        this.f8525d = 0.0f;
        this.f8526e = 0.0f;
        this.f8527f = 1.0f;
        this.f8528g = 1.0f;
        this.f8529h = 0.0f;
        this.f8530i = 0.0f;
        this.j = new Matrix();
        this.f8531k = null;
    }

    @Override // Y0.m
    public final boolean a() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f8523b;
            if (i9 >= arrayList.size()) {
                return false;
            }
            if (((m) arrayList.get(i9)).a()) {
                return true;
            }
            i9++;
        }
    }

    @Override // Y0.m
    public final boolean b(int[] iArr) {
        int i9 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.f8523b;
            if (i9 < arrayList.size()) {
                z9 |= ((m) arrayList.get(i9)).b(iArr);
                i9++;
            } else {
                return z9;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f8525d, -this.f8526e);
        matrix.postScale(this.f8527f, this.f8528g);
        matrix.postRotate(this.f8524c, 0.0f, 0.0f);
        matrix.postTranslate(this.f8529h + this.f8525d, this.f8530i + this.f8526e);
    }

    public String getGroupName() {
        return this.f8531k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f8525d;
    }

    public float getPivotY() {
        return this.f8526e;
    }

    public float getRotation() {
        return this.f8524c;
    }

    public float getScaleX() {
        return this.f8527f;
    }

    public float getScaleY() {
        return this.f8528g;
    }

    public float getTranslateX() {
        return this.f8529h;
    }

    public float getTranslateY() {
        return this.f8530i;
    }

    public void setPivotX(float f9) {
        if (f9 != this.f8525d) {
            this.f8525d = f9;
            c();
        }
    }

    public void setPivotY(float f9) {
        if (f9 != this.f8526e) {
            this.f8526e = f9;
            c();
        }
    }

    public void setRotation(float f9) {
        if (f9 != this.f8524c) {
            this.f8524c = f9;
            c();
        }
    }

    public void setScaleX(float f9) {
        if (f9 != this.f8527f) {
            this.f8527f = f9;
            c();
        }
    }

    public void setScaleY(float f9) {
        if (f9 != this.f8528g) {
            this.f8528g = f9;
            c();
        }
    }

    public void setTranslateX(float f9) {
        if (f9 != this.f8529h) {
            this.f8529h = f9;
            c();
        }
    }

    public void setTranslateY(float f9) {
        if (f9 != this.f8530i) {
            this.f8530i = f9;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [Y0.k, Y0.n] */
    public l(l lVar, C1935e c1935e) {
        n nVar;
        this.f8522a = new Matrix();
        this.f8523b = new ArrayList();
        this.f8524c = 0.0f;
        this.f8525d = 0.0f;
        this.f8526e = 0.0f;
        this.f8527f = 1.0f;
        this.f8528g = 1.0f;
        this.f8529h = 0.0f;
        this.f8530i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.f8531k = null;
        this.f8524c = lVar.f8524c;
        this.f8525d = lVar.f8525d;
        this.f8526e = lVar.f8526e;
        this.f8527f = lVar.f8527f;
        this.f8528g = lVar.f8528g;
        this.f8529h = lVar.f8529h;
        this.f8530i = lVar.f8530i;
        String str = lVar.f8531k;
        this.f8531k = str;
        if (str != null) {
            c1935e.put(str, this);
        }
        matrix.set(lVar.j);
        ArrayList arrayList = lVar.f8523b;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            Object obj = arrayList.get(i9);
            if (obj instanceof l) {
                this.f8523b.add(new l((l) obj, c1935e));
            } else {
                if (obj instanceof k) {
                    k kVar = (k) obj;
                    ?? nVar2 = new n(kVar);
                    nVar2.f8513e = 0.0f;
                    nVar2.f8515g = 1.0f;
                    nVar2.f8516h = 1.0f;
                    nVar2.f8517i = 0.0f;
                    nVar2.j = 1.0f;
                    nVar2.f8518k = 0.0f;
                    nVar2.f8519l = Paint.Cap.BUTT;
                    nVar2.f8520m = Paint.Join.MITER;
                    nVar2.f8521n = 4.0f;
                    nVar2.f8512d = kVar.f8512d;
                    nVar2.f8513e = kVar.f8513e;
                    nVar2.f8515g = kVar.f8515g;
                    nVar2.f8514f = kVar.f8514f;
                    nVar2.f8534c = kVar.f8534c;
                    nVar2.f8516h = kVar.f8516h;
                    nVar2.f8517i = kVar.f8517i;
                    nVar2.j = kVar.j;
                    nVar2.f8518k = kVar.f8518k;
                    nVar2.f8519l = kVar.f8519l;
                    nVar2.f8520m = kVar.f8520m;
                    nVar2.f8521n = kVar.f8521n;
                    nVar = nVar2;
                } else if (obj instanceof j) {
                    nVar = new n((j) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f8523b.add(nVar);
                Object obj2 = nVar.f8533b;
                if (obj2 != null) {
                    c1935e.put(obj2, nVar);
                }
            }
        }
    }
}
