package u0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: u0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2051w extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f23542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2051w(y yVar, int i9) {
        super(0);
        this.f23541d = i9;
        this.f23542e = yVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [A7.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [A7.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [A7.e, java.lang.Object] */
    @Override // O7.a
    public final Object invoke() {
        List list;
        boolean z9;
        switch (this.f23541d) {
            case 0:
                A7.h hVar = (A7.h) this.f23542e.j.getValue();
                if (hVar == null || (list = (List) hVar.f547a) == null) {
                    return new ArrayList();
                }
                return list;
            case 1:
                String str = this.f23542e.f23551a;
                if (str != null && Uri.parse(str).getFragment() != null) {
                    ArrayList arrayList = new ArrayList();
                    String fragment = Uri.parse(str).getFragment();
                    StringBuilder sb = new StringBuilder();
                    kotlin.jvm.internal.h.b(fragment);
                    y.a(fragment, arrayList, sb);
                    String sb2 = sb.toString();
                    kotlin.jvm.internal.h.d(sb2, "fragRegex.toString()");
                    return new A7.h(arrayList, sb2);
                }
                return null;
            case 2:
                String str2 = (String) this.f23542e.f23561l.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                A7.h hVar2 = (A7.h) this.f23542e.j.getValue();
                if (hVar2 != null) {
                    return (String) hVar2.f548b;
                }
                return null;
            case 4:
                String str3 = this.f23542e.f23551a;
                if (str3 != null && Uri.parse(str3).getQuery() != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 5:
                String str4 = this.f23542e.f23563n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            case 6:
                String str5 = this.f23542e.f23555e;
                if (str5 != null) {
                    return Pattern.compile(str5, 2);
                }
                return null;
            default:
                y yVar = this.f23542e;
                yVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) yVar.f23557g.getValue()).booleanValue()) {
                    String str6 = yVar.f23551a;
                    Uri parse = Uri.parse(str6);
                    for (String paramName : parse.getQueryParameterNames()) {
                        StringBuilder sb3 = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(paramName);
                        if (queryParameters.size() <= 1) {
                            String queryParam = (String) B7.k.q0(queryParameters);
                            if (queryParam == null) {
                                yVar.f23559i = true;
                                queryParam = paramName;
                            }
                            Matcher matcher = y.f23546r.matcher(queryParam);
                            C2050v c2050v = new C2050v();
                            int i9 = 0;
                            while (matcher.find()) {
                                String group = matcher.group(1);
                                kotlin.jvm.internal.h.c(group, "null cannot be cast to non-null type kotlin.String");
                                c2050v.f23540b.add(group);
                                kotlin.jvm.internal.h.d(queryParam, "queryParam");
                                String substring = queryParam.substring(i9, matcher.start());
                                kotlin.jvm.internal.h.d(substring, "substring(...)");
                                sb3.append(Pattern.quote(substring));
                                sb3.append("(.+?)?");
                                i9 = matcher.end();
                            }
                            if (i9 < queryParam.length()) {
                                String substring2 = queryParam.substring(i9);
                                kotlin.jvm.internal.h.d(substring2, "substring(...)");
                                sb3.append(Pattern.quote(substring2));
                            }
                            String sb4 = sb3.toString();
                            kotlin.jvm.internal.h.d(sb4, "argRegex.toString()");
                            c2050v.f23539a = W7.l.J(sb4, y.f23548t, y.f23549u);
                            kotlin.jvm.internal.h.d(paramName, "paramName");
                            linkedHashMap.put(paramName, c2050v);
                        } else {
                            throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                    }
                }
                return linkedHashMap;
        }
    }
}
