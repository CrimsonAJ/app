package G2;

import com.anilab.data.model.response.ReleaseCalendarResponse;
import com.anilab.domain.model.Movie;

/* loaded from: classes.dex */
public final class t implements q {

    /* renamed from: a, reason: collision with root package name */
    public final s f2849a;

    public t(s movieMapper) {
        kotlin.jvm.internal.h.e(movieMapper, "movieMapper");
        this.f2849a = movieMapper;
    }

    @Override // G2.q
    public final Object n(Object obj) {
        ReleaseCalendarResponse dto = (ReleaseCalendarResponse) obj;
        kotlin.jvm.internal.h.e(dto, "dto");
        Movie n7 = this.f2849a.n(dto.j);
        return new H2.v(dto.f14295a, dto.f14296b, dto.f14297c, dto.f14298d, dto.f14299e, dto.f14300f, dto.f14301g, dto.f14302h, dto.f14303i, n7);
    }
}
