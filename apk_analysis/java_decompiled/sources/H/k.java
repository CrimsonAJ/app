package H;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends M4.a {
    public static Font C(FontFamily fontFamily, int i9) {
        int i10;
        int i11;
        if ((i9 & 1) != 0) {
            i10 = 700;
        } else {
            i10 = 400;
        }
        if ((i9 & 2) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        FontStyle fontStyle = new FontStyle(i10, i11);
        Font font = fontFamily.getFont(0);
        int E8 = E(fontStyle, font.getStyle());
        for (int i12 = 1; i12 < fontFamily.getSize(); i12++) {
            Font font2 = fontFamily.getFont(i12);
            int E9 = E(fontStyle, font2.getStyle());
            if (E9 < E8) {
                font = font2;
                E8 = E9;
            }
        }
        return font;
    }

    public static FontFamily D(M.i[] iVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (M.i iVar : iVarArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(iVar.f4669a, "r", null);
            } catch (IOException e8) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
            }
            if (openFileDescriptor == null) {
                if (openFileDescriptor == null) {
                }
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(iVar.f4671c).setSlant(iVar.f4672d ? 1 : 0).setTtcIndex(iVar.f4670b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                    break;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int E(FontStyle fontStyle, FontStyle fontStyle2) {
        int i9;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i9 = 0;
        } else {
            i9 = 2;
        }
        return abs + i9;
    }

    @Override // M4.a
    public final Typeface d(Context context, G.e eVar, Resources resources, int i9) {
        try {
            FontFamily.Builder builder = null;
            for (G.f fVar : eVar.f2603a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f2609f).setWeight(fVar.f2605b).setSlant(fVar.f2606c ? 1 : 0).setTtcIndex(fVar.f2608e).setFontVariationSettings(fVar.f2607d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(C(build2, i9).getStyle()).build();
        } catch (Exception e8) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
            return null;
        }
    }

    @Override // M4.a
    public final Typeface e(Context context, M.i[] iVarArr, int i9) {
        try {
            FontFamily D8 = D(iVarArr, context.getContentResolver());
            if (D8 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(D8).setStyle(C(D8, i9).getStyle()).build();
        } catch (Exception e8) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
            return null;
        }
    }

    @Override // M4.a
    public final Typeface f(Context context, List list, int i9) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily D8 = D((M.i[]) list.get(0), contentResolver);
            if (D8 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(D8);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily D9 = D((M.i[]) list.get(i10), contentResolver);
                if (D9 != null) {
                    customFallbackBuilder.addCustomFallback(D9);
                }
            }
            return customFallbackBuilder.setStyle(C(D8, i9).getStyle()).build();
        } catch (Exception e8) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
            return null;
        }
    }

    @Override // M4.a
    public final Typeface g(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // M4.a
    public final Typeface h(Context context, Resources resources, int i9, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i9).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e8) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
            return null;
        }
    }

    @Override // M4.a
    public final M.i m(M.i[] iVarArr, int i9) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
