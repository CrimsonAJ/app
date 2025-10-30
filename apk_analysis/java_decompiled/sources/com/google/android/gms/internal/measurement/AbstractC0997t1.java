package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0997t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f15595a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f15596b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f15597c;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f15596b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f15597c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
