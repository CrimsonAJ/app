.class public final Lco/notix/interstitial/WebViewInterstitialActivity;
.super Lco/notix/zb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/notix/zb;"
    }
.end annotation


# instance fields
.field public final h:Lco/notix/ia;

.field public final i:Lco/notix/d;

.field public j:Landroid/widget/FrameLayout;

.field public k:Landroid/webkit/WebView;

.field public l:Landroid/widget/ProgressBar;

.field public final m:LA7/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lco/notix/zb;-><init>()V

    invoke-static {}, Lco/notix/wq;->g()Lco/notix/ia;

    move-result-object v0

    iput-object v0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->h:Lco/notix/ia;

    invoke-static {}, Lco/notix/wq;->i()Lco/notix/d;

    move-result-object v0

    iput-object v0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->i:Lco/notix/d;

    new-instance v0, Lco/notix/jr;

    invoke-direct {v0, p0}, Lco/notix/jr;-><init>(Lco/notix/interstitial/WebViewInterstitialActivity;)V

    invoke-static {v0}, LZ0/a;->q(LO7/a;)LA7/l;

    move-result-object v0

    iput-object v0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->m:LA7/e;

    return-void
.end method

.method public static final a(Lco/notix/interstitial/WebViewInterstitialActivity;Landroid/view/View;LP/u0;)LP/u0;
    .locals 4

    .line 15
    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object p1, p2, LP/u0;->a:LP/r0;

    const/16 p2, 0x207

    .line 17
    invoke-virtual {p1, p2}, LP/r0;->f(I)LH/c;

    move-result-object p1

    .line 18
    const-string p2, "insets.getInsets(WindowI\u2026Compat.Type.systemBars())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/notix/interstitial/WebViewInterstitialActivity;->b()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0}, Lco/notix/interstitial/WebViewInterstitialActivity;->b()Landroid/view/View;

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

    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Lco/notix/h9;->a(Ljava/lang/Number;)F

    move-result v3

    float-to-int v3, v3

    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lco/notix/h9;->a(Ljava/lang/Number;)F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->j:Landroid/widget/FrameLayout;

    const/4 p2, 0x0

    const-string v0, "root"

    if-eqz p0, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/FrameLayout$LayoutParams;

    iget v0, p1, LH/c;->a:I

    iput v0, p2, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iget v0, p1, LH/c;->b:I

    iput v0, p2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iget v0, p1, LH/c;->c:I

    iput v0, p2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    iget p1, p1, LH/c;->d:I

    iput p1, p2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {p0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object p0, LP/u0;->b:LP/u0;

    return-object p0

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    throw p2

    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "start_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, LA7/n;->a:LA7/n;

    if-eqz p1, :cond_1

    iget-object v1, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->i:Lco/notix/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    iget-object v1, v1, Lco/notix/d;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/notix/e;

    .line 21
    instance-of v1, p1, Lco/notix/hc;

    if-eqz v1, :cond_0

    check-cast p1, Lco/notix/hc;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 22
    iget-object v1, p1, Lco/notix/hc;->a:Lco/notix/m;

    .line 23
    const-string v2, "<set-?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lco/notix/zb;->c:Lco/notix/g;

    .line 24
    iget-boolean v1, p1, Lco/notix/hc;->b:Z

    .line 25
    iput-boolean v1, p0, Lco/notix/zb;->d:Z

    .line 26
    iget-object v1, p1, Lco/notix/hc;->c:LO7/a;

    .line 27
    iput-object v1, p0, Lco/notix/zb;->e:LO7/a;

    .line 28
    iget-object p1, p1, Lco/notix/hc;->d:LO7/a;

    .line 29
    iput-object p1, p0, Lco/notix/zb;->f:LO7/a;

    return-object v0

    .line 30
    :cond_1
    sget-object p1, Lco/notix/p8;->d:Lco/notix/p8;

    invoke-virtual {p0, p1}, Lco/notix/zb;->a(Lco/notix/p8;)V

    return-object v0
.end method

.method public final a()V
    .locals 9

    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->k:Landroid/webkit/WebView;

    invoke-virtual {p0}, Lco/notix/zb;->c()Lco/notix/g;

    move-result-object v0

    check-cast v0, Lco/notix/m;

    .line 1
    iget-object v0, v0, Lco/notix/m;->c:Ljava/lang/String;

    const-string v1, "wv"

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 2
    invoke-static {v0}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->k:Landroid/webkit/WebView;

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lco/notix/zb;->c()Lco/notix/g;

    move-result-object v0

    check-cast v0, Lco/notix/m;

    .line 3
    iget-object v5, v0, Lco/notix/m;->c:Ljava/lang/String;

    .line 4
    invoke-static {v5}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    const-string v6, "text/html"

    const/4 v7, 0x0

    const-string v4, "http://example.com"

    move-object v8, v4

    invoke-virtual/range {v3 .. v8}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 5
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    throw v2

    .line 6
    :cond_2
    :goto_0
    iget-object v0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->k:Landroid/webkit/WebView;

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lco/notix/zb;->c()Lco/notix/g;

    move-result-object v3

    check-cast v3, Lco/notix/m;

    .line 7
    iget-object v3, v3, Lco/notix/m;->b:Ljava/lang/String;

    .line 8
    invoke-static {v3}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->j:Landroid/widget/FrameLayout;

    const-string v3, "root"

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->j:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_5

    iget-object v4, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->k:Landroid/webkit/WebView;

    if-eqz v4, :cond_4

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->j:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lco/notix/interstitial/WebViewInterstitialActivity;->b()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Lco/notix/zb;->c()Lco/notix/g;

    move-result-object v0

    check-cast v0, Lco/notix/m;

    .line 9
    iget-object v0, v0, Lco/notix/m;->a:Ljava/lang/String;

    .line 10
    invoke-virtual {p0, v0}, Lco/notix/interstitial/WebViewInterstitialActivity;->a(Ljava/lang/String;)V

    return-void

    .line 11
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    throw v2

    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    throw v2

    .line 12
    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    throw v2
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    .line 13
    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LC3/v;

    const/16 v1, 0x10

    invoke-direct {v0, v1, p0}, LC3/v;-><init>(ILjava/lang/Object;)V

    sget-object v1, LP/Q;->a:Ljava/util/WeakHashMap;

    .line 14
    invoke-static {p1, v0}, LP/H;->l(Landroid/view/View;LP/o;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->h:Lco/notix/ia;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    iget-object v1, v0, Lco/notix/ia;->c:LY7/z;

    new-instance v2, Lco/notix/da;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p1, v3}, Lco/notix/da;-><init>(Lco/notix/ia;Ljava/lang/String;LE7/d;)V

    const/4 p1, 0x3

    invoke-static {v1, v3, v2, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    return-void
.end method

.method public final b()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->m:LA7/e;

    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final e()V
    .locals 5

    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->j:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/ProgressBar;

    invoke-direct {v0, p0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->l:Landroid/widget/ProgressBar;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x28

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lco/notix/h9;->a(Ljava/lang/Number;)F

    move-result v3

    float-to-int v3, v3

    invoke-static {v2}, Lco/notix/h9;->a(Ljava/lang/Number;)F

    move-result v2

    float-to-int v2, v2

    const/16 v4, 0x11

    invoke-direct {v1, v3, v2, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->l:Landroid/widget/ProgressBar;

    const-string v1, "pb"

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    iget-object v0, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->j:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    iget-object v3, p0, Lco/notix/interstitial/WebViewInterstitialActivity;->l:Landroid/widget/ProgressBar;

    if-eqz v3, :cond_0

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    throw v2

    :cond_1
    const-string v0, "root"

    invoke-static {v0}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    throw v2
.end method

.method public final f()V
    .locals 0

    return-void
.end method
