package i7;

import B6.u0;
import android.os.Message;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class Z implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return u0.o(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
    }
}
