package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public final class Z implements N0.e {

    /* renamed from: a, reason: collision with root package name */
    public final N0.f f9856a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9857b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f9858c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.l f9859d;

    public Z(N0.f savedStateRegistry, k0 k0Var) {
        kotlin.jvm.internal.h.e(savedStateRegistry, "savedStateRegistry");
        this.f9856a = savedStateRegistry;
        this.f9859d = Z0.a.q(new N1.r(21, k0Var));
    }

    @Override // N0.e
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f9858c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((a0) this.f9859d.getValue()).f9860d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a5 = ((V) entry.getValue()).f9847e.a();
            if (!kotlin.jvm.internal.h.a(a5, Bundle.EMPTY)) {
                bundle.putBundle(str, a5);
            }
        }
        this.f9857b = false;
        return bundle;
    }

    public final void b() {
        if (!this.f9857b) {
            Bundle c3 = this.f9856a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f9858c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (c3 != null) {
                bundle.putAll(c3);
            }
            this.f9858c = bundle;
            this.f9857b = true;
        }
    }
}
