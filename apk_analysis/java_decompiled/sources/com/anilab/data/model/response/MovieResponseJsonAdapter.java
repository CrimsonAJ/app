package com.anilab.data.model.response;

import A0.a;
import B7.v;
import co.notix.R;
import java.lang.reflect.Constructor;
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
public final class MovieResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14256a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14257b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14258c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14259d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1719k f14260e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1719k f14261f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1719k f14262g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Constructor f14263h;

    public MovieResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14256a = C1499E.o("id", "name_english", "name", "name_synonyms", "name_japanese", "overview", "poster_url", "premiered_season", "premiered_year", "type", "slug_english", "total_episodes", "latest_episode", "has_dub", "mal_score", "update_at", "genres", "in_watch_list", "rating_type", "quality", "is_pin");
        v vVar = v.f1137a;
        this.f14257b = moshi.b(Long.TYPE, vVar, "id");
        this.f14258c = moshi.b(String.class, vVar, "title");
        this.f14259d = moshi.b(Integer.class, vVar, "year");
        this.f14260e = moshi.b(Double.class, vVar, "score");
        this.f14261f = moshi.b(Long.class, vVar, "updateAt");
        this.f14262g = moshi.b(AbstractC1708D.f(GenreResponse.class), vVar, "genres");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x006f. Please report as an issue. */
    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        char c3;
        int i9;
        h.e(reader, "reader");
        reader.d();
        int i10 = -1;
        Long l9 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Integer num = null;
        Integer num2 = null;
        String str8 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Double d9 = null;
        Long l10 = null;
        List list = null;
        Integer num6 = null;
        String str9 = null;
        String str10 = null;
        Integer num7 = null;
        while (reader.F()) {
            switch (reader.h0(this.f14256a)) {
                case -1:
                    reader.i0();
                    reader.j0();
                case 0:
                    l9 = (Long) this.f14257b.b(reader);
                    if (l9 == null) {
                        throw e.j("id", "id", reader);
                    }
                case 1:
                    str = (String) this.f14258c.b(reader);
                case 2:
                    str2 = (String) this.f14258c.b(reader);
                case 3:
                    str3 = (String) this.f14258c.b(reader);
                case 4:
                    str4 = (String) this.f14258c.b(reader);
                case 5:
                    str5 = (String) this.f14258c.b(reader);
                case 6:
                    str6 = (String) this.f14258c.b(reader);
                case 7:
                    str7 = (String) this.f14258c.b(reader);
                case 8:
                    num = (Integer) this.f14259d.b(reader);
                case 9:
                    num2 = (Integer) this.f14259d.b(reader);
                case R.styleable.GradientColor_android_endX /* 10 */:
                    str8 = (String) this.f14258c.b(reader);
                case R.styleable.GradientColor_android_endY /* 11 */:
                    num3 = (Integer) this.f14259d.b(reader);
                case 12:
                    num4 = (Integer) this.f14259d.b(reader);
                case 13:
                    num5 = (Integer) this.f14259d.b(reader);
                case 14:
                    d9 = (Double) this.f14260e.b(reader);
                case 15:
                    l10 = (Long) this.f14261f.b(reader);
                case 16:
                    list = (List) this.f14262g.b(reader);
                case 17:
                    num6 = (Integer) this.f14259d.b(reader);
                    i9 = -131073;
                    i10 &= i9;
                case 18:
                    str9 = (String) this.f14258c.b(reader);
                    i9 = -262145;
                    i10 &= i9;
                case 19:
                    str10 = (String) this.f14258c.b(reader);
                    i9 = -524289;
                    i10 &= i9;
                case 20:
                    num7 = (Integer) this.f14259d.b(reader);
                    i9 = -1048577;
                    i10 &= i9;
            }
        }
        reader.s();
        if (i10 == -1966081) {
            if (l9 != null) {
                return new MovieResponse(l9.longValue(), str, str2, str3, str4, str5, str6, str7, num, num2, str8, num3, num4, num5, d9, l10, list, num6, str9, str10, num7);
            }
            throw e.e("id", "id", reader);
        }
        Constructor constructor = this.f14263h;
        if (constructor == null) {
            c3 = 15;
            constructor = MovieResponse.class.getDeclaredConstructor(Long.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, String.class, Integer.class, Integer.class, Integer.class, Double.class, Long.class, List.class, Integer.class, String.class, String.class, Integer.class, Integer.TYPE, e.f22208c);
            this.f14263h = constructor;
            h.d(constructor, "also(...)");
        } else {
            c3 = 15;
        }
        if (l9 != null) {
            Integer valueOf = Integer.valueOf(i10);
            Object[] objArr = new Object[23];
            objArr[0] = l9;
            objArr[1] = str;
            objArr[2] = str2;
            objArr[3] = str3;
            objArr[4] = str4;
            objArr[5] = str5;
            objArr[6] = str6;
            objArr[7] = str7;
            objArr[8] = num;
            objArr[9] = num2;
            objArr[10] = str8;
            objArr[11] = num3;
            objArr[12] = num4;
            objArr[13] = num5;
            objArr[14] = d9;
            objArr[c3] = l10;
            objArr[16] = list;
            objArr[17] = num6;
            objArr[18] = str9;
            objArr[19] = str10;
            objArr[20] = num7;
            objArr[21] = valueOf;
            objArr[22] = null;
            Object newInstance = constructor.newInstance(objArr);
            h.d(newInstance, "newInstance(...)");
            return (MovieResponse) newInstance;
        }
        throw e.e("id", "id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        MovieResponse movieResponse = (MovieResponse) obj;
        h.e(writer, "writer");
        if (movieResponse != null) {
            writer.d();
            writer.x("id");
            this.f14257b.e(writer, Long.valueOf(movieResponse.f14236a));
            writer.x("name_english");
            AbstractC1719k abstractC1719k = this.f14258c;
            abstractC1719k.e(writer, movieResponse.f14237b);
            writer.x("name");
            abstractC1719k.e(writer, movieResponse.f14238c);
            writer.x("name_synonyms");
            abstractC1719k.e(writer, movieResponse.f14239d);
            writer.x("name_japanese");
            abstractC1719k.e(writer, movieResponse.f14240e);
            writer.x("overview");
            abstractC1719k.e(writer, movieResponse.f14241f);
            writer.x("poster_url");
            abstractC1719k.e(writer, movieResponse.f14242g);
            writer.x("premiered_season");
            abstractC1719k.e(writer, movieResponse.f14243h);
            writer.x("premiered_year");
            AbstractC1719k abstractC1719k2 = this.f14259d;
            abstractC1719k2.e(writer, movieResponse.f14244i);
            writer.x("type");
            abstractC1719k2.e(writer, movieResponse.j);
            writer.x("slug_english");
            abstractC1719k.e(writer, movieResponse.f14245k);
            writer.x("total_episodes");
            abstractC1719k2.e(writer, movieResponse.f14246l);
            writer.x("latest_episode");
            abstractC1719k2.e(writer, movieResponse.f14247m);
            writer.x("has_dub");
            abstractC1719k2.e(writer, movieResponse.f14248n);
            writer.x("mal_score");
            this.f14260e.e(writer, movieResponse.f14249o);
            writer.x("update_at");
            this.f14261f.e(writer, movieResponse.f14250p);
            writer.x("genres");
            this.f14262g.e(writer, movieResponse.f14251q);
            writer.x("in_watch_list");
            abstractC1719k2.e(writer, movieResponse.f14252r);
            writer.x("rating_type");
            abstractC1719k.e(writer, movieResponse.f14253s);
            writer.x("quality");
            abstractC1719k.e(writer, movieResponse.f14254t);
            writer.x("is_pin");
            abstractC1719k2.e(writer, movieResponse.f14255u);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(35, "GeneratedJsonAdapter(MovieResponse)");
    }
}
