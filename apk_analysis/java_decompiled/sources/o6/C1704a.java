package o6;

import android.os.Bundle;
import b5.T0;
import com.google.android.gms.internal.measurement.C0917d0;
import com.google.android.gms.internal.measurement.C0922e0;
import com.google.android.gms.internal.measurement.C0952k0;
import com.google.android.gms.internal.measurement.G;
import com.google.android.gms.internal.measurement.X;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.Z;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1704a implements T0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0952k0 f21641a;

    public C1704a(C0952k0 c0952k0) {
        this.f21641a = c0952k0;
    }

    @Override // b5.T0
    public final String b() {
        C0952k0 c0952k0 = this.f21641a;
        G g9 = new G();
        c0952k0.b(new C0917d0(c0952k0, g9, 1));
        return (String) G.Q(g9.g(50L), String.class);
    }

    @Override // b5.T0
    public final String c() {
        C0952k0 c0952k0 = this.f21641a;
        G g9 = new G();
        c0952k0.b(new C0917d0(c0952k0, g9, 4));
        return (String) G.Q(g9.g(500L), String.class);
    }

    @Override // b5.T0
    public final void d(String str) {
        C0952k0 c0952k0 = this.f21641a;
        c0952k0.b(new X(c0952k0, str, 1));
    }

    @Override // b5.T0
    public final void e(String str, String str2, Bundle bundle) {
        C0952k0 c0952k0 = this.f21641a;
        c0952k0.b(new Z(c0952k0, str, str2, bundle, 0));
    }

    @Override // b5.T0
    public final List f(String str, String str2) {
        return this.f21641a.e(str, str2);
    }

    @Override // b5.T0
    public final Map g(String str, String str2, boolean z9) {
        return this.f21641a.f(str, str2, z9);
    }

    @Override // b5.T0
    public final void h(String str) {
        C0952k0 c0952k0 = this.f21641a;
        c0952k0.b(new X(c0952k0, str, 2));
    }

    @Override // b5.T0
    public final int i(String str) {
        return this.f21641a.c(str);
    }

    @Override // b5.T0
    public final String j() {
        C0952k0 c0952k0 = this.f21641a;
        G g9 = new G();
        c0952k0.b(new C0917d0(c0952k0, g9, 3));
        return (String) G.Q(g9.g(500L), String.class);
    }

    @Override // b5.T0
    public final void k(Bundle bundle) {
        C0952k0 c0952k0 = this.f21641a;
        c0952k0.b(new Y(c0952k0, bundle, 0));
    }

    @Override // b5.T0
    public final void l(String str, String str2, Bundle bundle) {
        C0952k0 c0952k0 = this.f21641a;
        c0952k0.b(new C0922e0(c0952k0, str, str2, bundle, true));
    }

    @Override // b5.T0
    public final long m() {
        C0952k0 c0952k0 = this.f21641a;
        G g9 = new G();
        c0952k0.b(new C0917d0(c0952k0, g9, 2));
        Long l9 = (Long) G.Q(g9.g(500L), Long.class);
        if (l9 == null) {
            long nanoTime = System.nanoTime();
            c0952k0.f15514b.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i9 = c0952k0.f15518f + 1;
            c0952k0.f15518f = i9;
            return nextLong + i9;
        }
        return l9.longValue();
    }

    @Override // b5.T0
    public final String n() {
        C0952k0 c0952k0 = this.f21641a;
        G g9 = new G();
        c0952k0.b(new C0917d0(c0952k0, g9, 0));
        return (String) G.Q(g9.g(500L), String.class);
    }
}
