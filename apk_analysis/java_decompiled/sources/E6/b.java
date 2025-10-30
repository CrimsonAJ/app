package E6;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1956a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f1956a) {
            case 0:
                return str.startsWith("event");
            case 1:
                if (str.startsWith("event") && !str.endsWith("_")) {
                    return true;
                }
                return false;
            case 2:
                return str.startsWith("aqs.");
            default:
                return str.startsWith(".ae");
        }
    }
}
