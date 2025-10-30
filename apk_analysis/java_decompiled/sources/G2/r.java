package G2;

import com.anilab.data.model.response.MovieConfigResponse;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final l f2847a;

    public r(l filterConfigMapper) {
        kotlin.jvm.internal.h.e(filterConfigMapper, "filterConfigMapper");
        this.f2847a = filterConfigMapper;
    }

    @Override // G2.q
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H2.q n(MovieConfigResponse dto) {
        kotlin.jvm.internal.h.e(dto, "dto");
        l lVar = this.f2847a;
        lVar.getClass();
        return new H2.q(AbstractC1570b.q(lVar, dto.f14229a), AbstractC1570b.q(lVar, dto.f14230b), AbstractC1570b.q(lVar, dto.f14231c), dto.f14232d);
    }
}
