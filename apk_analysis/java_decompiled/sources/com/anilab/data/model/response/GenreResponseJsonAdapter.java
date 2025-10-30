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
public final class GenreResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14151a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14152b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14153c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14154d;

    public GenreResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14151a = C1499E.o("id", "name", "slug", "publish");
        v vVar = v.f1137a;
        this.f14152b = moshi.b(Long.TYPE, vVar, "id");
        this.f14153c = moshi.b(String.class, vVar, "name");
        this.f14154d = moshi.b(Integer.class, vVar, "publish");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14151a);
            if (h02 != -1) {
                if (h02 != 0) {
                    AbstractC1719k abstractC1719k = this.f14153c;
                    if (h02 != 1) {
                        if (h02 != 2) {
                            if (h02 == 3) {
                                num = (Integer) this.f14154d.b(reader);
                            }
                        } else {
                            str2 = (String) abstractC1719k.b(reader);
                        }
                    } else {
                        str = (String) abstractC1719k.b(reader);
                    }
                } else {
                    l9 = (Long) this.f14152b.b(reader);
                    if (l9 == null) {
                        throw e.j("id", "id", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (l9 != null) {
            return new GenreResponse(l9.longValue(), str, str2, num);
        }
        throw e.e("id", "id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        GenreResponse genreResponse = (GenreResponse) obj;
        h.e(writer, "writer");
        if (genreResponse != null) {
            writer.d();
            writer.x("id");
            this.f14152b.e(writer, Long.valueOf(genreResponse.f14147a));
            writer.x("name");
            AbstractC1719k abstractC1719k = this.f14153c;
            abstractC1719k.e(writer, genreResponse.f14148b);
            writer.x("slug");
            abstractC1719k.e(writer, genreResponse.f14149c);
            writer.x("publish");
            this.f14154d.e(writer, genreResponse.f14150d);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(35, "GeneratedJsonAdapter(GenreResponse)");
    }
}
