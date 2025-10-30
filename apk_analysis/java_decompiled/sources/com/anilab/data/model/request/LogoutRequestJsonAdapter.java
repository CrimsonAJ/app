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
public final class LogoutRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13929a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13930b;

    public LogoutRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13929a = C1499E.o("refreshToken");
        this.f13930b = moshi.b(String.class, v.f1137a, "refreshToken");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13929a);
            if (h02 != -1) {
                if (h02 == 0 && (str = (String) this.f13930b.b(reader)) == null) {
                    throw e.j("refreshToken", "refreshToken", reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (str != null) {
            return new LogoutRequest(str);
        }
        throw e.e("refreshToken", "refreshToken", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        LogoutRequest logoutRequest = (LogoutRequest) obj;
        h.e(writer, "writer");
        if (logoutRequest != null) {
            writer.d();
            writer.x("refreshToken");
            this.f13930b.e(writer, logoutRequest.f13928a);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(35, "GeneratedJsonAdapter(LogoutRequest)");
    }
}
