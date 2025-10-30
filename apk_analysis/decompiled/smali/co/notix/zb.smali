.class public abstract Lco/notix/zb;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field public static final synthetic g:I


# instance fields
.field public final a:Lco/notix/ia;

.field public final b:LY7/z;

.field public c:Lco/notix/g;

.field public d:Z

.field public e:LO7/a;

.field public f:LO7/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    invoke-static {}, Lco/notix/wq;->g()Lco/notix/ia;

    move-result-object v0

    iput-object v0, p0, Lco/notix/zb;->a:Lco/notix/ia;

    invoke-static {}, Lco/notix/wq;->f()Lco/notix/g9;

    move-result-object v0

    invoke-virtual {v0}, Lco/notix/g9;->c()LY7/z;

    move-result-object v0

    iput-object v0, p0, Lco/notix/zb;->b:LY7/z;

    return-void
.end method

.method public static final a(Lco/notix/zb;Landroid/view/View;)V
    .locals 0

    .line 4
    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lco/notix/p8;->b:Lco/notix/p8;

    invoke-virtual {p0, p1}, Lco/notix/zb;->a(Lco/notix/p8;)V

    return-void
.end method


# virtual methods
.method public abstract a(LE7/d;)Ljava/lang/Object;
.end method

.method public abstract a()V
.end method

.method public a(J)V
    .locals 2

    .line 3
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Lco/notix/zb;->b()Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lco/notix/xb;

    invoke-direct {v1, p1, p2, v0}, Lco/notix/xb;-><init>(JLjava/lang/ref/WeakReference;)V

    invoke-virtual {v1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    invoke-virtual {p0}, Lco/notix/zb;->b()Landroid/view/View;

    move-result-object p1

    const/high16 p2, 0x3f800000    # 1.0f

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    :goto_0
    invoke-virtual {p0}, Lco/notix/zb;->b()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    instance-of v1, p1, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v1, :cond_2

    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    goto :goto_2

    :cond_2
    move-object p1, v0

    :goto_2
    if-eqz p1, :cond_3

    iget v0, p1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    int-to-float v0, v0

    mul-float/2addr v0, p2

    float-to-int p2, v0

    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    move-object v0, p1

    :cond_3
    invoke-virtual {p0}, Lco/notix/zb;->b()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_4

    return-void

    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public abstract a(Landroid/view/View;)V
.end method

.method public a(Lco/notix/p8;)V
    .locals 5

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/zb;->a:Lco/notix/ia;

    invoke-virtual {p0}, Lco/notix/zb;->c()Lco/notix/g;

    move-result-object v1

    invoke-interface {v1}, Lco/notix/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    const-string v2, "data"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lco/notix/ia;->c:LY7/z;

    new-instance v3, Lco/notix/aa;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, p1, v4}, Lco/notix/aa;-><init>(Lco/notix/ia;Ljava/lang/String;Lco/notix/p8;LE7/d;)V

    const/4 p1, 0x3

    invoke-static {v2, v4, v3, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public abstract a(Ljava/lang/String;)V
.end method

.method public abstract b()Landroid/view/View;
.end method

.method public final c()Lco/notix/g;
    .locals 1

    iget-object v0, p0, Lco/notix/zb;->c:Lco/notix/g;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "model"

    invoke-static {v0}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final d()V
    .locals 3

    invoke-virtual {p0}, Lco/notix/zb;->b()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, LK5/a;

    const/16 v2, 0xe

    invoke-direct {v1, v2, p0}, LK5/a;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public final onBackPressed()V
    .locals 0

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    const-string v0, "newConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Lco/notix/zb;->f()V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/Y1;->E(Landroid/view/Window;Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v0, "window.decorView"

    .line 21
    .line 22
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lco/notix/zb;->a(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lco/notix/zb;->e()V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lco/notix/zb;->b:LY7/z;

    .line 32
    .line 33
    new-instance v0, Lco/notix/yb;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-direct {v0, p0, v1}, Lco/notix/yb;-><init>(Lco/notix/zb;LE7/d;)V

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    invoke-static {p1, v1, v0, v2}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 41
    .line 42
    .line 43
    return-void
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
.end method
