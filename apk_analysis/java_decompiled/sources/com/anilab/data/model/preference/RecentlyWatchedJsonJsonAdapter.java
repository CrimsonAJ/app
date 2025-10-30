package com.anilab.data.model.preference;

import A0.a;
import B7.v;
import java.util.List;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1708D;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;
import p7.e;

/* loaded from: classes.dex */
public final class RecentlyWatchedJsonJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13879a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13880b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f13881c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f13882d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1719k f13883e;

    public RecentlyWatchedJsonJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13879a = C1499E.o("animeId", "episodeId", "positionMs", "animeName", "animePoster", "animeYear", "animeAllNames");
        v vVar = v.f1137a;
        this.f13880b = moshi.b(Long.TYPE, vVar, "animeId");
        this.f13881c = moshi.b(String.class, vVar, "animeName");
        this.f13882d = moshi.b(Integer.TYPE, vVar, "year");
        this.f13883e = moshi.b(AbstractC1708D.f(String.class), vVar, "allNames");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003f. Please report as an issue. */
    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        Long l10 = null;
        Long l11 = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        List list = null;
        while (true) {
            Long l12 = l9;
            Long l13 = l10;
            Long l14 = l11;
            if (reader.F()) {
                int h02 = reader.h0(this.f13879a);
                Integer num2 = num;
                AbstractC1719k abstractC1719k = this.f13881c;
                AbstractC1719k abstractC1719k2 = this.f13880b;
                switch (h02) {
                    case -1:
                        reader.i0();
                        reader.j0();
                        l9 = l12;
                        l10 = l13;
                        l11 = l14;
                        num = num2;
                    case 0:
                        l9 = (Long) abstractC1719k2.b(reader);
                        if (l9 == null) {
                            throw e.j("animeId", "animeId", reader);
                        }
                        l10 = l13;
                        l11 = l14;
                        num = num2;
                    case 1:
                        l10 = (Long) abstractC1719k2.b(reader);
                        if (l10 != null) {
                            l9 = l12;
                            l11 = l14;
                            num = num2;
                        } else {
                            throw e.j("episodeId", "episodeId", reader);
                        }
                    case 2:
                        l11 = (Long) abstractC1719k2.b(reader);
                        if (l11 != null) {
                            l9 = l12;
                            l10 = l13;
                            num = num2;
                        } else {
                            throw e.j("positionMs", "positionMs", reader);
                        }
                    case 3:
                        str = (String) abstractC1719k.b(reader);
                        if (str == null) {
                            throw e.j("animeName", "animeName", reader);
                        }
                        l9 = l12;
                        l10 = l13;
                        l11 = l14;
                        num = num2;
                    case 4:
                        str2 = (String) abstractC1719k.b(reader);
                        if (str2 == null) {
                            throw e.j("animePoster", "animePoster", reader);
                        }
                        l9 = l12;
                        l10 = l13;
                        l11 = l14;
                        num = num2;
                    case 5:
                        num = (Integer) this.f13882d.b(reader);
                        if (num != null) {
                            l9 = l12;
                            l10 = l13;
                            l11 = l14;
                        } else {
                            throw e.j("year", "animeYear", reader);
                        }
                    case 6:
                        list = (List) this.f13883e.b(reader);
                        if (list == null) {
                            throw e.j("allNames", "animeAllNames", reader);
                        }
                        l9 = l12;
                        l10 = l13;
                        l11 = l14;
                        num = num2;
                    default:
                        l9 = l12;
                        l10 = l13;
                        l11 = l14;
                        num = num2;
                }
            } else {
                Integer num3 = num;
                reader.s();
                if (l12 != null) {
                    long longValue = l12.longValue();
                    if (l13 != null) {
                        long longValue2 = l13.longValue();
                        if (l14 != null) {
                            long longValue3 = l14.longValue();
                            if (str != null) {
                                if (str2 != null) {
                                    if (num3 != null) {
                                        int intValue = num3.intValue();
                                        if (list != null) {
                                            return new RecentlyWatchedJson(longValue, longValue2, longValue3, str, str2, intValue, list);
                                        }
                                        throw e.e("allNames", "animeAllNames", reader);
                                    }
                                    throw e.e("year", "animeYear", reader);
                                }
                                throw e.e("animePoster", "animePoster", reader);
                            }
                            throw e.e("animeName", "animeName", reader);
                        }
                        throw e.e("positionMs", "positionMs", reader);
                    }
                    throw e.e("episodeId", "episodeId", reader);
                }
                throw e.e("animeId", "animeId", reader);
            }
        }
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        RecentlyWatchedJson recentlyWatchedJson = (RecentlyWatchedJson) obj;
        h.e(writer, "writer");
        if (recentlyWatchedJson != null) {
            writer.d();
            writer.x("animeId");
            Long valueOf = Long.valueOf(recentlyWatchedJson.f13872a);
            AbstractC1719k abstractC1719k = this.f13880b;
            abstractC1719k.e(writer, valueOf);
            writer.x("episodeId");
            abstractC1719k.e(writer, Long.valueOf(recentlyWatchedJson.f13873b));
            writer.x("positionMs");
            abstractC1719k.e(writer, Long.valueOf(recentlyWatchedJson.f13874c));
            writer.x("animeName");
            String str = recentlyWatchedJson.f13875d;
            AbstractC1719k abstractC1719k2 = this.f13881c;
            abstractC1719k2.e(writer, str);
            writer.x("animePoster");
            abstractC1719k2.e(writer, recentlyWatchedJson.f13876e);
            writer.x("animeYear");
            this.f13882d.e(writer, Integer.valueOf(recentlyWatchedJson.f13877f));
            writer.x("animeAllNames");
            this.f13883e.e(writer, recentlyWatchedJson.f13878g);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(41, "GeneratedJsonAdapter(RecentlyWatchedJson)");
    }
}
