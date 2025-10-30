package com.anilab.data.model.response;

import A0.a;
import B7.v;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;

/* loaded from: classes.dex */
public final class MalPagingResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14222a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14223b;

    public MalPagingResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14222a = C1499E.o("next");
        this.f14223b = moshi.b(String.class, v.f1137a, "next");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14222a);
            if (h02 != -1) {
                if (h02 == 0) {
                    str = (String) this.f14223b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new MalPagingResponse(str);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        MalPagingResponse malPagingResponse = (MalPagingResponse) obj;
        h.e(writer, "writer");
        if (malPagingResponse != null) {
            writer.d();
            writer.x("next");
            this.f14223b.e(writer, malPagingResponse.f14221a);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(39, "GeneratedJsonAdapter(MalPagingResponse)");
    }
}
