package G2;

import com.anilab.data.model.response.ContinueWatchRowResponse;
import com.anilab.data.model.response.MovieResponse;
import com.anilab.domain.model.Movie;

/* loaded from: classes.dex */
public final class h implements q {

    /* renamed from: a, reason: collision with root package name */
    public final s f2842a;

    public h(s movieMapper) {
        kotlin.jvm.internal.h.e(movieMapper, "movieMapper");
        this.f2842a = movieMapper;
    }

    @Override // G2.q
    public final Object n(Object obj) {
        int i9;
        long j;
        Movie movie;
        ContinueWatchRowResponse dto = (ContinueWatchRowResponse) obj;
        kotlin.jvm.internal.h.e(dto, "dto");
        int i10 = 0;
        Integer num = dto.f14080e;
        if (num != null) {
            i9 = num.intValue();
        } else {
            i9 = 0;
        }
        long j4 = 0;
        Long l9 = dto.f14081f;
        if (l9 != null) {
            j = l9.longValue();
        } else {
            j = 0;
        }
        Float f9 = dto.f14082g;
        if (f9 != null) {
            float floatValue = f9.floatValue();
            if (!Float.isNaN(floatValue)) {
                i10 = Math.round(floatValue);
            } else {
                throw new IllegalArgumentException("Cannot round NaN value.");
            }
        }
        int i11 = i10;
        Long l10 = dto.f14083h;
        if (l10 != null) {
            j4 = l10.longValue();
        }
        long j9 = j4;
        MovieResponse movieResponse = dto.f14084i;
        if (movieResponse != null) {
            movie = this.f2842a.n(movieResponse);
        } else {
            movie = null;
        }
        return new H2.g(dto.f14076a, dto.f14077b, dto.f14078c, dto.f14079d, i9, j, i11, j9, movie);
    }
}
