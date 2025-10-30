package androidx.core.content;

import E.e;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import u0.z;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f9571d = {"_display_name", "_size"};

    /* renamed from: e, reason: collision with root package name */
    public static final File f9572e = new File("/");

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f9573f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Object f9574a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public String f9575b;

    /* renamed from: c, reason: collision with root package name */
    public e f9576c;

    public static String a(String str) {
        if (str.length() > 0 && str.charAt(str.length() - 1) == '/') {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static e c(Context context, String str) {
        e eVar;
        HashMap hashMap = f9573f;
        synchronized (hashMap) {
            try {
                eVar = (e) hashMap.get(str);
                if (eVar == null) {
                    try {
                        try {
                            eVar = d(context, str);
                            hashMap.put(str, eVar);
                        } catch (IOException e8) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e8);
                        }
                    } catch (XmlPullParserException e9) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static e d(Context context, String str) {
        e eVar = new e(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData == null) {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
            while (true) {
                int next = loadXmlMetaData.next();
                if (next != 1) {
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            file = f9572e;
                        } else if ("files-path".equals(name)) {
                            file = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            file = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            File[] externalFilesDirs = context.getExternalFilesDirs(null);
                            if (externalFilesDirs.length > 0) {
                                file = externalFilesDirs[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            File[] externalCacheDirs = context.getExternalCacheDirs();
                            if (externalCacheDirs.length > 0) {
                                file = externalCacheDirs[0];
                            }
                        } else if ("external-media-path".equals(name)) {
                            File[] externalMediaDirs = context.getExternalMediaDirs();
                            if (externalMediaDirs.length > 0) {
                                file = externalMediaDirs[0];
                            }
                        }
                        if (file == null) {
                            continue;
                        } else {
                            String str2 = new String[]{attributeValue2}[0];
                            if (str2 != null) {
                                file = new File(file, str2);
                            }
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    eVar.f1923b.put(attributeValue, file.getCanonicalFile());
                                } catch (IOException e8) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e8);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        }
                    }
                } else {
                    return eVar;
                }
            }
        } else {
            throw new IllegalArgumentException(z.e("Couldn't find meta-data for provider with authority ", str));
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority;
                if (str != null && !str.trim().isEmpty()) {
                    String str2 = providerInfo.authority.split(";")[0];
                    synchronized (this.f9574a) {
                        this.f9575b = str2;
                    }
                    HashMap hashMap = f9573f;
                    synchronized (hashMap) {
                        hashMap.remove(str2);
                    }
                    return;
                }
                throw new SecurityException("Provider must have a non-empty authority");
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    public final e b() {
        e eVar;
        synchronized (this.f9574a) {
            try {
                if (this.f9575b != null) {
                    if (this.f9576c == null) {
                        this.f9576c = c(getContext(), this.f9575b);
                    }
                    eVar = this.f9576c;
                } else {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return b().a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File a5 = b().a(uri);
        int lastIndexOf = a5.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a5.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i9;
        File a5 = b().a(uri);
        if ("r".equals(str)) {
            i9 = 268435456;
        } else if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                i9 = 704643072;
            } else if ("rw".equals(str)) {
                i9 = 939524096;
            } else if ("rwt".equals(str)) {
                i9 = 1006632960;
            } else {
                throw new IllegalArgumentException(z.e("Invalid mode: ", str));
            }
        } else {
            i9 = 738197504;
        }
        return ParcelFileDescriptor.open(a5, i9);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i9;
        String str3;
        File a5 = b().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f9571d;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i10 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i10] = "_display_name";
                i9 = i10 + 1;
                if (queryParameter == null) {
                    str3 = a5.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i10] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i10] = "_size";
                i9 = i10 + 1;
                objArr[i10] = Long.valueOf(a5.length());
            }
            i10 = i9;
        }
        String[] strArr4 = new String[i10];
        System.arraycopy(strArr3, 0, strArr4, 0, i10);
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
