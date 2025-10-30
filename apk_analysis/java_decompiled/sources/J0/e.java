package J0;

import android.database.Cursor;
import kotlin.jvm.internal.h;
import s4.i;
import s8.n;

/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: d, reason: collision with root package name */
    public int[] f3591d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f3592e;

    /* renamed from: f, reason: collision with root package name */
    public double[] f3593f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f3594g;

    /* renamed from: h, reason: collision with root package name */
    public byte[][] f3595h;

    /* renamed from: i, reason: collision with root package name */
    public Cursor f3596i;

    public static void g(Cursor cursor, int i9) {
        if (i9 >= 0 && i9 < cursor.getColumnCount()) {
            return;
        }
        n.y(25, "column index out of range");
        throw null;
    }

    @Override // P0.c
    public final long H(int i9) {
        a();
        Cursor cursor = this.f3596i;
        if (cursor != null) {
            g(cursor, i9);
            return cursor.getLong(i9);
        }
        n.y(21, "no row");
        throw null;
    }

    @Override // P0.c
    public final boolean R(int i9) {
        a();
        Cursor cursor = this.f3596i;
        if (cursor != null) {
            g(cursor, i9);
            return cursor.isNull(i9);
        }
        n.y(21, "no row");
        throw null;
    }

    @Override // P0.c
    public final String T(int i9) {
        a();
        d();
        Cursor cursor = this.f3596i;
        if (cursor != null) {
            g(cursor, i9);
            String columnName = cursor.getColumnName(i9);
            h.d(columnName, "getColumnName(...)");
            return columnName;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // P0.c
    public final boolean W() {
        a();
        d();
        Cursor cursor = this.f3596i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f3600c) {
            a();
            this.f3591d = new int[0];
            this.f3592e = new long[0];
            this.f3593f = new double[0];
            this.f3594g = new String[0];
            this.f3595h = new byte[0];
            reset();
        }
        this.f3600c = true;
    }

    public final void d() {
        if (this.f3596i == null) {
            this.f3596i = this.f3598a.r(new i(this));
        }
    }

    @Override // P0.c
    public final String i(int i9) {
        a();
        Cursor cursor = this.f3596i;
        if (cursor != null) {
            g(cursor, i9);
            String string = cursor.getString(i9);
            h.d(string, "getString(...)");
            return string;
        }
        n.y(21, "no row");
        throw null;
    }

    @Override // P0.c
    public final int j() {
        a();
        d();
        Cursor cursor = this.f3596i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // P0.c
    public final void reset() {
        a();
        Cursor cursor = this.f3596i;
        if (cursor != null) {
            cursor.close();
        }
        this.f3596i = null;
    }
}
