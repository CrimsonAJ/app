package b2;

import H2.u;
import J1.S;
import a.AbstractC0485a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.anilab.android.ui.main.HostFragment;
import com.google.android.material.imageview.ShapeableImageView;
import t1.C1992a;
import t1.C2004m;

/* renamed from: b2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589b extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f10477r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HostFragment f10478s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0589b(E7.d dVar, HostFragment hostFragment) {
        super(2, dVar);
        this.f10478s = hostFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0589b c0589b = new C0589b(dVar, this.f10478s);
        c0589b.f10477r = obj;
        return c0589b;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0589b c0589b = (C0589b) create((u) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0589b.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int i9;
        AbstractC0485a.A(obj);
        u uVar = (u) this.f10477r;
        HostFragment hostFragment = this.f10478s;
        ConstraintLayout layoutContinue = ((S) hostFragment.e0()).f3771y;
        kotlin.jvm.internal.h.d(layoutContinue, "layoutContinue");
        if (uVar != null) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        layoutContinue.setVisibility(i9);
        if (uVar != null) {
            S s9 = (S) hostFragment.e0();
            ConstraintLayout layoutContinue2 = s9.f3771y;
            kotlin.jvm.internal.h.d(layoutContinue2, "layoutContinue");
            layoutContinue2.setVisibility(0);
            s9.f3767A.setText(uVar.f3068d);
            ShapeableImageView imagePoster = s9.f3770x;
            kotlin.jvm.internal.h.d(imagePoster, "imagePoster");
            C2004m a5 = C1992a.a(imagePoster.getContext());
            C1.h hVar = new C1.h(imagePoster.getContext());
            hVar.f1179c = uVar.f3069e;
            hVar.b(imagePoster);
            a5.b(hVar.a());
        }
        return A7.n.f558a;
    }
}
