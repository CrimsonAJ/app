package G2;

import com.anilab.data.model.response.HomeResponse;
import com.anilab.domain.model.Shortcut;
import java.util.List;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final s f2844a;

    /* renamed from: b, reason: collision with root package name */
    public final m f2845b;

    /* renamed from: c, reason: collision with root package name */
    public final h f2846c;

    public o(s movieMapper, m filterMapper, h continueWatchMapper) {
        kotlin.jvm.internal.h.e(movieMapper, "movieMapper");
        kotlin.jvm.internal.h.e(filterMapper, "filterMapper");
        kotlin.jvm.internal.h.e(continueWatchMapper, "continueWatchMapper");
        this.f2844a = movieMapper;
        this.f2845b = filterMapper;
        this.f2846c = continueWatchMapper;
    }

    @Override // G2.q
    public final Object n(Object obj) {
        HomeResponse dto = (HomeResponse) obj;
        kotlin.jvm.internal.h.e(dto, "dto");
        s sVar = this.f2844a;
        boolean z9 = true;
        List list = dto.f14158d;
        Integer num = dto.f14157c;
        if (num != null && num.intValue() == 1) {
            sVar.getClass();
            return new H2.m(AbstractC1570b.q(sVar, list));
        }
        String str = "";
        String str2 = dto.f14156b;
        String str3 = dto.f14155a;
        if (num != null && num.intValue() == 4) {
            if (str3 == null) {
                str3 = "";
            }
            if (str2 != null) {
                str = str2;
            }
            Shortcut shortcut = new Shortcut(str3, str, B7.t.f1135a, false);
            List list2 = dto.f14161g;
            h hVar = this.f2846c;
            hVar.getClass();
            return new H2.k(shortcut, AbstractC1570b.q(hVar, list2));
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str2 != null) {
            str = str2;
        }
        m mVar = this.f2845b;
        mVar.getClass();
        List q9 = AbstractC1570b.q(mVar, dto.f14159e);
        if (num == null || num.intValue() != 3) {
            z9 = false;
        }
        Shortcut shortcut2 = new Shortcut(str3, str, q9, z9);
        sVar.getClass();
        return new H2.l(shortcut2, AbstractC1570b.q(sVar, list));
    }
}
