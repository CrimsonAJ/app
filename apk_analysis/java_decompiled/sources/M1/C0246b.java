package M1;

import a.AbstractC0485a;
import com.anilab.android.ui.activity.MainActivity;

/* renamed from: M1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246b extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4706r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4707s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0246b(E7.d dVar, MainActivity mainActivity) {
        super(2, dVar);
        this.f4707s = mainActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0246b c0246b = new C0246b(dVar, this.f4707s);
        c0246b.f4706r = obj;
        return c0246b;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0246b c0246b = (C0246b) create((E) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0246b.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        E e8 = (E) this.f4706r;
        MainActivity mainActivity = this.f4707s;
        int i9 = MainActivity.f13724k0;
        mainActivity.Z(e8);
        return A7.n.f558a;
    }
}
