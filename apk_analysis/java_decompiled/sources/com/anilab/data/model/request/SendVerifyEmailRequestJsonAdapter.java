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
public final class SendVerifyEmailRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13952a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13953b;

    public SendVerifyEmailRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13952a = C1499E.o("email");
        this.f13953b = moshi.b(String.class, v.f1137a, "email");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13952a);
            if (h02 != -1) {
                if (h02 == 0 && (str = (String) this.f13953b.b(reader)) == null) {
                    throw e.j("email", "email", reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (str != null) {
            return new SendVerifyEmailRequest(str);
        }
        throw e.e("email", "email", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        SendVerifyEmailRequest sendVerifyEmailRequest = (SendVerifyEmailRequest) obj;
        h.e(writer, "writer");
        if (sendVerifyEmailRequest != null) {
            writer.d();
            writer.x("email");
            this.f13953b.e(writer, sendVerifyEmailRequest.f13951a);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(44, "GeneratedJsonAdapter(SendVerifyEmailRequest)");
    }
}
