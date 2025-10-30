package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: b, reason: collision with root package name */
    public static final C1047s f16301b = new C1047s(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f16302a;

    public K(C1040k c1040k) {
        AbstractC1054z.a(c1040k, "output");
        this.f16302a = c1040k;
        c1040k.f16377g = this;
    }

    public void a(int i9, AbstractC1037h abstractC1037h) {
        C1040k c1040k = (C1040k) this.f16302a;
        c1040k.i0(i9, 2);
        c1040k.j0(abstractC1037h.size());
        C1036g c1036g = (C1036g) abstractC1037h;
        c1040k.c0(c1036g.f16354d, c1036g.g(), c1036g.size());
    }

    public void b(int i9, Object obj, b0 b0Var) {
        C1040k c1040k = (C1040k) this.f16302a;
        c1040k.i0(i9, 3);
        b0Var.i((AbstractC1030a) obj, c1040k.f16377g);
        c1040k.i0(i9, 4);
    }

    public void c(int i9, Object obj, b0 b0Var) {
        AbstractC1030a abstractC1030a = (AbstractC1030a) obj;
        C1040k c1040k = (C1040k) this.f16302a;
        c1040k.i0(i9, 2);
        c1040k.j0(abstractC1030a.a(b0Var));
        b0Var.i(abstractC1030a, c1040k.f16377g);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.crypto.tink.shaded.protobuf.J] */
    public K() {
        O o9;
        try {
            o9 = (O) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            o9 = f16301b;
        }
        O[] oArr = {C1047s.f16401b, o9};
        ?? obj = new Object();
        obj.f16300a = oArr;
        Charset charset = AbstractC1054z.f16405a;
        this.f16302a = obj;
    }
}
