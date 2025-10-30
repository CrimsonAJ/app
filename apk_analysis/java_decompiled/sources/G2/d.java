package G2;

import com.anilab.data.model.response.CommentInfoResponse;
import com.anilab.data.model.response.CommentResponse;
import com.anilab.data.model.response.UserResponse;

/* loaded from: classes.dex */
public final class d implements q {

    /* renamed from: a, reason: collision with root package name */
    public final f f2837a;

    /* renamed from: b, reason: collision with root package name */
    public final w f2838b;

    public d(f commentMapper, w userMapper) {
        kotlin.jvm.internal.h.e(commentMapper, "commentMapper");
        kotlin.jvm.internal.h.e(userMapper, "userMapper");
        this.f2837a = commentMapper;
        this.f2838b = userMapper;
    }

    @Override // G2.q
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H2.d n(CommentInfoResponse dto) {
        H2.c cVar;
        kotlin.jvm.internal.h.e(dto, "dto");
        H2.y yVar = null;
        CommentResponse commentResponse = dto.f14024a;
        if (commentResponse != null) {
            this.f2837a.getClass();
            cVar = f.a(commentResponse);
        } else {
            cVar = null;
        }
        UserResponse userResponse = dto.f14025b;
        if (userResponse != null) {
            this.f2838b.getClass();
            yVar = w.a(userResponse);
        }
        return new H2.d(cVar, yVar);
    }
}
