package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import co.notix.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class I extends AbstractBinderC1015x implements J {
    /* JADX WARN: Type inference failed for: r1v1, types: [S4.a, com.google.android.gms.internal.measurement.J] */
    public static J asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof J) {
            return (J) queryLocalInterface;
        }
        return new S4.a(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v28, types: [S4.a] */
    /* JADX WARN: Type inference failed for: r6v85, types: [S4.a] */
    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1015x
    public final boolean d(int i9, Parcel parcel, Parcel parcel2) {
        boolean z9;
        boolean z10;
        boolean z11 = false;
        L l9 = null;
        O o9 = null;
        L l10 = null;
        L l11 = null;
        L l12 = null;
        L l13 = null;
        Q q9 = null;
        Q q10 = null;
        Q q11 = null;
        L l14 = null;
        L l15 = null;
        L l16 = null;
        L l17 = null;
        L l18 = null;
        L l19 = null;
        T t7 = null;
        L l20 = null;
        L l21 = null;
        L l22 = null;
        L l23 = null;
        L l24 = null;
        switch (i9) {
            case 1:
                N4.a h12 = N4.b.h1(parcel.readStrongBinder());
                U u9 = (U) AbstractC1020y.a(parcel, U.CREATOR);
                long readLong = parcel.readLong();
                AbstractC1020y.b(parcel);
                initialize(h12, u9, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z9 = false;
                    z11 = true;
                } else {
                    z9 = false;
                }
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = z9;
                }
                long readLong2 = parcel.readLong();
                AbstractC1020y.b(parcel);
                logEvent(readString, readString2, bundle, z11, z10, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof L) {
                        l9 = (L) queryLocalInterface;
                    } else {
                        l9 = new K(readStrongBinder);
                    }
                }
                L l25 = l9;
                long readLong3 = parcel.readLong();
                AbstractC1020y.b(parcel);
                logEventAndBundle(readString3, readString4, bundle2, l25, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                N4.a h13 = N4.b.h1(parcel.readStrongBinder());
                ClassLoader classLoader = AbstractC1020y.f15693a;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                long readLong4 = parcel.readLong();
                AbstractC1020y.b(parcel);
                setUserProperty(readString5, readString6, h13, z11, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = AbstractC1020y.f15693a;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof L) {
                        l24 = (L) queryLocalInterface2;
                    } else {
                        l24 = new K(readStrongBinder2);
                    }
                }
                AbstractC1020y.b(parcel);
                getUserProperties(readString7, readString8, z11, l24);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof L) {
                        l23 = (L) queryLocalInterface3;
                    } else {
                        l23 = new K(readStrongBinder3);
                    }
                }
                AbstractC1020y.b(parcel);
                getMaxUserProperties(readString9, l23);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                AbstractC1020y.b(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                AbstractC1020y.b(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
                AbstractC1020y.b(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case R.styleable.GradientColor_android_endX /* 10 */:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof L) {
                        l22 = (L) queryLocalInterface4;
                    } else {
                        l22 = new K(readStrongBinder4);
                    }
                }
                AbstractC1020y.b(parcel);
                getConditionalUserProperties(readString13, readString14, l22);
                break;
            case R.styleable.GradientColor_android_endY /* 11 */:
                ClassLoader classLoader3 = AbstractC1020y.f15693a;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                long readLong7 = parcel.readLong();
                AbstractC1020y.b(parcel);
                setMeasurementEnabled(z11, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                AbstractC1020y.b(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                AbstractC1020y.b(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                AbstractC1020y.b(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                N4.a h14 = N4.b.h1(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                AbstractC1020y.b(parcel);
                setCurrentScreen(h14, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof L) {
                        l21 = (L) queryLocalInterface5;
                    } else {
                        l21 = new K(readStrongBinder5);
                    }
                }
                AbstractC1020y.b(parcel);
                getCurrentScreenName(l21);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof L) {
                        l20 = (L) queryLocalInterface6;
                    } else {
                        l20 = new K(readStrongBinder6);
                    }
                }
                AbstractC1020y.b(parcel);
                getCurrentScreenClass(l20);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof T) {
                        t7 = (T) queryLocalInterface7;
                    } else {
                        t7 = new S4.a(readStrongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 4);
                    }
                }
                AbstractC1020y.b(parcel);
                setInstanceIdProvider(t7);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof L) {
                        l19 = (L) queryLocalInterface8;
                    } else {
                        l19 = new K(readStrongBinder8);
                    }
                }
                AbstractC1020y.b(parcel);
                getCachedAppInstanceId(l19);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof L) {
                        l18 = (L) queryLocalInterface9;
                    } else {
                        l18 = new K(readStrongBinder9);
                    }
                }
                AbstractC1020y.b(parcel);
                getAppInstanceId(l18);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof L) {
                        l17 = (L) queryLocalInterface10;
                    } else {
                        l17 = new K(readStrongBinder10);
                    }
                }
                AbstractC1020y.b(parcel);
                getGmpAppId(l17);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof L) {
                        l16 = (L) queryLocalInterface11;
                    } else {
                        l16 = new K(readStrongBinder11);
                    }
                }
                AbstractC1020y.b(parcel);
                generateEventId(l16);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                AbstractC1020y.b(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                AbstractC1020y.b(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                N4.a h15 = N4.b.h1(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                AbstractC1020y.b(parcel);
                onActivityStarted(h15, readLong14);
                break;
            case 26:
                N4.a h16 = N4.b.h1(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                AbstractC1020y.b(parcel);
                onActivityStopped(h16, readLong15);
                break;
            case 27:
                N4.a h17 = N4.b.h1(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                AbstractC1020y.b(parcel);
                onActivityCreated(h17, bundle5, readLong16);
                break;
            case 28:
                N4.a h18 = N4.b.h1(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                AbstractC1020y.b(parcel);
                onActivityDestroyed(h18, readLong17);
                break;
            case 29:
                N4.a h19 = N4.b.h1(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                AbstractC1020y.b(parcel);
                onActivityPaused(h19, readLong18);
                break;
            case 30:
                N4.a h110 = N4.b.h1(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                AbstractC1020y.b(parcel);
                onActivityResumed(h110, readLong19);
                break;
            case 31:
                N4.a h111 = N4.b.h1(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof L) {
                        l15 = (L) queryLocalInterface12;
                    } else {
                        l15 = new K(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                AbstractC1020y.b(parcel);
                onActivitySaveInstanceState(h111, l15, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof L) {
                        l14 = (L) queryLocalInterface13;
                    } else {
                        l14 = new K(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                AbstractC1020y.b(parcel);
                performAction(bundle6, l14, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                N4.a h112 = N4.b.h1(parcel.readStrongBinder());
                N4.a h113 = N4.b.h1(parcel.readStrongBinder());
                N4.a h114 = N4.b.h1(parcel.readStrongBinder());
                AbstractC1020y.b(parcel);
                logHealthData(readInt, readString19, h112, h113, h114);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof Q) {
                        q11 = (Q) queryLocalInterface14;
                    } else {
                        q11 = new P(readStrongBinder14);
                    }
                }
                AbstractC1020y.b(parcel);
                setEventInterceptor(q11);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof Q) {
                        q10 = (Q) queryLocalInterface15;
                    } else {
                        q10 = new P(readStrongBinder15);
                    }
                }
                AbstractC1020y.b(parcel);
                registerOnMeasurementEventListener(q10);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof Q) {
                        q9 = (Q) queryLocalInterface16;
                    } else {
                        q9 = new P(readStrongBinder16);
                    }
                }
                AbstractC1020y.b(parcel);
                unregisterOnMeasurementEventListener(q9);
                break;
            case 37:
                HashMap readHashMap = parcel.readHashMap(AbstractC1020y.f15693a);
                AbstractC1020y.b(parcel);
                initForTests(readHashMap);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof L) {
                        l13 = (L) queryLocalInterface17;
                    } else {
                        l13 = new K(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                AbstractC1020y.b(parcel);
                getTestFlag(l13, readInt2);
                break;
            case 39:
                ClassLoader classLoader4 = AbstractC1020y.f15693a;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                AbstractC1020y.b(parcel);
                setDataCollectionEnabled(z11);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof L) {
                        l12 = (L) queryLocalInterface18;
                    } else {
                        l12 = new K(readStrongBinder18);
                    }
                }
                AbstractC1020y.b(parcel);
                isDataCollectionEnabled(l12);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
                AbstractC1020y.b(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                AbstractC1020y.b(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                AbstractC1020y.b(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                AbstractC1020y.b(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof L) {
                        l11 = (L) queryLocalInterface19;
                    } else {
                        l11 = new K(readStrongBinder19);
                    }
                }
                AbstractC1020y.b(parcel);
                getSessionId(l11);
                break;
            case 48:
                Intent intent = (Intent) AbstractC1020y.a(parcel, Intent.CREATOR);
                AbstractC1020y.b(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                W w7 = (W) AbstractC1020y.a(parcel, W.CREATOR);
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                long readLong25 = parcel.readLong();
                AbstractC1020y.b(parcel);
                setCurrentScreenByScionActivityInfo(w7, readString20, readString21, readLong25);
                break;
            case 51:
                W w9 = (W) AbstractC1020y.a(parcel, W.CREATOR);
                long readLong26 = parcel.readLong();
                AbstractC1020y.b(parcel);
                onActivityStartedByScionActivityInfo(w9, readLong26);
                break;
            case 52:
                W w10 = (W) AbstractC1020y.a(parcel, W.CREATOR);
                long readLong27 = parcel.readLong();
                AbstractC1020y.b(parcel);
                onActivityStoppedByScionActivityInfo(w10, readLong27);
                break;
            case 53:
                W w11 = (W) AbstractC1020y.a(parcel, W.CREATOR);
                Bundle bundle10 = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
                long readLong28 = parcel.readLong();
                AbstractC1020y.b(parcel);
                onActivityCreatedByScionActivityInfo(w11, bundle10, readLong28);
                break;
            case 54:
                W w12 = (W) AbstractC1020y.a(parcel, W.CREATOR);
                long readLong29 = parcel.readLong();
                AbstractC1020y.b(parcel);
                onActivityDestroyedByScionActivityInfo(w12, readLong29);
                break;
            case 55:
                W w13 = (W) AbstractC1020y.a(parcel, W.CREATOR);
                long readLong30 = parcel.readLong();
                AbstractC1020y.b(parcel);
                onActivityPausedByScionActivityInfo(w13, readLong30);
                break;
            case 56:
                W w14 = (W) AbstractC1020y.a(parcel, W.CREATOR);
                long readLong31 = parcel.readLong();
                AbstractC1020y.b(parcel);
                onActivityResumedByScionActivityInfo(w14, readLong31);
                break;
            case 57:
                W w15 = (W) AbstractC1020y.a(parcel, W.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface20 instanceof L) {
                        l10 = (L) queryLocalInterface20;
                    } else {
                        l10 = new K(readStrongBinder20);
                    }
                }
                long readLong32 = parcel.readLong();
                AbstractC1020y.b(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(w15, l10, readLong32);
                break;
            case 58:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    if (queryLocalInterface21 instanceof O) {
                        o9 = (O) queryLocalInterface21;
                    } else {
                        o9 = new S4.a(readStrongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 4);
                    }
                }
                AbstractC1020y.b(parcel);
                retrieveAndUploadBatches(o9);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
