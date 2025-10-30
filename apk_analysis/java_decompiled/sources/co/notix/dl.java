package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.util.Set;

/* loaded from: classes.dex */
public final class dl extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12111a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ el f12113c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(el elVar, String str, E7.d dVar) {
        super(2, dVar);
        this.f12113c = elVar;
        this.f12114d = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        dl dlVar = new dl(this.f12113c, this.f12114d, dVar);
        dlVar.f12112b = obj;
        return dlVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((dl) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12111a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f12112b;
        dh dhVar = this.f12113c.f12184a;
        Cdo cdo = new Cdo(this.f12114d);
        cl clVar = new cl(interfaceC0484z, this.f12113c);
        no noVar = no.f12835e;
        Set set = io.f12491a;
        this.f12111a = 1;
        Object a5 = ((gh) dhVar).a(2, "/inapp/ewant", false, cdo, clVar, noVar, set, this);
        if (a5 == aVar) {
            return aVar;
        }
        return a5;
    }
}
