package n0;

import androidx.lifecycle.e0;
import i0.C1339P;
import s.C1940j;
import s4.C1957d;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1603c extends e0 {

    /* renamed from: f, reason: collision with root package name */
    public static final C1339P f21006f = new C1339P(1);

    /* renamed from: d, reason: collision with root package name */
    public final C1940j f21007d = new C1940j(0);

    /* renamed from: e, reason: collision with root package name */
    public boolean f21008e = false;

    @Override // androidx.lifecycle.e0
    public final void b() {
        C1940j c1940j = this.f21007d;
        int i9 = c1940j.i();
        for (int i10 = 0; i10 < i9; i10++) {
            C1601a c1601a = (C1601a) c1940j.j(i10);
            C1957d c1957d = c1601a.f21001l;
            c1957d.a();
            c1957d.f22721c = true;
            C1602b c1602b = c1601a.f21003n;
            if (c1602b != null) {
                c1601a.h(c1602b);
            }
            C1601a c1601a2 = c1957d.f22719a;
            if (c1601a2 != null) {
                if (c1601a2 == c1601a) {
                    c1957d.f22719a = null;
                    if (c1602b != null) {
                        boolean z9 = c1602b.f21005b;
                    }
                    c1957d.f22722d = true;
                    c1957d.f22720b = false;
                    c1957d.f22721c = false;
                    c1957d.f22723e = false;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            } else {
                throw new IllegalStateException("No listener register");
            }
        }
        int i11 = c1940j.f22664d;
        Object[] objArr = c1940j.f22663c;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        c1940j.f22664d = 0;
        c1940j.f22661a = false;
    }
}
