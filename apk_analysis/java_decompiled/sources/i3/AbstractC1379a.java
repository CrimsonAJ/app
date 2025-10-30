package i3;

import V2.d;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.HashMap;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1379a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f18486a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f18487b;

    static {
        HashMap hashMap = new HashMap();
        f18487b = hashMap;
        hashMap.put(d.f7660a, 0);
        hashMap.put(d.f7661b, 1);
        hashMap.put(d.f7662c, 2);
        for (d dVar : hashMap.keySet()) {
            f18486a.append(((Integer) f18487b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f18487b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i9) {
        d dVar = (d) f18486a.get(i9);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Unknown Priority for value "));
    }
}
