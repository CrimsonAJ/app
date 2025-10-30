package g2;

import J1.AbstractC0165c;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: g2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1237n extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f17679r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f17680s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC0165c f17681t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1237n(boolean z9, AbstractC0165c abstractC0165c, E7.d dVar) {
        super(2, dVar);
        this.f17680s = z9;
        this.f17681t = abstractC0165c;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1237n(this.f17680s, this.f17681t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1237n) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        boolean z9;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17679r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            if (this.f17680s) {
                this.f17679r = 1;
                if (Y7.B.g(100L, this) == aVar) {
                    return aVar;
                }
            }
        }
        AbstractC0165c abstractC0165c = this.f17681t;
        FrameLayout layoutSettings = abstractC0165c.f3851L;
        kotlin.jvm.internal.h.d(layoutSettings, "layoutSettings");
        layoutSettings.setVisibility(8);
        FrameLayout layoutSettings2 = abstractC0165c.f3851L;
        kotlin.jvm.internal.h.d(layoutSettings2, "layoutSettings");
        int i10 = 0;
        while (true) {
            if (i10 < layoutSettings2.getChildCount()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                int i11 = i10 + 1;
                View childAt = layoutSettings2.getChildAt(i10);
                if (childAt != null) {
                    childAt.setVisibility(8);
                    i10 = i11;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                return A7.n.f558a;
            }
        }
    }
}
