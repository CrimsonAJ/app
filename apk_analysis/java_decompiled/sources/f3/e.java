package f3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import i3.AbstractC1379a;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f17340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y2.j f17341b;

    public /* synthetic */ e(long j, Y2.j jVar) {
        this.f17340a = j;
        this.f17341b = jVar;
    }

    @Override // f3.f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f17340a));
        Y2.j jVar = this.f17341b;
        String str = jVar.f8629a;
        V2.d dVar = jVar.f8631c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC1379a.a(dVar))}) < 1) {
            contentValues.put("backend_name", jVar.f8629a);
            contentValues.put("priority", Integer.valueOf(AbstractC1379a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
