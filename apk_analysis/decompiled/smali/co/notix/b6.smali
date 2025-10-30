.class public final Lco/notix/b6;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/l;


# instance fields
.field public final synthetic a:Lco/notix/j6;


# direct methods
.method public constructor <init>(Lco/notix/j6;)V
    .locals 0

    iput-object p1, p0, Lco/notix/b6;->a:Lco/notix/j6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    return-void
.end method

.method public static final a(Lco/notix/j6;LA7/h;LA7/h;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$textColors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$buttonColors"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/notix/zb;->c()Lco/notix/g;

    move-result-object v0

    check-cast v0, Lco/notix/i;

    invoke-static {p0, v0, p1}, Lco/notix/j6;->a(Lco/notix/j6;Lco/notix/i;LA7/h;)V

    .line 2
    iget-object p1, p0, Lco/notix/j6;->j:Lco/notix/interstitial/InterstitialButton;

    .line 3
    invoke-static {p0, p1, p2}, Lco/notix/j6;->a(Lco/notix/j6;Lco/notix/interstitial/InterstitialButton;LA7/h;)V

    .line 4
    invoke-virtual {p0}, Lco/notix/zb;->c()Lco/notix/g;

    move-result-object p1

    .line 5
    check-cast p1, Lco/notix/i;

    .line 6
    iget-object p1, p1, Lco/notix/i;->g:Ljava/lang/String;

    .line 7
    invoke-virtual {p0, p1}, Lco/notix/j6;->b(Ljava/lang/String;)Landroid/view/View$OnClickListener;

    move-result-object p1

    .line 8
    iget-object p2, p0, Lco/notix/j6;->k:LA7/e;

    invoke-interface {p2}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "<get-image>(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/ImageView;

    .line 9
    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    iget-object p2, p0, Lco/notix/j6;->l:LA7/e;

    invoke-interface {p2}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "<get-background>(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/ImageView;

    .line 11
    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object p2, p0, Lco/notix/j6;->n:LA7/e;

    invoke-interface {p2}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "<get-titleText>(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/TextView;

    .line 13
    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object p2, p0, Lco/notix/j6;->r:LA7/e;

    invoke-interface {p2}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "<get-descriptionText>(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/TextView;

    .line 15
    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Lco/notix/j6;->j:Lco/notix/interstitial/InterstitialButton;

    if-eqz p2, :cond_0

    .line 16
    iget-object p0, p0, Lco/notix/j6;->t:LA7/e;

    invoke-interface {p0}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object p0

    const-string p2, "<get-button>(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/widget/TextView;

    .line 17
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 4

    .line 1
    const-string v0, "colors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LB7/k;->p0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LA7/h;

    invoke-static {p1}, LB7/k;->p0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA7/h;

    iget-object v1, p0, Lco/notix/b6;->a:Lco/notix/j6;

    new-instance v2, LN3/E;

    const/4 v3, 0x2

    invoke-direct {v2, v1, v0, p1, v3}, LN3/E;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lco/notix/b6;->a(Ljava/util/List;)V

    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method
