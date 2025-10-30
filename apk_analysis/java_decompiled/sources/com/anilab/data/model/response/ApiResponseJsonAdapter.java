package com.anilab.data.model.response;

import A0.a;
import B7.v;
import java.lang.reflect.Type;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;

/* loaded from: classes.dex */
public final class ApiResponseJsonAdapter<T> extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14006a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14007b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14008c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14009d;

    public ApiResponseJsonAdapter(y moshi, Type[] types) {
        h.e(moshi, "moshi");
        h.e(types, "types");
        if (types.length == 1) {
            this.f14006a = C1499E.o("success", "code", "result");
            v vVar = v.f1137a;
            this.f14007b = moshi.b(Boolean.class, vVar, "success");
            this.f14008c = moshi.b(Integer.class, vVar, "code");
            this.f14009d = moshi.b(types[0], vVar, "result");
            return;
        }
        throw new IllegalArgumentException(("TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received " + types.length).toString());
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Boolean bool = null;
        Integer num = null;
        Object obj = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14006a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 != 1) {
                        if (h02 == 2) {
                            obj = this.f14009d.b(reader);
                        }
                    } else {
                        num = (Integer) this.f14008c.b(reader);
                    }
                } else {
                    bool = (Boolean) this.f14007b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new ApiResponse(bool, num, obj);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        ApiResponse apiResponse = (ApiResponse) obj;
        h.e(writer, "writer");
        if (apiResponse != null) {
            writer.d();
            writer.x("success");
            this.f14007b.e(writer, apiResponse.f14003a);
            writer.x("code");
            this.f14008c.e(writer, apiResponse.f14004b);
            writer.x("result");
            this.f14009d.e(writer, apiResponse.f14005c);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(33, "GeneratedJsonAdapter(ApiResponse)");
    }
}
