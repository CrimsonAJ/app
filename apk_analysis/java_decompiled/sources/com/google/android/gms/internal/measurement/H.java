package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class H extends S4.a implements J {
    @Override // com.google.android.gms.internal.measurement.J
    public final void beginAdUnitExposure(String str, long j) {
        Parcel Q7 = Q();
        Q7.writeString(str);
        Q7.writeLong(j);
        g1(Q7, 23);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel Q7 = Q();
        Q7.writeString(str);
        Q7.writeString(str2);
        AbstractC1020y.c(Q7, bundle);
        g1(Q7, 9);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void endAdUnitExposure(String str, long j) {
        Parcel Q7 = Q();
        Q7.writeString(str);
        Q7.writeLong(j);
        g1(Q7, 24);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void generateEventId(L l9) {
        Parcel Q7 = Q();
        AbstractC1020y.d(Q7, l9);
        g1(Q7, 22);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getCachedAppInstanceId(L l9) {
        Parcel Q7 = Q();
        AbstractC1020y.d(Q7, l9);
        g1(Q7, 19);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getConditionalUserProperties(String str, String str2, L l9) {
        Parcel Q7 = Q();
        Q7.writeString(str);
        Q7.writeString(str2);
        AbstractC1020y.d(Q7, l9);
        g1(Q7, 10);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getCurrentScreenClass(L l9) {
        Parcel Q7 = Q();
        AbstractC1020y.d(Q7, l9);
        g1(Q7, 17);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getCurrentScreenName(L l9) {
        Parcel Q7 = Q();
        AbstractC1020y.d(Q7, l9);
        g1(Q7, 16);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getGmpAppId(L l9) {
        Parcel Q7 = Q();
        AbstractC1020y.d(Q7, l9);
        g1(Q7, 21);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getMaxUserProperties(String str, L l9) {
        Parcel Q7 = Q();
        Q7.writeString(str);
        AbstractC1020y.d(Q7, l9);
        g1(Q7, 6);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getUserProperties(String str, String str2, boolean z9, L l9) {
        Parcel Q7 = Q();
        Q7.writeString(str);
        Q7.writeString(str2);
        ClassLoader classLoader = AbstractC1020y.f15693a;
        Q7.writeInt(z9 ? 1 : 0);
        AbstractC1020y.d(Q7, l9);
        g1(Q7, 5);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void initialize(N4.a aVar, U u9, long j) {
        Parcel Q7 = Q();
        AbstractC1020y.d(Q7, aVar);
        AbstractC1020y.c(Q7, u9);
        Q7.writeLong(j);
        g1(Q7, 1);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j) {
        Parcel Q7 = Q();
        Q7.writeString(str);
        Q7.writeString(str2);
        AbstractC1020y.c(Q7, bundle);
        Q7.writeInt(z9 ? 1 : 0);
        Q7.writeInt(1);
        Q7.writeLong(j);
        g1(Q7, 2);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void logHealthData(int i9, String str, N4.a aVar, N4.a aVar2, N4.a aVar3) {
        Parcel Q7 = Q();
        Q7.writeInt(5);
        Q7.writeString("Error with data collection. Data lost.");
        AbstractC1020y.d(Q7, aVar);
        AbstractC1020y.d(Q7, aVar2);
        AbstractC1020y.d(Q7, aVar3);
        g1(Q7, 33);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityCreatedByScionActivityInfo(W w7, Bundle bundle, long j) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, w7);
        AbstractC1020y.c(Q7, bundle);
        Q7.writeLong(j);
        g1(Q7, 53);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityDestroyedByScionActivityInfo(W w7, long j) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, w7);
        Q7.writeLong(j);
        g1(Q7, 54);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityPausedByScionActivityInfo(W w7, long j) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, w7);
        Q7.writeLong(j);
        g1(Q7, 55);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityResumedByScionActivityInfo(W w7, long j) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, w7);
        Q7.writeLong(j);
        g1(Q7, 56);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivitySaveInstanceStateByScionActivityInfo(W w7, L l9, long j) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, w7);
        AbstractC1020y.d(Q7, l9);
        Q7.writeLong(j);
        g1(Q7, 57);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityStartedByScionActivityInfo(W w7, long j) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, w7);
        Q7.writeLong(j);
        g1(Q7, 51);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityStoppedByScionActivityInfo(W w7, long j) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, w7);
        Q7.writeLong(j);
        g1(Q7, 52);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void registerOnMeasurementEventListener(Q q9) {
        Parcel Q7 = Q();
        AbstractC1020y.d(Q7, q9);
        g1(Q7, 35);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void retrieveAndUploadBatches(O o9) {
        Parcel Q7 = Q();
        AbstractC1020y.d(Q7, o9);
        g1(Q7, 58);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, bundle);
        Q7.writeLong(j);
        g1(Q7, 8);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void setCurrentScreenByScionActivityInfo(W w7, String str, String str2, long j) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, w7);
        Q7.writeString(str);
        Q7.writeString(str2);
        Q7.writeLong(j);
        g1(Q7, 50);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void setDataCollectionEnabled(boolean z9) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void setUserProperty(String str, String str2, N4.a aVar, boolean z9, long j) {
        Parcel Q7 = Q();
        Q7.writeString("fcm");
        Q7.writeString("_ln");
        AbstractC1020y.d(Q7, aVar);
        Q7.writeInt(1);
        Q7.writeLong(j);
        g1(Q7, 4);
    }
}
