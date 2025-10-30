package com.anilab.data.model.response;

import W.g;
import kotlin.jvm.internal.h;
import o7.InterfaceC1717i;
import o7.InterfaceC1720l;
import u0.z;

@InterfaceC1720l(generateAdapter = g.f7848s)
/* loaded from: classes.dex */
public final class UserResponse {

    /* renamed from: a, reason: collision with root package name */
    public final long f14369a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14370b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14371c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f14372d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14373e;

    /* renamed from: f, reason: collision with root package name */
    public final AvatarResponse f14374f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f14375g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f14376h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f14377i;

    public UserResponse(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "name") String name, @InterfaceC1717i(name = "email") String email, @InterfaceC1717i(name = "status") Integer num, @InterfaceC1717i(name = "country") String str, @InterfaceC1717i(name = "avatar") AvatarResponse avatarResponse, @InterfaceC1717i(name = "avatar_id") Long l9, @InterfaceC1717i(name = "is_email_verified") Integer num2, @InterfaceC1717i(name = "has_password") Integer num3) {
        h.e(name, "name");
        h.e(email, "email");
        this.f14369a = j;
        this.f14370b = name;
        this.f14371c = email;
        this.f14372d = num;
        this.f14373e = str;
        this.f14374f = avatarResponse;
        this.f14375g = l9;
        this.f14376h = num2;
        this.f14377i = num3;
    }

    public final UserResponse copy(@InterfaceC1717i(name = "id") long j, @InterfaceC1717i(name = "name") String name, @InterfaceC1717i(name = "email") String email, @InterfaceC1717i(name = "status") Integer num, @InterfaceC1717i(name = "country") String str, @InterfaceC1717i(name = "avatar") AvatarResponse avatarResponse, @InterfaceC1717i(name = "avatar_id") Long l9, @InterfaceC1717i(name = "is_email_verified") Integer num2, @InterfaceC1717i(name = "has_password") Integer num3) {
        h.e(name, "name");
        h.e(email, "email");
        return new UserResponse(j, name, email, num, str, avatarResponse, l9, num2, num3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserResponse)) {
            return false;
        }
        UserResponse userResponse = (UserResponse) obj;
        return this.f14369a == userResponse.f14369a && h.a(this.f14370b, userResponse.f14370b) && h.a(this.f14371c, userResponse.f14371c) && h.a(this.f14372d, userResponse.f14372d) && h.a(this.f14373e, userResponse.f14373e) && h.a(this.f14374f, userResponse.f14374f) && h.a(this.f14375g, userResponse.f14375g) && h.a(this.f14376h, userResponse.f14376h) && h.a(this.f14377i, userResponse.f14377i);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        long j = this.f14369a;
        int c3 = z.c(this.f14371c, z.c(this.f14370b, ((int) (j ^ (j >>> 32))) * 31, 31), 31);
        int i9 = 0;
        Integer num = this.f14372d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (c3 + hashCode) * 31;
        String str = this.f14373e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        AvatarResponse avatarResponse = this.f14374f;
        if (avatarResponse == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = avatarResponse.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Long l9 = this.f14375g;
        if (l9 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l9.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Integer num2 = this.f14376h;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        Integer num3 = this.f14377i;
        if (num3 != null) {
            i9 = num3.hashCode();
        }
        return i14 + i9;
    }

    public final String toString() {
        return "UserResponse(id=" + this.f14369a + ", name=" + this.f14370b + ", email=" + this.f14371c + ", status=" + this.f14372d + ", country=" + this.f14373e + ", avatar=" + this.f14374f + ", avatarId=" + this.f14375g + ", isEmailVerified=" + this.f14376h + ", hasPassword=" + this.f14377i + ")";
    }
}
