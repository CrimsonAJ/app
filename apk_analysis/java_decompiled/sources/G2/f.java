package G2;

import com.anilab.data.model.response.CommentResponse;

/* loaded from: classes.dex */
public final class f implements q {
    public static H2.c a(CommentResponse dto) {
        V7.j pVar;
        String h02;
        int i9;
        kotlin.jvm.internal.h.e(dto, "dto");
        int i10 = 0;
        String str = dto.f14045d;
        if (str == null) {
            h02 = "";
        } else {
            V7.j rVar = new B7.r(4, str);
            if (rVar instanceof V7.d) {
                pVar = ((V7.d) rVar).b();
            } else {
                pVar = new V7.p(rVar);
            }
            h02 = V7.l.h0(pVar, "\n");
            if (h02.length() > 501) {
                h02 = h02.substring(0, 500);
                kotlin.jvm.internal.h.d(h02, "substring(...)");
            }
        }
        String str2 = h02;
        Integer num = dto.f14046e;
        if (num != null) {
            i9 = num.intValue();
        } else {
            i9 = 0;
        }
        Integer num2 = dto.f14047f;
        if (num2 != null) {
            i10 = num2.intValue();
        }
        Boolean bool = Boolean.FALSE;
        return new H2.c(dto.f14042a, dto.f14043b, dto.f14044c, str2, i9, i10, dto.f14049h, dto.f14050i, null, bool, null, bool, dto.f14048g, false, false, false, false);
    }

    @Override // G2.q
    public final /* bridge */ /* synthetic */ Object n(Object obj) {
        return a((CommentResponse) obj);
    }
}
