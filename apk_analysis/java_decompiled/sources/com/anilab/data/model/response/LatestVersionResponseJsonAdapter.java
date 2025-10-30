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
public final class LatestVersionResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14180a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14181b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14182c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14183d;

    public LatestVersionResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14180a = C1499E.o("id", "version", "version_code", "change_log", "link_download", "force_updated", "status");
        v vVar = v.f1137a;
        this.f14181b = moshi.b(Long.TYPE, vVar, "id");
        this.f14182c = moshi.b(String.class, vVar, "version");
        this.f14183d = moshi.b(Integer.class, vVar, "versionCode");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        Integer num2 = null;
        Integer num3 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14180a);
            AbstractC1719k abstractC1719k = this.f14182c;
            AbstractC1719k abstractC1719k2 = this.f14183d;
            switch (h02) {
                case -1:
                    reader.i0();
                    reader.j0();
                    break;
                case 0:
                    l9 = (Long) this.f14181b.b(reader);
                    if (l9 == null) {
                        throw e.j("id", "id", reader);
                    }
                    break;
                case 1:
                    str = (String) abstractC1719k.b(reader);
                    break;
                case 2:
                    num = (Integer) abstractC1719k2.b(reader);
                    break;
                case 3:
                    str2 = (String) abstractC1719k.b(reader);
                    break;
                case 4:
                    str3 = (String) abstractC1719k.b(reader);
                    break;
                case 5:
                    num2 = (Integer) abstractC1719k2.b(reader);
                    break;
                case 6:
                    num3 = (Integer) abstractC1719k2.b(reader);
                    break;
            }
        }
        reader.s();
        if (l9 != null) {
            return new LatestVersionResponse(l9.longValue(), str, num, str2, str3, num2, num3);
        }
        throw e.e("id", "id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        LatestVersionResponse latestVersionResponse = (LatestVersionResponse) obj;
        h.e(writer, "writer");
        if (latestVersionResponse != null) {
            writer.d();
            writer.x("id");
            this.f14181b.e(writer, Long.valueOf(latestVersionResponse.f14173a));
            writer.x("version");
            AbstractC1719k abstractC1719k = this.f14182c;
            abstractC1719k.e(writer, latestVersionResponse.f14174b);
            writer.x("version_code");
            AbstractC1719k abstractC1719k2 = this.f14183d;
            abstractC1719k2.e(writer, latestVersionResponse.f14175c);
            writer.x("change_log");
            abstractC1719k.e(writer, latestVersionResponse.f14176d);
            writer.x("link_download");
            abstractC1719k.e(writer, latestVersionResponse.f14177e);
            writer.x("force_updated");
            abstractC1719k2.e(writer, latestVersionResponse.f14178f);
            writer.x("status");
            abstractC1719k2.e(writer, latestVersionResponse.f14179g);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(43, "GeneratedJsonAdapter(LatestVersionResponse)");
    }
}
