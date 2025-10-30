package Q6;

import C3.z;
import P5.D;
import P5.F;
import P5.X;
import U3.InterfaceC0397d;
import U3.InterfaceC0398e;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.view.View;
import b5.C;
import b5.E;
import com.google.android.gms.internal.measurement.C0915c3;
import com.google.android.gms.internal.measurement.C0945i3;
import com.google.android.gms.internal.measurement.C0960l3;
import com.google.android.gms.internal.measurement.K3;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.N2;
import com.google.android.gms.internal.measurement.S3;
import com.google.android.gms.internal.measurement.U2;
import com.google.android.gms.internal.measurement.W2;
import com.google.android.gms.internal.measurement.c4;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.material.tabs.TabLayout;
import d0.o;
import e1.q;
import h5.AbstractC1281a;
import j3.AbstractC1455g;
import j3.S;
import j3.U;
import j3.Y;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k4.C1515o;
import k4.O;
import l4.y;
import org.json.JSONObject;
import w5.p;

/* loaded from: classes.dex */
public class f implements B1.e, z, D0.c, G6.f, H6.a, O4.c, O4.e, O, InterfaceC0397d, C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6458a;

    public /* synthetic */ f(int i9) {
        this.f6458a = i9;
    }

    public static RectF j(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.f16137f0 && (view instanceof J5.h)) {
            J5.h hVar = (J5.h) view;
            int contentWidth = hVar.getContentWidth();
            int contentHeight = hVar.getContentHeight();
            int e8 = (int) p.e(hVar.getContext(), 24);
            if (contentWidth < e8) {
                contentWidth = e8;
            }
            int right = (hVar.getRight() + hVar.getLeft()) / 2;
            int bottom = (hVar.getBottom() + hVar.getTop()) / 2;
            int i9 = contentWidth / 2;
            return new RectF(right - i9, bottom - (contentHeight / 2), i9 + right, (right / 2) + bottom);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static JSONObject r(Y y9) {
        U u9 = y9.f19492b;
        u9.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mediaId", y9.f19491a);
        jSONObject.put("title", y9.f19494d.f19540a);
        jSONObject.put("uri", u9.f19475a.toString());
        jSONObject.put("mimeType", u9.f19476b);
        S s9 = u9.f19477c;
        if (s9 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uuid", s9.f19464a);
            jSONObject2.put("licenseUri", s9.f19465b);
            jSONObject2.put("requestHeaders", new JSONObject(s9.f19466c));
            jSONObject.put("drmConfiguration", jSONObject2);
        }
        return jSONObject;
    }

    public static Path s(float f9, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(f9, f10);
        path.lineTo(f11, f12);
        return path;
    }

    public static JSONObject t(Y y9) {
        S s9;
        String str;
        U u9 = y9.f19492b;
        if (u9 != null && (s9 = u9.f19477c) != null) {
            UUID uuid = AbstractC1455g.f19619d;
            UUID uuid2 = s9.f19464a;
            if (uuid.equals(uuid2)) {
                str = "widevine";
            } else if (AbstractC1455g.f19620e.equals(uuid2)) {
                str = "playready";
            } else {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("withCredentials", false);
            jSONObject.put("protectionSystem", str);
            Uri uri = s9.f19465b;
            if (uri != null) {
                jSONObject.put("licenseUrl", uri);
            }
            X x5 = s9.f19466c;
            if (!x5.isEmpty()) {
                jSONObject.put("headers", new JSONObject(x5));
            }
            return jSONObject;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Y2.r, java.lang.Object] */
    public static void u(JSONObject jSONObject, Y2.h hVar) {
        Uri parse;
        UUID fromString = UUID.fromString(jSONObject.getString("uuid"));
        D d9 = F.f5901b;
        P5.S s9 = P5.S.f5926e;
        String string = jSONObject.getString("licenseUri");
        if (string == null) {
            parse = null;
        } else {
            parse = Uri.parse(string);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("requestHeaders");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject2.getString(next));
        }
        X a5 = X.a(hashMap);
        fromString.getClass();
        ?? obj = new Object();
        obj.f8647a = fromString;
        obj.f8648b = parse;
        obj.f8649c = a5;
        obj.f8650d = s9;
        obj.f8651e = null;
        hVar.f8615e = obj;
    }

    @Override // b5.C
    public Object a() {
        switch (this.f6458a) {
            case 17:
                List list = E.f10635a;
                Boolean bool = (Boolean) C0960l3.f15533b.b();
                bool.getClass();
                return bool;
            case 18:
                List list2 = E.f10635a;
                Boolean bool2 = (Boolean) C0960l3.f15534c.b();
                bool2.getClass();
                return bool2;
            case 19:
                List list3 = E.f10635a;
                Boolean bool3 = (Boolean) n4.f15555a.b();
                bool3.getClass();
                return bool3;
            case 20:
                List list4 = E.f10635a;
                Boolean bool4 = (Boolean) C0945i3.f15505b.b();
                bool4.getClass();
                return bool4;
            case 21:
                List list5 = E.f10635a;
                c4.f15457b.get();
                Boolean bool5 = (Boolean) e4.f15478g.b();
                bool5.getClass();
                return bool5;
            case 22:
                List list6 = E.f10635a;
                c4.f15457b.get();
                Boolean bool6 = (Boolean) e4.f15479h.b();
                bool6.getClass();
                return bool6;
            case 23:
                List list7 = E.f10635a;
                c4.f15457b.get();
                Boolean bool7 = (Boolean) e4.f15475d.b();
                bool7.getClass();
                return bool7;
            case 24:
                List list8 = E.f10635a;
                Boolean bool8 = (Boolean) N2.f15276a.b();
                bool8.getClass();
                return bool8;
            case 25:
                List list9 = E.f10635a;
                K3.f15248b.get();
                Boolean bool9 = (Boolean) M3.f15268a.b();
                bool9.getClass();
                return bool9;
            case 26:
                List list10 = E.f10635a;
                U2.f15316b.get();
                return Integer.valueOf((int) ((Long) W2.f15370k0.b()).longValue());
            case 27:
                List list11 = E.f10635a;
                K3.f15248b.get();
                Boolean bool10 = (Boolean) M3.f15270c.b();
                bool10.getClass();
                return bool10;
            case 28:
                List list12 = E.f10635a;
                Boolean bool11 = (Boolean) S3.f15296a.b();
                bool11.getClass();
                return bool11;
            default:
                Boolean bool12 = (Boolean) C0915c3.f15454a.b();
                bool12.getClass();
                return bool12;
        }
    }

    @Override // O4.c
    public int b(Context context, String str) {
        return O4.f.a(context, str);
    }

    @Override // C3.z
    public MediaCodecInfo c(int i9) {
        return MediaCodecList.getCodecInfoAt(i9);
    }

    @Override // G6.f
    public G6.c d(o oVar, JSONObject jSONObject) {
        q qVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            qVar = new q(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            qVar = new q(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        q qVar2 = qVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        G6.b bVar = new G6.b(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new G6.c(currentTimeMillis, qVar2, bVar, optDouble, optDouble2, optInt2);
    }

    @Override // U3.InterfaceC0397d
    public InterfaceC0398e e(int i9) {
        U3.F f9 = new U3.F();
        f9.g(Z0.a.j(i9 * 2));
        return f9;
    }

    @Override // C3.z
    public boolean f(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // O4.c
    public int g(Context context, String str, boolean z9) {
        return O4.f.d(context, str, z9);
    }

    @Override // C3.z
    public int i() {
        return MediaCodecList.getCodecCount();
    }

    @Override // k4.O
    public Object k(Uri uri, C1515o c1515o) {
        return Long.valueOf(y.K(new BufferedReader(new InputStreamReader(c1515o)).readLine()));
    }

    @Override // O4.e
    public O4.d l(Context context, String str, O4.c cVar) {
        int g9;
        O4.d dVar = new O4.d();
        int b9 = cVar.b(context, str);
        dVar.f5459a = b9;
        int i9 = 1;
        int i10 = 0;
        if (b9 != 0) {
            g9 = cVar.g(context, str, false);
            dVar.f5460b = g9;
        } else {
            g9 = cVar.g(context, str, true);
            dVar.f5460b = g9;
        }
        int i11 = dVar.f5459a;
        if (i11 == 0) {
            if (g9 == 0) {
                i9 = 0;
                dVar.f5461c = i9;
                return dVar;
            }
        } else {
            i10 = i11;
        }
        if (i10 >= g9) {
            i9 = -1;
        }
        dVar.f5461c = i9;
        return dVar;
    }

    @Override // B1.e
    public boolean m() {
        return true;
    }

    @Override // C3.z
    public boolean n(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // H6.a
    public StackTraceElement[] o(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // C3.z
    public boolean p() {
        return false;
    }

    public void v(TabLayout tabLayout, View view, View view2, float f9, Drawable drawable) {
        RectF j = j(tabLayout, view);
        RectF j4 = j(tabLayout, view2);
        drawable.setBounds(AbstractC1281a.c((int) j.left, f9, (int) j4.left), drawable.getBounds().top, AbstractC1281a.c((int) j.right, f9, (int) j4.right), drawable.getBounds().bottom);
    }

    @Override // D0.c
    public void q() {
    }

    @Override // B1.e
    public void shutdown() {
    }

    @Override // D0.c
    public void h(int i9, Serializable serializable) {
    }
}
