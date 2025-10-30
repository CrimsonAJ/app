package c2;

import J1.Y;
import a.AbstractC0485a;
import android.widget.TextView;

/* renamed from: c2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759e extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f11612r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0763i f11613s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0759e(C0763i c0763i, E7.d dVar) {
        super(2, dVar);
        this.f11613s = c0763i;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0759e c0759e = new C0759e(this.f11613s, dVar);
        c0759e.f11612r = obj;
        return c0759e;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0759e c0759e = (C0759e) create((String) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0759e.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int i9;
        AbstractC0485a.A(obj);
        String str = (String) this.f11612r;
        C0763i c0763i = this.f11613s;
        TextView labelSavedTo = ((Y) c0763i.e0()).f3811w;
        kotlin.jvm.internal.h.d(labelSavedTo, "labelSavedTo");
        int i10 = 8;
        if (!W7.d.U(str)) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        labelSavedTo.setVisibility(i9);
        TextView textPath = ((Y) c0763i.e0()).f3813y;
        kotlin.jvm.internal.h.d(textPath, "textPath");
        if (!W7.d.U(str)) {
            i10 = 0;
        }
        textPath.setVisibility(i10);
        ((Y) c0763i.e0()).f3813y.setText(str);
        return A7.n.f558a;
    }
}
