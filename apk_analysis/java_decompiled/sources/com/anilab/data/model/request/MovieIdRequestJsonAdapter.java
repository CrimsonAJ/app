package com.anilab.data.model.request;

import A0.a;
import B7.v;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;
import p7.e;

/* loaded from: classes.dex */
public final class MovieIdRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13932a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13933b;

    public MovieIdRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13932a = C1499E.o("movie_id");
        this.f13933b = moshi.b(Long.TYPE, v.f1137a, "movieId");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13932a);
            if (h02 != -1) {
                if (h02 == 0 && (l9 = (Long) this.f13933b.b(reader)) == null) {
                    throw e.j("movieId", "movie_id", reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (l9 != null) {
            return new MovieIdRequest(l9.longValue());
        }
        throw e.e("movieId", "movie_id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        MovieIdRequest movieIdRequest = (MovieIdRequest) obj;
        h.e(writer, "writer");
        if (movieIdRequest != null) {
            writer.d();
            writer.x("movie_id");
            this.f13933b.e(writer, Long.valueOf(movieIdRequest.f13931a));
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(36, "GeneratedJsonAdapter(MovieIdRequest)");
    }
}
