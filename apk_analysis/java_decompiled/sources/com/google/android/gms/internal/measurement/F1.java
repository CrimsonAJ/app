package com.google.android.gms.internal.measurement;

import android.net.Uri;
import s.C1935e;
import s.C1939i;

/* loaded from: classes.dex */
public abstract class F1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1935e f15214a = new C1939i(0);

    public static synchronized Uri a() {
        synchronized (F1.class) {
            C1935e c1935e = f15214a;
            Uri uri = (Uri) c1935e.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                c1935e.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
