package A4;

import android.os.Bundle;
import android.util.Log;
import f5.C1177i;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f372a;

    /* renamed from: b, reason: collision with root package name */
    public final C1177i f373b = new C1177i();

    /* renamed from: c, reason: collision with root package name */
    public final int f374c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f376e;

    public o(int i9, int i10, Bundle bundle, int i11) {
        this.f376e = i11;
        this.f372a = i9;
        this.f374c = i10;
        this.f375d = bundle;
    }

    public final boolean a() {
        switch (this.f376e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(p pVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + pVar.toString());
        }
        this.f373b.a(pVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f373b.b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f374c + " id=" + this.f372a + " oneWay=" + a() + "}";
    }
}
