package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import com.anilab.data.model.response.DownloaderResponse;
import u2.C2067a;
import v2.C2101a;
import v2.C2102b;
import y2.C2203a;

/* loaded from: classes.dex */
public final class J extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ O f1278r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(O o9, E7.d dVar) {
        super(2, dVar);
        this.f1278r = o9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new J(this.f1278r, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object h7;
        AbstractC0485a.A(obj);
        C2203a c2203a = this.f1278r.f1287c;
        String N8 = g6.o.f17761a.N();
        kotlin.jvm.internal.d a5 = kotlin.jvm.internal.p.a(DownloaderResponse.class);
        boolean equals = a5.equals(kotlin.jvm.internal.p.a(Float.TYPE));
        SharedPreferences sharedPreferences = c2203a.f24771a;
        if (equals) {
            obj2 = (DownloaderResponse) new Float(sharedPreferences.getFloat(N8, 0.0f));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Integer.TYPE))) {
            obj2 = (DownloaderResponse) new Integer(sharedPreferences.getInt(N8, 0));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Long.TYPE))) {
            obj2 = (DownloaderResponse) new Long(sharedPreferences.getLong(N8, 0L));
        } else if (a5.equals(kotlin.jvm.internal.p.a(String.class))) {
            Object string = sharedPreferences.getString(N8, "");
            if (string != null) {
                obj2 = (DownloaderResponse) string;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.anilab.data.model.response.DownloaderResponse");
            }
        } else if (a5.equals(kotlin.jvm.internal.p.a(Boolean.TYPE))) {
            obj2 = (DownloaderResponse) Boolean.valueOf(sharedPreferences.getBoolean(N8, false));
        } else {
            String string2 = sharedPreferences.getString(N8, "");
            if (string2 != null && string2.length() != 0) {
                try {
                    h7 = c2203a.f24772b.a(DownloaderResponse.class).a(string2);
                } catch (Throwable th) {
                    h7 = AbstractC0485a.h(th);
                }
                if (!(h7 instanceof A7.i)) {
                    obj2 = h7;
                }
            }
            obj2 = null;
        }
        DownloaderResponse downloaderResponse = (DownloaderResponse) obj2;
        if (downloaderResponse != null) {
            return new C2102b(downloaderResponse);
        }
        return new C2101a(new C2067a((String) null, 3));
    }
}
