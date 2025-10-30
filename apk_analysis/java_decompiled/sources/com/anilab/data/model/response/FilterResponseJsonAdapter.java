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
public final class FilterResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14145a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14146b;

    public FilterResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14145a = C1499E.o("id", "title");
        this.f14146b = moshi.b(String.class, v.f1137a, "id");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        String str2 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14145a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f14146b;
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
        return new FilterResponse(str, str2);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        FilterResponse filterResponse = (FilterResponse) obj;
        h.e(writer, "writer");
        if (filterResponse != null) {
            writer.d();
            writer.x("id");
            AbstractC1719k abstractC1719k = this.f14146b;
            abstractC1719k.e(writer, filterResponse.f14143a);
            writer.x("title");
            abstractC1719k.e(writer, filterResponse.f14144b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(36, "GeneratedJsonAdapter(FilterResponse)");
    }
}
