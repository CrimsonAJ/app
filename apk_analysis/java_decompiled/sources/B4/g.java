package B4;

import F4.K;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f696a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f697b;

    /* JADX WARN: Type inference failed for: r0v2, types: [B4.g, java.lang.Object] */
    static {
        int i9 = h.f702e;
        f696a = 12451000;
        f697b = new Object();
    }

    public Intent a(int i9, Context context, String str) {
        if (i9 != 1 && i9 != 2) {
            if (i9 != 3) {
                return null;
            }
            int i10 = K.f2362a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && K4.b.f(context)) {
            int i11 = K.f2362a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f696a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(M4.c.a(context).c(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        int i12 = K.f2362a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|4|(4:8|2c|15|(2:17|(2:19|20))(2:22|23))|39|(4:41|(3:43|(1:49)(1:47)|48)|50|(11:52|(1:54)(1:106)|55|(2:102|103)(1:57)|58|59|60|(1:62)(2:(2:72|(1:74))|(4:80|(1:82)(1:99)|(1:84)|(1:86)(4:87|(2:93|94)|89|(1:91)(1:92)))(1:79))|63|(1:(1:66)(1:67))|(1:69)(1:70)))|107|(0)(0)|55|(0)(0)|58|59|60|(0)(0)|63|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b8, code lost:
    
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B4.g.b(android.content.Context, int):int");
    }
}
