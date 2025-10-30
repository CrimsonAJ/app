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
public final class SrcConfigResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14323a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14324b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14325c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14326d;

    public SrcConfigResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14323a = C1499E.o("host_name", "timeout", "server_list");
        v vVar = v.f1137a;
        this.f14324b = moshi.b(String.class, vVar, "hostName");
        this.f14325c = moshi.b(Long.class, vVar, "timeout");
        this.f14326d = moshi.b(AbstractC1708D.f(Integer.class), vVar, "serverList");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        Long l9 = null;
        List list = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14323a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 != 1) {
                        if (h02 == 2) {
                            list = (List) this.f14326d.b(reader);
                        }
                    } else {
                        l9 = (Long) this.f14325c.b(reader);
                    }
                } else {
                    str = (String) this.f14324b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new SrcConfigResponse(str, l9, list);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        SrcConfigResponse srcConfigResponse = (SrcConfigResponse) obj;
        h.e(writer, "writer");
        if (srcConfigResponse != null) {
            writer.d();
            writer.x("host_name");
            this.f14324b.e(writer, srcConfigResponse.f14320a);
            writer.x("timeout");
            this.f14325c.e(writer, srcConfigResponse.f14321b);
            writer.x("server_list");
            this.f14326d.e(writer, srcConfigResponse.f14322c);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(39, "GeneratedJsonAdapter(SrcConfigResponse)");
    }
}
