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
import p7.e;

/* loaded from: classes.dex */
public final class RelatedMovieResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14293a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14294b;

    public RelatedMovieResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14293a = C1499E.o("movies");
        this.f14294b = moshi.b(AbstractC1708D.f(MovieResponse.class), v.f1137a, "movies");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        List list = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14293a);
            if (h02 != -1) {
                if (h02 == 0 && (list = (List) this.f14294b.b(reader)) == null) {
                    throw e.j("movies", "movies", reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (list != null) {
            return new RelatedMovieResponse(list);
        }
        throw e.e("movies", "movies", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        RelatedMovieResponse relatedMovieResponse = (RelatedMovieResponse) obj;
        h.e(writer, "writer");
        if (relatedMovieResponse != null) {
            writer.d();
            writer.x("movies");
            this.f14294b.e(writer, relatedMovieResponse.f14292a);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(42, "GeneratedJsonAdapter(RelatedMovieResponse)");
    }
}
