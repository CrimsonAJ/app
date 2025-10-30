package E6;

import B6.F;
import B6.r0;
import P5.AbstractC0356y;
import P5.C0354w;
import P5.Q;
import Q2.C0367j;
import U3.j;
import U3.k;
import co.notix.R;
import h4.C1279c;
import h4.C1280d;
import i4.n;
import i4.o;
import j3.M;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k4.T;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1955a;

    public /* synthetic */ a(int i9) {
        this.f1955a = i9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Q a5;
        Q q9;
        int i9 = 17;
        int i10 = 18;
        switch (this.f1955a) {
            case 0:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 1:
                String name = ((File) obj).getName();
                int i11 = c.f1958f;
                return name.substring(0, i11).compareTo(((File) obj2).getName().substring(0, i11));
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i12 = 0; i12 < bArr.length; i12++) {
                    byte b9 = bArr[i12];
                    byte b10 = bArr2[i12];
                    if (b9 != b10) {
                        return b9 - b10;
                    }
                }
                return 0;
            case 3:
                C0367j c0367j = (C0367j) obj;
                C0367j c0367j2 = (C0367j) obj2;
                int compare = Integer.compare(c0367j2.f6277b, c0367j.f6277b);
                if (compare == 0) {
                    int compareTo = c0367j.f6278c.compareTo(c0367j2.f6278c);
                    if (compareTo == 0) {
                        return c0367j.f6279d.compareTo(c0367j2.f6279d);
                    }
                    return compareTo;
                }
                return compare;
            case 4:
                C0367j c0367j3 = (C0367j) obj;
                C0367j c0367j4 = (C0367j) obj2;
                int compare2 = Integer.compare(c0367j4.f6276a, c0367j3.f6276a);
                if (compare2 == 0) {
                    int compareTo2 = c0367j4.f6278c.compareTo(c0367j3.f6278c);
                    if (compareTo2 == 0) {
                        return c0367j4.f6279d.compareTo(c0367j3.f6279d);
                    }
                    return compareTo2;
                }
                return compare2;
            case 5:
                R3.b bVar = (R3.b) obj;
                R3.b bVar2 = (R3.b) obj2;
                int compare3 = Integer.compare(bVar.f6583c, bVar2.f6583c);
                if (compare3 == 0) {
                    return bVar.f6582b.compareTo(bVar2.f6582b);
                }
                return compare3;
            case 6:
                return Long.compare(((C1279c) obj).f17899b, ((C1279c) obj2).f17899b);
            case 7:
                return k.b(((j) obj).f7392a.f7388c, ((j) obj2).f7392a.f7388c);
            case 8:
                return Integer.compare(((Z3.d) obj2).f9003b, ((Z3.d) obj).f9003b);
            case 9:
                return Integer.compare(((C1280d) obj).f17902a.f17905b, ((C1280d) obj2).f17902a.f17905b);
            case R.styleable.GradientColor_android_endX /* 10 */:
                return Long.compare(((C1279c) obj).f17899b, ((C1279c) obj2).f17899b);
            case R.styleable.GradientColor_android_endY /* 11 */:
                return ((M) obj2).f19432h - ((M) obj).f19432h;
            case 12:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() == -1) {
                        return 0;
                    }
                    return -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 13:
                Q q10 = o.j;
                return 0;
            case 14:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C0354w.f(n.c((n) Collections.max(list, new a(i9)), (n) Collections.max(list2, new a(i9)))).a(list.size(), list2.size()).b((n) Collections.max(list, new a(i10)), (n) Collections.max(list2, new a(i10)), new a(i10)).e();
            case 15:
                return ((i4.e) Collections.max((List) obj)).compareTo((i4.e) Collections.max((List) obj2));
            case 16:
                return ((i4.k) ((List) obj).get(0)).compareTo((i4.k) ((List) obj2).get(0));
            case 17:
                return n.c((n) obj, (n) obj2);
            case 18:
                n nVar = (n) obj;
                n nVar2 = (n) obj2;
                if (nVar.f18572e && nVar.f18575h) {
                    a5 = o.j;
                } else {
                    a5 = o.j.a();
                }
                C0354w c0354w = AbstractC0356y.f6012a;
                int i13 = nVar.f18576i;
                Integer valueOf = Integer.valueOf(i13);
                Integer valueOf2 = Integer.valueOf(nVar2.f18576i);
                if (nVar.f18573f.f18646w) {
                    q9 = o.j.a();
                } else {
                    q9 = o.f18585k;
                }
                return c0354w.b(valueOf, valueOf2, q9).b(Integer.valueOf(nVar.j), Integer.valueOf(nVar2.j), a5).b(Integer.valueOf(i13), Integer.valueOf(nVar2.f18576i), a5).e();
            case 19:
                return ((T) obj).f20020a - ((T) obj2).f20020a;
            case 20:
                return Float.compare(((T) obj).f20022c, ((T) obj2).f20022c);
            case 21:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            default:
                return ((F) ((r0) obj)).f781a.compareTo(((F) ((r0) obj2)).f781a);
        }
    }
}
