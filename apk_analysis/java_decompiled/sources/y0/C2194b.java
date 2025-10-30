package y0;

import B.j;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2194b {

    /* renamed from: f, reason: collision with root package name */
    public static final j f24739f = new j(18);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f24740a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f24741b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f24742c;

    /* renamed from: d, reason: collision with root package name */
    public final C2195c[] f24743d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f24744e = new float[3];

    public C2194b(int[] iArr, int i9, C2195c[] c2195cArr) {
        C2193a c2193a;
        int i10;
        int i11;
        int i12 = 1;
        this.f24743d = c2195cArr;
        int[] iArr2 = new int[32768];
        this.f24741b = iArr2;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            int b9 = b(Color.blue(i14), 8, 5) | (b(Color.red(i14), 8, 5) << 10) | (b(Color.green(i14), 8, 5) << 5);
            iArr[i13] = b9;
            iArr2[b9] = iArr2[b9] + 1;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < 32768; i16++) {
            if (iArr2[i16] > 0) {
                int rgb = Color.rgb(b((i16 >> 10) & 31, 5, 8), b((i16 >> 5) & 31, 5, 8), b(i16 & 31, 5, 8));
                ThreadLocal threadLocal = H.a.f2912a;
                int red = Color.red(rgb);
                int green = Color.green(rgb);
                int blue = Color.blue(rgb);
                float[] fArr = this.f24744e;
                H.a.a(red, green, blue, fArr);
                if (c(fArr)) {
                    iArr2[i16] = 0;
                }
            }
            if (iArr2[i16] > 0) {
                i15++;
            }
        }
        int[] iArr3 = new int[i15];
        this.f24740a = iArr3;
        int i17 = 0;
        for (int i18 = 0; i18 < 32768; i18++) {
            if (iArr2[i18] > 0) {
                iArr3[i17] = i18;
                i17++;
            }
        }
        if (i15 <= i9) {
            this.f24742c = new ArrayList();
            for (int i19 = 0; i19 < i15; i19++) {
                int i20 = iArr3[i19];
                this.f24742c.add(new C2197e(Color.rgb(b((i20 >> 10) & 31, 5, 8), b((i20 >> 5) & 31, 5, 8), b(i20 & 31, 5, 8)), iArr2[i20]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i9, f24739f);
        priorityQueue.offer(new C2193a(this, 0, this.f24740a.length - 1));
        while (priorityQueue.size() < i9 && (c2193a = (C2193a) priorityQueue.poll()) != null) {
            int i21 = c2193a.f24731b;
            int i22 = c2193a.f24730a;
            if ((i21 + 1) - i22 <= i12) {
                break;
            }
            if ((i21 + 1) - i22 > i12) {
                int i23 = c2193a.f24734e - c2193a.f24733d;
                int i24 = c2193a.f24736g - c2193a.f24735f;
                int i25 = c2193a.f24738i - c2193a.f24737h;
                if (i23 >= i24 && i23 >= i25) {
                    i10 = -3;
                } else if (i24 >= i23 && i24 >= i25) {
                    i10 = -2;
                } else {
                    i10 = -1;
                }
                C2194b c2194b = c2193a.j;
                int[] iArr4 = c2194b.f24740a;
                a(iArr4, i10, i22, i21);
                Arrays.sort(iArr4, i22, c2193a.f24731b + i12);
                a(iArr4, i10, i22, c2193a.f24731b);
                int i26 = c2193a.f24732c / 2;
                int i27 = 0;
                int i28 = i22;
                while (true) {
                    int i29 = c2193a.f24731b;
                    if (i28 <= i29) {
                        i11 = i12;
                        i27 += c2194b.f24741b[iArr4[i28]];
                        if (i27 >= i26) {
                            i22 = Math.min(i29 - 1, i28);
                            break;
                        } else {
                            i28++;
                            i12 = i11;
                        }
                    } else {
                        i11 = i12;
                        break;
                    }
                }
                C2193a c2193a2 = new C2193a(c2194b, i22 + 1, c2193a.f24731b);
                c2193a.f24731b = i22;
                c2193a.a();
                priorityQueue.offer(c2193a2);
                priorityQueue.offer(c2193a);
                i12 = i11;
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            C2193a c2193a3 = (C2193a) it.next();
            C2194b c2194b2 = c2193a3.j;
            int[] iArr5 = c2194b2.f24740a;
            int i30 = 0;
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            for (int i34 = c2193a3.f24730a; i34 <= c2193a3.f24731b; i34++) {
                int i35 = iArr5[i34];
                int i36 = c2194b2.f24741b[i35];
                i31 += i36;
                i30 = (((i35 >> 10) & 31) * i36) + i30;
                i32 = (((i35 >> 5) & 31) * i36) + i32;
                i33 += i36 * (i35 & 31);
            }
            float f9 = i31;
            C2197e c2197e = new C2197e(Color.rgb(b(Math.round(i30 / f9), 5, 8), b(Math.round(i32 / f9), 5, 8), b(Math.round(i33 / f9), 5, 8)), i31);
            if (!c(c2197e.b())) {
                arrayList.add(c2197e);
            }
        }
        this.f24742c = arrayList;
    }

    public static void a(int[] iArr, int i9, int i10, int i11) {
        if (i9 != -2) {
            if (i9 == -1) {
                while (i10 <= i11) {
                    int i12 = iArr[i10];
                    iArr[i10] = ((i12 >> 10) & 31) | ((i12 & 31) << 10) | (((i12 >> 5) & 31) << 5);
                    i10++;
                }
                return;
            }
            return;
        }
        while (i10 <= i11) {
            int i13 = iArr[i10];
            iArr[i10] = (i13 & 31) | (((i13 >> 5) & 31) << 10) | (((i13 >> 10) & 31) << 5);
            i10++;
        }
    }

    public static int b(int i9, int i10, int i11) {
        int i12;
        if (i11 > i10) {
            i12 = i9 << (i11 - i10);
        } else {
            i12 = i9 >> (i10 - i11);
        }
        return i12 & ((1 << i11) - 1);
    }

    public final boolean c(float[] fArr) {
        C2195c[] c2195cArr = this.f24743d;
        if (c2195cArr != null && c2195cArr.length > 0) {
            for (C2195c c2195c : c2195cArr) {
                c2195c.getClass();
                float f9 = fArr[2];
                if (f9 < 0.95f && f9 > 0.05f) {
                    float f10 = fArr[0];
                    if (f10 < 10.0f || f10 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
