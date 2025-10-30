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
public final class ApiEpisodeResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13999a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14000b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14001c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14002d;

    public ApiEpisodeResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13999a = C1499E.o("success", "code", "result");
        v vVar = v.f1137a;
        this.f14000b = moshi.b(Boolean.class, vVar, "success");
        this.f14001c = moshi.b(Integer.class, vVar, "code");
        this.f14002d = moshi.b(EpisodeDetailResponse.class, vVar, "result");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Boolean bool = null;
        Integer num = null;
        EpisodeDetailResponse episodeDetailResponse = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13999a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 != 1) {
                        if (h02 == 2) {
                            episodeDetailResponse = (EpisodeDetailResponse) this.f14002d.b(reader);
                        }
                    } else {
                        num = (Integer) this.f14001c.b(reader);
                    }
                } else {
                    bool = (Boolean) this.f14000b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new ApiEpisodeResponse(bool, num, episodeDetailResponse);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        ApiEpisodeResponse apiEpisodeResponse = (ApiEpisodeResponse) obj;
        h.e(writer, "writer");
        if (apiEpisodeResponse != null) {
            writer.d();
            writer.x("success");
            this.f14000b.e(writer, apiEpisodeResponse.f13996a);
            writer.x("code");
            this.f14001c.e(writer, apiEpisodeResponse.f13997b);
            writer.x("result");
            this.f14002d.e(writer, apiEpisodeResponse.f13998c);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(40, "GeneratedJsonAdapter(ApiEpisodeResponse)");
    }
}
