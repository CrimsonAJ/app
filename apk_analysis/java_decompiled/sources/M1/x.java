package M1;

import a.AbstractC0485a;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import co.notix.R;
import com.anilab.android.ui.activity.MainActivity;
import com.anilab.android.ui.player.PlayerActivity;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.Y1;
import i0.AbstractActivityC1369y;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class x extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4760r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f4761s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(E7.d dVar, B b9) {
        super(2, dVar);
        this.f4761s = b9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        x xVar = new x(dVar, this.f4761s);
        xVar.f4760r = obj;
        return xVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) create((t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        xVar.invokeSuspend(nVar);
        return nVar;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [r2.b, android.app.Dialog] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        String encode;
        String encode2;
        MainActivity mainActivity;
        H2.s sVar;
        AbstractC0485a.A(obj);
        Object a5 = ((t) this.f4760r).a();
        if (a5 != null) {
            L1.E e8 = (L1.E) a5;
            boolean z9 = e8 instanceof L1.C;
            B b9 = this.f4761s;
            if (z9) {
                n.q0(b9);
                AbstractActivityC1369y k5 = b9.k();
                if (k5 != null && (sVar = b9.r0().f4491A) != null) {
                    if (((L1.C) e8).f4456a == -1) {
                        int i9 = PlayerActivity.f13798w0;
                        b9.f4702z0.a(M4.a.s(k5, sVar.f3051a, sVar.f3052b, sVar.f3054d, sVar.f3053c, sVar.f3055e, sVar.f3056f));
                        B.s0(b9, "event_internal");
                    } else {
                        b9.v0();
                    }
                }
            } else if (e8 instanceof L1.D) {
                n.q0(b9);
                L1.D d9 = (L1.D) e8;
                String str = d9.f4458b;
                if (str.length() == 0) {
                    b9.o0(new D(R.string.no_server_found));
                } else {
                    H2.t tVar = b9.r0().f4492B;
                    if (tVar != null) {
                        String str2 = "";
                        if (W7.d.U(str)) {
                            encode = "";
                        } else {
                            encode = URLEncoder.encode(str, StandardCharsets.UTF_8.name());
                            kotlin.jvm.internal.h.d(encode, "encode(...)");
                        }
                        String str3 = d9.f4460d;
                        if (W7.d.U(str3)) {
                            encode2 = "";
                        } else {
                            encode2 = URLEncoder.encode(str3, StandardCharsets.UTF_8.name());
                            kotlin.jvm.internal.h.d(encode2, "encode(...)");
                        }
                        if (!W7.d.U(encode2) && !W7.d.N(encode2, "?")) {
                            String obj2 = W7.d.j0(d9.f4459c).toString();
                            String input = "";
                            for (int i10 = 0; i10 < obj2.length(); i10++) {
                                char charAt = obj2.charAt(i10);
                                if (Y1.u(charAt)) {
                                    charAt = '-';
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append((Object) input);
                                sb.append(charAt);
                                input = sb.toString();
                            }
                            Pattern compile = Pattern.compile("[^-a-zA-Z0-9]");
                            kotlin.jvm.internal.h.d(compile, "compile(...)");
                            kotlin.jvm.internal.h.e(input, "input");
                            String replaceAll = compile.matcher(input).replaceAll("");
                            kotlin.jvm.internal.h.d(replaceAll, "replaceAll(...)");
                            Pattern compile2 = Pattern.compile("-+");
                            kotlin.jvm.internal.h.d(compile2, "compile(...)");
                            String replaceAll2 = compile2.matcher(replaceAll).replaceAll("-");
                            kotlin.jvm.internal.h.d(replaceAll2, "replaceAll(...)");
                            encode2 = AbstractC0953k1.o(encode2, "?/", URLEncoder.encode(replaceAll2, "UTF-8"));
                        }
                        String str4 = d9.f4457a;
                        if (!W7.d.U(str4)) {
                            str2 = URLEncoder.encode(str4, StandardCharsets.UTF_8.name());
                            kotlin.jvm.internal.h.d(str2, "encode(...)");
                        }
                        String J8 = W7.l.J(W7.l.J(tVar.f3063g, "{movie_name}", str2), "{streaming_url}", encode);
                        if (W7.d.U(encode2)) {
                            encode2 = b9.r(R.string.label_none);
                            kotlin.jvm.internal.h.d(encode2, "getString(...)");
                        }
                        String J9 = W7.l.J(J8, "{subtitle_url}", encode2);
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(J9));
                        AbstractActivityC1369y k9 = b9.k();
                        if (k9 instanceof MainActivity) {
                            mainActivity = (MainActivity) k9;
                        } else {
                            mainActivity = null;
                        }
                        if (mainActivity == null) {
                            b9.o0(new D(R.string.msg_unknown_error));
                        } else {
                            try {
                                mainActivity.startActivity(intent);
                            } catch (Exception e9) {
                                if (e9 instanceof ActivityNotFoundException) {
                                    try {
                                        String r5 = b9.r(R.string.title_download_tool);
                                        kotlin.jvm.internal.h.d(r5, "getString(...)");
                                        String string = mainActivity.getResources().getString(R.string.message_external_player);
                                        v vVar = v.f4756a;
                                        String string2 = mainActivity.getResources().getString(R.string.title_cancel);
                                        w wVar = new w(tVar, mainActivity);
                                        String string3 = mainActivity.getResources().getString(R.string.title_install);
                                        ?? dialog = new Dialog(mainActivity);
                                        dialog.f22591a = r5;
                                        dialog.f22592b = string;
                                        dialog.f22593c = string3;
                                        dialog.f22594d = string2;
                                        dialog.f22595e = wVar;
                                        dialog.f22596f = vVar;
                                        dialog.show();
                                    } catch (Exception unused) {
                                        b9.o0(new D(R.string.msg_unknown_error));
                                        B.s0(b9, "event_external");
                                        return A7.n.f558a;
                                    }
                                }
                                b9.o0(new D(R.string.msg_unknown_error));
                            }
                            B.s0(b9, "event_external");
                        }
                    }
                }
            } else if (!e8.equals(L1.B.f4455a)) {
                throw new RuntimeException();
            }
        }
        return A7.n.f558a;
    }
}
