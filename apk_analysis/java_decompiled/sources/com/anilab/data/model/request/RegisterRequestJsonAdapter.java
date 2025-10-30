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
public final class RegisterRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13945a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13946b;

    public RegisterRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13945a = C1499E.o("email", "name", "password");
        this.f13946b = moshi.b(String.class, v.f1137a, "email");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13945a);
            if (h02 != -1) {
                AbstractC1719k abstractC1719k = this.f13946b;
                if (h02 != 0) {
                    if (h02 != 1) {
                        if (h02 == 2 && (str3 = (String) abstractC1719k.b(reader)) == null) {
                            throw e.j("password", "password", reader);
                        }
                    } else {
                        str2 = (String) abstractC1719k.b(reader);
                        if (str2 == null) {
                            throw e.j("name", "name", reader);
                        }
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
                if (str3 != null) {
                    return new RegisterRequest(str, str2, str3);
                }
                throw e.e("password", "password", reader);
            }
            throw e.e("name", "name", reader);
        }
        throw e.e("email", "email", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        RegisterRequest registerRequest = (RegisterRequest) obj;
        h.e(writer, "writer");
        if (registerRequest != null) {
            writer.d();
            writer.x("email");
            String str = registerRequest.f13942a;
            AbstractC1719k abstractC1719k = this.f13946b;
            abstractC1719k.e(writer, str);
            writer.x("name");
            abstractC1719k.e(writer, registerRequest.f13943b);
            writer.x("password");
            abstractC1719k.e(writer, registerRequest.f13944c);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(37, "GeneratedJsonAdapter(RegisterRequest)");
    }
}
