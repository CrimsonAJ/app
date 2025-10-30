package com.anilab.data.model.response;

import A0.a;
import B7.v;
import java.util.List;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1708D;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;

/* loaded from: classes.dex */
public final class StreamingResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14340a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14341b;

    public StreamingResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14340a = C1499E.o("sub", "dub");
        this.f14341b = moshi.b(AbstractC1708D.f(String.class), v.f1137a, "subs");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        List list = null;
        List list2 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14340a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f14341b;
                if (h02 != 0) {
                    if (h02 == 1) {
                        list2 = (List) abstractC1719k.b(reader);
                    }
                } else {
                    list = (List) abstractC1719k.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new StreamingResponse(list, list2);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        StreamingResponse streamingResponse = (StreamingResponse) obj;
        h.e(writer, "writer");
        if (streamingResponse != null) {
            writer.d();
            writer.x("sub");
            AbstractC1719k abstractC1719k = this.f14341b;
            abstractC1719k.e(writer, streamingResponse.f14338a);
            writer.x("dub");
            abstractC1719k.e(writer, streamingResponse.f14339b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(39, "GeneratedJsonAdapter(StreamingResponse)");
    }
}
