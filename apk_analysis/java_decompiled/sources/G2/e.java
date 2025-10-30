package G2;

import com.anilab.data.model.response.CommentListResponse;
import java.util.List;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public final class e implements q {

    /* renamed from: a, reason: collision with root package name */
    public final f f2839a;

    /* renamed from: b, reason: collision with root package name */
    public final w f2840b;

    /* renamed from: c, reason: collision with root package name */
    public final y f2841c;

    public e(f commentMapper, w userInfoMapper, y voteCommentMapper) {
        kotlin.jvm.internal.h.e(commentMapper, "commentMapper");
        kotlin.jvm.internal.h.e(userInfoMapper, "userInfoMapper");
        kotlin.jvm.internal.h.e(voteCommentMapper, "voteCommentMapper");
        this.f2839a = commentMapper;
        this.f2840b = userInfoMapper;
        this.f2841c = voteCommentMapper;
    }

    @Override // G2.q
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H2.e n(CommentListResponse dto) {
        int i9;
        int i10;
        long j;
        kotlin.jvm.internal.h.e(dto, "dto");
        int i11 = 0;
        Integer num = dto.f14029a;
        if (num != null) {
            i9 = num.intValue();
        } else {
            i9 = 0;
        }
        Integer num2 = dto.f14030b;
        if (num2 != null) {
            i10 = num2.intValue();
        } else {
            i10 = 0;
        }
        Integer num3 = dto.f14031c;
        if (num3 != null) {
            i11 = num3.intValue();
        }
        int i12 = i11;
        Long l9 = dto.f14032d;
        if (l9 != null) {
            j = l9.longValue();
        } else {
            j = 0;
        }
        f fVar = this.f2839a;
        fVar.getClass();
        List q9 = AbstractC1570b.q(fVar, dto.f14033e);
        w wVar = this.f2840b;
        wVar.getClass();
        List q10 = AbstractC1570b.q(wVar, dto.f14034f);
        y yVar = this.f2841c;
        yVar.getClass();
        return new H2.e(i9, i10, i12, j, q9, q10, AbstractC1570b.q(yVar, dto.f14035g));
    }
}
