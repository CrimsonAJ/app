package A5;

import B6.u0;
import X0.C0429d;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import co.notix.R;
import java.util.ArrayList;
import k0.C1478a;
import p.AbstractC1759N0;
import u0.z;

/* loaded from: classes.dex */
public final class h extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f414a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Class cls, String str, int i9) {
        super(cls, str);
        this.f414a = i9;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f414a) {
            case 0:
                return Float.valueOf(((i) obj).f425h);
            case 1:
                return Float.valueOf(((i) obj).f426i);
            case 2:
                return Float.valueOf(((n) obj).b());
            case 3:
                return Float.valueOf(((u) obj).f470h);
            case 4:
                return Float.valueOf(((w) obj).f482i);
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                return null;
            case R.styleable.GradientColor_android_endX /* 10 */:
                return Float.valueOf(X0.w.f8229a.z((View) obj));
            case R.styleable.GradientColor_android_endY /* 11 */:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((AbstractC1759N0) obj).f21894z);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f414a) {
            case 0:
                i iVar = (i) obj;
                float floatValue = ((Float) obj2).floatValue();
                iVar.f425h = floatValue;
                int i9 = (int) (floatValue * 5400.0f);
                ArrayList arrayList = (ArrayList) iVar.f453b;
                o oVar = (o) arrayList.get(0);
                float f9 = iVar.f425h * 1520.0f;
                oVar.f447a = (-20.0f) + f9;
                oVar.f448b = f9;
                int i10 = 0;
                while (true) {
                    C1478a c1478a = iVar.f422e;
                    if (i10 < 4) {
                        oVar.f448b = (c1478a.getInterpolation(q.j(i9, i.f415k[i10], 667)) * 250.0f) + oVar.f448b;
                        oVar.f447a = (c1478a.getInterpolation(q.j(i9, i.f416l[i10], 667)) * 250.0f) + oVar.f447a;
                        i10++;
                    } else {
                        float f10 = oVar.f447a;
                        float f11 = oVar.f448b;
                        oVar.f447a = (((f11 - f10) * iVar.f426i) + f10) / 360.0f;
                        oVar.f448b = f11 / 360.0f;
                        int i11 = 0;
                        while (true) {
                            if (i11 < 4) {
                                float j = q.j(i9, i.f417m[i11], 333);
                                if (j >= 0.0f && j <= 1.0f) {
                                    int i12 = i11 + iVar.f424g;
                                    int[] iArr = iVar.f423f.f402c;
                                    int length = i12 % iArr.length;
                                    int length2 = (length + 1) % iArr.length;
                                    int i13 = iArr[length];
                                    int i14 = iArr[length2];
                                    float interpolation = c1478a.getInterpolation(j);
                                    o oVar2 = (o) arrayList.get(0);
                                    Integer valueOf = Integer.valueOf(i13);
                                    Integer valueOf2 = Integer.valueOf(i14);
                                    int intValue = valueOf.intValue();
                                    float f12 = ((intValue >> 24) & 255) / 255.0f;
                                    int intValue2 = valueOf2.intValue();
                                    float f13 = ((intValue2 >> 24) & 255) / 255.0f;
                                    float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
                                    float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
                                    float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
                                    float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
                                    float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
                                    float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
                                    float b9 = z.b(f13, f12, interpolation, f12);
                                    float b10 = z.b(pow4, pow, interpolation, pow);
                                    float b11 = z.b(pow5, pow2, interpolation, pow2);
                                    float b12 = z.b(pow6, pow3, interpolation, pow3);
                                    float pow7 = ((float) Math.pow(b10, 0.45454545454545453d)) * 255.0f;
                                    float pow8 = ((float) Math.pow(b11, 0.45454545454545453d)) * 255.0f;
                                    oVar2.f449c = Integer.valueOf(Math.round(((float) Math.pow(b12, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(b9 * 255.0f) << 24) | (Math.round(pow8) << 8)).intValue();
                                } else {
                                    i11++;
                                }
                            }
                        }
                        ((r) iVar.f452a).invalidateSelf();
                        return;
                    }
                }
                break;
            case 1:
                ((i) obj).f426i = ((Float) obj2).floatValue();
                return;
            case 2:
                n nVar = (n) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                if (nVar.f445h != floatValue2) {
                    nVar.f445h = floatValue2;
                    nVar.invalidateSelf();
                    return;
                }
                return;
            case 3:
                u uVar = (u) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                uVar.f470h = floatValue3;
                ArrayList arrayList2 = (ArrayList) uVar.f453b;
                ((o) arrayList2.get(0)).f447a = 0.0f;
                float j4 = q.j((int) (floatValue3 * 333.0f), 0, 667);
                o oVar3 = (o) arrayList2.get(0);
                o oVar4 = (o) arrayList2.get(1);
                C1478a c1478a2 = uVar.f466d;
                float interpolation2 = c1478a2.getInterpolation(j4);
                oVar4.f447a = interpolation2;
                oVar3.f448b = interpolation2;
                o oVar5 = (o) arrayList2.get(1);
                o oVar6 = (o) arrayList2.get(2);
                float interpolation3 = c1478a2.getInterpolation(j4 + 0.49925038f);
                oVar6.f447a = interpolation3;
                oVar5.f448b = interpolation3;
                ((o) arrayList2.get(2)).f448b = 1.0f;
                if (uVar.f469g && ((o) arrayList2.get(1)).f448b < 1.0f) {
                    ((o) arrayList2.get(2)).f449c = ((o) arrayList2.get(1)).f449c;
                    ((o) arrayList2.get(1)).f449c = ((o) arrayList2.get(0)).f449c;
                    ((o) arrayList2.get(0)).f449c = uVar.f467e.f402c[uVar.f468f];
                    uVar.f469g = false;
                }
                ((r) uVar.f452a).invalidateSelf();
                return;
            case 4:
                w wVar = (w) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                wVar.f482i = floatValue4;
                int i15 = (int) (floatValue4 * 1800.0f);
                int i16 = 0;
                while (true) {
                    ArrayList arrayList3 = (ArrayList) wVar.f453b;
                    if (i16 < arrayList3.size()) {
                        o oVar7 = (o) arrayList3.get(i16);
                        int[] iArr2 = w.f474l;
                        int i17 = i16 * 2;
                        int i18 = iArr2[i17];
                        int[] iArr3 = w.f473k;
                        float j9 = q.j(i15, i18, iArr3[i17]);
                        Interpolator[] interpolatorArr = wVar.f478e;
                        oVar7.f447a = u0.j(interpolatorArr[i17].getInterpolation(j9), 0.0f, 1.0f);
                        int i19 = i17 + 1;
                        oVar7.f448b = u0.j(interpolatorArr[i19].getInterpolation(q.j(i15, iArr2[i19], iArr3[i19])), 0.0f, 1.0f);
                        i16++;
                    } else {
                        if (wVar.f481h) {
                            int size = arrayList3.size();
                            int i20 = 0;
                            while (i20 < size) {
                                Object obj3 = arrayList3.get(i20);
                                i20++;
                                ((o) obj3).f449c = wVar.f479f.f402c[wVar.f480g];
                            }
                            wVar.f481h = false;
                        }
                        ((r) wVar.f452a).invalidateSelf();
                        return;
                    }
                }
            case 5:
                C0429d c0429d = (C0429d) obj;
                PointF pointF = (PointF) obj2;
                c0429d.getClass();
                c0429d.f8164a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0429d.f8165b = round;
                int i21 = c0429d.f8169f + 1;
                c0429d.f8169f = i21;
                if (i21 == c0429d.f8170g) {
                    X0.w.a(c0429d.f8168e, c0429d.f8164a, round, c0429d.f8166c, c0429d.f8167d);
                    c0429d.f8169f = 0;
                    c0429d.f8170g = 0;
                    return;
                }
                return;
            case 6:
                C0429d c0429d2 = (C0429d) obj;
                PointF pointF2 = (PointF) obj2;
                c0429d2.getClass();
                c0429d2.f8166c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0429d2.f8167d = round2;
                int i22 = c0429d2.f8170g + 1;
                c0429d2.f8170g = i22;
                if (c0429d2.f8169f == i22) {
                    X0.w.a(c0429d2.f8168e, c0429d2.f8164a, c0429d2.f8165b, c0429d2.f8166c, round2);
                    c0429d2.f8169f = 0;
                    c0429d2.f8170g = 0;
                    return;
                }
                return;
            case 7:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                X0.w.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 8:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                X0.w.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 9:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                X0.w.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case R.styleable.GradientColor_android_endX /* 10 */:
                X0.w.f8229a.I((View) obj, ((Float) obj2).floatValue());
                return;
            case R.styleable.GradientColor_android_endY /* 11 */:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
            default:
                ((AbstractC1759N0) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
        }
    }
}
