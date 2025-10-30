package i8;

import java.util.regex.Pattern;
import x8.InterfaceC2189i;

/* renamed from: i8.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1414d extends N {

    /* renamed from: a, reason: collision with root package name */
    public final l8.e f19068a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19069b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19070c;

    /* renamed from: d, reason: collision with root package name */
    public final x8.C f19071d;

    public C1414d(l8.e eVar, String str, String str2) {
        this.f19068a = eVar;
        this.f19069b = str;
        this.f19070c = str2;
        this.f19071d = v4.e.b(new C1413c((x8.I) eVar.f20631c.get(1), this));
    }

    @Override // i8.N
    public final long a() {
        String str = this.f19070c;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = k8.c.f20141a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // i8.N
    public final A d() {
        String str = this.f19069b;
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

    @Override // i8.N
    public final InterfaceC2189i g() {
        return this.f19071d;
    }
}
