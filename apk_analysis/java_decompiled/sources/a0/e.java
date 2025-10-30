package a0;

import androidx.datastore.preferences.protobuf.AbstractC0516b;
import androidx.datastore.preferences.protobuf.AbstractC0533t;
import androidx.datastore.preferences.protobuf.AbstractC0535v;
import androidx.datastore.preferences.protobuf.InterfaceC0534u;
import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.r;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class e extends AbstractC0533t {
    private static final e DEFAULT_INSTANCE;
    private static volatile O PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0534u strings_ = Q.f9657d;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0533t.j(e.class, eVar);
    }

    public static void l(e eVar, Set set) {
        int i9;
        InterfaceC0534u interfaceC0534u = eVar.strings_;
        if (!((AbstractC0516b) interfaceC0534u).f9688a) {
            Q q9 = (Q) interfaceC0534u;
            int i10 = q9.f9659c;
            if (i10 == 0) {
                i9 = 10;
            } else {
                i9 = i10 * 2;
            }
            eVar.strings_ = q9.d(i9);
        }
        RandomAccess randomAccess = eVar.strings_;
        Charset charset = AbstractC0535v.f9765a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((Q) randomAccess).f9659c);
        }
        Q q10 = (Q) randomAccess;
        int i11 = q10.f9659c;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (q10.f9659c - i11) + " is null.";
                for (int i12 = q10.f9659c - 1; i12 >= i11; i12--) {
                    q10.remove(i12);
                }
                throw new NullPointerException(str);
            }
            q10.add(obj);
        }
    }

    public static e m() {
        return DEFAULT_INSTANCE;
    }

    public static d o() {
        return (d) ((r) DEFAULT_INSTANCE.c(5));
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.datastore.preferences.protobuf.O, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0533t
    public final Object c(int i9) {
        O o9;
        switch (AbstractC2128h.b(i9)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new S(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new e();
            case 4:
                return new r(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                O o10 = PARSER;
                if (o10 == null) {
                    synchronized (e.class) {
                        try {
                            O o11 = PARSER;
                            o9 = o11;
                            if (o11 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                o9 = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return o9;
                }
                return o10;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC0534u n() {
        return this.strings_;
    }
}
