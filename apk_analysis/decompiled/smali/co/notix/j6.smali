.class public abstract Lco/notix/j6;
.super Lco/notix/zb;
.source "SourceFile"


# static fields
.field public static final synthetic v:I


# instance fields
.field public final h:Lco/notix/mg;

.field public final i:Lco/notix/d;

.field public j:Lco/notix/interstitial/InterstitialButton;

.field public final k:LA7/e;

.field public final l:LA7/e;

.field public final m:LA7/e;

.field public final n:LA7/e;

.field public final o:LA7/e;

.field public final p:LA7/e;

.field public final q:LA7/e;

.field public final r:LA7/e;

.field public final s:LA7/e;

.field public final t:LA7/e;

.field public final u:LA7/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lco/notix/zb;-><init>()V

    new-instance v0, Lco/notix/mg;

    invoke-direct {v0}, Lco/notix/mg;-><init>()V

    iput-object v0, p0, Lco/notix/j6;->h:Lco/notix/mg;

    invoke-static {}, Lco/notix/wq;->i()Lco/notix/d;

    move-result-object v0

    iput-object v0, p0, Lco/notix/j6;->i:Lco/notix/d;

    new-instance v0, Lco/notix/g6;

    invoke-direct {v0, p0}, Lco/notix/g6;-><init>(Lco/notix/j6;)V

    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object v0

    iput-object v0, p0, Lco/notix/j6;->k:LA7/e;

    new-instance v0, Lco/notix/w5;

    invoke-direct {v0, p0}, Lco/notix/w5;-><init>(Lco/notix/j6;)V

    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object v0

    iput-object v0, p0, Lco/notix/j6;->l:LA7/e;

    new-instance v0, Lco/notix/c6;

    invoke-direct {v0, p0}, Lco/notix/c6;-><init>(Lco/notix/j6;)V

    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object v0

    iput-object v0, p0, Lco/notix/j6;->m:LA7/e;

    new-instance v0, Lco/notix/i6;

    invoke-direct {v0, p0}, Lco/notix/i6;-><init>(Lco/notix/j6;)V

    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object v0

    iput-object v0, p0, Lco/notix/j6;->n:LA7/e;

    new-instance v0, Lco/notix/h6;

    invoke-direct {v0, p0}, Lco/notix/h6;-><init>(Lco/notix/j6;)V

    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object v0

    iput-object v0, p0, Lco/notix/j6;->o:LA7/e;

    new-instance v0, Lco/notix/d6;

    invoke-direct {v0, p0}, Lco/notix/d6;-><init>(Lco/notix/j6;)V

    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object v0

    iput-object v0, p0, Lco/notix/j6;->p:LA7/e;

    new-instance v0, Lco/notix/e6;

    invoke-direct {v0, p0}, Lco/notix/e6;-><init>(Lco/notix/j6;)V

    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object v0

    iput-object v0, p0, Lco/notix/j6;->q:LA7/e;

    new-instance v0, Lco/notix/f6;

    invoke-direct {v0, p0}, Lco/notix/f6;-><init>(Lco/notix/j6;)V

    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object v0

    iput-object v0, p0, Lco/notix/j6;->r:LA7/e;

    new-instance v0, Lco/notix/y5;

    invoke-direct {v0, p0}, Lco/notix/y5;-><init>(Lco/notix/j6;)V

    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object v0

    iput-object v0, p0, Lco/notix/j6;->s:LA7/e;

    new-instance v0, Lco/notix/x5;

    invoke-direct {v0, p0}, Lco/notix/x5;-><init>(Lco/notix/j6;)V

    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object v0

    iput-object v0, p0, Lco/notix/j6;->t:LA7/e;

    new-instance v0, Lco/notix/z5;

    invoke-direct {v0, p0}, Lco/notix/z5;-><init>(Lco/notix/j6;)V

    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object v0

    iput-object v0, p0, Lco/notix/j6;->u:LA7/e;

    return-void
.end method

.method public static final a(Lco/notix/j6;Landroid/view/View;LP/u0;)LP/u0;
    .locals 6

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    iget-object p1, p2, LP/u0;->a:LP/r0;

    const/16 p2, 0x207

    .line 47
    invoke-virtual {p1, p2}, LP/r0;->f(I)LH/c;

    move-result-object p1

    .line 48
    const-string p2, "insets.getInsets(WindowI\u2026Compat.Type.systemBars())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/notix/j6;->b()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0}, Lco/notix/j6;->b()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0xc

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Lco/notix/h9;->a(Ljava/lang/Number;)F

    move-result v3

    float-to-int v3, v3

    iget v4, p1, LH/c;->b:I

    add-int/2addr v3, v4

    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Lco/notix/h9;->a(Ljava/lang/Number;)F

    move-result v3

    float-to-int v3, v3

    iget v5, p1, LH/c;->a:I

    add-int/2addr v3, v5

    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lco/notix/h9;->a(Ljava/lang/Number;)F

    move-result v2

    float-to-int v2, v2

    iget v3, p1, LH/c;->c:I

    add-int/2addr v2, v3

    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    iget-object p2, p0, Lco/notix/j6;->m:LA7/e;

    invoke-interface {p2}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "<get-contentContainer>(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/LinearLayout;

    .line 50
    iget-object p0, p0, Lco/notix/j6;->m:LA7/e;

    invoke-interface {p0}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/widget/LinearLayout;

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/widget/FrameLayout$LayoutParams;

    iput v5, p0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iput v4, p0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iput v3, p0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    iget p1, p1, LH/c;->d:I

    iput p1, p0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {p2, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object p0, LP/u0;->b:LP/u0;

    return-object p0
.end method

.method public static final a(Lco/notix/j6;Landroid/graphics/Bitmap;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lco/notix/j6;->l:LA7/e;

    .line 2
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-background>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    .line 3
    new-instance v1, Landroid/graphics/Paint;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    div-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v3

    float-to-int v4, v4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v5

    if-nez v5, :cond_0

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_0
    invoke-static {v2, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    const-string v4, "createBitmap(scaledWidth\u2026 Bitmap.Config.ARGB_8888)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v5, 0x1

    int-to-float v6, v5

    div-float/2addr v6, v3

    invoke-virtual {v4, v6, v6}, Landroid/graphics/Canvas;->scale(FF)V

    const/4 v3, 0x0

    invoke-virtual {v4, p1, v3, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    const/4 p1, 0x0

    :try_start_0
    invoke-static {p0}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    sget-object v1, Landroid/renderscript/Allocation$MipmapControl;->MIPMAP_NONE:Landroid/renderscript/Allocation$MipmapControl;

    invoke-static {p0, v2, v1, v5}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;Landroid/renderscript/Allocation$MipmapControl;I)Landroid/renderscript/Allocation;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    move-result-object v3

    invoke-static {p0, v3}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;)Landroid/renderscript/Allocation;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {p0}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v4

    invoke-static {p0, v4}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    move-result-object p1

    const/high16 v4, 0x41200000    # 10.0f

    invoke-virtual {p1, v4}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    invoke-virtual {p1, v1}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    invoke-virtual {p1, v3}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V

    invoke-virtual {v3, v2}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/renderscript/RenderScript;->destroy()V

    :cond_1
    invoke-virtual {v1}, Landroid/renderscript/Allocation;->destroy()V

    invoke-virtual {v3}, Landroid/renderscript/Allocation;->destroy()V

    invoke-virtual {p1}, Landroid/renderscript/BaseObj;->destroy()V

    .line 4
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void

    :catchall_0
    move-exception v0

    move-object v7, p1

    move-object p1, p0

    move-object p0, v7

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v3, p1

    :goto_0
    move-object p1, p0

    move-object p0, v3

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v1, p1

    move-object v3, v1

    goto :goto_0

    :catchall_3
    move-exception v0

    move-object p0, p1

    move-object v1, p0

    move-object v3, v1

    :goto_1
    if-eqz p1, :cond_2

    .line 5
    invoke-virtual {p1}, Landroid/renderscript/RenderScript;->destroy()V

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/renderscript/Allocation;->destroy()V

    :cond_3
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Landroid/renderscript/Allocation;->destroy()V

    :cond_4
    if-eqz p0, :cond_5

    invoke-virtual {p0}, Landroid/renderscript/BaseObj;->destroy()V

    :cond_5
    throw v0
.end method

.method public static final a(Lco/notix/j6;Lco/notix/i;LA7/h;)V
    .locals 7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    iget-object v0, p2, LA7/h;->a:Ljava/lang/Object;

    .line 7
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 8
    iget-object v1, p0, Lco/notix/j6;->n:LA7/e;

    invoke-interface {v1}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "<get-titleText>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/TextView;

    .line 9
    iget-object p2, p2, LA7/h;->b:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v3

    const/16 v4, 0x8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, Lco/notix/h9;->a(Ljava/lang/Number;)F

    move-result v5

    .line 10
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v6, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v6, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 11
    invoke-virtual {v1, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 12
    iget-object v1, p0, Lco/notix/j6;->r:LA7/e;

    invoke-interface {v1}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object v1

    const-string v3, "<get-descriptionText>(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/TextView;

    .line 13
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lco/notix/h9;->a(Ljava/lang/Number;)F

    move-result v4

    .line 14
    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v5, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v5, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 15
    invoke-virtual {v1, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 16
    iget-object p2, p0, Lco/notix/j6;->n:LA7/e;

    invoke-interface {p2}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/TextView;

    .line 17
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 18
    iget-object p2, p0, Lco/notix/j6;->r:LA7/e;

    invoke-interface {p2}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/TextView;

    .line 19
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 20
    iget-object p2, p0, Lco/notix/j6;->n:LA7/e;

    invoke-interface {p2}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/TextView;

    .line 21
    iget-object v0, p1, Lco/notix/i;->a:Ljava/lang/String;

    .line 22
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    iget-object p0, p0, Lco/notix/j6;->r:LA7/e;

    invoke-interface {p0}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/widget/TextView;

    .line 24
    iget-object p1, p1, Lco/notix/i;->b:Ljava/lang/String;

    .line 25
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static final a(Lco/notix/j6;Lco/notix/interstitial/InterstitialButton;LA7/h;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez p1, :cond_0

    return-void

    .line 26
    :cond_0
    iget-object v0, p2, LA7/h;->a:Ljava/lang/Object;

    .line 27
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object p2, p2, LA7/h;->b:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lco/notix/h9;->a(Ljava/lang/Number;)F

    move-result v1

    .line 28
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v2, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 29
    iget-object p0, p0, Lco/notix/j6;->t:LA7/e;

    invoke-interface {p0}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object p0

    const-string p2, "<get-button>(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/widget/TextView;

    const/4 p2, 0x0

    .line 30
    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Lco/notix/interstitial/InterstitialButton;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public static final a(Lco/notix/j6;Ljava/lang/String;Landroid/view/View;)V
    .locals 3

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$url"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    invoke-static {p2}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    move-result-object v0

    :goto_0
    invoke-static {v0}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_0

    check-cast v0, Landroid/content/Intent;

    sget-object p2, Lco/notix/md;->a:Lco/notix/kd;

    const-string v0, "successfully started activity with url: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lco/notix/kd;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    sget-object v0, Lco/notix/md;->a:Lco/notix/kd;

    const-string v1, "couldn\'t start activity with url="

    const-string v2, ", error="

    .line 32
    invoke-static {v1, p1, v2}, Lcom/google/android/gms/internal/measurement/k1;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 33
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lco/notix/kd;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    :goto_1
    iget-boolean p1, p0, Lco/notix/zb;->d:Z

    if-eqz p1, :cond_1

    .line 35
    sget-object p1, Lco/notix/p8;->c:Lco/notix/p8;

    invoke-virtual {p0, p1}, Lco/notix/zb;->a(Lco/notix/p8;)V

    :cond_1
    iget-object p1, p0, Lco/notix/j6;->h:Lco/notix/mg;

    .line 36
    iget-object p0, p0, Lco/notix/zb;->e:LO7/a;

    .line 37
    invoke-virtual {p1, p0}, Lco/notix/mg;->a(LO7/a;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 42
    iget-object v0, p0, Lco/notix/zb;->b:LY7/z;

    .line 43
    new-instance v1, Lco/notix/a6;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lco/notix/a6;-><init>(Lco/notix/j6;LE7/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    .line 44
    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LC3/v;

    const/16 v1, 0x11

    invoke-direct {v0, v1, p0}, LC3/v;-><init>(ILjava/lang/Object;)V

    sget-object v1, LP/Q;->a:Ljava/util/WeakHashMap;

    .line 45
    invoke-static {p1, v0}, LP/H;->l(Landroid/view/View;LP/o;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)Landroid/view/View$OnClickListener;
    .locals 2

    .line 1
    new-instance v0, LI5/k;

    const/16 v1, 0xc

    invoke-direct {v0, p0, v1, p1}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    return-object v0
.end method

.method public final b()Landroid/view/View;
    .locals 2

    .line 2
    iget-object v0, p0, Lco/notix/j6;->u:LA7/e;

    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-closeButton>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final e()V
    .locals 1

    sget v0, Lco/notix/R$layout;->notix_activity_interstitial:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setContentView(I)V

    return-void
.end method

.method public final f()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 20
    .line 21
    const-string v2, "<get-descAndButtonContainer>(...)"

    .line 22
    .line 23
    const-string v3, "<get-buttonContainer>(...)"

    .line 24
    .line 25
    const/4 v4, -0x1

    .line 26
    const-string v5, "<get-descriptionContainer>(...)"

    .line 27
    .line 28
    const-string v6, "<get-spacer>(...)"

    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    const-string v8, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    .line 32
    .line 33
    if-le v0, v1, :cond_0

    .line 34
    .line 35
    iget-object v0, p0, Lco/notix/j6;->o:LA7/e;

    .line 36
    .line 37
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0, v6}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    check-cast v0, Landroid/view/View;

    .line 45
    .line 46
    iget-object v1, p0, Lco/notix/j6;->o:LA7/e;

    .line 47
    .line 48
    invoke-interface {v1}, LA7/e;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1, v6}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    check-cast v1, Landroid/view/View;

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1, v8}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 65
    .line 66
    const/high16 v6, 0x40800000    # 4.0f

    .line 67
    .line 68
    iput v6, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lco/notix/j6;->p:LA7/e;

    .line 74
    .line 75
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    check-cast v0, Landroid/widget/LinearLayout;

    .line 83
    .line 84
    const/4 v1, 0x1

    .line 85
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lco/notix/j6;->q:LA7/e;

    .line 89
    .line 90
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0, v5}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    check-cast v0, Landroid/widget/FrameLayout;

    .line 98
    .line 99
    iget-object v1, p0, Lco/notix/j6;->q:LA7/e;

    .line 100
    .line 101
    invoke-interface {v1}, LA7/e;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {v1, v5}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    check-cast v1, Landroid/widget/FrameLayout;

    .line 109
    .line 110
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-static {v1, v8}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 118
    .line 119
    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 120
    .line 121
    iput v7, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 122
    .line 123
    const/high16 v2, 0x3f800000    # 1.0f

    .line 124
    .line 125
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lco/notix/j6;->s:LA7/e;

    .line 131
    .line 132
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    check-cast v0, Landroid/widget/FrameLayout;

    .line 140
    .line 141
    iget-object v1, p0, Lco/notix/j6;->s:LA7/e;

    .line 142
    .line 143
    invoke-interface {v1}, LA7/e;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    check-cast v1, Landroid/widget/FrameLayout;

    .line 151
    .line 152
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-static {v1, v8}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 160
    .line 161
    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 162
    .line 163
    iput v7, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_0
    iget-object v0, p0, Lco/notix/j6;->o:LA7/e;

    .line 170
    .line 171
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v0, v6}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    check-cast v0, Landroid/view/View;

    .line 179
    .line 180
    iget-object v1, p0, Lco/notix/j6;->o:LA7/e;

    .line 181
    .line 182
    invoke-interface {v1}, LA7/e;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-static {v1, v6}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    check-cast v1, Landroid/view/View;

    .line 190
    .line 191
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-static {v1, v8}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 199
    .line 200
    const/high16 v6, 0x40000000    # 2.0f

    .line 201
    .line 202
    iput v6, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 205
    .line 206
    .line 207
    iget-object v0, p0, Lco/notix/j6;->p:LA7/e;

    .line 208
    .line 209
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v0, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    check-cast v0, Landroid/widget/LinearLayout;

    .line 217
    .line 218
    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 219
    .line 220
    .line 221
    iget-object v0, p0, Lco/notix/j6;->q:LA7/e;

    .line 222
    .line 223
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-static {v0, v5}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    check-cast v0, Landroid/widget/FrameLayout;

    .line 231
    .line 232
    iget-object v1, p0, Lco/notix/j6;->q:LA7/e;

    .line 233
    .line 234
    invoke-interface {v1}, LA7/e;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-static {v1, v5}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    check-cast v1, Landroid/widget/FrameLayout;

    .line 242
    .line 243
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-static {v1, v8}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 251
    .line 252
    iput v7, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 253
    .line 254
    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 255
    .line 256
    iput v6, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 257
    .line 258
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 259
    .line 260
    .line 261
    iget-object v0, p0, Lco/notix/j6;->s:LA7/e;

    .line 262
    .line 263
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-static {v0, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    check-cast v0, Landroid/widget/FrameLayout;

    .line 271
    .line 272
    iget-object v1, p0, Lco/notix/j6;->s:LA7/e;

    .line 273
    .line 274
    invoke-interface {v1}, LA7/e;->getValue()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    check-cast v1, Landroid/widget/FrameLayout;

    .line 282
    .line 283
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-static {v1, v8}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 291
    .line 292
    iput v7, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 293
    .line 294
    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 295
    .line 296
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 297
    .line 298
    .line 299
    return-void
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "start_id"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lco/notix/j6;->i:Lco/notix/d;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v1, v1, Lco/notix/d;->b:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lco/notix/e;

    .line 28
    .line 29
    check-cast v0, Lco/notix/fc;

    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Lco/notix/j6;->h:Lco/notix/mg;

    .line 32
    .line 33
    iget-object v1, p0, Lco/notix/zb;->f:LO7/a;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lco/notix/mg;->a(LO7/a;)V

    .line 36
    .line 37
    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method
