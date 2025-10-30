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
public final class ContinueWatchRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13897a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13898b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f13899c;

    public ContinueWatchRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13897a = C1499E.o("episode_id", "time", "percent");
        v vVar = v.f1137a;
        this.f13898b = moshi.b(Long.TYPE, vVar, "episodeId");
        this.f13899c = moshi.b(Integer.TYPE, vVar, "percent");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        Long l10 = null;
        Integer num = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13897a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f13898b;
                if (h02 != 0) {
                    if (h02 != 1) {
                        if (h02 == 2 && (num = (Integer) this.f13899c.b(reader)) == null) {
                            throw e.j("percent", "percent", reader);
                        }
                    } else {
                        l10 = (Long) abstractC1719k.b(reader);
                        if (l10 == null) {
                            throw e.j("time", "time", reader);
                        }
                    }
                } else {
                    l9 = (Long) abstractC1719k.b(reader);
                    if (l9 == null) {
                        throw e.j("episodeId", "episode_id", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        Long l11 = l9;
        if (l11 != null) {
            long longValue = l11.longValue();
            if (l10 != null) {
                long longValue2 = l10.longValue();
                if (num != null) {
                    return new ContinueWatchRequest(longValue, longValue2, num.intValue());
                }
                throw e.e("percent", "percent", reader);
            }
            throw e.e("time", "time", reader);
        }
        throw e.e("episodeId", "episode_id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        ContinueWatchRequest continueWatchRequest = (ContinueWatchRequest) obj;
        h.e(writer, "writer");
        if (continueWatchRequest != null) {
            writer.d();
            writer.x("episode_id");
            Long valueOf = Long.valueOf(continueWatchRequest.f13894a);
            AbstractC1719k abstractC1719k = this.f13898b;
            abstractC1719k.e(writer, valueOf);
            writer.x("time");
            abstractC1719k.e(writer, Long.valueOf(continueWatchRequest.f13895b));
            writer.x("percent");
            this.f13899c.e(writer, Integer.valueOf(continueWatchRequest.f13896c));
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(42, "GeneratedJsonAdapter(ContinueWatchRequest)");
    }
}
