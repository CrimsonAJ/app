package v4;

import F4.y;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.TimerTask;

/* loaded from: classes.dex */
public final class t extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23885b;

    public /* synthetic */ t(int i9, Object obj) {
        this.f23884a = i9;
        this.f23885b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        int i9 = 1;
        Object obj = this.f23885b;
        switch (this.f23884a) {
            case 0:
                u uVar = (u) obj;
                h hVar = uVar.f23890e;
                HashSet hashSet = uVar.f23886a;
                y4.b bVar = h.f23846k;
                hVar.v(hashSet);
                hVar.f23848b.postDelayed(this, uVar.f23887b);
                return;
            default:
                c cVar = (c) obj;
                ArrayDeque arrayDeque = cVar.f23797h;
                if (!arrayDeque.isEmpty() && cVar.f23799k == null && cVar.f23791b != 0) {
                    int[] f9 = y4.a.f(arrayDeque);
                    h hVar2 = cVar.f23792c;
                    hVar2.getClass();
                    y.d();
                    if (!hVar2.w()) {
                        basePendingResult = h.r();
                    } else {
                        j jVar = new j(hVar2, f9, 1);
                        h.x(jVar);
                        basePendingResult = jVar;
                    }
                    cVar.f23799k = basePendingResult;
                    basePendingResult.K(new w(cVar, i9));
                    arrayDeque.clear();
                    return;
                }
                return;
        }
    }
}
