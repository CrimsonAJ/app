package h2;

import A7.n;
import F4.y;
import G7.j;
import L1.P;
import L1.S;
import M1.t;
import O7.p;
import a.AbstractC0485a;
import android.accounts.Account;
import b2.m;
import com.anilab.android.ui.activity.MainActivity;
import com.anilab.android.ui.profile.ProfileFragment;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import i0.AbstractActivityC1369y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1270b extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17868r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f17869s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1270b(E7.d dVar, ProfileFragment profileFragment) {
        super(2, dVar);
        this.f17869s = profileFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1270b c1270b = new C1270b(dVar, this.f17869s);
        c1270b.f17868r = obj;
        return c1270b;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1270b c1270b = (C1270b) create((t) obj, (E7.d) obj2);
        n nVar = n.f558a;
        c1270b.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((t) this.f17868r).a();
        if (a5 != null && ((Boolean) a5).booleanValue()) {
            ProfileFragment profileFragment = this.f17869s;
            S s9 = (S) profileFragment.f13819E0.getValue();
            MainActivity mainActivity = null;
            s9.d(false, new P(m.f10498c, false, s9, null));
            AbstractActivityC1369y k5 = profileFragment.k();
            if (k5 instanceof MainActivity) {
                mainActivity = (MainActivity) k5;
            }
            if (mainActivity != null) {
                mainActivity.T();
            }
            AbstractActivityC1369y k9 = profileFragment.k();
            if (k9 != null) {
                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f14556k;
                new HashSet();
                new HashMap();
                y.h(googleSignInOptions);
                HashSet hashSet = new HashSet(googleSignInOptions.f14564b);
                boolean z9 = googleSignInOptions.f14566d;
                String str = googleSignInOptions.f14569g;
                Account account = googleSignInOptions.f14565c;
                String str2 = googleSignInOptions.f14570h;
                HashMap g9 = GoogleSignInOptions.g(googleSignInOptions.f14571i);
                String str3 = googleSignInOptions.j;
                if (hashSet.contains(GoogleSignInOptions.f14561p)) {
                    Scope scope = GoogleSignInOptions.f14560o;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                if (z9 && (account == null || !hashSet.isEmpty())) {
                    hashSet.add(GoogleSignInOptions.f14559n);
                }
                s8.e.x(k9, new GoogleSignInOptions(3, new ArrayList(hashSet), account, z9, googleSignInOptions.f14567e, googleSignInOptions.f14568f, str, str2, g9, str3)).d();
            }
            profileFragment.s0();
        }
        return n.f558a;
    }
}
