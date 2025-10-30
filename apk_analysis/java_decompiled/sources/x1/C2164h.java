package x1;

import A7.n;
import C1.m;
import O7.p;
import Y7.InterfaceC0484z;
import java.util.List;
import t1.C1994c;

/* renamed from: x1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2164h extends G7.j implements p {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ List f24530A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C1994c f24531B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C1.i f24532C;

    /* renamed from: r, reason: collision with root package name */
    public List f24533r;

    /* renamed from: s, reason: collision with root package name */
    public m f24534s;

    /* renamed from: t, reason: collision with root package name */
    public int f24535t;

    /* renamed from: u, reason: collision with root package name */
    public int f24536u;

    /* renamed from: v, reason: collision with root package name */
    public int f24537v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f24538w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C2165i f24539x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C2157a f24540y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m f24541z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2164h(C2165i c2165i, C2157a c2157a, m mVar, List list, C1994c c1994c, C1.i iVar, E7.d dVar) {
        super(2, dVar);
        this.f24539x = c2165i;
        this.f24540y = c2157a;
        this.f24541z = mVar;
        this.f24530A = list;
        this.f24531B = c1994c;
        this.f24532C = iVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C2164h c2164h = new C2164h(this.f24539x, this.f24540y, this.f24541z, this.f24530A, this.f24531B, this.f24532C, dVar);
        c2164h.f24538w = obj;
        return c2164h;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2164h) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (B7.j.b0(H1.f.f2949a, r7) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0084 -> B:5:0x0087). Please report as a decompilation issue!!! */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r12.f24537v
            x1.a r2 = r12.f24540y
            t1.c r3 = r12.f24531B
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 != r4) goto L1e
            int r1 = r12.f24536u
            int r5 = r12.f24535t
            C1.m r6 = r12.f24534s
            java.util.List r7 = r12.f24533r
            java.lang.Object r8 = r12.f24538w
            Y7.z r8 = (Y7.InterfaceC0484z) r8
            a.AbstractC0485a.A(r13)
            goto L87
        L1e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L26:
            a.AbstractC0485a.A(r13)
            java.lang.Object r13 = r12.f24538w
            Y7.z r13 = (Y7.InterfaceC0484z) r13
            android.graphics.drawable.Drawable r1 = r2.f24473a
            boolean r5 = r1 instanceof android.graphics.drawable.BitmapDrawable
            C1.m r6 = r12.f24541z
            if (r5 == 0) goto L4d
            r5 = r1
            android.graphics.drawable.BitmapDrawable r5 = (android.graphics.drawable.BitmapDrawable) r5
            android.graphics.Bitmap r5 = r5.getBitmap()
            android.graphics.Bitmap$Config r7 = r5.getConfig()
            if (r7 != 0) goto L44
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
        L44:
            android.graphics.Bitmap$Config[] r8 = H1.f.f2949a
            boolean r7 = B7.j.b0(r8, r7)
            if (r7 == 0) goto L4d
            goto L59
        L4d:
            android.graphics.Bitmap$Config r5 = r6.f1219b
            D1.h r7 = r6.f1221d
            D1.g r8 = r6.f1222e
            boolean r9 = r6.f1223f
            android.graphics.Bitmap r5 = l6.AbstractC1570b.b(r1, r5, r7, r8, r9)
        L59:
            r3.getClass()
            java.util.List r1 = r12.f24530A
            int r7 = r1.size()
            r8 = 0
            r11 = r8
            r8 = r13
            r13 = r5
            r5 = r11
            r11 = r7
            r7 = r1
            r1 = r11
        L6a:
            if (r5 >= r1) goto L92
            java.lang.Object r9 = r7.get(r5)
            F1.c r9 = (F1.c) r9
            D1.h r10 = r6.f1221d
            r12.f24538w = r8
            r12.f24533r = r7
            r12.f24534s = r6
            r12.f24535t = r5
            r12.f24536u = r1
            r12.f24537v = r4
            android.graphics.Bitmap r13 = r9.a(r13, r10)
            if (r13 != r0) goto L87
            return r0
        L87:
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            E7.i r9 = r8.g()
            Y7.B.h(r9)
            int r5 = r5 + r4
            goto L6a
        L92:
            r3.getClass()
            C1.i r0 = r12.f24532C
            android.content.Context r0 = r0.f1191a
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>(r0, r13)
            x1.a r13 = new x1.a
            boolean r0 = r2.f24474b
            u1.e r3 = r2.f24475c
            java.lang.String r2 = r2.f24476d
            r13.<init>(r1, r0, r3, r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.C2164h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
