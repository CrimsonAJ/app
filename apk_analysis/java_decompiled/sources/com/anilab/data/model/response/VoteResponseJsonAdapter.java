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
public final class VoteResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14398a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14399b;

    public VoteResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14398a = C1499E.o("score", "count");
        this.f14399b = moshi.b(Integer.TYPE, v.f1137a, "score");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Integer num = null;
        Integer num2 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14398a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f14399b;
                if (h02 != 0) {
                    if (h02 == 1 && (num2 = (Integer) abstractC1719k.b(reader)) == null) {
                        throw e.j("count", "count", reader);
                    }
                } else {
                    num = (Integer) abstractC1719k.b(reader);
                    if (num == null) {
                        throw e.j("score", "score", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                return new VoteResponse(intValue, num2.intValue());
            }
            throw e.e("count", "count", reader);
        }
        throw e.e("score", "score", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        VoteResponse voteResponse = (VoteResponse) obj;
        h.e(writer, "writer");
        if (voteResponse != null) {
            writer.d();
            writer.x("score");
            Integer valueOf = Integer.valueOf(voteResponse.f14396a);
            AbstractC1719k abstractC1719k = this.f14399b;
            abstractC1719k.e(writer, valueOf);
            writer.x("count");
            abstractC1719k.e(writer, Integer.valueOf(voteResponse.f14397b));
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(34, "GeneratedJsonAdapter(VoteResponse)");
    }
}
