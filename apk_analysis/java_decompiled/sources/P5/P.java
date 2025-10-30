package P5;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class P extends Q implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final P f5923b = new P(0);

    /* renamed from: c, reason: collision with root package name */
    public static final P f5924c = new P(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5925a;

    public /* synthetic */ P(int i9) {
        this.f5925a = i9;
    }

    @Override // P5.Q
    public final Q a() {
        switch (this.f5925a) {
            case 0:
                return f5924c;
            default:
                return f5923b;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5925a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f5925a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
