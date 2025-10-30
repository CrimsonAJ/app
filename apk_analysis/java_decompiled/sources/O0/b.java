package O0;

import U5.n;
import V5.f;
import V5.h;
import a6.C0501a;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.media.session.y;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import h6.F;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p.c1;
import s.C1936f;
import u0.z;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class b implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f5258a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f5259b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final U5.a f5260c;

    /* renamed from: d, reason: collision with root package name */
    public final U5.c f5261d;

    public b(SharedPreferences sharedPreferences, U5.a aVar, U5.c cVar) {
        this.f5258a = sharedPreferences;
        this.f5260c = aVar;
        this.f5261d = cVar;
    }

    public static b a(Context context, G6.a aVar) {
        y c3;
        String str = aVar.f2875b;
        int i9 = Z5.a.f9060a;
        n.g(Z5.c.f9065b);
        if (!Y5.a.a()) {
            n.e(new h(F.class, new f[]{new f(9, U5.c.class)}, 8), true);
        }
        V5.a.a();
        Context applicationContext = context.getApplicationContext();
        c1 c1Var = new c1();
        c1Var.f21981f = U5.b.a("AES256_SIV");
        if (applicationContext != null) {
            c1Var.f21976a = applicationContext;
            c1Var.f21977b = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
            c1Var.f21978c = "com.anilab.data";
            String e8 = z.e("android-keystore://", str);
            if (e8.startsWith("android-keystore://")) {
                c1Var.f21979d = e8;
                C0501a c9 = c1Var.c();
                synchronized (c9) {
                    c3 = c9.f9159a.c();
                }
                c1 c1Var2 = new c1();
                c1Var2.f21981f = U5.b.a("AES256_GCM");
                c1Var2.f21976a = applicationContext;
                c1Var2.f21977b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
                c1Var2.f21978c = "com.anilab.data";
                String e9 = z.e("android-keystore://", str);
                if (e9.startsWith("android-keystore://")) {
                    c1Var2.f21979d = e9;
                    y a5 = c1Var2.c().a();
                    return new b(applicationContext.getSharedPreferences("com.anilab.data", 0), (U5.a) a5.L(U5.a.class), (U5.c) c3.L(U5.c.class));
                }
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        throw new IllegalArgumentException("need an Android context");
    }

    public static boolean d(String str) {
        if (!"__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) && !"__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str)) {
            return false;
        }
        return true;
    }

    public final String b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(i6.f.b(this.f5261d.a(str.getBytes(StandardCharsets.UTF_8), "com.anilab.data".getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e8) {
                throw new AssertionError(e8);
            }
        } catch (GeneralSecurityException e9) {
            throw new SecurityException("Could not encrypt key. " + e9.getMessage(), e9);
        }
    }

    public final Object c(String str) {
        int i9;
        String str2;
        if (!d(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String b9 = b(str);
                String string = this.f5258a.getString(b9, null);
                if (string != null) {
                    byte[] a5 = i6.f.a(string);
                    U5.a aVar = this.f5260c;
                    Charset charset = StandardCharsets.UTF_8;
                    ByteBuffer wrap = ByteBuffer.wrap(aVar.b(a5, b9.getBytes(charset)));
                    boolean z9 = false;
                    wrap.position(0);
                    int i10 = wrap.getInt();
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 != 4) {
                                        if (i10 != 5) {
                                            i9 = 0;
                                        } else {
                                            i9 = 6;
                                        }
                                    } else {
                                        i9 = 5;
                                    }
                                } else {
                                    i9 = 4;
                                }
                            } else {
                                i9 = 3;
                            }
                        } else {
                            i9 = 2;
                        }
                    } else {
                        i9 = 1;
                    }
                    if (i9 != 0) {
                        int b10 = AbstractC2128h.b(i9);
                        if (b10 != 0) {
                            if (b10 != 1) {
                                if (b10 != 2) {
                                    if (b10 != 3) {
                                        if (b10 != 4) {
                                            if (b10 == 5) {
                                                if (wrap.get() != 0) {
                                                    z9 = true;
                                                }
                                                return Boolean.valueOf(z9);
                                            }
                                            switch (i9) {
                                                case 1:
                                                    str2 = "STRING";
                                                    break;
                                                case 2:
                                                    str2 = "STRING_SET";
                                                    break;
                                                case 3:
                                                    str2 = "INT";
                                                    break;
                                                case 4:
                                                    str2 = "LONG";
                                                    break;
                                                case 5:
                                                    str2 = "FLOAT";
                                                    break;
                                                case 6:
                                                    str2 = "BOOLEAN";
                                                    break;
                                                default:
                                                    str2 = "null";
                                                    break;
                                            }
                                            throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                                        }
                                        return Float.valueOf(wrap.getFloat());
                                    }
                                    return Long.valueOf(wrap.getLong());
                                }
                                return Integer.valueOf(wrap.getInt());
                            }
                            C1936f c1936f = new C1936f(0);
                            while (wrap.hasRemaining()) {
                                int i11 = wrap.getInt();
                                ByteBuffer slice = wrap.slice();
                                slice.limit(i11);
                                wrap.position(wrap.position() + i11);
                                c1936f.add(StandardCharsets.UTF_8.decode(slice).toString());
                            }
                            if (c1936f.f22651c != 1 || !"__NULL__".equals(c1936f.f22650b[0])) {
                                return c1936f;
                            }
                        } else {
                            int i12 = wrap.getInt();
                            ByteBuffer slice2 = wrap.slice();
                            wrap.limit(i12);
                            String charBuffer = charset.decode(slice2).toString();
                            if (!charBuffer.equals("__NULL__")) {
                                return charBuffer;
                            }
                        }
                    } else {
                        throw new SecurityException("Unknown type ID for encrypted pref value: " + i10);
                    }
                }
                return null;
            } catch (GeneralSecurityException e8) {
                throw new SecurityException("Could not decrypt value. " + e8.getMessage(), e8);
            }
        }
        throw new SecurityException(AbstractC0953k1.n(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (!d(str)) {
            return this.f5258a.contains(b(str));
        }
        throw new SecurityException(AbstractC0953k1.n(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new a(this, this.f5258a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f5258a.getAll().entrySet()) {
            if (!d(entry.getKey())) {
                try {
                    String str = new String(this.f5261d.b(i6.f.a(entry.getKey()), "com.anilab.data".getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, c(str));
                } catch (GeneralSecurityException e8) {
                    throw new SecurityException("Could not decrypt key. " + e8.getMessage(), e8);
                }
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z9) {
        Object c3 = c(str);
        if (c3 instanceof Boolean) {
            return ((Boolean) c3).booleanValue();
        }
        return z9;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f9) {
        Object c3 = c(str);
        if (c3 instanceof Float) {
            return ((Float) c3).floatValue();
        }
        return f9;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i9) {
        Object c3 = c(str);
        if (c3 instanceof Integer) {
            return ((Integer) c3).intValue();
        }
        return i9;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object c3 = c(str);
        if (c3 instanceof Long) {
            return ((Long) c3).longValue();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object c3 = c(str);
        if (c3 instanceof String) {
            return (String) c3;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set c1936f;
        Object c3 = c(str);
        if (c3 instanceof Set) {
            c1936f = (Set) c3;
        } else {
            c1936f = new C1936f(0);
        }
        if (c1936f.size() > 0) {
            return c1936f;
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f5259b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f5259b.remove(onSharedPreferenceChangeListener);
    }
}
