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
public final class ReleaseCalendarResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14304a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14305b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14306c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14307d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1719k f14308e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1719k f14309f;

    public ReleaseCalendarResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14304a = C1499E.o("id", "movie_id", "episode_number", "episode_name", "datetime", "publish", "created_at", "created_by", "update_at", "movie");
        v vVar = v.f1137a;
        this.f14305b = moshi.b(Long.TYPE, vVar, "id");
        this.f14306c = moshi.b(Long.class, vVar, "movieId");
        this.f14307d = moshi.b(Integer.class, vVar, "episodeNumber");
        this.f14308e = moshi.b(String.class, vVar, "episodeName");
        this.f14309f = moshi.b(MovieResponse.class, vVar, "movie");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0030. Please report as an issue. */
    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        Long l10 = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        Integer num2 = null;
        Long l11 = null;
        String str3 = null;
        Long l12 = null;
        MovieResponse movieResponse = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14304a);
            AbstractC1719k abstractC1719k = this.f14307d;
            Long l13 = l9;
            AbstractC1719k abstractC1719k2 = this.f14308e;
            AbstractC1719k abstractC1719k3 = this.f14306c;
            switch (h02) {
                case -1:
                    reader.i0();
                    reader.j0();
                    l9 = l13;
                case 0:
                    l9 = (Long) this.f14305b.b(reader);
                    if (l9 == null) {
                        throw e.j("id", "id", reader);
                    }
                case 1:
                    l10 = (Long) abstractC1719k3.b(reader);
                    l9 = l13;
                case 2:
                    num = (Integer) abstractC1719k.b(reader);
                    l9 = l13;
                case 3:
                    str = (String) abstractC1719k2.b(reader);
                    l9 = l13;
                case 4:
                    str2 = (String) abstractC1719k2.b(reader);
                    l9 = l13;
                case 5:
                    num2 = (Integer) abstractC1719k.b(reader);
                    l9 = l13;
                case 6:
                    l11 = (Long) abstractC1719k3.b(reader);
                    l9 = l13;
                case 7:
                    str3 = (String) abstractC1719k2.b(reader);
                    l9 = l13;
                case 8:
                    l12 = (Long) abstractC1719k3.b(reader);
                    l9 = l13;
                case 9:
                    movieResponse = (MovieResponse) this.f14309f.b(reader);
                    if (movieResponse == null) {
                        throw e.j("movie", "movie", reader);
                    }
                    l9 = l13;
                default:
                    l9 = l13;
            }
        }
        Long l14 = l9;
        reader.s();
        if (l14 != null) {
            long longValue = l14.longValue();
            if (movieResponse != null) {
                return new ReleaseCalendarResponse(longValue, l10, num, str, str2, num2, l11, str3, l12, movieResponse);
            }
            throw e.e("movie", "movie", reader);
        }
        throw e.e("id", "id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        ReleaseCalendarResponse releaseCalendarResponse = (ReleaseCalendarResponse) obj;
        h.e(writer, "writer");
        if (releaseCalendarResponse != null) {
            writer.d();
            writer.x("id");
            this.f14305b.e(writer, Long.valueOf(releaseCalendarResponse.f14295a));
            writer.x("movie_id");
            AbstractC1719k abstractC1719k = this.f14306c;
            abstractC1719k.e(writer, releaseCalendarResponse.f14296b);
            writer.x("episode_number");
            AbstractC1719k abstractC1719k2 = this.f14307d;
            abstractC1719k2.e(writer, releaseCalendarResponse.f14297c);
            writer.x("episode_name");
            AbstractC1719k abstractC1719k3 = this.f14308e;
            abstractC1719k3.e(writer, releaseCalendarResponse.f14298d);
            writer.x("datetime");
            abstractC1719k3.e(writer, releaseCalendarResponse.f14299e);
            writer.x("publish");
            abstractC1719k2.e(writer, releaseCalendarResponse.f14300f);
            writer.x("created_at");
            abstractC1719k.e(writer, releaseCalendarResponse.f14301g);
            writer.x("created_by");
            abstractC1719k3.e(writer, releaseCalendarResponse.f14302h);
            writer.x("update_at");
            abstractC1719k.e(writer, releaseCalendarResponse.f14303i);
            writer.x("movie");
            this.f14309f.e(writer, releaseCalendarResponse.j);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(45, "GeneratedJsonAdapter(ReleaseCalendarResponse)");
    }
}
