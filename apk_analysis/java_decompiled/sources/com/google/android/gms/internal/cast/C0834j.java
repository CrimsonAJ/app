package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import u4.C2078c;

/* renamed from: com.google.android.gms.internal.cast.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0834j extends S4.a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [u4.q] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final u4.q j1(C2078c c2078c, N4.a aVar, u4.j jVar) {
        ?? aVar2;
        Parcel Q7 = Q();
        C.c(Q7, c2078c);
        C.d(Q7, aVar);
        C.d(Q7, jVar);
        Parcel f12 = f1(Q7, 3);
        IBinder readStrongBinder = f12.readStrongBinder();
        int i9 = u4.p.f23696f;
        if (readStrongBinder == null) {
            aVar2 = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            if (queryLocalInterface instanceof u4.q) {
                aVar2 = (u4.q) queryLocalInterface;
            } else {
                aVar2 = new S4.a(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", 3);
            }
        }
        f12.recycle();
        return aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [u4.u] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final u4.u k1(N4.b bVar, N4.a aVar, N4.a aVar2) {
        ?? aVar3;
        Parcel Q7 = Q();
        C.d(Q7, bVar);
        C.d(Q7, aVar);
        C.d(Q7, aVar2);
        Parcel f12 = f1(Q7, 5);
        IBinder readStrongBinder = f12.readStrongBinder();
        int i9 = u4.t.f23697f;
        if (readStrongBinder == null) {
            aVar3 = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            if (queryLocalInterface instanceof u4.u) {
                aVar3 = (u4.u) queryLocalInterface;
            } else {
                aVar3 = new S4.a(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 3);
            }
        }
        f12.recycle();
        return aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [u4.x] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final u4.x l1(String str, String str2, u4.j jVar) {
        ?? aVar;
        Parcel Q7 = Q();
        Q7.writeString(str);
        Q7.writeString(str2);
        C.d(Q7, jVar);
        Parcel f12 = f1(Q7, 2);
        IBinder readStrongBinder = f12.readStrongBinder();
        int i9 = u4.w.f23698f;
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            if (queryLocalInterface instanceof u4.x) {
                aVar = (u4.x) queryLocalInterface;
            } else {
                aVar = new S4.a(readStrongBinder, "com.google.android.gms.cast.framework.ISession", 3);
            }
        }
        f12.recycle();
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [w4.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public final w4.e m1(N4.b bVar, u4.j jVar, int i9, int i10) {
        ?? aVar;
        Parcel Q7 = Q();
        C.d(Q7, bVar);
        C.d(Q7, jVar);
        Q7.writeInt(i9);
        Q7.writeInt(i10);
        Q7.writeInt(0);
        Q7.writeLong(2097152L);
        Q7.writeInt(5);
        Q7.writeInt(333);
        Q7.writeInt(10000);
        Parcel f12 = f1(Q7, 6);
        IBinder readStrongBinder = f12.readStrongBinder();
        int i11 = w4.d.f24159f;
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof w4.e) {
                aVar = (w4.e) queryLocalInterface;
            } else {
                aVar = new S4.a(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 3);
            }
        }
        f12.recycle();
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [w4.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public final w4.e n1(N4.b bVar, N4.b bVar2, u4.j jVar, int i9, int i10) {
        ?? aVar;
        Parcel Q7 = Q();
        C.d(Q7, bVar);
        C.d(Q7, bVar2);
        C.d(Q7, jVar);
        Q7.writeInt(i9);
        Q7.writeInt(i10);
        Q7.writeInt(0);
        Q7.writeLong(2097152L);
        Q7.writeInt(5);
        Q7.writeInt(333);
        Q7.writeInt(10000);
        Parcel f12 = f1(Q7, 7);
        IBinder readStrongBinder = f12.readStrongBinder();
        int i11 = w4.d.f24159f;
        if (readStrongBinder == null) {
            aVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof w4.e) {
                aVar = (w4.e) queryLocalInterface;
            } else {
                aVar = new S4.a(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 3);
            }
        }
        f12.recycle();
        return aVar;
    }
}
