package t0;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1968b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22948a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22949b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1971e f22950c;

    public HandlerC1968b(C1971e c1971e) {
        this.f22950c = c1971e;
    }

    public static void a(C1990y c1990y, int i9, Object obj, int i10) {
        C c3;
        C c9;
        boolean z9;
        D d9 = c1990y.f23049a;
        int i11 = 65280 & i9;
        AbstractC1989x abstractC1989x = c1990y.f23050b;
        if (i11 != 256) {
            if (i11 != 512) {
                if (i11 == 768 && i9 == 769) {
                    abstractC1989x.n((F) obj);
                    return;
                }
                return;
            }
            switch (i9) {
                case 513:
                    abstractC1989x.a();
                    return;
                case 514:
                    abstractC1989x.c();
                    return;
                case 515:
                    abstractC1989x.b();
                    return;
                default:
                    return;
            }
        }
        if (i9 != 264 && i9 != 262) {
            if (i9 != 265 && i9 != 266) {
                c9 = (C) obj;
                c3 = null;
            } else {
                throw AbstractC0953k1.i(obj);
            }
        } else {
            C1970d c1970d = (C1970d) obj;
            C c10 = c1970d.f22955b;
            c3 = c1970d.f22954a;
            c9 = c10;
        }
        if (c9 != null) {
            boolean z10 = true;
            if ((c1990y.f23052d & 2) == 0 && !c9.h(c1990y.f23051c)) {
                F f9 = D.c().f22982u;
                if (f9 == null) {
                    z9 = false;
                } else {
                    z9 = f9.f22870c;
                }
                z10 = (z9 && c9.d() && i9 == 262 && i10 == 3 && c3 != null) ? true ^ c3.d() : false;
            }
            if (z10) {
                switch (i9) {
                    case 257:
                        abstractC1989x.d(d9, c9);
                        return;
                    case 258:
                        abstractC1989x.h(d9, c9);
                        return;
                    case 259:
                        abstractC1989x.e(d9, c9);
                        return;
                    case 260:
                        abstractC1989x.m(c9);
                        return;
                    case 261:
                        abstractC1989x.getClass();
                        return;
                    case 262:
                        abstractC1989x.j(d9, c9, i10, c9);
                        return;
                    case 263:
                        abstractC1989x.l(d9, c9, i10);
                        return;
                    case 264:
                        abstractC1989x.j(d9, c9, i10, c3);
                        return;
                    case 265:
                        abstractC1989x.f(c3, c9);
                        return;
                    case 266:
                        abstractC1989x.g(c3, c9, i10);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void b(int i9, Object obj) {
        obtainMessage(i9, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int k5;
        ArrayList arrayList = this.f22948a;
        int i9 = message.what;
        Object obj = message.obj;
        int i10 = message.arg1;
        C1971e c1971e = this.f22950c;
        if (i9 == 259 && c1971e.g().f22842c.equals(((C) obj).f22842c)) {
            c1971e.p(true);
        }
        ArrayList arrayList2 = this.f22949b;
        int i11 = 0;
        if (i9 != 262) {
            if (i9 != 264) {
                switch (i9) {
                    case 257:
                        c1971e.f22980s.o((C) obj);
                        break;
                    case 258:
                        c1971e.f22980s.p((C) obj);
                        break;
                    case 259:
                        N n7 = c1971e.f22980s;
                        C c3 = (C) obj;
                        n7.getClass();
                        if (c3.c() != n7 && (k5 = n7.k(c3)) >= 0) {
                            N.t((M) n7.f22893r.get(k5));
                            break;
                        }
                        break;
                }
            } else {
                C1970d c1970d = (C1970d) obj;
                C c9 = c1970d.f22955b;
                arrayList2.add(c9);
                c1971e.f22980s.o(c9);
                if (c1970d.f22956c) {
                    c1971e.f22980s.q(c9);
                }
            }
        } else {
            C1970d c1970d2 = (C1970d) obj;
            C c10 = c1970d2.f22955b;
            if (c1970d2.f22956c) {
                c1971e.f22980s.q(c10);
            }
            if (c1971e.f22983v != null && c10.d()) {
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    c1971e.f22980s.p((C) obj2);
                }
                arrayList2.clear();
            }
        }
        try {
            int size2 = c1971e.f22970h.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    ArrayList arrayList3 = c1971e.f22970h;
                    D d9 = (D) ((WeakReference) arrayList3.get(size2)).get();
                    if (d9 == null) {
                        arrayList3.remove(size2);
                    } else {
                        arrayList.addAll(d9.f22863b);
                    }
                } else {
                    int size3 = arrayList.size();
                    while (i11 < size3) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        a((C1990y) obj3, i9, obj, i10);
                    }
                    arrayList.clear();
                    return;
                }
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }
}
