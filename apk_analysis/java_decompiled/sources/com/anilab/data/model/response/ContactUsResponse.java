package com.anilab.data.model.response;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class ContactUsResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f14059a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14060b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14061c;

    public ContactUsResponse(@InterfaceC1717i(name = "website") String str, @InterfaceC1717i(name = "twitter") String str2, @InterfaceC1717i(name = "telegram") String str3) {
        this.f14059a = str;
        this.f14060b = str2;
        this.f14061c = str3;
    }

    public final ContactUsResponse copy(@InterfaceC1717i(name = "website") String str, @InterfaceC1717i(name = "twitter") String str2, @InterfaceC1717i(name = "telegram") String str3) {
        return new ContactUsResponse(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactUsResponse)) {
            return false;
        }
        ContactUsResponse contactUsResponse = (ContactUsResponse) obj;
        return h.a(this.f14059a, contactUsResponse.f14059a) && h.a(this.f14060b, contactUsResponse.f14060b) && h.a(this.f14061c, contactUsResponse.f14061c);
    }

    public final int hashCode() {
        String str = this.f14059a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14060b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14061c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactUsResponse(website=");
        sb.append(this.f14059a);
        sb.append(", twitter=");
        sb.append(this.f14060b);
        sb.append(", telegram=");
        return AbstractC0953k1.q(sb, this.f14061c, ")");
    }
}
