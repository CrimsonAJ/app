package i1;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import e1.q;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1371a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f18441b = q.j("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f18442a;

    public C1371a(Context context) {
        this.f18442a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
