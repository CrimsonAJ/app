package G2;

import com.anilab.data.model.response.AvatarResponse;
import com.anilab.data.model.response.LoginResponse;
import com.anilab.data.model.response.UserResponse;

/* loaded from: classes.dex */
public final class x implements q {
    public static H2.y a(LoginResponse dto) {
        String str;
        boolean z9;
        kotlin.jvm.internal.h.e(dto, "dto");
        Long valueOf = Long.valueOf(dto.f14200a.f14369a);
        UserResponse userResponse = dto.f14200a;
        String str2 = userResponse.f14370b;
        String str3 = userResponse.f14371c;
        AvatarResponse avatarResponse = userResponse.f14374f;
        Long l9 = null;
        if (avatarResponse != null) {
            str = avatarResponse.f14014b;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String J8 = W7.l.J(str, "{width}x{height}", "150x150");
        Integer num = dto.f14200a.f14376h;
        boolean z10 = true;
        if (num != null && num.intValue() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AvatarResponse avatarResponse2 = dto.f14200a.f14374f;
        if (avatarResponse2 != null) {
            l9 = Long.valueOf(avatarResponse2.f14013a);
        }
        Integer num2 = dto.f14200a.f14377i;
        if (num2 == null || num2.intValue() != 1) {
            z10 = false;
        }
        return new H2.y(valueOf, str2, str3, J8, z9, l9, z10);
    }

    @Override // G2.q
    public final /* bridge */ /* synthetic */ Object n(Object obj) {
        return a((LoginResponse) obj);
    }
}
