package I1;

import L2.C0237a;
import L2.C0238b;
import L2.y;
import L2.z;
import android.app.Application;
import b7.C0701c;
import com.anilab.android.App;
import v7.C2118f;
import x7.InterfaceC2180b;

/* loaded from: classes.dex */
public abstract class m extends Application implements InterfaceC2180b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3436a = false;

    /* renamed from: b, reason: collision with root package name */
    public final C2118f f3437b = new C2118f(new C0701c(8, this));

    @Override // x7.InterfaceC2180b
    public final Object e() {
        return this.f3437b.e();
    }

    @Override // android.app.Application
    public void onCreate() {
        if (!this.f3436a) {
            this.f3436a = true;
            App app = (App) this;
            j jVar = (j) ((d) this.f3437b.e());
            app.f13717c = (C0238b) jVar.f3353e.get();
            app.f13718d = (C0237a) jVar.f3356f.get();
            app.f13719e = (z) jVar.f3359g.get();
            app.f13720f = (y) jVar.f3362h.get();
        }
        super.onCreate();
    }
}
