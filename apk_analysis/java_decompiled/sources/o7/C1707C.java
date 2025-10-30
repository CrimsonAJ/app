package o7;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.List;
import java.util.Map;
import w.AbstractC2128h;

/* renamed from: o7.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1707C extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final y f21647a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f21648b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f21649c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f21650d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1719k f21651e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1719k f21652f;

    public C1707C(y yVar) {
        this.f21647a = yVar;
        this.f21648b = yVar.a(List.class);
        this.f21649c = yVar.a(Map.class);
        this.f21650d = yVar.a(String.class);
        this.f21651e = yVar.a(Double.class);
        this.f21652f = yVar.a(Boolean.class);
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n abstractC1722n) {
        int b9 = AbstractC2128h.b(abstractC1722n.a0());
        if (b9 != 0) {
            if (b9 != 2) {
                if (b9 != 5) {
                    if (b9 != 6) {
                        if (b9 != 7) {
                            if (b9 == 8) {
                                abstractC1722n.O();
                                return null;
                            }
                            throw new IllegalStateException("Expected a value but was " + AbstractC0953k1.D(abstractC1722n.a0()) + " at path " + abstractC1722n.x());
                        }
                        return this.f21652f.b(abstractC1722n);
                    }
                    return this.f21651e.b(abstractC1722n);
                }
                return this.f21650d.b(abstractC1722n);
            }
            return this.f21649c.b(abstractC1722n);
        }
        return this.f21648b.b(abstractC1722n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r1.isAssignableFrom(r0) != false) goto L8;
     */
    @Override // o7.AbstractC1719k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(o7.AbstractC1725q r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Lf
            r5.d()
            r5.g()
            return
        Lf:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L19
        L17:
            r0 = r1
            goto L22
        L19:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L22
            goto L17
        L22:
            java.util.Set r1 = p7.e.f22206a
            r2 = 0
            o7.y r3 = r4.f21647a
            o7.k r0 = r3.b(r0, r1, r2)
            r0.e(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.C1707C.e(o7.q, java.lang.Object):void");
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}
