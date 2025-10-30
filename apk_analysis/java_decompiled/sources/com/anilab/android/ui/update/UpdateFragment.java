package com.anilab.android.ui.update;

import A7.e;
import A7.f;
import B2.i;
import B7.l;
import C2.P;
import J1.E0;
import L1.I;
import L1.S;
import M1.D;
import W.g;
import W7.d;
import Y2.r;
import Y7.B;
import Y7.y0;
import Z0.a;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.lifecycle.Y;
import b5.G1;
import b8.C0718Q;
import co.notix.R;
import com.anilab.android.ui.update.UpdateFragment;
import com.anilab.domain.model.LatestVersion;
import f.b;
import g.C1188a;
import i0.AbstractActivityC1369y;
import i0.C1359o;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import o2.C1688o;
import o2.C1689p;
import q2.AbstractC1875d;
import q2.C1884m;
import q2.C1885n;
import q2.C1886o;
import q2.C1894w;
import q2.C1895x;
import u0.z;

/* loaded from: classes.dex */
public final class UpdateFragment extends AbstractC1875d<C1895x, E0> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13846D0;

    /* renamed from: E0, reason: collision with root package name */
    public final G1 f13847E0;

    /* renamed from: F0, reason: collision with root package name */
    public final r f13848F0;

    /* renamed from: G0, reason: collision with root package name */
    public final C1359o f13849G0;

    /* renamed from: H0, reason: collision with root package name */
    public final C1359o f13850H0;

    public UpdateFragment() {
        e p9 = a.p(f.f545a, new e2.e(24, new C1885n(this, 4)));
        this.f13846D0 = M4.a.i(this, p.a(C1895x.class), new C1688o(p9, 6), new C1688o(p9, 7), new C1689p(this, p9, 3));
        this.f13847E0 = new G1(p.a(C1886o.class), new C1885n(this, 3));
        this.f13848F0 = M4.a.i(this, p.a(S.class), new C1885n(this, 0), new C1885n(this, 1), new C1885n(this, 2));
        final int i9 = 0;
        this.f13849G0 = (C1359o) V(new b(this) { // from class: q2.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateFragment f22246b;

            {
                this.f22246b = this;
            }

            @Override // f.b
            public final void d(Object obj) {
                switch (i9) {
                    case 0:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        UpdateFragment updateFragment = this.f22246b;
                        if (booleanValue && updateFragment.t0()) {
                            updateFragment.y0(true);
                            C1895x h02 = updateFragment.h0();
                            y0 y0Var = h02.f22282l;
                            if (y0Var != null) {
                                y0Var.d(null);
                            }
                            h02.f22282l = h02.d(false, new C1894w(h02, null));
                            return;
                        }
                        updateFragment.o0(new D(R.string.msg_permission_denied));
                        return;
                    default:
                        UpdateFragment updateFragment2 = this.f22246b;
                        if (updateFragment2.s0()) {
                            InterfaceC1891t interfaceC1891t = (InterfaceC1891t) ((M1.t) updateFragment2.h0().f22280i.h()).f4751a;
                            if (interfaceC1891t instanceof C1888q) {
                                updateFragment2.w0(((C1888q) interfaceC1891t).f22266a);
                                return;
                            } else {
                                if (interfaceC1891t instanceof C1889r) {
                                    updateFragment2.x0(((C1889r) interfaceC1891t).f22267a);
                                    return;
                                }
                                return;
                            }
                        }
                        updateFragment2.o0(new D(R.string.msg_permission_denied));
                        return;
                }
            }
        }, new C1188a(1));
        final int i10 = 1;
        this.f13850H0 = (C1359o) V(new b(this) { // from class: q2.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateFragment f22246b;

            {
                this.f22246b = this;
            }

            @Override // f.b
            public final void d(Object obj) {
                switch (i10) {
                    case 0:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        UpdateFragment updateFragment = this.f22246b;
                        if (booleanValue && updateFragment.t0()) {
                            updateFragment.y0(true);
                            C1895x h02 = updateFragment.h0();
                            y0 y0Var = h02.f22282l;
                            if (y0Var != null) {
                                y0Var.d(null);
                            }
                            h02.f22282l = h02.d(false, new C1894w(h02, null));
                            return;
                        }
                        updateFragment.o0(new D(R.string.msg_permission_denied));
                        return;
                    default:
                        UpdateFragment updateFragment2 = this.f22246b;
                        if (updateFragment2.s0()) {
                            InterfaceC1891t interfaceC1891t = (InterfaceC1891t) ((M1.t) updateFragment2.h0().f22280i.h()).f4751a;
                            if (interfaceC1891t instanceof C1888q) {
                                updateFragment2.w0(((C1888q) interfaceC1891t).f22266a);
                                return;
                            } else {
                                if (interfaceC1891t instanceof C1889r) {
                                    updateFragment2.x0(((C1889r) interfaceC1891t).f22267a);
                                    return;
                                }
                                return;
                            }
                        }
                        updateFragment2.o0(new D(R.string.msg_permission_denied));
                        return;
                }
            }
        }, new C1188a(2));
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void F(Bundle bundle) {
        super.F(bundle);
        C1895x h02 = h0();
        C1886o c1886o = (C1886o) this.f13847E0.getValue();
        h02.getClass();
        LatestVersion latestVersion = c1886o.f22265a;
        C0718Q c0718q = h02.j;
        c0718q.getClass();
        c0718q.j(null, latestVersion);
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_update;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [r2.b, android.app.Dialog] */
    @Override // M1.n
    public final void k0(int i9) {
        switch (i9) {
            case R.id.buttonCancel /* 2131361908 */:
                y0(false);
                C1895x h02 = h0();
                y0 y0Var = h02.f22282l;
                if (y0Var != null) {
                    y0Var.d(null);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    h02.g();
                    return;
                }
                try {
                    File file = new File(h02.f22284n);
                    if (file.exists()) {
                        file.delete();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case R.id.buttonSkipVer /* 2131361963 */:
                S s9 = (S) this.f13848F0.getValue();
                s9.d(false, new I(s9, null));
                i0(R.id.goToHost, null);
                return;
            case R.id.buttonUpdateNow /* 2131361970 */:
                if (!t0()) {
                    AbstractActivityC1369y k5 = k();
                    if (k5 != null) {
                        String string = k5.getResources().getString(R.string.message_request_permission);
                        i iVar = new i(11, this);
                        String string2 = k5.getResources().getString(R.string.label_request_permission);
                        P p9 = new P(13);
                        String string3 = k5.getResources().getString(R.string.title_cancel);
                        ?? dialog = new Dialog(k5);
                        dialog.f22591a = "";
                        dialog.f22592b = string;
                        dialog.f22593c = string2;
                        dialog.f22594d = string3;
                        dialog.f22595e = iVar;
                        dialog.f22596f = p9;
                        dialog.show();
                        return;
                    }
                    return;
                }
                y0(true);
                C1895x h03 = h0();
                y0 y0Var2 = h03.f22282l;
                if (y0Var2 != null) {
                    y0Var2.d(null);
                }
                h03.f22282l = h03.d(false, new C1894w(h03, null));
                return;
            case R.id.textMoreInfo /* 2131362749 */:
                String str = h0().f22281k;
                if (d.U(str)) {
                    o0(new D(R.string.msg_unknown_error));
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.addCategory("android.intent.category.BROWSABLE");
                    intent.setFlags(268435456);
                    d0(intent);
                    return;
                } catch (Exception unused2) {
                    o0(new D(R.string.msg_unknown_error));
                    return;
                }
            default:
                return;
        }
    }

    @Override // M1.n
    public final List m0(g gVar) {
        E0 e02 = (E0) gVar;
        return l.b0(e02.f3666x, e02.f3664v, e02.f3665w, e02.f3661D);
    }

    @Override // M1.n
    public final void p0() {
        E0 e02 = (E0) e0();
        e02.f3663F.setText(((LatestVersion) h0().j.h()).f14409a);
        ((E0) e0()).f3660C.setMovementMethod(LinkMovementMethod.getInstance());
        B.r(Y.f(t()), null, new C1884m(null, this), 3);
    }

    public final boolean s0() {
        boolean canRequestPackageInstalls;
        AbstractActivityC1369y k5 = k();
        if (k5 != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                canRequestPackageInstalls = k5.getPackageManager().canRequestPackageInstalls();
                if (!canRequestPackageInstalls) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean t0() {
        AbstractActivityC1369y k5 = k();
        if (k5 != null) {
            if (Build.VERSION.SDK_INT < 30) {
                int a5 = E.d.a(k5, "android.permission.READ_EXTERNAL_STORAGE");
                int a9 = E.d.a(k5, "android.permission.WRITE_EXTERNAL_STORAGE");
                if (a5 == 0 && a9 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // M1.n
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public final C1895x h0() {
        return (C1895x) this.f13846D0.getValue();
    }

    public final void v0() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                this.f13850H0.a(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES").setData(Uri.parse(String.format("package:%s", Arrays.copyOf(new Object[]{W().getPackageName()}, 1)))));
            } catch (Exception unused) {
                o0(new D(R.string.msg_unknown_error));
            }
        }
    }

    public final void w0(File file) {
        if (!s0()) {
            v0();
            return;
        }
        if (file.exists()) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(z0(file), "application/vnd.android.package-archive");
                intent.addFlags(268435456);
                intent.addFlags(1);
                d0(intent);
                return;
            } catch (Exception unused) {
                o0(new D(R.string.msg_unknown_error));
                return;
            }
        }
        o0(new D(R.string.msg_unknown_error));
    }

    public final void x0(Uri uri) {
        if (!s0()) {
            v0();
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, "application/vnd.android.package-archive");
            intent.addFlags(268435456);
            intent.addFlags(1);
            d0(intent);
        } catch (Exception unused) {
            o0(new D(R.string.msg_unknown_error));
        }
    }

    public final void y0(boolean z9) {
        int i9;
        E0 e02 = (E0) e0();
        ConstraintLayout layoutDownloading = e02.f3658A;
        h.d(layoutDownloading, "layoutDownloading");
        int i10 = 8;
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        layoutDownloading.setVisibility(i9);
        AppCompatImageView imageMask = e02.f3668z;
        h.d(imageMask, "imageMask");
        if (z9) {
            i10 = 0;
        }
        imageMask.setVisibility(i10);
    }

    public final Uri z0(File file) {
        String substring;
        if (Build.VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        E.e c3 = FileProvider.c(X(), "com.anilab.android.provider");
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : c3.f1923b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (FileProvider.a(canonicalPath).startsWith(FileProvider.a(path) + '/') && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    substring = canonicalPath.substring(path2.length());
                } else {
                    substring = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme("content").authority(c3.f1922a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
            }
            throw new IllegalArgumentException(z.e("Failed to find configured root that contains ", canonicalPath));
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }
}
