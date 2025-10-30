.class public final Lco/notix/v5;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:LA7/e;

.field public final b:LA7/e;

.field public final c:LA7/e;

.field public final d:LA7/e;

.field public final e:LA7/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lco/notix/r5;

    invoke-direct {p1, p0}, Lco/notix/r5;-><init>(Lco/notix/v5;)V

    invoke-static {p1}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object p1

    iput-object p1, p0, Lco/notix/v5;->a:LA7/e;

    new-instance p1, Lco/notix/q5;

    invoke-direct {p1, p0}, Lco/notix/q5;-><init>(Lco/notix/v5;)V

    invoke-static {p1}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object p1

    iput-object p1, p0, Lco/notix/v5;->b:LA7/e;

    new-instance p1, Lco/notix/u5;

    invoke-direct {p1, p0}, Lco/notix/u5;-><init>(Lco/notix/v5;)V

    invoke-static {p1}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object p1

    iput-object p1, p0, Lco/notix/v5;->c:LA7/e;

    new-instance p1, Lco/notix/t5;

    invoke-direct {p1, p0}, Lco/notix/t5;-><init>(Lco/notix/v5;)V

    invoke-static {p1}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object p1

    iput-object p1, p0, Lco/notix/v5;->d:LA7/e;

    new-instance p1, Lco/notix/s5;

    invoke-direct {p1, p0}, Lco/notix/s5;-><init>(Lco/notix/v5;)V

    invoke-static {p1}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object p1

    iput-object p1, p0, Lco/notix/v5;->e:LA7/e;

    return-void
.end method

.method public static final a(Lco/notix/i;LO7/a;Landroid/view/View;)V
    .locals 3

    const-string p2, "$adContent"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$onClick"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lco/notix/uf;->a:Lco/notix/tf;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    iget-object p2, p2, Lco/notix/tf;->b:Lco/notix/vf;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    iget-object p2, p2, Lco/notix/vf;->c:Lco/notix/y8;

    sget-object v0, Lco/notix/f;->d:Lco/notix/f;

    check-cast p2, Lco/notix/d9;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    const-string v1, "state"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p2, Lco/notix/d9;->b:Lb8/F;

    check-cast p2, Lb8/Q;

    invoke-virtual {p2}, Lb8/Q;->h()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/WeakHashMap;

    invoke-static {p2, v0}, Lco/notix/d9;->a(Ljava/util/WeakHashMap;Lco/notix/f;)Landroid/app/Activity;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_1

    .line 12
    :cond_0
    iget-object p0, p0, Lco/notix/i;->g:Ljava/lang/String;

    .line 13
    const-string v0, "url"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p2, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    invoke-static {p2}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    move-result-object v1

    :goto_0
    invoke-static {v1}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_1

    check-cast v1, Landroid/content/Intent;

    sget-object p2, Lco/notix/md;->a:Lco/notix/kd;

    const-string v0, "successfully started activity with url: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lco/notix/kd;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    sget-object v0, Lco/notix/md;->a:Lco/notix/kd;

    const-string v1, "couldn\'t start activity with url="

    const-string v2, ", error="

    .line 14
    invoke-static {v1, p0, v2}, Lcom/google/android/gms/internal/measurement/k1;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 15
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p2}, Lco/notix/kd;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    :goto_1
    invoke-interface {p1}, LO7/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final getIvImage()Landroid/widget/ImageView;
    .locals 2

    iget-object v0, p0, Lco/notix/v5;->b:LA7/e;

    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-ivImage>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getLlContainer()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lco/notix/v5;->a:LA7/e;

    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-llContainer>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvAdLabel()Landroid/widget/TextView;
    .locals 2

    iget-object v0, p0, Lco/notix/v5;->e:LA7/e;

    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-tvAdLabel>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvDescription()Landroid/widget/TextView;
    .locals 2

    iget-object v0, p0, Lco/notix/v5;->d:LA7/e;

    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-tvDescription>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvTitle()Landroid/widget/TextView;
    .locals 2

    iget-object v0, p0, Lco/notix/v5;->c:LA7/e;

    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-tvTitle>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public final a(Lco/notix/i;IILco/notix/kg;)V
    .locals 5

    const-string v0, "adContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    int-to-float v0, p2

    int-to-float v1, p3

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    sget-object v0, Lco/notix/o5;->a:Lco/notix/o5;

    goto :goto_0

    :cond_0
    sget-object v0, Lco/notix/p5;->a:Lco/notix/p5;

    :goto_0
    sget-object v1, Lco/notix/o5;->a:Lco/notix/o5;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget v0, Lco/notix/R$layout;->notix_layout_banner_horizontal:I

    goto :goto_1

    :cond_1
    sget-object v1, Lco/notix/p5;->a:Lco/notix/p5;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lco/notix/R$layout;->notix_layout_banner_vertical:I

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-direct {p0}, Lco/notix/v5;->getIvImage()Landroid/widget/ImageView;

    move-result-object v0

    .line 1
    iget-object v1, p1, Lco/notix/i;->c:Landroid/graphics/Bitmap;

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, Lco/notix/h9;->a(Ljava/lang/Number;)F

    move-result p2

    float-to-double v1, p2

    const-wide v3, 0x3fdb851eb851eb85L    # 0.43

    mul-double/2addr v1, v3

    double-to-int p2, v1

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setMaxWidth(I)V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, Lco/notix/h9;->a(Ljava/lang/Number;)F

    move-result p2

    float-to-double p2, p2

    const-wide v1, 0x3fe999999999999aL    # 0.8

    mul-double/2addr p2, v1

    double-to-int p2, p2

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setMaxHeight(I)V

    const/4 p2, 0x1

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    invoke-direct {p0}, Lco/notix/v5;->getTvTitle()Landroid/widget/TextView;

    move-result-object p2

    .line 3
    iget-object p3, p1, Lco/notix/i;->a:Ljava/lang/String;

    .line 4
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lco/notix/v5;->getTvDescription()Landroid/widget/TextView;

    move-result-object p2

    .line 5
    iget-object p3, p1, Lco/notix/i;->b:Ljava/lang/String;

    .line 6
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance p2, LI5/k;

    const/16 p3, 0xd

    invoke-direct {p2, p1, p3, p4}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_2
    new-instance p1, LA7/b;

    .line 7
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 8
    throw p1
.end method
