package j6;

import A7.i;
import L2.C0238b;
import L2.z;
import R7.d;
import a.AbstractC0485a;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Keep;
import com.anilab.android.App;
import g6.o;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import y2.C2203a;

@Keep
/* renamed from: j6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1476a {
    public static final C1476a INSTANCE = new C1476a();

    private C1476a() {
    }

    public static final void a(Context a5, String c3) {
        App app;
        h.e(a5, "a");
        h.e(c3, "c");
        Context applicationContext = a5.getApplicationContext();
        if (applicationContext instanceof App) {
            app = (App) applicationContext;
        } else {
            app = null;
        }
        if (app == null) {
            return;
        }
        C0238b c0238b = app.f13717c;
        if (c0238b != null) {
            String V8 = o.f17761a.V();
            SharedPreferences.Editor edit = c0238b.f4589a.f24771a.edit();
            edit.putString(V8, c3);
            edit.apply();
            return;
        }
        h.h("c");
        throw null;
    }

    public static final String b(long j) {
        return String.valueOf(d.f6666a.d(j));
    }

    public static final String n(Context a5) {
        App app;
        Object h7;
        h.e(a5, "a");
        Context applicationContext = a5.getApplicationContext();
        Object obj = null;
        if (applicationContext instanceof App) {
            app = (App) applicationContext;
        } else {
            app = null;
        }
        Object obj2 = "";
        if (app == null) {
            return "";
        }
        z zVar = app.f13719e;
        if (zVar != null) {
            String f02 = o.f17761a.f0();
            kotlin.jvm.internal.d a9 = p.a(String.class);
            boolean equals = a9.equals(p.a(Float.TYPE));
            C2203a c2203a = zVar.f4639a;
            if (equals) {
                obj2 = (String) Float.valueOf(c2203a.f24771a.getFloat(f02, ((Float) "").floatValue()));
            } else if (a9.equals(p.a(Integer.TYPE))) {
                obj2 = (String) Integer.valueOf(c2203a.f24771a.getInt(f02, ((Integer) "").intValue()));
            } else if (a9.equals(p.a(Long.TYPE))) {
                obj2 = (String) Long.valueOf(c2203a.f24771a.getLong(f02, ((Long) "").longValue()));
            } else if (a9.equals(p.a(String.class))) {
                obj2 = c2203a.f24771a.getString(f02, "");
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (a9.equals(p.a(Boolean.TYPE))) {
                obj2 = (String) Boolean.valueOf(c2203a.f24771a.getBoolean(f02, ((Boolean) "").booleanValue()));
            } else {
                String string = c2203a.f24771a.getString(f02, "");
                if (string != null && string.length() != 0) {
                    try {
                        h7 = c2203a.f24772b.a(String.class).a(string);
                    } catch (Throwable th) {
                        h7 = AbstractC0485a.h(th);
                    }
                    if (!(h7 instanceof i)) {
                        obj = h7;
                    }
                    if (obj != null) {
                        obj2 = obj;
                    }
                }
            }
            return (String) obj2;
        }
        h.h("f");
        throw null;
    }
}
