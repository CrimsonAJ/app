package com.anilab.data.model.response;

import A0.a;
import B7.v;
import co.notix.R;
import java.util.List;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1708D;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;

/* loaded from: classes.dex */
public final class EpisodeDetailResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14118a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14119b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14120c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14121d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1719k f14122e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1719k f14123f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1719k f14124g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC1719k f14125h;

    public EpisodeDetailResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14118a = C1499E.o("id", "movie_id", "movie_mal_id", "number", "name", "name_english", "name_japanese", "slug", "slug_english", "overview", "aired", "is_filler", "publish", "created_at", "updated_at", "dataStream", "subs", "headers", "sub_intro", "sub_outro", "dub_intro", "dub_outro");
        v vVar = v.f1137a;
        this.f14119b = moshi.b(Long.class, vVar, "id");
        this.f14120c = moshi.b(Integer.class, vVar, "number");
        this.f14121d = moshi.b(String.class, vVar, "name");
        this.f14122e = moshi.b(StreamingResponse.class, vVar, "streaming");
        this.f14123f = moshi.b(AbstractC1708D.f(SubResponse.class), vVar, "subs");
        this.f14124g = moshi.b(AbstractC1708D.f(StreamHeadersResponse.class), vVar, "headers");
        this.f14125h = moshi.b(AbstractC1708D.f(String.class), vVar, "subIntro");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0047. Please report as an issue. */
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
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l12 = null;
        Long l13 = null;
        StreamingResponse streamingResponse = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14118a);
            AbstractC1719k abstractC1719k = this.f14120c;
            AbstractC1719k abstractC1719k2 = this.f14125h;
            Long l14 = l9;
            AbstractC1719k abstractC1719k3 = this.f14119b;
            Long l15 = l10;
            AbstractC1719k abstractC1719k4 = this.f14121d;
            switch (h02) {
                case -1:
                    reader.i0();
                    reader.j0();
                    l9 = l14;
                    l10 = l15;
                    break;
                case 0:
                    l9 = (Long) abstractC1719k3.b(reader);
                    l10 = l15;
                    break;
                case 1:
                    l10 = (Long) abstractC1719k3.b(reader);
                    l9 = l14;
                    break;
                case 2:
                    l11 = (Long) abstractC1719k3.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 3:
                    num = (Integer) abstractC1719k.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 4:
                    str = (String) abstractC1719k4.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 5:
                    str2 = (String) abstractC1719k4.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 6:
                    str3 = (String) abstractC1719k4.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 7:
                    str4 = (String) abstractC1719k4.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 8:
                    str5 = (String) abstractC1719k4.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 9:
                    str6 = (String) abstractC1719k4.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    str7 = (String) abstractC1719k4.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    num2 = (Integer) abstractC1719k.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 12:
                    num3 = (Integer) abstractC1719k.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 13:
                    l12 = (Long) abstractC1719k3.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 14:
                    l13 = (Long) abstractC1719k3.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 15:
                    streamingResponse = (StreamingResponse) this.f14122e.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 16:
                    list = (List) this.f14123f.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 17:
                    list2 = (List) this.f14124g.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 18:
                    list3 = (List) abstractC1719k2.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 19:
                    list4 = (List) abstractC1719k2.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 20:
                    list5 = (List) abstractC1719k2.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                case 21:
                    list6 = (List) abstractC1719k2.b(reader);
                    l9 = l14;
                    l10 = l15;
                    break;
                default:
                    l9 = l14;
                    l10 = l15;
                    break;
            }
        }
        reader.s();
        return new EpisodeDetailResponse(l9, l10, l11, num, str, str2, str3, str4, str5, str6, str7, num2, num3, l12, l13, streamingResponse, list, list2, list3, list4, list5, list6);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        EpisodeDetailResponse episodeDetailResponse = (EpisodeDetailResponse) obj;
        h.e(writer, "writer");
        if (episodeDetailResponse != null) {
            writer.d();
            writer.x("id");
            AbstractC1719k abstractC1719k = this.f14119b;
            abstractC1719k.e(writer, episodeDetailResponse.f14097a);
            writer.x("movie_id");
            abstractC1719k.e(writer, episodeDetailResponse.f14098b);
            writer.x("movie_mal_id");
            abstractC1719k.e(writer, episodeDetailResponse.f14099c);
            writer.x("number");
            AbstractC1719k abstractC1719k2 = this.f14120c;
            abstractC1719k2.e(writer, episodeDetailResponse.f14100d);
            writer.x("name");
            AbstractC1719k abstractC1719k3 = this.f14121d;
            abstractC1719k3.e(writer, episodeDetailResponse.f14101e);
            writer.x("name_english");
            abstractC1719k3.e(writer, episodeDetailResponse.f14102f);
            writer.x("name_japanese");
            abstractC1719k3.e(writer, episodeDetailResponse.f14103g);
            writer.x("slug");
            abstractC1719k3.e(writer, episodeDetailResponse.f14104h);
            writer.x("slug_english");
            abstractC1719k3.e(writer, episodeDetailResponse.f14105i);
            writer.x("overview");
            abstractC1719k3.e(writer, episodeDetailResponse.j);
            writer.x("aired");
            abstractC1719k3.e(writer, episodeDetailResponse.f14106k);
            writer.x("is_filler");
            abstractC1719k2.e(writer, episodeDetailResponse.f14107l);
            writer.x("publish");
            abstractC1719k2.e(writer, episodeDetailResponse.f14108m);
            writer.x("created_at");
            abstractC1719k.e(writer, episodeDetailResponse.f14109n);
            writer.x("updated_at");
            abstractC1719k.e(writer, episodeDetailResponse.f14110o);
            writer.x("dataStream");
            this.f14122e.e(writer, episodeDetailResponse.f14111p);
            writer.x("subs");
            this.f14123f.e(writer, episodeDetailResponse.f14112q);
            writer.x("headers");
            this.f14124g.e(writer, episodeDetailResponse.f14113r);
            writer.x("sub_intro");
            AbstractC1719k abstractC1719k4 = this.f14125h;
            abstractC1719k4.e(writer, episodeDetailResponse.f14114s);
            writer.x("sub_outro");
            abstractC1719k4.e(writer, episodeDetailResponse.f14115t);
            writer.x("dub_intro");
            abstractC1719k4.e(writer, episodeDetailResponse.f14116u);
            writer.x("dub_outro");
            abstractC1719k4.e(writer, episodeDetailResponse.f14117v);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(43, "GeneratedJsonAdapter(EpisodeDetailResponse)");
    }
}
