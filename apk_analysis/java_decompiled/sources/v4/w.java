package v4;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements C4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f23892b;

    public /* synthetic */ w(c cVar, int i9) {
        this.f23891a = i9;
        this.f23892b = cVar;
    }

    @Override // C4.p
    public final void a(C4.o oVar) {
        r rVar = (r) oVar;
        switch (this.f23891a) {
            case 0:
                c cVar = this.f23892b;
                cVar.getClass();
                Status d9 = rVar.d();
                int i9 = d9.f14660a;
                if (i9 != 0) {
                    StringBuilder p9 = A0.a.p("Error fetching queue item ids, statusCode=", i9, ", statusMessage=");
                    p9.append(d9.f14661b);
                    y4.b bVar = cVar.f23790a;
                    Log.w(bVar.f24917a, bVar.d(p9.toString(), new Object[0]));
                }
                cVar.f23800l = null;
                if (!cVar.f23797h.isEmpty()) {
                    T4.d dVar = cVar.f23798i;
                    t tVar = cVar.j;
                    dVar.removeCallbacks(tVar);
                    dVar.postDelayed(tVar, 500L);
                    return;
                }
                return;
            default:
                c cVar2 = this.f23892b;
                cVar2.getClass();
                Status d10 = rVar.d();
                int i10 = d10.f14660a;
                if (i10 != 0) {
                    StringBuilder p10 = A0.a.p("Error fetching queue items, statusCode=", i10, ", statusMessage=");
                    p10.append(d10.f14661b);
                    y4.b bVar2 = cVar2.f23790a;
                    Log.w(bVar2.f24917a, bVar2.d(p10.toString(), new Object[0]));
                }
                cVar2.f23799k = null;
                if (!cVar2.f23797h.isEmpty()) {
                    T4.d dVar2 = cVar2.f23798i;
                    t tVar2 = cVar2.j;
                    dVar2.removeCallbacks(tVar2);
                    dVar2.postDelayed(tVar2, 500L);
                    return;
                }
                return;
        }
    }
}
