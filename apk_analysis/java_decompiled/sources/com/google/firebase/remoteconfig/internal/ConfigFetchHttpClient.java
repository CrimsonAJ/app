package com.google.firebase.remoteconfig.internal;

import F.a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l6.h;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f16539h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Context f16540a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16541b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16542c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16543d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16544e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16545f;

    /* renamed from: g, reason: collision with root package name */
    public final long f16546g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j, long j4) {
        String str3;
        this.f16540a = context;
        this.f16541b = str;
        this.f16542c = str2;
        Matcher matcher = f16539h.matcher(str);
        if (matcher.matches()) {
            str3 = matcher.group(1);
        } else {
            str3 = null;
        }
        this.f16543d = str3;
        this.f16544e = "firebase";
        this.f16545f = j;
        this.f16546g = j4;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb.append((char) read);
            } else {
                return new JSONObject(sb.toString());
            }
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l9, Map map2) {
        long j;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f16541b);
            Context context = this.f16540a;
            Locale locale = context.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i9 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i9));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i9 >= 28) {
                        j = a.d(packageInfo);
                    } else {
                        j = packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", context.getPackageName());
            hashMap.put("sdkVersion", "22.1.2");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (!map2.isEmpty()) {
                hashMap.put("customSignals", new JSONObject(map2));
                Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
            }
            if (l9 != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                hashMap.put("firstOpenTime", simpleDateFormat.format(l9));
            }
            return new JSONObject(hashMap);
        }
        throw new h("Fetch failed: Firebase installation id is null.");
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f16543d + "/namespaces/" + this.f16544e + ":fetch").openConnection();
        } catch (IOException e8) {
            throw new h(e8.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009f A[LOOP:0: B:8:0x0099->B:10:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00da A[Catch: all -> 0x01af, JSONException -> 0x01b1, IOException | JSONException -> 0x01b3, TRY_LEAVE, TryCatch #7 {all -> 0x01af, blocks: (B:14:0x00be, B:16:0x00da, B:85:0x01b5, B:86:0x01be, B:95:0x01bf, B:96:0x01c6), top: B:13:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b5 A[Catch: all -> 0x01af, JSONException -> 0x01b1, IOException | JSONException -> 0x01b3, TRY_ENTER, TryCatch #7 {all -> 0x01af, blocks: (B:14:0x00be, B:16:0x00da, B:85:0x01b5, B:86:0x01be, B:95:0x01bf, B:96:0x01c6), top: B:13:0x00be }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d7.h fetch(java.net.HttpURLConnection r13, java.lang.String r14, java.lang.String r15, java.util.Map<java.lang.String, java.lang.String> r16, java.lang.String r17, java.util.Map<java.lang.String, java.lang.String> r18, java.lang.Long r19, java.util.Date r20, java.util.Map<java.lang.String, java.lang.String> r21) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date, java.util.Map):d7.h");
    }
}
