package z8;

import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public final class C extends X {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25515d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f25516e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25517f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f25518g;

    public /* synthetic */ C(Method method, int i9, boolean z9, int i10) {
        this.f25515d = i10;
        this.f25516e = method;
        this.f25517f = i9;
        this.f25518g = z9;
    }

    @Override // z8.X
    public final void a(L l9, Object obj) {
        switch (this.f25515d) {
            case 0:
                Map map = (Map) obj;
                Method method = this.f25516e;
                int i9 = this.f25517f;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                String obj2 = value.toString();
                                if (obj2 != null) {
                                    l9.a(str, obj2, this.f25518g);
                                } else {
                                    throw X.o(method, i9, "Field map value '" + value + "' converted to null by " + C2252a.class.getName() + " for key '" + str + "'.", new Object[0]);
                                }
                            } else {
                                throw X.o(method, i9, A0.a.n("Field map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw X.o(method, i9, "Field map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw X.o(method, i9, "Field map was null.", new Object[0]);
            case 1:
                Map map2 = (Map) obj;
                Method method2 = this.f25516e;
                int i10 = this.f25517f;
                if (map2 != null) {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        String str2 = (String) entry2.getKey();
                        if (str2 != null) {
                            Object value2 = entry2.getValue();
                            if (value2 != null) {
                                l9.b(str2, value2.toString(), this.f25518g);
                            } else {
                                throw X.o(method2, i10, A0.a.n("Header map contained null value for key '", str2, "'."), new Object[0]);
                            }
                        } else {
                            throw X.o(method2, i10, "Header map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw X.o(method2, i10, "Header map was null.", new Object[0]);
            default:
                Map map3 = (Map) obj;
                Method method3 = this.f25516e;
                int i11 = this.f25517f;
                if (map3 != null) {
                    for (Map.Entry entry3 : map3.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        if (str3 != null) {
                            Object value3 = entry3.getValue();
                            if (value3 != null) {
                                String obj3 = value3.toString();
                                if (obj3 != null) {
                                    l9.d(str3, obj3, this.f25518g);
                                } else {
                                    throw X.o(method3, i11, "Query map value '" + value3 + "' converted to null by " + C2252a.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                                }
                            } else {
                                throw X.o(method3, i11, A0.a.n("Query map contained null value for key '", str3, "'."), new Object[0]);
                            }
                        } else {
                            throw X.o(method3, i11, "Query map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw X.o(method3, i11, "Query map was null", new Object[0]);
        }
    }
}
