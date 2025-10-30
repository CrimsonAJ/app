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
public final class EpisodeResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14131a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14132b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14133c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14134d;

    public EpisodeResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14131a = C1499E.o("id", "movie_id", "number", "is_filler", "slug_english");
        v vVar = v.f1137a;
        this.f14132b = moshi.b(Long.class, vVar, "id");
        this.f14133c = moshi.b(Integer.class, vVar, "number");
        this.f14134d = moshi.b(String.class, vVar, "slugEnglish");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        Long l10 = null;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14131a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f14132b;
                if (h02 != 0) {
                    if (h02 != 1) {
                        AbstractC1719k abstractC1719k2 = this.f14133c;
                        if (h02 != 2) {
                            if (h02 != 3) {
                                if (h02 == 4) {
                                    str = (String) this.f14134d.b(reader);
                                }
                            } else {
                                num2 = (Integer) abstractC1719k2.b(reader);
                            }
                        } else {
                            num = (Integer) abstractC1719k2.b(reader);
                        }
                    } else {
                        l10 = (Long) abstractC1719k.b(reader);
                    }
                } else {
                    l9 = (Long) abstractC1719k.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new EpisodeResponse(l9, l10, num, num2, str);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        EpisodeResponse episodeResponse = (EpisodeResponse) obj;
        h.e(writer, "writer");
        if (episodeResponse != null) {
            writer.d();
            writer.x("id");
            AbstractC1719k abstractC1719k = this.f14132b;
            abstractC1719k.e(writer, episodeResponse.f14126a);
            writer.x("movie_id");
            abstractC1719k.e(writer, episodeResponse.f14127b);
            writer.x("number");
            AbstractC1719k abstractC1719k2 = this.f14133c;
            abstractC1719k2.e(writer, episodeResponse.f14128c);
            writer.x("is_filler");
            abstractC1719k2.e(writer, episodeResponse.f14129d);
            writer.x("slug_english");
            this.f14134d.e(writer, episodeResponse.f14130e);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(37, "GeneratedJsonAdapter(EpisodeResponse)");
    }
}
