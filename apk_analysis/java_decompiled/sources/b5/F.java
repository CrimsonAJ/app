package b5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC1020y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class F extends S4.a implements G {
    public F(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 4);
    }

    @Override // b5.G
    public final void C(Q1 q12) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, q12);
        g1(Q7, 26);
    }

    @Override // b5.G
    public final String D0(Q1 q12) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, q12);
        Parcel f12 = f1(Q7, 11);
        String readString = f12.readString();
        f12.recycle();
        return readString;
    }

    @Override // b5.G
    public final void L0(Q1 q12) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, q12);
        g1(Q7, 18);
    }

    @Override // b5.G
    public final void P0(Q1 q12, C0619d c0619d) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, q12);
        AbstractC1020y.c(Q7, c0619d);
        g1(Q7, 30);
    }

    @Override // b5.G
    public final void R0(M1 m12, Q1 q12) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, m12);
        AbstractC1020y.c(Q7, q12);
        g1(Q7, 2);
    }

    @Override // b5.G
    public final List S(String str, String str2, Q1 q12) {
        Parcel Q7 = Q();
        Q7.writeString(str);
        Q7.writeString(str2);
        AbstractC1020y.c(Q7, q12);
        Parcel f12 = f1(Q7, 16);
        ArrayList createTypedArrayList = f12.createTypedArrayList(C0622e.CREATOR);
        f12.recycle();
        return createTypedArrayList;
    }

    @Override // b5.G
    public final void U(Q1 q12) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, q12);
        g1(Q7, 27);
    }

    @Override // b5.G
    public final void W(Q1 q12, B1 b12, K k5) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, q12);
        AbstractC1020y.c(Q7, b12);
        AbstractC1020y.d(Q7, k5);
        g1(Q7, 29);
    }

    @Override // b5.G
    public final void W0(C0622e c0622e, Q1 q12) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, c0622e);
        AbstractC1020y.c(Q7, q12);
        g1(Q7, 12);
    }

    @Override // b5.G
    public final void Y(Q1 q12) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, q12);
        g1(Q7, 6);
    }

    @Override // b5.G
    public final void Z0(long j, String str, String str2, String str3) {
        Parcel Q7 = Q();
        Q7.writeLong(j);
        Q7.writeString(str);
        Q7.writeString(str2);
        Q7.writeString(str3);
        g1(Q7, 10);
    }

    @Override // b5.G
    public final void a0(Q1 q12) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, q12);
        g1(Q7, 20);
    }

    @Override // b5.G
    public final List b1(String str, String str2, boolean z9, Q1 q12) {
        Parcel Q7 = Q();
        Q7.writeString(str);
        Q7.writeString(str2);
        ClassLoader classLoader = AbstractC1020y.f15693a;
        Q7.writeInt(z9 ? 1 : 0);
        AbstractC1020y.c(Q7, q12);
        Parcel f12 = f1(Q7, 14);
        ArrayList createTypedArrayList = f12.createTypedArrayList(M1.CREATOR);
        f12.recycle();
        return createTypedArrayList;
    }

    @Override // b5.G
    public final List e1(String str, String str2, String str3, boolean z9) {
        Parcel Q7 = Q();
        Q7.writeString(null);
        Q7.writeString(str2);
        Q7.writeString(str3);
        ClassLoader classLoader = AbstractC1020y.f15693a;
        Q7.writeInt(z9 ? 1 : 0);
        Parcel f12 = f1(Q7, 15);
        ArrayList createTypedArrayList = f12.createTypedArrayList(M1.CREATOR);
        f12.recycle();
        return createTypedArrayList;
    }

    @Override // b5.G
    public final C0634i f0(Q1 q12) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, q12);
        Parcel f12 = f1(Q7, 21);
        C0634i c0634i = (C0634i) AbstractC1020y.a(f12, C0634i.CREATOR);
        f12.recycle();
        return c0634i;
    }

    @Override // b5.G
    public final void m(Q1 q12, Bundle bundle, I i9) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, q12);
        AbstractC1020y.c(Q7, bundle);
        AbstractC1020y.d(Q7, i9);
        g1(Q7, 31);
    }

    @Override // b5.G
    public final void m0(Q1 q12) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, q12);
        g1(Q7, 4);
    }

    @Override // b5.G
    public final void o(Q1 q12) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, q12);
        g1(Q7, 25);
    }

    @Override // b5.G
    public final void s0(Bundle bundle, Q1 q12) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, bundle);
        AbstractC1020y.c(Q7, q12);
        g1(Q7, 19);
    }

    @Override // b5.G
    public final byte[] v(C0665t c0665t, String str) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, c0665t);
        Q7.writeString(str);
        Parcel f12 = f1(Q7, 9);
        byte[] createByteArray = f12.createByteArray();
        f12.recycle();
        return createByteArray;
    }

    @Override // b5.G
    public final List x0(String str, String str2, String str3) {
        Parcel Q7 = Q();
        Q7.writeString(null);
        Q7.writeString(str2);
        Q7.writeString(str3);
        Parcel f12 = f1(Q7, 17);
        ArrayList createTypedArrayList = f12.createTypedArrayList(C0622e.CREATOR);
        f12.recycle();
        return createTypedArrayList;
    }

    @Override // b5.G
    public final void z0(C0665t c0665t, Q1 q12) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, c0665t);
        AbstractC1020y.c(Q7, q12);
        g1(Q7, 1);
    }
}
