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
public final class ContinueWatchRowResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14085a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14086b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14087c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14088d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1719k f14089e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1719k f14090f;

    public ContinueWatchRowResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14085a = C1499E.o("id", "user_id", "movie_id", "episode_id", "episode_number", "time", "percent", "updated_at", "movie");
        v vVar = v.f1137a;
        this.f14086b = moshi.b(Long.TYPE, vVar, "id");
        this.f14087c = moshi.b(Long.class, vVar, "userId");
        this.f14088d = moshi.b(Integer.class, vVar, "number");
        this.f14089e = moshi.b(Float.class, vVar, "percent");
        this.f14090f = moshi.b(MovieResponse.class, vVar, "movie");
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
        MovieResponse movieResponse = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14085a);
            AbstractC1719k abstractC1719k = this.f14087c;
            switch (h02) {
                case -1:
                    reader.i0();
                    reader.j0();
                    break;
                case 0:
                    l9 = (Long) this.f14086b.b(reader);
                    if (l9 == null) {
                        throw e.j("id", "id", reader);
                    }
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
                    num = (Integer) this.f14088d.b(reader);
                    break;
                case 5:
                    l13 = (Long) abstractC1719k.b(reader);
                    break;
                case 6:
                    f9 = (Float) this.f14089e.b(reader);
                    break;
                case 7:
                    l14 = (Long) abstractC1719k.b(reader);
                    break;
                case 8:
                    movieResponse = (MovieResponse) this.f14090f.b(reader);
                    break;
            }
        }
        reader.s();
        if (l9 != null) {
            return new ContinueWatchRowResponse(l9.longValue(), l10, l11, l12, num, l13, f9, l14, movieResponse);
        }
        throw e.e("id", "id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        ContinueWatchRowResponse continueWatchRowResponse = (ContinueWatchRowResponse) obj;
        h.e(writer, "writer");
        if (continueWatchRowResponse != null) {
            writer.d();
            writer.x("id");
            this.f14086b.e(writer, Long.valueOf(continueWatchRowResponse.f14076a));
            writer.x("user_id");
            AbstractC1719k abstractC1719k = this.f14087c;
            abstractC1719k.e(writer, continueWatchRowResponse.f14077b);
            writer.x("movie_id");
            abstractC1719k.e(writer, continueWatchRowResponse.f14078c);
            writer.x("episode_id");
            abstractC1719k.e(writer, continueWatchRowResponse.f14079d);
            writer.x("episode_number");
            this.f14088d.e(writer, continueWatchRowResponse.f14080e);
            writer.x("time");
            abstractC1719k.e(writer, continueWatchRowResponse.f14081f);
            writer.x("percent");
            this.f14089e.e(writer, continueWatchRowResponse.f14082g);
            writer.x("updated_at");
            abstractC1719k.e(writer, continueWatchRowResponse.f14083h);
            writer.x("movie");
            this.f14090f.e(writer, continueWatchRowResponse.f14084i);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(46, "GeneratedJsonAdapter(ContinueWatchRowResponse)");
    }
}
