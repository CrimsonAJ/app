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
public final class TokenDataResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14360a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14361b;

    public TokenDataResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14360a = C1499E.o("access", "refresh");
        this.f14361b = moshi.b(TokenResponse.class, v.f1137a, "accessToken");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        TokenResponse tokenResponse = null;
        TokenResponse tokenResponse2 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14360a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f14361b;
                if (h02 != 0) {
                    if (h02 == 1 && (tokenResponse2 = (TokenResponse) abstractC1719k.b(reader)) == null) {
                        throw e.j("refreshToken", "refresh", reader);
                    }
                } else {
                    tokenResponse = (TokenResponse) abstractC1719k.b(reader);
                    if (tokenResponse == null) {
                        throw e.j("accessToken", "access", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (tokenResponse != null) {
            if (tokenResponse2 != null) {
                return new TokenDataResponse(tokenResponse, tokenResponse2);
            }
            throw e.e("refreshToken", "refresh", reader);
        }
        throw e.e("accessToken", "access", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        TokenDataResponse tokenDataResponse = (TokenDataResponse) obj;
        h.e(writer, "writer");
        if (tokenDataResponse != null) {
            writer.d();
            writer.x("access");
            TokenResponse tokenResponse = tokenDataResponse.f14358a;
            AbstractC1719k abstractC1719k = this.f14361b;
            abstractC1719k.e(writer, tokenResponse);
            writer.x("refresh");
            abstractC1719k.e(writer, tokenDataResponse.f14359b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(39, "GeneratedJsonAdapter(TokenDataResponse)");
    }
}
