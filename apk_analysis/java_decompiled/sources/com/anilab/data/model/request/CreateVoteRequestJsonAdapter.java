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
public final class CreateVoteRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13902a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13903b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f13904c;

    public CreateVoteRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13902a = C1499E.o("commentId", "voteType");
        v vVar = v.f1137a;
        this.f13903b = moshi.b(String.class, vVar, "commentId");
        this.f13904c = moshi.b(Integer.TYPE, vVar, "voteType");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        Integer num = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13902a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 == 1 && (num = (Integer) this.f13904c.b(reader)) == null) {
                        throw e.j("voteType", "voteType", reader);
                    }
                } else {
                    str = (String) this.f13903b.b(reader);
                    if (str == null) {
                        throw e.j("commentId", "commentId", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (str != null) {
            if (num != null) {
                return new CreateVoteRequest(str, num.intValue());
            }
            throw e.e("voteType", "voteType", reader);
        }
        throw e.e("commentId", "commentId", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        CreateVoteRequest createVoteRequest = (CreateVoteRequest) obj;
        h.e(writer, "writer");
        if (createVoteRequest != null) {
            writer.d();
            writer.x("commentId");
            this.f13903b.e(writer, createVoteRequest.f13900a);
            writer.x("voteType");
            this.f13904c.e(writer, Integer.valueOf(createVoteRequest.f13901b));
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(39, "GeneratedJsonAdapter(CreateVoteRequest)");
    }
}
