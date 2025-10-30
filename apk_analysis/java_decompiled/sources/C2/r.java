package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import com.anilab.data.model.response.ApiResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.List;
import v2.C2102b;
import y2.C2203a;

/* loaded from: classes.dex */
public final class r extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1398r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f1399s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(E e8, E7.d dVar) {
        super(2, dVar);
        this.f1399s = e8;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new r(this.f1399s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1398r;
        E e8 = this.f1399s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            B2.b bVar = e8.f1268a;
            String n7 = AbstractC0953k1.n(O4.h.t(e8.f1269b), g6.o.f17761a.L());
            this.f1398r = 1;
            obj = bVar.a(n7, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Object obj2 = (List) ((ApiResponse) obj).f14005c;
        try {
            C2203a c2203a = e8.f1269b;
            String a02 = g6.o.f17761a.a0();
            SharedPreferences.Editor edit = c2203a.f24771a.edit();
            if (obj2 instanceof String) {
                edit.putString(a02, (String) obj2);
            } else if (obj2 instanceof Float) {
                edit.putFloat(a02, ((Number) obj2).floatValue());
            } else if (obj2 instanceof Integer) {
                edit.putInt(a02, ((Number) obj2).intValue());
            } else if (obj2 instanceof Long) {
                edit.putLong(a02, ((Number) obj2).longValue());
            } else if (obj2 instanceof Boolean) {
                edit.putBoolean(a02, ((Boolean) obj2).booleanValue());
            } else {
                edit.putString(a02, c2203a.f24772b.a(List.class).d(obj2));
            }
            edit.apply();
        } catch (Exception unused) {
        }
        if (obj2 == null) {
            obj2 = B7.t.f1135a;
        }
        return new C2102b(obj2);
    }
}
