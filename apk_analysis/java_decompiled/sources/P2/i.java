package P2;

import C2.g0;
import com.anilab.data.model.response.LoginResponse;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f5774a;

    /* renamed from: b, reason: collision with root package name */
    public final G2.x f5775b;

    public i(g0 userRepository, G2.x userMapper) {
        kotlin.jvm.internal.h.e(userRepository, "userRepository");
        kotlin.jvm.internal.h.e(userMapper, "userMapper");
        this.f5774a = userRepository;
        this.f5775b = userMapper;
    }

    public final H2.y a() {
        LoginResponse a5 = this.f5774a.a();
        if (a5 == null) {
            return null;
        }
        this.f5775b.getClass();
        return G2.x.a(a5);
    }
}
