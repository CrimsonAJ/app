package Y0;

import A3.E;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import s.C1935e;
import s.C1939i;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f8535p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f8536a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f8537b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f8538c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f8539d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f8540e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f8541f;

    /* renamed from: g, reason: collision with root package name */
    public final l f8542g;

    /* renamed from: h, reason: collision with root package name */
    public float f8543h;

    /* renamed from: i, reason: collision with root package name */
    public float f8544i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f8545k;

    /* renamed from: l, reason: collision with root package name */
    public int f8546l;

    /* renamed from: m, reason: collision with root package name */
    public String f8547m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f8548n;

    /* renamed from: o, reason: collision with root package name */
    public final C1935e f8549o;

    /* JADX WARN: Type inference failed for: r0v4, types: [s.e, s.i] */
    public o() {
        this.f8538c = new Matrix();
        this.f8543h = 0.0f;
        this.f8544i = 0.0f;
        this.j = 0.0f;
        this.f8545k = 0.0f;
        this.f8546l = 255;
        this.f8547m = null;
        this.f8548n = null;
        this.f8549o = new C1939i(0);
        this.f8542g = new l();
        this.f8536a = new Path();
        this.f8537b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(l lVar, Matrix matrix, Canvas canvas, int i9, int i10) {
        float f9;
        char c3;
        float f10;
        boolean z9;
        float f11;
        int i11;
        Path.FillType fillType;
        Path.FillType fillType2;
        l lVar2 = lVar;
        char c9 = 1;
        lVar2.f8522a.set(matrix);
        Matrix matrix2 = lVar2.f8522a;
        matrix2.preConcat(lVar2.j);
        canvas.save();
        char c10 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = lVar2.f8523b;
            if (i12 < arrayList.size()) {
                m mVar = (m) arrayList.get(i12);
                if (mVar instanceof l) {
                    a((l) mVar, matrix2, canvas, i9, i10);
                } else if (mVar instanceof n) {
                    n nVar = (n) mVar;
                    float f12 = i9 / this.j;
                    float f13 = i10 / this.f8545k;
                    float min = Math.min(f12, f13);
                    Matrix matrix3 = this.f8538c;
                    matrix3.set(matrix2);
                    matrix3.postScale(f12, f13);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[c10], fArr[c9]);
                    boolean z10 = c9;
                    boolean z11 = c10;
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f14 = (fArr[z11 ? 1 : 0] * fArr[3]) - (fArr[z10 ? 1 : 0] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    if (max > 0.0f) {
                        f9 = Math.abs(f14) / max;
                    } else {
                        f9 = 0.0f;
                    }
                    if (f9 != 0.0f) {
                        nVar.getClass();
                        Path path = this.f8536a;
                        path.reset();
                        H.e[] eVarArr = nVar.f8532a;
                        if (eVarArr != null) {
                            H.e.b(eVarArr, path);
                        }
                        Path path2 = this.f8537b;
                        path2.reset();
                        if (nVar instanceof j) {
                            if (nVar.f8534c == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType2);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            k kVar = (k) nVar;
                            float f15 = kVar.f8517i;
                            if (f15 != 0.0f || kVar.j != 1.0f) {
                                float f16 = kVar.f8518k;
                                float f17 = (f15 + f16) % 1.0f;
                                float f18 = (kVar.j + f16) % 1.0f;
                                if (this.f8541f == null) {
                                    this.f8541f = new PathMeasure();
                                }
                                this.f8541f.setPath(path, z11);
                                float length = this.f8541f.getLength();
                                float f19 = f17 * length;
                                float f20 = f18 * length;
                                path.reset();
                                if (f19 > f20) {
                                    this.f8541f.getSegment(f19, length, path, z10);
                                    f10 = 0.0f;
                                    this.f8541f.getSegment(0.0f, f20, path, z10);
                                } else {
                                    f10 = 0.0f;
                                    this.f8541f.getSegment(f19, f20, path, z10);
                                }
                                path.rLineTo(f10, f10);
                            }
                            path2.addPath(path, matrix3);
                            E e8 = kVar.f8514f;
                            if (((Shader) e8.f47c) != null || e8.f46b != 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                if (this.f8540e == null) {
                                    i11 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f8540e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i11 = 16777215;
                                }
                                Paint paint2 = this.f8540e;
                                Shader shader = (Shader) e8.f47c;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(kVar.f8516h * 255.0f));
                                    f11 = 255.0f;
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i13 = e8.f46b;
                                    float f21 = kVar.f8516h;
                                    PorterDuff.Mode mode = r.j;
                                    f11 = 255.0f;
                                    paint2.setColor((i13 & i11) | (((int) (Color.alpha(i13) * f21)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (kVar.f8534c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            } else {
                                f11 = 255.0f;
                                i11 = 16777215;
                            }
                            E e9 = kVar.f8512d;
                            if (((Shader) e9.f47c) != null || e9.f46b != 0) {
                                if (this.f8539d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f8539d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f8539d;
                                Paint.Join join = kVar.f8520m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = kVar.f8519l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(kVar.f8521n);
                                Shader shader2 = (Shader) e9.f47c;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(kVar.f8515g * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i14 = e9.f46b;
                                    float f22 = kVar.f8515g;
                                    PorterDuff.Mode mode2 = r.j;
                                    paint4.setColor((i14 & i11) | (((int) (Color.alpha(i14) * f22)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(kVar.f8513e * min * f9);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    c3 = 1;
                    i12++;
                    lVar2 = lVar;
                    c9 = c3;
                    c10 = 0;
                }
                c3 = c9;
                i12++;
                lVar2 = lVar;
                c9 = c3;
                c10 = 0;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f8546l;
    }

    public void setAlpha(float f9) {
        setRootAlpha((int) (f9 * 255.0f));
    }

    public void setRootAlpha(int i9) {
        this.f8546l = i9;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [s.e, s.i] */
    public o(o oVar) {
        this.f8538c = new Matrix();
        this.f8543h = 0.0f;
        this.f8544i = 0.0f;
        this.j = 0.0f;
        this.f8545k = 0.0f;
        this.f8546l = 255;
        this.f8547m = null;
        this.f8548n = null;
        ?? c1939i = new C1939i(0);
        this.f8549o = c1939i;
        this.f8542g = new l(oVar.f8542g, c1939i);
        this.f8536a = new Path(oVar.f8536a);
        this.f8537b = new Path(oVar.f8537b);
        this.f8543h = oVar.f8543h;
        this.f8544i = oVar.f8544i;
        this.j = oVar.j;
        this.f8545k = oVar.f8545k;
        this.f8546l = oVar.f8546l;
        this.f8547m = oVar.f8547m;
        String str = oVar.f8547m;
        if (str != null) {
            c1939i.put(str, this);
        }
        this.f8548n = oVar.f8548n;
    }
}
