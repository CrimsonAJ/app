package d0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import e0.C1133a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class v extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final u f16682b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f16685e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f16681a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f16683c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f16684d = 1.0f;

    public v(u uVar) {
        s8.e.g(uVar, "rasterizer cannot be null");
        this.f16682b = uVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f9, int i11, int i12, int i13, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i9, i10, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f16685e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f16685e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f9, i11, f9 + this.f16683c, i13, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C1091i.a().getClass();
        float f10 = i12;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        u uVar = this.f16682b;
        com.google.firebase.messaging.s sVar = uVar.f16679b;
        Typeface typeface = (Typeface) sVar.f16507e;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) sVar.f16505c, uVar.f16678a * 2, 2, f9, f10, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        short s9;
        Paint.FontMetricsInt fontMetricsInt2 = this.f16681a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        u uVar = this.f16682b;
        C1133a b9 = uVar.b();
        int a5 = b9.a(14);
        short s10 = 0;
        if (a5 != 0) {
            s9 = ((ByteBuffer) b9.f1637d).getShort(a5 + b9.f1634a);
        } else {
            s9 = 0;
        }
        this.f16684d = abs / s9;
        C1133a b10 = uVar.b();
        int a9 = b10.a(14);
        if (a9 != 0) {
            ((ByteBuffer) b10.f1637d).getShort(a9 + b10.f1634a);
        }
        C1133a b11 = uVar.b();
        int a10 = b11.a(12);
        if (a10 != 0) {
            s10 = ((ByteBuffer) b11.f1637d).getShort(a10 + b11.f1634a);
        }
        short s11 = (short) (s10 * this.f16684d);
        this.f16683c = s11;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s11;
    }
}
