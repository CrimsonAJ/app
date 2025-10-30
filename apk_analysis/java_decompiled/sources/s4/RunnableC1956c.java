package s4;

import A3.E;
import D4.m;
import F4.y;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: s4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1956c implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final E f22716c = new E("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String f22717a;

    /* renamed from: b, reason: collision with root package name */
    public final m f22718b;

    public RunnableC1956c(String str) {
        y.e(str);
        this.f22717a = str;
        this.f22718b = new m(null, 0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        E e8 = f22716c;
        Status status = Status.f14657g;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f22717a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f14655e;
            } else {
                e8.getClass();
                Log.e((String) e8.f47c, ((String) e8.f48d).concat("Unable to revoke access!"));
            }
            e8.f("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e9) {
            String concat = "IOException when revoking access: ".concat(String.valueOf(e9.toString()));
            e8.getClass();
            Log.e((String) e8.f47c, ((String) e8.f48d).concat(concat));
        } catch (Exception e10) {
            String concat2 = "Exception when revoking access: ".concat(String.valueOf(e10.toString()));
            e8.getClass();
            Log.e((String) e8.f47c, ((String) e8.f48d).concat(concat2));
        }
        this.f22718b.J(status);
    }
}
