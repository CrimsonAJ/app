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

/* loaded from: classes.dex */
public final class CommentListResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14036a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14037b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14038c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14039d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1719k f14040e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1719k f14041f;

    public CommentListResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14036a = C1499E.o("page", "limit", "total_pages", "count", "rows", "users", "voteData");
        v vVar = v.f1137a;
        this.f14037b = moshi.b(Integer.class, vVar, "page");
        this.f14038c = moshi.b(Long.class, vVar, "count");
        this.f14039d = moshi.b(AbstractC1708D.f(CommentResponse.class), vVar, "result");
        this.f14040e = moshi.b(AbstractC1708D.f(UserResponse.class), vVar, "users");
        this.f14041f = moshi.b(AbstractC1708D.f(VoteCommentResponse.class), vVar, "votes");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l9 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14036a);
            AbstractC1719k abstractC1719k = this.f14037b;
            switch (h02) {
                case -1:
                    reader.i0();
                    reader.j0();
                    break;
                case 0:
                    num = (Integer) abstractC1719k.b(reader);
                    break;
                case 1:
                    num2 = (Integer) abstractC1719k.b(reader);
                    break;
                case 2:
                    num3 = (Integer) abstractC1719k.b(reader);
                    break;
                case 3:
                    l9 = (Long) this.f14038c.b(reader);
                    break;
                case 4:
                    list = (List) this.f14039d.b(reader);
                    break;
                case 5:
                    list2 = (List) this.f14040e.b(reader);
                    break;
                case 6:
                    list3 = (List) this.f14041f.b(reader);
                    break;
            }
        }
        reader.s();
        return new CommentListResponse(num, num2, num3, l9, list, list2, list3);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        CommentListResponse commentListResponse = (CommentListResponse) obj;
        h.e(writer, "writer");
        if (commentListResponse != null) {
            writer.d();
            writer.x("page");
            AbstractC1719k abstractC1719k = this.f14037b;
            abstractC1719k.e(writer, commentListResponse.f14029a);
            writer.x("limit");
            abstractC1719k.e(writer, commentListResponse.f14030b);
            writer.x("total_pages");
            abstractC1719k.e(writer, commentListResponse.f14031c);
            writer.x("count");
            this.f14038c.e(writer, commentListResponse.f14032d);
            writer.x("rows");
            this.f14039d.e(writer, commentListResponse.f14033e);
            writer.x("users");
            this.f14040e.e(writer, commentListResponse.f14034f);
            writer.x("voteData");
            this.f14041f.e(writer, commentListResponse.f14035g);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(41, "GeneratedJsonAdapter(CommentListResponse)");
    }
}
