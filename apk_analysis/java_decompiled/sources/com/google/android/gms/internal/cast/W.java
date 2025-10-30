package com.google.android.gms.internal.cast;

import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class W implements V {

    /* renamed from: e, reason: collision with root package name */
    public static final C0886w0 f14781e = new C0886w0(19);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14782a;

    /* renamed from: b, reason: collision with root package name */
    public final X f14783b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14784c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f14785d;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.cast.X] */
    public W() {
        this.f14782a = 1;
        this.f14783b = new Object();
        this.f14784c = AbstractC0849m2.class.getName();
    }

    @Override // com.google.android.gms.internal.cast.V
    public Object a() {
        V v8 = (V) this.f14785d;
        C0886w0 c0886w0 = f14781e;
        if (v8 != c0886w0) {
            synchronized (this.f14783b) {
                try {
                    if (((V) this.f14785d) != c0886w0) {
                        Object a5 = ((V) this.f14785d).a();
                        this.f14784c = a5;
                        this.f14785d = c0886w0;
                        return a5;
                    }
                } finally {
                }
            }
        }
        return this.f14784c;
    }

    public Logger b() {
        Logger logger = (Logger) this.f14785d;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f14783b) {
            try {
                Logger logger2 = (Logger) this.f14785d;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.f14784c);
                this.f14785d = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.f14782a) {
            case 0:
                Object obj = (V) this.f14785d;
                if (obj == f14781e) {
                    obj = A0.a.n("<supplier that returned ", String.valueOf(this.f14784c), ">");
                }
                return A0.a.n("Suppliers.memoize(", String.valueOf(obj), ")");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.cast.X] */
    public W(C0886w0 c0886w0) {
        this.f14782a = 0;
        this.f14783b = new Object();
        this.f14785d = c0886w0;
    }
}
