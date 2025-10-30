package O0;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import i6.f;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import s.C1936f;

/* loaded from: classes.dex */
public final class a implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    public final b f5254a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences.Editor f5255b;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f5257d = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f5256c = new CopyOnWriteArrayList();

    public a(b bVar, SharedPreferences.Editor editor) {
        this.f5254a = bVar;
        this.f5255b = editor;
    }

    public final void a() {
        if (this.f5257d.getAndSet(false)) {
            b bVar = this.f5254a;
            for (String str : ((HashMap) bVar.getAll()).keySet()) {
                if (!this.f5256c.contains(str) && !b.d(str)) {
                    this.f5255b.remove(bVar.b(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        a();
        this.f5255b.apply();
        b();
        this.f5256c.clear();
    }

    public final void b() {
        b bVar = this.f5254a;
        Iterator it = bVar.f5259b.iterator();
        while (it.hasNext()) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
            Iterator it2 = this.f5256c.iterator();
            while (it2.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(bVar, (String) it2.next());
            }
        }
    }

    public final void c(String str, byte[] bArr) {
        b bVar = this.f5254a;
        bVar.getClass();
        if (!b.d(str)) {
            this.f5256c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String b9 = bVar.b(str);
                try {
                    Pair pair = new Pair(b9, new String(f.b(bVar.f5260c.a(bArr, b9.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                    this.f5255b.putString((String) pair.first, (String) pair.second);
                    return;
                } catch (UnsupportedEncodingException e8) {
                    throw new AssertionError(e8);
                }
            } catch (GeneralSecurityException e9) {
                throw new SecurityException("Could not encrypt data: " + e9.getMessage(), e9);
            }
        }
        throw new SecurityException(AbstractC0953k1.n(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f5257d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5256c;
        a();
        try {
            return this.f5255b.commit();
        } finally {
            b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z9) {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.putInt(5);
        allocate.put(z9 ? (byte) 1 : (byte) 0);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f9) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(4);
        allocate.putFloat(f9);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i9) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(2);
        allocate.putInt(i9);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.putInt(3);
        allocate.putLong(j);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 8);
        allocate.putInt(0);
        allocate.putInt(length);
        allocate.put(bytes);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        int i9 = 0;
        if (set == null) {
            set = new C1936f(0);
            set.add("__NULL__");
        }
        ArrayList arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(size + 4);
        allocate.putInt(1);
        int size2 = arrayList.size();
        while (i9 < size2) {
            Object obj = arrayList.get(i9);
            i9++;
            byte[] bArr = (byte[]) obj;
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        b bVar = this.f5254a;
        bVar.getClass();
        if (!b.d(str)) {
            this.f5255b.remove(bVar.b(str));
            this.f5256c.add(str);
            return this;
        }
        throw new SecurityException(AbstractC0953k1.n(str, " is a reserved key for the encryption keyset."));
    }
}
