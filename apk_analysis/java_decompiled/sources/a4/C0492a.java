package a4;

import A4.r;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import l4.AbstractC1566a;
import l4.y;
import o1.C1671f;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492a extends Y3.f {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f9111m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f9112n;

    public C0492a(List list) {
        this.f9111m = 0;
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        this.f9112n = new C0500i(((bArr[0] & 255) << 8) | (bArr[1] & 255), (bArr[3] & 255) | ((bArr[2] & 255) << 8));
    }

    @Override // Y3.f
    public final Y3.g f(int i9, boolean z9, byte[] bArr) {
        C0499h c0499h;
        List unmodifiableList;
        Canvas canvas;
        char c3;
        int i10;
        Paint paint;
        int[] iArr;
        int i11;
        C0497f c0497f;
        int i12;
        int i13;
        int i14;
        int i15;
        Y3.b a5;
        Object obj = this.f9112n;
        int i16 = 1;
        int i17 = 8;
        switch (this.f9111m) {
            case 0:
                C0500i c0500i = (C0500i) obj;
                if (z9) {
                    C0499h c0499h2 = c0500i.f9156f;
                    c0499h2.f9142c.clear();
                    c0499h2.f9143d.clear();
                    c0499h2.f9144e.clear();
                    c0499h2.f9145f.clear();
                    c0499h2.f9146g.clear();
                    c0499h2.f9147h = null;
                    c0499h2.f9148i = null;
                }
                c0500i.getClass();
                Z3.f fVar = new Z3.f(i9, bArr);
                while (true) {
                    int b9 = fVar.b();
                    c0499h = c0500i.f9156f;
                    if (b9 >= 48 && fVar.i(i17) == 15) {
                        int i18 = fVar.i(i17);
                        int i19 = 16;
                        int i20 = fVar.i(16);
                        int i21 = fVar.i(16);
                        int f9 = fVar.f() + i21;
                        if (i21 * 8 > fVar.b()) {
                            AbstractC1566a.P("DvbParser", "Data field length exceeds limit");
                            fVar.r(fVar.b());
                            i11 = i16;
                        } else {
                            switch (i18) {
                                case 16:
                                    if (i20 == c0499h.f9140a) {
                                        r rVar = c0499h.f9148i;
                                        int i22 = 8;
                                        fVar.i(8);
                                        int i23 = fVar.i(4);
                                        int i24 = fVar.i(2);
                                        fVar.r(2);
                                        int i25 = i21 - 2;
                                        SparseArray sparseArray = new SparseArray();
                                        while (i25 > 0) {
                                            int i26 = fVar.i(i22);
                                            fVar.r(i22);
                                            i25 -= 6;
                                            sparseArray.put(i26, new C0496e(fVar.i(16), fVar.i(16)));
                                            i16 = i16;
                                            i22 = 8;
                                        }
                                        i11 = i16;
                                        r rVar2 = new r(i23, i24, sparseArray);
                                        if (i24 != 0) {
                                            c0499h.f9148i = rVar2;
                                            c0499h.f9142c.clear();
                                            c0499h.f9143d.clear();
                                            c0499h.f9144e.clear();
                                            break;
                                        } else if (rVar != null && rVar.f382a != i23) {
                                            c0499h.f9148i = rVar2;
                                            break;
                                        }
                                    }
                                    break;
                                case 17:
                                    r rVar3 = c0499h.f9148i;
                                    if (i20 == c0499h.f9140a && rVar3 != null) {
                                        int i27 = fVar.i(i17);
                                        fVar.r(4);
                                        boolean h7 = fVar.h();
                                        fVar.r(3);
                                        int i28 = fVar.i(16);
                                        int i29 = fVar.i(16);
                                        fVar.i(3);
                                        int i30 = fVar.i(3);
                                        fVar.r(2);
                                        int i31 = fVar.i(i17);
                                        int i32 = fVar.i(i17);
                                        int i33 = fVar.i(4);
                                        int i34 = fVar.i(2);
                                        fVar.r(2);
                                        int i35 = i21 - 10;
                                        SparseArray sparseArray2 = new SparseArray();
                                        while (i35 > 0) {
                                            int i36 = fVar.i(i19);
                                            int i37 = fVar.i(2);
                                            fVar.i(2);
                                            int i38 = fVar.i(12);
                                            fVar.r(4);
                                            int i39 = fVar.i(12);
                                            int i40 = i35 - 6;
                                            if (i37 != i16 && i37 != 2) {
                                                i35 = i40;
                                            } else {
                                                fVar.i(8);
                                                fVar.i(8);
                                                i35 -= 8;
                                            }
                                            sparseArray2.put(i36, new C0498g(i38, i39));
                                            i19 = 16;
                                        }
                                        C0497f c0497f2 = new C0497f(i27, h7, i28, i29, i30, i31, i32, i33, i34, sparseArray2);
                                        SparseArray sparseArray3 = c0499h.f9142c;
                                        if (rVar3.f383b == 0 && (c0497f = (C0497f) sparseArray3.get(i27)) != null) {
                                            int i41 = 0;
                                            while (true) {
                                                SparseArray sparseArray4 = c0497f.j;
                                                if (i41 < sparseArray4.size()) {
                                                    c0497f2.j.put(sparseArray4.keyAt(i41), (C0498g) sparseArray4.valueAt(i41));
                                                    i41 += i16;
                                                }
                                            }
                                        }
                                        sparseArray3.put(c0497f2.f9129a, c0497f2);
                                        break;
                                    }
                                    break;
                                case 18:
                                    if (i20 == c0499h.f9140a) {
                                        C0493b f10 = C0500i.f(fVar, i21);
                                        c0499h.f9143d.put(f10.f9113a, f10);
                                        break;
                                    } else if (i20 == c0499h.f9141b) {
                                        C0493b f11 = C0500i.f(fVar, i21);
                                        c0499h.f9145f.put(f11.f9113a, f11);
                                        break;
                                    }
                                    break;
                                case 19:
                                    if (i20 == c0499h.f9140a) {
                                        C0495d g9 = C0500i.g(fVar);
                                        c0499h.f9144e.put(g9.f9123a, g9);
                                        break;
                                    } else if (i20 == c0499h.f9141b) {
                                        C0495d g10 = C0500i.g(fVar);
                                        c0499h.f9146g.put(g10.f9123a, g10);
                                        break;
                                    }
                                    break;
                                case 20:
                                    if (i20 == c0499h.f9140a) {
                                        fVar.r(4);
                                        boolean h9 = fVar.h();
                                        fVar.r(3);
                                        int i42 = fVar.i(16);
                                        int i43 = fVar.i(16);
                                        if (h9) {
                                            int i44 = fVar.i(16);
                                            int i45 = fVar.i(16);
                                            int i46 = fVar.i(16);
                                            i12 = i45;
                                            i13 = fVar.i(16);
                                            i15 = i46;
                                            i14 = i44;
                                        } else {
                                            i12 = i42;
                                            i13 = i43;
                                            i14 = 0;
                                            i15 = 0;
                                        }
                                        c0499h.f9147h = new C0494c(i42, i43, i14, i12, i15, i13);
                                        break;
                                    }
                                    break;
                            }
                            i11 = i16;
                            fVar.s(f9 - fVar.f());
                        }
                        i16 = i11;
                        i17 = 8;
                    }
                }
                r rVar4 = c0499h.f9148i;
                if (rVar4 == null) {
                    unmodifiableList = Collections.EMPTY_LIST;
                } else {
                    C0494c c0494c = c0499h.f9147h;
                    if (c0494c == null) {
                        c0494c = c0500i.f9154d;
                    }
                    Bitmap bitmap = c0500i.f9157g;
                    Canvas canvas2 = c0500i.f9153c;
                    if (bitmap == null || c0494c.f9117a + 1 != bitmap.getWidth() || c0494c.f9118b + 1 != c0500i.f9157g.getHeight()) {
                        Bitmap createBitmap = Bitmap.createBitmap(c0494c.f9117a + 1, c0494c.f9118b + 1, Bitmap.Config.ARGB_8888);
                        c0500i.f9157g = createBitmap;
                        canvas2.setBitmap(createBitmap);
                    }
                    ArrayList arrayList = new ArrayList();
                    int i47 = 0;
                    while (true) {
                        SparseArray sparseArray5 = (SparseArray) rVar4.f384c;
                        if (i47 < sparseArray5.size()) {
                            canvas2.save();
                            C0496e c0496e = (C0496e) sparseArray5.valueAt(i47);
                            C0497f c0497f3 = (C0497f) c0499h.f9142c.get(sparseArray5.keyAt(i47));
                            int i48 = c0496e.f9127a + c0494c.f9119c;
                            int i49 = c0496e.f9128b + c0494c.f9121e;
                            int min = Math.min(c0497f3.f9131c + i48, c0494c.f9120d);
                            int i50 = c0497f3.f9132d;
                            int i51 = i49 + i50;
                            canvas2.clipRect(i48, i49, min, Math.min(i51, c0494c.f9122f));
                            SparseArray sparseArray6 = c0499h.f9143d;
                            int i52 = c0497f3.f9134f;
                            C0493b c0493b = (C0493b) sparseArray6.get(i52);
                            if (c0493b == null && (c0493b = (C0493b) c0499h.f9145f.get(i52)) == null) {
                                c0493b = c0500i.f9155e;
                            }
                            int i53 = 0;
                            while (true) {
                                SparseArray sparseArray7 = c0497f3.j;
                                r rVar5 = rVar4;
                                if (i53 < sparseArray7.size()) {
                                    int keyAt = sparseArray7.keyAt(i53);
                                    C0498g c0498g = (C0498g) sparseArray7.valueAt(i53);
                                    Canvas canvas3 = canvas2;
                                    C0495d c0495d = (C0495d) c0499h.f9144e.get(keyAt);
                                    if (c0495d == null) {
                                        c0495d = (C0495d) c0499h.f9146g.get(keyAt);
                                    }
                                    if (c0495d != null) {
                                        if (c0495d.f9124b) {
                                            paint = null;
                                        } else {
                                            paint = c0500i.f9151a;
                                        }
                                        int i54 = i48 + c0498g.f9138a;
                                        int i55 = i49 + c0498g.f9139b;
                                        int i56 = c0497f3.f9133e;
                                        if (i56 == 3) {
                                            iArr = c0493b.f9116d;
                                        } else if (i56 == 2) {
                                            iArr = c0493b.f9115c;
                                        } else {
                                            iArr = c0493b.f9114b;
                                        }
                                        int[] iArr2 = iArr;
                                        C0500i.e(c0495d.f9125c, iArr2, i56, i54, i55, paint, canvas3);
                                        C0500i.e(c0495d.f9126d, iArr2, i56, i54, i55 + 1, paint, canvas3);
                                    }
                                    i53++;
                                    canvas2 = canvas3;
                                    rVar4 = rVar5;
                                } else {
                                    Canvas canvas4 = canvas2;
                                    boolean z10 = c0497f3.f9130b;
                                    int i57 = c0497f3.f9131c;
                                    if (z10) {
                                        int i58 = c0497f3.f9133e;
                                        if (i58 == 3) {
                                            i10 = c0493b.f9116d[c0497f3.f9135g];
                                            c3 = 2;
                                        } else {
                                            c3 = 2;
                                            if (i58 == 2) {
                                                i10 = c0493b.f9115c[c0497f3.f9136h];
                                            } else {
                                                i10 = c0493b.f9114b[c0497f3.f9137i];
                                            }
                                        }
                                        Paint paint2 = c0500i.f9152b;
                                        paint2.setColor(i10);
                                        canvas4.drawRect(i48, i49, i48 + i57, i51, paint2);
                                        canvas = canvas4;
                                    } else {
                                        canvas = canvas4;
                                        c3 = 2;
                                    }
                                    Bitmap createBitmap2 = Bitmap.createBitmap(c0500i.f9157g, i48, i49, i57, i50);
                                    float f12 = c0494c.f9117a;
                                    float f13 = c0494c.f9118b;
                                    arrayList.add(new Y3.b(null, null, null, createBitmap2, i49 / f13, 0, 0, i48 / f12, 0, Integer.MIN_VALUE, -3.4028235E38f, i57 / f12, i50 / f13, false, -16777216, Integer.MIN_VALUE, 0.0f));
                                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                                    canvas.restore();
                                    i47++;
                                    canvas2 = canvas;
                                    rVar4 = rVar5;
                                }
                            }
                        } else {
                            unmodifiableList = Collections.unmodifiableList(arrayList);
                        }
                    }
                }
                return new C1671f(23, unmodifiableList);
            default:
                r rVar6 = (r) obj;
                rVar6.F(i9, bArr);
                ArrayList arrayList2 = new ArrayList();
                while (rVar6.e() > 0) {
                    if (rVar6.e() >= 8) {
                        int i59 = rVar6.i();
                        if (rVar6.i() == 1987343459) {
                            int i60 = i59 - 8;
                            CharSequence charSequence = null;
                            Y3.a aVar = null;
                            while (i60 > 0) {
                                if (i60 >= 8) {
                                    int i61 = rVar6.i();
                                    int i62 = rVar6.i();
                                    int i63 = i61 - 8;
                                    byte[] bArr2 = (byte[]) rVar6.f384c;
                                    int i64 = rVar6.f382a;
                                    int i65 = y.f20553a;
                                    String str = new String(bArr2, i64, i63, O5.e.f5491c);
                                    rVar6.I(i63);
                                    i60 = (i60 - 8) - i63;
                                    if (i62 == 1937011815) {
                                        h4.g gVar = new h4.g();
                                        h4.h.f(str, gVar);
                                        aVar = gVar.a();
                                    } else if (i62 == 1885436268) {
                                        charSequence = h4.h.g(null, str.trim(), Collections.EMPTY_LIST);
                                    }
                                } else {
                                    throw new Exception("Incomplete vtt cue box header found.");
                                }
                            }
                            if (charSequence == null) {
                                charSequence = "";
                            }
                            if (aVar != null) {
                                aVar.f8661a = charSequence;
                                a5 = aVar.a();
                            } else {
                                Pattern pattern = h4.h.f17920a;
                                h4.g gVar2 = new h4.g();
                                gVar2.f17912c = charSequence;
                                a5 = gVar2.a().a();
                            }
                            arrayList2.add(a5);
                        } else {
                            rVar6.I(i59 - 8);
                        }
                    } else {
                        throw new Exception("Incomplete Mp4Webvtt Top Level box header found.");
                    }
                }
                return new s4.i(arrayList2);
        }
    }

    public C0492a() {
        this.f9111m = 1;
        this.f9112n = new r(5, false);
    }
}
