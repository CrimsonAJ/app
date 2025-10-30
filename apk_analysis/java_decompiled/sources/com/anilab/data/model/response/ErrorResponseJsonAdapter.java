package com.anilab.data.model.response;

import A0.a;
import B7.v;
import java.lang.reflect.Constructor;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;
import p7.e;

/* loaded from: classes.dex */
public final class ErrorResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14136a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14137b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Constructor f14138c;

    public ErrorResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14136a = C1499E.o("message");
        this.f14137b = moshi.b(String.class, v.f1137a, "message");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        int i9 = -1;
        while (reader.F()) {
            int h02 = reader.h0(this.f14136a);
            if (h02 != -1) {
                if (h02 == 0) {
                    str = (String) this.f14137b.b(reader);
                    i9 = -2;
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (i9 == -2) {
            return new ErrorResponse(str);
        }
        Constructor constructor = this.f14138c;
        if (constructor == null) {
            constructor = ErrorResponse.class.getDeclaredConstructor(String.class, Integer.TYPE, e.f22208c);
            this.f14138c = constructor;
            h.d(constructor, "also(...)");
        }
        Object newInstance = constructor.newInstance(str, Integer.valueOf(i9), null);
        h.d(newInstance, "newInstance(...)");
        return (ErrorResponse) newInstance;
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        ErrorResponse errorResponse = (ErrorResponse) obj;
        h.e(writer, "writer");
        if (errorResponse != null) {
            writer.d();
            writer.x("message");
            this.f14137b.e(writer, errorResponse.f14135a);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(35, "GeneratedJsonAdapter(ErrorResponse)");
    }
}
