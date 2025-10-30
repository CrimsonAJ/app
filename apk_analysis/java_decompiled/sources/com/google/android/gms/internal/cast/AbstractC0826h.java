package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import u4.C2078c;

/* renamed from: com.google.android.gms.internal.cast.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0826h {

    /* renamed from: a, reason: collision with root package name */
    public static final y4.b f14853a = new y4.b("CastDynamiteModule", null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [u4.n] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static u4.n a(Context context, C2078c c2078c, BinderC0873t binderC0873t, HashMap hashMap) {
        ?? aVar;
        C0834j b9 = b(context);
        N4.b bVar = new N4.b(context.getApplicationContext());
        Parcel Q7 = b9.Q();
        C.d(Q7, bVar);
        C.c(Q7, c2078c);
        C.d(Q7, binderC0873t);
        Q7.writeMap(hashMap);
        Parcel f12 = b9.f1(Q7, 1);
        IBinder readStrongBinder = f12.readStrongBinder();
        int i9 = u4.m.f23695f;
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            if (queryLocalInterface instanceof u4.n) {
                aVar = (u4.n) queryLocalInterface;
            } else {
                aVar = new S4.a(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", 3);
            }
        }
        f12.recycle();
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [S4.a, com.google.android.gms.internal.cast.j] */
    public static C0834j b(Context context) {
        try {
            IBinder b9 = O4.f.c(context, O4.f.f5462b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b9 == null) {
                return null;
            }
            IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof C0834j) {
                return (C0834j) queryLocalInterface;
            }
            return new S4.a(b9, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 3);
        } catch (O4.b e8) {
            throw new Exception(e8);
        }
    }
}
