package G2;

import com.anilab.data.model.response.LatestVersionResponse;
import com.anilab.data.model.response.VersionSettingsResponse;

/* loaded from: classes.dex */
public final class b implements q {

    /* renamed from: a, reason: collision with root package name */
    public final p f2836a;

    public b(p lastVersionMapper) {
        kotlin.jvm.internal.h.e(lastVersionMapper, "lastVersionMapper");
        this.f2836a = lastVersionMapper;
    }

    @Override // G2.q
    public final Object n(Object obj) {
        VersionSettingsResponse dto = (VersionSettingsResponse) obj;
        kotlin.jvm.internal.h.e(dto, "dto");
        LatestVersionResponse latestVersionResponse = dto.f14385a;
        this.f2836a.getClass();
        return p.a(latestVersionResponse);
    }
}
