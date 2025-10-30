package com.anilab.data.model.response;

import A0.a;
import B7.v;
import java.lang.reflect.Type;
import java.util.List;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1708D;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;

/* loaded from: classes.dex */
public final class PageDataResponseJsonAdapter<T> extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14274a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14275b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14276c;

    public PageDataResponseJsonAdapter(y moshi, Type[] types) {
        h.e(moshi, "moshi");
        h.e(types, "types");
        if (types.length == 1) {
            this.f14274a = C1499E.o("page", "limit", "total_pages", "count", "rows");
            v vVar = v.f1137a;
            this.f14275b = moshi.b(Integer.class, vVar, "page");
            this.f14276c = moshi.b(AbstractC1708D.f(types[0]), vVar, "result");
            return;
        }
        throw new IllegalArgumentException(("TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received " + types.length).toString());
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        List list = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14274a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f14275b;
                if (h02 != 0) {
                    if (h02 != 1) {
                        if (h02 != 2) {
                            if (h02 != 3) {
                                if (h02 == 4) {
                                    list = (List) this.f14276c.b(reader);
                                }
                            } else {
                                num4 = (Integer) abstractC1719k.b(reader);
                            }
                        } else {
                            num3 = (Integer) abstractC1719k.b(reader);
                        }
                    } else {
                        num2 = (Integer) abstractC1719k.b(reader);
                    }
                } else {
                    num = (Integer) abstractC1719k.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new PageDataResponse(num, num2, num3, num4, list);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        PageDataResponse pageDataResponse = (PageDataResponse) obj;
        h.e(writer, "writer");
        if (pageDataResponse != null) {
            writer.d();
            writer.x("page");
            AbstractC1719k abstractC1719k = this.f14275b;
            abstractC1719k.e(writer, pageDataResponse.f14269a);
            writer.x("limit");
            abstractC1719k.e(writer, pageDataResponse.f14270b);
            writer.x("total_pages");
            abstractC1719k.e(writer, pageDataResponse.f14271c);
            writer.x("count");
            abstractC1719k.e(writer, pageDataResponse.f14272d);
            writer.x("rows");
            this.f14276c.e(writer, pageDataResponse.f14273e);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(38, "GeneratedJsonAdapter(PageDataResponse)");
    }
}
