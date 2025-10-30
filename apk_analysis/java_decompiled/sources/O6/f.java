package O6;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements L6.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f5517f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final L6.c f5518g = new L6.c("key", A0.a.s(A0.a.r(e.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final L6.c f5519h = new L6.c("value", A0.a.s(A0.a.r(e.class, new a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final N6.a f5520i = new N6.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f5521a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5522b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5523c;

    /* renamed from: d, reason: collision with root package name */
    public final N6.a f5524d;

    /* renamed from: e, reason: collision with root package name */
    public final h f5525e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, N6.a aVar) {
        this.f5521a = byteArrayOutputStream;
        this.f5522b = hashMap;
        this.f5523c = hashMap2;
        this.f5524d = aVar;
    }

    public static int j(L6.c cVar) {
        e eVar = (e) ((Annotation) cVar.f4645b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f5513a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // L6.e
    public final L6.e a(L6.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    @Override // L6.e
    public final L6.e b(L6.c cVar, boolean z9) {
        g(cVar, z9 ? 1 : 0, true);
        return this;
    }

    @Override // L6.e
    public final L6.e c(L6.c cVar, double d9) {
        d(cVar, d9, true);
        return this;
    }

    public final void d(L6.c cVar, double d9, boolean z9) {
        if (z9 && d9 == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f5521a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d9).array());
    }

    @Override // L6.e
    public final L6.e e(L6.c cVar, int i9) {
        g(cVar, i9, true);
        return this;
    }

    @Override // L6.e
    public final L6.e f(L6.c cVar, long j) {
        if (j == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f4645b.get(e.class));
        if (eVar != null) {
            k(((a) eVar).f5513a << 3);
            l(j);
            return this;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void g(L6.c cVar, int i9, boolean z9) {
        if (z9 && i9 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f4645b.get(e.class));
        if (eVar != null) {
            k(((a) eVar).f5513a << 3);
            k(i9);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void h(L6.c cVar, Object obj, boolean z9) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z9 || charSequence.length() != 0) {
                    k((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f5517f);
                    k(bytes.length);
                    this.f5521a.write(bytes);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(cVar, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    i(f5520i, cVar, (Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof Double) {
                d(cVar, ((Double) obj).doubleValue(), z9);
                return;
            }
            if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z9 || floatValue != 0.0f) {
                    k((j(cVar) << 3) | 5);
                    this.f5521a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z9 || longValue != 0) {
                    e eVar = (e) ((Annotation) cVar.f4645b.get(e.class));
                    if (eVar != null) {
                        k(((a) eVar).f5513a << 3);
                        l(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
                return;
            }
            if (obj instanceof Boolean) {
                g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z9);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z9 && bArr.length == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                k(bArr.length);
                this.f5521a.write(bArr);
                return;
            }
            L6.d dVar = (L6.d) this.f5522b.get(obj.getClass());
            if (dVar != null) {
                i(dVar, cVar, obj, z9);
                return;
            }
            L6.f fVar = (L6.f) this.f5523c.get(obj.getClass());
            if (fVar != null) {
                h hVar = this.f5525e;
                hVar.f5527a = false;
                hVar.f5529c = cVar;
                hVar.f5528b = z9;
                fVar.a(obj, hVar);
                return;
            }
            if (obj instanceof c) {
                g(cVar, ((c) obj).a(), true);
            } else if (obj instanceof Enum) {
                g(cVar, ((Enum) obj).ordinal(), true);
            } else {
                i(this.f5524d, cVar, obj, z9);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, O6.b] */
    public final void i(L6.d dVar, L6.c cVar, Object obj, boolean z9) {
        ?? outputStream = new OutputStream();
        outputStream.f5514a = 0L;
        try {
            OutputStream outputStream2 = this.f5521a;
            this.f5521a = outputStream;
            try {
                dVar.a(obj, this);
                this.f5521a = outputStream2;
                long j = outputStream.f5514a;
                outputStream.close();
                if (z9 && j == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                l(j);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f5521a = outputStream2;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                outputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i9) {
        while ((i9 & (-128)) != 0) {
            this.f5521a.write((i9 & 127) | 128);
            i9 >>>= 7;
        }
        this.f5521a.write(i9 & 127);
    }

    public final void l(long j) {
        while (((-128) & j) != 0) {
            this.f5521a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f5521a.write(((int) j) & 127);
    }
}
