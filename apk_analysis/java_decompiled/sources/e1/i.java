package e1;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final i f17051a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f17052b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, e1.i] */
    static {
        ?? r1 = new Enum("INSTANCE", 0);
        f17051a = r1;
        f17052b = new i[]{r1};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f17052b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        kotlin.jvm.internal.h.e(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
