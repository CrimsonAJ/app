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
public final class DownloaderResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14094a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14095b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14096c;

    public DownloaderResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14094a = C1499E.o("allow", "deeplink", "url_download");
        v vVar = v.f1137a;
        this.f14095b = moshi.b(Integer.class, vVar, "allow");
        this.f14096c = moshi.b(String.class, vVar, "deeplink");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Integer num = null;
        String str = null;
        String str2 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14094a);
            if (h02 != -1) {
                if (h02 != 0) {
                    AbstractC1719k abstractC1719k = this.f14096c;
                    if (h02 != 1) {
                        if (h02 == 2) {
                            str2 = (String) abstractC1719k.b(reader);
                        }
                    } else {
                        str = (String) abstractC1719k.b(reader);
                    }
                } else {
                    num = (Integer) this.f14095b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        return new DownloaderResponse(num, str, str2);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        DownloaderResponse downloaderResponse = (DownloaderResponse) obj;
        h.e(writer, "writer");
        if (downloaderResponse != null) {
            writer.d();
            writer.x("allow");
            this.f14095b.e(writer, downloaderResponse.f14091a);
            writer.x("deeplink");
            AbstractC1719k abstractC1719k = this.f14096c;
            abstractC1719k.e(writer, downloaderResponse.f14092b);
            writer.x("url_download");
            abstractC1719k.e(writer, downloaderResponse.f14093c);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(40, "GeneratedJsonAdapter(DownloaderResponse)");
    }
}
