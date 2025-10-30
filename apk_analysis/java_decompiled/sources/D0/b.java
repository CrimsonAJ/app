package D0;

import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import c7.C0787g;
import c7.C0789i;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1737a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1738b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1739c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1740d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1741e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1742f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1743g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f1744h;

    public b(HttpURLConnection httpURLConnection, d7.i iVar, d7.d dVar, LinkedHashSet linkedHashSet, I1.c cVar, ScheduledExecutorService scheduledExecutorService) {
        this.f1739c = httpURLConnection;
        this.f1740d = iVar;
        this.f1741e = dVar;
        this.f1738b = linkedHashSet;
        this.f1742f = cVar;
        this.f1743g = scheduledExecutorService;
        this.f1744h = new Random();
        this.f1737a = false;
    }

    public void a(long j, int i9) {
        if (i9 == 0) {
            e(new C0789i("Unable to fetch the latest version of the template."));
            return;
        }
        ((ScheduledExecutorService) this.f1743g).schedule(new d7.b(this, i9, j), ((Random) this.f1744h).nextInt(4), TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [c7.g, l6.h] */
    public void b(InputStream inputStream) {
        JSONObject jSONObject;
        boolean isEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            str = AbstractC0953k1.n(str, readLine);
            if (readLine.contains("}")) {
                int indexOf = str.indexOf(123);
                int lastIndexOf = str.lastIndexOf(125);
                if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
                    str = "";
                } else {
                    str = str.substring(indexOf, lastIndexOf + 1);
                }
                if (!str.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException e8) {
                        e(new l6.h("Unable to parse config update message.", e8.getCause()));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e8);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        ((I1.c) this.f1742f).a(new C0789i("The server is temporarily unavailable. Try again in a few minutes."));
                        break;
                    }
                    synchronized (this) {
                        isEmpty = ((LinkedHashSet) this.f1738b).isEmpty();
                    }
                    if (isEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j = ((d7.i) this.f1740d).f16922g.f16951a.getLong("last_template_version", 0L);
                        long j4 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j4 > j) {
                            a(j4, 3);
                        }
                    }
                    str = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    public void c() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f1739c;
        if (httpURLConnection != null) {
            InputStream inputStream = null;
            try {
                try {
                    try {
                        inputStream = httpURLConnection.getInputStream();
                        b(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (IOException e8) {
                        Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e8);
                    }
                } catch (IOException e9) {
                    if (!this.f1737a) {
                        Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e9);
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e10) {
                        Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e10);
                    }
                }
                throw th;
            }
        }
    }

    public FileInputStream d(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e8) {
            String message = e8.getMessage();
            if (message != null && message.contains("compressed")) {
                ((c) this.f1739c).q();
                return null;
            }
            return null;
        }
    }

    public synchronized void e(C0787g c0787g) {
        Iterator it = ((LinkedHashSet) this.f1738b).iterator();
        while (it.hasNext()) {
            ((I1.c) it.next()).a(c0787g);
        }
    }

    public void f(int i9, Serializable serializable) {
        ((Executor) this.f1738b).execute(new a(this, i9, serializable, 0));
    }

    public b(AssetManager assetManager, Executor executor, c cVar, String str, File file) {
        this.f1737a = false;
        this.f1738b = executor;
        this.f1739c = cVar;
        this.f1743g = str;
        this.f1742f = file;
        int i9 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i9 >= 24 && i9 <= 34) {
            switch (i9) {
                case 24:
                case 25:
                    bArr = d.f1752h;
                    break;
                case 26:
                    bArr = d.f1751g;
                    break;
                case 27:
                    bArr = d.f1750f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = d.f1749e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = d.f1748d;
                    break;
            }
        }
        this.f1740d = bArr;
    }
}
