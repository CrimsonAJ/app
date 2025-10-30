package com.google.android.gms.internal.cast;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.cast.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0868r2 extends J implements S5.p {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f14962g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final W f14963h = new W();

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f14964i;
    public static final J j;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f14965d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C0845l2 f14966e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C0865q2 f14967f;

    static {
        boolean z9;
        J j4;
        Throwable th;
        Throwable th2;
        try {
            z9 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z9 = false;
        }
        f14964i = z9;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property != null && !property.contains("Android")) {
            try {
                j4 = new J(9);
            } catch (NoClassDefFoundError unused2) {
                j4 = new J(9);
            }
        } else {
            try {
                j4 = new J(9);
            } catch (Error | Exception e8) {
                try {
                    j4 = new J(9);
                } catch (Error | Exception e9) {
                    th3 = e9;
                    j4 = new J(9);
                }
                th = th3;
                th2 = e8;
            }
        }
        th = null;
        th2 = null;
        j = j4;
        if (th != null) {
            W w7 = f14963h;
            Logger b9 = w7.b();
            Level level = Level.SEVERE;
            b9.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            w7.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void t(C0865q2 c0865q2) {
        c0865q2.f14958a = null;
        while (true) {
            C0865q2 c0865q22 = this.f14967f;
            if (c0865q22 != C0865q2.f14957c) {
                C0865q2 c0865q23 = null;
                while (c0865q22 != null) {
                    C0865q2 c0865q24 = c0865q22.f14959b;
                    if (c0865q22.f14958a != null) {
                        c0865q23 = c0865q22;
                    } else if (c0865q23 != null) {
                        c0865q23.f14959b = c0865q24;
                        if (c0865q23.f14958a == null) {
                            break;
                        }
                    } else if (!j.s(this, c0865q22, c0865q24)) {
                        break;
                    }
                    c0865q22 = c0865q24;
                }
                return;
            }
            return;
        }
    }
}
