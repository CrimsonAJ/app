package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f16513d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f16514a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16515b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16516c;

    public v(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && f16513d.matcher(str3).matches()) {
            this.f16514a = str3;
            this.f16515b = str;
            this.f16516c = AbstractC0953k1.o(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(A0.a.n("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.f16514a.equals(vVar.f16514a) || !this.f16515b.equals(vVar.f16515b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16515b, this.f16514a});
    }
}
