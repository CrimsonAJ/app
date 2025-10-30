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
public final class SubResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14346a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14347b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14348c;

    public SubResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14346a = C1499E.o("id", "lang_name", "lang_code", "path");
        v vVar = v.f1137a;
        this.f14347b = moshi.b(Long.class, vVar, "id");
        this.f14348c = moshi.b(String.class, vVar, "langName");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14346a);
            if (h02 != -1) {
                if (h02 != 0) {
                    AbstractC1719k abstractC1719k = this.f14348c;
                    if (h02 != 1) {
                        if (h02 != 2) {
                            if (h02 == 3) {
                                str3 = (String) abstractC1719k.b(reader);
                            }
                        } else {
                            str2 = (String) abstractC1719k.b(reader);
                        }
                    } else {
                        str = (String) abstractC1719k.b(reader);
                    }
                } else {
                    l9 = (Long) this.f14347b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new SubResponse(l9, str, str2, str3);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        SubResponse subResponse = (SubResponse) obj;
        h.e(writer, "writer");
        if (subResponse != null) {
            writer.d();
            writer.x("id");
            this.f14347b.e(writer, subResponse.f14342a);
            writer.x("lang_name");
            AbstractC1719k abstractC1719k = this.f14348c;
            abstractC1719k.e(writer, subResponse.f14343b);
            writer.x("lang_code");
            abstractC1719k.e(writer, subResponse.f14344c);
            writer.x("path");
            abstractC1719k.e(writer, subResponse.f14345d);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(33, "GeneratedJsonAdapter(SubResponse)");
    }
}
