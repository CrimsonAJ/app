package com.anilab.data.model.request;

import A0.a;
import B7.v;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;

/* loaded from: classes.dex */
public final class DeleteCommentRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13906a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13907b;

    public DeleteCommentRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13906a = C1499E.o("id");
        this.f13907b = moshi.b(String.class, v.f1137a, "commentId");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13906a);
            if (h02 != -1) {
                if (h02 == 0) {
                    str = (String) this.f13907b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new DeleteCommentRequest(str);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        DeleteCommentRequest deleteCommentRequest = (DeleteCommentRequest) obj;
        h.e(writer, "writer");
        if (deleteCommentRequest != null) {
            writer.d();
            writer.x("id");
            this.f13907b.e(writer, deleteCommentRequest.f13905a);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(42, "GeneratedJsonAdapter(DeleteCommentRequest)");
    }
}
