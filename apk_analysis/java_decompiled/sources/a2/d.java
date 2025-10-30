package a2;

import A7.n;
import J1.AbstractC0180i;
import O7.p;
import a.AbstractC0485a;
import com.anilab.android.ui.logout.BottomSheetConfirmLogout;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* loaded from: classes.dex */
public final class d extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f9087r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BottomSheetConfirmLogout f9088s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BottomSheetConfirmLogout bottomSheetConfirmLogout, E7.d dVar) {
        super(2, dVar);
        this.f9088s = bottomSheetConfirmLogout;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        d dVar2 = new d(this.f9088s, dVar);
        dVar2.f9087r = ((Boolean) obj).booleanValue();
        return dVar2;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        d dVar = (d) create(bool, (E7.d) obj2);
        n nVar = n.f558a;
        dVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int i9;
        AbstractC0485a.A(obj);
        boolean z9 = this.f9087r;
        LinearProgressIndicator loading = ((AbstractC0180i) this.f9088s.m0()).f3960x;
        kotlin.jvm.internal.h.d(loading, "loading");
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        loading.setVisibility(i9);
        return n.f558a;
    }
}
