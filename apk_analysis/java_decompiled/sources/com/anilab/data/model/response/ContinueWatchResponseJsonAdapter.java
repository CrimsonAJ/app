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
public final class ContinueWatchResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14072a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14073b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14074c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14075d;

    public ContinueWatchResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14072a = C1499E.o("id", "user_id", "movie_id", "episode_id", "episode_number", "time", "percent", "updated_at");
        v vVar = v.f1137a;
        this.f14073b = moshi.b(Long.class, vVar, "id");
        this.f14074c = moshi.b(Integer.class, vVar, "number");
        this.f14075d = moshi.b(Float.class, vVar, "percent");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        Long l10 = null;
        Long l11 = null;
        Long l12 = null;
        Integer num = null;
        Long l13 = null;
        Float f9 = null;
        Long l14 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14072a);
            AbstractC1719k abstractC1719k = this.f14073b;
            switch (h02) {
                case -1:
                    reader.i0();
                    reader.j0();
                    break;
                case 0:
                    l9 = (Long) abstractC1719k.b(reader);
                    break;
                case 1:
                    l10 = (Long) abstractC1719k.b(reader);
                    break;
                case 2:
                    l11 = (Long) abstractC1719k.b(reader);
                    break;
                case 3:
                    l12 = (Long) abstractC1719k.b(reader);
                    break;
                case 4:
                    num = (Integer) this.f14074c.b(reader);
                    break;
                case 5:
                    l13 = (Long) abstractC1719k.b(reader);
                    break;
                case 6:
                    f9 = (Float) this.f14075d.b(reader);
                    break;
                case 7:
                    l14 = (Long) abstractC1719k.b(reader);
                    break;
            }
        }
        reader.s();
        return new ContinueWatchResponse(l9, l10, l11, l12, num, l13, f9, l14);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        ContinueWatchResponse continueWatchResponse = (ContinueWatchResponse) obj;
        h.e(writer, "writer");
        if (continueWatchResponse != null) {
            writer.d();
            writer.x("id");
            AbstractC1719k abstractC1719k = this.f14073b;
            abstractC1719k.e(writer, continueWatchResponse.f14064a);
            writer.x("user_id");
            abstractC1719k.e(writer, continueWatchResponse.f14065b);
            writer.x("movie_id");
            abstractC1719k.e(writer, continueWatchResponse.f14066c);
            writer.x("episode_id");
            abstractC1719k.e(writer, continueWatchResponse.f14067d);
            writer.x("episode_number");
            this.f14074c.e(writer, continueWatchResponse.f14068e);
            writer.x("time");
            abstractC1719k.e(writer, continueWatchResponse.f14069f);
            writer.x("percent");
            this.f14075d.e(writer, continueWatchResponse.f14070g);
            writer.x("updated_at");
            abstractC1719k.e(writer, continueWatchResponse.f14071h);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(43, "GeneratedJsonAdapter(ContinueWatchResponse)");
    }
}
