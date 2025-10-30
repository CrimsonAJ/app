package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class Q extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4488r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ S f4489s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f4490t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s9, int i9, E7.d dVar) {
        super(2, dVar);
        this.f4489s = s9;
        this.f4490t = i9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new Q(this.f4489s, this.f4490t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4488r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f4488r = 1;
            if (Y7.B.g(200L, this) == aVar) {
                return aVar;
            }
        }
        try {
            S s9 = this.f4489s;
            FileOutputStream openFileOutput = s9.j.openFileOutput(s9.f4509w, 0);
            try {
                openFileOutput.write(this.f4490t);
                openFileOutput.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        return A7.n.f558a;
    }
}
