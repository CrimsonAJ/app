package D6;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1916a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1917b;

    public a(int i9, String str) {
        this.f1917b = i9;
        this.f1916a = str;
    }

    public a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f1916a = str;
            this.f1917b = 1;
            return;
        }
        throw new IllegalArgumentException();
    }
}
