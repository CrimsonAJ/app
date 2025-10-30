package com.anilab.data.model.response;

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
public final class CommentVoteTypesResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14057a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14058b;

    public CommentVoteTypesResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14057a = C1499E.o("like");
        this.f14058b = moshi.b(Integer.TYPE, v.f1137a, "like");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Integer num = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14057a);
            if (h02 != -1) {
                if (h02 == 0 && (num = (Integer) this.f14058b.b(reader)) == null) {
                    throw e.j("like", "like", reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (num != null) {
            return new CommentVoteTypesResponse(num.intValue());
        }
        throw e.e("like", "like", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        CommentVoteTypesResponse commentVoteTypesResponse = (CommentVoteTypesResponse) obj;
        h.e(writer, "writer");
        if (commentVoteTypesResponse != null) {
            writer.d();
            writer.x("like");
            this.f14058b.e(writer, Integer.valueOf(commentVoteTypesResponse.f14056a));
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(46, "GeneratedJsonAdapter(CommentVoteTypesResponse)");
    }
}
