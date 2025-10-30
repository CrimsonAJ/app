package R1;

import B6.u0;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class g implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6529a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6529a) {
            case 0:
                return u0.o(Integer.valueOf(((J2.c) obj).ordinal()), Integer.valueOf(((J2.c) obj2).ordinal()));
            default:
                return u0.o(Integer.valueOf(((J2.c) obj).ordinal()), Integer.valueOf(((J2.c) obj2).ordinal()));
        }
    }
}
