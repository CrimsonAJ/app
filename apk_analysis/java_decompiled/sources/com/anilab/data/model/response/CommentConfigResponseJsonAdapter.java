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
public final class CommentConfigResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14022a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14023b;

    public CommentConfigResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14022a = C1499E.o("commentVoteTypes");
        this.f14023b = moshi.b(CommentVoteTypesResponse.class, v.f1137a, "commentVoteTypes");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        CommentVoteTypesResponse commentVoteTypesResponse = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14022a);
            if (h02 != -1) {
                if (h02 == 0 && (commentVoteTypesResponse = (CommentVoteTypesResponse) this.f14023b.b(reader)) == null) {
                    throw e.j("commentVoteTypes", "commentVoteTypes", reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (commentVoteTypesResponse != null) {
            return new CommentConfigResponse(commentVoteTypesResponse);
        }
        throw e.e("commentVoteTypes", "commentVoteTypes", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        CommentConfigResponse commentConfigResponse = (CommentConfigResponse) obj;
        h.e(writer, "writer");
        if (commentConfigResponse != null) {
            writer.d();
            writer.x("commentVoteTypes");
            this.f14023b.e(writer, commentConfigResponse.f14021a);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(43, "GeneratedJsonAdapter(CommentConfigResponse)");
    }
}
