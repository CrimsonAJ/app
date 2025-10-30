package d7;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f16955c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f16956a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16957b;

    public n(Context context, String str) {
        this.f16956a = context;
        this.f16957b = str;
    }

    public final synchronized void a() {
        this.f16956a.deleteFile(this.f16957b);
    }
}
