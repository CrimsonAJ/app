package g2;

import O2.C0288n;
import O2.C0297x;
import O2.C0299z;
import Y7.y0;
import a.AbstractC0485a;
import android.app.Application;
import b8.AbstractC0714M;
import b8.C0718Q;
import com.anilab.android.App;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import y2.C2203a;

/* loaded from: classes.dex */
public final class a0 extends M1.r {

    /* renamed from: f, reason: collision with root package name */
    public final C0297x f17630f;

    /* renamed from: g, reason: collision with root package name */
    public final C0288n f17631g;

    /* renamed from: h, reason: collision with root package name */
    public final C0299z f17632h;

    /* renamed from: i, reason: collision with root package name */
    public final L2.l f17633i;
    public final P2.g j;

    /* renamed from: k, reason: collision with root package name */
    public final O2.W f17634k;

    /* renamed from: l, reason: collision with root package name */
    public final O2.b0 f17635l;

    /* renamed from: m, reason: collision with root package name */
    public final O2.V f17636m;

    /* renamed from: n, reason: collision with root package name */
    public final Application f17637n;

    /* renamed from: o, reason: collision with root package name */
    public final I2.e f17638o;

    /* renamed from: p, reason: collision with root package name */
    public I2.a f17639p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17640q;

    /* renamed from: r, reason: collision with root package name */
    public final C0718Q f17641r;

    /* renamed from: s, reason: collision with root package name */
    public final C0718Q f17642s;

    /* renamed from: t, reason: collision with root package name */
    public final C0718Q f17643t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f17644u;

    /* renamed from: v, reason: collision with root package name */
    public final I2.f f17645v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f17646w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f17647x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f17648y;

    public a0(C0297x getListAnimeEpisodeUseCase, C0288n getAnimeEpisodeUseCase, C0299z getListCommentUseCase, L2.l getLocalAvatarsUseCase, P2.g continueWatchUseCase, O2.W recentlyWatchedUseCase, O2.b0 saveWatchedUseCase, O2.V playerConfigUseCase, Application application, L2.A playerSettingsUseCase, L2.x netCacheUseCase, L2.y ntxUseCase, L2.w malIdUseCase) {
        Object h7;
        boolean z9;
        kotlin.jvm.internal.h.e(getListAnimeEpisodeUseCase, "getListAnimeEpisodeUseCase");
        kotlin.jvm.internal.h.e(getAnimeEpisodeUseCase, "getAnimeEpisodeUseCase");
        kotlin.jvm.internal.h.e(getListCommentUseCase, "getListCommentUseCase");
        kotlin.jvm.internal.h.e(getLocalAvatarsUseCase, "getLocalAvatarsUseCase");
        kotlin.jvm.internal.h.e(continueWatchUseCase, "continueWatchUseCase");
        kotlin.jvm.internal.h.e(recentlyWatchedUseCase, "recentlyWatchedUseCase");
        kotlin.jvm.internal.h.e(saveWatchedUseCase, "saveWatchedUseCase");
        kotlin.jvm.internal.h.e(playerConfigUseCase, "playerConfigUseCase");
        kotlin.jvm.internal.h.e(playerSettingsUseCase, "playerSettingsUseCase");
        kotlin.jvm.internal.h.e(netCacheUseCase, "netCacheUseCase");
        kotlin.jvm.internal.h.e(ntxUseCase, "ntxUseCase");
        kotlin.jvm.internal.h.e(malIdUseCase, "malIdUseCase");
        this.f17630f = getListAnimeEpisodeUseCase;
        this.f17631g = getAnimeEpisodeUseCase;
        this.f17632h = getListCommentUseCase;
        this.f17633i = getLocalAvatarsUseCase;
        this.j = continueWatchUseCase;
        this.f17634k = recentlyWatchedUseCase;
        this.f17635l = saveWatchedUseCase;
        this.f17636m = playerConfigUseCase;
        this.f17637n = application;
        this.f17638o = new I2.e();
        this.f17639p = new I2.a(0L, 0, null, null, null, null, null, 0L, false, false, false, 8191);
        this.f17641r = AbstractC0714M.c(new M1.t(C1212N.f17582a));
        this.f17642s = AbstractC0714M.c(new M1.t(Boolean.FALSE));
        this.f17643t = AbstractC0714M.c(null);
        this.f17644u = App.f13716i.get();
        this.f17645v = playerConfigUseCase.a(null);
        this.f17646w = ntxUseCase.a().f3050b;
        String P8 = g6.o.f17761a.P();
        Object obj = 0;
        kotlin.jvm.internal.d a5 = kotlin.jvm.internal.p.a(Integer.class);
        boolean equals = a5.equals(kotlin.jvm.internal.p.a(Float.TYPE));
        C2203a c2203a = malIdUseCase.f4636a;
        if (equals) {
            obj = (Integer) Float.valueOf(c2203a.f24771a.getFloat(P8, ((Float) obj).floatValue()));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Integer.TYPE))) {
            obj = Integer.valueOf(c2203a.f24771a.getInt(P8, 0));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Long.TYPE))) {
            obj = (Integer) Long.valueOf(c2203a.f24771a.getLong(P8, ((Long) obj).longValue()));
        } else if (a5.equals(kotlin.jvm.internal.p.a(String.class))) {
            Object string = c2203a.f24771a.getString(P8, (String) obj);
            if (string != null) {
                obj = (Integer) string;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        } else if (a5.equals(kotlin.jvm.internal.p.a(Boolean.TYPE))) {
            obj = (Integer) Boolean.valueOf(c2203a.f24771a.getBoolean(P8, ((Boolean) obj).booleanValue()));
        } else {
            String string2 = c2203a.f24771a.getString(P8, "");
            if (string2 != null && string2.length() != 0) {
                try {
                    h7 = c2203a.f24772b.a(Integer.class).a(string2);
                } catch (Throwable th) {
                    h7 = AbstractC0485a.h(th);
                }
                h7 = h7 instanceof A7.i ? null : h7;
                if (h7 != null) {
                    obj = h7;
                }
            }
        }
        if (((Number) obj).intValue() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f17647x = z9;
        this.f17648y = playerSettingsUseCase.a();
        d(false, new C1210L(netCacheUseCase, this, null));
    }

    public final boolean g(long j, int i9) {
        I2.b bVar;
        if (i9 == this.f17639p.f3450g.f3456a.hashCode()) {
            return true;
        }
        Iterator it = this.f17638o.f3471f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            I2.a aVar = (I2.a) it.next();
            if (aVar.j) {
                aVar.f3452i = j;
                Object obj = null;
                if (this.f17640q) {
                    Iterator it2 = aVar.f3449f.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((I2.b) next).f3456a.hashCode() == i9) {
                            obj = next;
                            break;
                        }
                    }
                    bVar = (I2.b) obj;
                } else {
                    Iterator it3 = aVar.f3448e.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (((I2.b) next2).f3456a.hashCode() == i9) {
                            obj = next2;
                            break;
                        }
                    }
                    bVar = (I2.b) obj;
                }
                if (bVar != null) {
                    aVar.f3450g = bVar;
                    m(false, false);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [E7.d, V7.k, java.lang.Object] */
    public final ArrayList h() {
        B7.s sVar;
        int i9;
        List list = this.f17638o.f3471f;
        kotlin.jvm.internal.h.e(list, "<this>");
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = size / 100;
            if (size % 100 == 0) {
                i9 = 0;
            } else {
                i9 = 1;
            }
            ArrayList arrayList = new ArrayList(i10 + i9);
            for (int i11 = 0; i11 >= 0 && i11 < size; i11 += 100) {
                int i12 = size - i11;
                if (100 <= i12) {
                    i12 = 100;
                }
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 < i12; i13++) {
                    arrayList2.add(list.get(i13 + i11));
                }
                arrayList.add(arrayList2);
            }
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator iterator = list.iterator();
        kotlin.jvm.internal.h.e(iterator, "iterator");
        if (!iterator.hasNext()) {
            sVar = B7.s.f1134a;
        } else {
            B7.E e8 = new B7.E(iterator, null);
            ?? obj = new Object();
            obj.f7837d = e8.create(obj, obj);
            sVar = obj;
        }
        while (sVar.hasNext()) {
            arrayList3.add((List) sVar.next());
        }
        return arrayList3;
    }

    public final boolean i() {
        I2.e eVar = this.f17638o;
        Iterator it = eVar.f3471f.iterator();
        int i9 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((I2.a) it.next()).j) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 >= B7.l.a0(eVar.f3471f)) {
            return false;
        }
        return true;
    }

    public final H2.u j(long j, long j4) {
        long j9;
        int i9 = 100;
        if (j < j4) {
            i9 = (int) ((100 * j) / j4);
        }
        int i10 = i9;
        if (j >= j4) {
            j9 = j4;
        } else {
            j9 = j;
        }
        I2.e eVar = this.f17638o;
        return new H2.u(eVar.f3466a, this.f17639p.f3444a, j9, eVar.f3468c, eVar.f3470e, i10, eVar.f3467b, eVar.f3469d);
    }

    public final void k(int i9, long j, long j4, String name, String poster, List allNames) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(poster, "poster");
        kotlin.jvm.internal.h.e(allNames, "allNames");
        d(false, new C1217T(this, j, name, poster, i9, allNames, j4, null));
        d(false, new C1218U(this, j, null));
    }

    public final void l(long j, boolean z9) {
        List list = this.f17638o.f3471f;
        int i9 = 0;
        for (Object obj : list) {
            int i10 = i9 + 1;
            if (i9 >= 0) {
                I2.a aVar = (I2.a) obj;
                if (aVar.f3444a == this.f17639p.f3444a) {
                    aVar.f3452i = j;
                    aVar.f3454l = z9;
                }
                if (aVar.j && i9 < B7.l.a0(list)) {
                    aVar.j = false;
                    ((I2.a) list.get(i10)).j = true;
                    m(true, true);
                    return;
                }
                i9 = i10;
            } else {
                B7.l.e0();
                throw null;
            }
        }
    }

    public final y0 m(boolean z9, boolean z10) {
        return d(true, new C1220W(z9, z10, this, null));
    }
}
