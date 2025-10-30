package com.anilab.data.model.response;

import W.g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class EpisodeResponse {

    /* renamed from: a, reason: collision with root package name */
    public final Long f14126a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f14127b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f14128c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f14129d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14130e;

    public EpisodeResponse(@InterfaceC1717i(name = "id") Long l9, @InterfaceC1717i(name = "movie_id") Long l10, @InterfaceC1717i(name = "number") Integer num, @InterfaceC1717i(name = "is_filler") Integer num2, @InterfaceC1717i(name = "slug_english") String str) {
        this.f14126a = l9;
        this.f14127b = l10;
        this.f14128c = num;
        this.f14129d = num2;
        this.f14130e = str;
    }

    public final EpisodeResponse copy(@InterfaceC1717i(name = "id") Long l9, @InterfaceC1717i(name = "movie_id") Long l10, @InterfaceC1717i(name = "number") Integer num, @InterfaceC1717i(name = "is_filler") Integer num2, @InterfaceC1717i(name = "slug_english") String str) {
        return new EpisodeResponse(l9, l10, num, num2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodeResponse)) {
            return false;
        }
        EpisodeResponse episodeResponse = (EpisodeResponse) obj;
        return h.a(this.f14126a, episodeResponse.f14126a) && h.a(this.f14127b, episodeResponse.f14127b) && h.a(this.f14128c, episodeResponse.f14128c) && h.a(this.f14129d, episodeResponse.f14129d) && h.a(this.f14130e, episodeResponse.f14130e);
    }

    public final int hashCode() {
        Long l9 = this.f14126a;
        int hashCode = (l9 == null ? 0 : l9.hashCode()) * 31;
        Long l10 = this.f14127b;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num = this.f14128c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f14129d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f14130e;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EpisodeResponse(id=");
        sb.append(this.f14126a);
        sb.append(", movieId=");
        sb.append(this.f14127b);
        sb.append(", number=");
        sb.append(this.f14128c);
        sb.append(", isFiller=");
        sb.append(this.f14129d);
        sb.append(", slugEnglish=");
        return AbstractC0953k1.q(sb, this.f14130e, ")");
    }
}
