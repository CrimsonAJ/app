package Y7;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class O implements InterfaceC0451a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8778a;

    public O(boolean z9) {
        this.f8778a = z9;
    }

    @Override // Y7.InterfaceC0451a0
    public final boolean a() {
        return this.f8778a;
    }

    @Override // Y7.InterfaceC0451a0
    public final t0 e() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f8778a) {
            str = "Active";
        } else {
            str = "New";
        }
        return AbstractC0953k1.p(sb, str, '}');
    }
}
