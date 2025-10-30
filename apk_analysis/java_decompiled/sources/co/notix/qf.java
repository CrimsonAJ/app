package co.notix;

import a.AbstractC0485a;
import co.notix.appopen.AppOpenData;
import co.notix.appopen.AppOpenLoader;

/* loaded from: classes.dex */
public final class qf extends G7.j implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public int f13039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppOpenLoader f13040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O7.l f13042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf f13043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ O7.a f13044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O7.a f13045g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(AppOpenLoader appOpenLoader, long j, O7.l lVar, rf rfVar, O7.a aVar, O7.a aVar2, E7.d dVar) {
        super(1, dVar);
        this.f13040b = appOpenLoader;
        this.f13041c = j;
        this.f13042d = lVar;
        this.f13043e = rfVar;
        this.f13044f = aVar;
        this.f13045g = aVar2;
    }

    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new qf(this.f13040b, this.f13041c, this.f13042d, this.f13043e, this.f13044f, this.f13045g, dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        return ((qf) create((E7.d) obj)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13039a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            AppOpenLoader appOpenLoader = this.f13040b;
            long j = this.f13041c;
            this.f13039a = 1;
            obj = appOpenLoader.awaitNext(j, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        AppOpenData appOpenData = (AppOpenData) obj;
        A7.n nVar = A7.n.f558a;
        if (appOpenData == null) {
            O7.l lVar = this.f13042d;
            if (lVar != null) {
                lVar.invoke(new IllegalStateException("Failed to load an ad"));
            }
            return nVar;
        }
        this.f13043e.a(appOpenData, this.f13044f, this.f13045g, this.f13042d);
        return nVar;
    }
}
