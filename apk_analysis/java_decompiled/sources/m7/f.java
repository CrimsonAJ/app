package m7;

import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f20883r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f20884s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f20885t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f20886u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f20887v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Map map, c cVar, d dVar, E7.d dVar2) {
        super(2, dVar2);
        this.f20884s = gVar;
        this.f20885t = map;
        this.f20886u = cVar;
        this.f20887v = dVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        c cVar = this.f20886u;
        d dVar2 = this.f20887v;
        return new f(this.f20884s, this.f20885t, cVar, dVar2, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f20883r;
        d dVar = this.f20887v;
        A7.n nVar = A7.n.f558a;
        try {
        } catch (Exception e8) {
            String message = e8.getMessage();
            if (message == null) {
                message = e8.toString();
            }
            this.f20883r = 3;
            dVar.invoke(message, this);
            if (nVar == aVar) {
            }
        }
        if (i9 != 0) {
            if (i9 != 1 && i9 != 2) {
                if (i9 == 3) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
            }
        } else {
            AbstractC0485a.A(obj);
            URLConnection openConnection = g.a(this.f20884s).openConnection();
            kotlin.jvm.internal.h.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry entry : this.f20885t.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb.toString());
                c cVar = this.f20886u;
                this.f20883r = 1;
                if (cVar.invoke(jSONObject, this) == aVar) {
                    return aVar;
                }
            } else {
                this.f20883r = 2;
                dVar.invoke("Bad response code: " + responseCode, this);
                if (nVar == aVar) {
                    return aVar;
                }
            }
        }
        return nVar;
    }
}
