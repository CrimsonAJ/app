package P5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class L implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public static final L f5915a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ L[] f5916b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, P5.L] */
    static {
        ?? r1 = new Enum("INSTANCE", 0);
        f5915a = r1;
        f5916b = new L[]{r1};
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f5916b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        O4.h.j("no calls to next() since the last call to remove()", false);
    }
}
