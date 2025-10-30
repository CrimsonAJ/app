package T3;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import k4.G;
import l4.y;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f7067a;

    public a(c cVar) {
        this.f7067a = cVar;
    }

    @Override // T3.r
    public final void b() {
        this.f7067a.f7083e.remove(this);
    }

    @Override // T3.r
    public final boolean d(Uri uri, A1.i iVar, boolean z9) {
        HashMap hashMap;
        b bVar;
        c cVar = this.f7067a;
        if (cVar.f7089l == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m mVar = cVar.j;
            int i9 = y.f20553a;
            List list = mVar.f7143e;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = list.size();
                hashMap = cVar.f7082d;
                if (i10 >= size) {
                    break;
                }
                b bVar2 = (b) hashMap.get(((l) list.get(i10)).f7135a);
                if (bVar2 != null && elapsedRealtime < bVar2.f7075h) {
                    i11++;
                }
                i10++;
            }
            G g9 = new G(1, 0, cVar.j.f7143e.size(), i11);
            cVar.f7081c.getClass();
            B3.f e8 = e1.q.e(g9, iVar);
            if (e8 != null && e8.f674a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, e8.f675b);
            }
        }
        return false;
    }
}
