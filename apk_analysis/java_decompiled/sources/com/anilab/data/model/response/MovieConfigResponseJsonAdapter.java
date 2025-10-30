package com.anilab.data.model.response;

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
import p7.C1865c;
import p7.e;

/* loaded from: classes.dex */
public final class MovieConfigResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14233a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14234b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14235c;

    public MovieConfigResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14233a = C1499E.o("airingStatus", "types", "order", "orderDefault");
        C1865c f9 = AbstractC1708D.f(FilterConfigResponse.class);
        v vVar = v.f1137a;
        this.f14234b = moshi.b(f9, vVar, "airingStatus");
        this.f14235c = moshi.b(String.class, vVar, "orderDefault");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        List list = null;
        List list2 = null;
        List list3 = null;
        String str = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14233a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f14234b;
                if (h02 != 0) {
                    if (h02 != 1) {
                        if (h02 != 2) {
                            if (h02 == 3 && (str = (String) this.f14235c.b(reader)) == null) {
                                throw e.j("orderDefault", "orderDefault", reader);
                            }
                        } else {
                            list3 = (List) abstractC1719k.b(reader);
                            if (list3 == null) {
                                throw e.j("orders", "order", reader);
                            }
                        }
                    } else {
                        list2 = (List) abstractC1719k.b(reader);
                        if (list2 == null) {
                            throw e.j("movieTypes", "types", reader);
                        }
                    }
                } else {
                    list = (List) abstractC1719k.b(reader);
                    if (list == null) {
                        throw e.j("airingStatus", "airingStatus", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (str != null) {
                        return new MovieConfigResponse(list, list2, list3, str);
                    }
                    throw e.e("orderDefault", "orderDefault", reader);
                }
                throw e.e("orders", "order", reader);
            }
            throw e.e("movieTypes", "types", reader);
        }
        throw e.e("airingStatus", "airingStatus", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        MovieConfigResponse movieConfigResponse = (MovieConfigResponse) obj;
        h.e(writer, "writer");
        if (movieConfigResponse != null) {
            writer.d();
            writer.x("airingStatus");
            List list = movieConfigResponse.f14229a;
            AbstractC1719k abstractC1719k = this.f14234b;
            abstractC1719k.e(writer, list);
            writer.x("types");
            abstractC1719k.e(writer, movieConfigResponse.f14230b);
            writer.x("order");
            abstractC1719k.e(writer, movieConfigResponse.f14231c);
            writer.x("orderDefault");
            this.f14235c.e(writer, movieConfigResponse.f14232d);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(41, "GeneratedJsonAdapter(MovieConfigResponse)");
    }
}
