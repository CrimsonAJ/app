package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ih extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public kh f12467a;

    /* renamed from: b, reason: collision with root package name */
    public g8.a f12468b;

    /* renamed from: c, reason: collision with root package name */
    public int f12469c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yh f12471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kh f12472f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(yh yhVar, kh khVar, E7.d dVar) {
        super(2, dVar);
        this.f12471e = yhVar;
        this.f12472f = khVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        ih ihVar = new ih(this.f12471e, this.f12472f, dVar);
        ihVar.f12470d = obj;
        return ihVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ih) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object h7;
        yh yhVar;
        g8.a aVar;
        kh khVar;
        JSONObject jSONObject;
        F7.a aVar2 = F7.a.f2587a;
        int i9 = this.f12469c;
        try {
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        try {
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        AbstractC0485a.A(obj);
                        return null;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.f12468b;
                khVar = this.f12467a;
                yhVar = (yh) this.f12470d;
                AbstractC0485a.A(obj);
            } else {
                AbstractC0485a.A(obj);
                yhVar = this.f12471e;
                kh khVar2 = this.f12472f;
                aVar = yhVar.f13612f;
                this.f12470d = yhVar;
                this.f12467a = khVar2;
                this.f12468b = aVar;
                this.f12469c = 1;
                if (aVar.d(this) != aVar2) {
                    khVar = khVar2;
                }
                return aVar2;
            }
            String a5 = bi.a((File) yhVar.f13611e.getValue());
            if (a5 != null) {
                jSONObject = new JSONObject(a5);
            } else {
                jSONObject = new JSONObject();
            }
            h7 = khVar.f12612c.invoke(jSONObject.opt(khVar.f12610a));
            yh yhVar2 = this.f12471e;
            kh khVar3 = this.f12472f;
            Throwable a9 = A7.j.a(h7);
            if (a9 == null) {
                return h7;
            }
            md.f12779a.a("ObjectStorage: couldn't read " + yhVar2.f13610d + ' ' + khVar3.f12610a, a9);
            this.f12470d = null;
            this.f12467a = null;
            this.f12468b = null;
            this.f12469c = 2;
            if (khVar3.a(this) != aVar2) {
                return null;
            }
            return aVar2;
        } finally {
            aVar.a(null);
        }
    }
}
