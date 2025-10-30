package p;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import b5.G1;
import d0.C1091i;
import f0.C1150b;
import f0.C1153e;
import f0.C1156h;
import f0.C1157i;
import h.AbstractC1260a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: p.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1831y {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f22091d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22092a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f22093b;

    /* renamed from: c, reason: collision with root package name */
    public Object f22094c;

    public /* synthetic */ C1831y() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((O0.c) ((s4.i) this.f22094c).f22734a).getClass();
            if (keyListener instanceof C1153e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new C1153e(keyListener);
        }
        return keyListener;
    }

    public void b(AttributeSet attributeSet, int i9) {
        switch (this.f22092a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f22093b;
                G1 w7 = G1.w(absSeekBar.getContext(), attributeSet, f22091d, i9);
                Drawable p9 = w7.p(0);
                if (p9 != null) {
                    if (p9 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) p9;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i10 = 0; i10 < numberOfFrames; i10++) {
                            Drawable e8 = e(animationDrawable.getFrame(i10), true);
                            e8.setLevel(10000);
                            animationDrawable2.addFrame(e8, animationDrawable.getDuration(i10));
                        }
                        animationDrawable2.setLevel(10000);
                        p9 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(p9);
                }
                Drawable p10 = w7.p(1);
                if (p10 != null) {
                    absSeekBar.setProgressDrawable(e(p10, false));
                }
                w7.y();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f22093b).getContext().obtainStyledAttributes(attributeSet, AbstractC1260a.f17813i, i9, 0);
                try {
                    boolean z9 = true;
                    if (obtainStyledAttributes.hasValue(14)) {
                        z9 = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    d(z9);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public C1150b c(InputConnection inputConnection, EditorInfo editorInfo) {
        s4.i iVar = (s4.i) this.f22094c;
        if (inputConnection == null) {
            iVar.getClass();
            inputConnection = null;
        } else {
            O0.c cVar = (O0.c) iVar.f22734a;
            cVar.getClass();
            if (!(inputConnection instanceof C1150b)) {
                inputConnection = new C1150b((EditText) cVar.f5263b, inputConnection, editorInfo);
            }
        }
        return (C1150b) inputConnection;
    }

    public void d(boolean z9) {
        C1157i c1157i = (C1157i) ((O0.c) ((s4.i) this.f22094c).f22734a).f5264c;
        if (c1157i.f17261c != z9) {
            if (c1157i.f17260b != null) {
                C1091i a5 = C1091i.a();
                C1156h c1156h = c1157i.f17260b;
                a5.getClass();
                s8.e.g(c1156h, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a5.f16643a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a5.f16644b.remove(c1156h);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c1157i.f17261c = z9;
            if (z9) {
                C1157i.a(c1157i.f17259a, C1091i.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z9) {
        boolean z10;
        if (drawable instanceof I.c) {
            ((I.d) ((I.c) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i9 = 0; i9 < numberOfLayers; i9++) {
                    int id = layerDrawable.getId(i9);
                    Drawable drawable2 = layerDrawable.getDrawable(i9);
                    if (id != 16908301 && id != 16908303) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    drawableArr[i9] = e(drawable2, z10);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.setId(i10, layerDrawable.getId(i10));
                    layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
                    layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
                    layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
                    layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
                    layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
                    layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
                    layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
                    layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
                    layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f22094c) == null) {
                    this.f22094c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z9) {
                    return new ClipDrawable(shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }

    public C1831y(AbsSeekBar absSeekBar) {
        this.f22093b = absSeekBar;
    }

    public C1831y(EditText editText) {
        this.f22093b = editText;
        this.f22094c = new s4.i(editText);
    }
}
