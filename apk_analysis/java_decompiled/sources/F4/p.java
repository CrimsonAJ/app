package F4;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class p implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f2437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2438c;

    public /* synthetic */ p(Intent intent, Object obj, int i9) {
        this.f2436a = i9;
        this.f2437b = intent;
        this.f2438c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [D4.h, java.lang.Object] */
    public final void a() {
        switch (this.f2436a) {
            case 0:
                Intent intent = this.f2437b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f2438c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f2437b;
                if (intent2 != null) {
                    this.f2438c.a(intent2, 2);
                    return;
                }
                return;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e8) {
                String str = "Failed to start resolution intent.";
                if (true == Build.FINGERPRINT.contains("generic")) {
                    str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                }
                Log.e("DialogRedirect", str, e8);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
