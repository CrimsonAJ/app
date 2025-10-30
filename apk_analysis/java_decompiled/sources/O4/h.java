package O4;

import P.Q;
import a.AbstractC0485a;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.anilab.data.model.preference.RecentlyWatchedJson;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import g6.o;
import i8.F;
import i8.G;
import i8.L;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import l4.y;
import s6.C1962b;
import s6.p;
import t4.v;
import y2.C2203a;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f5476a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f5477b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5478c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5479d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5480e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f5481f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f5482g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f5483h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f5484i = 0;

    public static boolean A(L l9, G request) {
        kotlin.jvm.internal.h.e(request, "request");
        int i9 = l9.f19032d;
        if (i9 != 200 && i9 != 410 && i9 != 414 && i9 != 501 && i9 != 203 && i9 != 204) {
            if (i9 != 307) {
                if (i9 != 308 && i9 != 404 && i9 != 405) {
                    switch (i9) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (L.d(l9, "Expires") == null && l9.a().f19090c == -1 && !l9.a().f19093f && !l9.a().f19092e) {
                return false;
            }
        }
        if (!l9.a().f19089b && !request.a().f19089b) {
            return true;
        }
        return false;
    }

    public static E7.i B(E7.g gVar, E7.h key) {
        kotlin.jvm.internal.h.e(key, "key");
        if (kotlin.jvm.internal.h.a(gVar.getKey(), key)) {
            return E7.j.f1978a;
        }
        return gVar;
    }

    public static MappedByteBuffer C(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static E7.i D(E7.g gVar, E7.i context) {
        kotlin.jvm.internal.h.e(context, "context");
        if (context == E7.j.f1978a) {
            return gVar;
        }
        return (E7.i) context.fold(gVar, new E7.b(1));
    }

    public static void E(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void F(TextView textView, int i9) {
        int i10;
        s8.e.e(i9);
        if (Build.VERSION.SDK_INT >= 28) {
            F.a.o(textView, i9);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i10 = fontMetricsInt.top;
        } else {
            i10 = fontMetricsInt.ascent;
        }
        if (i9 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i9 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void G(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z9;
        WeakHashMap weakHashMap = Q.f5546a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z10 = false;
        int i9 = 1;
        if (onLongClickListener != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (hasOnClickListeners || z9) {
            z10 = true;
        }
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z9);
        if (!z10) {
            i9 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i9);
    }

    public static void H(TextView textView, int i9) {
        int i10;
        s8.e.e(i9);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i10 = fontMetricsInt.bottom;
        } else {
            i10 = fontMetricsInt.descent;
        }
        if (i9 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i9 - i10);
        }
    }

    public static void I(TextView textView, int i9) {
        s8.e.e(i9);
        if (i9 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i9 - r0, 1.0f);
        }
    }

    public static final void J(C2203a c2203a, RecentlyWatchedJson recentlyWatchedJson) {
        kotlin.jvm.internal.h.e(c2203a, "<this>");
        String h02 = o.f17761a.h0();
        SharedPreferences.Editor edit = c2203a.f24771a.edit();
        edit.putString(h02, c2203a.f24772b.a(RecentlyWatchedJson.class).d(recentlyWatchedJson));
        edit.apply();
    }

    public static String K(Throwable th) {
        kotlin.jvm.internal.h.e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.h.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static String L(int i9) {
        Object[] objArr = {Integer.valueOf(Color.red(i9)), Integer.valueOf(Color.green(i9)), Integer.valueOf(Color.blue(i9)), Double.valueOf(Color.alpha(i9) / 255.0d)};
        int i10 = y.f20553a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static ActionMode.Callback M(ActionMode.Callback callback) {
        if ((callback instanceof S.i) && Build.VERSION.SDK_INT >= 26) {
            return ((S.i) callback).f6695a;
        }
        return callback;
    }

    public static ActionMode.Callback N(ActionMode.Callback callback, TextView textView) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && i9 <= 27 && !(callback instanceof S.i) && callback != null) {
            return new S.i(callback, textView);
        }
        return callback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        if (r1 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader O() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.h.O():java.lang.ClassLoader");
    }

    public static long P(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static void a(Throwable th, Throwable exception) {
        kotlin.jvm.internal.h.e(th, "<this>");
        kotlin.jvm.internal.h.e(exception, "exception");
        if (th != exception) {
            Integer num = J7.a.f4228a;
            if (num != null && num.intValue() < 19) {
                Method method = I7.a.f3582a;
                if (method != null) {
                    method.invoke(th, exception);
                    return;
                }
                return;
            }
            th.addSuppressed(exception);
        }
    }

    public static final void b(int i9, StringBuilder sb) {
        for (int i10 = 0; i10 < i9; i10++) {
            sb.append("?");
            if (i10 < i9 - 1) {
                sb.append(",");
            }
        }
    }

    public static void c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static String d(String str, int i9, int i10) {
        if (i9 < 0) {
            return Z0.a.r("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return Z0.a.r("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i10);
        throw new IllegalArgumentException(sb.toString());
    }

    public static C7.j e(C7.j jVar) {
        C7.g gVar = jVar.f1655a;
        gVar.b();
        gVar.f1650m = true;
        if (gVar.f1647i <= 0) {
            kotlin.jvm.internal.h.c(C7.g.f1638n, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        if (gVar.f1647i > 0) {
            return jVar;
        }
        return C7.j.f1654b;
    }

    public static void f(int i9, int i10) {
        String r5;
        if (i9 >= 0 && i9 < i10) {
            return;
        }
        if (i9 >= 0) {
            if (i10 >= 0) {
                r5 = Z0.a.r("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i9), Integer.valueOf(i10));
            } else {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i10);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            r5 = Z0.a.r("%s (%s) must not be negative", "index", Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(r5);
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void h(int i9, int i10) {
        if (i9 >= 0 && i9 <= i10) {
        } else {
            throw new IndexOutOfBoundsException(d("index", i9, i10));
        }
    }

    public static void i(int i9, int i10, int i11) {
        String d9;
        if (i9 >= 0 && i10 >= i9 && i10 <= i11) {
            return;
        }
        if (i9 >= 0 && i9 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                d9 = Z0.a.r("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9));
            } else {
                d9 = d("end index", i10, i11);
            }
        } else {
            d9 = d("start index", i9, i11);
        }
        throw new IndexOutOfBoundsException(d9);
    }

    public static void j(String str, boolean z9) {
        if (z9) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void k(a8.e eVar) {
        eVar.g(null, false);
    }

    public static void l(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ImageView.ScaleType m(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 5) {
                            if (i9 != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static boolean n(File file, Resources resources, int i9) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i9);
            try {
                boolean o9 = o(file, inputStream);
                l(inputStream);
                return o9;
            } catch (Throwable th) {
                th = th;
                l(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean o(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    l(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e9) {
            e = e9;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            l(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            l(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [d0.q, F0.K] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d0.q p(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            d0.c r0 = new d0.c
            r1 = 29
            r0.<init>(r1)
            goto L15
        Le:
            b5.x r0 = new b5.x
            r1 = 29
            r0.<init>(r1)
        L15:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            s8.e.g(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2e
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2e
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2e
            goto L4b
        L4a:
            r4 = r5
        L4b:
            if (r4 != 0) goto L4f
        L4d:
            r1 = r5
            goto L7e
        L4f:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            android.content.pm.Signature[] r0 = r0.b(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
        L5d:
            if (r3 >= r6) goto L6b
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r3 = r3 + 1
            goto L5d
        L6b:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            M.d r1 = new M.d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            goto L7e
        L77:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L4d
        L7e:
            if (r1 != 0) goto L81
            goto L8b
        L81:
            d0.q r5 = new d0.q
            d0.p r0 = new d0.p
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.h.p(android.content.Context):d0.q");
    }

    public static void q(ArrayList arrayList) {
        boolean z9;
        boolean z10;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C1962b c1962b = (C1962b) obj;
            s6.f fVar = new s6.f(c1962b);
            for (p pVar : c1962b.f22748b) {
                if (c1962b.f22751e == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s6.g gVar = new s6.g(pVar, !z10);
                if (!hashMap.containsKey(gVar)) {
                    hashMap.put(gVar, new HashSet());
                }
                Set set = (Set) hashMap.get(gVar);
                if (!set.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + pVar + ".");
                }
                set.add(fVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (s6.f fVar2 : (Set) it.next()) {
                for (s6.h hVar : fVar2.f22762a.f22749c) {
                    if (hVar.f22769c == 0) {
                        if (hVar.f22768b == 2) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        Set<s6.f> set2 = (Set) hashMap.get(new s6.g(hVar.f22767a, z9));
                        if (set2 != null) {
                            for (s6.f fVar3 : set2) {
                                fVar2.f22763b.add(fVar3);
                                fVar3.f22764c.add(fVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            s6.f fVar4 = (s6.f) it3.next();
            if (fVar4.f22764c.isEmpty()) {
                hashSet2.add(fVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            s6.f fVar5 = (s6.f) hashSet2.iterator().next();
            hashSet2.remove(fVar5);
            i9++;
            Iterator it4 = fVar5.f22763b.iterator();
            while (it4.hasNext()) {
                s6.f fVar6 = (s6.f) it4.next();
                fVar6.f22764c.remove(fVar5);
                if (fVar6.f22764c.isEmpty()) {
                    hashSet2.add(fVar6);
                }
            }
        }
        if (i9 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            s6.f fVar7 = (s6.f) it5.next();
            if (!fVar7.f22764c.isEmpty() && !fVar7.f22763b.isEmpty()) {
                arrayList2.add(fVar7.f22762a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static E7.g r(E7.g gVar, E7.h key) {
        kotlin.jvm.internal.h.e(key, "key");
        if (kotlin.jvm.internal.h.a(gVar.getKey(), key)) {
            return gVar;
        }
        return null;
    }

    public static F s(String str) {
        if (str.equals("http/1.0")) {
            return F.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return F.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return F.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return F.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return F.SPDY_3;
        }
        if (str.equals("quic")) {
            return F.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static final String t(C2203a c2203a) {
        Object h7;
        kotlin.jvm.internal.h.e(c2203a, "<this>");
        String d02 = o.f17761a.d0();
        kotlin.jvm.internal.d a5 = kotlin.jvm.internal.p.a(String.class);
        boolean equals = a5.equals(kotlin.jvm.internal.p.a(Float.TYPE));
        SharedPreferences sharedPreferences = c2203a.f24771a;
        Object obj = "";
        if (equals) {
            obj = (String) Float.valueOf(sharedPreferences.getFloat(d02, ((Float) "").floatValue()));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Integer.TYPE))) {
            obj = (String) Integer.valueOf(sharedPreferences.getInt(d02, ((Integer) "").intValue()));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Long.TYPE))) {
            obj = (String) Long.valueOf(sharedPreferences.getLong(d02, ((Long) "").longValue()));
        } else if (a5.equals(kotlin.jvm.internal.p.a(String.class))) {
            obj = sharedPreferences.getString(d02, "");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else if (a5.equals(kotlin.jvm.internal.p.a(Boolean.TYPE))) {
            obj = (String) Boolean.valueOf(sharedPreferences.getBoolean(d02, ((Boolean) "").booleanValue()));
        } else {
            String string = sharedPreferences.getString(d02, "");
            if (string != null && string.length() != 0) {
                try {
                    h7 = c2203a.f24772b.a(String.class).a(string);
                } catch (Throwable th) {
                    h7 = AbstractC0485a.h(th);
                }
                if (h7 instanceof A7.i) {
                    h7 = null;
                }
                if (h7 != null) {
                    obj = h7;
                }
            }
        }
        String str = (String) obj;
        if (!W7.d.U(str)) {
            return AbstractC0953k1.n(o.f17761a.M(), str);
        }
        AtomicReference atomicReference = B2.h.f628a;
        return D1.o();
    }

    public static ColorStateList u(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && s8.l.g(drawable)) {
            colorStateList = s8.l.c(drawable).getColorStateList();
            return colorStateList;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        if ((r7 instanceof A7.i) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String v(y2.C2203a r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.h.e(r7, r0)
            g6.o r0 = g6.o.f17761a
            java.lang.String r0 = r0.T()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            kotlin.jvm.internal.d r2 = kotlin.jvm.internal.p.a(r1)
            java.lang.Class r3 = java.lang.Float.TYPE
            kotlin.jvm.internal.d r3 = kotlin.jvm.internal.p.a(r3)
            boolean r3 = r2.equals(r3)
            android.content.SharedPreferences r4 = r7.f24771a
            java.lang.String r5 = ""
            if (r3 == 0) goto L2e
            r7 = 0
            float r7 = r4.getFloat(r0, r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto Lb3
        L2e:
            java.lang.Class r3 = java.lang.Integer.TYPE
            kotlin.jvm.internal.d r3 = kotlin.jvm.internal.p.a(r3)
            boolean r3 = r2.equals(r3)
            r6 = 0
            if (r3 == 0) goto L47
            int r7 = r4.getInt(r0, r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto Lb3
        L47:
            java.lang.Class r3 = java.lang.Long.TYPE
            kotlin.jvm.internal.d r3 = kotlin.jvm.internal.p.a(r3)
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L60
            r1 = 0
            long r0 = r4.getLong(r0, r1)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.String r7 = (java.lang.String) r7
            goto Lb3
        L60:
            kotlin.jvm.internal.d r3 = kotlin.jvm.internal.p.a(r1)
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L79
            java.lang.String r7 = r4.getString(r0, r5)
            if (r7 == 0) goto L71
            goto Lb3
        L71:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            r7.<init>(r0)
            throw r7
        L79:
            java.lang.Class r3 = java.lang.Boolean.TYPE
            kotlin.jvm.internal.d r3 = kotlin.jvm.internal.p.a(r3)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L90
            boolean r7 = r4.getBoolean(r0, r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto Lb3
        L90:
            java.lang.String r0 = r4.getString(r0, r5)
            r2 = 0
            if (r0 == 0) goto Lb2
            int r3 = r0.length()
            if (r3 != 0) goto L9e
            goto Lb2
        L9e:
            o7.y r7 = r7.f24772b     // Catch: java.lang.Throwable -> La9
            o7.k r7 = r7.a(r1)     // Catch: java.lang.Throwable -> La9
            java.lang.Object r7 = r7.a(r0)     // Catch: java.lang.Throwable -> La9
            goto Lae
        La9:
            r7 = move-exception
            A7.i r7 = a.AbstractC0485a.h(r7)
        Lae:
            boolean r0 = r7 instanceof A7.i
            if (r0 == 0) goto Lb3
        Lb2:
            r7 = r2
        Lb3:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto Lb8
            goto Lb9
        Lb8:
            r5 = r7
        Lb9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.h.v(y2.a):java.lang.String");
    }

    public static String w(int i9) {
        if (i9 != 0) {
            if (i9 != 2100) {
                if (i9 != 2103) {
                    if (i9 != 7) {
                        if (i9 != 8) {
                            if (i9 != 2200) {
                                if (i9 != 2201) {
                                    switch (i9) {
                                        case 13:
                                            return "An unknown, unexpected error has occurred.";
                                        case 14:
                                            return "A blocking call was interrupted while waiting and did not run to completion.";
                                        case 15:
                                            return "An operation has timed out.";
                                        default:
                                            switch (i9) {
                                                case 2000:
                                                    return "Authentication failure.";
                                                case 2001:
                                                    return "An invalid request was made.";
                                                case 2002:
                                                    return "An in-progress request has been canceled, most likely because another action has preempted it.";
                                                case 2003:
                                                    return "The request was disallowed and could not be completed.";
                                                case 2004:
                                                    return "A requested application could not be found.";
                                                case 2005:
                                                    return "A requested application is not currently running.";
                                                case 2006:
                                                    return "A message could not be sent because it is too large.";
                                                case 2007:
                                                    return "A message could not be sent because there is not enough room in the send buffer at this time.";
                                                default:
                                                    if (i9 >= -999 && i9 <= 999) {
                                                        if (i9 != 0) {
                                                            if (i9 != 7) {
                                                                if (i9 != 14) {
                                                                    if (i9 != 15) {
                                                                        return v.b(i9);
                                                                    }
                                                                    return "TIMEOUT";
                                                                }
                                                                return "INTERRUPTED";
                                                            }
                                                            return "NETWORK_ERROR";
                                                        }
                                                        return "SUCCESS";
                                                    }
                                                    if (i9 >= 2000 && i9 <= 2049) {
                                                        if (i9 != 2015) {
                                                            switch (i9) {
                                                                case 2000:
                                                                    return "AUTHENTICATION_FAILED";
                                                                case 2001:
                                                                    return "INVALID_REQUEST";
                                                                case 2002:
                                                                    return "CANCELED";
                                                                case 2003:
                                                                    return "NOT_ALLOWED";
                                                                case 2004:
                                                                    return "APPLICATION_NOT_FOUND";
                                                                case 2005:
                                                                    return "APPLICATION_NOT_RUNNING";
                                                                case 2006:
                                                                    return "MESSAGE_TOO_LARGE";
                                                                case 2007:
                                                                    return "MESSAGE_SEND_BUFFER_TOO_FULL";
                                                                default:
                                                                    Locale locale = Locale.ROOT;
                                                                    return AbstractC0953k1.j(i9, "Common cast status code ");
                                                            }
                                                        }
                                                        return "TCP_PROBER_FAIL_TO_VERIFY_DEVICE";
                                                    }
                                                    if (i9 >= 2050 && i9 <= 2059) {
                                                        Locale locale2 = Locale.ROOT;
                                                        return AbstractC0953k1.j(i9, "Cast controller status code ");
                                                    }
                                                    if (i9 >= 2100 && i9 <= 2109) {
                                                        Locale locale3 = Locale.ROOT;
                                                        return AbstractC0953k1.j(i9, "Media control channel status code ");
                                                    }
                                                    if (i9 >= 2150 && i9 <= 2169) {
                                                        Locale locale4 = Locale.ROOT;
                                                        return AbstractC0953k1.j(i9, "Cast session status code ");
                                                    }
                                                    if (i9 >= 2200 && i9 <= 2219) {
                                                        Locale locale5 = Locale.ROOT;
                                                        return AbstractC0953k1.j(i9, "Cast remote display status code ");
                                                    }
                                                    if (i9 >= 2250 && i9 <= 2299) {
                                                        Locale locale6 = Locale.ROOT;
                                                        return AbstractC0953k1.j(i9, "Cast socket status code ");
                                                    }
                                                    if (i9 >= 2300 && i9 <= 2309) {
                                                        Locale locale7 = Locale.ROOT;
                                                        return AbstractC0953k1.j(i9, "Cast service status code ");
                                                    }
                                                    if (i9 >= 2310 && i9 <= 2319) {
                                                        Locale locale8 = Locale.ROOT;
                                                        return AbstractC0953k1.j(i9, "Endpoint switch status code ");
                                                    }
                                                    if (i9 >= 2350 && i9 <= 2359) {
                                                        Locale locale9 = Locale.ROOT;
                                                        return AbstractC0953k1.j(i9, "Cast multizone device status code ");
                                                    }
                                                    if (i9 >= 2400 && i9 <= 2419) {
                                                        Locale locale10 = Locale.ROOT;
                                                        return AbstractC0953k1.j(i9, "Cast relay casting status code ");
                                                    }
                                                    if (i9 >= 2450 && i9 <= 2469) {
                                                        Locale locale11 = Locale.ROOT;
                                                        return AbstractC0953k1.j(i9, "Cast nearby casting status code ");
                                                    }
                                                    if (i9 >= 2420 && i9 <= 2439) {
                                                        Locale locale12 = Locale.ROOT;
                                                        return AbstractC0953k1.j(i9, "Remote connection status code ");
                                                    }
                                                    if (i9 >= 2470 && i9 <= 2479) {
                                                        Locale locale13 = Locale.ROOT;
                                                        return AbstractC0953k1.j(i9, "Cast application status code ");
                                                    }
                                                    if (i9 >= 2490 && i9 <= 2499) {
                                                        Locale locale14 = Locale.ROOT;
                                                        return AbstractC0953k1.j(i9, "Cast media loading status code ");
                                                    }
                                                    Locale locale15 = Locale.ROOT;
                                                    return AbstractC0953k1.j(i9, "Unknown cast status code ");
                                            }
                                    }
                                }
                                return "The Cast Remote Display service was disconnected.";
                            }
                            return "The Cast Remote Display service could not be created.";
                        }
                        return "An internal error has occurred.";
                    }
                    return "Network I/O error.";
                }
                return "The request's progress is no longer being tracked because another request of the same type has been made before the first request completed.";
            }
            return "The in-progress request failed.";
        }
        return "Success.";
    }

    public static File x(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i9 = 0; i9 < 100; i9++) {
            File file = new File(cacheDir, str + i9);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static N.c y(AppCompatTextView appCompatTextView) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            return new N.c(F.a.l(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z9 = true;
            if (i9 >= 28 && (appCompatTextView.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(F.a.c(L.d.c(appCompatTextView.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                if (appCompatTextView.getLayoutDirection() != 1) {
                    z9 = false;
                }
                switch (appCompatTextView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z9) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            }
        }
        return new N.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        if ((r7 instanceof A7.i) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.anilab.data.model.response.LoginResponse z(y2.C2203a r7) {
        /*
            g6.o r0 = g6.o.f17761a
            java.lang.String r0 = r0.o0()
            java.lang.Class<com.anilab.data.model.response.LoginResponse> r1 = com.anilab.data.model.response.LoginResponse.class
            kotlin.jvm.internal.d r2 = kotlin.jvm.internal.p.a(r1)
            java.lang.Class r3 = java.lang.Float.TYPE
            kotlin.jvm.internal.d r3 = kotlin.jvm.internal.p.a(r3)
            boolean r3 = r2.equals(r3)
            android.content.SharedPreferences r4 = r7.f24771a
            if (r3 == 0) goto L27
            r7 = 0
            float r7 = r4.getFloat(r0, r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            com.anilab.data.model.response.LoginResponse r7 = (com.anilab.data.model.response.LoginResponse) r7
            goto Lb2
        L27:
            java.lang.Class r3 = java.lang.Integer.TYPE
            kotlin.jvm.internal.d r3 = kotlin.jvm.internal.p.a(r3)
            boolean r3 = r2.equals(r3)
            r5 = 0
            if (r3 == 0) goto L40
            int r7 = r4.getInt(r0, r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.anilab.data.model.response.LoginResponse r7 = (com.anilab.data.model.response.LoginResponse) r7
            goto Lb2
        L40:
            java.lang.Class r3 = java.lang.Long.TYPE
            kotlin.jvm.internal.d r3 = kotlin.jvm.internal.p.a(r3)
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L59
            r1 = 0
            long r0 = r4.getLong(r0, r1)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            com.anilab.data.model.response.LoginResponse r7 = (com.anilab.data.model.response.LoginResponse) r7
            goto Lb2
        L59:
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            kotlin.jvm.internal.d r3 = kotlin.jvm.internal.p.a(r3)
            boolean r3 = r2.equals(r3)
            java.lang.String r6 = ""
            if (r3 == 0) goto L78
            java.lang.String r7 = r4.getString(r0, r6)
            if (r7 == 0) goto L70
            com.anilab.data.model.response.LoginResponse r7 = (com.anilab.data.model.response.LoginResponse) r7
            goto Lb2
        L70:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.anilab.data.model.response.LoginResponse"
            r7.<init>(r0)
            throw r7
        L78:
            java.lang.Class r3 = java.lang.Boolean.TYPE
            kotlin.jvm.internal.d r3 = kotlin.jvm.internal.p.a(r3)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8f
            boolean r7 = r4.getBoolean(r0, r5)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            com.anilab.data.model.response.LoginResponse r7 = (com.anilab.data.model.response.LoginResponse) r7
            goto Lb2
        L8f:
            java.lang.String r0 = r4.getString(r0, r6)
            r2 = 0
            if (r0 == 0) goto Lb1
            int r3 = r0.length()
            if (r3 != 0) goto L9d
            goto Lb1
        L9d:
            o7.y r7 = r7.f24772b     // Catch: java.lang.Throwable -> La8
            o7.k r7 = r7.a(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r7 = r7.a(r0)     // Catch: java.lang.Throwable -> La8
            goto Lad
        La8:
            r7 = move-exception
            A7.i r7 = a.AbstractC0485a.h(r7)
        Lad:
            boolean r0 = r7 instanceof A7.i
            if (r0 == 0) goto Lb2
        Lb1:
            r7 = r2
        Lb2:
            com.anilab.data.model.response.LoginResponse r7 = (com.anilab.data.model.response.LoginResponse) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.h.z(y2.a):com.anilab.data.model.response.LoginResponse");
    }
}
