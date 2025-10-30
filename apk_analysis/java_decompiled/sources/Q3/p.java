package Q3;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import k4.C1517q;
import l4.y;

/* loaded from: classes.dex */
public final class p implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C1517q f6427a;

    /* renamed from: b, reason: collision with root package name */
    public final f f6428b;

    /* renamed from: f, reason: collision with root package name */
    public R3.c f6432f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6433g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6434h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6435i;

    /* renamed from: e, reason: collision with root package name */
    public final TreeMap f6431e = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f6430d = y.l(this);

    /* renamed from: c, reason: collision with root package name */
    public final E3.b f6429c = new E3.b(1);

    public p(R3.c cVar, f fVar, C1517q c1517q) {
        this.f6432f = cVar;
        this.f6428b = fVar;
        this.f6427a = c1517q;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.f6435i) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j = nVar.f6420a;
            TreeMap treeMap = this.f6431e;
            long j4 = nVar.f6421b;
            Long l9 = (Long) treeMap.get(Long.valueOf(j4));
            if (l9 == null) {
                treeMap.put(Long.valueOf(j4), Long.valueOf(j));
                return true;
            }
            if (l9.longValue() > j) {
                treeMap.put(Long.valueOf(j4), Long.valueOf(j));
            }
        }
        return true;
    }
}
