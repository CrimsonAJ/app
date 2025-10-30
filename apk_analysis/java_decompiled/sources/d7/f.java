package d7;

import B6.C0033l0;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import b3.EnumC0602c;
import f5.AbstractC1176h;
import f5.InterfaceC1169a;
import g3.InterfaceC1251b;
import java.util.HashMap;
import v6.C2110a;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC1169a, InterfaceC1251b, f3.f, S6.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f16904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16906c;

    public /* synthetic */ f(Object obj, long j, Object obj2) {
        this.f16905b = obj;
        this.f16904a = j;
        this.f16906c = obj2;
    }

    @Override // f3.f
    public Object apply(Object obj) {
        boolean z9;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i9 = ((EnumC0602c) this.f16906c).f10522a;
        String num = Integer.toString(i9);
        String str = (String) this.f16905b;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num});
        try {
            if (rawQuery.getCount() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            rawQuery.close();
            long j = this.f16904a;
            if (!z9) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i9));
                contentValues.put("events_dropped_count", Long.valueOf(j));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i9)});
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // g3.InterfaceC1251b
    public Object f() {
        e3.j jVar = (e3.j) this.f16905b;
        long l9 = jVar.f17177g.l() + this.f16904a;
        f3.h hVar = (f3.h) jVar.f17173c;
        Y2.j jVar2 = (Y2.j) this.f16906c;
        hVar.getClass();
        hVar.g(new f3.e(l9, jVar2));
        return null;
    }

    @Override // S6.a
    public void h(S6.b bVar) {
        ((C2110a) bVar.get()).d((String) this.f16905b, this.f16904a, (C0033l0) this.f16906c);
    }

    @Override // f5.InterfaceC1169a
    public Object i(AbstractC1176h abstractC1176h) {
        return ((i) this.f16905b).b(abstractC1176h, this.f16904a, (HashMap) this.f16906c);
    }

    public /* synthetic */ f(Object obj, Object obj2, long j) {
        this.f16905b = obj;
        this.f16906c = obj2;
        this.f16904a = j;
    }
}
