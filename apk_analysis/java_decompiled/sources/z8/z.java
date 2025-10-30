package z8;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z extends X {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X f25652e;

    public /* synthetic */ z(X x5, int i9) {
        this.f25651d = i9;
        this.f25652e = x5;
    }

    @Override // z8.X
    public final void a(L l9, Object obj) {
        switch (this.f25651d) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f25652e.a(l9, it.next());
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i9 = 0; i9 < length; i9++) {
                        this.f25652e.a(l9, Array.get(obj, i9));
                    }
                    return;
                }
                return;
        }
    }
}
