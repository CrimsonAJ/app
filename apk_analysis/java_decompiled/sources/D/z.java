package D;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1731a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f1732b;

    public z(Context context) {
        this.f1732b = context;
    }

    public final void b(ComponentName componentName) {
        Context context = this.f1732b;
        ArrayList arrayList = this.f1731a;
        int size = arrayList.size();
        try {
            for (Intent a5 = c.a(context, componentName); a5 != null; a5 = c.a(context, a5.getComponent())) {
                arrayList.add(size, a5);
            }
        } catch (PackageManager.NameNotFoundException e8) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e8);
        }
    }

    public final void c() {
        ArrayList arrayList = this.f1731a;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            this.f1732b.startActivities(intentArr, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f1731a.iterator();
    }
}
