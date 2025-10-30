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
public final class PlayerResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14285a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14286b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14287c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14288d;

    public PlayerResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14285a = C1499E.o("id", "name", "logo_path", "is_free", "is_recommended", "star", "link_download", "deeplink");
        v vVar = v.f1137a;
        this.f14286b = moshi.b(Long.TYPE, vVar, "id");
        this.f14287c = moshi.b(String.class, vVar, "name");
        this.f14288d = moshi.b(Integer.class, vVar, "isFree");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str3 = null;
        String str4 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14285a);
            AbstractC1719k abstractC1719k = this.f14288d;
            AbstractC1719k abstractC1719k2 = this.f14287c;
            switch (h02) {
                case -1:
                    reader.i0();
                    reader.j0();
                    break;
                case 0:
                    l9 = (Long) this.f14286b.b(reader);
                    if (l9 == null) {
                        throw e.j("id", "id", reader);
                    }
                    break;
                case 1:
                    str = (String) abstractC1719k2.b(reader);
                    break;
                case 2:
                    str2 = (String) abstractC1719k2.b(reader);
                    break;
                case 3:
                    num = (Integer) abstractC1719k.b(reader);
                    break;
                case 4:
                    num2 = (Integer) abstractC1719k.b(reader);
                    break;
                case 5:
                    num3 = (Integer) abstractC1719k.b(reader);
                    break;
                case 6:
                    str3 = (String) abstractC1719k2.b(reader);
                    break;
                case 7:
                    str4 = (String) abstractC1719k2.b(reader);
                    break;
            }
        }
        reader.s();
        if (l9 != null) {
            return new PlayerResponse(l9.longValue(), str, str2, num, num2, num3, str3, str4);
        }
        throw e.e("id", "id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        PlayerResponse playerResponse = (PlayerResponse) obj;
        h.e(writer, "writer");
        if (playerResponse != null) {
            writer.d();
            writer.x("id");
            this.f14286b.e(writer, Long.valueOf(playerResponse.f14277a));
            writer.x("name");
            AbstractC1719k abstractC1719k = this.f14287c;
            abstractC1719k.e(writer, playerResponse.f14278b);
            writer.x("logo_path");
            abstractC1719k.e(writer, playerResponse.f14279c);
            writer.x("is_free");
            AbstractC1719k abstractC1719k2 = this.f14288d;
            abstractC1719k2.e(writer, playerResponse.f14280d);
            writer.x("is_recommended");
            abstractC1719k2.e(writer, playerResponse.f14281e);
            writer.x("star");
            abstractC1719k2.e(writer, playerResponse.f14282f);
            writer.x("link_download");
            abstractC1719k.e(writer, playerResponse.f14283g);
            writer.x("deeplink");
            abstractC1719k.e(writer, playerResponse.f14284h);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(36, "GeneratedJsonAdapter(PlayerResponse)");
    }
}
