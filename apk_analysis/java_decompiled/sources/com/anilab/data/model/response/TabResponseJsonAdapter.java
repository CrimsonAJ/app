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
public final class TabResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14355a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14356b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14357c;

    public TabResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14355a = C1499E.o("id", "title", "data");
        v vVar = v.f1137a;
        this.f14356b = moshi.b(String.class, vVar, "id");
        this.f14357c = moshi.b(AbstractC1708D.f(MovieResponse.class), vVar, "data");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        String str2 = null;
        List list = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14355a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f14356b;
                if (h02 != 0) {
                    if (h02 != 1) {
                        if (h02 == 2) {
                            list = (List) this.f14357c.b(reader);
                        }
                    } else {
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
        return new TabResponse(str, str2, list);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        TabResponse tabResponse = (TabResponse) obj;
        h.e(writer, "writer");
        if (tabResponse != null) {
            writer.d();
            writer.x("id");
            AbstractC1719k abstractC1719k = this.f14356b;
            abstractC1719k.e(writer, tabResponse.f14352a);
            writer.x("title");
            abstractC1719k.e(writer, tabResponse.f14353b);
            writer.x("data");
            this.f14357c.e(writer, tabResponse.f14354c);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(33, "GeneratedJsonAdapter(TabResponse)");
    }
}
