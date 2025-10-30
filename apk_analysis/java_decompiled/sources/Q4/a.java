package Q4;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f6437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6438c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6439d;

    public /* synthetic */ a(SharedPreferences sharedPreferences, String str, Object obj, int i9) {
        this.f6436a = i9;
        this.f6437b = sharedPreferences;
        this.f6438c = str;
        this.f6439d = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f6436a) {
            case 0:
                return Boolean.valueOf(this.f6437b.getBoolean(this.f6438c, ((Boolean) this.f6439d).booleanValue()));
            case 1:
                return Integer.valueOf(this.f6437b.getInt(this.f6438c, ((Integer) this.f6439d).intValue()));
            case 2:
                return Long.valueOf(this.f6437b.getLong(this.f6438c, ((Long) this.f6439d).longValue()));
            default:
                return this.f6437b.getString(this.f6438c, (String) this.f6439d);
        }
    }
}
