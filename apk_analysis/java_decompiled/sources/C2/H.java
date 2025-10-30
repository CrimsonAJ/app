package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.AvatarListResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.List;
import v2.C2102b;
import y2.C2203a;

/* loaded from: classes.dex */
public final class H extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1275r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ O f1276s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(O o9, E7.d dVar) {
        super(2, dVar);
        this.f1276s = o9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new H(this.f1276s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        List list;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1275r;
        O o9 = this.f1276s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            B2.b bVar = o9.f1286b;
            String n7 = AbstractC0953k1.n(O4.h.t(o9.f1287c), g6.o.f17761a.m());
            this.f1275r = 1;
            obj = bVar.I(n7, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        AvatarListResponse avatarListResponse = (AvatarListResponse) ((ApiResponse) obj).f14005c;
        C2203a c2203a = o9.f1287c;
        String l9 = g6.o.f17761a.l();
        SharedPreferences.Editor edit = c2203a.f24771a.edit();
        edit.putString(l9, c2203a.f24772b.a(AvatarListResponse.class).d(avatarListResponse));
        edit.apply();
        if (avatarListResponse != null) {
            list = avatarListResponse.f14010a;
        } else {
            list = null;
        }
        if (list == null) {
            list = B7.t.f1135a;
        }
        return new C2102b(list);
    }
}
