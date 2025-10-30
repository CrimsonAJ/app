package com.google.firebase.provider;

import F4.y;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import l6.C1569a;
import l6.C1574f;

/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final C1569a f16537a = new C1569a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f16538b = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        y.i(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (!"com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        AtomicBoolean atomicBoolean = f16538b;
        try {
            atomicBoolean.set(true);
            if (C1574f.f(getContext()) == null) {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
            } else {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
            }
            atomicBoolean.set(false);
            return false;
        } catch (Throwable th) {
            atomicBoolean.set(false);
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
