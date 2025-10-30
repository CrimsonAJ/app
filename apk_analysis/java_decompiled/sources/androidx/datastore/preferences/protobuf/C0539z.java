package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539z {
    public static InterfaceC0534u a(long j, Object obj) {
        int i9;
        InterfaceC0534u interfaceC0534u = (InterfaceC0534u) g0.f9706c.h(j, obj);
        if (!((AbstractC0516b) interfaceC0534u).f9688a) {
            Q q9 = (Q) interfaceC0534u;
            int i10 = q9.f9659c;
            if (i10 == 0) {
                i9 = 10;
            } else {
                i9 = i10 * 2;
            }
            Q d9 = q9.d(i9);
            g0.o(obj, j, d9);
            return d9;
        }
        return interfaceC0534u;
    }
}
