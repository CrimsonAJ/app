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
public final class TokenResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14364a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14365b;

    public TokenResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14364a = C1499E.o("token", "expires");
        this.f14365b = moshi.b(String.class, v.f1137a, "token");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        String str2 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14364a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f14365b;
                if (h02 != 0) {
                    if (h02 == 1 && (str2 = (String) abstractC1719k.b(reader)) == null) {
                        throw e.j("expires", "expires", reader);
                    }
                } else {
                    str = (String) abstractC1719k.b(reader);
                    if (str == null) {
                        throw e.j("token", "token", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (str != null) {
            if (str2 != null) {
                return new TokenResponse(str, str2);
            }
            throw e.e("expires", "expires", reader);
        }
        throw e.e("token", "token", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        TokenResponse tokenResponse = (TokenResponse) obj;
        h.e(writer, "writer");
        if (tokenResponse != null) {
            writer.d();
            writer.x("token");
            String str = tokenResponse.f14362a;
            AbstractC1719k abstractC1719k = this.f14365b;
            abstractC1719k.e(writer, str);
            writer.x("expires");
            abstractC1719k.e(writer, tokenResponse.f14363b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(35, "GeneratedJsonAdapter(TokenResponse)");
    }
}
