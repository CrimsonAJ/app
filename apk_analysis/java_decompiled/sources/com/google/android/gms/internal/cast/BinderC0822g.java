package com.google.android.gms.internal.cast;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cast.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0822g extends AbstractBinderC0838k {

    /* renamed from: i, reason: collision with root package name */
    public static final y4.b f14847i = new y4.b("AppVisibilityProxy", null);
    public static final int j = 1;

    /* renamed from: g, reason: collision with root package name */
    public final Set f14848g;

    /* renamed from: h, reason: collision with root package name */
    public int f14849h;

    public BinderC0822g() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", 1);
        this.f14848g = Collections.synchronizedSet(new HashSet());
        this.f14849h = j;
    }
}
