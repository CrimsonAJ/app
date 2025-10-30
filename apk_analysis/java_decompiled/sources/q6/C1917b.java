package q6;

import P5.I;
import android.os.Bundle;
import b5.D0;
import b5.E0;
import f5.C1183o;
import java.util.HashSet;
import k4.C1499E;

/* renamed from: q6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1917b implements E0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22436b;

    public /* synthetic */ C1917b(int i9, Object obj) {
        this.f22435a = i9;
        this.f22436b = obj;
    }

    @Override // b5.E0
    public final void a(long j, Bundle bundle, String str, String str2) {
        Object obj = this.f22436b;
        switch (this.f22435a) {
            case 0:
                C1499E c1499e = (C1499E) obj;
                if (((HashSet) c1499e.f19985b).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    I i9 = AbstractC1916a.f22429a;
                    String d9 = D0.d(str2, D0.f10576c, D0.f10574a);
                    if (d9 != null) {
                        str2 = d9;
                    }
                    bundle2.putString("events", str2);
                    ((C1499E) c1499e.f19986c).q(2, bundle2);
                    return;
                }
                return;
            default:
                if (str != null && !AbstractC1916a.f22429a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((C1499E) ((C1183o) obj).f17433b).q(3, bundle3);
                    return;
                }
                return;
        }
    }
}
