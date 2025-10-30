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
public final class DeleteContinueWatchRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13909a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13910b;

    public DeleteContinueWatchRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13909a = C1499E.o("movieId");
        this.f13910b = moshi.b(Long.TYPE, v.f1137a, "movieId");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13909a);
            if (h02 != -1) {
                if (h02 == 0 && (l9 = (Long) this.f13910b.b(reader)) == null) {
                    throw e.j("movieId", "movieId", reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (l9 != null) {
            return new DeleteContinueWatchRequest(l9.longValue());
        }
        throw e.e("movieId", "movieId", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        DeleteContinueWatchRequest deleteContinueWatchRequest = (DeleteContinueWatchRequest) obj;
        h.e(writer, "writer");
        if (deleteContinueWatchRequest != null) {
            writer.d();
            writer.x("movieId");
            this.f13910b.e(writer, Long.valueOf(deleteContinueWatchRequest.f13908a));
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(48, "GeneratedJsonAdapter(DeleteContinueWatchRequest)");
    }
}
