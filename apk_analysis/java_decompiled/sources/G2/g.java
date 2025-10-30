package G2;

import com.anilab.data.model.response.ContactUsResponse;

/* loaded from: classes.dex */
public final class g implements q {
    @Override // G2.q
    public final Object n(Object obj) {
        ContactUsResponse dto = (ContactUsResponse) obj;
        kotlin.jvm.internal.h.e(dto, "dto");
        String str = "";
        String str2 = dto.f14059a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = dto.f14060b;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = dto.f14061c;
        if (str4 != null) {
            str = str4;
        }
        return new H2.f(str2, str3, str);
    }
}
