package a0;

import F0.C0120y;
import androidx.datastore.preferences.protobuf.AbstractC0533t;
import androidx.datastore.preferences.protobuf.C0523i;
import androidx.datastore.preferences.protobuf.C0526l;
import androidx.datastore.preferences.protobuf.C0537x;
import androidx.datastore.preferences.protobuf.F;
import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.Z;
import androidx.datastore.preferences.protobuf.r;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class c extends AbstractC0533t {
    private static final c DEFAULT_INSTANCE;
    private static volatile O PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private F preferences_ = F.f9630b;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        AbstractC0533t.j(c.class, cVar);
    }

    public static F l(c cVar) {
        F f9 = cVar.preferences_;
        if (!f9.f9631a) {
            cVar.preferences_ = f9.c();
        }
        return cVar.preferences_;
    }

    public static C0486a n() {
        return (C0486a) ((r) DEFAULT_INSTANCE.c(5));
    }

    public static c o(InputStream inputStream) {
        c cVar = DEFAULT_INSTANCE;
        C0523i c0523i = new C0523i(inputStream);
        C0526l a5 = C0526l.a();
        AbstractC0533t i9 = cVar.i();
        try {
            P p9 = P.f9654c;
            p9.getClass();
            T a9 = p9.a(i9.getClass());
            C0120y c0120y = (C0120y) c0523i.f7932b;
            if (c0120y == null) {
                c0120y = new C0120y(c0523i);
            }
            a9.e(i9, c0120y, a5);
            a9.b(i9);
            if (AbstractC0533t.f(i9, true)) {
                return (c) i9;
            }
            throw new IOException(new Z().getMessage());
        } catch (Z e8) {
            throw new IOException(e8.getMessage());
        } catch (C0537x e9) {
            if (e9.f9767a) {
                throw new IOException(e9.getMessage(), e9);
            }
            throw e9;
        } catch (IOException e10) {
            if (e10.getCause() instanceof C0537x) {
                throw ((C0537x) e10.getCause());
            }
            throw new IOException(e10.getMessage(), e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof C0537x) {
                throw ((C0537x) e11.getCause());
            }
            throw e11;
        }
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [androidx.datastore.preferences.protobuf.O, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0533t
    public final Object c(int i9) {
        O o9;
        switch (AbstractC2128h.b(i9)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new S(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC0487b.f9080a});
            case 3:
                return new c();
            case 4:
                return new r(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                O o10 = PARSER;
                if (o10 == null) {
                    synchronized (c.class) {
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

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
