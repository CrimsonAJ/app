package com.anilab.android.ui.helpCenter;

import A7.e;
import A7.f;
import B7.l;
import J1.N;
import M1.n;
import N1.s;
import N1.t;
import W.g;
import W1.c;
import W1.d;
import Y2.r;
import Z0.a;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;
import co.notix.R;
import i0.AbstractActivityC1369y;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class HelpCenterFragment extends d<c, N> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13771D0;

    public HelpCenterFragment() {
        e p9 = a.p(f.f545a, new N1.r(14, new N1.r(13, this)));
        this.f13771D0 = M4.a.i(this, p.a(c.class), new s(p9, 18), new s(p9, 19), new t(this, p9, 9));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_help_center;
    }

    @Override // M1.n
    public final M1.r h0() {
        return (c) this.f13771D0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.content.Intent] */
    @Override // M1.n
    public final void k0(int i9) {
        PackageManager packageManager;
        Intent intent;
        r rVar = this.f13771D0;
        PackageManager packageManager2 = null;
        switch (i9) {
            case R.id.buttonBack /* 2131361905 */:
                n.q0(this);
                return;
            case R.id.buttonTelegram /* 2131361966 */:
                try {
                    AbstractActivityC1369y k5 = k();
                    if (k5 != null) {
                        packageManager2 = k5.getPackageManager();
                    }
                    Intent B9 = M4.a.B(packageManager2, ((c) rVar.getValue()).f7867i);
                    h.b(B9);
                    d0(B9);
                    return;
                } catch (Exception unused) {
                    Toast.makeText(m(), R.string.msg_unknown_error, 0).show();
                    return;
                }
            case R.id.buttonTwitter /* 2131361967 */:
                try {
                    AbstractActivityC1369y k9 = k();
                    if (k9 != null) {
                        packageManager = k9.getPackageManager();
                    } else {
                        packageManager = null;
                    }
                    String xLink = ((c) rVar.getValue()).f7866h;
                    h.e(xLink, "xLink");
                    try {
                        try {
                            h.b(packageManager);
                            M4.a.q(packageManager, "com.twitter.android");
                            intent = new Intent("android.intent.action.VIEW", Uri.parse(xLink));
                            intent.setPackage("com.twitter.android");
                        } catch (Exception unused2) {
                            intent = packageManager2;
                            h.b(intent);
                            d0(intent);
                            return;
                        }
                    } catch (Exception unused3) {
                        packageManager2 = new Intent("android.intent.action.VIEW", Uri.parse(xLink));
                        intent = packageManager2;
                        h.b(intent);
                        d0(intent);
                        return;
                    }
                    h.b(intent);
                    d0(intent);
                    return;
                } catch (Exception unused4) {
                    Toast.makeText(m(), R.string.msg_unknown_error, 0).show();
                    return;
                }
            case R.id.buttonWebsite /* 2131361973 */:
                String str = ((c) rVar.getValue()).f7865g;
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse(str));
                    d0(intent2);
                    return;
                } catch (Exception unused5) {
                    return;
                }
            default:
                return;
        }
    }

    @Override // M1.n
    public final List m0(g gVar) {
        N n7 = (N) gVar;
        return l.b0(n7.f3728w, n7.f3730y, n7.f3729x, n7.f3727v);
    }

    @Override // M1.n
    public final void p0() {
    }
}
