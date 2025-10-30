package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1048t implements P, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1050v f16403a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC1050v f16404b;

    public AbstractC1048t(AbstractC1050v abstractC1050v) {
        this.f16403a = abstractC1050v;
        if (!abstractC1050v.n()) {
            this.f16404b = abstractC1050v.q();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public static void i(Object obj, Object obj2) {
        Y y9 = Y.f16328c;
        y9.getClass();
        y9.a(obj.getClass()).a(obj, obj2);
    }

    public final AbstractC1050v c() {
        AbstractC1050v e8 = e();
        e8.getClass();
        if (AbstractC1050v.m(e8, true)) {
            return e8;
        }
        throw new d0();
    }

    public final AbstractC1050v e() {
        if (!this.f16404b.n()) {
            return this.f16404b;
        }
        AbstractC1050v abstractC1050v = this.f16404b;
        abstractC1050v.getClass();
        Y y9 = Y.f16328c;
        y9.getClass();
        y9.a(abstractC1050v.getClass()).b(abstractC1050v);
        abstractC1050v.o();
        return this.f16404b;
    }

    public final AbstractC1048t f() {
        AbstractC1048t d9 = this.f16403a.d();
        d9.f16404b = e();
        return d9;
    }

    public final void h() {
        if (!this.f16404b.n()) {
            AbstractC1050v q9 = this.f16403a.q();
            i(q9, this.f16404b);
            this.f16404b = q9;
        }
    }
}
