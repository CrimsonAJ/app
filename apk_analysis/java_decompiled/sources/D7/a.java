package D7;

import java.util.Comparator;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1918b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f1919c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1920a;

    public /* synthetic */ a(int i9) {
        this.f1920a = i9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1920a) {
            case 0:
                Comparable a5 = (Comparable) obj;
                Comparable b9 = (Comparable) obj2;
                h.e(a5, "a");
                h.e(b9, "b");
                return a5.compareTo(b9);
            default:
                Comparable a9 = (Comparable) obj;
                Comparable b10 = (Comparable) obj2;
                h.e(a9, "a");
                h.e(b10, "b");
                return b10.compareTo(a9);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f1920a) {
            case 0:
                return f1919c;
            default:
                return f1918b;
        }
    }
}
