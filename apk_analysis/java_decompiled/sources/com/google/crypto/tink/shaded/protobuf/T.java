package com.google.crypto.tink.shaded.protobuf;

import F0.C0120y;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class T implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1030a f16323a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f16324b;

    /* renamed from: c, reason: collision with root package name */
    public final C1044o f16325c;

    public T(f0 f0Var, C1044o c1044o, AbstractC1030a abstractC1030a) {
        this.f16324b = f0Var;
        c1044o.getClass();
        this.f16325c = c1044o;
        this.f16323a = abstractC1030a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void a(Object obj, Object obj2) {
        c0.x(this.f16324b, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void b(Object obj) {
        this.f16324b.getClass();
        ((AbstractC1050v) obj).unknownFields.f16351e = false;
        this.f16325c.getClass();
        A0.a.x(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final boolean c(Object obj) {
        this.f16325c.getClass();
        A0.a.x(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object d() {
        AbstractC1030a abstractC1030a = this.f16323a;
        if (abstractC1030a instanceof AbstractC1050v) {
            return ((AbstractC1050v) abstractC1030a).q();
        }
        return abstractC1030a.d().e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final int e(AbstractC1050v abstractC1050v) {
        this.f16324b.getClass();
        e0 e0Var = abstractC1050v.unknownFields;
        int i9 = e0Var.f16350d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < e0Var.f16347a; i11++) {
            int i12 = e0Var.f16348b[i11] >>> 3;
            i10 += C1040k.R(3, (AbstractC1037h) e0Var.f16349c[i11]) + C1040k.Z(i12) + C1040k.Y(2) + (C1040k.Y(1) * 2);
        }
        e0Var.f16350d = i10;
        return i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void f(Object obj, C0120y c0120y, C1043n c1043n) {
        this.f16324b.getClass();
        f0.a(obj);
        this.f16325c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final boolean g(AbstractC1050v abstractC1050v, AbstractC1050v abstractC1050v2) {
        this.f16324b.getClass();
        if (!abstractC1050v.unknownFields.equals(abstractC1050v2.unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void h(Object obj, byte[] bArr, int i9, int i10, N3.Z z9) {
        AbstractC1050v abstractC1050v = (AbstractC1050v) obj;
        if (abstractC1050v.unknownFields == e0.f16346f) {
            abstractC1050v.unknownFields = e0.c();
        }
        throw AbstractC0953k1.i(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void i(Object obj, K k5) {
        this.f16325c.getClass();
        A0.a.x(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final int j(AbstractC1050v abstractC1050v) {
        this.f16324b.getClass();
        return abstractC1050v.unknownFields.hashCode();
    }
}
