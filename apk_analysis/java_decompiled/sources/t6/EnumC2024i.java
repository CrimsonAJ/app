package t6;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2024i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2024i f23310a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2024i[] f23311b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, t6.i] */
    static {
        ?? r1 = new Enum("INSTANCE", 0);
        f23310a = r1;
        f23311b = new EnumC2024i[]{r1};
    }

    public static EnumC2024i valueOf(String str) {
        return (EnumC2024i) Enum.valueOf(EnumC2024i.class, str);
    }

    public static EnumC2024i[] values() {
        return (EnumC2024i[]) f23311b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
