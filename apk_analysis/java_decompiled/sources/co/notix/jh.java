package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jh extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public kh f12551a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12552b;

    /* renamed from: c, reason: collision with root package name */
    public g8.a f12553c;

    /* renamed from: d, reason: collision with root package name */
    public int f12554d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f12555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yh f12556f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kh f12557g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f12558h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh(yh yhVar, kh khVar, Object obj, E7.d dVar) {
        super(2, dVar);
        this.f12556f = yhVar;
        this.f12557g = khVar;
        this.f12558h = obj;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        jh jhVar = new jh(this.f12556f, this.f12557g, this.f12558h, dVar);
        jhVar.f12555e = obj;
        return jhVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((jh) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object h7;
        yh yhVar;
        kh khVar;
        g8.a aVar;
        JSONObject jSONObject;
        F7.a aVar2 = F7.a.f2587a;
        int i9 = this.f12554d;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    aVar = this.f12553c;
                    h7 = this.f12552b;
                    khVar = this.f12551a;
                    yhVar = (yh) this.f12555e;
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                yhVar = this.f12556f;
                kh khVar2 = this.f12557g;
                h7 = this.f12558h;
                g8.a aVar3 = yhVar.f13612f;
                this.f12555e = yhVar;
                this.f12551a = khVar2;
                this.f12552b = h7;
                this.f12553c = aVar3;
                this.f12554d = 1;
                if (aVar3.d(this) == aVar2) {
                    return aVar2;
                }
                khVar = khVar2;
                aVar = aVar3;
            }
            try {
                String a5 = bi.a((File) yhVar.f13611e.getValue());
                if (a5 != null) {
                    jSONObject = new JSONObject(a5);
                } else {
                    jSONObject = new JSONObject();
                }
                String jSONObject2 = jSONObject.put(khVar.f12610a, khVar.f12611b.invoke(h7)).toString();
                kotlin.jvm.internal.h.d(jSONObject2, "newJson.toString()");
                bi.a((File) yhVar.f13611e.getValue(), jSONObject2);
                aVar.a(null);
            } catch (Throwable th) {
                aVar.a(null);
                throw th;
            }
        } catch (Throwable th2) {
            h7 = AbstractC0485a.h(th2);
        }
        yh yhVar2 = this.f12556f;
        kh khVar3 = this.f12557g;
        Throwable a9 = A7.j.a(h7);
        if (a9 == null) {
            return h7;
        }
        md.f12779a.a("ObjectStorage: couldn't save " + yhVar2.f13610d + ' ' + khVar3.f12610a, a9);
        return null;
    }
}
