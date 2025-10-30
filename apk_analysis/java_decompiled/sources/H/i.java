package H;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends g {

    /* renamed from: o, reason: collision with root package name */
    public final Class f2930o;

    /* renamed from: p, reason: collision with root package name */
    public final Constructor f2931p;

    /* renamed from: q, reason: collision with root package name */
    public final Method f2932q;

    /* renamed from: r, reason: collision with root package name */
    public final Method f2933r;

    /* renamed from: s, reason: collision with root package name */
    public final Method f2934s;

    /* renamed from: t, reason: collision with root package name */
    public final Method f2935t;

    /* renamed from: u, reason: collision with root package name */
    public final Method f2936u;

    public i() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = J(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = K(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e8.getClass().getName()), e8);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2930o = cls;
        this.f2931p = constructor;
        this.f2932q = method2;
        this.f2933r = method3;
        this.f2934s = method4;
        this.f2935t = method5;
        this.f2936u = method;
    }

    public static Method J(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void E(Object obj) {
        try {
            this.f2935t.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean F(Context context, Object obj, String str, int i9, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2932q.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface G(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f2930o, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2936u.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean H(Object obj) {
        try {
            return ((Boolean) this.f2934s.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object I() {
        try {
            return this.f2931p.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method K(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // H.g, M4.a
    public final Typeface d(Context context, G.e eVar, Resources resources, int i9) {
        Method method = this.f2932q;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            Object I4 = I();
            if (I4 != null) {
                G.f[] fVarArr = eVar.f2603a;
                int length = fVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    G.f fVar = fVarArr[i10];
                    String str = fVar.f2604a;
                    FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(fVar.f2607d);
                    Context context2 = context;
                    if (!F(context2, I4, str, fVar.f2608e, fVar.f2605b, fVar.f2606c ? 1 : 0, fromFontVariationSettings)) {
                        E(I4);
                        return null;
                    }
                    i10++;
                    context = context2;
                }
                if (H(I4)) {
                    return G(I4);
                }
            }
            return null;
        }
        return super.d(context, eVar, resources, i9);
    }

    @Override // H.g, M4.a
    public final Typeface e(Context context, M.i[] iVarArr, int i9) {
        Typeface G8;
        boolean z9;
        if (iVarArr.length >= 1) {
            Method method = this.f2932q;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap hashMap = new HashMap();
                for (M.i iVar : iVarArr) {
                    if (iVar.f4673e == 0) {
                        Uri uri = iVar.f4669a;
                        if (!hashMap.containsKey(uri)) {
                            hashMap.put(uri, O4.h.C(context, uri));
                        }
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                Object I4 = I();
                if (I4 != null) {
                    int length = iVarArr.length;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 < length) {
                        M.i iVar2 = iVarArr[i10];
                        ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(iVar2.f4669a);
                        if (byteBuffer != null) {
                            try {
                                z9 = ((Boolean) this.f2933r.invoke(I4, byteBuffer, Integer.valueOf(iVar2.f4670b), null, Integer.valueOf(iVar2.f4671c), Integer.valueOf(iVar2.f4672d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                z9 = false;
                            }
                            if (!z9) {
                                E(I4);
                                return null;
                            }
                            z10 = true;
                        }
                        i10++;
                        z10 = z10;
                    }
                    if (!z10) {
                        E(I4);
                        return null;
                    }
                    if (H(I4) && (G8 = G(I4)) != null) {
                        return Typeface.create(G8, i9);
                    }
                }
            } else {
                M.i m9 = m(iVarArr, i9);
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m9.f4669a, "r", null);
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                            return null;
                        }
                    } else {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(m9.f4671c).setItalic(m9.f4672d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // M4.a
    public final Typeface h(Context context, Resources resources, int i9, String str, int i10) {
        Method method = this.f2932q;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            Object I4 = I();
            if (I4 != null) {
                if (!F(context, I4, str, 0, -1, -1, null)) {
                    E(I4);
                    return null;
                }
                if (H(I4)) {
                    return G(I4);
                }
            }
            return null;
        }
        return super.h(context, resources, i9, str, i10);
    }
}
