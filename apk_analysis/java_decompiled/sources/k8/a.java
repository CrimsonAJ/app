package k8;

import I3.g;
import O5.f;
import Y2.r;
import android.os.Bundle;
import android.util.Log;
import co.notix.R;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import f5.InterfaceC1172d;
import j3.E0;
import j3.InterfaceC1451e;
import j3.InterfaceC1453f;
import j3.p0;
import java.lang.reflect.Constructor;
import java.util.concurrent.ScheduledExecutorService;
import l4.i;
import m4.C1591b;
import n3.InterfaceC1637n;
import q3.InterfaceC1905j;
import s6.d;
import s6.l;
import t6.EnumC2026k;
import y3.o;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1451e, InterfaceC1637n, d, i, S6.a, InterfaceC1172d, g, f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20138a;

    public /* synthetic */ a(int i9) {
        this.f20138a = i9;
    }

    @Override // n3.InterfaceC1637n
    public void a() {
    }

    @Override // O5.f
    public Object apply(Object obj) {
        return (o) obj;
    }

    @Override // I3.g
    public boolean b(int i9, int i10, int i11, int i12, int i13) {
        if (i10 == 67 && i11 == 79 && i12 == 77 && (i13 == 77 || i9 == 2)) {
            return true;
        }
        if (i10 == 77 && i11 == 76 && i12 == 76) {
            return i13 == 84 || i9 == 2;
        }
        return false;
    }

    @Override // j3.InterfaceC1451e
    public InterfaceC1453f c(Bundle bundle) {
        return new C1591b(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public Constructor d() {
        switch (this.f20138a) {
            case R.styleable.GradientColor_android_endY /* 11 */:
                if (!Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC1905j.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(InterfaceC1905j.class).getConstructor(null);
        }
    }

    @Override // s6.d
    public Object e(r rVar) {
        switch (this.f20138a) {
            case 9:
                return AbtRegistrar.a(rVar);
            case 14:
                return (ScheduledExecutorService) ExecutorsRegistrar.f16409a.get();
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.f16411c.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.f16410b.get();
            default:
                l lVar = ExecutorsRegistrar.f16409a;
                return EnumC2026k.f23318a;
        }
    }

    @Override // S6.a
    public void h(S6.b bVar) {
    }

    @Override // l4.i
    public void invoke(Object obj) {
        ((p0) obj).b(1);
    }

    @Override // f5.InterfaceC1172d
    public void y(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    public /* synthetic */ a(E0 e02) {
        this.f20138a = 10;
    }
}
