package k4;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: h, reason: collision with root package name */
    public static final E6.a f20023h = new E6.a(19);

    /* renamed from: i, reason: collision with root package name */
    public static final E6.a f20024i = new E6.a(20);

    /* renamed from: a, reason: collision with root package name */
    public final int f20025a;

    /* renamed from: e, reason: collision with root package name */
    public int f20029e;

    /* renamed from: f, reason: collision with root package name */
    public int f20030f;

    /* renamed from: g, reason: collision with root package name */
    public int f20031g;

    /* renamed from: c, reason: collision with root package name */
    public final T[] f20027c = new T[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20026b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f20028d = -1;

    public U(int i9) {
        this.f20025a = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i9, float f9) {
        T t7;
        int i10 = this.f20028d;
        ArrayList arrayList = this.f20026b;
        if (i10 != 1) {
            Collections.sort(arrayList, f20023h);
            this.f20028d = 1;
        }
        int i11 = this.f20031g;
        T[] tArr = this.f20027c;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f20031g = i12;
            t7 = tArr[i12];
        } else {
            t7 = new Object();
        }
        int i13 = this.f20029e;
        this.f20029e = i13 + 1;
        t7.f20020a = i13;
        t7.f20021b = i9;
        t7.f20022c = f9;
        arrayList.add(t7);
        this.f20030f += i9;
        while (true) {
            int i14 = this.f20030f;
            int i15 = this.f20025a;
            if (i14 > i15) {
                int i16 = i14 - i15;
                T t9 = (T) arrayList.get(0);
                int i17 = t9.f20021b;
                if (i17 <= i16) {
                    this.f20030f -= i17;
                    arrayList.remove(0);
                    int i18 = this.f20031g;
                    if (i18 < 5) {
                        this.f20031g = i18 + 1;
                        tArr[i18] = t9;
                    }
                } else {
                    t9.f20021b = i17 - i16;
                    this.f20030f -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i9 = this.f20028d;
        ArrayList arrayList = this.f20026b;
        if (i9 != 0) {
            Collections.sort(arrayList, f20024i);
            this.f20028d = 0;
        }
        float f9 = 0.5f * this.f20030f;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            T t7 = (T) arrayList.get(i11);
            i10 += t7.f20021b;
            if (i10 >= f9) {
                return t7.f20022c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((T) arrayList.get(arrayList.size() - 1)).f20022c;
    }
}
