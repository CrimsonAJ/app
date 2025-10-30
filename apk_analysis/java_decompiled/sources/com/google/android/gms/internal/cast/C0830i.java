package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import u4.C2078c;

/* renamed from: com.google.android.gms.internal.cast.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0830i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14856a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14857b;

    /* renamed from: c, reason: collision with root package name */
    public final u4.j f14858c;

    /* renamed from: d, reason: collision with root package name */
    public final C2078c f14859d;

    /* renamed from: e, reason: collision with root package name */
    public final BinderC0873t f14860e;

    public C0830i(Context context, C2078c c2078c, BinderC0873t binderC0873t) {
        String a5;
        boolean isEmpty = Collections.unmodifiableList(c2078c.f23659b).isEmpty();
        String str = c2078c.f23658a;
        if (isEmpty) {
            a5 = t4.v.a(str);
        } else {
            List unmodifiableList = Collections.unmodifiableList(c2078c.f23659b);
            if (str != null) {
                if (unmodifiableList != null) {
                    a5 = j8.a.a(new j8.a(1, str, unmodifiableList));
                } else {
                    throw new IllegalArgumentException("namespaces cannot be null");
                }
            } else {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
        }
        this.f14858c = new u4.j(this);
        this.f14856a = context.getApplicationContext();
        F4.y.e(a5);
        this.f14857b = a5;
        this.f14859d = c2078c;
        this.f14860e = binderC0873t;
    }
}
