package N6;

import L6.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements L6.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5242a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f5243b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5244c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5245d;

    /* renamed from: e, reason: collision with root package name */
    public final a f5246e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5247f;

    public e(Writer writer, HashMap hashMap, HashMap hashMap2, a aVar, boolean z9) {
        this.f5243b = new JsonWriter(writer);
        this.f5244c = hashMap;
        this.f5245d = hashMap2;
        this.f5246e = aVar;
        this.f5247f = z9;
    }

    @Override // L6.e
    public final L6.e a(L6.c cVar, Object obj) {
        i(obj, cVar.f4644a);
        return this;
    }

    @Override // L6.e
    public final L6.e b(L6.c cVar, boolean z9) {
        String str = cVar.f4644a;
        j();
        JsonWriter jsonWriter = this.f5243b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z9);
        return this;
    }

    @Override // L6.e
    public final L6.e c(L6.c cVar, double d9) {
        String str = cVar.f4644a;
        j();
        JsonWriter jsonWriter = this.f5243b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d9);
        return this;
    }

    @Override // L6.g
    public final g d(String str) {
        j();
        this.f5243b.value(str);
        return this;
    }

    @Override // L6.e
    public final L6.e e(L6.c cVar, int i9) {
        String str = cVar.f4644a;
        j();
        JsonWriter jsonWriter = this.f5243b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i9);
        return this;
    }

    @Override // L6.e
    public final L6.e f(L6.c cVar, long j) {
        String str = cVar.f4644a;
        j();
        JsonWriter jsonWriter = this.f5243b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    @Override // L6.g
    public final g g(boolean z9) {
        j();
        this.f5243b.value(z9);
        return this;
    }

    public final e h(Object obj) {
        int i9 = 0;
        JsonWriter jsonWriter = this.f5243b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                j();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i9 < length) {
                    jsonWriter.value(r8[i9]);
                    i9++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i9 < length2) {
                    long j = jArr[i9];
                    j();
                    jsonWriter.value(j);
                    i9++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i9 < length3) {
                    jsonWriter.value(dArr[i9]);
                    i9++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i9 < length4) {
                    jsonWriter.value(zArr[i9]);
                    i9++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i9 < length5) {
                    h(numberArr[i9]);
                    i9++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i9 < length6) {
                    h(objArr[i9]);
                    i9++;
                }
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            jsonWriter.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(it.next());
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    i(entry.getValue(), (String) key);
                } catch (ClassCastException e8) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e8);
                }
            }
            jsonWriter.endObject();
            return this;
        }
        L6.d dVar = (L6.d) this.f5244c.get(obj.getClass());
        if (dVar != null) {
            jsonWriter.beginObject();
            dVar.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        L6.f fVar = (L6.f) this.f5245d.get(obj.getClass());
        if (fVar != null) {
            fVar.a(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            if (obj instanceof f) {
                int a5 = ((f) obj).a();
                j();
                jsonWriter.value(a5);
                return this;
            }
            String name = ((Enum) obj).name();
            j();
            jsonWriter.value(name);
            return this;
        }
        jsonWriter.beginObject();
        this.f5246e.a(obj, this);
        throw null;
    }

    public final e i(Object obj, String str) {
        boolean z9 = this.f5247f;
        JsonWriter jsonWriter = this.f5243b;
        if (z9) {
            if (obj == null) {
                return this;
            }
            j();
            jsonWriter.name(str);
            h(obj);
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        h(obj);
        return this;
    }

    public final void j() {
        if (this.f5242a) {
        } else {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
