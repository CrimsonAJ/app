package G2;

import com.anilab.data.model.response.AvatarResponse;
import com.anilab.data.model.response.UserResponse;

/* loaded from: classes.dex */
public final class w implements q {
    public static H2.y a(UserResponse dto) {
        boolean z9;
        boolean z10;
        kotlin.jvm.internal.h.e(dto, "dto");
        Long valueOf = Long.valueOf(dto.f14369a);
        Integer num = dto.f14376h;
        if (num != null && num.intValue() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        Long l9 = dto.f14375g;
        if (l9 == null) {
            AvatarResponse avatarResponse = dto.f14374f;
            if (avatarResponse != null) {
                l9 = Long.valueOf(avatarResponse.f14013a);
            } else {
                l9 = null;
            }
        }
        Long l10 = l9;
        Integer num2 = dto.f14377i;
        if (num2 != null && num2.intValue() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new H2.y(valueOf, dto.f14370b, dto.f14371c, null, z9, l10, z10);
    }

    @Override // G2.q
    public final /* bridge */ /* synthetic */ Object n(Object obj) {
        return a((UserResponse) obj);
    }
}
