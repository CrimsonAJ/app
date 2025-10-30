package n4;

import A6.t;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: classes.dex */
public final class d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f21155a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f21156b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f21157c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f21158d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    public final Display f21159e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1652c[] f21160f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21161g;

    public d(Display display, InterfaceC1652c... interfaceC1652cArr) {
        this.f21159e = display;
        this.f21160f = interfaceC1652cArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i9;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f21155a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f21159e.getRotation();
        float[] fArr3 = this.f21156b;
        if (rotation != 0) {
            int i10 = 129;
            if (rotation != 1) {
                i9 = 130;
                if (rotation != 2) {
                    if (rotation == 3) {
                        i10 = 130;
                        i9 = 1;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                i9 = 129;
                i10 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i10, i9, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f21158d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f9 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z9 = this.f21161g;
        float[] fArr5 = this.f21157c;
        if (!z9) {
            t.e(fArr5, fArr2);
            this.f21161g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        InterfaceC1652c[] interfaceC1652cArr = this.f21160f;
        for (int i11 = 0; i11 < 2; i11++) {
            interfaceC1652cArr[i11].a(fArr2, f9);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i9) {
    }
}
