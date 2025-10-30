package D4;

import androidx.work.impl.foreground.SystemForegroundService;
import d0.AbstractC1089g;
import java.util.ArrayList;
import java.util.List;
import o1.C1671f;
import z5.AbstractC2250c;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1878a;

    /* renamed from: b, reason: collision with root package name */
    public int f1879b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1880c;

    public /* synthetic */ s(int i9, int i10, Object obj) {
        this.f1878a = i10;
        this.f1880c = obj;
        this.f1879b = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1878a) {
            case 0:
                ((t) this.f1880c).i(this.f1879b);
                return;
            case 1:
                ((H5.d) this.f1880c).f3150h.x(this.f1879b, 4);
                return;
            case 2:
                G.b bVar = (G.b) ((C1671f) this.f1880c).f21473b;
                if (bVar != null) {
                    bVar.h(this.f1879b);
                    return;
                }
                return;
            case 3:
                ((com.google.android.material.datepicker.j) this.f1880c).f15997C0.k0(this.f1879b);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.f1880c;
                int size = arrayList.size();
                int i9 = 0;
                if (this.f1879b != 1) {
                    while (i9 < size) {
                        ((AbstractC1089g) arrayList.get(i9)).a();
                        i9++;
                    }
                    return;
                } else {
                    while (i9 < size) {
                        ((AbstractC1089g) arrayList.get(i9)).b();
                        i9++;
                    }
                    return;
                }
            case 5:
                ((d1.l) this.f1880c).k0(this.f1879b);
                return;
            case 6:
                ((SystemForegroundService) this.f1880c).f10445e.cancel(this.f1879b);
                return;
            case 7:
                ((y4.v) this.f1880c).f24984C.b(this.f1879b);
                return;
            default:
                ((AbstractC2250c) this.f1880c).i(this.f1879b);
                return;
        }
    }

    public s(int i9, d1.l lVar) {
        this.f1878a = 5;
        this.f1879b = i9;
        this.f1880c = lVar;
    }

    public s(List list, int i9, Throwable th) {
        this.f1878a = 4;
        s8.e.g(list, "initCallbacks cannot be null");
        this.f1880c = new ArrayList(list);
        this.f1879b = i9;
    }

    public s(H5.d dVar) {
        this.f1878a = 1;
        this.f1880c = dVar;
        this.f1879b = -1;
    }
}
