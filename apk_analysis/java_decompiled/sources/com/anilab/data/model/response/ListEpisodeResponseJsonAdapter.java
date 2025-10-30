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

/* loaded from: classes.dex */
public final class ListEpisodeResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14186a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14187b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14188c;

    public ListEpisodeResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14186a = C1499E.o("episodes", "continueWatch");
        C1865c f9 = AbstractC1708D.f(EpisodeResponse.class);
        v vVar = v.f1137a;
        this.f14187b = moshi.b(f9, vVar, "episodes");
        this.f14188c = moshi.b(AbstractC1708D.f(ContinueWatchResponse.class), vVar, "continueWatch");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        List list = null;
        List list2 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14186a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 == 1) {
                        list2 = (List) this.f14188c.b(reader);
                    }
                } else {
                    list = (List) this.f14187b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new ListEpisodeResponse(list, list2);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        ListEpisodeResponse listEpisodeResponse = (ListEpisodeResponse) obj;
        h.e(writer, "writer");
        if (listEpisodeResponse != null) {
            writer.d();
            writer.x("episodes");
            this.f14187b.e(writer, listEpisodeResponse.f14184a);
            writer.x("continueWatch");
            this.f14188c.e(writer, listEpisodeResponse.f14185b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(41, "GeneratedJsonAdapter(ListEpisodeResponse)");
    }
}
