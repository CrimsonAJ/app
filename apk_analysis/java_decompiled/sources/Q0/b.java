package Q0;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6038a;

    /* renamed from: b, reason: collision with root package name */
    public int f6039b;

    public /* synthetic */ b() {
        this.f6038a = 1;
    }

    public static void c(String str) {
        int i9;
        boolean z9;
        if (!str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                if (!z10) {
                    i9 = i10;
                } else {
                    i9 = length;
                }
                if (h.f(str.charAt(i9), 32) <= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z10) {
                    if (!z9) {
                        z10 = true;
                    } else {
                        i10++;
                    }
                } else if (!z9) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e8) {
                    Log.w("SupportSQLite", "delete failed: ", e8);
                }
            }
        }
    }

    public static String d(int i9) {
        return "" + ((char) ((i9 >> 24) & 255)) + ((char) ((i9 >> 16) & 255)) + ((char) ((i9 >> 8) & 255)) + ((char) (i9 & 255));
    }

    public static int q(int i9) {
        return (i9 >> 24) & 255;
    }

    public void b(int i9) {
        this.f6039b = i9 | this.f6039b;
    }

    public boolean e(int i9) {
        if ((this.f6039b & i9) == i9) {
            return true;
        }
        return false;
    }

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract void l(R0.c cVar);

    public abstract void n(R0.c cVar, int i9, int i10);

    public abstract void o(R0.c cVar);

    public abstract void p(R0.c cVar, int i9, int i10);

    public String toString() {
        switch (this.f6038a) {
            case 3:
                return d(this.f6039b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(int i9, int i10) {
        this.f6038a = i10;
        this.f6039b = i9;
    }

    public void k(R0.c cVar) {
    }
}
