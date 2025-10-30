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
public final class InfoResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14171a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14172b;

    public InfoResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14171a = C1499E.o("ip", "country");
        this.f14172b = moshi.b(String.class, v.f1137a, "ip");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        String str2 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14171a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f14172b;
                if (h02 != 0) {
                    if (h02 == 1) {
                        str2 = (String) abstractC1719k.b(reader);
                    }
                } else {
                    str = (String) abstractC1719k.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new InfoResponse(str, str2);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        InfoResponse infoResponse = (InfoResponse) obj;
        h.e(writer, "writer");
        if (infoResponse != null) {
            writer.d();
            writer.x("ip");
            AbstractC1719k abstractC1719k = this.f14172b;
            abstractC1719k.e(writer, infoResponse.f14169a);
            writer.x("country");
            abstractC1719k.e(writer, infoResponse.f14170b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(34, "GeneratedJsonAdapter(InfoResponse)");
    }
}
