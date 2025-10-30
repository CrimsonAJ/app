package com.anilab.data.model.response;

import A0.a;
import B7.v;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;

/* loaded from: classes.dex */
public final class CommentInfoResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14026a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14027b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14028c;

    public CommentInfoResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14026a = C1499E.o("comment", "child_comment");
        v vVar = v.f1137a;
        this.f14027b = moshi.b(CommentResponse.class, vVar, "comment");
        this.f14028c = moshi.b(UserResponse.class, vVar, "author");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        CommentResponse commentResponse = null;
        UserResponse userResponse = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14026a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 == 1) {
                        userResponse = (UserResponse) this.f14028c.b(reader);
                    }
                } else {
                    commentResponse = (CommentResponse) this.f14027b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new CommentInfoResponse(commentResponse, userResponse);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        CommentInfoResponse commentInfoResponse = (CommentInfoResponse) obj;
        h.e(writer, "writer");
        if (commentInfoResponse != null) {
            writer.d();
            writer.x("comment");
            this.f14027b.e(writer, commentInfoResponse.f14024a);
            writer.x("child_comment");
            this.f14028c.e(writer, commentInfoResponse.f14025b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(41, "GeneratedJsonAdapter(CommentInfoResponse)");
    }
}
