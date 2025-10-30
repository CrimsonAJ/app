package Y0;

import A3.E;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: d, reason: collision with root package name */
    public E f8512d;

    /* renamed from: e, reason: collision with root package name */
    public float f8513e;

    /* renamed from: f, reason: collision with root package name */
    public E f8514f;

    /* renamed from: g, reason: collision with root package name */
    public float f8515g;

    /* renamed from: h, reason: collision with root package name */
    public float f8516h;

    /* renamed from: i, reason: collision with root package name */
    public float f8517i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f8518k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f8519l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f8520m;

    /* renamed from: n, reason: collision with root package name */
    public float f8521n;

    @Override // Y0.m
    public final boolean a() {
        if (!this.f8514f.k() && !this.f8512d.k()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // Y0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            A3.E r0 = r6.f8514f
            boolean r1 = r0.k()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f48d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f46b
            if (r1 == r4) goto L1e
            r0.f46b = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            A3.E r1 = r6.f8512d
            boolean r4 = r1.k()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f48d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f46b
            if (r7 == r4) goto L3a
            r1.f46b = r7
            r2 = r3
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.k.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f8516h;
    }

    public int getFillColor() {
        return this.f8514f.f46b;
    }

    public float getStrokeAlpha() {
        return this.f8515g;
    }

    public int getStrokeColor() {
        return this.f8512d.f46b;
    }

    public float getStrokeWidth() {
        return this.f8513e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.f8518k;
    }

    public float getTrimPathStart() {
        return this.f8517i;
    }

    public void setFillAlpha(float f9) {
        this.f8516h = f9;
    }

    public void setFillColor(int i9) {
        this.f8514f.f46b = i9;
    }

    public void setStrokeAlpha(float f9) {
        this.f8515g = f9;
    }

    public void setStrokeColor(int i9) {
        this.f8512d.f46b = i9;
    }

    public void setStrokeWidth(float f9) {
        this.f8513e = f9;
    }

    public void setTrimPathEnd(float f9) {
        this.j = f9;
    }

    public void setTrimPathOffset(float f9) {
        this.f8518k = f9;
    }

    public void setTrimPathStart(float f9) {
        this.f8517i = f9;
    }
}
