package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.ListGenreResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.List;
import v2.C2102b;
import y2.C2203a;

/* renamed from: C2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055a extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1320r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0057c f1321s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0055a(C0057c c0057c, E7.d dVar) {
        super(2, dVar);
        this.f1321s = c0057c;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0055a(this.f1321s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0055a) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        List list;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1320r;
        C0057c c0057c = this.f1321s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            B2.b bVar = c0057c.f1329a;
            String n7 = AbstractC0953k1.n(O4.h.t(c0057c.f1330b), g6.o.f17761a.I());
            this.f1320r = 1;
            obj = bVar.u(n7, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        ListGenreResponse listGenreResponse = (ListGenreResponse) ((ApiResponse) obj).f14005c;
        C2203a c2203a = c0057c.f1330b;
        String Y = g6.o.f17761a.Y();
        SharedPreferences.Editor edit = c2203a.f24771a.edit();
        edit.putString(Y, c2203a.f24772b.a(ListGenreResponse.class).d(listGenreResponse));
        edit.apply();
        if (listGenreResponse != null) {
            list = listGenreResponse.f14189a;
        } else {
            list = null;
        }
        if (list == null) {
            list = B7.t.f1135a;
        }
        return new C2102b(list);
    }
}
