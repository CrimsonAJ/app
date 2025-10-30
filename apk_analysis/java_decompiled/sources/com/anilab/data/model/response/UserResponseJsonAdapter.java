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
public final class UserResponseJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f14378a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f14379b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1719k f14380c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1719k f14381d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1719k f14382e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1719k f14383f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1719k f14384g;

    public UserResponseJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f14378a = C1499E.o("id", "name", "email", "status", "country", "avatar", "avatar_id", "is_email_verified", "has_password");
        v vVar = v.f1137a;
        this.f14379b = moshi.b(Long.TYPE, vVar, "id");
        this.f14380c = moshi.b(String.class, vVar, "name");
        this.f14381d = moshi.b(Integer.class, vVar, "status");
        this.f14382e = moshi.b(String.class, vVar, "country");
        this.f14383f = moshi.b(AvatarResponse.class, vVar, "avatar");
        this.f14384g = moshi.b(Long.class, vVar, "avatarId");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x002d. Please report as an issue. */
    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        Long l9 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        AvatarResponse avatarResponse = null;
        Long l10 = null;
        Integer num2 = null;
        Integer num3 = null;
        while (reader.F()) {
            int h02 = reader.h0(this.f14378a);
            AbstractC1719k abstractC1719k = this.f14380c;
            Long l11 = l9;
            AbstractC1719k abstractC1719k2 = this.f14381d;
            switch (h02) {
                case -1:
                    reader.i0();
                    reader.j0();
                    l9 = l11;
                case 0:
                    l9 = (Long) this.f14379b.b(reader);
                    if (l9 == null) {
                        throw e.j("id", "id", reader);
                    }
                case 1:
                    str = (String) abstractC1719k.b(reader);
                    if (str == null) {
                        throw e.j("name", "name", reader);
                    }
                    l9 = l11;
                case 2:
                    str2 = (String) abstractC1719k.b(reader);
                    if (str2 == null) {
                        throw e.j("email", "email", reader);
                    }
                    l9 = l11;
                case 3:
                    num = (Integer) abstractC1719k2.b(reader);
                    l9 = l11;
                case 4:
                    str3 = (String) this.f14382e.b(reader);
                    l9 = l11;
                case 5:
                    avatarResponse = (AvatarResponse) this.f14383f.b(reader);
                    l9 = l11;
                case 6:
                    l10 = (Long) this.f14384g.b(reader);
                    l9 = l11;
                case 7:
                    num2 = (Integer) abstractC1719k2.b(reader);
                    l9 = l11;
                case 8:
                    num3 = (Integer) abstractC1719k2.b(reader);
                    l9 = l11;
                default:
                    l9 = l11;
            }
        }
        Long l12 = l9;
        reader.s();
        if (l12 != null) {
            long longValue = l12.longValue();
            if (str != null) {
                if (str2 != null) {
                    return new UserResponse(longValue, str, str2, num, str3, avatarResponse, l10, num2, num3);
                }
                throw e.e("email", "email", reader);
            }
            throw e.e("name", "name", reader);
        }
        throw e.e("id", "id", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        UserResponse userResponse = (UserResponse) obj;
        h.e(writer, "writer");
        if (userResponse != null) {
            writer.d();
            writer.x("id");
            this.f14379b.e(writer, Long.valueOf(userResponse.f14369a));
            writer.x("name");
            String str = userResponse.f14370b;
            AbstractC1719k abstractC1719k = this.f14380c;
            abstractC1719k.e(writer, str);
            writer.x("email");
            abstractC1719k.e(writer, userResponse.f14371c);
            writer.x("status");
            AbstractC1719k abstractC1719k2 = this.f14381d;
            abstractC1719k2.e(writer, userResponse.f14372d);
            writer.x("country");
            this.f14382e.e(writer, userResponse.f14373e);
            writer.x("avatar");
            this.f14383f.e(writer, userResponse.f14374f);
            writer.x("avatar_id");
            this.f14384g.e(writer, userResponse.f14375g);
            writer.x("is_email_verified");
            abstractC1719k2.e(writer, userResponse.f14376h);
            writer.x("has_password");
            abstractC1719k2.e(writer, userResponse.f14377i);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(34, "GeneratedJsonAdapter(UserResponse)");
    }
}
