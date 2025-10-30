package e1;

import android.os.Build;
import androidx.work.OverwritingInputMerger;
import java.util.HashSet;
import java.util.UUID;
import n1.C1613j;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17062a = false;

    /* renamed from: b, reason: collision with root package name */
    public UUID f17063b;

    /* renamed from: c, reason: collision with root package name */
    public C1613j f17064c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f17065d;

    public r(Class cls) {
        HashSet hashSet = new HashSet();
        this.f17065d = hashSet;
        this.f17063b = UUID.randomUUID();
        this.f17064c = new C1613j(this.f17063b.toString(), cls.getName());
        hashSet.add(cls.getName());
        this.f17064c.f21034d = OverwritingInputMerger.class.getName();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, e1.s] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, n1.j] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, e1.c] */
    public final s a() {
        boolean z9;
        if (this.f17062a && this.f17064c.j.f17033c) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        UUID uuid = this.f17063b;
        C1613j c1613j = this.f17064c;
        HashSet hashSet = this.f17065d;
        ?? obj = new Object();
        obj.f17066a = uuid;
        obj.f17067b = c1613j;
        obj.f17068c = hashSet;
        c cVar = c1613j.j;
        if ((Build.VERSION.SDK_INT < 24 || cVar.f17038h.f17041a.size() <= 0) && !cVar.f17034d && !cVar.f17032b && !cVar.f17033c) {
            z9 = false;
        } else {
            z9 = true;
        }
        C1613j c1613j2 = this.f17064c;
        if (c1613j2.f21046q) {
            if (!z9) {
                if (c1613j2.f21037g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            } else {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
        }
        this.f17063b = UUID.randomUUID();
        C1613j c1613j3 = this.f17064c;
        ?? obj2 = new Object();
        obj2.f21032b = 1;
        h hVar = h.f17049c;
        obj2.f21035e = hVar;
        obj2.f21036f = hVar;
        obj2.j = c.f17030i;
        obj2.f21041l = 1;
        obj2.f21042m = 30000L;
        obj2.f21045p = -1L;
        obj2.f21047r = 1;
        obj2.f21031a = c1613j3.f21031a;
        obj2.f21033c = c1613j3.f21033c;
        obj2.f21032b = c1613j3.f21032b;
        obj2.f21034d = c1613j3.f21034d;
        obj2.f21035e = new h(c1613j3.f21035e);
        obj2.f21036f = new h(c1613j3.f21036f);
        obj2.f21037g = c1613j3.f21037g;
        obj2.f21038h = c1613j3.f21038h;
        obj2.f21039i = c1613j3.f21039i;
        c cVar2 = c1613j3.j;
        ?? obj3 = new Object();
        obj3.f17031a = 1;
        obj3.f17036f = -1L;
        obj3.f17037g = -1L;
        obj3.f17038h = new e();
        obj3.f17032b = cVar2.f17032b;
        obj3.f17033c = cVar2.f17033c;
        obj3.f17031a = cVar2.f17031a;
        obj3.f17034d = cVar2.f17034d;
        obj3.f17035e = cVar2.f17035e;
        obj3.f17038h = cVar2.f17038h;
        obj2.j = obj3;
        obj2.f21040k = c1613j3.f21040k;
        obj2.f21041l = c1613j3.f21041l;
        obj2.f21042m = c1613j3.f21042m;
        obj2.f21043n = c1613j3.f21043n;
        obj2.f21044o = c1613j3.f21044o;
        obj2.f21045p = c1613j3.f21045p;
        obj2.f21046q = c1613j3.f21046q;
        obj2.f21047r = c1613j3.f21047r;
        this.f17064c = obj2;
        obj2.f21031a = this.f17063b.toString();
        return obj;
    }
}
