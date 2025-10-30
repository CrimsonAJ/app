package G2;

import com.anilab.data.model.response.SubResponse;

/* loaded from: classes.dex */
public final class v implements q {
    @Override // G2.q
    public final Object n(Object obj) {
        long j;
        String str;
        SubResponse dto = (SubResponse) obj;
        kotlin.jvm.internal.h.e(dto, "dto");
        Long l9 = dto.f14342a;
        if (l9 != null) {
            j = l9.longValue();
        } else {
            j = 0;
        }
        String str2 = dto.f14344c;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = dto.f14343b;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = dto.f14345d;
        if (str4 == null) {
            str = "";
        } else {
            str = str4;
        }
        return new I2.c(j, str2, str3, str);
    }
}
