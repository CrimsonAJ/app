package L7;

import W7.d;
import com.google.android.gms.internal.measurement.Y1;
import java.io.File;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public abstract class a extends Y1 {
    public static File K(File file) {
        int i9;
        boolean z9;
        int R2;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        h.d(path, "getPath(...)");
        char c3 = File.separatorChar;
        boolean z10 = false;
        int R8 = d.R(path, c3, 0, 4);
        if (R8 == 0) {
            if (path.length() > 1 && path.charAt(1) == c3 && (R2 = d.R(path, c3, 2, 4)) >= 0) {
                int R9 = d.R(path, c3, R2 + 1, 4);
                if (R9 >= 0) {
                    i9 = R9 + 1;
                } else {
                    i9 = path.length();
                }
            } else {
                i9 = 1;
            }
        } else if (R8 > 0 && path.charAt(R8 - 1) == ':') {
            i9 = R8 + 1;
        } else if (R8 == -1 && d.O(path, ':')) {
            i9 = path.length();
        } else {
            i9 = 0;
        }
        if (i9 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return file2;
        }
        String file3 = file.toString();
        h.d(file3, "toString(...)");
        if (file3.length() == 0) {
            z10 = true;
        }
        if (!z10 && !d.O(file3, c3)) {
            return new File(file3 + c3 + file2);
        }
        return new File(file3 + file2);
    }
}
