package G0;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2640a;

    public C(int i9) {
        switch (i9) {
            case 1:
                this.f2640a = new LinkedHashMap(0, 0.75f, true);
                return;
            default:
                this.f2640a = new LinkedHashMap();
                return;
        }
    }

    public void a(K0.a migration) {
        kotlin.jvm.internal.h.e(migration, "migration");
        LinkedHashMap linkedHashMap = this.f2640a;
        Integer valueOf = Integer.valueOf(migration.f4229a);
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        int i9 = migration.f4230b;
        if (treeMap.containsKey(Integer.valueOf(i9))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i9)) + " with " + migration);
        }
        treeMap.put(Integer.valueOf(i9), migration);
    }
}
