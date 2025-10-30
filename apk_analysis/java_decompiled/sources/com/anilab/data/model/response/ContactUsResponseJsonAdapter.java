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
public final class ContactUsResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14062a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14063b;

    public ContactUsResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14062a = C1499E.o("website", "twitter", "telegram");
        this.f14063b = moshi.b(String.class, v.f1137a, "website");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14062a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f14063b;
                if (h02 != 0) {
                    if (h02 != 1) {
                        if (h02 == 2) {
                            str3 = (String) abstractC1719k.b(reader);
                        }
                    } else {
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
        return new ContactUsResponse(str, str2, str3);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        ContactUsResponse contactUsResponse = (ContactUsResponse) obj;
        h.e(writer, "writer");
        if (contactUsResponse != null) {
            writer.d();
            writer.x("website");
            AbstractC1719k abstractC1719k = this.f14063b;
            abstractC1719k.e(writer, contactUsResponse.f14059a);
            writer.x("twitter");
            abstractC1719k.e(writer, contactUsResponse.f14060b);
            writer.x("telegram");
            abstractC1719k.e(writer, contactUsResponse.f14061c);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(39, "GeneratedJsonAdapter(ContactUsResponse)");
    }
}
