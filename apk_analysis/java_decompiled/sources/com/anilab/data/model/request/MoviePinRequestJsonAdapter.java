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
public final class MoviePinRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13936a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13937b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f13938c;

    public MoviePinRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13936a = C1499E.o("movie_id", "is_pin");
        v vVar = v.f1137a;
        this.f13937b = moshi.b(Long.TYPE, vVar, "movieId");
        this.f13938c = moshi.b(Integer.TYPE, vVar, "isPin");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        Integer num = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13936a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 == 1 && (num = (Integer) this.f13938c.b(reader)) == null) {
                        throw e.j("isPin", "is_pin", reader);
                    }
                } else {
                    l9 = (Long) this.f13937b.b(reader);
                    if (l9 == null) {
                        throw e.j("movieId", "movie_id", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (l9 != null) {
            long longValue = l9.longValue();
            if (num != null) {
                return new MoviePinRequest(longValue, num.intValue());
            }
            throw e.e("isPin", "is_pin", reader);
        }
        throw e.e("movieId", "movie_id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        MoviePinRequest moviePinRequest = (MoviePinRequest) obj;
        h.e(writer, "writer");
        if (moviePinRequest != null) {
            writer.d();
            writer.x("movie_id");
            this.f13937b.e(writer, Long.valueOf(moviePinRequest.f13934a));
            writer.x("is_pin");
            this.f13938c.e(writer, Integer.valueOf(moviePinRequest.f13935b));
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(37, "GeneratedJsonAdapter(MoviePinRequest)");
    }
}
