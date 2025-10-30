package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import com.anilab.data.model.request.DeleteContinueWatchRequest;
import com.anilab.data.model.response.ContinueWatchRowResponse;
import com.anilab.data.model.response.HomeResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o7.AbstractC1708D;
import p7.C1865c;
import v2.C2102b;
import y2.C2203a;
import z8.C2266o;

/* loaded from: classes.dex */
public final class d0 extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1340r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f1341s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f1342t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, long j, E7.d dVar) {
        super(2, dVar);
        this.f1341s = g0Var;
        this.f1342t = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new d0(this.f1341s, this.f1342t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List list;
        Object h7;
        long j = this.f1342t;
        g0 g0Var = this.f1341s;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1340r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            try {
                C2203a c2203a = g0Var.f1360b;
                String string = c2203a.f24771a.getString(g6.o.f17761a.a0(), "");
                C1865c f9 = AbstractC1708D.f(HomeResponse.class);
                B7.t tVar = B7.t.f1135a;
                ArrayList arrayList = null;
                Iterable iterable = tVar;
                if (string != null) {
                    iterable = tVar;
                    if (string.length() != 0) {
                        try {
                            h7 = (List) c2203a.f24772b.b(f9, p7.e.f22206a, null).a(string);
                        } catch (Throwable th) {
                            h7 = AbstractC0485a.h(th);
                        }
                        if (h7 instanceof A7.i) {
                            h7 = null;
                        }
                        List list2 = (List) h7;
                        iterable = list2 == null ? tVar : list2;
                    }
                }
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        HomeResponse homeResponse = (HomeResponse) obj2;
                        Integer num = homeResponse.f14157c;
                        if (num != null && num.intValue() == 4 && (list = homeResponse.f14161g) != null && !list.isEmpty()) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                HomeResponse homeResponse2 = (HomeResponse) obj2;
                if (homeResponse2 != null) {
                    List list3 = homeResponse2.f14161g;
                    if (list3 != null) {
                        arrayList = new ArrayList();
                        for (Object obj3 : list3) {
                            Long l9 = ((ContinueWatchRowResponse) obj3).f14078c;
                            if (l9 != null && l9.longValue() == j) {
                            }
                            arrayList.add(obj3);
                        }
                    }
                    homeResponse2.f14161g = arrayList;
                }
                C2203a c2203a2 = g0Var.f1360b;
                String a02 = g6.o.f17761a.a0();
                SharedPreferences.Editor edit = c2203a2.f24771a.edit();
                if (iterable instanceof String) {
                    edit.putString(a02, (String) iterable);
                } else if (iterable instanceof Float) {
                    edit.putFloat(a02, ((Number) iterable).floatValue());
                } else if (iterable instanceof Integer) {
                    edit.putInt(a02, ((Number) iterable).intValue());
                } else if (iterable instanceof Long) {
                    edit.putLong(a02, ((Number) iterable).longValue());
                } else if (iterable instanceof Boolean) {
                    edit.putBoolean(a02, ((Boolean) iterable).booleanValue());
                } else {
                    edit.putString(a02, c2203a2.f24772b.a(List.class).d(iterable));
                }
                edit.apply();
            } catch (Exception unused) {
            }
            B2.b bVar = g0Var.f1359a;
            String n7 = AbstractC0953k1.n(O4.h.t(g0Var.f1360b), g6.o.f17761a.L0());
            DeleteContinueWatchRequest deleteContinueWatchRequest = new DeleteContinueWatchRequest(j);
            this.f1340r = 1;
            obj = bVar.O(n7, deleteContinueWatchRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        z8.O o9 = (z8.O) obj;
        if (o9.f25587a.g()) {
            return new C2102b(A7.n.f558a);
        }
        throw new C2266o(o9);
    }
}
