package C2;

import T1.C0389c;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.NetworkRequest;
import android.os.CancellationSignal;
import co.notix.R;
import com.anilab.android.ui.activity.MainActivity;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import z2.C2235a;

/* loaded from: classes.dex */
public final /* synthetic */ class P implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1288a;

    public /* synthetic */ P(int i9) {
        this.f1288a = i9;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [A7.e, java.lang.Object] */
    @Override // O7.a
    public final Object invoke() {
        Class<?> returnType;
        int i9 = 0;
        int i10 = 1;
        switch (this.f1288a) {
            case 0:
                C2235a c2235a = new C2235a(i10);
                i8.D d9 = new i8.D();
                d9.d(c2235a);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                d9.c();
                d9.e(30L);
                return new i8.E(d9);
            case 1:
                return Boolean.TRUE;
            case 2:
                return new Object();
            case 3:
                int i11 = MainActivity.f13724k0;
                return new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).addTransportType(3).addTransportType(2).addTransportType(4).build();
            case 4:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 5:
                try {
                    Method method = (Method) R0.c.f6467c.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class<?> cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 6:
                return new F0.I(C0389c.f7009f);
            case 7:
                return new n2.h();
            case 8:
                return new U1.a();
            case 9:
                return new U1.a();
            case R.styleable.GradientColor_android_endX /* 10 */:
                return new U1.a();
            case R.styleable.GradientColor_android_endY /* 11 */:
                return new U1.m();
            case 12:
                return new F0.I(U1.a.f7248f);
            case 13:
                return A7.n.f558a;
            case 14:
                return new F0.I(i2.j.f18466f);
            case 15:
                return new n2.h();
            case 16:
                return new i8.E();
            default:
                return new C2235a(i9);
        }
    }
}
