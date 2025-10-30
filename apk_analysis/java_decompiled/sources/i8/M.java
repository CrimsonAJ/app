package i8;

import java.util.regex.Pattern;
import x8.C2187g;
import x8.InterfaceC2189i;

/* loaded from: classes.dex */
public final class M extends N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19042a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19043b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19044c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2189i f19045d;

    public /* synthetic */ M(Object obj, long j, InterfaceC2189i interfaceC2189i, int i9) {
        this.f19042a = i9;
        this.f19044c = obj;
        this.f19043b = j;
        this.f19045d = interfaceC2189i;
    }

    @Override // i8.N
    public final long a() {
        switch (this.f19042a) {
            case 0:
                return this.f19043b;
            default:
                return this.f19043b;
        }
    }

    @Override // i8.N
    public final A d() {
        Object obj = this.f19044c;
        switch (this.f19042a) {
            case 0:
                return (A) obj;
            default:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = A.f18925d;
                try {
                    return M4.a.o(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }

    @Override // i8.N
    public final InterfaceC2189i g() {
        switch (this.f19042a) {
            case 0:
                return (C2187g) this.f19045d;
            default:
                return (x8.C) this.f19045d;
        }
    }
}
