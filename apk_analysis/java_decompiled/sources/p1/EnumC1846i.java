package p1;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1846i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1846i f22134a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1846i[] f22135b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, p1.i] */
    static {
        ?? r1 = new Enum("INSTANCE", 0);
        f22134a = r1;
        f22135b = new EnumC1846i[]{r1};
    }

    public static EnumC1846i valueOf(String str) {
        return (EnumC1846i) Enum.valueOf(EnumC1846i.class, str);
    }

    public static EnumC1846i[] values() {
        return (EnumC1846i[]) f22135b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
