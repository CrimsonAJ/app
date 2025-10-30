package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public final class G extends H {
    @Override // com.google.crypto.tink.shaded.protobuf.H
    public final void a(long j, Object obj) {
        ((AbstractC1031b) ((InterfaceC1053y) n0.f16387c.i(j, obj))).f16338a = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public final void b(Object obj, long j, Object obj2) {
        m0 m0Var = n0.f16387c;
        InterfaceC1053y interfaceC1053y = (InterfaceC1053y) m0Var.i(j, obj);
        InterfaceC1053y interfaceC1053y2 = (InterfaceC1053y) m0Var.i(j, obj2);
        int size = interfaceC1053y.size();
        int size2 = interfaceC1053y2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1031b) interfaceC1053y).f16338a) {
                interfaceC1053y = interfaceC1053y.h(size2 + size);
            }
            interfaceC1053y.addAll(interfaceC1053y2);
        }
        if (size > 0) {
            interfaceC1053y2 = interfaceC1053y;
        }
        n0.p(obj, j, interfaceC1053y2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public final List c(long j, Object obj) {
        int i9;
        InterfaceC1053y interfaceC1053y = (InterfaceC1053y) n0.f16387c.i(j, obj);
        if (!((AbstractC1031b) interfaceC1053y).f16338a) {
            int size = interfaceC1053y.size();
            if (size == 0) {
                i9 = 10;
            } else {
                i9 = size * 2;
            }
            InterfaceC1053y h7 = interfaceC1053y.h(i9);
            n0.p(obj, j, h7);
            return h7;
        }
        return interfaceC1053y;
    }
}
