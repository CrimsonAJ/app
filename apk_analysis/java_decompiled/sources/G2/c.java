package G2;

import H2.C0158a;
import com.anilab.data.model.response.AvatarResponse;

/* loaded from: classes.dex */
public final class c implements q {
    @Override // G2.q
    public final Object n(Object obj) {
        AvatarResponse dto = (AvatarResponse) obj;
        kotlin.jvm.internal.h.e(dto, "dto");
        return new C0158a(dto.f14013a, W7.l.J(dto.f14014b, "{width}x{height}", "150x150"), dto.f14015c, dto.f14016d);
    }
}
