package d4;

import Y3.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l4.AbstractC1566a;
import l4.y;

/* renamed from: d4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1126e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16867a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16868b;

    public C1126e(ArrayList arrayList, ArrayList arrayList2) {
        this.f16867a = arrayList;
        this.f16868b = arrayList2;
    }

    @Override // Y3.g
    public int J() {
        return this.f16868b.size();
    }

    @Override // Y3.g
    public int a(long j) {
        int i9;
        Long valueOf = Long.valueOf(j);
        int i10 = y.f20553a;
        ArrayList arrayList = this.f16868b;
        int binarySearch = Collections.binarySearch(arrayList, valueOf);
        if (binarySearch < 0) {
            i9 = ~binarySearch;
        } else {
            int size = arrayList.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (((Comparable) arrayList.get(binarySearch)).compareTo(valueOf) == 0);
            i9 = binarySearch;
        }
        if (i9 < arrayList.size()) {
            return i9;
        }
        return -1;
    }

    @Override // Y3.g
    public long m(int i9) {
        boolean z9;
        boolean z10 = false;
        if (i9 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        ArrayList arrayList = this.f16868b;
        if (i9 < arrayList.size()) {
            z10 = true;
        }
        AbstractC1566a.h(z10);
        return ((Long) arrayList.get(i9)).longValue();
    }

    @Override // Y3.g
    public List w(long j) {
        int c3 = y.c(this.f16868b, Long.valueOf(j), false);
        if (c3 == -1) {
            return Collections.EMPTY_LIST;
        }
        return (List) this.f16867a.get(c3);
    }

    public C1126e() {
        this.f16867a = new ArrayList();
        this.f16868b = new ArrayList();
    }
}
