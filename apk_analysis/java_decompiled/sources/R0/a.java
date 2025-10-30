package R0;

import O7.r;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q0.f f6464a;

    public /* synthetic */ a(Q0.f fVar) {
        this.f6464a = fVar;
    }

    @Override // O7.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        kotlin.jvm.internal.h.b(sQLiteQuery);
        this.f6464a.F(new i(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
