package androidx.datastore.preferences.protobuf;

import co.notix.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0529o {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9738c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final V f9739a = V.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f9740b;

    static {
        new C0529o(0);
    }

    public C0529o() {
    }

    public static void b(C0524j c0524j, o0 o0Var, int i9, Object obj) {
        if (o0Var == o0.f9742d) {
            c0524j.e0(i9, 3);
            ((AbstractC0515a) obj).b(c0524j);
            c0524j.e0(i9, 4);
            return;
        }
        c0524j.e0(i9, o0Var.f9746b);
        switch (o0Var.ordinal()) {
            case 0:
                c0524j.Y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                c0524j.W(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                c0524j.i0(((Long) obj).longValue());
                return;
            case 3:
                c0524j.i0(((Long) obj).longValue());
                return;
            case 4:
                c0524j.a0(((Integer) obj).intValue());
                return;
            case 5:
                c0524j.Y(((Long) obj).longValue());
                return;
            case 6:
                c0524j.W(((Integer) obj).intValue());
                return;
            case 7:
                c0524j.Q(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof C0521g) {
                    c0524j.U((C0521g) obj);
                    return;
                } else {
                    c0524j.d0((String) obj);
                    return;
                }
            case 9:
                ((AbstractC0515a) obj).b(c0524j);
                return;
            case R.styleable.GradientColor_android_endX /* 10 */:
                AbstractC0515a abstractC0515a = (AbstractC0515a) obj;
                c0524j.getClass();
                c0524j.g0(((AbstractC0533t) abstractC0515a).a(null));
                abstractC0515a.b(c0524j);
                return;
            case R.styleable.GradientColor_android_endY /* 11 */:
                if (obj instanceof C0521g) {
                    c0524j.U((C0521g) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                c0524j.g0(length);
                c0524j.R(bArr, 0, length);
                return;
            case 12:
                c0524j.g0(((Integer) obj).intValue());
                return;
            case 13:
                c0524j.a0(((Integer) obj).intValue());
                return;
            case 14:
                c0524j.W(((Integer) obj).intValue());
                return;
            case 15:
                c0524j.Y(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0524j.g0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0524j.i0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f9740b) {
            return;
        }
        V v8 = this.f9739a;
        int size = v8.f9668a.size();
        for (int i9 = 0; i9 < size; i9++) {
            Map.Entry c3 = v8.c(i9);
            if (c3.getValue() instanceof AbstractC0533t) {
                AbstractC0533t abstractC0533t = (AbstractC0533t) c3.getValue();
                abstractC0533t.getClass();
                P p9 = P.f9654c;
                p9.getClass();
                p9.a(abstractC0533t.getClass()).b(abstractC0533t);
                abstractC0533t.h();
            }
        }
        if (!v8.f9670c) {
            if (v8.f9668a.size() <= 0) {
                Iterator it = v8.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    throw new ClassCastException();
                }
            } else {
                v8.c(0).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!v8.f9670c) {
            if (v8.f9669b.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(v8.f9669b);
            }
            v8.f9669b = unmodifiableMap;
            if (v8.f9672e.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(v8.f9672e);
            }
            v8.f9672e = unmodifiableMap2;
            v8.f9670c = true;
        }
        this.f9740b = true;
    }

    public final Object clone() {
        C0529o c0529o = new C0529o();
        V v8 = this.f9739a;
        if (v8.f9668a.size() <= 0) {
            Iterator it = v8.d().iterator();
            if (!it.hasNext()) {
                return c0529o;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == null) {
                entry.getValue();
                throw null;
            }
            throw new ClassCastException();
        }
        Map.Entry c3 = v8.c(0);
        if (c3.getKey() == null) {
            c3.getValue();
            throw null;
        }
        throw new ClassCastException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0529o)) {
            return false;
        }
        return this.f9739a.equals(((C0529o) obj).f9739a);
    }

    public final int hashCode() {
        return this.f9739a.hashCode();
    }

    public C0529o(int i9) {
        a();
        a();
    }
}
