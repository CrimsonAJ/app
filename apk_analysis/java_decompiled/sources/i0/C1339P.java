package i0;

import androidx.lifecycle.e0;
import androidx.lifecycle.h0;
import m0.C1581d;
import n0.C1603c;
import u0.C2049u;

/* renamed from: i0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1339P implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18229a;

    @Override // androidx.lifecycle.h0
    public final e0 a(Class cls) {
        switch (this.f18229a) {
            case 0:
                return new C1340Q(true);
            case 1:
                return new C1603c();
            default:
                return new C2049u();
        }
    }

    @Override // androidx.lifecycle.h0
    public final e0 b(Class cls, C1581d c1581d) {
        switch (this.f18229a) {
            case 0:
                return a(cls);
            case 1:
                return a(cls);
            default:
                return a(cls);
        }
    }
}
