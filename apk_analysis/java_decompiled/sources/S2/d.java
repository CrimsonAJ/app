package S2;

import Q2.O;
import Y3.g;
import h4.C1279c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6746a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6747b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f6748c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f6749d;

    public d(int i9, ArrayList arrayList) {
        this.f6746a = i9;
        switch (i9) {
            case 1:
                this.f6747b = Collections.unmodifiableList(new ArrayList(arrayList));
                this.f6748c = new long[arrayList.size() * 2];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    C1279c c1279c = (C1279c) arrayList.get(i10);
                    int i11 = i10 * 2;
                    long[] jArr = this.f6748c;
                    jArr[i11] = c1279c.f17899b;
                    jArr[i11 + 1] = c1279c.f17900c;
                }
                long[] jArr2 = this.f6748c;
                long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
                this.f6749d = copyOf;
                Arrays.sort(copyOf);
                return;
            default:
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    Objects.requireNonNull(obj);
                    arrayList2.add(obj);
                }
                this.f6747b = Collections.unmodifiableList(arrayList2);
                this.f6748c = new long[arrayList.size() * 2];
                long j = O.f6195a.get();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    C1279c c1279c2 = (C1279c) arrayList.get(i13);
                    int i14 = i13 * 2;
                    long[] jArr3 = this.f6748c;
                    jArr3[i14] = c1279c2.f17899b + j;
                    jArr3[i14 + 1] = c1279c2.f17900c + j;
                }
                long[] jArr4 = this.f6748c;
                long[] copyOf2 = Arrays.copyOf(jArr4, jArr4.length);
                this.f6749d = copyOf2;
                Arrays.sort(copyOf2);
                return;
        }
    }

    @Override // Y3.g
    public final int J() {
        switch (this.f6746a) {
            case 0:
                return this.f6749d.length;
            default:
                return this.f6749d.length;
        }
    }

    @Override // Y3.g
    public final int a(long j) {
        switch (this.f6746a) {
            case 0:
                long[] jArr = this.f6749d;
                int b9 = y.b(jArr, j, false);
                if (b9 >= jArr.length) {
                    return -1;
                }
                return b9;
            default:
                long[] jArr2 = this.f6749d;
                int b10 = y.b(jArr2, j, false);
                if (b10 >= jArr2.length) {
                    return -1;
                }
                return b10;
        }
    }

    @Override // Y3.g
    public final long m(int i9) {
        boolean z9;
        boolean z10;
        switch (this.f6746a) {
            case 0:
                boolean z11 = false;
                if (i9 >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.h(z9);
                long[] jArr = this.f6749d;
                if (i9 < jArr.length) {
                    z11 = true;
                }
                AbstractC1566a.h(z11);
                return jArr[i9];
            default:
                boolean z12 = false;
                if (i9 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AbstractC1566a.h(z10);
                long[] jArr2 = this.f6749d;
                if (i9 < jArr2.length) {
                    z12 = true;
                }
                AbstractC1566a.h(z12);
                return jArr2[i9];
        }
    }

    @Override // Y3.g
    public final List w(long j) {
        switch (this.f6746a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i9 = 0;
                while (true) {
                    List list = this.f6747b;
                    if (i9 < list.size()) {
                        int i10 = i9 * 2;
                        long[] jArr = this.f6748c;
                        if (jArr[i10] <= j && j < jArr[i10 + 1]) {
                            C1279c c1279c = (C1279c) list.get(i9);
                            Y3.b bVar = c1279c.f17898a;
                            if (bVar.f8683e == -3.4028235E38f) {
                                arrayList2.add(c1279c);
                            } else {
                                arrayList.add(bVar);
                            }
                        }
                        i9++;
                    } else {
                        Collections.sort(arrayList2, new E6.a(6));
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            Y3.a a5 = ((C1279c) arrayList2.get(i11)).f17898a.a();
                            a5.f8665e = (-1) - i11;
                            a5.f8666f = 1;
                            arrayList.add(a5.a());
                        }
                        return arrayList;
                    }
                }
                break;
            default:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i12 = 0;
                while (true) {
                    List list2 = this.f6747b;
                    if (i12 < list2.size()) {
                        int i13 = i12 * 2;
                        long[] jArr2 = this.f6748c;
                        if (jArr2[i13] <= j && j < jArr2[i13 + 1]) {
                            C1279c c1279c2 = (C1279c) list2.get(i12);
                            Y3.b bVar2 = c1279c2.f17898a;
                            if (bVar2.f8683e == -3.4028235E38f) {
                                arrayList4.add(c1279c2);
                            } else {
                                arrayList3.add(bVar2);
                            }
                        }
                        i12++;
                    } else {
                        Collections.sort(arrayList4, new E6.a(10));
                        for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                            Y3.a a9 = ((C1279c) arrayList4.get(i14)).f17898a.a();
                            a9.f8665e = (-1) - i14;
                            a9.f8666f = 1;
                            arrayList3.add(a9.a());
                        }
                        return arrayList3;
                    }
                }
                break;
        }
    }
}
