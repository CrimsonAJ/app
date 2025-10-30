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
public final class ForgotPasswordRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13917a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13918b;

    public ForgotPasswordRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13917a = C1499E.o("email");
        this.f13918b = moshi.b(String.class, v.f1137a, "email");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13917a);
            if (h02 != -1) {
                if (h02 == 0 && (str = (String) this.f13918b.b(reader)) == null) {
                    throw e.j("email", "email", reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (str != null) {
            return new ForgotPasswordRequest(str);
        }
        throw e.e("email", "email", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        ForgotPasswordRequest forgotPasswordRequest = (ForgotPasswordRequest) obj;
        h.e(writer, "writer");
        if (forgotPasswordRequest != null) {
            writer.d();
            writer.x("email");
            this.f13918b.e(writer, forgotPasswordRequest.f13916a);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(43, "GeneratedJsonAdapter(ForgotPasswordRequest)");
    }
}
