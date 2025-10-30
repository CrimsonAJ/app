package A1;

import F0.z0;
import F4.y;
import android.text.TextUtils;
import b5.C0635i0;
import b5.C0649n;
import b5.C0650n0;
import b5.E;
import b5.J1;
import b5.V;
import com.google.android.gms.internal.measurement.D;
import com.google.android.gms.internal.measurement.F0;
import s.C1935e;

/* loaded from: classes.dex */
public final class f extends z0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f16i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C0635i0 c0635i0) {
        super(20);
        this.f16i = c0635i0;
    }

    @Override // F0.z0
    public Object c(Object obj) {
        switch (this.f15h) {
            case 1:
                String str = (String) obj;
                y.e(str);
                C0635i0 c0635i0 = (C0635i0) this.f16i;
                boolean y02 = ((C0650n0) c0635i0.f1707a).f11227g.y0(null, E.f10678o1);
                f fVar = c0635i0.j;
                if (y02) {
                    c0635i0.m0();
                    y.e(str);
                    C0649n c0649n = c0635i0.f11361b.f10744c;
                    J1.J(c0649n);
                    android.support.v4.media.session.y k12 = c0649n.k1(str);
                    if (k12 == null) {
                        return null;
                    }
                    V v8 = ((C0650n0) c0635i0.f1707a).f11229i;
                    C0650n0.f(v8);
                    v8.f10978n.c(str, "Populate EES config from database on cache miss. appId");
                    c0635i0.u0(str, c0635i0.r0(str, (byte[]) k12.f9331b));
                    return (D) fVar.p().get(str);
                }
                c0635i0.m0();
                y.e(str);
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                C1935e c1935e = c0635i0.f11144h;
                F0 f02 = (F0) c1935e.get(str);
                if (f02 == null || f02.n() == 0) {
                    return null;
                }
                if (c1935e.containsKey(str) && c1935e.get(str) != null) {
                    c0635i0.u0(str, (F0) c1935e.get(str));
                } else {
                    c0635i0.t0(str);
                }
                return (D) fVar.p().get(str);
            default:
                return super.c(obj);
        }
    }

    @Override // F0.z0
    public void d(Object obj, Object obj2, Object obj3) {
        switch (this.f15h) {
            case 0:
                e eVar = (e) obj2;
                ((i) ((g) this.f16i).f18b).l((b) obj, eVar.f12a, eVar.f13b, eVar.f14c);
                return;
            default:
                super.d(obj, obj2, obj3);
                return;
        }
    }

    @Override // F0.z0
    public int o(Object obj, Object obj2) {
        switch (this.f15h) {
            case 0:
                return ((e) obj2).f14c;
            default:
                return super.o(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i9, g gVar) {
        super(i9);
        this.f16i = gVar;
    }
}
