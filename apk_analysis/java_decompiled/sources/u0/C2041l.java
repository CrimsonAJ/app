package u0;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0563y;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.b0;
import androidx.lifecycle.h0;

/* renamed from: u0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2041l extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2042m f23494e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2041l(C2042m c2042m, int i9) {
        super(0);
        this.f23493d = i9;
        this.f23494e = c2042m;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [u0.j, java.lang.Object, androidx.lifecycle.h0] */
    @Override // O7.a
    public final Object invoke() {
        Context context;
        switch (this.f23493d) {
            case 0:
                C2042m c2042m = this.f23494e;
                Context context2 = c2042m.f23495a;
                Application application = null;
                if (context2 != null) {
                    context = context2.getApplicationContext();
                } else {
                    context = null;
                }
                if (context instanceof Application) {
                    application = (Application) context;
                }
                return new b0(application, c2042m, c2042m.a());
            default:
                C2042m c2042m2 = this.f23494e;
                if (c2042m2.j) {
                    C0563y c0563y = c2042m2.f23502h;
                    if (c0563y.f9908d != EnumC0555p.f9893a) {
                        ?? obj = new Object();
                        obj.f23490a = (N0.f) c2042m2.f23503i.f15188c;
                        obj.f23491b = c0563y;
                        return ((C2040k) new android.support.v4.media.session.y(c2042m2, (h0) obj).J(C2040k.class)).f23492d;
                    }
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
    }
}
