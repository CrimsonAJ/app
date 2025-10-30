package n4;

import A6.s;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;
import l4.y;
import m4.o;

/* loaded from: classes.dex */
public final class k extends GLSurfaceView {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f21200l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f21201a;

    /* renamed from: b, reason: collision with root package name */
    public final SensorManager f21202b;

    /* renamed from: c, reason: collision with root package name */
    public final Sensor f21203c;

    /* renamed from: d, reason: collision with root package name */
    public final d f21204d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f21205e;

    /* renamed from: f, reason: collision with root package name */
    public final i f21206f;

    /* renamed from: g, reason: collision with root package name */
    public SurfaceTexture f21207g;

    /* renamed from: h, reason: collision with root package name */
    public Surface f21208h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21209i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21210k;

    public k(Context context) {
        super(context, null);
        this.f21201a = new CopyOnWriteArrayList();
        this.f21205e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f21202b = sensorManager;
        Sensor defaultSensor = y.f20553a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f21203c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f21206f = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener lVar = new l(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f21204d = new d(windowManager.getDefaultDisplay(), lVar, jVar);
        this.f21209i = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z9;
        if (this.f21209i && this.j) {
            z9 = true;
        } else {
            z9 = false;
        }
        Sensor sensor = this.f21203c;
        if (sensor != null && z9 != this.f21210k) {
            d dVar = this.f21204d;
            SensorManager sensorManager = this.f21202b;
            if (z9) {
                sensorManager.registerListener(dVar, sensor, 0);
            } else {
                sensorManager.unregisterListener(dVar);
            }
            this.f21210k = z9;
        }
    }

    public InterfaceC1650a getCameraMotionListener() {
        return this.f21206f;
    }

    public o getVideoFrameMetadataListener() {
        return this.f21206f;
    }

    public Surface getVideoSurface() {
        return this.f21208h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21205e.post(new s(28, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.j = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.j = true;
        a();
    }

    public void setDefaultStereoMode(int i9) {
        this.f21206f.f21187k = i9;
    }

    public void setUseSensorRotation(boolean z9) {
        this.f21209i = z9;
        a();
    }
}
