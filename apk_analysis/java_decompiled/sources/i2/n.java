package i2;

import H2.z;
import M1.r;
import O2.P;
import O2.f0;
import b8.AbstractC0714M;
import b8.C0718Q;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n extends r {

    /* renamed from: f, reason: collision with root package name */
    public final P f18481f;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f18482g;

    /* renamed from: h, reason: collision with root package name */
    public final P2.e f18483h;

    /* renamed from: i, reason: collision with root package name */
    public final C0718Q f18484i;
    public final C0718Q j;

    /* renamed from: k, reason: collision with root package name */
    public int f18485k;

    public n(P getVoteMovieUseCase, f0 submitVoteMovieUseCase, P2.e checkLoginUserCase) {
        kotlin.jvm.internal.h.e(getVoteMovieUseCase, "getVoteMovieUseCase");
        kotlin.jvm.internal.h.e(submitVoteMovieUseCase, "submitVoteMovieUseCase");
        kotlin.jvm.internal.h.e(checkLoginUserCase, "checkLoginUserCase");
        this.f18481f = getVoteMovieUseCase;
        this.f18482g = submitVoteMovieUseCase;
        this.f18483h = checkLoginUserCase;
        ArrayList arrayList = new ArrayList(5);
        int i9 = 0;
        while (i9 < 5) {
            i9++;
            arrayList.add(new z(i9, 0));
        }
        this.f18484i = AbstractC0714M.c(arrayList);
        this.j = AbstractC0714M.c(k.f18468a);
    }
}
