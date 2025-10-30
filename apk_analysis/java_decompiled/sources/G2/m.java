package G2;

import com.anilab.data.model.response.FilterResponse;

/* loaded from: classes.dex */
public final class m implements q {
    @Override // G2.q
    public final Object n(Object obj) {
        FilterResponse dto = (FilterResponse) obj;
        kotlin.jvm.internal.h.e(dto, "dto");
        String str = "";
        String str2 = dto.f14143a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = dto.f14144b;
        if (str3 != null) {
            str = str3;
        }
        return new H2.j(str2, str);
    }
}
