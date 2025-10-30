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
public final class UpdateUserInfoRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13972a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13973b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f13974c;

    public UpdateUserInfoRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13972a = C1499E.o("avatar_id", "name");
        v vVar = v.f1137a;
        this.f13973b = moshi.b(Long.class, vVar, "avatarId");
        this.f13974c = moshi.b(String.class, vVar, "name");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        String str = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f13972a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 == 1 && (str = (String) this.f13974c.b(reader)) == null) {
                        throw e.j("name", "name", reader);
                    }
                } else {
                    l9 = (Long) this.f13973b.b(reader);
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (str != null) {
            return new UpdateUserInfoRequest(l9, str);
        }
        throw e.e("name", "name", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        UpdateUserInfoRequest updateUserInfoRequest = (UpdateUserInfoRequest) obj;
        h.e(writer, "writer");
        if (updateUserInfoRequest != null) {
            writer.d();
            writer.x("avatar_id");
            this.f13973b.e(writer, updateUserInfoRequest.f13970a);
            writer.x("name");
            this.f13974c.e(writer, updateUserInfoRequest.f13971b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(43, "GeneratedJsonAdapter(UpdateUserInfoRequest)");
    }
}
