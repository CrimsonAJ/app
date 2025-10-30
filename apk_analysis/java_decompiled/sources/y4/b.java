package y4;

import F4.y;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f24917a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24918b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24919c;

    public b(String str, String str2) {
        boolean z9;
        y.f(str, "The log tag cannot be null or empty.");
        this.f24917a = str;
        this.f24919c = str2;
        if (str.length() <= 23) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f24918b = z9;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f24918b) {
            String str2 = this.f24917a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr), exc);
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f24918b) {
            String str2 = this.f24917a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr));
            }
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.f24917a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        String n7;
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f24919c;
        if (TextUtils.isEmpty(str2)) {
            n7 = "";
        } else {
            n7 = A0.a.n("[", str2, "] ");
        }
        if (!TextUtils.isEmpty(n7)) {
            return n7.concat(String.valueOf(str));
        }
        return str;
    }
}
