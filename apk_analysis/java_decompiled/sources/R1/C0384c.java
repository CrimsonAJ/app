package R1;

import J1.AbstractC0176g;
import a.AbstractC0485a;
import com.anilab.android.ui.download.DownloadFragment;
import com.google.android.material.tabs.TabLayout;

/* renamed from: R1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384c extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f6521r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DownloadFragment f6522s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0384c(E7.d dVar, DownloadFragment downloadFragment) {
        super(2, dVar);
        this.f6522s = downloadFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0384c c0384c = new C0384c(dVar, this.f6522s);
        c0384c.f6521r = ((Boolean) obj).booleanValue();
        return c0384c;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C0384c c0384c = (C0384c) create(bool, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0384c.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int i9;
        AbstractC0485a.A(obj);
        boolean z9 = this.f6521r;
        TabLayout tabLayoutDub = ((AbstractC0176g) this.f6522s.m0()).f3931E;
        kotlin.jvm.internal.h.d(tabLayoutDub, "tabLayoutDub");
        if (!z9) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        tabLayoutDub.setVisibility(i9);
        return A7.n.f558a;
    }
}
