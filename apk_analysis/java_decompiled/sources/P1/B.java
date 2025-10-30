package P1;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5666b;

    public /* synthetic */ B(String str, int i9) {
        this.f5665a = i9;
        this.f5666b = str;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        boolean z9;
        boolean z10;
        switch (this.f5665a) {
            case 0:
                H2.c cVar = (H2.c) obj;
                if (kotlin.jvm.internal.h.a(cVar.f2997m, this.f5666b) && cVar.f2998n) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 1:
                return Boolean.valueOf(kotlin.jvm.internal.h.a(((H2.c) obj).f2997m, this.f5666b));
            case 2:
                return Boolean.valueOf(kotlin.jvm.internal.h.a(((H2.c) obj).f2997m, this.f5666b));
            case 3:
                H2.c cVar2 = (H2.c) obj;
                if (kotlin.jvm.internal.h.a(cVar2.f2997m, this.f5666b) && cVar2.f2998n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                String it = (String) obj;
                kotlin.jvm.internal.h.e(it, "it");
                boolean U8 = W7.d.U(it);
                String str = this.f5666b;
                if (U8) {
                    if (it.length() < str.length()) {
                        return str;
                    }
                    return it;
                }
                return AbstractC0953k1.n(str, it);
        }
    }
}
