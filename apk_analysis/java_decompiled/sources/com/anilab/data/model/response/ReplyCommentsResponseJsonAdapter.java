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
public final class ReplyCommentsResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14313a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14314b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14315c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14316d;

    public ReplyCommentsResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14313a = C1499E.o("comments", "users", "voteData");
        C1865c f9 = AbstractC1708D.f(CommentResponse.class);
        v vVar = v.f1137a;
        this.f14314b = moshi.b(f9, vVar, "comments");
        this.f14315c = moshi.b(AbstractC1708D.f(UserResponse.class), vVar, "users");
        this.f14316d = moshi.b(AbstractC1708D.f(VoteCommentResponse.class), vVar, "votes");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        List list = null;
        List list2 = null;
        List list3 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14313a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 != 1) {
                        if (h02 == 2) {
                            list3 = (List) this.f14316d.b(reader);
                        }
                    } else {
                        list2 = (List) this.f14315c.b(reader);
                    }
                } else {
                    list = (List) this.f14314b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new ReplyCommentsResponse(list, list2, list3);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        ReplyCommentsResponse replyCommentsResponse = (ReplyCommentsResponse) obj;
        h.e(writer, "writer");
        if (replyCommentsResponse != null) {
            writer.d();
            writer.x("comments");
            this.f14314b.e(writer, replyCommentsResponse.f14310a);
            writer.x("users");
            this.f14315c.e(writer, replyCommentsResponse.f14311b);
            writer.x("voteData");
            this.f14316d.e(writer, replyCommentsResponse.f14312c);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(43, "GeneratedJsonAdapter(ReplyCommentsResponse)");
    }
}
