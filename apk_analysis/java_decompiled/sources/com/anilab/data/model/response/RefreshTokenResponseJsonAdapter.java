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
public final class RefreshTokenResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14290a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14291b;

    public RefreshTokenResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14290a = C1499E.o("tokens");
        this.f14291b = moshi.b(TokenDataResponse.class, v.f1137a, "tokens");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        TokenDataResponse tokenDataResponse = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14290a);
            if (h02 != -1) {
                if (h02 == 0 && (tokenDataResponse = (TokenDataResponse) this.f14291b.b(reader)) == null) {
                    throw e.j("tokens", "tokens", reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (tokenDataResponse != null) {
            return new RefreshTokenResponse(tokenDataResponse);
        }
        throw e.e("tokens", "tokens", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        RefreshTokenResponse refreshTokenResponse = (RefreshTokenResponse) obj;
        h.e(writer, "writer");
        if (refreshTokenResponse != null) {
            writer.d();
            writer.x("tokens");
            this.f14291b.e(writer, refreshTokenResponse.f14289a);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(42, "GeneratedJsonAdapter(RefreshTokenResponse)");
    }
}
