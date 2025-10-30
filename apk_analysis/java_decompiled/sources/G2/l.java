package G2;

import com.anilab.data.model.response.FilterConfigResponse;
import com.anilab.domain.model.FilterConfig;

/* loaded from: classes.dex */
public final class l implements q {
    @Override // G2.q
    public final Object n(Object obj) {
        FilterConfigResponse dto = (FilterConfigResponse) obj;
        kotlin.jvm.internal.h.e(dto, "dto");
        String str = dto.f14139a;
        if (str == null) {
            str = "";
        }
        return new FilterConfig(str, dto.f14140b);
    }
}
