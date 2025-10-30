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
import p7.C1865c;
import p7.e;

/* loaded from: classes.dex */
public final class MalResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14226a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14227b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14228c;

    public MalResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14226a = C1499E.o("data", "paging");
        C1865c f9 = AbstractC1708D.f(MalDataResponse.class);
        v vVar = v.f1137a;
        this.f14227b = moshi.b(f9, vVar, "malData");
        this.f14228c = moshi.b(MalPagingResponse.class, vVar, "paging");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        List list = null;
        MalPagingResponse malPagingResponse = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14226a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 == 1) {
                        malPagingResponse = (MalPagingResponse) this.f14228c.b(reader);
                    }
                } else {
                    list = (List) this.f14227b.b(reader);
                    if (list == null) {
                        throw e.j("malData", "data", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (list != null) {
            return new MalResponse(list, malPagingResponse);
        }
        throw e.e("malData", "data", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        MalResponse malResponse = (MalResponse) obj;
        h.e(writer, "writer");
        if (malResponse != null) {
            writer.d();
            writer.x("data");
            this.f14227b.e(writer, malResponse.f14224a);
            writer.x("paging");
            this.f14228c.e(writer, malResponse.f14225b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(33, "GeneratedJsonAdapter(MalResponse)");
    }
}
