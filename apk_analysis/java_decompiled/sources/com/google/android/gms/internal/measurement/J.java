package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: classes.dex */
public interface J extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(L l9);

    void getAppInstanceId(L l9);

    void getCachedAppInstanceId(L l9);

    void getConditionalUserProperties(String str, String str2, L l9);

    void getCurrentScreenClass(L l9);

    void getCurrentScreenName(L l9);

    void getGmpAppId(L l9);

    void getMaxUserProperties(String str, L l9);

    void getSessionId(L l9);

    void getTestFlag(L l9, int i9);

    void getUserProperties(String str, String str2, boolean z9, L l9);

    void initForTests(Map map);

    void initialize(N4.a aVar, U u9, long j);

    void isDataCollectionEnabled(L l9);

    void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, L l9, long j);

    void logHealthData(int i9, String str, N4.a aVar, N4.a aVar2, N4.a aVar3);

    void onActivityCreated(N4.a aVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(W w7, Bundle bundle, long j);

    void onActivityDestroyed(N4.a aVar, long j);

    void onActivityDestroyedByScionActivityInfo(W w7, long j);

    void onActivityPaused(N4.a aVar, long j);

    void onActivityPausedByScionActivityInfo(W w7, long j);

    void onActivityResumed(N4.a aVar, long j);

    void onActivityResumedByScionActivityInfo(W w7, long j);

    void onActivitySaveInstanceState(N4.a aVar, L l9, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(W w7, L l9, long j);

    void onActivityStarted(N4.a aVar, long j);

    void onActivityStartedByScionActivityInfo(W w7, long j);

    void onActivityStopped(N4.a aVar, long j);

    void onActivityStoppedByScionActivityInfo(W w7, long j);

    void performAction(Bundle bundle, L l9, long j);

    void registerOnMeasurementEventListener(Q q9);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(O o9);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(N4.a aVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(W w7, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z9);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(Q q9);

    void setInstanceIdProvider(T t7);

    void setMeasurementEnabled(boolean z9, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, N4.a aVar, boolean z9, long j);

    void unregisterOnMeasurementEventListener(Q q9);
}
