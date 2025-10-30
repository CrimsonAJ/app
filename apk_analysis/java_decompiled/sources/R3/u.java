package R3;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import k4.C1499E;
import u0.z;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6656a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6657b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6658c;

    public /* synthetic */ u(String str, int i9, String str2) {
        this.f6656a = i9;
        this.f6657b = str;
        this.f6658c = str2;
    }

    public String toString() {
        switch (this.f6656a) {
            case 0:
                return this.f6657b + ", " + this.f6658c;
            default:
                return super.toString();
        }
    }

    public u(C1499E c1499e) {
        this.f6656a = 2;
        int d9 = y6.g.d((Context) c1499e.f19985b, "com.google.firebase.crashlytics.unity_version", "string");
        Context context = (Context) c1499e.f19985b;
        if (d9 != 0) {
            this.f6657b = "Unity";
            String string = context.getResources().getString(d9);
            this.f6658c = string;
            String e8 = z.e("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", e8, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.f6657b = "Flutter";
                this.f6658c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f6657b = null;
                this.f6658c = null;
            }
        }
        this.f6657b = null;
        this.f6658c = null;
    }
}
