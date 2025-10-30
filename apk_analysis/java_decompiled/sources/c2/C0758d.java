package c2;

import M1.D;
import co.notix.R;

/* renamed from: c2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0758d implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0763i f11611b;

    public /* synthetic */ C0758d(C0763i c0763i, int i9) {
        this.f11610a = i9;
        this.f11611b = c0763i;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f11610a) {
            case 0:
                return this.f11611b.Y();
            default:
                C0763i c0763i = this.f11611b;
                try {
                    c0763i.f11621E0.a("android.permission.WRITE_EXTERNAL_STORAGE");
                } catch (Exception unused) {
                    c0763i.o0(new D(R.string.msg_unknown_error));
                }
                return A7.n.f558a;
        }
    }
}
