package j2;

import A7.n;
import M1.D;
import M1.t;
import O7.p;
import a.AbstractC0485a;
import co.notix.R;
import com.anilab.android.ui.activity.MainActivity;
import com.anilab.android.ui.register.RegisterFragment;
import i0.AbstractActivityC1369y;

/* renamed from: j2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1436c extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f19201r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RegisterFragment f19202s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1436c(E7.d dVar, RegisterFragment registerFragment) {
        super(2, dVar);
        this.f19202s = registerFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1436c c1436c = new C1436c(dVar, this.f19202s);
        c1436c.f19201r = obj;
        return c1436c;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1436c c1436c = (C1436c) create((t) obj, (E7.d) obj2);
        n nVar = n.f558a;
        c1436c.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int ordinal;
        MainActivity mainActivity;
        AbstractC0485a.A(obj);
        Object a5 = ((t) this.f19201r).a();
        if (a5 != null && (ordinal = ((g) a5).ordinal()) != 0) {
            RegisterFragment registerFragment = this.f19202s;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    AbstractActivityC1369y k5 = registerFragment.k();
                    if (k5 instanceof MainActivity) {
                        mainActivity = (MainActivity) k5;
                    } else {
                        mainActivity = null;
                    }
                    if (mainActivity != null) {
                        mainActivity.T();
                    }
                    registerFragment.i0(R.id.registerToCongratulation, null);
                } else {
                    throw new RuntimeException();
                }
            } else {
                registerFragment.o0(new D(R.string.message_password_not_match));
            }
        }
        return n.f558a;
    }
}
