package P5;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
public class G extends AbstractC0348p implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient X f5902d;

    public G(X x5, int i9) {
        this.f5902d = x5;
    }

    @Override // P5.AbstractC0347o
    public final Map a() {
        return this.f5902d;
    }

    @Override // P5.AbstractC0347o
    public final boolean b(Object obj) {
        if (obj != null && super.b(obj)) {
            return true;
        }
        return false;
    }

    public final F c(String str) {
        F f9 = (F) this.f5902d.get(str);
        if (f9 == null) {
            D d9 = F.f5901b;
            return S.f5926e;
        }
        return f9;
    }
}
