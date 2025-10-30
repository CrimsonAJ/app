package H;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class g extends M4.a {
    public static Class j = null;

    /* renamed from: k, reason: collision with root package name */
    public static Constructor f2923k = null;

    /* renamed from: l, reason: collision with root package name */
    public static Method f2924l = null;

    /* renamed from: m, reason: collision with root package name */
    public static Method f2925m = null;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f2926n = false;

    public static boolean C(Object obj, String str, int i9, boolean z9) {
        D();
        try {
            try {
                return ((Boolean) f2924l.invoke(obj, str, Integer.valueOf(i9), Boolean.valueOf(z9))).booleanValue();
            } catch (InvocationTargetException e8) {
                e = e8;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e9) {
            e = e9;
        }
    }

    public static void D() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2926n) {
            return;
        }
        f2926n = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi21Impl", e8.getClass().getName(), e8);
            method = null;
            cls = null;
            method2 = null;
        }
        f2923k = constructor;
        j = cls;
        f2924l = method2;
        f2925m = method;
    }

    @Override // M4.a
    public Typeface d(Context context, G.e eVar, Resources resources, int i9) {
        D();
        try {
            Object newInstance = f2923k.newInstance(null);
            for (G.f fVar : eVar.f2603a) {
                File x5 = O4.h.x(context);
                if (x5 == null) {
                    return null;
                }
                try {
                    if (!O4.h.n(x5, resources, fVar.f2609f)) {
                        return null;
                    }
                    if (!C(newInstance, x5.getPath(), fVar.f2605b, fVar.f2606c)) {
                        return null;
                    }
                    x5.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    x5.delete();
                }
            }
            D();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) j, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f2925m.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e8) {
                throw new RuntimeException(e8);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // M4.a
    public Typeface e(Context context, M.i[] iVarArr, int i9) {
        File file;
        String readlink;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m(iVarArr, i9).f4669a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                } else {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } catch (Throwable th) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            Typeface g9 = g(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return g9;
                        }
                        Typeface g92 = g(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return g92;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile2 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile2;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
