package y;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends e {

    /* renamed from: m, reason: collision with root package name */
    public int f24715m;

    public f(l lVar) {
        super(lVar);
        if (lVar instanceof i) {
            this.f24708e = 2;
        } else {
            this.f24708e = 3;
        }
    }

    @Override // y.e
    public final void d(int i9) {
        if (!this.j) {
            this.j = true;
            this.f24710g = i9;
            ArrayList arrayList = this.f24713k;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d dVar = (d) obj;
                dVar.a(dVar);
            }
        }
    }
}
