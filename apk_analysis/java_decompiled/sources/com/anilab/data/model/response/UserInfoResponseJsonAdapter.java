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
public final class UserInfoResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14367a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14368b;

    public UserInfoResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14367a = C1499E.o("user");
        this.f14368b = moshi.b(UserResponse.class, v.f1137a, "user");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        UserResponse userResponse = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14367a);
            if (h02 != -1) {
                if (h02 == 0 && (userResponse = (UserResponse) this.f14368b.b(reader)) == null) {
                    throw e.j("user", "user", reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (userResponse != null) {
            return new UserInfoResponse(userResponse);
        }
        throw e.e("user", "user", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        UserInfoResponse userInfoResponse = (UserInfoResponse) obj;
        h.e(writer, "writer");
        if (userInfoResponse != null) {
            writer.d();
            writer.x("user");
            this.f14368b.e(writer, userInfoResponse.f14366a);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(38, "GeneratedJsonAdapter(UserInfoResponse)");
    }
}
