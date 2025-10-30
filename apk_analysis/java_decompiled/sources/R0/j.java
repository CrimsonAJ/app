package R0;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class j extends i implements Q0.e {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f6494b;

    public j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f6494b = sQLiteStatement;
    }

    public final int a() {
        return this.f6494b.executeUpdateDelete();
    }
}
