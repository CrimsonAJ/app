package O4;

import D4.K;
import F4.y;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import e1.q;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import z2.C2235a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f5465e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f5466f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f5467g = false;

    /* renamed from: h, reason: collision with root package name */
    public static int f5468h = -1;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f5469i;

    /* renamed from: m, reason: collision with root package name */
    public static k f5472m;

    /* renamed from: n, reason: collision with root package name */
    public static l f5473n;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5474a;
    public static final ThreadLocal j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public static final K f5470k = new K(1);

    /* renamed from: l, reason: collision with root package name */
    public static final Q6.f f5471l = new Q6.f(9);

    /* renamed from: b, reason: collision with root package name */
    public static final C2235a f5462b = new C2235a(9);

    /* renamed from: c, reason: collision with root package name */
    public static final F5.e f5463c = new F5.e(10);

    /* renamed from: d, reason: collision with root package name */
    public static final Q6.f f5464d = new Q6.f(10);

    public f(Context context) {
        this.f5474a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!y.k(declaredField.get(null), str)) {
                Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e8) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e8.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [O4.j, java.lang.Object] */
    public static f c(Context context, e eVar, String str) {
        long j4;
        f fVar;
        Boolean bool;
        N4.a j12;
        f fVar2;
        l lVar;
        boolean z9;
        N4.a j13;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = j;
            j jVar = (j) threadLocal.get();
            ?? obj = new Object();
            threadLocal.set(obj);
            K k5 = f5470k;
            Long l9 = (Long) k5.get();
            long longValue = l9.longValue();
            try {
                k5.set(Long.valueOf(SystemClock.uptimeMillis()));
                d l10 = eVar.l(context, str, f5471l);
                j4 = longValue;
                try {
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + l10.f5459a + " and remote module " + str + ":" + l10.f5460b);
                    int i9 = l10.f5461c;
                    if (i9 != 0) {
                        if (i9 == -1) {
                            if (l10.f5459a != 0) {
                                i9 = -1;
                            }
                        }
                        if (i9 != 1 || l10.f5460b != 0) {
                            if (i9 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                fVar = new f(applicationContext);
                            } else if (i9 == 1) {
                                try {
                                    int i10 = l10.f5460b;
                                    try {
                                        synchronized (f.class) {
                                            if (g(context)) {
                                                bool = f5465e;
                                            } else {
                                                throw new Exception("Remote loading disabled");
                                            }
                                        }
                                        if (bool != null) {
                                            if (bool.booleanValue()) {
                                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                                synchronized (f.class) {
                                                    lVar = f5473n;
                                                }
                                                if (lVar != null) {
                                                    j jVar2 = (j) threadLocal.get();
                                                    if (jVar2 != null && jVar2.f5485a != null) {
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor = jVar2.f5485a;
                                                        new N4.b(null);
                                                        synchronized (f.class) {
                                                            if (f5468h >= 2) {
                                                                z9 = true;
                                                            } else {
                                                                z9 = false;
                                                            }
                                                        }
                                                        if (z9) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            j13 = lVar.k1(new N4.b(applicationContext2), str, i10, new N4.b(cursor));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            j13 = lVar.j1(new N4.b(applicationContext2), str, i10, new N4.b(cursor));
                                                        }
                                                        Context context2 = (Context) N4.b.i1(j13);
                                                        if (context2 != null) {
                                                            fVar2 = new f(context2);
                                                        } else {
                                                            throw new Exception("Failed to get module context");
                                                        }
                                                    } else {
                                                        throw new Exception("No result cursor");
                                                    }
                                                } else {
                                                    throw new Exception("DynamiteLoaderV2 was not cached.");
                                                }
                                            } else {
                                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                                k h7 = h(context);
                                                if (h7 != null) {
                                                    Parcel g9 = h7.g(h7.Q(), 6);
                                                    int readInt = g9.readInt();
                                                    g9.recycle();
                                                    if (readInt >= 3) {
                                                        j jVar3 = (j) threadLocal.get();
                                                        if (jVar3 != null) {
                                                            j12 = h7.k1(new N4.b(context), str, i10, new N4.b(jVar3.f5485a));
                                                        } else {
                                                            throw new Exception("No cached result cursor holder");
                                                        }
                                                    } else if (readInt == 2) {
                                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                        j12 = h7.l1(new N4.b(context), str, i10);
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                        j12 = h7.j1(new N4.b(context), str, i10);
                                                    }
                                                    Object i12 = N4.b.i1(j12);
                                                    if (i12 != null) {
                                                        fVar2 = new f((Context) i12);
                                                    } else {
                                                        throw new Exception("Failed to load remote module.");
                                                    }
                                                } else {
                                                    throw new Exception("Failed to create IDynamiteLoader.");
                                                }
                                            }
                                            fVar = fVar2;
                                        } else {
                                            throw new Exception("Failed to determine which loading route to use.");
                                        }
                                    } catch (b e8) {
                                        throw e8;
                                    } catch (RemoteException e9) {
                                        throw new Exception("Failed to load remote module.", e9);
                                    } catch (Throwable th) {
                                        throw new Exception("Failed to load remote module.", th);
                                    }
                                } catch (b e10) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e10.getMessage());
                                    int i11 = l10.f5459a;
                                    if (i11 != 0 && eVar.l(context, str, new q(i11)).f5461c == -1) {
                                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                        fVar = new f(applicationContext);
                                    } else {
                                        throw new Exception("Remote load failed. No local fallback found.", e10);
                                    }
                                }
                            } else {
                                throw new Exception("VersionPolicy returned invalid code:" + i9);
                            }
                            if (j4 == 0) {
                                f5470k.remove();
                            } else {
                                f5470k.set(l9);
                            }
                            Cursor cursor2 = obj.f5485a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            j.set(jVar);
                            return fVar;
                        }
                    }
                    throw new Exception("No acceptable module " + str + " found. Local version is " + l10.f5459a + " and remote version is " + l10.f5460b + ".");
                } catch (Throwable th2) {
                    th = th2;
                    if (j4 == 0) {
                        f5470k.remove();
                    } else {
                        f5470k.set(l9);
                    }
                    Cursor cursor3 = obj.f5485a;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    j.set(jVar);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j4 = longValue;
            }
        } else {
            throw new Exception("null application Context");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x017c, code lost:
    
        if (r2 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.f.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0134, code lost:
    
        if (r5 != false) goto L93;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.f.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [S4.a] */
    public static void f(ClassLoader classLoader) {
        try {
            l lVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof l) {
                    lVar = (l) queryLocalInterface;
                } else {
                    try {
                        lVar = new S4.a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
                    } catch (IllegalAccessException e8) {
                        e = e8;
                        throw new Exception("Failed to instantiate dynamite loader", e);
                    } catch (InstantiationException e9) {
                        e = e9;
                        throw new Exception("Failed to instantiate dynamite loader", e);
                    } catch (NoSuchMethodException e10) {
                        e = e10;
                        throw new Exception("Failed to instantiate dynamite loader", e);
                    } catch (InvocationTargetException e11) {
                        e = e11;
                        throw new Exception("Failed to instantiate dynamite loader", e);
                    }
                }
            }
            f5473n = lVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e12) {
            e = e12;
        }
    }

    public static boolean g(Context context) {
        int i9;
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f5469i)) {
            return true;
        }
        boolean z9 = false;
        if (f5469i == null) {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 29) {
                i9 = 268435456;
            } else {
                i9 = 0;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i9);
            if (B4.g.f697b.b(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z9 = true;
            }
            f5469i = Boolean.valueOf(z9);
            if (z9 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f5467g = true;
            }
        }
        if (!z9) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k h(Context context) {
        k kVar;
        synchronized (f.class) {
            k kVar2 = f5472m;
            if (kVar2 != null) {
                return kVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    kVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof k) {
                        kVar = (k) queryLocalInterface;
                    } else {
                        kVar = new S4.a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                    }
                }
                if (kVar != 0) {
                    f5472m = kVar;
                    return kVar;
                }
            } catch (Exception e8) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e8.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f5474a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e8) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e8);
        }
    }
}
