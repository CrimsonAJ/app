package d2;

import android.os.Bundle;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: d2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1106A implements u0.D {

    /* renamed from: a, reason: collision with root package name */
    public final String f16714a;

    public C1106A(String fullDetail) {
        kotlin.jvm.internal.h.e(fullDetail, "fullDetail");
        this.f16714a = fullDetail;
    }

    @Override // u0.D
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("full_detail", this.f16714a);
        return bundle;
    }

    @Override // u0.D
    public final int b() {
        return R.id.openFullDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1106A) && kotlin.jvm.internal.h.a(this.f16714a, ((C1106A) obj).f16714a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16714a.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("OpenFullDetail(fullDetail="), this.f16714a, ")");
    }
}
