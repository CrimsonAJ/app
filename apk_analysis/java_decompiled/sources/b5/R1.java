package b5;

import com.google.android.gms.internal.measurement.C0928f1;
import com.google.android.gms.internal.measurement.C0933g1;
import com.google.android.gms.internal.measurement.C0938h1;
import com.google.android.gms.internal.measurement.C0943i1;
import com.google.android.gms.internal.measurement.C0950j3;
import com.google.android.gms.internal.measurement.C0972o0;
import com.google.android.gms.internal.measurement.C1006v0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import s.C1932b;
import s.C1935e;
import s.C1939i;

/* loaded from: classes.dex */
public final class R1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10928a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10929b;

    /* renamed from: c, reason: collision with root package name */
    public final C0933g1 f10930c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f10931d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f10932e;

    /* renamed from: f, reason: collision with root package name */
    public final C1935e f10933f;

    /* renamed from: g, reason: collision with root package name */
    public final C1935e f10934g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0616c f10935h;

    /* JADX WARN: Type inference failed for: r1v4, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r1v5, types: [s.e, s.i] */
    public R1(C0616c c0616c, String str) {
        this.f10935h = c0616c;
        this.f10928a = str;
        this.f10929b = true;
        this.f10931d = new BitSet();
        this.f10932e = new BitSet();
        this.f10933f = new C1939i(0);
        this.f10934g = new C1939i(0);
    }

    public final com.google.android.gms.internal.measurement.R0 a(int i9) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.Q0 o9 = com.google.android.gms.internal.measurement.R0.o();
        o9.j();
        com.google.android.gms.internal.measurement.R0.r((com.google.android.gms.internal.measurement.R0) o9.f15439b, i9);
        o9.j();
        com.google.android.gms.internal.measurement.R0.t((com.google.android.gms.internal.measurement.R0) o9.f15439b, this.f10929b);
        C0933g1 c0933g1 = this.f10930c;
        if (c0933g1 != null) {
            o9.j();
            com.google.android.gms.internal.measurement.R0.u((com.google.android.gms.internal.measurement.R0) o9.f15439b, c0933g1);
        }
        C0928f1 r5 = C0933g1.r();
        ArrayList V02 = Z.V0(this.f10931d);
        r5.j();
        C0933g1.y((C0933g1) r5.f15439b, V02);
        ArrayList V03 = Z.V0(this.f10932e);
        r5.j();
        C0933g1.A((C0933g1) r5.f15439b, V03);
        C1935e c1935e = this.f10933f;
        if (c1935e == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(c1935e.f22660c);
            Iterator it = ((C1932b) c1935e.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l9 = (Long) c1935e.get(num);
                if (l9 != null) {
                    com.google.android.gms.internal.measurement.S0 p9 = com.google.android.gms.internal.measurement.T0.p();
                    p9.j();
                    com.google.android.gms.internal.measurement.T0.r((com.google.android.gms.internal.measurement.T0) p9.f15439b, intValue);
                    long longValue = l9.longValue();
                    p9.j();
                    com.google.android.gms.internal.measurement.T0.q((com.google.android.gms.internal.measurement.T0) p9.f15439b, longValue);
                    arrayList2.add((com.google.android.gms.internal.measurement.T0) p9.h());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            r5.j();
            C0933g1.x((C0933g1) r5.f15439b, arrayList);
        }
        C1935e c1935e2 = this.f10934g;
        if (c1935e2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(c1935e2.f22660c);
            Iterator it2 = ((C1932b) c1935e2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                C0938h1 q9 = C0943i1.q();
                int intValue2 = num2.intValue();
                q9.j();
                C0943i1.t((C0943i1) q9.f15439b, intValue2);
                List list2 = (List) c1935e2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    q9.j();
                    C0943i1.s((C0943i1) q9.f15439b, list2);
                }
                arrayList3.add((C0943i1) q9.h());
            }
            list = arrayList3;
        }
        r5.j();
        C0933g1.z((C0933g1) r5.f15439b, list);
        o9.j();
        com.google.android.gms.internal.measurement.R0.s((com.google.android.gms.internal.measurement.R0) o9.f15439b, (C0933g1) r5.h());
        return (com.google.android.gms.internal.measurement.R0) o9.h();
    }

    public final void b(C0613b c0613b) {
        int o9;
        boolean z9;
        boolean z10;
        switch (c0613b.f11031g) {
            case 0:
                o9 = ((C0972o0) c0613b.f11033i).o();
                break;
            default:
                o9 = ((C1006v0) c0613b.f11033i).n();
                break;
        }
        if (c0613b.f11027c != null) {
            this.f10932e.set(o9, true);
        }
        Boolean bool = c0613b.f11028d;
        if (bool != null) {
            this.f10931d.set(o9, bool.booleanValue());
        }
        if (c0613b.f11029e != null) {
            Integer valueOf = Integer.valueOf(o9);
            C1935e c1935e = this.f10933f;
            Long l9 = (Long) c1935e.get(valueOf);
            long longValue = c0613b.f11029e.longValue() / 1000;
            if (l9 == null || longValue > l9.longValue()) {
                c1935e.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (c0613b.f11030f != null) {
            C1935e c1935e2 = this.f10934g;
            Integer valueOf2 = Integer.valueOf(o9);
            List list = (List) c1935e2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                c1935e2.put(valueOf2, list);
            }
            switch (c0613b.f11031g) {
                case 0:
                    z9 = false;
                    break;
                default:
                    z9 = true;
                    break;
            }
            if (z9) {
                list.clear();
            }
            C0950j3.a();
            C0650n0 c0650n0 = (C0650n0) this.f10935h.f1707a;
            C0628g c0628g = c0650n0.f11227g;
            D d9 = E.f10596F0;
            String str = this.f10928a;
            if (c0628g.y0(str, d9)) {
                switch (c0613b.f11031g) {
                    case 0:
                        z10 = ((C0972o0) c0613b.f11033i).z();
                        break;
                    default:
                        z10 = false;
                        break;
                }
                if (z10) {
                    list.clear();
                }
            }
            C0950j3.a();
            if (c0650n0.f11227g.y0(str, d9)) {
                Long valueOf3 = Long.valueOf(c0613b.f11030f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(c0613b.f11030f.longValue() / 1000));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [s.e, s.i] */
    public R1(C0616c c0616c, String str, C0933g1 c0933g1, BitSet bitSet, BitSet bitSet2, C1935e c1935e, C1935e c1935e2) {
        this.f10935h = c0616c;
        this.f10928a = str;
        this.f10931d = bitSet;
        this.f10932e = bitSet2;
        this.f10933f = c1935e;
        this.f10934g = new C1939i(0);
        Iterator it = ((C1932b) c1935e2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c1935e2.get(num));
            this.f10934g.put(num, arrayList);
        }
        this.f10929b = false;
        this.f10930c = c0933g1;
    }
}
