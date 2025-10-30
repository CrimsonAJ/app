package l4;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f20547b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f20548a;

    public w(Handler handler) {
        this.f20548a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static v b() {
        v vVar;
        ArrayList arrayList = f20547b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    vVar = new Object();
                } else {
                    vVar = (v) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public final v a(int i9, Object obj) {
        v b9 = b();
        b9.f20546a = this.f20548a.obtainMessage(i9, obj);
        return b9;
    }

    public final boolean c(int i9) {
        return this.f20548a.sendEmptyMessage(i9);
    }
}
