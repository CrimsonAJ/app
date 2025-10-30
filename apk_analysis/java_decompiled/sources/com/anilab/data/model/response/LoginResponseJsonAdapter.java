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
public final class LoginResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14202a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14203b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14204c;

    public LoginResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14202a = C1499E.o("user", "tokens");
        v vVar = v.f1137a;
        this.f14203b = moshi.b(UserResponse.class, vVar, "user");
        this.f14204c = moshi.b(TokenDataResponse.class, vVar, "tokens");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        UserResponse userResponse = null;
        TokenDataResponse tokenDataResponse = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14202a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 == 1 && (tokenDataResponse = (TokenDataResponse) this.f14204c.b(reader)) == null) {
                        throw e.j("tokens", "tokens", reader);
                    }
                } else {
                    userResponse = (UserResponse) this.f14203b.b(reader);
                    if (userResponse == null) {
                        throw e.j("user", "user", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (userResponse != null) {
            if (tokenDataResponse != null) {
                return new LoginResponse(userResponse, tokenDataResponse);
            }
            throw e.e("tokens", "tokens", reader);
        }
        throw e.e("user", "user", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        LoginResponse loginResponse = (LoginResponse) obj;
        h.e(writer, "writer");
        if (loginResponse != null) {
            writer.d();
            writer.x("user");
            this.f14203b.e(writer, loginResponse.f14200a);
            writer.x("tokens");
            this.f14204c.e(writer, loginResponse.f14201b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(35, "GeneratedJsonAdapter(LoginResponse)");
    }
}
