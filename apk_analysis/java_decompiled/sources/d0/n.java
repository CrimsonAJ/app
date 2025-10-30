package d0;

import android.graphics.Bitmap;
import android.media.VolumeProvider;
import android.os.Build;
import android.util.SparseBooleanArray;
import b5.G1;
import e0.C1133a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import y0.C2194b;
import y0.C2195c;
import y0.C2197e;
import y0.C2198f;
import y0.C2199g;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f16655a;

    /* renamed from: b, reason: collision with root package name */
    public int f16656b;

    /* renamed from: c, reason: collision with root package name */
    public int f16657c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16658d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16659e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16660f;

    public n(G1 g12, int i9, int i10, int i11, String str) {
        this.f16660f = g12;
        this.f16655a = i9;
        this.f16656b = i10;
        this.f16657c = i11;
        this.f16658d = str;
    }

    public C2198f a() {
        int max;
        Bitmap createScaledBitmap;
        C2195c[] c2195cArr;
        int i9;
        float f9;
        int i10;
        float f10;
        float f11;
        float f12;
        Bitmap bitmap = (Bitmap) this.f16658d;
        if (bitmap != null) {
            int i11 = this.f16656b;
            double d9 = -1.0d;
            if (i11 > 0) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                if (height > i11) {
                    d9 = Math.sqrt(i11 / height);
                }
            } else {
                int i12 = this.f16657c;
                if (i12 > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i12) {
                    d9 = i12 / max;
                }
            }
            int i13 = 0;
            if (d9 <= 0.0d) {
                createScaledBitmap = bitmap;
            } else {
                createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d9), (int) Math.ceil(bitmap.getHeight() * d9), false);
            }
            int width = createScaledBitmap.getWidth();
            int height2 = createScaledBitmap.getHeight();
            int[] iArr = new int[width * height2];
            createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
            int i14 = this.f16655a;
            ArrayList arrayList = (ArrayList) this.f16660f;
            if (arrayList.isEmpty()) {
                c2195cArr = null;
            } else {
                c2195cArr = (C2195c[]) arrayList.toArray(new C2195c[arrayList.size()]);
            }
            C2194b c2194b = new C2194b(iArr, i14, c2195cArr);
            if (createScaledBitmap != bitmap) {
                createScaledBitmap.recycle();
            }
            ArrayList arrayList2 = c2194b.f24742c;
            ArrayList arrayList3 = (ArrayList) this.f16659e;
            C2198f c2198f = new C2198f(arrayList2, arrayList3);
            int size = arrayList3.size();
            int i15 = 0;
            while (true) {
                SparseBooleanArray sparseBooleanArray = c2198f.f24759c;
                if (i15 < size) {
                    C2199g c2199g = (C2199g) arrayList3.get(i15);
                    float[] fArr = c2199g.f24769c;
                    int length = fArr.length;
                    float f13 = 0.0f;
                    float f14 = 0.0f;
                    for (int i16 = i13; i16 < length; i16++) {
                        float f15 = fArr[i16];
                        if (f15 > 0.0f) {
                            f14 += f15;
                        }
                    }
                    if (f14 != 0.0f) {
                        int length2 = fArr.length;
                        for (int i17 = i13; i17 < length2; i17++) {
                            float f16 = fArr[i17];
                            if (f16 > 0.0f) {
                                fArr[i17] = f16 / f14;
                            }
                        }
                    }
                    ArrayList arrayList4 = c2198f.f24757a;
                    int size2 = arrayList4.size();
                    int i18 = i13;
                    float f17 = 0.0f;
                    C2197e c2197e = null;
                    while (i18 < size2) {
                        int i19 = i13;
                        C2197e c2197e2 = (C2197e) arrayList4.get(i18);
                        float[] b9 = c2197e2.b();
                        float f18 = b9[1];
                        float[] fArr2 = c2199g.f24767a;
                        if (f18 >= fArr2[i19] && f18 <= fArr2[2]) {
                            float f19 = b9[2];
                            f9 = f13;
                            float[] fArr3 = c2199g.f24768b;
                            if (f19 >= fArr3[i19] && f19 <= fArr3[2] && !sparseBooleanArray.get(c2197e2.f24750d)) {
                                float[] b10 = c2197e2.b();
                                C2197e c2197e3 = c2198f.f24760d;
                                if (c2197e3 != null) {
                                    i10 = c2197e3.f24751e;
                                } else {
                                    i10 = 1;
                                }
                                i9 = size;
                                float[] fArr4 = c2199g.f24769c;
                                float f20 = fArr4[i19];
                                if (f20 > f9) {
                                    f10 = (1.0f - Math.abs(b10[1] - fArr2[1])) * f20;
                                } else {
                                    f10 = f9;
                                }
                                float f21 = fArr4[1];
                                if (f21 > f9) {
                                    f11 = (1.0f - Math.abs(b10[2] - fArr3[1])) * f21;
                                } else {
                                    f11 = f9;
                                }
                                float f22 = fArr4[2];
                                if (f22 > f9) {
                                    f12 = (c2197e2.f24751e / i10) * f22;
                                } else {
                                    f12 = f9;
                                }
                                float f23 = f10 + f11 + f12;
                                if (c2197e == null || f23 > f17) {
                                    c2197e = c2197e2;
                                    f17 = f23;
                                }
                            } else {
                                i9 = size;
                            }
                        } else {
                            i9 = size;
                            f9 = f13;
                        }
                        i18++;
                        i13 = i19;
                        f13 = f9;
                        size = i9;
                    }
                    int i20 = size;
                    int i21 = i13;
                    if (c2197e != null) {
                        sparseBooleanArray.append(c2197e.f24750d, true);
                    }
                    c2198f.f24758b.put(c2199g, c2197e);
                    i15++;
                    i13 = i21;
                    size = i20;
                } else {
                    sparseBooleanArray.clear();
                    return c2198f;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    public VolumeProvider b() {
        n nVar;
        if (((VolumeProvider) this.f16659e) == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                nVar = this;
                nVar.f16659e = new p0.e(nVar, this.f16655a, this.f16656b, this.f16657c, (String) this.f16658d);
            } else {
                nVar = this;
                nVar.f16659e = new p0.f(this, nVar.f16655a, nVar.f16656b, nVar.f16657c);
            }
        } else {
            nVar = this;
        }
        return (VolumeProvider) nVar.f16659e;
    }

    public void c() {
        this.f16655a = 1;
        this.f16659e = (r) this.f16658d;
        this.f16657c = 0;
    }

    public boolean d() {
        C1133a b9 = ((r) this.f16659e).f16672b.b();
        int a5 = b9.a(6);
        if ((a5 != 0 && ((ByteBuffer) b9.f1637d).get(a5 + b9.f1634a) != 0) || this.f16656b == 65039) {
            return true;
        }
        return false;
    }

    public n(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.f16659e = arrayList;
        this.f16655a = 16;
        this.f16656b = 12544;
        this.f16657c = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f16660f = arrayList2;
        if (!bitmap.isRecycled()) {
            arrayList2.add(C2198f.f24756e);
            this.f16658d = bitmap;
            arrayList.add(C2199g.f24761d);
            arrayList.add(C2199g.f24762e);
            arrayList.add(C2199g.f24763f);
            arrayList.add(C2199g.f24764g);
            arrayList.add(C2199g.f24765h);
            arrayList.add(C2199g.f24766i);
            return;
        }
        throw new IllegalArgumentException("Bitmap is not valid");
    }

    public n(r rVar) {
        this.f16655a = 1;
        this.f16658d = rVar;
        this.f16659e = rVar;
    }
}
