package X3;

import j3.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements M3.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8431a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8432b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8433c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8434d;

    /* renamed from: e, reason: collision with root package name */
    public final a f8435e;

    /* renamed from: f, reason: collision with root package name */
    public final b[] f8436f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8437g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8438h;

    public c(int i9, int i10, long j, long j4, int i11, boolean z9, a aVar, b[] bVarArr) {
        this.f8431a = i9;
        this.f8432b = i10;
        this.f8437g = j;
        this.f8438h = j4;
        this.f8433c = i11;
        this.f8434d = z9;
        this.f8435e = aVar;
        this.f8436f = bVarArr;
    }

    @Override // M3.a
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i9 = 0;
        while (i9 < arrayList.size()) {
            M3.b bVar2 = (M3.b) arrayList.get(i9);
            b bVar3 = this.f8436f[bVar2.f4779b];
            if (bVar3 != bVar && bVar != null) {
                arrayList2.add(bVar.a((M[]) arrayList3.toArray(new M[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar3.j[bVar2.f4780c]);
            i9++;
            bVar = bVar3;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((M[]) arrayList3.toArray(new M[0])));
        }
        return new c(this.f8431a, this.f8432b, this.f8437g, this.f8438h, this.f8433c, this.f8434d, this.f8435e, (b[]) arrayList2.toArray(new b[0]));
    }
}
