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
public final class ChangePasswordRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13886a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13887b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f13888c;

    public ChangePasswordRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13886a = C1499E.o("old_password", "new_password");
        v vVar = v.f1137a;
        this.f13887b = moshi.b(String.class, vVar, "oldPassword");
        this.f13888c = moshi.b(String.class, vVar, "newPassword");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        String str2 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13886a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 == 1 && (str2 = (String) this.f13888c.b(reader)) == null) {
                        throw e.j("newPassword", "new_password", reader);
                    }
                } else {
                    str = (String) this.f13887b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (str2 != null) {
            return new ChangePasswordRequest(str, str2);
        }
        throw e.e("newPassword", "new_password", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        ChangePasswordRequest changePasswordRequest = (ChangePasswordRequest) obj;
        h.e(writer, "writer");
        if (changePasswordRequest != null) {
            writer.d();
            writer.x("old_password");
            this.f13887b.e(writer, changePasswordRequest.f13884a);
            writer.x("new_password");
            this.f13888c.e(writer, changePasswordRequest.f13885b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(43, "GeneratedJsonAdapter(ChangePasswordRequest)");
    }
}
