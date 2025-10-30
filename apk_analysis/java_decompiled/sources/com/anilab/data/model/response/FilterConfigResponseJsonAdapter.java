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
public final class FilterConfigResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14141a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14142b;

    public FilterConfigResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14141a = C1499E.o("title", "value");
        this.f14142b = moshi.b(String.class, v.f1137a, "title");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        String str2 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14141a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f14142b;
                if (h02 != 0) {
                    if (h02 == 1) {
                        str2 = (String) abstractC1719k.b(reader);
                    }
                } else {
                    str = (String) abstractC1719k.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new FilterConfigResponse(str, str2);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        FilterConfigResponse filterConfigResponse = (FilterConfigResponse) obj;
        h.e(writer, "writer");
        if (filterConfigResponse != null) {
            writer.d();
            writer.x("title");
            AbstractC1719k abstractC1719k = this.f14142b;
            abstractC1719k.e(writer, filterConfigResponse.f14139a);
            writer.x("value");
            abstractC1719k.e(writer, filterConfigResponse.f14140b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(42, "GeneratedJsonAdapter(FilterConfigResponse)");
    }
}
