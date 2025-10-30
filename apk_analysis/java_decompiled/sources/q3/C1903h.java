package q3;

import A3.A;
import A3.C0000a;
import A3.C0002c;
import A3.C0003d;
import A3.C0005f;
import A3.G;
import P5.D;
import P5.F;
import P5.S;
import co.notix.R;
import java.util.ArrayList;
import java.util.Collections;
import k4.C1499E;
import l4.x;
import r3.C1925a;
import s3.C1947b;
import t3.C2008a;
import u3.C2072b;
import v3.C2104a;
import x3.C2172d;
import y3.C2213i;
import y3.C2216l;

/* renamed from: q3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1903h {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f22316a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: b, reason: collision with root package name */
    public static final C1499E f22317b = new C1499E(new k8.a(11));

    /* renamed from: c, reason: collision with root package name */
    public static final C1499E f22318c = new C1499E(new k8.a(12));

    /* JADX WARN: Type inference failed for: r6v16, types: [B3.d, java.lang.Object] */
    public static void a(int i9, ArrayList arrayList) {
        switch (i9) {
            case 0:
                arrayList.add(new C0000a());
                return;
            case 1:
                arrayList.add(new C0002c());
                return;
            case 2:
                arrayList.add(new C0003d());
                return;
            case 3:
                arrayList.add(new C1925a());
                return;
            case 4:
                InterfaceC1905j h7 = f22317b.h(0);
                if (h7 != null) {
                    arrayList.add(h7);
                    return;
                } else {
                    arrayList.add(new C2008a());
                    return;
                }
            case 5:
                arrayList.add(new C2072b());
                return;
            case 6:
                arrayList.add(new w3.d(0));
                return;
            case 7:
                arrayList.add(new C2172d());
                return;
            case 8:
                arrayList.add(new C2213i(0, null, null, Collections.EMPTY_LIST, null));
                arrayList.add(new C2216l());
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case R.styleable.GradientColor_android_endX /* 10 */:
                arrayList.add(new A());
                return;
            case R.styleable.GradientColor_android_endY /* 11 */:
                x xVar = new x(0L);
                D d9 = F.f5901b;
                arrayList.add(new G(1, xVar, new C0005f(S.f5926e, 0)));
                return;
            case 12:
                ?? obj = new Object();
                obj.f664c = 0;
                obj.f665d = -1L;
                obj.f667f = -1;
                obj.f668g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new C2104a());
                return;
            case 15:
                InterfaceC1905j h9 = f22318c.h(new Object[0]);
                if (h9 != null) {
                    arrayList.add(h9);
                    return;
                }
                return;
            case 16:
                arrayList.add(new C1947b());
                return;
        }
    }
}
