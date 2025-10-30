package u0;

import B6.u0;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

@U("navigation")
/* loaded from: classes.dex */
public class G extends V {

    /* renamed from: c, reason: collision with root package name */
    public final W f23390c;

    public G(W w7) {
        this.f23390c = w7;
    }

    @Override // u0.V
    public final C a() {
        return new F(this);
    }

    @Override // u0.V
    public final void d(List list, J j) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2042m c2042m = (C2042m) it.next();
            C c3 = c2042m.f23496b;
            kotlin.jvm.internal.h.c(c3, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            F f9 = (F) c3;
            Bundle a5 = c2042m.a();
            int i9 = f9.f23388l;
            if (i9 == 0) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i10 = f9.f23381h;
                if (i10 != 0) {
                    str = f9.f23376c;
                    if (str == null) {
                        str = String.valueOf(i10);
                    }
                } else {
                    str = "the root navigation";
                }
                sb.append(str);
                throw new IllegalStateException(sb.toString().toString());
            }
            C c9 = (C) f9.f23387k.e(i9);
            if (c9 == null) {
                if (f9.f23389m == null) {
                    f9.f23389m = String.valueOf(f9.f23388l);
                }
                String str2 = f9.f23389m;
                kotlin.jvm.internal.h.b(str2);
                throw new IllegalArgumentException(A0.a.n("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            V b9 = this.f23390c.b(c9.f23374a);
            C2044o b10 = b();
            Bundle b11 = c9.b(a5);
            H h7 = b10.f23518h;
            b9.d(u0.D(d0.o.e(h7.f23394a, c9, b11, h7.h(), h7.f23407o)), j);
        }
    }
}
