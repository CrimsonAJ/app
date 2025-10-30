package G2;

import com.anilab.data.model.response.ReplyCommentsResponse;
import java.util.List;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public final class u implements q {

    /* renamed from: a, reason: collision with root package name */
    public final f f2850a;

    /* renamed from: b, reason: collision with root package name */
    public final w f2851b;

    /* renamed from: c, reason: collision with root package name */
    public final y f2852c;

    public u(f commentMapper, w userInfoMapper, y voteCommentMapper) {
        kotlin.jvm.internal.h.e(commentMapper, "commentMapper");
        kotlin.jvm.internal.h.e(userInfoMapper, "userInfoMapper");
        kotlin.jvm.internal.h.e(voteCommentMapper, "voteCommentMapper");
        this.f2850a = commentMapper;
        this.f2851b = userInfoMapper;
        this.f2852c = voteCommentMapper;
    }

    @Override // G2.q
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H2.w n(ReplyCommentsResponse dto) {
        kotlin.jvm.internal.h.e(dto, "dto");
        f fVar = this.f2850a;
        fVar.getClass();
        List q9 = AbstractC1570b.q(fVar, dto.f14310a);
        w wVar = this.f2851b;
        wVar.getClass();
        List q10 = AbstractC1570b.q(wVar, dto.f14311b);
        y yVar = this.f2852c;
        yVar.getClass();
        return new H2.w(q9, q10, AbstractC1570b.q(yVar, dto.f14312c));
    }
}
