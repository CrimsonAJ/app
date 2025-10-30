package com.google.android.gms.auth.api.signin.internal;

import C4.m;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.lifecycle.InterfaceC0561w;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.firebase.messaging.u;
import i0.AbstractActivityC1369y;
import java.lang.reflect.Modifier;
import k4.C1499E;
import n0.C1601a;
import n0.C1602b;
import n0.C1603c;
import s.C1940j;
import s4.C1955b;
import s4.C1957d;
import s4.i;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends AbstractActivityC1369y {

    /* renamed from: D, reason: collision with root package name */
    public static boolean f14577D = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f14578A;

    /* renamed from: B, reason: collision with root package name */
    public int f14579B;

    /* renamed from: C, reason: collision with root package name */
    public Intent f14580C;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14581y = false;

    /* renamed from: z, reason: collision with root package name */
    public SignInConfiguration f14582z;

    public final void R() {
        C1499E i9 = C1499E.i(this);
        u uVar = new u((Object) this);
        C1603c c1603c = (C1603c) i9.f19986c;
        if (!c1603c.f21008e) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                C1940j c1940j = c1603c.f21007d;
                C1601a c1601a = (C1601a) c1940j.e(0);
                InterfaceC0561w interfaceC0561w = (InterfaceC0561w) i9.f19985b;
                if (c1601a == null) {
                    try {
                        c1603c.f21008e = true;
                        C1957d c1957d = new C1957d(this, m.a());
                        if (C1957d.class.isMemberClass() && !Modifier.isStatic(C1957d.class.getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c1957d);
                        }
                        C1601a c1601a2 = new C1601a(c1957d);
                        c1940j.h(0, c1601a2);
                        c1603c.f21008e = false;
                        C1602b c1602b = new C1602b(c1601a2.f21001l, uVar);
                        c1601a2.d(interfaceC0561w, c1602b);
                        C1602b c1602b2 = c1601a2.f21003n;
                        if (c1602b2 != null) {
                            c1601a2.h(c1602b2);
                        }
                        c1601a2.f21002m = interfaceC0561w;
                        c1601a2.f21003n = c1602b;
                    } catch (Throwable th) {
                        c1603c.f21008e = false;
                        throw th;
                    }
                } else {
                    C1602b c1602b3 = new C1602b(c1601a.f21001l, uVar);
                    c1601a.d(interfaceC0561w, c1602b3);
                    C1602b c1602b4 = c1601a.f21003n;
                    if (c1602b4 != null) {
                        c1601a.h(c1602b4);
                    }
                    c1601a.f21002m = interfaceC0561w;
                    c1601a.f21003n = c1602b3;
                }
                f14577D = false;
                return;
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final void S(int i9) {
        Status status = new Status(i9, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f14577D = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // i0.AbstractActivityC1369y, d.AbstractActivityC1071l, android.app.Activity
    public final void onActivityResult(int i9, int i10, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (!this.f14581y) {
            setResult(0);
            if (i9 != 40962) {
                return;
            }
            if (intent != null) {
                SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                if (signInAccount != null && (googleSignInAccount = signInAccount.f14573b) != null) {
                    i U8 = i.U(this);
                    GoogleSignInOptions googleSignInOptions = this.f14582z.f14576b;
                    synchronized (U8) {
                        ((C1955b) U8.f22734a).c(googleSignInAccount, googleSignInOptions);
                    }
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", googleSignInAccount);
                    this.f14578A = true;
                    this.f14579B = i10;
                    this.f14580C = intent;
                    R();
                    return;
                }
                if (intent.hasExtra("errorCode")) {
                    int intExtra = intent.getIntExtra("errorCode", 8);
                    if (intExtra == 13) {
                        intExtra = 12501;
                    }
                    S(intExtra);
                    return;
                }
            }
            S(8);
        }
    }

    @Override // i0.AbstractActivityC1369y, d.AbstractActivityC1071l, D.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            S(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            S(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f14582z = signInConfiguration;
        if (bundle == null) {
            if (f14577D) {
                setResult(0);
                S(12502);
                return;
            }
            f14577D = true;
            Intent intent2 = new Intent(action);
            if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                intent2.setPackage("com.google.android.gms");
            } else {
                intent2.setPackage(getPackageName());
            }
            intent2.putExtra("config", this.f14582z);
            try {
                startActivityForResult(intent2, 40962);
                return;
            } catch (ActivityNotFoundException unused) {
                this.f14581y = true;
                Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                S(17);
                return;
            }
        }
        boolean z9 = bundle.getBoolean("signingInGoogleApiClients");
        this.f14578A = z9;
        if (z9) {
            this.f14579B = bundle.getInt("signInResultCode");
            Intent intent3 = (Intent) bundle.getParcelable("signInResultData");
            if (intent3 == null) {
                Log.e("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            } else {
                this.f14580C = intent3;
                R();
            }
        }
    }

    @Override // i0.AbstractActivityC1369y, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f14577D = false;
    }

    @Override // d.AbstractActivityC1071l, D.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f14578A);
        if (this.f14578A) {
            bundle.putInt("signInResultCode", this.f14579B);
            bundle.putParcelable("signInResultData", this.f14580C);
        }
    }
}
