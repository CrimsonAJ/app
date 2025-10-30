package j3;

import N3.C0262m;
import android.content.Context;
import java.util.HashMap;
import k4.C1518s;

/* renamed from: j3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1463n implements O5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f19698b;

    public /* synthetic */ C1463n(Context context, int i9) {
        this.f19697a = i9;
        this.f19698b = context;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [q3.h, java.lang.Object] */
    @Override // O5.n
    public final Object get() {
        C1518s c1518s;
        switch (this.f19697a) {
            case 0:
                return new C1460k(this.f19698b);
            case 1:
                return new C0262m(new O0.c(this.f19698b, 29), new Object());
            case 2:
                return new i4.o(this.f19698b);
            default:
                Context context = this.f19698b;
                P5.S s9 = C1518s.f20092n;
                synchronized (C1518s.class) {
                    try {
                        if (C1518s.f20098t == null) {
                            C3.c cVar = new C3.c(context);
                            C1518s.f20098t = new C1518s((Context) cVar.f1438c, (HashMap) cVar.f1439d, cVar.f1436a, (l4.u) cVar.f1440e, cVar.f1437b);
                        }
                        c1518s = C1518s.f20098t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c1518s;
        }
    }
}
