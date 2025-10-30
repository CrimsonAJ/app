package X1;

import Y7.InterfaceC0484z;
import com.anilab.android.ui.home.HomeFragment;

/* renamed from: X1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436e extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f8261r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f8262s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0436e(E7.d dVar, HomeFragment homeFragment) {
        super(2, dVar);
        this.f8262s = homeFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0436e(dVar, this.f8262s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((C0436e) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
        return F7.a.f2587a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:5:0x0023). Please report as a decompilation issue!!! */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r5.f8261r
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            a.AbstractC0485a.A(r6)
            goto L23
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            a.AbstractC0485a.A(r6)
        L18:
            r5.f8261r = r2
            r3 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r6 = Y7.B.g(r3, r5)
            if (r6 != r0) goto L23
            return r0
        L23:
            com.anilab.android.ui.home.HomeFragment r6 = r5.f8262s
            W.g r1 = r6.e0()
            J1.P r1 = (J1.P) r1
            androidx.viewpager2.widget.ViewPager2 r1 = r1.f3747B
            int r1 = r1.getCurrentItem()
            X1.H r3 = r6.f13774H0
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r3.f8246e
            int r3 = r3.size()
            int r3 = r3 - r2
            if (r1 >= r3) goto L18
            W.g r6 = r6.e0()
            J1.P r6 = (J1.P) r6
            int r1 = r1 + 1
            androidx.viewpager2.widget.ViewPager2 r6 = r6.f3747B
            r6.b(r1, r2)
            goto L18
        L4c:
            java.lang.String r6 = "sliderAdapter"
            kotlin.jvm.internal.h.h(r6)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.C0436e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
