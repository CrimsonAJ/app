package y2;

import B6.u0;
import B7.j;
import B7.k;
import B7.t;
import android.content.SharedPreferences;
import com.tencent.mmkv.MMKV;
import g6.o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.h;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesC2204b implements SharedPreferences, SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    public final MMKV f24773a;

    public SharedPreferencesC2204b(MMKV mmkv) {
        this.f24773a = mmkv;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f24773a.clearAll();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return true;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String key) {
        h.e(key, "key");
        return this.f24773a.contains(key);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        this.f24773a.getAll();
        throw null;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String key, boolean z9) {
        h.e(key, "key");
        byte[] e8 = o.f17761a.e(this.f24773a.c(key, new byte[0]));
        if (e8.length == 0) {
            return z9;
        }
        if (e8[0] == 0) {
            return false;
        }
        return true;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String key, float f9) {
        h.e(key, "key");
        byte[] e8 = o.f17761a.e(this.f24773a.c(key, new byte[0]));
        if (e8.length >= 4) {
            return ByteBuffer.wrap(e8).getFloat();
        }
        return f9;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String key, int i9) {
        h.e(key, "key");
        byte[] e8 = o.f17761a.e(this.f24773a.c(key, new byte[0]));
        if (e8.length >= 4) {
            return ByteBuffer.wrap(e8).getInt();
        }
        return i9;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String key, long j) {
        h.e(key, "key");
        byte[] e8 = o.f17761a.e(this.f24773a.c(key, new byte[0]));
        if (e8.length >= 8) {
            return ByteBuffer.wrap(e8).getLong();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String key, String str) {
        h.e(key, "key");
        byte[] e8 = o.f17761a.e(this.f24773a.c(key, new byte[0]));
        h.e(e8, "<this>");
        return new String(e8, W7.a.f7934a);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String key, Set set) {
        h.e(key, "key");
        int i9 = 0;
        byte[] e8 = o.f17761a.e(this.f24773a.c(key, new byte[0]));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (i9 < e8.length) {
            int i10 = ((e8[i9] & 255) << 8) | (e8[i9 + 1] & 255);
            int i11 = i9 + 2;
            int i12 = i10 + i11;
            linkedHashSet.add(new String(j.g0(e8, i11, i12), W7.a.f7934a));
            i9 = i12;
        }
        return linkedHashSet;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String key, boolean z9) {
        h.e(key, "key");
        this.f24773a.e(key, o.f17761a.g(new byte[]{z9 ? (byte) 1 : (byte) 0}));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String key, float f9) {
        h.e(key, "key");
        o oVar = o.f17761a;
        byte[] array = ByteBuffer.allocate(4).putFloat(f9).array();
        h.d(array, "array(...)");
        this.f24773a.e(key, oVar.g(array));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String key, int i9) {
        h.e(key, "key");
        o oVar = o.f17761a;
        byte[] array = ByteBuffer.allocate(4).putInt(i9).array();
        h.d(array, "array(...)");
        this.f24773a.e(key, oVar.g(array));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String key, long j) {
        h.e(key, "key");
        o oVar = o.f17761a;
        byte[] array = ByteBuffer.allocate(8).putLong(j).array();
        h.d(array, "array(...)");
        this.f24773a.e(key, oVar.g(array));
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r3 == null) goto L6;
     */
    @Override // android.content.SharedPreferences.Editor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.SharedPreferences.Editor putString(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.h.e(r2, r0)
            if (r3 == 0) goto L1a
            java.nio.charset.Charset r0 = W7.a.f7934a
            byte[] r3 = r3.getBytes(r0)
            java.lang.String r0 = "getBytes(...)"
            kotlin.jvm.internal.h.d(r3, r0)
            g6.o r0 = g6.o.f17761a
            byte[] r3 = r0.g(r3)
            if (r3 != 0) goto L1d
        L1a:
            r3 = 0
            byte[] r3 = new byte[r3]
        L1d:
            com.tencent.mmkv.MMKV r0 = r1.f24773a
            r0.e(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.SharedPreferencesC2204b.putString(java.lang.String, java.lang.String):android.content.SharedPreferences$Editor");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [B7.t] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String key, Set set) {
        byte[] bArr;
        ?? r42;
        h.e(key, "key");
        o oVar = o.f17761a;
        int i9 = 0;
        if (set != null) {
            List<String> H02 = k.H0(set);
            ArrayList arrayList = new ArrayList();
            for (String str : H02) {
                h.e(str, "<this>");
                byte[] bytes = str.getBytes(W7.a.f7934a);
                h.d(bytes, "getBytes(...)");
                int length = bytes.length;
                arrayList.add(Byte.valueOf((byte) (length >> 8)));
                arrayList.add(Byte.valueOf((byte) (length & 255)));
                int length2 = bytes.length;
                if (length2 != 0) {
                    if (length2 != 1) {
                        r42 = new ArrayList(bytes.length);
                        for (byte b9 : bytes) {
                            r42.add(Byte.valueOf(b9));
                        }
                    } else {
                        r42 = u0.D(Byte.valueOf(bytes[0]));
                    }
                } else {
                    r42 = t.f1135a;
                }
                arrayList.addAll(r42);
            }
            bArr = new byte[arrayList.size()];
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                bArr[i9] = ((Number) obj).byteValue();
                i9++;
            }
        } else {
            bArr = new byte[0];
        }
        this.f24773a.e(key, oVar.g(bArr));
        return this;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f24773a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        throw null;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String key) {
        h.e(key, "key");
        this.f24773a.remove(key);
        return this;
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f24773a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        throw null;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }
}
