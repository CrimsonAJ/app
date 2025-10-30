package y;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public l f24717a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f24718b;

    public static long a(e eVar, long j) {
        l lVar = eVar.f24707d;
        if (lVar instanceof h) {
            return j;
        }
        ArrayList arrayList = eVar.f24713k;
        int size = arrayList.size();
        long j4 = j;
        for (int i9 = 0; i9 < size; i9++) {
            d dVar = (d) arrayList.get(i9);
            if (dVar instanceof e) {
                e eVar2 = (e) dVar;
                if (eVar2.f24707d != lVar) {
                    j4 = Math.min(j4, a(eVar2, eVar2.f24709f + j));
                }
            }
        }
        if (eVar == lVar.f24729i) {
            long j9 = lVar.j();
            long j10 = j - j9;
            return Math.min(Math.min(j4, a(lVar.f24728h, j10)), j10 - r9.f24709f);
        }
        return j4;
    }

    public static long b(e eVar, long j) {
        l lVar = eVar.f24707d;
        if (lVar instanceof h) {
            return j;
        }
        ArrayList arrayList = eVar.f24713k;
        int size = arrayList.size();
        long j4 = j;
        for (int i9 = 0; i9 < size; i9++) {
            d dVar = (d) arrayList.get(i9);
            if (dVar instanceof e) {
                e eVar2 = (e) dVar;
                if (eVar2.f24707d != lVar) {
                    j4 = Math.max(j4, b(eVar2, eVar2.f24709f + j));
                }
            }
        }
        if (eVar == lVar.f24728h) {
            long j9 = lVar.j();
            long j10 = j + j9;
            return Math.max(Math.max(j4, b(lVar.f24729i, j10)), j10 - r9.f24709f);
        }
        return j4;
    }
}
