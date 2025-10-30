package com.anilab.data.model.request;

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
public final class LoginRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13921a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13922b;

    public LoginRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13921a = C1499E.o("email", "password");
        this.f13922b = moshi.b(String.class, v.f1137a, "email");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        String str2 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13921a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f13922b;
                if (h02 != 0) {
                    if (h02 == 1 && (str2 = (String) abstractC1719k.b(reader)) == null) {
                        throw e.j("password", "password", reader);
                    }
                } else {
                    str = (String) abstractC1719k.b(reader);
                    if (str == null) {
                        throw e.j("email", "email", reader);
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
                return new LoginRequest(str, str2);
            }
            throw e.e("password", "password", reader);
        }
        throw e.e("email", "email", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        LoginRequest loginRequest = (LoginRequest) obj;
        h.e(writer, "writer");
        if (loginRequest != null) {
            writer.d();
            writer.x("email");
            String str = loginRequest.f13919a;
            AbstractC1719k abstractC1719k = this.f13922b;
            abstractC1719k.e(writer, str);
            writer.x("password");
            abstractC1719k.e(writer, loginRequest.f13920b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(34, "GeneratedJsonAdapter(LoginRequest)");
    }
}
