.class public final Lco/notix/k6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic a:Lco/notix/appopen/AppOpenActivity;


# direct methods
.method public constructor <init>(Lco/notix/appopen/AppOpenActivity;)V
    .locals 0

    iput-object p1, p0, Lco/notix/k6;->a:Lco/notix/appopen/AppOpenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lco/notix/appopen/AppOpenActivity;Landroid/view/View;)V
    .locals 5

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lco/notix/p8;->b:Lco/notix/p8;

    .line 7
    .line 8
    iget-object v0, p0, Lco/notix/appopen/AppOpenActivity;->b:Lco/notix/ia;

    .line 9
    .line 10
    iget-object v1, p0, Lco/notix/appopen/AppOpenActivity;->e:Lco/notix/c7;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v1, Lco/notix/c7;->a:Lco/notix/i;

    .line 16
    .line 17
    iget-object v1, v1, Lco/notix/i;->h:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-string v3, "data"

    .line 23
    .line 24
    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v3, "reason"

    .line 28
    .line 29
    invoke-static {p1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v3, v0, Lco/notix/ia;->c:LY7/z;

    .line 33
    .line 34
    new-instance v4, Lco/notix/z9;

    .line 35
    .line 36
    invoke-direct {v4, v0, v1, p1, v2}, Lco/notix/z9;-><init>(Lco/notix/ia;Ljava/lang/String;Lco/notix/p8;LE7/d;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x3

    .line 40
    invoke-static {v3, v2, v4, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    const-string p0, "appOpenData"

    .line 48
    .line 49
    invoke-static {p0}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v2
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lco/notix/k6;->a:Lco/notix/appopen/AppOpenActivity;

    .line 2
    .line 3
    sget v0, Lco/notix/appopen/AppOpenActivity;->u:I

    .line 4
    .line 5
    iget-object p1, p1, Lco/notix/appopen/AppOpenActivity;->r:LA7/e;

    .line 6
    .line 7
    invoke-interface {p1}, LA7/e;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "<get-ivContinue>(...)"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast p1, Landroid/widget/ImageView;

    .line 17
    .line 18
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lco/notix/k6;->a:Lco/notix/appopen/AppOpenActivity;

    .line 24
    .line 25
    iget-object p1, p1, Lco/notix/appopen/AppOpenActivity;->l:LA7/e;

    .line 26
    .line 27
    invoke-interface {p1}, LA7/e;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "<get-llContinueContainer>(...)"

    .line 32
    .line 33
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast p1, Landroid/widget/LinearLayout;

    .line 37
    .line 38
    iget-object v0, p0, Lco/notix/k6;->a:Lco/notix/appopen/AppOpenActivity;

    .line 39
    .line 40
    new-instance v1, LK5/a;

    .line 41
    .line 42
    const/16 v2, 0xd

    .line 43
    .line 44
    invoke-direct {v1, v2, v0}, LK5/a;-><init>(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    .line 49
    .line 50
    new-instance p1, Landroid/util/TypedValue;

    .line 51
    .line 52
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lco/notix/k6;->a:Lco/notix/appopen/AppOpenActivity;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const v1, 0x101045c

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    invoke-virtual {v0, v1, p1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lco/notix/k6;->a:Lco/notix/appopen/AppOpenActivity;

    .line 69
    .line 70
    iget-object v0, v0, Lco/notix/appopen/AppOpenActivity;->p:LA7/e;

    .line 71
    .line 72
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "<get-flContinue>(...)"

    .line 77
    .line 78
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    check-cast v0, Landroid/widget/FrameLayout;

    .line 82
    .line 83
    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 86
    .line 87
    .line 88
    return-void
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
