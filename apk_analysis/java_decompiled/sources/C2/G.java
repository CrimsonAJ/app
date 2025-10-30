package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import com.anilab.data.model.response.AllSettingsResponse;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.CommentConfigResponse;
import com.anilab.data.model.response.ContactUsResponse;
import com.anilab.data.model.response.DownloaderResponse;
import com.anilab.data.model.response.ListPlayerResponse;
import com.anilab.data.model.response.MovieConfigResponse;
import com.anilab.data.model.response.SrcConfigResponse;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import u2.C2067a;
import v2.C2102b;
import y2.C2203a;

/* loaded from: classes.dex */
public final class G extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1273r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ O f1274s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(O o9, E7.d dVar) {
        super(2, dVar);
        this.f1274s = o9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new G(this.f1274s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        ListPlayerResponse listPlayerResponse;
        String str;
        String str2;
        DownloaderResponse downloaderResponse;
        CommentConfigResponse commentConfigResponse;
        MovieConfigResponse movieConfigResponse;
        ContactUsResponse contactUsResponse;
        SrcConfigResponse srcConfigResponse;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1273r;
        O o9 = this.f1274s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            B2.b bVar = o9.f1286b;
            String n7 = AbstractC0953k1.n(O4.h.t(o9.f1287c), g6.o.f17761a.k());
            this.f1273r = 1;
            obj = bVar.D(n7, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        AllSettingsResponse allSettingsResponse = (AllSettingsResponse) ((ApiResponse) obj).f14005c;
        C2203a c2203a = o9.f1287c;
        g6.o oVar = g6.o.f17761a;
        String g02 = oVar.g0();
        if (allSettingsResponse != null) {
            listPlayerResponse = allSettingsResponse.f13985f;
        } else {
            listPlayerResponse = null;
        }
        SharedPreferences.Editor edit = c2203a.f24771a.edit();
        edit.putString(g02, c2203a.f24772b.a(ListPlayerResponse.class).d(listPlayerResponse));
        edit.apply();
        C2203a c2203a2 = o9.f1287c;
        String W6 = oVar.W();
        if (allSettingsResponse != null) {
            str = allSettingsResponse.f13986g;
        } else {
            str = null;
        }
        Integer num = new Integer(oVar.b(str));
        SharedPreferences.Editor edit2 = c2203a2.f24771a.edit();
        edit2.putInt(W6, num.intValue());
        edit2.apply();
        String P8 = oVar.P();
        if (allSettingsResponse != null) {
            str2 = allSettingsResponse.f13987h;
        } else {
            str2 = null;
        }
        Integer num2 = new Integer(oVar.a(str2));
        SharedPreferences.Editor edit3 = c2203a2.f24771a.edit();
        edit3.putInt(P8, num2.intValue());
        edit3.apply();
        String N8 = oVar.N();
        if (allSettingsResponse != null) {
            downloaderResponse = allSettingsResponse.f13980a;
        } else {
            downloaderResponse = null;
        }
        SharedPreferences.Editor edit4 = c2203a2.f24771a.edit();
        edit4.putString(N8, c2203a2.f24772b.a(DownloaderResponse.class).d(downloaderResponse));
        edit4.apply();
        String Q7 = oVar.Q();
        if (allSettingsResponse != null) {
            commentConfigResponse = allSettingsResponse.f13982c;
        } else {
            commentConfigResponse = null;
        }
        SharedPreferences.Editor edit5 = c2203a2.f24771a.edit();
        edit5.putString(Q7, c2203a2.f24772b.a(CommentConfigResponse.class).d(commentConfigResponse));
        edit5.apply();
        String c02 = oVar.c0();
        if (allSettingsResponse != null) {
            movieConfigResponse = allSettingsResponse.f13981b;
        } else {
            movieConfigResponse = null;
        }
        SharedPreferences.Editor edit6 = c2203a2.f24771a.edit();
        edit6.putString(c02, c2203a2.f24772b.a(MovieConfigResponse.class).d(movieConfigResponse));
        edit6.apply();
        String R2 = oVar.R();
        if (allSettingsResponse != null) {
            contactUsResponse = allSettingsResponse.f13983d;
        } else {
            contactUsResponse = null;
        }
        SharedPreferences.Editor edit7 = c2203a2.f24771a.edit();
        edit7.putString(R2, c2203a2.f24772b.a(ContactUsResponse.class).d(contactUsResponse));
        edit7.apply();
        String l02 = oVar.l0();
        if (allSettingsResponse != null) {
            srcConfigResponse = allSettingsResponse.f13984e;
        } else {
            srcConfigResponse = null;
        }
        SharedPreferences.Editor edit8 = c2203a2.f24771a.edit();
        edit8.putString(l02, c2203a2.f24772b.a(SrcConfigResponse.class).d(srcConfigResponse));
        edit8.apply();
        if (allSettingsResponse != null) {
            return new C2102b(allSettingsResponse);
        }
        throw new C2067a((String) null, 3);
    }
}
