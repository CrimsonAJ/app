package b5;

import s.C1935e;

/* renamed from: b5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0610a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11014c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0677z f11015d;

    public /* synthetic */ RunnableC0610a(C0677z c0677z, String str, long j, int i9) {
        this.f11012a = i9;
        this.f11013b = str;
        this.f11014c = j;
        this.f11015d = c0677z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11012a) {
            case 0:
                C0677z c0677z = this.f11015d;
                c0677z.l0();
                String str = this.f11013b;
                F4.y.e(str);
                C1935e c1935e = c0677z.f11353c;
                boolean isEmpty = c1935e.isEmpty();
                long j = this.f11014c;
                if (isEmpty) {
                    c0677z.f11354d = j;
                }
                Integer num = (Integer) c1935e.get(str);
                if (num != null) {
                    c1935e.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                }
                if (c1935e.f22660c >= 100) {
                    V v8 = ((C0650n0) c0677z.f1707a).f11229i;
                    C0650n0.f(v8);
                    v8.f10974i.b("Too many ads visible");
                    return;
                } else {
                    c1935e.put(str, 1);
                    c0677z.f11352b.put(str, Long.valueOf(j));
                    return;
                }
            default:
                C0677z c0677z2 = this.f11015d;
                c0677z2.l0();
                String str2 = this.f11013b;
                F4.y.e(str2);
                C1935e c1935e2 = c0677z2.f11353c;
                Integer num2 = (Integer) c1935e2.get(str2);
                C0650n0 c0650n0 = (C0650n0) c0677z2.f1707a;
                if (num2 != null) {
                    C0621d1 c0621d1 = c0650n0.f11234o;
                    C0650n0.e(c0621d1);
                    C0612a1 s02 = c0621d1.s0(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue == 0) {
                        c1935e2.remove(str2);
                        C1935e c1935e3 = c0677z2.f11352b;
                        Long l9 = (Long) c1935e3.get(str2);
                        long j4 = this.f11014c;
                        V v9 = c0650n0.f11229i;
                        if (l9 == null) {
                            C0650n0.f(v9);
                            v9.f10971f.b("First ad unit exposure time was never set");
                        } else {
                            long longValue = j4 - l9.longValue();
                            c1935e3.remove(str2);
                            c0677z2.q0(str2, longValue, s02);
                        }
                        if (c1935e2.isEmpty()) {
                            long j9 = c0677z2.f11354d;
                            if (j9 == 0) {
                                C0650n0.f(v9);
                                v9.f10971f.b("First ad exposure time was never set");
                                return;
                            } else {
                                c0677z2.p0(j4 - j9, s02);
                                c0677z2.f11354d = 0L;
                                return;
                            }
                        }
                        return;
                    }
                    c1935e2.put(str2, Integer.valueOf(intValue));
                    return;
                }
                V v10 = c0650n0.f11229i;
                C0650n0.f(v10);
                v10.f10971f.c(str2, "Call to endAdUnitExposure for unknown ad unit id");
                return;
        }
    }
}
