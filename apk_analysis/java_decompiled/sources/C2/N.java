package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.VersionSettingsResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import u2.C2067a;
import v2.C2102b;
import y2.C2203a;

/* loaded from: classes.dex */
public final class N extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1282r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f1283s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ O f1284t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(boolean z9, O o9, E7.d dVar) {
        super(2, dVar);
        this.f1283s = z9;
        this.f1284t = o9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new N(this.f1283s, this.f1284t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1282r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            if (this.f1283s) {
                w2.d.f24036c = null;
            }
            w2.d dVar = w2.d.f24035b;
            O o9 = this.f1284t;
            o7.y yVar = o9.f1285a;
            C2203a c2203a = o9.f1287c;
            B2.c cVar = w2.d.f24036c;
            if (cVar == null) {
                synchronized (dVar) {
                    cVar = w2.d.f24036c;
                    if (cVar == null) {
                        B2.c a5 = w2.d.a(yVar, c2203a);
                        w2.d.f24036c = a5;
                        cVar = a5;
                    }
                }
            }
            String n7 = AbstractC0953k1.n(O4.h.t(this.f1284t.f1287c), g6.o.f17761a.Y0());
            this.f1282r = 1;
            obj = cVar.a(n7, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        VersionSettingsResponse versionSettingsResponse = (VersionSettingsResponse) ((ApiResponse) obj).f14005c;
        if (versionSettingsResponse != null) {
            return new C2102b(versionSettingsResponse);
        }
        throw new C2067a((String) null, 3);
    }
}
