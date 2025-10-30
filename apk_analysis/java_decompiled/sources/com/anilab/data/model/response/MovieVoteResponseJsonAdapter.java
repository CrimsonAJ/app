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
public final class MovieVoteResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14266a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14267b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14268c;

    public MovieVoteResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14266a = C1499E.o("movieId", "voteData");
        v vVar = v.f1137a;
        this.f14267b = moshi.b(Long.TYPE, vVar, "movieId");
        this.f14268c = moshi.b(AbstractC1708D.f(VoteResponse.class), vVar, "voteData");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        List list = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14266a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 == 1 && (list = (List) this.f14268c.b(reader)) == null) {
                        throw e.j("voteData", "voteData", reader);
                    }
                } else {
                    l9 = (Long) this.f14267b.b(reader);
                    if (l9 == null) {
                        throw e.j("movieId", "movieId", reader);
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
            if (list != null) {
                return new MovieVoteResponse(longValue, list);
            }
            throw e.e("voteData", "voteData", reader);
        }
        throw e.e("movieId", "movieId", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        MovieVoteResponse movieVoteResponse = (MovieVoteResponse) obj;
        h.e(writer, "writer");
        if (movieVoteResponse != null) {
            writer.d();
            writer.x("movieId");
            this.f14267b.e(writer, Long.valueOf(movieVoteResponse.f14264a));
            writer.x("voteData");
            this.f14268c.e(writer, movieVoteResponse.f14265b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(39, "GeneratedJsonAdapter(MovieVoteResponse)");
    }
}
