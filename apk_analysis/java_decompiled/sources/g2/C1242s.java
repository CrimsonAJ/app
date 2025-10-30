package g2;

import B6.u0;
import J1.AbstractC0165c;
import a.AbstractC0485a;
import android.widget.TextView;
import co.notix.R;
import com.anilab.android.ui.player.PlayerActivity;
import com.google.android.material.imageview.ShapeableImageView;
import t1.C1992a;
import t1.C2004m;

/* renamed from: g2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1242s extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17690r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17691s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242s(E7.d dVar, PlayerActivity playerActivity) {
        super(2, dVar);
        this.f17691s = playerActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1242s c1242s = new C1242s(dVar, this.f17691s);
        c1242s.f17690r = obj;
        return c1242s;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1242s c1242s = (C1242s) create((H2.e) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1242s.invokeSuspend(nVar);
        return nVar;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List, java.lang.Object] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        H2.e eVar = (H2.e) this.f17690r;
        PlayerActivity playerActivity = this.f17691s;
        AbstractC0165c abstractC0165c = playerActivity.f13799D;
        if (abstractC0165c != null) {
            TextView textView = abstractC0165c.f3863X;
            TextView textView2 = abstractC0165c.f3862W;
            ShapeableImageView imageAvatarComment = abstractC0165c.f3846F;
            if (eVar != null) {
                ?? r82 = eVar.f3008e;
                if (!r82.isEmpty()) {
                    H2.c cVar = (H2.c) B7.k.p0(r82);
                    kotlin.jvm.internal.h.d(imageAvatarComment, "imageAvatarComment");
                    imageAvatarComment.setVisibility(0);
                    String str = cVar.f2995k;
                    C2004m a5 = C1992a.a(imageAvatarComment.getContext());
                    C1.h hVar = new C1.h(imageAvatarComment.getContext());
                    hVar.f1179c = str;
                    hVar.b(imageAvatarComment);
                    a5.b(hVar.a());
                    textView2.setText(cVar.f2989d);
                    textView.setText(playerActivity.getString(R.string.format_player_comment, u0.r(eVar.f3007d)));
                    return A7.n.f558a;
                }
            }
            kotlin.jvm.internal.h.d(imageAvatarComment, "imageAvatarComment");
            imageAvatarComment.setVisibility(8);
            textView2.setText(playerActivity.getString(R.string.label_no_comments));
            textView.setText(playerActivity.getString(R.string.format_player_comment, "0"));
            return A7.n.f558a;
        }
        kotlin.jvm.internal.h.h("binding");
        throw null;
    }
}
