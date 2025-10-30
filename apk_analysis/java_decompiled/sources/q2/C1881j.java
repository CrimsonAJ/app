package q2;

import J1.E0;
import a.AbstractC0485a;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import com.anilab.android.ui.update.UpdateFragment;
import com.anilab.domain.model.LatestVersion;
import com.google.android.material.button.MaterialButton;

/* renamed from: q2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1881j extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f22255r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UpdateFragment f22256s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881j(E7.d dVar, UpdateFragment updateFragment) {
        super(2, dVar);
        this.f22256s = updateFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1881j c1881j = new C1881j(dVar, this.f22256s);
        c1881j.f22255r = obj;
        return c1881j;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1881j c1881j = (C1881j) create((LatestVersion) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1881j.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Spanned fromHtml;
        Spanned fromHtml2;
        AbstractC0485a.A(obj);
        LatestVersion latestVersion = (LatestVersion) this.f22255r;
        boolean U8 = W7.d.U(latestVersion.f14409a);
        A7.n nVar = A7.n.f558a;
        if (!U8) {
            UpdateFragment updateFragment = this.f22256s;
            E0 e02 = (E0) updateFragment.e0();
            int i9 = Build.VERSION.SDK_INT;
            String str = latestVersion.f14411c;
            if (i9 >= 24) {
                fromHtml = L.d.b(str);
            } else {
                fromHtml = Html.fromHtml(str);
            }
            String obj2 = fromHtml.toString();
            if (i9 >= 24) {
                fromHtml2 = L.d.b(obj2);
            } else {
                fromHtml2 = Html.fromHtml(obj2);
            }
            e02.f3660C.setText(fromHtml2);
            if (latestVersion.f14413e) {
                MaterialButton buttonSkipVer = ((E0) updateFragment.e0()).f3665w;
                kotlin.jvm.internal.h.d(buttonSkipVer, "buttonSkipVer");
                buttonSkipVer.setVisibility(8);
            }
        }
        return nVar;
    }
}
