package r4;

import C4.o;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: r4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1927b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final Status f22629a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f22630b;

    public C1927b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f22630b = googleSignInAccount;
        this.f22629a = status;
    }

    @Override // C4.o
    public final Status d() {
        return this.f22629a;
    }
}
