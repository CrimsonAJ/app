package t1;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.graphics.Bitmap;
import java.util.ArrayList;
import x1.C2167k;

/* renamed from: t1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2002k extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f23090r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1.i f23091s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C2004m f23092t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D1.h f23093u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1994c f23094v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Bitmap f23095w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2002k(C1.i iVar, C2004m c2004m, D1.h hVar, C1994c c1994c, Bitmap bitmap, E7.d dVar) {
        super(2, dVar);
        this.f23091s = iVar;
        this.f23092t = c2004m;
        this.f23093u = hVar;
        this.f23094v = c1994c;
        this.f23095w = bitmap;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C2002k(this.f23091s, this.f23092t, this.f23093u, this.f23094v, this.f23095w, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2002k) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        boolean z9;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f23090r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        ArrayList arrayList = this.f23092t.f23104h;
        if (this.f23095w != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        C1.i iVar = this.f23091s;
        C2167k c2167k = new C2167k(iVar, arrayList, 0, iVar, this.f23093u, this.f23094v, z9);
        this.f23090r = 1;
        Object b9 = c2167k.b(iVar, this);
        if (b9 == aVar) {
            return aVar;
        }
        return b9;
    }
}
