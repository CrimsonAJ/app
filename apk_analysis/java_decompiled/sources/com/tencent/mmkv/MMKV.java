package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import dalvik.annotation.optimization.FastNative;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import q7.a;
import q7.b;

/* loaded from: classes.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumMap f16550a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumMap f16551b;

    /* renamed from: c, reason: collision with root package name */
    public static final a[] f16552c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f16553d;

    /* renamed from: e, reason: collision with root package name */
    public static String f16554e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f16555f;
    private final long nativeHandle;

    static {
        EnumMap enumMap = new EnumMap(b.class);
        f16550a = enumMap;
        enumMap.put((EnumMap) b.f22443a, (b) 0);
        enumMap.put((EnumMap) b.f22444b, (b) 1);
        EnumMap enumMap2 = new EnumMap(a.class);
        f16551b = enumMap2;
        a aVar = a.f22437a;
        enumMap2.put((EnumMap) aVar, (a) 0);
        a aVar2 = a.f22438b;
        enumMap2.put((EnumMap) aVar2, (a) 1);
        a aVar3 = a.f22439c;
        enumMap2.put((EnumMap) aVar3, (a) 2);
        a aVar4 = a.f22440d;
        enumMap2.put((EnumMap) aVar4, (a) 3);
        a aVar5 = a.f22441e;
        enumMap2.put((EnumMap) aVar5, (a) 4);
        f16552c = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        f16553d = new HashSet();
        f16554e = null;
        f16555f = true;
        new HashMap();
    }

    public MMKV(long j) {
        this.nativeHandle = j;
    }

    public static MMKV a() {
        if (f16554e != null) {
            long defaultMMKV = getDefaultMMKV(1, null);
            if (defaultMMKV != 0) {
                if (!f16555f) {
                    return new MMKV(defaultMMKV);
                }
                HashSet hashSet = f16553d;
                synchronized (hashSet) {
                    try {
                        if (!hashSet.contains(Long.valueOf(defaultMMKV))) {
                            if (checkProcessMode(defaultMMKV)) {
                                hashSet.add(Long.valueOf(defaultMMKV));
                            } else {
                                throw new IllegalArgumentException("Opening a multi-process MMKV instance [DefaultMMKV] with SINGLE_PROCESS_MODE!");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new MMKV(defaultMMKV);
            }
            throw new RuntimeException("Fail to create an MMKV instance [DefaultMMKV] in JNI");
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    private native long actualSize(long j);

    private native String[] allKeys(long j, boolean z9);

    public static void b() {
        synchronized (f16553d) {
            f16555f = true;
        }
        Log.i("MMKV", "Enable checkProcessMode()");
    }

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, String str3);

    private static native boolean checkProcessMode(long j);

    private native boolean containsKey(long j, String str);

    private native long count(long j, boolean z9);

    private static native long createNB(int i9);

    public static void d(Context context) {
        String str = context.getFilesDir().getAbsolutePath() + "/mmkv";
        if ((context.getApplicationInfo().flags & 2) == 0) {
            synchronized (f16553d) {
                f16555f = false;
            }
            Log.i("MMKV", "Disable checkProcessMode()");
        } else {
            b();
        }
        String absolutePath = context.getCacheDir().getAbsolutePath();
        System.loadLibrary("mmkv");
        jniInitialize(str, absolutePath, 4, false);
        f16554e = str;
    }

    private native boolean decodeBool(long j, String str, boolean z9);

    private native byte[] decodeBytes(long j, String str);

    private native double decodeDouble(long j, String str, double d9);

    private native float decodeFloat(long j, String str, float f9);

    private native int decodeInt(long j, String str, int i9);

    private native long decodeLong(long j, String str, long j4);

    private native String decodeString(long j, String str, String str2);

    private native String[] decodeStringSet(long j, String str);

    private static native void destroyNB(long j, int i9);

    private native boolean encodeBool(long j, String str, boolean z9);

    private native boolean encodeBool_2(long j, String str, boolean z9, int i9);

    private native boolean encodeBytes(long j, String str, byte[] bArr);

    private native boolean encodeBytes_2(long j, String str, byte[] bArr, int i9);

    private native boolean encodeDouble(long j, String str, double d9);

    private native boolean encodeDouble_2(long j, String str, double d9, int i9);

    private native boolean encodeFloat(long j, String str, float f9);

    private native boolean encodeFloat_2(long j, String str, float f9, int i9);

    private native boolean encodeInt(long j, String str, int i9);

    private native boolean encodeInt_2(long j, String str, int i9, int i10);

    private native boolean encodeLong(long j, String str, long j4);

    private native boolean encodeLong_2(long j, String str, long j4, int i9);

    private native boolean encodeSet(long j, String str, String[] strArr);

    private native boolean encodeSet_2(long j, String str, String[] strArr, int i9);

    private native boolean encodeString(long j, String str, String str2);

    private native boolean encodeString_2(long j, String str, String str2, int i9);

    public static void f(String str) {
        int intValue;
        a aVar = a.f22438b;
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[r1.length - 1];
        Integer num = (Integer) f16551b.get(aVar);
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        mmkvLogImp(intValue, stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    private static native long getDefaultMMKV(int i9, String str);

    private static native long getMMKVWithAshmemFD(String str, int i9, int i10, String str2);

    private static native long getMMKVWithID(String str, int i9, String str2, String str3, long j);

    private static native long getMMKVWithIDAndSize(String str, int i9, int i10, String str2);

    private native boolean isCompareBeforeSetEnabled();

    @FastNative
    private native boolean isEncryptionEnabled();

    @FastNative
    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(String str, String str2);

    private static native void jniInitialize(String str, String str2, int i9, boolean z9);

    private static void mmkvLogImp(int i9, String str, int i10, String str2, String str3) {
        int ordinal = f16552c[i9].ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return;
                    }
                    Log.e("MMKV", str3);
                    return;
                }
                Log.w("MMKV", str3);
                return;
            }
            Log.i("MMKV", str3);
            return;
        }
        Log.d("MMKV", str3);
    }

    @FastNative
    private native void nativeEnableCompareBeforeSet();

    private static void onContentChangedByOuterProcess(String str) {
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        b bVar = b.f22443a;
        f("Recover strategic for " + str + " is " + bVar);
        Integer num = (Integer) f16550a.get(bVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        b bVar = b.f22443a;
        f("Recover strategic for " + str + " is " + bVar);
        Integer num = (Integer) f16550a.get(bVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static native int pageSize();

    public static native boolean removeStorage(String str, String str2);

    private native void removeValueForKey(long j, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, String str3);

    private static native void setCallbackHandler(boolean z9, boolean z10);

    private static native void setLogLevel(int i9);

    private static native void setWantsContentChangeNotify(boolean z9);

    private native void sync(boolean z9);

    private native long totalSize(long j);

    private native int valueSize(long j, String str, boolean z9);

    public static native String version();

    private native int writeValueToNB(long j, String str, long j4, int i9);

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public final byte[] c(String str, byte[] bArr) {
        byte[] decodeBytes = decodeBytes(this.nativeHandle, str);
        if (decodeBytes != null) {
            return decodeBytes;
        }
        return bArr;
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(String str);

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public native String cryptKey();

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    public final void e(String str, byte[] bArr) {
        encodeBytes(this.nativeHandle, str, bArr);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }

    public native boolean enableAutoKeyExpire(int i9);

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z9) {
        return decodeBool(this.nativeHandle, str, z9);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f9) {
        return decodeFloat(this.nativeHandle, str, f9);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i9) {
        return decodeInt(this.nativeHandle, str, i9);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        String[] decodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (decodeStringSet != null) {
            try {
                Set set2 = (Set) HashSet.class.newInstance();
                set2.addAll(Arrays.asList(decodeStringSet));
                return set2;
            } catch (IllegalAccessException | InstantiationException unused) {
                return set;
            }
        }
        return set;
    }

    public native void lock();

    public native String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z9) {
        encodeBool(this.nativeHandle, str, z9);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f9) {
        encodeFloat(this.nativeHandle, str, f9);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i9) {
        encodeInt(this.nativeHandle, str, i9);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        encodeLong(this.nativeHandle, str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        String[] strArr;
        long j = this.nativeHandle;
        if (set == null) {
            strArr = null;
        } else {
            strArr = (String[]) set.toArray(new String[0]);
        }
        encodeSet(j, str, strArr);
        return this;
    }

    public native boolean reKey(String str);

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        removeValueForKey(this.nativeHandle, str);
        return this;
    }

    public native void removeValuesForKeys(String[] strArr);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }
}
