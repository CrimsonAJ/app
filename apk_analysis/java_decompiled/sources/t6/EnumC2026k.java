package t6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t6.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2026k implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2026k f23318a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f23319b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC2026k[] f23320c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, t6.k] */
    static {
        ?? r1 = new Enum("INSTANCE", 0);
        f23318a = r1;
        f23320c = new EnumC2026k[]{r1};
        f23319b = new Handler(Looper.getMainLooper());
    }

    public static EnumC2026k valueOf(String str) {
        return (EnumC2026k) Enum.valueOf(EnumC2026k.class, str);
    }

    public static EnumC2026k[] values() {
        return (EnumC2026k[]) f23320c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f23319b.post(runnable);
    }
}
