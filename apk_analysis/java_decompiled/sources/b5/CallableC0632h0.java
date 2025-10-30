package b5;

import com.google.android.gms.internal.measurement.C0979p2;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: b5.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0632h0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0635i0 f11135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11136c;

    public /* synthetic */ CallableC0632h0(C0635i0 c0635i0, String str, int i9) {
        this.f11134a = i9;
        this.f11135b = c0635i0;
        this.f11136c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11134a) {
            case 0:
                O0.c cVar = new O0.c(this.f11135b, this.f11136c, 12, false);
                C0979p2 c0979p2 = new C0979p2("internal.remoteConfig", 0);
                c0979p2.f15495b.put("getValue", new com.google.android.gms.internal.measurement.I1(cVar));
                return c0979p2;
            case 1:
                return new com.google.android.gms.internal.measurement.I1(new CallableC0632h0(this.f11135b, this.f11136c, 2));
            default:
                C0635i0 c0635i0 = this.f11135b;
                C0649n c0649n = c0635i0.f11361b.f10744c;
                J1.J(c0649n);
                String str = this.f11136c;
                Q i12 = c0649n.i1(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                ((C0650n0) c0635i0.f1707a).f11227g.s0();
                hashMap.put("gmp_version", 119002L);
                if (i12 != null) {
                    String e8 = i12.e();
                    if (e8 != null) {
                        hashMap.put("app_version", e8);
                    }
                    hashMap.put("app_version_int", Long.valueOf(i12.S()));
                    hashMap.put("dynamite_version", Long.valueOf(i12.T()));
                }
                return hashMap;
        }
    }
}
