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
public final class StreamUrlResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14334a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14335b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14336c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14337d;

    public StreamUrlResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14334a = C1499E.o("serverId", "urls", "serverName");
        v vVar = v.f1137a;
        this.f14335b = moshi.b(Long.class, vVar, "serverId");
        this.f14336c = moshi.b(AbstractC1708D.f(String.class), vVar, "urls");
        this.f14337d = moshi.b(String.class, vVar, "serverName");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        List list = null;
        String str = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14334a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 != 1) {
                        if (h02 == 2) {
                            str = (String) this.f14337d.b(reader);
                        }
                    } else {
                        list = (List) this.f14336c.b(reader);
                    }
                } else {
                    l9 = (Long) this.f14335b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new StreamUrlResponse(l9, list, str);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        StreamUrlResponse streamUrlResponse = (StreamUrlResponse) obj;
        h.e(writer, "writer");
        if (streamUrlResponse != null) {
            writer.d();
            writer.x("serverId");
            this.f14335b.e(writer, streamUrlResponse.f14331a);
            writer.x("urls");
            this.f14336c.e(writer, streamUrlResponse.f14332b);
            writer.x("serverName");
            this.f14337d.e(writer, streamUrlResponse.f14333c);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(39, "GeneratedJsonAdapter(StreamUrlResponse)");
    }
}
