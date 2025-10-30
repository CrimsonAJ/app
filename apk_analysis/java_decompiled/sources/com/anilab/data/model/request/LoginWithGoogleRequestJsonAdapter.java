package com.anilab.data.model.request;

import A0.a;
import B7.v;
import java.lang.reflect.Constructor;
import k4.C1499E;
import kotlin.jvm.internal.h;
import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;
import o7.y;
import p7.e;

/* loaded from: classes.dex */
public final class LoginWithGoogleRequestJsonAdapter extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final C1499E f13925a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f13926b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Constructor f13927c;

    public LoginWithGoogleRequestJsonAdapter(y moshi) {
        h.e(moshi, "moshi");
        this.f13925a = C1499E.o("token", "provider");
        this.f13926b = moshi.b(String.class, v.f1137a, "idToken");
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n reader) {
        h.e(reader, "reader");
        reader.d();
        String str = null;
        String str2 = null;
        int i9 = -1;
        while (reader.F()) {
            int h02 = reader.h0(this.f13925a);
            if (h02 != -1) {
                if (h02 != 0) {
                    if (h02 == 1) {
                        str2 = (String) this.f13926b.b(reader);
                        if (str2 != null) {
                            i9 = -3;
                        } else {
                            throw e.j("provider", "provider", reader);
                        }
                    } else {
                        continue;
                    }
                } else {
                    str = (String) this.f13926b.b(reader);
                    if (str == null) {
                        throw e.j("idToken", "token", reader);
                    }
                }
            } else {
                reader.i0();
                reader.j0();
            }
        }
        reader.s();
        if (i9 == -3) {
            if (str != null) {
                h.c(str2, "null cannot be cast to non-null type kotlin.String");
                return new LoginWithGoogleRequest(str, str2);
            }
            throw e.e("idToken", "token", reader);
        }
        Constructor constructor = this.f13927c;
        if (constructor == null) {
            constructor = LoginWithGoogleRequest.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, e.f22208c);
            this.f13927c = constructor;
            h.d(constructor, "also(...)");
        }
        if (str != null) {
            Object newInstance = constructor.newInstance(str, str2, Integer.valueOf(i9), null);
            h.d(newInstance, "newInstance(...)");
            return (LoginWithGoogleRequest) newInstance;
        }
        throw e.e("idToken", "token", reader);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q writer, Object obj) {
        LoginWithGoogleRequest loginWithGoogleRequest = (LoginWithGoogleRequest) obj;
        h.e(writer, "writer");
        if (loginWithGoogleRequest != null) {
            writer.d();
            writer.x("token");
            AbstractC1719k abstractC1719k = this.f13926b;
            abstractC1719k.e(writer, loginWithGoogleRequest.f13923a);
            writer.x("provider");
            abstractC1719k.e(writer, loginWithGoogleRequest.f13924b);
            writer.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return a.i(44, "GeneratedJsonAdapter(LoginWithGoogleRequest)");
    }
}
