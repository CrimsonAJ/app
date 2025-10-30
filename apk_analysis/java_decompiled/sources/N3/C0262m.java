package N3;

import b6.C0693o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k4.InterfaceC1512l;
import l4.AbstractC1566a;
import q3.C1903h;

/* renamed from: N3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262m implements InterfaceC0274z {

    /* renamed from: a, reason: collision with root package name */
    public final C0693o f5155a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1512l f5156b;

    /* renamed from: c, reason: collision with root package name */
    public e1.q f5157c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5158d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5159e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5160f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5161g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5162h;

    /* JADX WARN: Type inference failed for: r0v0, types: [b6.o, java.lang.Object] */
    public C0262m(InterfaceC1512l interfaceC1512l, C1903h c1903h) {
        this.f5156b = interfaceC1512l;
        ?? obj = new Object();
        obj.f11382a = c1903h;
        obj.f11383b = new HashMap();
        obj.f11384c = new HashSet();
        obj.f11385d = new HashMap();
        this.f5155a = obj;
        if (interfaceC1512l != ((InterfaceC1512l) obj.f11386e)) {
            obj.f11386e = interfaceC1512l;
            ((HashMap) obj.f11383b).clear();
            ((HashMap) obj.f11385d).clear();
        }
        this.f5158d = -9223372036854775807L;
        this.f5159e = -9223372036854775807L;
        this.f5160f = -9223372036854775807L;
        this.f5161g = -3.4028235E38f;
        this.f5162h = -3.4028235E38f;
    }

    public static InterfaceC0274z c(Class cls, InterfaceC1512l interfaceC1512l) {
        try {
            return (InterfaceC0274z) cls.getConstructor(InterfaceC1512l.class).newInstance(interfaceC1512l);
        } catch (Exception e8) {
            throw new IllegalStateException(e8);
        }
    }

    @Override // N3.InterfaceC0274z
    public final /* bridge */ /* synthetic */ InterfaceC0274z a(e1.q qVar) {
        d(qVar);
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, j3.O] */
    /* JADX WARN: Type inference failed for: r2v13, types: [Y2.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [j3.P, j3.Q] */
    @Override // N3.InterfaceC0274z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final N3.AbstractC0250a b(j3.Y r24) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.C0262m.b(j3.Y):N3.a");
    }

    public final void d(e1.q qVar) {
        AbstractC1566a.l(qVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f5157c = qVar;
        C0693o c0693o = this.f5155a;
        c0693o.f11387f = qVar;
        Iterator it = ((HashMap) c0693o.f11385d).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC0274z) it.next()).a(qVar);
        }
    }
}
