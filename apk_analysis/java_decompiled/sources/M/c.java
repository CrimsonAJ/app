package M;

import A3.C0005f;
import B6.u0;
import F0.z0;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import b7.C0701c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import o1.C1671f;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f4649a = new z0(2);

    /* renamed from: b, reason: collision with root package name */
    public static final E6.a f4650b = new E6.a(2);

    public static C0005f a(Context context, List list) {
        u0.d("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < list.size(); i9++) {
                d dVar = (d) list.get(i9);
                ProviderInfo b9 = b(context.getPackageManager(), dVar, context.getResources());
                if (b9 == null) {
                    return new C0005f();
                }
                arrayList.add(c(context, dVar, b9.authority));
            }
            return new C0005f(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [M.b, java.lang.Object] */
    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        u0.d("FontProvider.getProvider");
        try {
            List list = dVar.f4654d;
            String str = dVar.f4651a;
            String str2 = dVar.f4652b;
            if (list == null) {
                list = G.b.k(resources, 0);
            }
            ?? obj = new Object();
            obj.f4646a = str;
            obj.f4647b = str2;
            obj.f4648c = list;
            z0 z0Var = f4649a;
            ProviderInfo providerInfo = (ProviderInfo) z0Var.h(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(str2)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    E6.a aVar = f4650b;
                    Collections.sort(arrayList, aVar);
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i9));
                        Collections.sort(arrayList2, aVar);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                                    break;
                                }
                            }
                            z0Var.l(obj, resolveContentProvider);
                            return resolveContentProvider;
                        }
                    }
                    Trace.endSection();
                    return null;
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        } finally {
            Trace.endSection();
        }
    }

    public static i[] c(Context context, d dVar, String str) {
        a c1671f;
        int i9;
        int i10;
        Uri withAppendedId;
        int i11;
        boolean z9;
        u0.d("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                c1671f = new C0701c(context, build);
            } else {
                c1671f = new C1671f(context, build);
            }
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                u0.d("ContentQueryWrapper.query");
                try {
                    cursor = c1671f.b(build, strArr, new String[]{dVar.f4653c});
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i9 = cursor.getInt(columnIndex);
                            } else {
                                i9 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i10 = cursor.getInt(columnIndex4);
                            } else {
                                i10 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            Uri uri = withAppendedId;
                            if (columnIndex5 != -1) {
                                i11 = cursor.getInt(columnIndex5);
                            } else {
                                i11 = 400;
                            }
                            if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            arrayList2.add(new i(uri, i10, i11, z9, i9));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    c1671f.close();
                    return (i[]) arrayList.toArray(new i[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                c1671f.close();
                throw th;
            }
        } finally {
        }
    }
}
