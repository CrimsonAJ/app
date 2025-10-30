package y4;

import android.util.Log;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f24939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f24940c;

    public /* synthetic */ l(n nVar, o oVar, int i9) {
        this.f24938a = i9;
        this.f24939b = oVar;
        this.f24940c = nVar;
    }

    @Override // y4.o
    public final void h(String str, long j, int i9, d0.w wVar, long j4, long j9) {
        int i10;
        String str2;
        long j10;
        long j11;
        long j12;
        d0.w wVar2;
        n nVar = this.f24940c;
        switch (this.f24938a) {
            case 0:
                nVar.f24944g = null;
                o oVar = this.f24939b;
                if (oVar != null) {
                    oVar.h(str, j, i9, wVar, j4, j9);
                    return;
                }
                return;
            default:
                o oVar2 = this.f24939b;
                if (oVar2 != null) {
                    if (i9 == 2001) {
                        Object[] objArr = {Integer.valueOf(nVar.f24946i)};
                        b bVar = (b) nVar.f8440b;
                        Log.w(bVar.f24917a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                        Iterator it = ((v4.h) nVar.f24945h.f17990b).f23854h.iterator();
                        while (it.hasNext()) {
                            ((v4.g) it.next()).v();
                        }
                        i10 = 2001;
                        str2 = str;
                        j10 = j;
                        wVar2 = wVar;
                        j11 = j4;
                        j12 = j9;
                    } else {
                        i10 = i9;
                        str2 = str;
                        j10 = j;
                        j11 = j4;
                        j12 = j9;
                        wVar2 = wVar;
                    }
                    oVar2.h(str2, j10, i10, wVar2, j11, j12);
                    return;
                }
                return;
        }
    }

    @Override // y4.o
    public final void m(String str, long j, long j4, long j9) {
        switch (this.f24938a) {
            case 0:
                o oVar = this.f24939b;
                if (oVar != null) {
                    oVar.m(str, j, j4, j9);
                    return;
                }
                return;
            default:
                o oVar2 = this.f24939b;
                if (oVar2 != null) {
                    oVar2.m(str, j, j4, j9);
                    return;
                }
                return;
        }
    }
}
