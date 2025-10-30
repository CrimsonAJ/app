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
public final class UpdateCommentRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13968a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13969b;

    public UpdateCommentRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13968a = C1499E.o("id", "content");
        this.f13969b = moshi.b(String.class, v.f1137a, "commentId");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        String str2 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13968a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f13969b;
                if (h02 != 0) {
                    if (h02 == 1 && (str2 = (String) abstractC1719k.b(reader)) == null) {
                        throw e.j("content", "content", reader);
                    }
                } else {
                    str = (String) abstractC1719k.b(reader);
                    if (str == null) {
                        throw e.j("commentId", "id", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (str != null) {
            if (str2 != null) {
                return new UpdateCommentRequest(str, str2);
            }
            throw e.e("content", "content", reader);
        }
        throw e.e("commentId", "id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        UpdateCommentRequest updateCommentRequest = (UpdateCommentRequest) obj;
        h.e(writer, "writer");
        if (updateCommentRequest != null) {
            writer.d();
            writer.x("id");
            String str = updateCommentRequest.f13966a;
            AbstractC1719k abstractC1719k = this.f13969b;
            abstractC1719k.e(writer, str);
            writer.x("content");
            abstractC1719k.e(writer, updateCommentRequest.f13967b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(42, "GeneratedJsonAdapter(UpdateCommentRequest)");
    }
}
