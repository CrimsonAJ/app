package r4;

import F4.y;
import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1926a {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f22620a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22621b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22622c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22623d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22624e;

    /* renamed from: f, reason: collision with root package name */
    public final Account f22625f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22626g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f22627h;

    /* renamed from: i, reason: collision with root package name */
    public String f22628i;

    public C1926a() {
        this.f22620a = new HashSet();
        this.f22627h = new HashMap();
    }

    public C1926a(GoogleSignInOptions googleSignInOptions) {
        this.f22620a = new HashSet();
        this.f22627h = new HashMap();
        y.h(googleSignInOptions);
        this.f22620a = new HashSet(googleSignInOptions.f14564b);
        this.f22621b = googleSignInOptions.f14567e;
        this.f22622c = googleSignInOptions.f14568f;
        this.f22623d = googleSignInOptions.f14566d;
        this.f22624e = googleSignInOptions.f14569g;
        this.f22625f = googleSignInOptions.f14565c;
        this.f22626g = googleSignInOptions.f14570h;
        this.f22627h = GoogleSignInOptions.g(googleSignInOptions.f14571i);
        this.f22628i = googleSignInOptions.j;
    }
}
