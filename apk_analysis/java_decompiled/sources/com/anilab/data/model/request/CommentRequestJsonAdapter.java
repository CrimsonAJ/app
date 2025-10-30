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
public final class CommentRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13891a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13892b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f13893c;

    public CommentRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13891a = C1499E.o("movie_id", "content");
        v vVar = v.f1137a;
        this.f13892b = moshi.b(Long.TYPE, vVar, "movieId");
        this.f13893c = moshi.b(String.class, vVar, "content");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        String str = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13891a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 == 1 && (str = (String) this.f13893c.b(reader)) == null) {
                        throw e.j("content", "content", reader);
                    }
                } else {
                    l9 = (Long) this.f13892b.b(reader);
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
            if (str != null) {
                return new CommentRequest(longValue, str);
            }
            throw e.e("content", "content", reader);
        }
        throw e.e("movieId", "movie_id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        CommentRequest commentRequest = (CommentRequest) obj;
        h.e(writer, "writer");
        if (commentRequest != null) {
            writer.d();
            writer.x("movie_id");
            this.f13892b.e(writer, Long.valueOf(commentRequest.f13889a));
            writer.x("content");
            this.f13893c.e(writer, commentRequest.f13890b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(36, "GeneratedJsonAdapter(CommentRequest)");
    }
}
