package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public final class hb extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f12365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kb f12366c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(String str, Map map, kb kbVar, E7.d dVar) {
        super(2, dVar);
        this.f12364a = str;
        this.f12365b = map;
        this.f12366c = kbVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new hb(this.f12364a, this.f12365b, this.f12366c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((hb) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        URLConnection openConnection = new URL(this.f12364a).openConnection();
        kotlin.jvm.internal.h.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        for (Map.Entry entry : this.f12365b.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestMethod(this.f12366c.f12604a);
        if (this.f12366c instanceof jb) {
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            kotlin.jvm.internal.h.d(outputStream, "connection.outputStream");
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, W7.a.f7934a), 8192);
            try {
                bufferedWriter.write(((jb) this.f12366c).f12545b);
                bufferedWriter.flush();
                bufferedWriter.close();
            } finally {
            }
        }
        int responseCode = httpURLConnection.getResponseCode();
        InputStream inputStream = httpURLConnection.getInputStream();
        kotlin.jvm.internal.h.d(inputStream, "connection.inputStream");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, W7.a.f7934a), 8192);
        try {
            String u9 = AbstractC1570b.u(bufferedReader);
            bufferedReader.close();
            return new lb(u9, responseCode);
        } finally {
        }
    }
}
