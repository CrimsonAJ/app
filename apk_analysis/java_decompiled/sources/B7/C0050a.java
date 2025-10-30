package B7;

import G0.C0135a;
import com.anilab.android.ui.download.DownloadFragment;
import com.anilab.android.ui.home.HomeFragment;
import com.anilab.domain.model.Movie;
import v1.C2098f;

/* renamed from: B7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0050a implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1118b;

    public /* synthetic */ C0050a(int i9, Object obj) {
        this.f1117a = i9;
        this.f1118b = obj;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        switch (this.f1117a) {
            case 0:
                if (obj == ((AbstractC0054e) this.f1118b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 1:
                Q0.a db = (Q0.a) obj;
                kotlin.jvm.internal.h.e(db, "db");
                ((G0.y) this.f1118b).f2817g = db;
                return A7.n.f558a;
            case 2:
                C0135a config = (C0135a) obj;
                kotlin.jvm.internal.h.e(config, "config");
                return ((G0.E) this.f1118b).g(config);
            case 3:
                H2.i it = (H2.i) obj;
                kotlin.jvm.internal.h.e(it, "it");
                R1.A t02 = ((DownloadFragment) this.f1118b).t0();
                t02.getClass();
                t02.d(true, new R1.y(t02, it.f3026a, false, null));
                return A7.n.f558a;
            case 4:
                ((HomeFragment) this.f1118b).z0((Movie) obj);
                return A7.n.f558a;
            default:
                ((C2098f) this.f1118b).f23752k = true;
                return A7.n.f558a;
        }
    }
}
